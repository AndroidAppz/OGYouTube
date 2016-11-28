/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v7.app.MediaRouteVolumeSlider
 *  android.support.v7.app.OverlayListView
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.widget.ArrayAdapter
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 */
import android.content.Context;
import android.support.v7.app.MediaRouteVolumeSlider;
import android.support.v7.app.OverlayListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class abl
extends ArrayAdapter {
    private float a;
    private /* synthetic */ aas b;

    public abl(aas aas2, Context context, List list) {
        this.b = aas2;
        super(context, 0, list);
        this.a = abq.a(context);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final View getView(int n, View view, ViewGroup viewGroup) {
        aeu aeu2;
        if (view == null) {
            view = LayoutInflater.from((Context)this.b.f).inflate(agt.d, viewGroup, false);
        } else {
            aas aas2 = this.b;
            aas.b((View)((LinearLayout)view.findViewById(agq.x)), aas2.x);
            View view2 = view.findViewById(agq.v);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = aas2.w;
            layoutParams.height = aas2.w;
            view2.setLayoutParams(layoutParams);
        }
        if ((aeu2 = (aeu)this.getItem(n)) != null) {
            boolean bl2 = aeu2.h;
            TextView textView = (TextView)view.findViewById(agq.r);
            textView.setEnabled(bl2);
            textView.setText((CharSequence)aeu2.e);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider)view.findViewById(agq.w);
            abq.a(this.b.f, mediaRouteVolumeSlider, (View)this.b.n);
            mediaRouteVolumeSlider.setTag((Object)aeu2);
            this.b.A.put((Object)aeu2, (Object)mediaRouteVolumeSlider);
            boolean bl3 = !bl2;
            mediaRouteVolumeSlider.a(bl3);
            mediaRouteVolumeSlider.setEnabled(bl2);
            if (bl2) {
                if (this.b.a(aeu2)) {
                    mediaRouteVolumeSlider.setMax(aeu2.r);
                    mediaRouteVolumeSlider.setProgress(aeu2.q);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this.b.u);
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ImageView imageView = (ImageView)view.findViewById(agq.v);
            int n2 = bl2 ? 255 : (int)(255.0f * this.a);
            imageView.setAlpha(n2);
            LinearLayout linearLayout = (LinearLayout)view.findViewById(agq.x);
            boolean bl4 = this.b.s.contains((Object)aeu2);
            int n3 = 0;
            if (bl4) {
                n3 = 4;
            }
            linearLayout.setVisibility(n3);
            if (this.b.q != null && this.b.q.contains((Object)aeu2)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation((Animation)alphaAnimation);
            }
        }
        return view;
    }
}

