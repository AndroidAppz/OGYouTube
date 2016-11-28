/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 */
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

final class ayi
implements ayj {
    ayi() {
    }

    @Override
    public final HttpURLConnection a(URL uRL) {
        return (HttpURLConnection)uRL.openConnection();
    }
}

