/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 *  android.view.View
 *  android.widget.ListView
 *  java.lang.IllegalAccessException
 *  java.lang.Object
 *  java.lang.reflect.Field
 *  ji
 *  re
 *  wd
 *  wz
 */
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import java.lang.reflect.Field;

final class and
extends anm {
    boolean a;
    private boolean i;
    private boolean j;
    private wz k;

    public and(Context context, boolean bl2) {
        super(context, acq.w);
        this.i = bl2;
        this.setCacheColorHint(0);
    }

    @Override
    protected final boolean a() {
        if (this.j || super.a()) {
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean a(MotionEvent var1, int var2_2) {
        var3_3 = true;
        var4_4 = re.a((MotionEvent)var1);
        switch (var4_4) {
            case 3: {
                var6_6 = false;
                var7_5 = false;
                ** GOTO lbl76
            }
            case 1: {
                var3_3 = false;
            }
            case 2: {
                var5_8 = var1.findPointerIndex(var2_2);
                if (var5_8 >= 0) ** GOTO lbl16
                var6_6 = false;
                var7_5 = false;
                ** GOTO lbl76
lbl16: // 1 sources:
                var12_9 = (int)var1.getX(var5_8);
                var14_11 = this.pointToPosition(var12_9, var13_10 = (int)var1.getY(var5_8));
                if (var14_11 != -1) ** GOTO lbl22
                var7_5 = var3_3;
                var6_6 = true;
                ** GOTO lbl76
lbl22: // 1 sources:
                var15_12 = this.getChildAt(var14_11 - this.getFirstVisiblePosition());
                var16_13 = var12_9;
                var17_14 = var13_10;
                this.j = true;
                if (Build.VERSION.SDK_INT >= 21) {
                    this.drawableHotspotChanged(var16_13, var17_14);
                }
                if (!this.isPressed()) {
                    this.setPressed(true);
                }
                this.layoutChildren();
                if (this.g != -1 && (var35_15 = this.getChildAt(this.g - this.getFirstVisiblePosition())) != null && var35_15 != var15_12 && var35_15.isPressed()) {
                    var35_15.setPressed(false);
                }
                this.g = var14_11;
                var18_16 = var16_13 - (float)var15_12.getLeft();
                var19_17 = var17_14 - (float)var15_12.getTop();
                if (Build.VERSION.SDK_INT >= 21) {
                    var15_12.drawableHotspotChanged(var18_16, var19_17);
                }
                if (!var15_12.isPressed()) {
                    var15_12.setPressed(true);
                }
                var21_19 = (var20_18 = this.getSelector()) != null && var14_11 != -1;
                if (var21_19) {
                    var20_18.setVisible(false, false);
                }
                var22_20 = this.b;
                var22_20.set(var15_12.getLeft(), var15_12.getTop(), var15_12.getRight(), var15_12.getBottom());
                var22_20.left -= this.c;
                var22_20.top -= this.d;
                var22_20.right += this.e;
                var22_20.bottom += this.f;
                try {
                    var31_21 = this.h.getBoolean((Object)this);
                    if (var15_12.isEnabled() != var31_21) {
                        var32_22 = this.h;
                        var33_23 = var31_21 == false;
                        var32_22.set((Object)this, (Object)var33_23);
                        if (var14_11 != -1) {
                            this.refreshDrawableState();
                        }
                    }
                }
                catch (IllegalAccessException var23_29) {
                    var23_29.printStackTrace();
                }
                if (var21_19) {
                    var26_24 = this.b;
                    var27_25 = var26_24.exactCenterX();
                    var28_26 = var26_24.exactCenterY();
                    var29_27 = this.getVisibility() == 0;
                    var20_18.setVisible(var29_27, false);
                    ji.a((Drawable)var20_18, (float)var27_25, (float)var28_26);
                }
                if ((var24_28 = this.getSelector()) != null && var14_11 != -1) {
                    ji.a((Drawable)var24_28, (float)var16_13, (float)var17_14);
                }
                this.a(false);
                this.refreshDrawableState();
                var3_3 = true;
                if (var4_4 != 1) break;
                this.performItemClick(var15_12, var14_11, this.getItemIdAtPosition(var14_11));
            }
        }
        var7_5 = var3_3;
        var6_6 = false;
lbl76: // 4 sources:
        if (!var7_5 || var6_6) {
            this.j = false;
            this.setPressed(false);
            this.drawableStateChanged();
            var8_7 = this.getChildAt(this.g - this.getFirstVisiblePosition());
            if (var8_7 != null) {
                var8_7.setPressed(false);
            }
        }
        if (var7_5) {
            if (this.k == null) {
                this.k = new wz((ListView)this);
            }
            this.k.a(true);
            this.k.onTouch((View)this, var1);
            return var7_5;
        }
        if (this.k == null) return var7_5;
        this.k.a(false);
        return var7_5;
    }

    public final boolean hasFocus() {
        if (this.i || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.i || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.i || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if (this.i && this.a || super.isInTouchMode()) {
            return true;
        }
        return false;
    }
}

