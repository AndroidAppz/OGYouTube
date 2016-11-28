/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.database.Observable
 *  java.lang.Object
 *  java.util.ArrayList
 */
import android.database.Observable;
import java.util.ArrayList;

public final class aoa
extends Observable {
    aoa() {
    }

    public final void a() {
        for (int i = -1 + this.mObservers.size(); i >= 0; --i) {
            ((aob)this.mObservers.get(i)).a();
        }
    }

    public final void a(int n, int n2) {
        for (int i = -1 + this.mObservers.size(); i >= 0; --i) {
            ((aob)this.mObservers.get(i)).a(n, n2, null);
        }
    }

    public final void b(int n, int n2) {
        for (int i = -1 + this.mObservers.size(); i >= 0; --i) {
            ((aob)this.mObservers.get(i)).a(n, n2);
        }
    }

    public final void c(int n, int n2) {
        for (int i = -1 + this.mObservers.size(); i >= 0; --i) {
            ((aob)this.mObservers.get(i)).b(n, n2);
        }
    }

    public final void d(int n, int n2) {
        for (int i = -1 + this.mObservers.size(); i >= 0; --i) {
            ((aob)this.mObservers.get(i)).c(n, n2);
        }
    }
}

