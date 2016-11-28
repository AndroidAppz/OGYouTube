/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  java.lang.Object
 */
import android.util.SparseIntArray;

public class amp {
    final SparseIntArray a = new SparseIntArray();

    /*
     * Enabled aggressive block sorting
     */
    public static int b(int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < n; ++i) {
            if (++n4 == n2) {
                ++n3;
                n4 = 0;
                continue;
            }
            if (n4 <= n2) continue;
            n4 = 1;
            ++n3;
        }
        if (n4 + 1 > n2) {
            ++n3;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public int a(int n, int n2) {
        if (1 == n2) {
            return 0;
        }
        int n3 = 0;
        int n4 = 0;
        do {
            if (n3 >= n) {
                if (n4 + 1 > n2) return 0;
                return n4;
            }
            if (++n4 == n2) {
                n4 = 0;
            } else if (n4 > n2) {
                n4 = 1;
            }
            ++n3;
        } while (true);
    }
}

