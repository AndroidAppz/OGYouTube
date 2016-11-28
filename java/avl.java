/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Set
 *  org.apache.http.HttpEntity
 *  org.apache.http.HttpResponse
 *  org.apache.http.client.HttpClient
 *  org.apache.http.client.methods.HttpDelete
 *  org.apache.http.client.methods.HttpEntityEnclosingRequestBase
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpHead
 *  org.apache.http.client.methods.HttpOptions
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpPut
 *  org.apache.http.client.methods.HttpTrace
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.entity.ByteArrayEntity
 *  org.apache.http.params.HttpConnectionParams
 *  org.apache.http.params.HttpParams
 */
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public final class avl
implements avo {
    private HttpClient a;

    public avl(HttpClient httpClient) {
        this.a = httpClient;
    }

    private static void a(HttpEntityEnclosingRequestBase httpEntityEnclosingRequestBase, auq auq2) {
        byte[] arrby = auq2.q();
        if (arrby != null) {
            httpEntityEnclosingRequestBase.setEntity((HttpEntity)new ByteArrayEntity(arrby));
        }
    }

    private static void a(HttpUriRequest httpUriRequest, Map map) {
        for (String string : map.keySet()) {
            httpUriRequest.setHeader(string, (String)map.get((Object)string));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final HttpResponse a(auq auq2, Map map) {
        Object object;
        switch (auq2.a()) {
            default: {
                throw new IllegalStateException("Unknown request method.");
            }
            case -1: {
                byte[] arrby = auq2.m();
                if (arrby != null) {
                    object = new HttpPost(auq2.d());
                    object.addHeader("Content-Type", auq2.l());
                    object.setEntity((HttpEntity)new ByteArrayEntity(arrby));
                    break;
                }
                object = new HttpGet(auq2.d());
                break;
            }
            case 0: {
                object = new HttpGet(auq2.d());
                break;
            }
            case 3: {
                object = new HttpDelete(auq2.d());
                break;
            }
            case 1: {
                object = new HttpPost(auq2.d());
                object.addHeader("Content-Type", auq2.p());
                avl.a((HttpEntityEnclosingRequestBase)object, auq2);
                break;
            }
            case 2: {
                object = new HttpPut(auq2.d());
                object.addHeader("Content-Type", auq2.p());
                avl.a((HttpEntityEnclosingRequestBase)object, auq2);
                break;
            }
            case 4: {
                object = new HttpHead(auq2.d());
                break;
            }
            case 5: {
                object = new HttpOptions(auq2.d());
                break;
            }
            case 6: {
                object = new HttpTrace(auq2.d());
                break;
            }
            case 7: {
                object = new avm(auq2.d());
                object.addHeader("Content-Type", auq2.p());
                avl.a((HttpEntityEnclosingRequestBase)object, auq2);
            }
        }
        avl.a((HttpUriRequest)object, map);
        avl.a((HttpUriRequest)object, auq2.i());
        HttpParams httpParams = object.getParams();
        int n = auq2.s();
        HttpConnectionParams.setConnectionTimeout((HttpParams)httpParams, (int)5000);
        HttpConnectionParams.setSoTimeout((HttpParams)httpParams, (int)n);
        return this.a.execute((HttpUriRequest)object);
    }
}

