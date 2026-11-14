package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A11487039563529977057 extends T7441316690157960089 implements L12639328004344855510 {
    public final /* synthetic */ C13932356399610645840 A;
    public C13932356399610645840 t;
    public R3525026539981983083 u;
    public long[] v;
    public int w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ R3525026539981983083 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A11487039563529977057(R3525026539981983083 r3525026539981983083, C13932356399610645840 c13932356399610645840, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.z = r3525026539981983083;
        this.A = c13932356399610645840;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        A11487039563529977057 a11487039563529977057 = new A11487039563529977057(this.z, this.A, r4833348786910499294);
        a11487039563529977057.y = obj;
        return a11487039563529977057;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((A11487039563529977057) create((R4833348786910499294) obj2, (N3180492300688416475) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        N3180492300688416475 n3180492300688416475;
        R3525026539981983083 r3525026539981983083;
        long[] jArr;
        int i;
        C13932356399610645840 c13932356399610645840;
        boolean z = this.x;
        if (!z) {
            E17665849472693074628.k(obj);
            n3180492300688416475 = (N3180492300688416475) this.y;
            r3525026539981983083 = this.z;
            K18075763046227786881 k18075763046227786881 = r3525026539981983083.b;
            jArr = k18075763046227786881.c;
            i = k18075763046227786881.e;
            c13932356399610645840 = this.A;
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.w;
            jArr = this.v;
            r3525026539981983083 = this.u;
            c13932356399610645840 = this.t;
            n3180492300688416475 = (N3180492300688416475) this.y;
            E17665849472693074628.k(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return O9245300239821758723.a;
        }
        int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
        c13932356399610645840.b = i;
        Object obj2 = r3525026539981983083.b.b[i];
        this.y = n3180492300688416475;
        this.t = c13932356399610645840;
        this.u = r3525026539981983083;
        this.v = jArr;
        this.w = i2;
        this.x = true;
        n3180492300688416475.c(this, obj2);
        return Z3437138737604933638.a;
    }
}
