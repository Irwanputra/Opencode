package dev.epro.r0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B6867906687934285025 extends X9848659370812859730 {
    public final int d;
    public final int e;
    public final PendingIntent f;
    public final String g;
    public final Integer h;
    public static final B6867906687934285025 i = new B6867906687934285025(0, null, null);
    public static final Parcelable.Creator<B6867906687934285025> CREATOR = new A16739659649845694970((byte) 27);

    public B6867906687934285025(int i2, int i3, PendingIntent pendingIntent, String str, Integer num) {
        this.d = i2;
        this.e = i3;
        this.f = pendingIntent;
        this.g = str;
        this.h = num;
    }

    public static String a(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof B6867906687934285025)) {
            return false;
        }
        B6867906687934285025 b6867906687934285025 = (B6867906687934285025) obj;
        return this.e == b6867906687934285025.e && V1475975160983963926.t(this.f, b6867906687934285025.f) && V1475975160983963926.t(this.g, b6867906687934285025.g) && V1475975160983963926.t(this.h, b6867906687934285025.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.f, this.g, this.h});
    }

    public final String toString() {
        V10300877997588547986 v10300877997588547986 = new V10300877997588547986(this);
        v10300877997588547986.b("statusCode", a(this.e));
        v10300877997588547986.b("resolution", this.f);
        v10300877997588547986.b("message", this.g);
        v10300877997588547986.b("clientMethodKey", this.h);
        return v10300877997588547986.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iA = C468629748621011703.A(parcel, 20293);
        C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.e);
        C468629748621011703.u(parcel, 3, this.f, i2);
        C468629748621011703.v(parcel, this.g, 4);
        Integer num = this.h;
        if (num != null) {
            C468629748621011703.z(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        C468629748621011703.D(parcel, iA);
    }

    public B6867906687934285025(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str, null);
    }
}
