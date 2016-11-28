/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
final class atw
implements Runnable {
    final /* synthetic */ atv this$0;
    final /* synthetic */ String val$text;

    atw(atv atv2, String string) {
        this.this$0 = atv2;
        this.val$text = string;
    }

    public final void run() {
        atv.access$000(this.this$0).setText((CharSequence)this.val$text);
    }
}

