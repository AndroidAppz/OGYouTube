/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.HttpURLConnection
 *  java.net.URI
 *  java.net.URISyntaxException
 *  java.net.URL
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Set;

public final class ayh
implements axx {
    private static ayj a = new ayi();
    private final bdy b;
    private final int c;
    private final ayj d;
    private HttpURLConnection e;
    private InputStream f;
    private volatile boolean g;

    public ayh(bdy bdy2) {
        super(bdy2, a);
    }

    private ayh(bdy bdy2, ayj ayj2) {
        this.b = bdy2;
        this.c = 2500;
        this.d = ayj2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final InputStream a(URL uRL, int n, URL uRL2, Map map) {
        URL uRL3 = uRL;
        do {
            if (n >= 5) {
                throw new axn("Too many (> 5) redirects!");
            }
            if (uRL2 != null) {
                try {
                    if (uRL3.toURI().equals((Object)uRL2.toURI())) {
                        throw new axn("In re-direct loop");
                    }
                }
                catch (URISyntaxException var16_9) {
                    // empty catch block
                }
            }
            this.e = this.d.a(uRL3);
            for (Map.Entry entry : map.entrySet()) {
                this.e.addRequestProperty((String)entry.getKey(), (String)entry.getValue());
            }
            this.e.setConnectTimeout(this.c);
            this.e.setReadTimeout(this.c);
            this.e.setUseCaches(false);
            this.e.setDoInput(true);
            this.e.connect();
            if (this.g) {
                return null;
            }
            int n2 = this.e.getResponseCode();
            if (n2 / 100 == 2) {
                HttpURLConnection httpURLConnection = this.e;
                if (TextUtils.isEmpty((CharSequence)httpURLConnection.getContentEncoding())) {
                    int n3 = httpURLConnection.getContentLength();
                    this.f = new blg(httpURLConnection.getInputStream(), n3);
                    return this.f;
                }
                if (Log.isLoggable((String)"HttpUrlFetcher", (int)3)) {
                    String string = String.valueOf((Object)httpURLConnection.getContentEncoding());
                    if (string.length() != 0) {
                        "Got non empty content encoding: ".concat(string);
                    } else {
                        new String("Got non empty content encoding: ");
                    }
                }
                this.f = httpURLConnection.getInputStream();
                return this.f;
            }
            if (n2 / 100 != 3) {
                if (n2 != -1) throw new axn(this.e.getResponseMessage(), n2);
                throw new axn(n2);
            }
            String string = this.e.getHeaderField("Location");
            if (TextUtils.isEmpty((CharSequence)string)) {
                throw new axn("Received empty or null redirect url");
            }
            URL uRL4 = new URL(uRL3, string);
            ++n;
            uRL2 = uRL3;
            uRL3 = uRL4;
        } while (true);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        if (this.f != null) {
            this.f.close();
        }
lbl4: // 4 sources:
        do {
            if (this.e != null) {
                this.e.disconnect();
            }
            return;
            break;
        } while (true);
        catch (IOException var1_1) {
            ** continue;
        }
    }

    @Override
    public final void a(avz avz2, axy axy2) {
        InputStream inputStream;
        long l = bli.a();
        try {
            bdy bdy2 = this.b;
            if (bdy2.b == null) {
                bdy2.b = new URL(bdy2.a());
            }
            inputStream = super.a(bdy2.b, 0, null, this.b.b());
        }
        catch (IOException var5_8) {
            axy2.a((Exception)var5_8);
            return;
        }
        if (Log.isLoggable((String)"HttpUrlFetcher", (int)2)) {
            double d2 = bli.a(l);
            String string = String.valueOf((Object)inputStream);
            new StringBuilder(74 + String.valueOf((Object)string).length()).append("Finished http url fetcher fetch in ").append(d2).append(" ms and loaded ").append(string);
        }
        axy2.a((Object)inputStream);
    }

    @Override
    public final void b() {
        this.g = true;
    }

    @Override
    public final Class c() {
        return InputStream.class;
    }

    @Override
    public final axj d() {
        return axj.b;
    }
}

