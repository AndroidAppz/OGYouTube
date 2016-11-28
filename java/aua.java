/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.net.InetAddress
 *  java.net.InetSocketAddress
 *  java.net.Socket
 *  java.net.SocketAddress
 *  java.security.KeyStore
 *  java.security.SecureRandom
 *  javax.net.ssl.KeyManager
 *  javax.net.ssl.SSLContext
 *  javax.net.ssl.SSLSocket
 *  javax.net.ssl.SSLSocketFactory
 *  javax.net.ssl.TrustManager
 *  org.apache.http.conn.scheme.HostNameResolver
 *  org.apache.http.conn.scheme.LayeredSocketFactory
 *  org.apache.http.conn.ssl.AllowAllHostnameVerifier
 *  org.apache.http.conn.ssl.BrowserCompatHostnameVerifier
 *  org.apache.http.conn.ssl.StrictHostnameVerifier
 *  org.apache.http.conn.ssl.X509HostnameVerifier
 *  org.apache.http.params.HttpConnectionParams
 *  org.apache.http.params.HttpParams
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.KeyStore;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.ssl.AllowAllHostnameVerifier;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

@Deprecated
public final class aua
implements LayeredSocketFactory {
    private static X509HostnameVerifier a;
    private final SSLContext b;
    private final SSLSocketFactory c;
    private final HostNameResolver d;
    private X509HostnameVerifier e = a;

    static {
        new AllowAllHostnameVerifier();
        a = new BrowserCompatHostnameVerifier();
        new StrictHostnameVerifier();
    }

    public aua() {
        this("TLS", null, null);
    }

    private aua(String string, KeyStore keyStore, String string2) {
        this.b = SSLContext.getInstance((String)string);
        this.b.init(null, null, null);
        this.c = this.b.getSocketFactory();
        this.d = null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Socket connectSocket(Socket socket, String string, int n, InetAddress inetAddress, int n2, HttpParams httpParams) {
        if (string == null) {
            throw new IllegalArgumentException("Target host may not be null.");
        }
        if (httpParams == null) {
            throw new IllegalArgumentException("Parameters may not be null.");
        }
        Socket socket2 = socket != null ? socket : this.createSocket();
        SSLSocket sSLSocket = (SSLSocket)socket2;
        if (inetAddress != null || n2 > 0) {
            if (n2 < 0) {
                n2 = 0;
            }
            sSLSocket.bind((SocketAddress)new InetSocketAddress(inetAddress, n2));
        }
        int n3 = HttpConnectionParams.getConnectionTimeout((HttpParams)httpParams);
        int n4 = HttpConnectionParams.getSoTimeout((HttpParams)httpParams);
        sSLSocket.connect((SocketAddress)new InetSocketAddress(string, n), n3);
        sSLSocket.setSoTimeout(n4);
        try {
            sSLSocket.startHandshake();
            this.e.verify(string, sSLSocket);
            return sSLSocket;
        }
        catch (IOException var11_11) {
            try {
                sSLSocket.close();
            }
            catch (Exception var12_12) {
                throw var11_11;
            }
            throw var11_11;
        }
    }

    public final Socket createSocket() {
        return (SSLSocket)this.c.createSocket();
    }

    public final Socket createSocket(Socket socket, String string, int n, boolean bl2) {
        SSLSocket sSLSocket = (SSLSocket)this.c.createSocket(socket, string, n, bl2);
        sSLSocket.startHandshake();
        this.e.verify(string, sSLSocket);
        return sSLSocket;
    }

    public final boolean isSecure(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("Socket may not be null.");
        }
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("Socket not created by this factory.");
        }
        if (socket.isClosed()) {
            throw new IllegalArgumentException("Socket is closed.");
        }
        return true;
    }
}

