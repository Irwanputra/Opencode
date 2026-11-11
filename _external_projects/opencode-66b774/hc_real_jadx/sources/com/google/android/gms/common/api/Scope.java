package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzbfp;
import p034.p095.C1687;
import p131.p161.p162.p193.p205.p206.C2469;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class Scope extends zzbfm implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C2469();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2858;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final String f2859;

    public Scope(int i, String str) {
        C1687.m3661(str, "scopeUri must not be null or empty");
        this.f2858 = i;
        this.f2859 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f2859.equals(((Scope) obj).f2859);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2859.hashCode();
    }

    public final String toString() {
        return this.f2859;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zzc(parcel, 1, this.f2858);
        zzbfp.zza(parcel, 2, this.f2859, false);
        zzbfp.zzai(parcel, zze);
    }
}
