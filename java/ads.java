/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.content.IntentSender
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ads {
    final Bundle a;
    List b;

    ads(Bundle bundle, List list) {
        this.a = bundle;
        this.b = list;
    }

    public final String a() {
        return this.a.getString("id");
    }

    public final List b() {
        return this.a.getStringArrayList("groupMemberIds");
    }

    public final String c() {
        return this.a.getString("name");
    }

    public final String d() {
        return this.a.getString("status");
    }

    public final Uri e() {
        String string = this.a.getString("iconUri");
        if (string == null) {
            return null;
        }
        return Uri.parse((String)string);
    }

    public final boolean f() {
        return this.a.getBoolean("enabled", true);
    }

    public final boolean g() {
        return this.a.getBoolean("connecting", false);
    }

    public final int h() {
        return this.a.getInt("connectionState", 0);
    }

    public final boolean i() {
        return this.a.getBoolean("canDisconnect", false);
    }

    public final IntentSender j() {
        return (IntentSender)this.a.getParcelable("settingsIntent");
    }

    public final List k() {
        this.l();
        return this.b;
    }

    final void l() {
        if (this.b == null) {
            this.b = this.a.getParcelableArrayList("controlFilters");
            if (this.b == null) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final int m() {
        return this.a.getInt("playbackType", 1);
    }

    public final int n() {
        return this.a.getInt("playbackStream", -1);
    }

    public final int o() {
        return this.a.getInt("deviceType");
    }

    public final int p() {
        return this.a.getInt("volume");
    }

    public final int q() {
        return this.a.getInt("volumeMax");
    }

    public final int r() {
        return this.a.getInt("volumeHandling", 0);
    }

    public final int s() {
        return this.a.getInt("presentationDisplayId", -1);
    }

    public final Bundle t() {
        return this.a.getBundle("extras");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MediaRouteDescriptor{ ");
        stringBuilder.append("id=").append(this.a());
        stringBuilder.append(", groupMemberIds=").append((Object)this.b());
        stringBuilder.append(", name=").append(this.c());
        stringBuilder.append(", description=").append(this.d());
        stringBuilder.append(", iconUri=").append((Object)this.e());
        stringBuilder.append(", isEnabled=").append(this.f());
        stringBuilder.append(", isConnecting=").append(this.g());
        stringBuilder.append(", connectionState=").append(this.h());
        stringBuilder.append(", controlFilters=").append(Arrays.toString((Object[])this.k().toArray()));
        stringBuilder.append(", playbackType=").append(this.m());
        stringBuilder.append(", playbackStream=").append(this.n());
        stringBuilder.append(", deviceType=").append(this.o());
        stringBuilder.append(", volume=").append(this.p());
        stringBuilder.append(", volumeMax=").append(this.q());
        stringBuilder.append(", volumeHandling=").append(this.r());
        stringBuilder.append(", presentationDisplayId=").append(this.s());
        stringBuilder.append(", extras=").append((Object)this.t());
        stringBuilder.append(", isValid=").append(this.u());
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }

    public final boolean u() {
        this.l();
        if (TextUtils.isEmpty((CharSequence)this.a()) || TextUtils.isEmpty((CharSequence)this.c()) || this.b.contains((Object)null)) {
            return false;
        }
        return true;
    }
}

