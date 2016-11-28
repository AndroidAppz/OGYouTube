/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.Drawable
 *  android.support.v7.app.MediaRouteExpandCollapseButton
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.MediaRouteExpandCollapseButton;
import android.view.View;

public final class abp
implements View.OnClickListener {
    private /* synthetic */ MediaRouteExpandCollapseButton a;

    public abp(MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton) {
        this.a = mediaRouteExpandCollapseButton;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.a;
        boolean bl2 = !this.a.e;
        mediaRouteExpandCollapseButton.e = bl2;
        if (this.a.e) {
            this.a.setImageDrawable((Drawable)this.a.a);
            this.a.a.start();
            this.a.setContentDescription((CharSequence)this.a.d);
        } else {
            this.a.setImageDrawable((Drawable)this.a.b);
            this.a.b.start();
            this.a.setContentDescription((CharSequence)this.a.c);
        }
        if (this.a.f != null) {
            this.a.f.onClick(view);
        }
    }
}

