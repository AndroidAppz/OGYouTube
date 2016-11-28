/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.NoSuchFieldException
 *  java.lang.String
 *  java.lang.reflect.Field
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class anm
extends ListView {
    private ann a;
    final Rect b = new Rect();
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    public int g;
    Field h;

    public anm(Context context, int n) {
        super(context, null, n);
        try {
            this.h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.h.setAccessible(true);
            return;
        }
        catch (NoSuchFieldException var3_3) {
            var3_3.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int a(int n, int n2) {
        int n3 = this.getListPaddingTop();
        int n4 = this.getListPaddingBottom();
        this.getListPaddingLeft();
        this.getListPaddingRight();
        int n5 = this.getDividerHeight();
        Drawable drawable = this.getDivider();
        ListAdapter listAdapter = this.getAdapter();
        if (listAdapter == null) {
            return n3 + n4;
        }
        int n6 = n4 + n3;
        if (n5 <= 0 || drawable == null) {
            n5 = 0;
        }
        int n7 = listAdapter.getCount();
        int n8 = 0;
        int n9 = 0;
        View view = null;
        while (n8 < n7) {
            View view2;
            ViewGroup.LayoutParams layoutParams;
            int n10 = listAdapter.getItemViewType(n8);
            if (n10 != n9) {
                n9 = n10;
                view2 = null;
            } else {
                view2 = view;
            }
            if ((layoutParams = (view = listAdapter.getView(n8, view2, (ViewGroup)this)).getLayoutParams()) == null) {
                layoutParams = this.generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int n11 = layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec((int)layoutParams.height, (int)1073741824) : View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            view.measure(n, n11);
            view.forceLayout();
            int n12 = n8 > 0 ? n6 + n5 : n6;
            n6 = n12 + view.getMeasuredHeight();
            if (n6 >= n2) return n2;
            ++n8;
        }
        return n6;
    }

    protected final void a(boolean bl2) {
        if (this.a != null) {
            this.a.a = bl2;
        }
    }

    protected boolean a() {
        return false;
    }

    protected void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        if (!this.b.isEmpty() && (drawable = this.getSelector()) != null) {
            drawable.setBounds(this.b);
            drawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void drawableStateChanged() {
        boolean bl2 = true;
        super.drawableStateChanged();
        this.a(bl2);
        Drawable drawable = this.getSelector();
        if (drawable == null) return;
        if (!this.a() || !this.isPressed()) return;
        if (!bl2) return;
        drawable.setState(this.getDrawableState());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            default: {
                do {
                    return super.onTouchEvent(motionEvent);
                    break;
                } while (true);
            }
            case 0: 
        }
        this.g = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setSelector(Drawable drawable) {
        ann ann2 = drawable != null ? new ann(drawable) : null;
        this.a = ann2;
        super.setSelector((Drawable)this.a);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.c = rect.left;
        this.d = rect.top;
        this.e = rect.right;
        this.f = rect.bottom;
    }
}

