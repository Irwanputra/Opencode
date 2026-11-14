package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B17962603135377721399 extends R14062301455140331524 implements F4096073349764486348 {
    public byte t;
    public final /* synthetic */ P5204863746366580363 u;
    public final /* synthetic */ H10430515288632824348 v;
    public final /* synthetic */ D6414970586266598845 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B17962603135377721399(P5204863746366580363 p5204863746366580363, H10430515288632824348 h10430515288632824348, D6414970586266598845 d6414970586266598845, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.u = p5204863746366580363;
        this.v = h10430515288632824348;
        this.w = d6414970586266598845;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        H10430515288632824348 h10430515288632824348 = this.v;
        D6414970586266598845 d6414970586266598845 = this.w;
        return new B17962603135377721399(this.u, h10430515288632824348, d6414970586266598845, (R4833348786910499294) obj).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        H10430515288632824348 h10430515288632824348 = this.v;
        byte b = this.t;
        R4833348786910499294 r4833348786910499294 = null;
        D6414970586266598845 d6414970586266598845 = D6414970586266598845.c;
        D6414970586266598845 d64149705862665988452 = this.w;
        P5204863746366580363 p5204863746366580363 = this.u;
        try {
            if (b == 0) {
                E17665849472693074628.k(obj);
                G16212247282630895364 g16212247282630895364 = new G16212247282630895364(h10430515288632824348, r4833348786910499294, (byte) 21);
                this.t = (byte) 2;
                Object objQ = V16504496955554646429.q(1500L, g16212247282630895364, this);
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                if (objQ == z3437138737604933638) {
                    return z3437138737604933638;
                }
            } else {
                if (b != 1 && b != 2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
            }
            if (d64149705862665988452 != d6414970586266598845) {
                p5204863746366580363.a();
            }
            return O9245300239821758723.a;
        } catch (Throwable th) {
            if (d64149705862665988452 != d6414970586266598845) {
                p5204863746366580363.a();
            }
            throw th;
        }
    }
}
