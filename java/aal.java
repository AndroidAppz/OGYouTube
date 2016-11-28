/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.os.Bundle
 *  android.view.View
 *  android.view.Window
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.List
 */
import android.app.Dialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class aal
extends Dialog {
    ArrayList a;
    aao b;
    AsyncTask c;
    AsyncTask d;
    private final aef e;
    private final aan f;
    private aed g;
    private ListView h;
    private boolean i;

    public aal(Context context) {
        super(context, 0);
    }

    public aal(Context context, int n) {
        super(abq.a(context, 0), 0);
        this.g = aed.c;
        this.e = aef.a(this.getContext());
        this.f = new aan((aal)this);
    }

    final void a() {
        this.getWindow().setLayout(abo.a(this.getContext()), -2);
    }

    public final void a(aed aed2) {
        if (aed2 == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (!this.g.equals(aed2)) {
            this.g = aed2;
            if (this.i) {
                this.e.a(this.f);
                this.e.a(aed2, this.f, 1);
            }
            this.b();
        }
    }

    public final void a(List list) {
        int n = list.size();
        do {
            int n2 = n - 1;
            if (n > 0) {
                if (!this.a((aeu)list.get(n2))) {
                    list.remove(n2);
                    n = n2;
                    continue;
                }
            } else {
                return;
            }
            n = n2;
        } while (true);
    }

    public boolean a(aeu aeu2) {
        if (!aeu2.b() && aeu2.h && aeu2.a(this.g)) {
            return true;
        }
        return false;
    }

    public final void b() {
        if (this.i) {
            if (this.c != null) {
                this.c.cancel(true);
                this.c = null;
            }
            this.c = new aam(this).execute((Object[])new Void[0]);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i = true;
        this.e.a(this.g, this.f, 1);
        this.b();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(agt.a);
        this.setTitle(agu.a);
        this.a = new ArrayList();
        this.b = new aao((aal)this, this.getContext(), (List)this.a);
        this.h = (ListView)this.findViewById(agq.b);
        this.h.setAdapter((ListAdapter)this.b);
        this.h.setOnItemClickListener((AdapterView.OnItemClickListener)this.b);
        this.h.setEmptyView(this.findViewById(16908292));
        this.a();
    }

    public void onDetachedFromWindow() {
        this.i = false;
        this.e.a(this.f);
        super.onDetachedFromWindow();
    }
}

