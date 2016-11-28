/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  java.lang.Runnable
 *  ji
 */
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class adr
extends Drawable
implements Drawable.Callback {
    public Drawable f;

    public adr(Drawable drawable) {
        if (this.f != null) {
            this.f.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
        }
    }

    public void draw(Canvas canvas) {
        this.f.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f.getPadding(rect);
    }

    public int[] getState() {
        return this.f.getState();
    }

    public Region getTransparentRegion() {
        return this.f.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return ji.b((Drawable)this.f);
    }

    public boolean isStateful() {
        return this.f.isStateful();
    }

    public void jumpToCurrentState() {
        ji.a((Drawable)this.f);
    }

    public void onBoundsChange(Rect rect) {
        this.f.setBounds(rect);
    }

    protected boolean onLevelChange(int n) {
        return this.f.setLevel(n);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l) {
        this.scheduleSelf(runnable, l);
    }

    public void setAlpha(int n) {
        this.f.setAlpha(n);
    }

    public void setAutoMirrored(boolean bl2) {
        ji.a((Drawable)this.f, (boolean)bl2);
    }

    public void setChangingConfigurations(int n) {
        this.f.setChangingConfigurations(n);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl2) {
        this.f.setDither(bl2);
    }

    public void setFilterBitmap(boolean bl2) {
        this.f.setFilterBitmap(bl2);
    }

    public void setHotspot(float f, float f2) {
        ji.a((Drawable)this.f, (float)f, (float)f2);
    }

    public void setHotspotBounds(int n, int n2, int n3, int n4) {
        ji.a((Drawable)this.f, (int)n, (int)n2, (int)n3, (int)n4);
    }

    public boolean setState(int[] arrn) {
        return this.f.setState(arrn);
    }

    public void setTint(int n) {
        ji.a((Drawable)this.f, (int)n);
    }

    public void setTintList(ColorStateList colorStateList) {
        ji.a((Drawable)this.f, (ColorStateList)colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        ji.a((Drawable)this.f, (PorterDuff.Mode)mode);
    }

    public boolean setVisible(boolean bl2, boolean bl3) {
        if (super.setVisible(bl2, bl3) || this.f.setVisible(bl2, bl3)) {
            return true;
        }
        return false;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}

