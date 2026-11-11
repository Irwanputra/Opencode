package p131.p161.p162.p193.p194.p199.p200;

import com.google.android.gms.ads.internal.js.zzae;
import com.google.android.gms.ads.internal.js.zzc;
import com.google.android.gms.ads.internal.js.zzn;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzalk;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〺つふすそ.ぶでにく〼〳, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2381 implements zzalk<zzc> {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzn f9688;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzae f9689;

    public C2381(zzn zznVar, zzae zzaeVar) {
        this.f9688 = zznVar;
        this.f9689 = zzaeVar;
    }

    @Override // com.google.android.gms.internal.zzalk
    public final /* synthetic */ void zzf(zzc zzcVar) {
        synchronized (this.f9688.f2629) {
            zzn zznVar = this.f9688;
            zznVar.f2625 = 0;
            zzae zzaeVar = zznVar.f2627;
            if (zzaeVar != null && this.f9689 != zzaeVar) {
                zzagf.v("New JS engine is loaded, marking previous one as destroyable.");
                this.f9688.f2627.zzlr();
            }
            this.f9688.f2627 = this.f9689;
        }
    }
}
