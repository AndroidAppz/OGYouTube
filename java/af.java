/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  java.lang.Object
 *  java.util.Comparator
 *  rw
 */
import android.view.View;
import java.util.Comparator;

public final class af
implements Comparator {
    public final /* synthetic */ int compare(Object object, Object object2) {
        float f;
        View view = (View)object;
        View view2 = (View)object2;
        float f2 = rw.w((View)view);
        if (f2 > (f = rw.w((View)view2))) {
            return -1;
        }
        if (f2 < f) {
            return 1;
        }
        return 0;
    }
}

