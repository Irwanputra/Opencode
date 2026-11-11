package p131.p161.p162.p193.p194.p199.p200;

import com.google.android.gms.ads.internal.js.zzae;
import com.google.android.gms.ads.internal.js.zzn;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzali;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〺つふすそ.〻ぞまぎな〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2363 implements zzali {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public /* synthetic */ zzn f9660;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ zzae f9661;

    public C2363(zzn zznVar, zzae zzaeVar) {
        this.f9660 = zznVar;
        this.f9661 = zzaeVar;
    }

    @Override // com.google.android.gms.internal.zzali
    public final void run() {
        synchronized (this.f9660.f2629) {
            this.f9660.f2625 = 1;
            zzagf.v("Failed loading new engine. Marking new engine destroyable.");
            this.f9661.zzlr();
        }
    }
}
