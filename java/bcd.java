/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.Context;
import java.io.File;

final class bcd
implements bca {
    private /* synthetic */ Context a;
    private /* synthetic */ String b;

    bcd(Context context, String string) {
        this.a = context;
        this.b = string;
    }

    @Override
    public final File a() {
        File file = this.a.getCacheDir();
        if (file == null) {
            return null;
        }
        if (this.b != null) {
            return new File(file, this.b);
        }
        return file;
    }
}

