/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
final class adk
implements adn {
    adk() {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(float[] arrf) {
        if (arrf[2] >= 0.95f) {
            return false;
        }
        boolean bl2 = false;
        if (!bl2) {
            if (arrf[2] <= 0.05f) {
                return false;
            }
            boolean bl3 = false;
            if (!bl3) {
                if (arrf[0] < 10.0f) return true;
                if (arrf[0] <= 37.0f && arrf[1] <= 0.82f) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}

