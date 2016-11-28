/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 */
import java.io.File;

public class bbz
implements bbt {
    private final int a = 262144000;
    private final bca b;

    public bbz(bca bca2, int n) {
        this.b = bca2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final bbs a() {
        File file = this.b.a();
        if (!(file != null && (file.mkdirs() || file.exists() && file.isDirectory()))) {
            return null;
        }
        return bcb.a(file, this.a);
    }
}

