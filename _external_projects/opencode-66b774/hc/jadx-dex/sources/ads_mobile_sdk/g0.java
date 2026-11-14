package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class g0 extends ads_mobile_sdk.c61 implements android.app.Application.ActivityLifecycleCallbacks {
    public final android.app.Application c;
    public final java.lang.ref.WeakReference d;
    public final dev.epro.r0.W5797197595347441198 e;
    public final ads_mobile_sdk.jr0 f;
    public final dev.epro.r0.O16637889491137121389 g;
    public final java.util.LinkedHashSet h;
    public final java.util.LinkedHashSet i;
    public int j;
    public android.app.Activity k;
    public boolean l;
    public dev.epro.r0.X7175349259954592591 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(android.content.Context context, android.app.Application application, java.lang.ref.WeakReference weakReference, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.jr0 jr0Var, dev.epro.r0.O16637889491137121389 o16637889491137121389) {
        super(ads_mobile_sdk.wv0.CUI_NAME_SDKINIT_ACTIVITY_TRACKER, 2);
        context.getClass();
        application.getClass();
        weakReference.getClass();
        w5797197595347441198.getClass();
        jr0Var.getClass();
        o16637889491137121389.getClass();
        this.c = application;
        this.d = weakReference;
        this.e = w5797197595347441198;
        this.f = jr0Var;
        this.g = o16637889491137121389;
        this.h = new java.util.LinkedHashSet();
        this.i = new java.util.LinkedHashSet();
        this.j = 1;
        this.f39o = dev.epro.r0.E7125458317232359087.d(context);
    }

    public final void a(dev.epro.r0.F4096073349764486348 f4096073349764486348) {
        synchronized (this) {
            java.util.Iterator it = dev.epro.r0.R9411874267597469228.d1(this.i).iterator();
            while (it.hasNext()) {
                ads_mobile_sdk.uo uoVar = (ads_mobile_sdk.uo) ((java.lang.ref.WeakReference) it.next()).get();
                if (uoVar != null) {
                    try {
                        f4096073349764486348.invoke(uoVar);
                    } catch (java.lang.Exception e) {
                        ads_mobile_sdk.xv.c("Failed to dispatch Activity lifecycle event", e);
                    }
                }
            }
            java.util.Iterator it2 = this.i.iterator();
            while (it2.hasNext()) {
                java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it2.next();
                weakReference.getClass();
                if (weakReference.get() == null) {
                    it2.remove();
                }
            }
        }
    }

    public final void a$1(android.app.Activity activity, int i) {
        if (i == 0) {
            throw null;
        }
        synchronized (this) {
            try {
                if (activity.equals(this.k)) {
                    this.j = i;
                } else {
                    if (dev.epro.r0.X2485016533998461232.d(i) < dev.epro.r0.X2485016533998461232.d(this.j)) {
                        return;
                    }
                    this.k = activity;
                    this.j = i;
                }
                if (i == 7) {
                    this.l = false;
                    synchronized (this) {
                        boolean z = this.f39o;
                        if (z) {
                            this.f39o = false;
                            dev.epro.r0.X7175349259954592591 x7175349259954592591 = this.m;
                            if (x7175349259954592591 != null) {
                                x7175349259954592591.c((java.util.concurrent.CancellationException) null);
                            }
                            this.m = null;
                            this.n = true;
                            dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
                            this.g.getClass();
                            long jA0 = dev.epro.r0.M9216324016624295870.a0(android.os.SystemClock.elapsedRealtime(), dev.epro.r0.N13798149404328803870.d);
                            for (dev.epro.r0.B8669154544800329371 b8669154544800329371 : this.h) {
                                dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.e;
                                ads_mobile_sdk.v vVar = new ads_mobile_sdk.v(b8669154544800329371, jA0, null, (byte) 0);
                                dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
                                w5797197595347441198.getClass();
                                dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(vVar, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                            }
                        }
                    }
                } else if (i == 2) {
                    this.l = true;
                    dev.epro.r0.W5797197595347441198 w57971975953474411982 = this.e;
                    dev.epro.r0.N4024785987441166868 n4024785987441166868 = new dev.epro.r0.N4024785987441166868(this, (dev.epro.r0.R4833348786910499294) null, (byte) 27);
                    dev.epro.r0.I3826119971291161142 i38261199712911611422 = dev.epro.r0.I3826119971291161142.a;
                    w57971975953474411982.getClass();
                    this.m = dev.epro.r0.R7033599853981556291.E(w57971975953474411982, i38261199712911611422, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(n4024785987441166868, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final android.app.Activity b() {
        android.app.Activity activity;
        synchronized (this) {
            activity = this.k;
        }
        return activity;
    }

    @Override // ads_mobile_sdk.c61
    public final java.lang.Object h(dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        boolean z;
        dev.epro.r0.O9245300239821758723 o9245300239821758723;
        synchronized (this) {
            android.content.Context context = (android.content.Context) this.d.get();
            if (context != null && (context instanceof android.app.Activity)) {
                this.k = (android.app.Activity) context;
                this.j = 5;
            }
        }
        this.c.registerActivityLifecycleCallbacks(this);
        synchronized (this) {
            z = this.f39o;
        }
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        this.g.getClass();
        long jA0 = dev.epro.r0.M9216324016624295870.a0(android.os.SystemClock.elapsedRealtime(), dev.epro.r0.N13798149404328803870.d);
        synchronized (this) {
            try {
                java.util.Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    ads_mobile_sdk.zi3.a(this.e, (dev.epro.r0.L12639328004344855510) new dev.epro.r0.P12000499401830314897(z, (dev.epro.r0.B8669154544800329371) it.next(), jA0, (dev.epro.r0.R4833348786910499294) null, (byte) 1));
                }
                o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return new ads_mobile_sdk.xu0(o9245300239821758723);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        activity.getClass();
        a$1(activity, 4);
        a(new ads_mobile_sdk.y(activity, bundle, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        activity.getClass();
        synchronized (this) {
            if (activity.equals(this.k)) {
                this.k = null;
                this.j = 1;
            }
        }
        a(new ads_mobile_sdk.z(activity, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        activity.getClass();
        a$1(activity, 3);
        a(new ads_mobile_sdk.z(activity, (byte) 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        activity.getClass();
        a$1(activity, 7);
        a(new ads_mobile_sdk.z(activity, (byte) 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        a(new ads_mobile_sdk.y(activity, bundle, (byte) 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        activity.getClass();
        a$1(activity, 6);
        a(new ads_mobile_sdk.z(activity, (byte) 3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        activity.getClass();
        a$1(activity, 2);
        a(new ads_mobile_sdk.z(activity, (byte) 4));
    }

    public final void a(dev.epro.r0.B8669154544800329371 b8669154544800329371) {
        b8669154544800329371.getClass();
        synchronized (this) {
            this.h.remove(b8669154544800329371);
        }
    }
}
