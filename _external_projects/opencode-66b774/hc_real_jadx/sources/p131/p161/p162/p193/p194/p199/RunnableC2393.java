package p131.p161.p162.p193.p194.p199;

import com.google.android.gms.ads.internal.zzaw;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzahn;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ぇぬぎばつ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2393 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Runnable f9716;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ zzaw f9717;

    public RunnableC2393(zzaw zzawVar, Runnable runnable) {
        this.f9717 = zzawVar;
        this.f9716 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbs.zzei();
        zzahn.runOnUiThread(new RunnableC2396(this));
    }
}
