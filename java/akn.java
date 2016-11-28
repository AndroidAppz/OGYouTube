/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.xmlpull.v1.XmlPullParser
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

final class akn
implements akm {
    akn() {
    }

    @Override
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            dp dp2 = dp.a(context.getResources(), xmlPullParser, attributeSet, theme);
            return dp2;
        }
        catch (Exception var5_6) {
            Log.e((String)"VdcInflateDelegate", (String)"Exception while inflating <vector>", (Throwable)var5_6);
            return null;
        }
    }
}

