/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Transformation
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.String
 */
import android.view.animation.Animation;
import android.view.animation.Transformation;

abstract class ao
extends Animation {
    private float a;
    private float b;
    private /* synthetic */ al c;

    ao(al al2) {
        this.c = al2;
    }

    protected abstract float a();

    protected void applyTransformation(float f2, Transformation transformation) {
        float f3;
        float f4 = this.a + f2 * this.b;
        float f5 = null.a;
        if (f4 < 0.0f || f5 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float f6 = bc.a(f4);
        if (f6 > (f3 = (float)bc.a(f5))) {
            if (!null.e) {
                null.e = true;
            }
            f6 = f3;
        }
        if (null.c != f6 || null.a != f3) {
            null.c = f6;
            null.a = f3;
            null.b = Math.round((float)(f6 * 1.5f));
            null.d = true;
            ((}
    }
    java.lang.NullPointerException: Attempt to invoke interface method 'void org.benf.cfr.reader.bytecode.analysis.types.JavaTypeInstance.dumpInto(org.benf.cfr.reader.util.output.Dumper, org.benf.cfr.reader.state.TypeUsageInformation)' on a null object reference
    
    