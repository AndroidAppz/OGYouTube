/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.String
 */
import android.content.Context;

public final class bcc
extends bbz {
    public bcc(Context context) {
        super(context, "image_manager_disk_cache");
    }

    private bcc(Context context, String string) {
        super(new bcd(context, string), 262144000);
    }
}

