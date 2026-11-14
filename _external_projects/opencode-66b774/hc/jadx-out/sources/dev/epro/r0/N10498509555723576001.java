package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N10498509555723576001 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean t;
    public final /* synthetic */ R8029976778412248429 u;
    public final /* synthetic */ float v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ W1972671267364756056 x;
    public final /* synthetic */ W1972671267364756056 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N10498509555723576001(R8029976778412248429 r8029976778412248429, float f, boolean z, W1972671267364756056 w1972671267364756056, W1972671267364756056 w19726712673647560562, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.u = r8029976778412248429;
        this.v = f;
        this.w = z;
        this.x = w1972671267364756056;
        this.y = w19726712673647560562;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new N10498509555723576001(this.u, this.v, this.w, this.x, this.y, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((N10498509555723576001) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            float f = S16343116836002986007.a;
            W1972671267364756056 w1972671267364756056 = this.x;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (((L2216691091636065972) w1972671267364756056.getValue()).a >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (((L2216691091636065972) w1972671267364756056.getValue()).a & 4294967295L));
            long j = ((Q2551293802323679034) this.y.getValue()).a;
            B10503278808216759809 b10503278808216759809 = new B10503278808216759809(0);
            this.t = true;
            Object objX = S16343116836002986007.x(this.u, fIntBitsToFloat, fIntBitsToFloat2, this.v, this.w, j, b10503278808216759809, this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (objX == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            E17665849472693074628.k(obj);
        }
        return O9245300239821758723.a;
    }
}
