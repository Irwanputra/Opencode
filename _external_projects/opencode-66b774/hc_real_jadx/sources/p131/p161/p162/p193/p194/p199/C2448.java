package p131.p161.p162.p193.p194.p199;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2448 implements zzt<zzanh> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ CountDownLatch f9796;

    public C2448(CountDownLatch countDownLatch) {
        this.f9796 = countDownLatch;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzanh zzanhVar, Map map) {
        zzakb.zzcu("Adapter returned an ad, but assets substitution failed");
        this.f9796.countDown();
        zzanhVar.destroy();
    }
}
