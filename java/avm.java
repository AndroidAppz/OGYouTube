/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.String
 *  java.net.URI
 *  org.apache.http.client.methods.HttpEntityEnclosingRequestBase
 */
import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class avm
extends HttpEntityEnclosingRequestBase {
    public avm() {
    }

    public avm(String string) {
        this.setURI(URI.create((String)string));
    }

    public final String getMethod() {
        return "PATCH";
    }
}

