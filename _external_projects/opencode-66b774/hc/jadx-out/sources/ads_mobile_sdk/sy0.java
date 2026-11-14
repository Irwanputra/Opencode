package ads_mobile_sdk;

import dev.epro.r0.A18119328133183277592;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.L17551298460506453774;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class sy0 {
    public final W5797197595347441198 a;
    public final tx0 b;
    public final A18119328133183277592 e;
    public final Object f;
    public float h;
    public int i;
    public boolean k;
    public boolean m;

    public sy0(tx0 tx0Var, W5797197595347441198 w5797197595347441198) {
        w5797197595347441198.getClass();
        tx0Var.getClass();
        this.a = w5797197595347441198;
        this.b = tx0Var;
        this.e = new A18119328133183277592();
        this.f = new Object();
        this.i = 1;
        this.m = true;
    }

    public final Object a(L17551298460506453774 l17551298460506453774, K14749510448791472029 k14749510448791472029) {
        O9245300239821758723 o9245300239821758723;
        synchronized (this.f) {
            boolean z = l17551298460506453774.b;
            o9245300239821758723 = O9245300239821758723.a;
        }
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.t("muteStart", l17551298460506453774.a ? "1" : "0");
        i16631908410500040363.t("customControlsRequested", l17551298460506453774.b ? "1" : "0");
        i16631908410500040363.t("clickToExpandRequested", l17551298460506453774.c ? "1" : "0");
        i16631908410500040363.t("action", "initialState");
        Object objA = this.b.a(i16631908410500040363, "pubVideoCmd", k14749510448791472029);
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (objA != z3437138737604933638) {
            objA = o9245300239821758723;
        }
        return objA == z3437138737604933638 ? objA : o9245300239821758723;
    }

    public final void getVideoLifecycleCallbacks() {
        synchronized (this.f) {
        }
    }

    public final void a(float f, int i, boolean z) {
        boolean z2;
        if (i != 0) {
            synchronized (this.f) {
                try {
                    synchronized (this.f) {
                        z2 = this.m;
                    }
                    synchronized (this.f) {
                        this.m = z;
                    }
                    int i2 = this.i;
                    this.i = i;
                    float f2 = this.h;
                    this.h = f;
                    if (Math.abs(f - f2) > 1.0E-4f) {
                        this.b.invalidate();
                    }
                    R7033599853981556291.E(this.a, null, null, new ny0(this, i2, i, z2, z, null), 3);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw null;
    }
}
