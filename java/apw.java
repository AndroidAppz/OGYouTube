/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  java.lang.Boolean
 *  java.lang.ClassLoader
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

public final class apw
extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new apx();
    public boolean a;

    public apw(Parcel parcel) {
        super(parcel);
        this.a = (Boolean)parcel.readValue(null);
    }

    public apw(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString((int)System.identityHashCode((Object)((Object)this))) + " isIconified=" + this.a + "}";
    }

    public final void writeToParcel(Parcel parcel, int n) {
        super.writeToParcel(parcel, n);
        parcel.writeValue((Object)this.a);
    }
}

