package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A3672266205716302703 extends dev.epro.r0.R14062301455140331524 implements dev.epro.r0.G13792465322404021864 {
    public boolean t;
    public /* synthetic */ long u;

    public final java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        long jLongValue = ((java.lang.Number) obj3).longValue();
        dev.epro.r0.A3672266205716302703 a3672266205716302703 = new dev.epro.r0.A3672266205716302703(4, (dev.epro.r0.R4833348786910499294) obj4);
        a3672266205716302703.u = jLongValue;
        return a3672266205716302703.invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z = this.t;
        if (!z) {
            dev.epro.r0.E17665849472693074628.k(obj);
            long j = this.u;
            dev.epro.r0.B14824868959299866349 b14824868959299866349N = dev.epro.r0.B14824868959299866349.n();
            int i = dev.epro.r0.H15104563917493595201.a;
            b14824868959299866349N.getClass();
            long jMin = java.lang.Math.min(j * 30000, dev.epro.r0.H15104563917493595201.a);
            this.t = true;
            java.lang.Object objI = dev.epro.r0.J8045362843799184672.I(jMin, this);
            dev.epro.r0.Z3437138737604933638 z3437138737604933638 = dev.epro.r0.Z3437138737604933638.a;
            if (objI == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dev.epro.r0.E17665849472693074628.k(obj);
        }
        return java.lang.Boolean.TRUE;
    }
}
