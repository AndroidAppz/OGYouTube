/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  java.lang.ClassLoader
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class aop
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new aoq();
    public Parcelable a;

    aop(Parcel parcel) {
        super(parcel);
        this.a = parcel.readParcelable(aoh.class.getClassLoader());
    }

    public aop(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int n) {
        super.writeToParcel(parcel, n);
        parcel.writeParcelable(this.a, 0);
    }
}

