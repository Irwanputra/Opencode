package p131.p161.p162.p193.p194.p199.p200;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.zzaj;
import com.google.android.gms.ads.internal.js.zzc;
import com.google.android.gms.ads.internal.js.zzn;
import com.google.android.gms.internal.zzajj;
import com.google.android.gms.internal.zzakb;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〺つふすそ.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2371 implements zzt<zzaj> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzajj f9673;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ RunnableC2368 f9674;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzc f9675;

    public C2371(RunnableC2368 runnableC2368, zzc zzcVar, zzajj zzajjVar) {
        this.f9674 = runnableC2368;
        this.f9675 = zzcVar;
        this.f9673 = zzajjVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzaj zzajVar, Map map) {
        synchronized (this.f9674.f9671.f2629) {
            zzakb.zzct("JS Engine is requesting an update");
            if (this.f9674.f9671.f2625 == 0) {
                zzakb.zzct("Starting reload.");
                RunnableC2368 runnableC2368 = this.f9674;
                zzn zznVar = runnableC2368.f9671;
                zznVar.f2625 = 2;
                zznVar.m1212(runnableC2368.f9669);
            }
            this.f9675.zzb("/requestReload", (zzt<? super zzaj>) this.f9673.get());
        }
    }
}
