/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.HashMap
 */
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;

final class aaq
implements Comparator {
    public static final aaq a = new aaq();
    public static final HashMap b = new HashMap();

    private aaq() {
    }

    static void a(Context context, String string) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)context);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])sharedPreferences.getString("android.support.v7.app.MediaRouteChooserDialog_route_ids", "").split(",")));
        if (!arrayList.contains((Object)string)) {
            arrayList.add((Object)string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String string2 : arrayList) {
            String string3 = "android.support.v7.app.MediaRouteChooserDialog_route_usage_score_" + string2;
            float f = 0.95f * sharedPreferences.getFloat(string3, 0.0f);
            if (string.equals((Object)string2)) {
                f += 1.0f;
            }
            if (f < 0.1f) {
                editor.remove(string2);
                continue;
            }
            editor.putFloat(string3, f);
            if (stringBuilder.length() > 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(string2);
        }
        editor.putString("android.support.v7.app.MediaRouteChooserDialog_route_ids", stringBuilder.toString());
        editor.commit();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ int compare(Object object, Object object2) {
        Float f;
        aeu aeu2 = (aeu)object;
        aeu aeu3 = (aeu)object2;
        if (aeu2 == null) {
            if (aeu3 == null) {
                return 0;
            }
            return -1;
        }
        if (aeu3 == null) {
            return 1;
        }
        if (aeu2.c()) {
            if (!aeu3.c()) {
                return 1;
            }
        } else if (aeu3.c()) {
            return -1;
        }
        Float f2 = (f = (Float)b.get((Object)aeu2.d)) == null ? Float.valueOf((float)0.0f) : f;
        Float f3 = (Float)b.get((Object)aeu3.d);
        if (f3 == null) {
            f3 = Float.valueOf((float)0.0f);
        }
        if (f2.equals((Object)f3)) {
            return aeu2.e.compareTo(aeu3.e);
        }
        if (f2.floatValue() > f3.floatValue()) {
            return -1;
        }
        return 1;
    }
}

