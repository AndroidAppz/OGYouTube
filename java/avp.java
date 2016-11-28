/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.DataOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  javax.net.ssl.SSLSocketFactory
 *  org.apache.http.Header
 *  org.apache.http.HttpEntity
 *  org.apache.http.HttpResponse
 *  org.apache.http.ProtocolVersion
 *  org.apache.http.StatusLine
 *  org.apache.http.entity.BasicHttpEntity
 *  org.apache.http.message.BasicHeader
 *  org.apache.http.message.BasicHttpResponse
 *  org.apache.http.message.BasicStatusLine
 */
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;

public final class avp
implements avo {
    private final avq a;
    private final SSLSocketFactory b;

    public avp() {
        this(0);
    }

    private avp(byte by2) {
        super(null);
    }

    private avp(avq avq2) {
        this.a = null;
        this.b = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static HttpEntity a(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        try {
            InputStream inputStream2;
            inputStream = inputStream2 = httpURLConnection.getInputStream();
        }
        catch (IOException var2_4) {
            inputStream = httpURLConnection.getErrorStream();
        }
        basicHttpEntity.setContent(inputStream);
        basicHttpEntity.setContentLength((long)httpURLConnection.getContentLength());
        basicHttpEntity.setContentEncoding(httpURLConnection.getContentEncoding());
        basicHttpEntity.setContentType(httpURLConnection.getContentType());
        return basicHttpEntity;
    }

    private static void a(HttpURLConnection httpURLConnection, auq auq2) {
        byte[] arrby = auq2.q();
        if (arrby != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.addRequestProperty("Content-Type", auq2.p());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(arrby);
            dataOutputStream.close();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final HttpResponse a(auq auq2, Map map) {
        String string;
        String string2 = auq2.d();
        HashMap hashMap = new HashMap();
        hashMap.putAll(auq2.i());
        hashMap.putAll(map);
        if (this.a != null) {
            string = this.a.a();
            if (string == null) {
                throw new IOException("URL blocked by rewriter: " + string2);
            }
        } else {
            string = string2;
        }
        URL uRL = new URL(string);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int n = auq2.s();
        httpURLConnection.setConnectTimeout(n);
        httpURLConnection.setReadTimeout(n);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        "https".equals((Object)uRL.getProtocol());
        for (String string3 : hashMap.keySet()) {
            httpURLConnection.addRequestProperty(string3, (String)hashMap.get((Object)string3));
        }
        switch (auq2.a()) {
            default: {
                throw new IllegalStateException("Unknown method type.");
            }
            case -1: {
                byte[] arrby = auq2.m();
                if (arrby == null) break;
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.addRequestProperty("Content-Type", auq2.l());
                DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                dataOutputStream.write(arrby);
                dataOutputStream.close();
                break;
            }
            case 0: {
                httpURLConnection.setRequestMethod("GET");
                break;
            }
            case 3: {
                httpURLConnection.setRequestMethod("DELETE");
                break;
            }
            case 1: {
                httpURLConnection.setRequestMethod("POST");
                avp.a(httpURLConnection, auq2);
                break;
            }
            case 2: {
                httpURLConnection.setRequestMethod("PUT");
                avp.a(httpURLConnection, auq2);
                break;
            }
            case 4: {
                httpURLConnection.setRequestMethod("HEAD");
                break;
            }
            case 5: {
                httpURLConnection.setRequestMethod("OPTIONS");
                break;
            }
            case 6: {
                httpURLConnection.setRequestMethod("TRACE");
                break;
            }
            case 7: {
                httpURLConnection.setRequestMethod("PATCH");
                avp.a(httpURLConnection, auq2);
            }
        }
        ProtocolVersion protocolVersion = new ProtocolVersion("HTTP", 1, 1);
        if (httpURLConnection.getResponseCode() == -1) {
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        }
        BasicStatusLine basicStatusLine = new BasicStatusLine(protocolVersion, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage());
        BasicHttpResponse basicHttpResponse = new BasicHttpResponse((StatusLine)basicStatusLine);
        int n2 = auq2.a();
        int n3 = basicStatusLine.getStatusCode();
        boolean bl2 = n2 != 4 && (100 > n3 || n3 >= 200) && n3 != 204 && n3 != 304;
        if (bl2) {
            basicHttpResponse.setEntity(avp.a(httpURLConnection));
        }
        Iterator iterator = httpURLConnection.getHeaderFields().entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (entry.getKey() == null) continue;
            basicHttpResponse.addHeader((Header)new BasicHeader((String)entry.getKey(), (String)((List)entry.getValue()).get(0)));
        }
        return basicHttpResponse;
    }
}

