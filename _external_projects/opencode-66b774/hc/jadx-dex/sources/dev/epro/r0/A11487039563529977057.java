package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A11487039563529977057 extends dev.epro.r0.T7441316690157960089 implements dev.epro.r0.L12639328004344855510 {
    public final /* synthetic */ dev.epro.r0.C13932356399610645840 A;
    public dev.epro.r0.C13932356399610645840 t;
    public dev.epro.r0.R3525026539981983083 u;
    public long[] v;
    public int w;
    public boolean x;
    public /* synthetic */ java.lang.Object y;
    public final /* synthetic */ dev.epro.r0.R3525026539981983083 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A11487039563529977057(dev.epro.r0.R3525026539981983083 r3525026539981983083, dev.epro.r0.C13932356399610645840 c13932356399610645840, dev.epro.r0.R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.z = r3525026539981983083;
        this.A = c13932356399610645840;
    }

    public final dev.epro.r0.R4833348786910499294 create(dev.epro.r0.R4833348786910499294 r4833348786910499294, java.lang.Object obj) {
        dev.epro.r0.A11487039563529977057 a11487039563529977057 = new dev.epro.r0.A11487039563529977057(this.z, this.A, r4833348786910499294);
        a11487039563529977057.y = obj;
        return a11487039563529977057;
    }

    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return create((dev.epro.r0.R4833348786910499294) obj2, (dev.epro.r0.N3180492300688416475) obj).invokeSuspend(dev.epro.r0.O9245300239821758723.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        dev.epro.r0.N3180492300688416475 n3180492300688416475;
        dev.epro.r0.R3525026539981983083 r3525026539981983083;
        long[] jArr;
        int i;
        dev.epro.r0.C13932356399610645840 c13932356399610645840;
        boolean z = this.x;
        if (!z) {
            dev.epro.r0.E17665849472693074628.k(obj);
            n3180492300688416475 = (dev.epro.r0.N3180492300688416475) this.y;
            r3525026539981983083 = this.z;
            dev.epro.r0.K18075763046227786881 k18075763046227786881 = r3525026539981983083.b;
            jArr = k18075763046227786881.c;
            i = k18075763046227786881.e;
            c13932356399610645840 = this.A;
        } else {
            if (!z) {
                dev.epro.r0.S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.w;
            jArr = this.v;
            r3525026539981983083 = this.u;
            c13932356399610645840 = this.t;
            n3180492300688416475 = (dev.epro.r0.N3180492300688416475) this.y;
            dev.epro.r0.E17665849472693074628.k(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return dev.epro.r0.O9245300239821758723.a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        c13932356399610645840.b = i;
        java.lang.Object obj2 = r3525026539981983083.b.b[i];
        this.y = n3180492300688416475;
        this.t = c13932356399610645840;
        this.u = r3525026539981983083;
        this.v = jArr;
        this.w = i2;
        this.x = true;
        n3180492300688416475.c(this, obj2);
        return dev.epro.r0.Z3437138737604933638.a;
    }
}
