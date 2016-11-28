/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.ParcelFileDescriptor
 *  java.io.File
 *  java.lang.Class
 *  java.lang.Object
 */
import android.os.ParcelFileDescriptor;
import java.io.File;

final class bdt
implements bdv {
    bdt() {
    }

    @Override
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override
    public final /* synthetic */ Object a(File file) {
        return ParcelFileDescriptor.open((File)file, (int)268435456);
    }

    @Override
    public final /* synthetic */ void a(Object object) {
        ((ParcelFileDescriptor)object).close();
    }
}

