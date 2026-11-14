package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class zj implements android.app.Application.ActivityLifecycleCallbacks {
    public boolean a;
    public boolean b;
    public dev.epro.r0.Q16850748603044648552 c;

    public final boolean a() {
        android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new android.app.ActivityManager.RunningAppProcessInfo();
        android.app.ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || b();
    }

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        if (!this.b) {
            this.b = true;
            if (this.a) {
                a(true);
                dev.epro.r0.Q16850748603044648552 q16850748603044648552 = this.c;
                if (q16850748603044648552 != null) {
                    q16850748603044648552.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        boolean zA = a();
        if (this.b != zA) {
            this.b = zA;
            if (this.a) {
                a(zA);
                dev.epro.r0.Q16850748603044648552 q16850748603044648552 = this.c;
                if (q16850748603044648552 != null) {
                    q16850748603044648552.a(zA);
                }
            }
        }
    }

    public void a(boolean z) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
