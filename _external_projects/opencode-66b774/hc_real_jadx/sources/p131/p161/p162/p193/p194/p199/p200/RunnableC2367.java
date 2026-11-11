package p131.p161.p162.p193.p194.p199.p200;

import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzahn;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.〺つふすそ.ぉざぅち〻, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class RunnableC2367 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ C2366 f9668;

    public RunnableC2367(C2366 c2366) {
        this.f9668 = c2366;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9668.f9666.f9671.f2629) {
            if (this.f9668.f9666.f9670.getStatus() != -1 && this.f9668.f9666.f9670.getStatus() != 1) {
                this.f9668.f9666.f9670.reject();
                zzbs.zzei();
                zzahn.runOnUiThread(new RunnableC2373(this));
                zzagf.v("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
