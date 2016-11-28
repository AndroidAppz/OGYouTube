/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
import java.util.Comparator;

final class avh
implements Comparator {
    avh() {
    }

    public final /* synthetic */ int compare(Object object, Object object2) {
        byte[] arrby = (byte[])object;
        byte[] arrby2 = (byte[])object2;
        return arrby.length - arrby2.length;
    }
}

