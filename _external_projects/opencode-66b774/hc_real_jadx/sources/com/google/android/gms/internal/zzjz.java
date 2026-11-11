package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzjr;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjz extends zzjr.zza<zzadk> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzux zzbfb;
    private /* synthetic */ zzjr zzbfc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjz(zzjr zzjrVar, Context context, zzux zzuxVar) {
        super();
        this.zzbfc = zzjrVar;
        this.val$context = context;
        this.zzbfb = zzuxVar;
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final zzadk zza(zzla zzlaVar) {
        return zzlaVar.createRewardedVideoAd(new BinderC2454(this.val$context), this.zzbfb, 11910000);
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final /* synthetic */ zzadk zzhw() {
        zzadt zzadtVar;
        zzadtVar = this.zzbfc.zzbew;
        zzadk zza = zzadtVar.zza(this.val$context, this.zzbfb);
        if (zza != null) {
            return zza;
        }
        zzjr zzjrVar = this.zzbfc;
        zzjr.zza(this.val$context, "rewarded_video");
        return new zzml();
    }
}
