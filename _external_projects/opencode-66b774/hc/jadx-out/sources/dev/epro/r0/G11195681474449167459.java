package dev.epro.r0;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G11195681474449167459 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ B3963145314223808202 v;
    public final /* synthetic */ F2939855867946572554 w;
    public final /* synthetic */ D9497773141868343380 x;
    public final /* synthetic */ long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G11195681474449167459(B3963145314223808202 b3963145314223808202, F2939855867946572554 f2939855867946572554, D9497773141868343380 d9497773141868343380, long j, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = b3963145314223808202;
        this.w = f2939855867946572554;
        this.x = d9497773141868343380;
        this.y = j;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        G11195681474449167459 g11195681474449167459 = new G11195681474449167459(this.v, this.w, this.x, this.y, r4833348786910499294);
        g11195681474449167459.u = obj;
        return g11195681474449167459;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((G11195681474449167459) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        B3963145314223808202 b3963145314223808202 = this.v;
        V12816289154094534935 v12816289154094534935 = b3963145314223808202.t;
        boolean z = this.t;
        try {
            try {
                if (!z) {
                    E17665849472693074628.k(obj);
                    Q15035754882231748864 q15035754882231748864Q = J8045362843799184672.Q(((W5797197595347441198) this.u).h());
                    b3963145314223808202.w = true;
                    V5142773592757085764 v5142773592757085764 = b3963145314223808202.p;
                    D6414970586266598845 d6414970586266598845 = D6414970586266598845.a;
                    L2357058196026577384 l2357058196026577384 = new L2357058196026577384(this.w, b3963145314223808202, this.x, this.y, q15035754882231748864Q, null);
                    this.t = true;
                    Object objG = v5142773592757085764.g(d6414970586266598845, l2357058196026577384, this);
                    Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                    if (objG == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                v12816289154094534935.b();
                b3963145314223808202.w = false;
                v12816289154094534935.a(null);
                b3963145314223808202.u = false;
                return O9245300239821758723.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            b3963145314223808202.w = false;
            v12816289154094534935.a(null);
            b3963145314223808202.u = false;
            throw th;
        }
    }
}
