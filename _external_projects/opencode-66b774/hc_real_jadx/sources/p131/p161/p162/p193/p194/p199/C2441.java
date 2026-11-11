package p131.p161.p162.p193.p194.p199;

import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzanh;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.のぷのちつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2441 implements zzt<zzanh> {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public /* synthetic */ CountDownLatch f9785;

    public C2441(CountDownLatch countDownLatch) {
        this.f9785 = countDownLatch;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzanh zzanhVar, Map map) {
        zzanh zzanhVar2 = zzanhVar;
        this.f9785.countDown();
        zzanhVar2.getClass();
        ((View) zzanhVar2).setVisibility(0);
    }
}
