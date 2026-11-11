package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzbfp;
import java.util.Arrays;
import p034.p095.C1687;
import p131.p161.p162.p193.p205.C2472;
import p131.p161.p162.p193.p205.p208.C2492;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class ConnectionResult extends zzbfm {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2854;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f2855;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final String f2856;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final PendingIntent f2857;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final ConnectionResult f2853 = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C2472();

    public ConnectionResult(int i) {
        this.f2854 = 1;
        this.f2855 = i;
        this.f2857 = null;
        this.f2856 = null;
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f2854 = i;
        this.f2855 = i2;
        this.f2857 = pendingIntent;
        this.f2856 = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f2855 == connectionResult.f2855 && C1687.m3694(this.f2857, connectionResult.f2857) && C1687.m3694(this.f2856, connectionResult.f2856);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2855), this.f2857, this.f2856});
    }

    public final String toString() {
        String str;
        C2492 c2492 = new C2492(this, null);
        int i = this.f2855;
        if (i == 99) {
            str = "UNFINISHED";
        } else if (i != 1500) {
            switch (i) {
                case -1:
                    str = "UNKNOWN";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                    str = "SERVICE_MISSING";
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
                case 9:
                    str = "SERVICE_INVALID";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 11:
                    str = "LICENSE_CHECK_FAILED";
                    break;
                default:
                    switch (i) {
                        case 13:
                            str = "CANCELED";
                            break;
                        case 14:
                            str = "TIMEOUT";
                            break;
                        case 15:
                            str = "INTERRUPTED";
                            break;
                        case 16:
                            str = "API_UNAVAILABLE";
                            break;
                        case 17:
                            str = "SIGN_IN_FAILED";
                            break;
                        case 18:
                            str = "SERVICE_UPDATING";
                            break;
                        case 19:
                            str = "SERVICE_MISSING_PERMISSION";
                            break;
                        case 20:
                            str = "RESTRICTED_PROFILE";
                            break;
                        case 21:
                            str = "API_VERSION_UPDATE_REQUIRED";
                            break;
                        default:
                            StringBuilder sb = new StringBuilder(31);
                            sb.append("UNKNOWN_ERROR_CODE(");
                            sb.append(i);
                            sb.append(")");
                            str = sb.toString();
                            break;
                    }
            }
        } else {
            str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        c2492.m4518("statusCode", str);
        c2492.m4518("resolution", this.f2857);
        c2492.m4518("message", this.f2856);
        return c2492.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zzc(parcel, 1, this.f2854);
        zzbfp.zzc(parcel, 2, this.f2855);
        zzbfp.zza(parcel, 3, (Parcelable) this.f2857, i, false);
        zzbfp.zza(parcel, 4, this.f2856, false);
        zzbfp.zzai(parcel, zze);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this.f2854 = 1;
        this.f2855 = i;
        this.f2857 = pendingIntent;
        this.f2856 = null;
    }
}
