/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Build
 *  android.os.Build$VERSION
 *  gw
 *  gx
 *  gz
 *  hc
 *  hd
 *  hg
 *  hh
 *  hi
 *  hj
 *  hk
 *  hl
 *  hm
 *  hn
 *  ho
 *  hp
 *  hw
 *  hz
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 */
import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

public class gy {
    static final hh a = Build.VERSION.SDK_INT >= 21 ? new hj() : (Build.VERSION.SDK_INT >= 20 ? new hi() : (Build.VERSION.SDK_INT >= 19 ? new hp() : (Build.VERSION.SDK_INT >= 16 ? new ho() : (Build.VERSION.SDK_INT >= 14 ? new hn() : (Build.VERSION.SDK_INT >= 11 ? new hm() : (Build.VERSION.SDK_INT >= 9 ? new hl() : new hk()))))));

    static void a(gw gw2, ArrayList arrayList) {
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            gw2.a((hw)((gz)iterator.next()));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void a(gx gx2, hq hq2) {
        if (hq2 == null) return;
        {
            if (hq2 instanceof hd) {
                hd hd2 = (hd)hq2;
                hz.a((gx)gx2, (CharSequence)hd2.c, (boolean)false, (CharSequence)null, (CharSequence)hd2.a);
                return;
            } else {
                if (hq2 instanceof hg) {
                    hg hg2 = (hg)hq2;
                    hz.a((gx)gx2, (CharSequence)hg2.c, (boolean)false, (CharSequence)null, (ArrayList)hg2.a);
                    return;
                }
                if (!(hq2 instanceof hc)) return;
                {
                    hc hc2 = (hc)hq2;
                    hz.a((gx)gx2, (CharSequence)hc2.c, (boolean)false, (CharSequence)null, (Bitmap)hc2.a, (Bitmap)null, (boolean)false);
                    return;
                }
            }
        }
    }
}

