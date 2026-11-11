package p131.p161.p162.p193.p194.p199.p200;

import com.google.android.gms.ads.internal.js.zzc;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzahn;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〺つふすそ.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2372 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ zzc f9676;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public /* synthetic */ RunnableC2368 f9677;

    public RunnableC2372(RunnableC2368 runnableC2368, zzc zzcVar) {
        this.f9677 = runnableC2368;
        this.f9676 = zzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9677.f9671.f2629) {
            if (this.f9677.f9670.getStatus() != -1 && this.f9677.f9670.getStatus() != 1) {
                this.f9677.f9670.reject();
                zzbs.zzei();
                zzahn.runOnUiThread(new RunnableC2376(this));
                zzagf.v("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
