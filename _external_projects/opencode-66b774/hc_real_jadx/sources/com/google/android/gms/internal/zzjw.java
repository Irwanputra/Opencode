package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzjr;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjw extends zzjr.zza<zzlg> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzjr zzbfc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjw(zzjr zzjrVar, Context context) {
        super();
        this.zzbfc = zzjrVar;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final zzlg zza(zzla zzlaVar) {
        return zzlaVar.getMobileAdsSettingsManagerWithClientJarVersion(new BinderC2454(this.val$context), 11910000);
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final /* synthetic */ zzlg zzhw() {
        zzmb zzmbVar;
        zzmbVar = this.zzbfc.zzbeu;
        zzlg zzg = zzmbVar.zzg(this.val$context);
        if (zzg != null) {
            return zzg;
        }
        zzjr zzjrVar = this.zzbfc;
        zzjr.zza(this.val$context, "mobile_ads_settings");
        return new zzmi();
    }
}
