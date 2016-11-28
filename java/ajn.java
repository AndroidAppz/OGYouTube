/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ViewDebug
 *  android.view.ViewDebug$ExportedProperty
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

public final class ajn
extends amr {
    @ViewDebug.ExportedProperty
    public boolean a;
    @ViewDebug.ExportedProperty
    public int b;
    @ViewDebug.ExportedProperty
    public int c;
    @ViewDebug.ExportedProperty
    public boolean d;
    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public ajn() {
        super(-2, -2);
        this.a = false;
    }

    public ajn(ajn ajn2) {
        super((ViewGroup.LayoutParams)ajn2);
        this.a = ajn2.a;
    }

    public ajn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ajn(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}

