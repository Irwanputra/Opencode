package ads_mobile_sdk;

import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import java.io.Closeable;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class th3 implements Closeable {
    public mi3 a;
    public final th3 b;
    public final long c;
    public final AtomicBoolean d;
    public final AtomicLong e;
    public final AtomicLong f;

    public th3(wv0 wv0Var, mi3 mi3Var, UUID uuid, th3 th3Var, long j) {
        wv0Var.getClass();
        mi3Var.getClass();
        this.a = mi3Var;
        this.b = th3Var;
        this.c = j;
        this.d = new AtomicBoolean(false);
        this.e = new AtomicLong();
        this.f = new AtomicLong();
        wv0Var.name();
    }

    public abstract th3 a(wv0 wv0Var, List list, boolean z);

    public final void a(Throwable th) {
        th.getClass();
        if (!this.d.get()) {
            e().m = false;
            e().f18o = th;
            return;
        }
        xv.a("This trace " + e().c.name() + " has already finished, can't set causing exception");
    }

    public void a$1() {
        if (this.d.getAndSet(true)) {
            xv.a("This trace " + e().c.name() + " has already finished, can't finish again");
            return;
        }
        cc2 cc2VarE = e();
        E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
        long j = this.e.get();
        N13798149404328803870 n13798149404328803870 = N13798149404328803870.MILLISECONDS;
        cc2VarE.q = M9216324016624295870.a0(j, n13798149404328803870);
        e().r = M9216324016624295870.a0(this.f.get(), n13798149404328803870);
        th3 th3Var = this.b;
        if (th3Var != null) {
            th3Var.f.addAndGet(E17093345031926825464.e(E17093345031926825464.h(e().q, e().r)));
        }
        h();
        cc2 cc2VarE2 = e();
        mi3 mi3Var = this.a;
        cc2VarE2.getClass();
        mi3Var.getClass();
        cc2VarE2.c.name();
        E17093345031926825464.e(cc2VarE2.p);
    }

    public final void b(Throwable th) {
        th.getClass();
        if (!this.d.get()) {
            e().m = false;
            e().n = th;
            return;
        }
        xv.a("This trace " + e().c.name() + " has already finished, can't set exception");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cc2 cc2VarE;
        wv0 wv0Var;
        ii3 ii3VarB = ji3.b();
        th3 th3Var = ii3VarB.a;
        if (th3Var == null) {
            xv.a("Tried to end trace " + e().c.name() + " (" + e().a + "), but there was no active trace. If this is a test, did you forget to add a TraceThreadContextElement to your CoroutineScope?");
        }
        if (this != th3Var) {
            String strName = e().c.name();
            int i = e().a;
            String strName2 = (th3Var == null || (cc2VarE = th3Var.e()) == null || (wv0Var = cc2VarE.c) == null) ? null : wv0Var.name();
            Integer numValueOf = th3Var != null ? Integer.valueOf(th3Var.e().a) : null;
            StringBuilder sbX = G6547577305291411977.x(i, "Tried to end trace ", strName, " (", "), but that trace is not the current trace. The current trace is ");
            sbX.append(strName2);
            sbX.append(" (");
            sbX.append(numValueOf);
            sbX.append(").");
            xv.a(sbX.toString());
        }
        ji3.a(ii3VarB, th3Var != null ? th3Var.b : null);
        a$1();
    }

    public abstract cc2 e();

    public abstract void h();
}
