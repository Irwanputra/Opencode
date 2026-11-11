package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.internal.zzjr;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzka extends zzjr.zza<zzxe> {
    private /* synthetic */ Activity val$activity;
    private /* synthetic */ zzjr zzbfc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzka(zzjr zzjrVar, Activity activity) {
        super();
        this.zzbfc = zzjrVar;
        this.val$activity = activity;
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final zzxe zza(zzla zzlaVar) {
        return zzlaVar.createAdOverlay(new BinderC2454(this.val$activity));
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final /* synthetic */ zzxe zzhw() {
        zzxd zzxdVar;
        zzxdVar = this.zzbfc.zzbex;
        zzxe zze = zzxdVar.zze(this.val$activity);
        if (zze != null) {
            return zze;
        }
        zzjr zzjrVar = this.zzbfc;
        zzjr.zza(this.val$activity, "ad_overlay");
        return null;
    }
}
