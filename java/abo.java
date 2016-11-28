/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.BitmapDrawable
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.ArrayAdapter
 *  android.widget.ListView
 *  java.lang.Object
 *  java.util.HashMap
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.HashMap;

final class abo {
    /*
     * Enabled aggressive block sorting
     */
    public static int a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean bl2 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        Resources resources = context.getResources();
        int n = bl2 ? ago.f : ago.e;
        resources.getValue(n, typedValue, true);
        if (typedValue.type == 5) {
            return (int)typedValue.getDimension(displayMetrics);
        }
        if (typedValue.type == 6) {
            return (int)typedValue.getFraction((float)displayMetrics.widthPixels, (float)displayMetrics.widthPixels);
        }
        return -2;
    }

    public static HashMap a(Context context, ListView listView, ArrayAdapter arrayAdapter) {
        HashMap hashMap = new HashMap();
        int n = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); ++i) {
            Object object = arrayAdapter.getItem(n + i);
            View view = listView.getChildAt(i);
            Bitmap bitmap = Bitmap.createBitmap((int)view.getWidth(), (int)view.getHeight(), (Bitmap.Config)Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmap));
            hashMap.put(object, (Object)new BitmapDrawable(context.getResources(), bitmap));
        }
        return hashMap;
    }

    public static HashMap a(ListView listView, ArrayAdapter arrayAdapter) {
        HashMap hashMap = new HashMap();
        int n = listView.getFirstVisiblePosition();
        for (int i = 0; i < listView.getChildCount(); ++i) {
            Object object = arrayAdapter.getItem(n + i);
            View view = listView.getChildAt(i);
            hashMap.put(object, (Object)new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        }
        return hashMap;
    }
}

