package ads_mobile_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import dev.epro.r0.B8669154544800329371;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.E7125458317232359087;
import dev.epro.r0.F4096073349764486348;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P12000499401830314897;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.R9411874267597469228;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X2485016533998461232;
import dev.epro.r0.X7175349259954592591;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class g0 extends c61 implements Application.ActivityLifecycleCallbacks {
    public final Application c;
    public final WeakReference d;
    public final W5797197595347441198 e;
    public final jr0 f;
    public final O16637889491137121389 g;
    public final LinkedHashSet h;
    public final LinkedHashSet i;
    public int j;
    public Activity k;
    public boolean l;
    public X7175349259954592591 m;
    public boolean n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f39o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, Application application, WeakReference weakReference, W5797197595347441198 w5797197595347441198, jr0 jr0Var, O16637889491137121389 o16637889491137121389) {
        super(wv0.CUI_NAME_SDKINIT_ACTIVITY_TRACKER, 2);
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
        this.h = new LinkedHashSet();
        this.i = new LinkedHashSet();
        this.j = 1;
        this.f39o = E7125458317232359087.d(context);
    }

    public final void a(F4096073349764486348 f4096073349764486348) {
        synchronized (this) {
            Iterator it = R9411874267597469228.d1(this.i).iterator();
            while (it.hasNext()) {
                uo uoVar = (uo) ((WeakReference) it.next()).get();
                if (uoVar != null) {
                    try {
                        f4096073349764486348.invoke(uoVar);
                    } catch (Exception e) {
                        xv.c("Failed to dispatch Activity lifecycle event", e);
                    }
                }
            }
            Iterator it2 = this.i.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                weakReference.getClass();
                if (weakReference.get() == null) {
                    it2.remove();
                }
            }
        }
    }

    public final void a$1(Activity activity, int i) {
        R4833348786910499294 r4833348786910499294 = null;
        if (i == 0) {
            throw null;
        }
        synchronized (this) {
            try {
                if (activity.equals(this.k)) {
                    this.j = i;
                } else {
                    if (X2485016533998461232.d(i) < X2485016533998461232.d(this.j)) {
                        return;
                    }
                    this.k = activity;
                    this.j = i;
                }
                byte b = 1;
                if (i == 7) {
                    this.l = false;
                    synchronized (this) {
                        boolean z = this.f39o;
                        if (z) {
                            this.f39o = false;
                            X7175349259954592591 x7175349259954592591 = this.m;
                            if (x7175349259954592591 != null) {
                                x7175349259954592591.c(null);
                            }
                            this.m = null;
                            this.n = true;
                            E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                            this.g.getClass();
                            long a0 = M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS);
                            for (B8669154544800329371 b8669154544800329371 : this.h) {
                                W5797197595347441198 w5797197595347441198 = this.e;
                                v vVar = new v(b8669154544800329371, a0, r4833348786910499294, (byte) 0);
                                I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
                                w5797197595347441198.getClass();
                                R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(vVar, r4833348786910499294, b), 2);
                            }
                        }
                    }
                } else if (i == 2) {
                    this.l = true;
                    W5797197595347441198 w57971975953474411982 = this.e;
                    N4024785987441166868 n4024785987441166868 = new N4024785987441166868(this, r4833348786910499294, (byte) 27);
                    I3826119971291161142 i38261199712911611422 = I3826119971291161142.a;
                    w57971975953474411982.getClass();
                    this.m = R7033599853981556291.E(w57971975953474411982, i38261199712911611422, null, new P7598478828797568949(n4024785987441166868, r4833348786910499294, b), 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Activity b() {
        Activity activity;
        synchronized (this) {
            activity = this.k;
        }
        return activity;
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        boolean z;
        O9245300239821758723 o9245300239821758723;
        synchronized (this) {
            Context context = (Context) this.d.get();
            if (context != null && (context instanceof Activity)) {
                this.k = (Activity) context;
                this.j = 5;
            }
        }
        this.c.registerActivityLifecycleCallbacks(this);
        synchronized (this) {
            z = this.f39o;
        }
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        this.g.getClass();
        long a0 = M9216324016624295870.a0(SystemClock.elapsedRealtime(), N13798149404328803870.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator it = this.h.iterator();
                while (it.hasNext()) {
                    zi3.a(this.e, new P12000499401830314897(z, (B8669154544800329371) it.next(), a0, null, (byte) 1));
                }
                o9245300239821758723 = O9245300239821758723.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new xu0(o9245300239821758723);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        a$1(activity, 4);
        a(new y(activity, bundle, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        synchronized (this) {
            if (activity.equals(this.k)) {
                this.k = null;
                this.j = 1;
            }
        }
        a(new z(activity, (byte) 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        activity.getClass();
        a$1(activity, 3);
        a(new z(activity, (byte) 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        a$1(activity, 7);
        a(new z(activity, (byte) 2));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getClass();
        bundle.getClass();
        a(new y(activity, bundle, (byte) 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        activity.getClass();
        a$1(activity, 6);
        a(new z(activity, (byte) 3));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        activity.getClass();
        a$1(activity, 2);
        a(new z(activity, (byte) 4));
    }

    public final void a(B8669154544800329371 b8669154544800329371) {
        b8669154544800329371.getClass();
        synchronized (this) {
            this.h.remove(b8669154544800329371);
        }
    }
}
