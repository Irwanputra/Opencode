package p034.p035.p041;

import android.app.Application;
import p034.p035.p041.C1047;

/* renamed from: づざかべべ.〳ぜぞぜべっ.づざかべべ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class RunnableC1042 implements Runnable {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ Application f5471;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C1047.C1048 f5472;

    public RunnableC1042(Application application, C1047.C1048 c1048) {
        this.f5471 = application;
        this.f5472 = c1048;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5471.unregisterActivityLifecycleCallbacks(this.f5472);
    }
}
