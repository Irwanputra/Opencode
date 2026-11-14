package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class th3 implements java.io.Closeable {
    public ads_mobile_sdk.mi3 a;
    public final ads_mobile_sdk.th3 b;
    public final long c;
    public final java.util.concurrent.atomic.AtomicBoolean d;
    public final java.util.concurrent.atomic.AtomicLong e;
    public final java.util.concurrent.atomic.AtomicLong f;

    public th3(ads_mobile_sdk.wv0 wv0Var, ads_mobile_sdk.mi3 mi3Var, java.util.UUID uuid, ads_mobile_sdk.th3 th3Var, long j) {
        wv0Var.getClass();
        mi3Var.getClass();
        this.a = mi3Var;
        this.b = th3Var;
        this.c = j;
        this.d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.e = new java.util.concurrent.atomic.AtomicLong();
        this.f = new java.util.concurrent.atomic.AtomicLong();
        wv0Var.name();
    }

    public abstract ads_mobile_sdk.th3 a(ads_mobile_sdk.wv0 wv0Var, java.util.List list, boolean z);

    public final void a(java.lang.Throwable th) {
        th.getClass();
        if (!this.d.get()) {
            e().m = false;
            e().f18o = th;
            return;
        }
        ads_mobile_sdk.xv.a("This trace " + e().c.name() + " has already finished, can't set causing exception");
    }

    public void a$1() {
        if (this.d.getAndSet(true)) {
            ads_mobile_sdk.xv.a("This trace " + e().c.name() + " has already finished, can't finish again");
            return;
        }
        ads_mobile_sdk.cc2 cc2VarE = e();
        dev.epro.r0.E17149812035295265804 e17149812035295265804 = dev.epro.r0.E17093345031926825464.b;
        long j = this.e.get();
        dev.epro.r0.N13798149404328803870 n13798149404328803870 = dev.epro.r0.N13798149404328803870.d;
        cc2VarE.q = dev.epro.r0.M9216324016624295870.a0(j, n13798149404328803870);
        e().r = dev.epro.r0.M9216324016624295870.a0(this.f.get(), n13798149404328803870);
        ads_mobile_sdk.th3 th3Var = this.b;
        if (th3Var != null) {
            th3Var.f.addAndGet(dev.epro.r0.E17093345031926825464.e(dev.epro.r0.E17093345031926825464.h(e().q, e().r)));
        }
        h();
        ads_mobile_sdk.cc2 cc2VarE2 = e();
        ads_mobile_sdk.mi3 mi3Var = this.a;
        cc2VarE2.getClass();
        mi3Var.getClass();
        cc2VarE2.c.name();
        dev.epro.r0.E17093345031926825464.e(cc2VarE2.p);
    }

    public final void b(java.lang.Throwable th) {
        th.getClass();
        if (!this.d.get()) {
            e().m = false;
            e().n = th;
            return;
        }
        ads_mobile_sdk.xv.a("This trace " + e().c.name() + " has already finished, can't set exception");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ads_mobile_sdk.cc2 cc2VarE;
        ads_mobile_sdk.wv0 wv0Var;
        ads_mobile_sdk.ii3 ii3VarB = ads_mobile_sdk.ji3.b();
        ads_mobile_sdk.th3 th3Var = ii3VarB.a;
        if (th3Var == null) {
            ads_mobile_sdk.xv.a("Tried to end trace " + e().c.name() + " (" + e().a + "), but there was no active trace. If this is a test, did you forget to add a TraceThreadContextElement to your CoroutineScope?");
        }
        if (this != th3Var) {
            java.lang.String strName = e().c.name();
            int i = e().a;
            java.lang.String strName2 = (th3Var == null || (cc2VarE = th3Var.e()) == null || (wv0Var = cc2VarE.c) == null) ? null : wv0Var.name();
            java.lang.Integer numValueOf = th3Var != null ? java.lang.Integer.valueOf(th3Var.e().a) : null;
            java.lang.StringBuilder sbX = dev.epro.r0.G6547577305291411977.x(i, "Tried to end trace ", strName, " (", "), but that trace is not the current trace. The current trace is ");
            sbX.append(strName2);
            sbX.append(" (");
            sbX.append(numValueOf);
            sbX.append(").");
            ads_mobile_sdk.xv.a(sbX.toString());
        }
        ads_mobile_sdk.ji3.a(ii3VarB, th3Var != null ? th3Var.b : null);
        a$1();
    }

    public abstract ads_mobile_sdk.cc2 e();

    public abstract void h();
}
