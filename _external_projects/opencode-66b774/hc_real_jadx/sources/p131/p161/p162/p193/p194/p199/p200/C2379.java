package p131.p161.p162.p193.p194.p199.p200;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.ads.internal.js.zzaj;
import com.google.android.gms.ads.internal.js.zzc;
import com.google.android.gms.ads.internal.js.zzn;
import com.google.android.gms.internal.zzagf;
import java.util.Map;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〺つふすそ.は〲ぱなで, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2379 implements zzt<zzaj> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ RunnableC2368 f9685;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzc f9686;

    public C2379(RunnableC2368 runnableC2368, zzc zzcVar) {
        this.f9685 = runnableC2368;
        this.f9686 = zzcVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzaj zzajVar, Map map) {
        synchronized (this.f9685.f9671.f2629) {
            if (this.f9685.f9670.getStatus() != -1 && this.f9685.f9670.getStatus() != 1) {
                zzn zznVar = this.f9685.f9671;
                zznVar.f2625 = 0;
                zznVar.f2630.zzf(this.f9686);
                this.f9685.f9670.zzk(this.f9686);
                RunnableC2368 runnableC2368 = this.f9685;
                runnableC2368.f9671.f2627 = runnableC2368.f9670;
                zzagf.v("Successfully loaded JS Engine.");
            }
        }
    }
}
