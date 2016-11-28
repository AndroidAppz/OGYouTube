/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 */
import android.graphics.Bitmap;

final class bbr
extends bba {
    bbr() {
    }

    @Override
    protected final /* synthetic */ bbn a() {
        return new bbq(this);
    }

    public final bbq a(int n, Bitmap.Config config) {
        bbq bbq2 = (bbq)this.b();
        bbq2.a = n;
        bbq2.b = config;
        return bbq2;
    }
}

