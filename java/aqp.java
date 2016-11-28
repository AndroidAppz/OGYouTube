/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View
 *  android.view.View$BaseSavedState
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class aqp
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new aqq();
    public int a;
    public boolean b;

    /*
     * Enabled aggressive block sorting
     */
    public aqp(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
        boolean bl2 = parcel.readInt() != 0;
        this.b = bl2;
    }

    public aqp(Parcelable parcelable) {
        super(parcelable);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void writeToParcel(Parcel parcel, int n) {
        super.writeToParcel(parcel, n);
        parcel.writeInt(this.a);
        int n2 = this.b ? 1 : 0;
        parcel.writeInt(n2);
    }
}

