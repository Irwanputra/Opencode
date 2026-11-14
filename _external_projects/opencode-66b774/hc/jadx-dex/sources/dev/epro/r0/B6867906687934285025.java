package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B6867906687934285025 extends dev.epro.r0.X9848659370812859730 {
    public final int d;
    public final int e;
    public final android.app.PendingIntent f;
    public final java.lang.String g;
    public final java.lang.Integer h;
    public static final dev.epro.r0.B6867906687934285025 i = new dev.epro.r0.B6867906687934285025(0, null, null);
    public static final android.os.Parcelable.Creator<dev.epro.r0.B6867906687934285025> CREATOR = new dev.epro.r0.A16739659649845694970((byte) 27);

    public B6867906687934285025(int i2, int i3, android.app.PendingIntent pendingIntent, java.lang.String str, java.lang.Integer num) {
        this.d = i2;
        this.e = i3;
        this.f = pendingIntent;
        this.g = str;
        this.h = num;
    }

    public static java.lang.String a(int i2) {
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
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B6867906687934285025)) {
            return false;
        }
        dev.epro.r0.B6867906687934285025 b6867906687934285025 = (dev.epro.r0.B6867906687934285025) obj;
        return this.e == b6867906687934285025.e && dev.epro.r0.V1475975160983963926.t(this.f, b6867906687934285025.f) && dev.epro.r0.V1475975160983963926.t(this.g, b6867906687934285025.g) && dev.epro.r0.V1475975160983963926.t(this.h, b6867906687934285025.h);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.e), this.f, this.g, this.h});
    }

    public final java.lang.String toString() {
        dev.epro.r0.V10300877997588547986 v10300877997588547986 = new dev.epro.r0.V10300877997588547986(this);
        v10300877997588547986.b("statusCode", a(this.e));
        v10300877997588547986.b("resolution", this.f);
        v10300877997588547986.b("message", this.g);
        v10300877997588547986.b("clientMethodKey", this.h);
        return v10300877997588547986.toString();
    }

    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        int iA = dev.epro.r0.C468629748621011703.A(parcel, 20293);
        dev.epro.r0.C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        dev.epro.r0.C468629748621011703.z(parcel, 2, 4);
        parcel.writeInt(this.e);
        dev.epro.r0.C468629748621011703.u(parcel, 3, this.f, i2);
        dev.epro.r0.C468629748621011703.v(parcel, this.g, 4);
        java.lang.Integer num = this.h;
        if (num != null) {
            dev.epro.r0.C468629748621011703.z(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        dev.epro.r0.C468629748621011703.D(parcel, iA);
    }

    public B6867906687934285025(int i2, android.app.PendingIntent pendingIntent, java.lang.String str) {
        this(1, i2, pendingIntent, str, null);
    }
}
