/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

public final class bex
implements bel {
    private final bel a;
    private final Resources b;

    public bex(Resources resources, bel bel2) {
        this.b = resources;
        this.a = bel2;
    }

    private final Uri a(Integer n) {
        try {
            String string = String.valueOf((Object)"android.resource://");
            String string2 = String.valueOf((Object)this.b.getResourcePackageName(n.intValue()));
            String string3 = String.valueOf((Object)this.b.getResourceTypeName(n.intValue()));
            String string4 = String.valueOf((Object)this.b.getResourceEntryName(n.intValue()));
            Uri uri = Uri.parse((String)new StringBuilder(2 + String.valueOf((Object)string).length() + String.valueOf((Object)string2).length() + String.valueOf((Object)string3).length() + String.valueOf((Object)string4).length()).append(string).append(string2).append("/").append(string3).append("/").append(string4).toString());
            return uri;
        }
        catch (Resources.NotFoundException var2_7) {
            if (Log.isLoggable((String)"ResourceLoader", (int)5)) {
                String string = String.valueOf((Object)n);
                Log.w((String)"ResourceLoader", (String)new StringBuilder(30 + String.valueOf((Object)string).length()).append("Received invalid resource id: ").append(string).toString(), (Throwable)var2_7);
            }
            return null;
        }
    }

    @Override
    public final /* synthetic */ bem a(Object object, int n, int n2, axs axs2) {
        Uri uri = super.a((Integer)object);
        if (uri == null) {
            return null;
        }
        return this.a.a((Object)uri, n, n2, axs2);
    }
}

