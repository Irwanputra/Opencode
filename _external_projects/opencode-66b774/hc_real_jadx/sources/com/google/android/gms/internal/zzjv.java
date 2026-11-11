package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzjr;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjv extends zzjr.zza<zzkn> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ String zzbfa;
    private /* synthetic */ zzux zzbfb;
    private /* synthetic */ zzjr zzbfc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjv(zzjr zzjrVar, Context context, String str, zzux zzuxVar) {
        super();
        this.zzbfc = zzjrVar;
        this.val$context = context;
        this.zzbfa = str;
        this.zzbfb = zzuxVar;
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final zzkn zza(zzla zzlaVar) {
        return zzlaVar.createAdLoaderBuilder(new BinderC2454(this.val$context), this.zzbfa, this.zzbfb, 11910000);
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final /* synthetic */ zzkn zzhw() {
        zzjh zzjhVar;
        zzjhVar = this.zzbfc.zzbet;
        zzkn zza = zzjhVar.zza(this.val$context, this.zzbfa, this.zzbfb);
        if (zza != null) {
            return zza;
        }
        zzjr zzjrVar = this.zzbfc;
        zzjr.zza(this.val$context, "native_ad");
        return new zzmc();
    }
}
