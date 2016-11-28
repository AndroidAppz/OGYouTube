/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.location.Location
 *  android.location.LocationManager
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;

final class aci {
    static final acj a = new acj();
    final Context b;
    private final LocationManager c;

    aci(Context context) {
        this.b = context;
        this.c = (LocationManager)context.getSystemService("location");
    }

    static boolean a(acj acj2) {
        if (acj2 != null && acj2.b > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    final Location a(String string) {
        if (this.c != null) {
            try {
                if (this.c.isProviderEnabled(string)) {
                    Location location = this.c.getLastKnownLocation(string);
                    return location;
                }
            }
            catch (Exception var2_3) {
                // empty catch block
            }
        }
        return null;
    }
}

