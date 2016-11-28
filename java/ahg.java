/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionMode
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 */
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

public final class ahg
extends ActionMode {
    final ahb a;
    private Context b;

    public ahg(Context context, ahb ahb2) {
        this.b = context;
        this.a = ahb2;
    }

    public final void finish() {
        this.a.c();
    }

    public final View getCustomView() {
        return this.a.i();
    }

    public final Menu getMenu() {
        return aip.a(this.b, (kh)this.a.b());
    }

    public final MenuInflater getMenuInflater() {
        return this.a.a();
    }

    public final CharSequence getSubtitle() {
        return this.a.g();
    }

    public final Object getTag() {
        return this.a.a;
    }

    public final CharSequence getTitle() {
        return this.a.f();
    }

    public final boolean getTitleOptionalHint() {
        return this.a.b;
    }

    public final void invalidate() {
        this.a.d();
    }

    public final boolean isTitleOptional() {
        return this.a.h();
    }

    public final void setCustomView(View view) {
        this.a.a(view);
    }

    public final void setSubtitle(int n) {
        this.a.b(n);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public final void setTag(Object object) {
        this.a.a = object;
    }

    public final void setTitle(int n) {
        this.a.a(n);
    }

    public final void setTitle(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public final void setTitleOptionalHint(boolean bl2) {
        this.a.a(bl2);
    }
}

