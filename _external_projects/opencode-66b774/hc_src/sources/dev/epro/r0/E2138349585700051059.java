package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E2138349585700051059 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ B13729205492206812220 w;
    public final /* synthetic */ L12639328004344855510 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E2138349585700051059(B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = b13729205492206812220;
        this.x = l12639328004344855510;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                E2138349585700051059 e2138349585700051059 = new E2138349585700051059(this.w, this.x, r4833348786910499294, (byte) 0);
                e2138349585700051059.v = obj;
                return e2138349585700051059;
            default:
                E2138349585700051059 e21383495857000510592 = new E2138349585700051059(this.w, this.x, r4833348786910499294, (byte) 1);
                e21383495857000510592.v = obj;
                return e21383495857000510592;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W5797197595347441198 w5797197595347441198 = (W5797197595347441198) obj;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj2;
        switch (b) {
        }
        return ((E2138349585700051059) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L12639328004344855510 l12639328004344855510 = this.x;
        B13729205492206812220 b13729205492206812220 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.v;
                    A7209497065939201693 a7209497065939201693 = new A7209497065939201693();
                    G6219617120344415229 p = J10256772239794345968.p(b13729205492206812220);
                    R13526995929154542742 r13526995929154542742 = new R13526995929154542742(a7209497065939201693, w5797197595347441198, l12639328004344855510, (byte) 0);
                    this.u = true;
                    if (p.collect(r13526995929154542742, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    W5797197595347441198 w57971975953474411982 = (W5797197595347441198) this.v;
                    A7209497065939201693 a72094970659392016932 = new A7209497065939201693();
                    G6219617120344415229 p2 = J10256772239794345968.p(b13729205492206812220);
                    R13526995929154542742 r135269959291545427422 = new R13526995929154542742(a72094970659392016932, w57971975953474411982, l12639328004344855510, (byte) 1);
                    this.u = true;
                    if (p2.collect(r135269959291545427422, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                    break;
                }
                break;
        }
        return z3437138737604933638;
    }
}
