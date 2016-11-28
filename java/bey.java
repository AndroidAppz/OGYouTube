/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.os.ParcelFileDescriptor
 *  java.lang.Class
 *  java.lang.Object
 */
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class bey
implements ben {
    private final Resources a;

    public bey(Resources resources) {
        this.a = resources;
    }

    @Override
    public final bel a(bet bet2) {
        return new bex(this.a, bet2.a(Uri.class, ParcelFileDescriptor.class));
    }
}

