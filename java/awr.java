/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 */
import java.io.File;
import java.io.IOException;

public final class awr {
    final aws a;
    final boolean[] b;
    public boolean c;
    public final /* synthetic */ awo d;

    /*
     * Enabled aggressive block sorting
     */
    awr(awo awo2, aws aws2) {
        this.d = awo2;
        this.a = aws2;
        Object var3_3 = aws2.e ? null : new boolean[awo2.b];
        this.b = var3_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final File a() {
        awo awo2;
        awo awo3 = awo2 = this.d;
        synchronized (awo3) {
            if (this.a.f != this) {
                throw new IllegalStateException();
            }
            if (!this.a.e) {
                this.b[0] = true;
            }
            File file = this.a.d[0];
            if (!this.d.a.exists()) {
                this.d.a.mkdirs();
            }
            return file;
        }
    }

    public final void b() {
        this.d.a(this, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c() {
        if (this.c) return;
        try {
            this.b();
            return;
        }
        catch (IOException var1_1) {
            return;
        }
    }
}

