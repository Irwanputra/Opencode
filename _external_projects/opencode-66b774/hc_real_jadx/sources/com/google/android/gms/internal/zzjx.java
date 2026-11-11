package com.google.android.gms.internal;

import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.internal.zzjr;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjx extends zzjr.zza<zzpu> {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzjr zzbfc;
    private /* synthetic */ FrameLayout zzbfd;
    private /* synthetic */ FrameLayout zzbfe;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjx(zzjr zzjrVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        super();
        this.zzbfc = zzjrVar;
        this.zzbfd = frameLayout;
        this.zzbfe = frameLayout2;
        this.val$context = context;
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final zzpu zza(zzla zzlaVar) {
        return zzlaVar.createNativeAdViewDelegate(new BinderC2454(this.zzbfd), new BinderC2454(this.zzbfe));
    }

    @Override // com.google.android.gms.internal.zzjr.zza
    public final /* synthetic */ zzpu zzhw() {
        zzri zzriVar;
        zzriVar = this.zzbfc.zzbev;
        zzpu zzb = zzriVar.zzb(this.val$context, this.zzbfd, this.zzbfe);
        if (zzb != null) {
            return zzb;
        }
        zzjr zzjrVar = this.zzbfc;
        zzjr.zza(this.val$context, "native_ad_view_delegate");
        return new zzmj();
    }
}
