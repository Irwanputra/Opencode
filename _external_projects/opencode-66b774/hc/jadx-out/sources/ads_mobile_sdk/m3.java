package ads_mobile_sdk;

import dev.epro.r0.G16660188620551127941;
import dev.epro.r0.K3711868874634114208;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.V2597580950516131749;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class m3 implements K3711868874634114208 {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public m3(r80 r80Var) {
        this.b = this;
        this.a = r80Var;
        gj0 gj0Var = new gj0(G16660188620551127941.g);
        hb1 hb1Var = r80Var.b;
        hb1 hb1Var2 = r80Var.d;
        V2597580950516131749 v2597580950516131749 = r80Var.B;
        V2597580950516131749 v25975809505161317492 = r80Var.D;
        V2597580950516131749 v25975809505161317493 = r80Var.s;
        hb1 hb1Var3 = r80Var.j;
        gj0 gj0Var2 = new gj0(new dv2(hb1Var, hb1Var2, v2597580950516131749, (V2597580950516131749) gj0Var, v25975809505161317492, v25975809505161317493, hb1Var3));
        this.c = gj0Var2;
        this.d = new gj0(new dv2(hb1Var2, (V2597580950516131749) gj0Var2, v2597580950516131749, r80Var.A, (V2597580950516131749) new gj0(M9216324016624295870.p), new v80(this), hb1Var3));
    }

    @Override // dev.epro.r0.K3711868874634114208
    public Object b(R4833348786910499294 r4833348786910499294) {
        qw2 qw2Var = (qw2) this.b;
        xj xjVar = (xj) this.a;
        if (((AtomicBoolean) this.c).getAndSet(false)) {
            xjVar.getClass();
            qw2Var.getClass();
            AtomicInteger atomicInteger = (AtomicInteger) xjVar.d.get(qw2Var);
            if (atomicInteger != null) {
                atomicInteger.decrementAndGet();
            }
        }
        if (((AtomicBoolean) this.d).getAndSet(false)) {
            xjVar.getClass();
            qw2Var.getClass();
            AtomicInteger atomicInteger2 = (AtomicInteger) xjVar.e.get(qw2Var);
            if (atomicInteger2 != null) {
                atomicInteger2.decrementAndGet();
            }
        }
        return O9245300239821758723.a;
    }

    public m3(xj xjVar, qw2 qw2Var, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        xjVar.getClass();
        qw2Var.getClass();
        this.a = xjVar;
        this.b = qw2Var;
        this.c = atomicBoolean;
        this.d = atomicBoolean2;
    }
}
