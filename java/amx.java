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

public final class amx
implements Parcelable {
    public static final Parcelable.Creator CREATOR = new amy();
    int a;
    int b;
    boolean c;

    public amx() {
    }

    public amx(amx amx2) {
        this.a = amx2.a;
        this.b = amx2.b;
        this.c = amx2.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    amx(Parcel parcel) {
        int n = 1;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        if (parcel.readInt() != n) {
            n = 0;
        }
        this.c = n;
    }

    final boolean a() {
        if (this.a >= 0) {
            return true;
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void writeToParcel(Parcel parcel, int n) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        int n2 = this.c ? 1 : 0;
        parcel.writeInt(n2);
    }
}

