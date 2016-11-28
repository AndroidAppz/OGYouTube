/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
import android.os.Parcel;
import android.os.Parcelable;

final class amy
implements Parcelable.Creator {
    amy() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new amx(parcel);
    }

    public final /* synthetic */ Object[] newArray(int n) {
        return new amx[n];
    }
}

