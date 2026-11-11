package com.google.android.gms.internal;

import android.view.View;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznv extends zzny {
    private final com.google.android.gms.ads.internal.zzae zzbsu;
    private final String zzbsv;
    private final String zzbsw;

    public zznv(com.google.android.gms.ads.internal.zzae zzaeVar, String str, String str2) {
        this.zzbsu = zzaeVar;
        this.zzbsv = str;
        this.zzbsw = str2;
    }

    @Override // com.google.android.gms.internal.zznx
    public final String getContent() {
        return this.zzbsw;
    }

    @Override // com.google.android.gms.internal.zznx
    public final void recordClick() {
        this.zzbsu.zzcs();
    }

    @Override // com.google.android.gms.internal.zznx
    public final void recordImpression() {
        this.zzbsu.zzct();
    }

    @Override // com.google.android.gms.internal.zznx
    public final void zze(InterfaceC2455 interfaceC2455) {
        if (interfaceC2455 == null) {
            return;
        }
        this.zzbsu.zzh((View) BinderC2454.m4502(interfaceC2455));
    }

    @Override // com.google.android.gms.internal.zznx
    public final String zzjj() {
        return this.zzbsv;
    }
}
