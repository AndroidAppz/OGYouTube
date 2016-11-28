/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  java.lang.Object
 *  java.lang.String
 */
import android.content.Context;
import android.os.AsyncTask;

final class aap
extends AsyncTask {
    private /* synthetic */ aeu a;
    private /* synthetic */ aao b;

    aap(aao aao2, aeu aeu2) {
        this.b = aao2;
        this.a = aeu2;
    }

    protected final /* synthetic */ Object doInBackground(Object[] arrobject) {
        aaq.a(this.b.getContext(), this.a.d);
        return null;
    }

    protected final /* synthetic */ void onPostExecute(Object object) {
        this.b.a.dismiss();
        this.b.a.d = null;
    }

    protected final void onPreExecute() {
        this.a.d();
    }
}

