/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 *  android.graphics.drawable.Drawable
 *  android.support.v7.widget.ActionBarContainer
 */
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;

public final class aiw
extends aiv {
    public aiw(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void getOutline(Outline outline) {
        if (this.a.e) {
            if (this.a.d == null) return;
            {
                this.a.d.getOutline(outline);
                return;
            }
        } else {
            if (this.a.b == null) return;
            {
                this.a.b.getOutline(outline);
                return;
            }
        }
    }
}

