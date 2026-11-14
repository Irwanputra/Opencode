package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class Status extends dev.epro.r0.X9848659370812859730 implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.api.Status> CREATOR = new dev.epro.r0.B10553407071691721287(2);
    public final int d;
    public final java.lang.String e;
    public final android.app.PendingIntent f;
    public final dev.epro.r0.B6867906687934285025 g;

    public Status(int i, java.lang.String str, android.app.PendingIntent pendingIntent, dev.epro.r0.B6867906687934285025 b6867906687934285025) {
        this.d = i;
        this.e = str;
        this.f = pendingIntent;
        this.g = b6867906687934285025;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.common.api.Status)) {
            return false;
        }
        com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) obj;
        return this.d == status.d && dev.epro.r0.V1475975160983963926.t(this.e, status.e) && dev.epro.r0.V1475975160983963926.t(this.f, status.f) && dev.epro.r0.V1475975160983963926.t(this.g, status.g);
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.d), this.e, this.f, this.g});
    }

    public final java.lang.String toString() {
        dev.epro.r0.V10300877997588547986 v10300877997588547986 = new dev.epro.r0.V10300877997588547986(this);
        java.lang.String string = this.e;
        if (string == null) {
            int i = this.d;
            switch (i) {
                case -1:
                    string = "SUCCESS_CACHE";
                    break;
                case 0:
                    string = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 21);
                    sb.append("unknown status code: ");
                    sb.append(i);
                    string = sb.toString();
                    break;
                case 2:
                    string = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    string = "SERVICE_DISABLED";
                    break;
                case 4:
                    string = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    string = "INVALID_ACCOUNT";
                    break;
                case 6:
                    string = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    string = "NETWORK_ERROR";
                    break;
                case 8:
                    string = "INTERNAL_ERROR";
                    break;
                case 10:
                    string = "DEVELOPER_ERROR";
                    break;
                case 13:
                    string = "ERROR";
                    break;
                case 14:
                    string = "INTERRUPTED";
                    break;
                case 15:
                    string = "TIMEOUT";
                    break;
                case 16:
                    string = "CANCELED";
                    break;
                case 17:
                    string = "API_NOT_CONNECTED";
                    break;
                case 18:
                    string = "DEAD_CLIENT";
                    break;
                case 19:
                    string = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    string = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    string = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    string = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        v10300877997588547986.b("statusCode", string);
        v10300877997588547986.b("resolution", this.f);
        return v10300877997588547986.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int iA = dev.epro.r0.C468629748621011703.A(parcel, 20293);
        dev.epro.r0.C468629748621011703.z(parcel, 1, 4);
        parcel.writeInt(this.d);
        dev.epro.r0.C468629748621011703.v(parcel, this.e, 2);
        dev.epro.r0.C468629748621011703.u(parcel, 3, this.f, i);
        dev.epro.r0.C468629748621011703.u(parcel, 4, this.g, i);
        dev.epro.r0.C468629748621011703.D(parcel, iA);
    }
}
