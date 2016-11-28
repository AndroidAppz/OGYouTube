/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.LinearGradient
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.RadialGradient
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.Drawable
 *  java.lang.Math
 */
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/*
 * Exception performing whole class analysis.
 */
final class bc
extends adr {
    private static double g;
    float a;
    float b;
    float c;
    boolean d;
    boolean e;
    private Path h;

    static {
        g = Math.cos((double)Math.toRadians((double)45.0));
    }

    static int a(float f2) {
        int n = Math.round((float)f2);
        if (n % 2 == 1) {
            --n;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void draw(Canvas canvas) {
        if (this.d) {
            Rect rect = this.getBounds();
            float f2 = 1.5f * this.a;
            ((}
    }
    java.lang.NullPointerException: Attempt to invoke interface method 'void org.benf.cfr.reader.bytecode.analysis.types.JavaTypeInstance.dumpInto(org.benf.cfr.reader.util.output.Dumper, org.benf.cfr.reader.state.TypeUsageInformation)' on a null object reference
    
    