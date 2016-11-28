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

final class akk
implements akm {
    akk() {
    }

    @Override
    public final Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Resources resources = context.getResources();
            dg dg2 = new dg(context);
            dg2.inflate(resources, xmlPullParser, attributeSet, theme);
            return dg2;
        }
        catch (Exception var5_7) {
            Log.e((String)"AvdcInflateDelegate", (String)"Exception while inflating <animated-vector>", (Throwable)var5_7);
            return null;
        }
    }
}

