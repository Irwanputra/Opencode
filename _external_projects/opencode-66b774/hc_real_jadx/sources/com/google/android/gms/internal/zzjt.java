package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.internal.zzjr;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjt extends zzjr.zza<zzks> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzjn zzbez;
    private /* synthetic */ String zzbfa;
    private /* synthetic */ zzjr zzbfc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjt(zzjr zzjrVar, Context context, zzjn zzjnVar, String str) {
        super();
        this.zzbfc = zzjrVar;
        this.val$context = context;
        this.zzbez = zzjnVar;
        this.zzbfa = str;
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final zzks zza(zzla zzlaVar) {
        return zzlaVar.createSearchAdManager(new BinderC2454(this.val$context), this.zzbez, this.zzbfa, 11910000);
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final /* synthetic */ zzks zzhw() {
        zzji zzjiVar;
        zzjiVar = this.zzbfc.zzbes;
        zzks zza = zzjiVar.zza(this.val$context, this.zzbez, this.zzbfa, null, 3);
        if (zza != null) {
            return zza;
        }
        zzjr zzjrVar = this.zzbfc;
        zzjr.zza(this.val$context, "search");
        return new zzmg();
    }
}
