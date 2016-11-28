/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
import android.view.View;
import android.widget.TextView;

public final class atv
extends ata {
    private TextView mTextView = null;

    public atv(asr asr2, String string) {
        super(asr2, string);
    }

    static /* synthetic */ TextView access$000(atv atv2) {
        return atv2.mTextView;
    }

    @Override
    public final asw getSignature() {
        return new asw().a("text", 2, arx.a(String.class)).a();
    }

    @Override
    public final void onBindToView(View view) {
        if (view instanceof TextView) {
            this.mTextView = (TextView)view;
            return;
        }
        throw new IllegalArgumentException("View must be a TextView!");
    }

    @Override
    protected final void onProcess() {
        String string = (String)this.getConnectedInputPort("text").a().b().h();
        if (this.mTextView != null) {
            this.mTextView.post((Runnable)new atw(this, string));
        }
    }
}

