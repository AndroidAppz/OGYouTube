/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  ns
 *  nu
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;

public final class ad
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = ns.a((nu)new ae());
    public SparseArray a;

    public ad(Parcel parcel, ClassLoader classLoader) {
        super(parcel);
        int n = parcel.readInt();
        int[] arrn = new int[n];
        parcel.readIntArray(arrn);
        Parcelable[] arrparcelable = parcel.readParcelableArray(classLoader);
        this.a = new SparseArray(n);
        for (int i = 0; i < n; ++i) {
            this.a.append(arrn[i], (Object)arrparcelable[i]);
        }
    }

    public ad(Parcelable parcelable) {
        super(parcelable);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void writeToParcel(Parcel parcel, int n) {
        int n2 = 0;
        super.writeToParcel(parcel, n);
        int n3 = this.a != null ? this.a.size() : 0;
        parcel.writeInt(n3);
        int[] arrn = new int[n3];
        Parcelable[] arrparcelable = new Parcelable[n3];
        do {
            if (n2 >= n3) {
                parcel.writeIntArray(arrn);
                parcel.writeParcelableArray(arrparcelable, n);
                return;
            }
            arrn[n2] = this.a.keyAt(n2);
            arrparcelable[n2] = (Parcelable)this.a.valueAt(n2);
            ++n2;
        } while (true);
    }
}

