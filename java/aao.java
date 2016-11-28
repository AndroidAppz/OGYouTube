/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.AsyncTask
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.List
 */
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

final class aao
extends ArrayAdapter
implements AdapterView.OnItemClickListener {
    final /* synthetic */ aal a;
    private final LayoutInflater b;
    private final Drawable c;
    private final Drawable d;
    private final Drawable e;
    private final Drawable f;
    private final Drawable g;

    public aao(aal aal2, Context context, List list) {
        this.a = aal2;
        super(context, 0, list);
        this.b = LayoutInflater.from((Context)context);
        Context context2 = this.getContext();
        int[] arrn = new int[]{agn.g, agn.e, agn.l, agn.k, agn.j};
        TypedArray typedArray = context2.obtainStyledAttributes(arrn);
        this.c = typedArray.getDrawable(0);
        this.d = typedArray.getDrawable(1);
        this.e = typedArray.getDrawable(2);
        this.f = typedArray.getDrawable(3);
        this.g = typedArray.getDrawable(4);
        typedArray.recycle();
    }

    private final Drawable a(aeu aeu2) {
        Uri uri = aeu2.g;
        if (uri != null) {
            try {
                Drawable drawable = Drawable.createFromStream((InputStream)this.getContext().getContentResolver().openInputStream(uri), (String)null);
                if (drawable != null) {
                    return drawable;
                }
            }
            catch (IOException var3_4) {
                Log.w((String)"MediaRouteChooserDialog", (String)("Failed to load " + (Object)uri), (Throwable)var3_4);
            }
        }
        switch (aeu2.o) {
            default: {
                if (!(aeu2 instanceof aet)) break;
                return this.g;
            }
            case 3: {
                return this.d;
            }
            case 1: {
                return this.e;
            }
            case 2: {
                return this.f;
            }
        }
        if (aeu2.c()) {
            return this.d;
        }
        return this.c;
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final View getView(int n, View view, ViewGroup viewGroup) {
        int n2 = 1;
        if (view == null) {
            view = this.b.inflate(agt.b, viewGroup, false);
        }
        aeu aeu2 = (aeu)this.getItem(n);
        TextView textView = (TextView)view.findViewById(agq.e);
        TextView textView2 = (TextView)view.findViewById(agq.c);
        textView.setText((CharSequence)aeu2.e);
        String string = aeu2.f;
        if (aeu2.j != 2 && aeu2.j != n2) {
            n2 = 0;
        }
        if (n2 != 0 && !TextUtils.isEmpty((CharSequence)string)) {
            textView.setGravity(80);
            textView2.setVisibility(0);
            textView2.setText((CharSequence)string);
        } else {
            textView.setGravity(16);
            textView2.setVisibility(8);
            textView2.setText((CharSequence)"");
        }
        view.setEnabled(aeu2.h);
        ImageView imageView = (ImageView)view.findViewById(agq.d);
        if (imageView != null) {
            imageView.setImageDrawable(super.a(aeu2));
        }
        return view;
    }

    public final boolean isEnabled(int n) {
        return ((aeu)this.getItem((int)n)).h;
    }

    public final void onItemClick(AdapterView adapterView, View view, int n, long l) {
        aeu aeu2 = (aeu)this.getItem(n);
        if (aeu2.h && this.a.d == null) {
            this.a.d = new aap((aao)this, aeu2).execute((Object[])new Void[0]);
        }
    }
}

