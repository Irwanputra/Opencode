package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P16682627567602943184 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ S14157914735975478504 w;
    public final /* synthetic */ P5204863746366580363 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P16682627567602943184(S14157914735975478504 s14157914735975478504, P5204863746366580363 p5204863746366580363, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = s14157914735975478504;
        this.x = p5204863746366580363;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                P16682627567602943184 p16682627567602943184 = new P16682627567602943184(this.w, this.x, r4833348786910499294, (byte) 0);
                p16682627567602943184.v = obj;
                return p16682627567602943184;
            default:
                P16682627567602943184 p166826275676029431842 = new P16682627567602943184(this.w, this.x, r4833348786910499294, (byte) 1);
                p166826275676029431842.v = obj;
                return p166826275676029431842;
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
        return ((P16682627567602943184) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        P5204863746366580363 p5204863746366580363 = this.x;
        S14157914735975478504 s14157914735975478504 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    L9121577242202811414 l9121577242202811414 = new L9121577242202811414((W5797197595347441198) this.v, p5204863746366580363, null);
                    this.u = true;
                    if (V1475975160983963926.n(s14157914735975478504, l9121577242202811414, this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    Q6921643785225464184 q6921643785225464184 = new Q6921643785225464184((W5797197595347441198) this.v, p5204863746366580363, null);
                    this.u = true;
                    if (((P9733793856018248168) s14157914735975478504).h1(q6921643785225464184, this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
