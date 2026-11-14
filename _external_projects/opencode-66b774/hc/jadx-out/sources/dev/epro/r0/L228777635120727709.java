package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L228777635120727709 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ H1239233717680269921 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L228777635120727709(H1239233717680269921 h1239233717680269921, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = h1239233717680269921;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        H1239233717680269921 h1239233717680269921 = this.v;
        switch (b) {
            case 0:
                return new L228777635120727709(h1239233717680269921, r4833348786910499294, (byte) 0);
            default:
                return new L228777635120727709(h1239233717680269921, r4833348786910499294, (byte) 1);
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
        return ((L228777635120727709) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Object f8175081547451543538;
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        H1239233717680269921 h1239233717680269921 = this.v;
        R4833348786910499294 r4833348786910499294 = null;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object objC = h1239233717680269921.c(this);
                    return objC == z3437138737604933638 ? z3437138737604933638 : objC;
                }
                if (z) {
                    E17665849472693074628.k(obj);
                    return obj;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.u;
                byte b2 = 0;
                try {
                    if (!z2) {
                        E17665849472693074628.k(obj);
                        R5692663580087387669 r5692663580087387669 = h1239233717680269921.k;
                        L228777635120727709 l228777635120727709 = new L228777635120727709(h1239233717680269921, r4833348786910499294, b2);
                        this.u = true;
                        obj = R7033599853981556291.d0(r5692663580087387669, l228777635120727709, this);
                        if (obj == z3437138737604933638) {
                            return z3437138737604933638;
                        }
                    } else {
                        if (!z2) {
                            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        E17665849472693074628.k(obj);
                    }
                    f8175081547451543538 = (X12113469389570258392) obj;
                    break;
                } catch (M3766625580725462707 e) {
                    f8175081547451543538 = new W6302889252315264486(e.a);
                } catch (CancellationException unused) {
                    f8175081547451543538 = new F8175081547451543538();
                } catch (Throwable unused2) {
                    int i = I15319306796992343861.a;
                    B14824868959299866349.n().getClass();
                    f8175081547451543538 = new F8175081547451543538();
                }
                Object objP = h1239233717680269921.g.p(new N8306548196372912291(new E9507284769322407406(f8175081547451543538, h1239233717680269921, b2), (byte) 6));
                objP.getClass();
                return objP;
        }
    }
}
