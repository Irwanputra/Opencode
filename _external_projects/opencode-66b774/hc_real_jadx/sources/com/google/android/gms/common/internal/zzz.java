package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.zzc;
import com.google.android.gms.internal.zzbfm;
import com.google.android.gms.internal.zzbfp;
import p131.p161.p162.p193.p205.C2518;
import p131.p161.p162.p193.p205.p208.BinderC2489;
import p131.p161.p162.p193.p205.p208.C2478;
import p131.p161.p162.p193.p205.p208.C2481;
import p131.p161.p162.p193.p205.p208.InterfaceC2506;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzz extends zzbfm {
    public static final Parcelable.Creator<zzz> CREATOR = new C2478();

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Bundle f2860;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2861;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Scope[] f2862;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public zzc[] f2863;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2864;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public String f2865;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public IBinder f2866;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2867;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Account f2868;

    public zzz(int i) {
        this.f2861 = 3;
        this.f2867 = C2518.f9866;
        this.f2864 = i;
    }

    public zzz(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, zzc[] zzcVarArr) {
        this.f2861 = i;
        this.f2864 = i2;
        this.f2867 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f2865 = "com.google.android.gms";
        } else {
            this.f2865 = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                InterfaceC2506 c2481 = queryLocalInterface instanceof InterfaceC2506 ? (InterfaceC2506) queryLocalInterface : new C2481(iBinder);
                int i4 = BinderC2489.f9823;
                if (c2481 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        account2 = c2481.mo4511();
                    } catch (RemoteException unused) {
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            }
            this.f2868 = account2;
        } else {
            this.f2866 = iBinder;
            this.f2868 = account;
        }
        this.f2862 = scopeArr;
        this.f2860 = bundle;
        this.f2863 = zzcVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zze = zzbfp.zze(parcel);
        zzbfp.zzc(parcel, 1, this.f2861);
        zzbfp.zzc(parcel, 2, this.f2864);
        zzbfp.zzc(parcel, 3, this.f2867);
        zzbfp.zza(parcel, 4, this.f2865, false);
        zzbfp.zza(parcel, 5, this.f2866, false);
        zzbfp.zza(parcel, 6, (Parcelable[]) this.f2862, i, false);
        zzbfp.zza(parcel, 7, this.f2860, false);
        zzbfp.zza(parcel, 8, (Parcelable) this.f2868, i, false);
        zzbfp.zza(parcel, 10, (Parcelable[]) this.f2863, i, false);
        zzbfp.zzai(parcel, zze);
    }
}
