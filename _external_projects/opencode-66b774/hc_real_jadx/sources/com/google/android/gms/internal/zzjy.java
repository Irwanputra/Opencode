package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.internal.zzjr;
import java.util.HashMap;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjy extends zzjr.zza<zzpz> {
    private /* synthetic */ zzjr zzbfc;
    private /* synthetic */ View zzbff;
    private /* synthetic */ HashMap zzbfg;
    private /* synthetic */ HashMap zzbfh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjy(zzjr zzjrVar, View view, HashMap hashMap, HashMap hashMap2) {
        super();
        this.zzbfc = zzjrVar;
        this.zzbff = view;
        this.zzbfg = hashMap;
        this.zzbfh = hashMap2;
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final zzpz zza(zzla zzlaVar) {
        return zzlaVar.createNativeAdViewHolderDelegate(new BinderC2454(this.zzbff), new BinderC2454(this.zzbfg), new BinderC2454(this.zzbfh));
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final /* synthetic */ zzpz zzhw() {
        zzrj zzrjVar;
        zzrjVar = this.zzbfc.zzbey;
        zzpz zzb = zzrjVar.zzb(this.zzbff, this.zzbfg, this.zzbfh);
        if (zzb != null) {
            return zzb;
        }
        zzjr zzjrVar = this.zzbfc;
        zzjr.zza(this.zzbff.getContext(), "native_ad_view_holder_delegate");
        return new zzmk();
    }
}
