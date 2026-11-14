package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import dev.epro.r0.B10553407071691721287;
import dev.epro.r0.B6867906687934285025;
import dev.epro.r0.C468629748621011703;
import dev.epro.r0.V10300877997588547986;
import dev.epro.r0.V1475975160983963926;
import dev.epro.r0.X9848659370812859730;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class Status extends X9848659370812859730 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new B10553407071691721287(2);
    public final int d;
    public final String e;
    public final PendingIntent f;
    public final B6867906687934285025 g;

    public Status(int i, String str, PendingIntent pendingIntent, B6867906687934285025 b6867906687934285025) {
        this.d = i;
        this.e = str;
        this.f = pendingIntent;
        this.g = b6867906687934285025;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.d == status.d && V1475975160983963926.t(this.e, status.e) && V1475975160983963926.t(this.f, status.f) && V1475975160983963926.t(this.g, status.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.e, this.f, this.g});
    }

    public final String toString() {
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986(this);
        String str = this.e;
        if (str == null) {
            int i = this.d;
            switch (i) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    str = sb.toString();
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        v10300877997588547986.b("statusCode", str);
        v10300877997588547986.b("resolution", this.f);
        return v10300877997588547986.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.v(parcel, this.e, 2);
        C468629748621011703.u(parcel, 3, this.f, i);
        C468629748621011703.u(parcel, 4, this.g, i);
        C468629748621011703.D(parcel, A);
    }
}
