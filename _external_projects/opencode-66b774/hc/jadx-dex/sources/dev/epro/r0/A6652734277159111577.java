package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A6652734277159111577 implements android.app.Application.ActivityLifecycleCallbacks {
    public java.lang.Object a;
    public android.app.Activity b;
    public final int c;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;

    public A6652734277159111577(android.app.Activity activity) {
        this.b = activity;
        this.c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        if (this.b == activity) {
            this.b = null;
            this.e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        if (!this.e || this.f || this.d) {
            return;
        }
        java.lang.Object obj = this.a;
        try {
            java.lang.Object obj2 = dev.epro.r0.N6190736363796470908.c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.c) {
                dev.epro.r0.N6190736363796470908.g.postAtFrontOfQueue(new dev.epro.r0.I3863025946240164840(dev.epro.r0.N6190736363796470908.b.get(activity), obj2, (byte) 4));
                this.f = true;
                this.a = null;
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        if (this.b == activity) {
            this.d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }
}
