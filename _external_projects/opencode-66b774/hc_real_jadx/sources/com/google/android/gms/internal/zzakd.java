package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzakd extends zzbfm {
    public static final Parcelable.Creator<zzakd> CREATOR = new zzake();
    public String zzcv;
    public int zzdej;
    public int zzdek;
    public boolean zzdel;
    public boolean zzdem;

    public zzakd(int i, int i2, boolean z) {
        this(i, i2, z, false, false);
    }

    public zzakd(int i, int i2, boolean z, boolean z2) {
        this(11910000, i2, true, false, z2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzakd(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L5
            java.lang.String r12 = "0"
            goto L7
        L5:
            java.lang.String r12 = "1"
        L7:
            java.lang.String r0 = "afma-sdk-a-v"
            int r1 = r0.length()
            int r1 = r1 + 24
            int r2 = r12.length()
            int r2 = r2 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "."
            r1.append(r0)
            r1.append(r10)
            java.lang.String r3 = p131.p155.p156.p157.C2098.m4198(r1, r0, r12)
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzakd.<init>(int, int, boolean, boolean, boolean):void");
    }

    public zzakd(String str, int i, int i2, boolean z, boolean z2) {
        this.zzcv = str;
        this.zzdej = i;
        this.zzdek = i2;
        this.zzdel = z;
        this.zzdem = z2;
    }

    public static zzakd zzrd() {
        return new zzakd(11910208, 11910208, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zza(parcel, 2, this.zzcv, false);
        zzbfp.zzc(parcel, 3, this.zzdej);
        zzbfp.zzc(parcel, 4, this.zzdek);
        zzbfp.zza(parcel, 5, this.zzdel);
        zzbfp.zza(parcel, 6, this.zzdem);
        zzbfp.zzai(parcel, zze);
    }
}
