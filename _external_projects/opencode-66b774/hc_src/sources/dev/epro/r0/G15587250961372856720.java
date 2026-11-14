package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class G15587250961372856720 extends R14062301455140331524 implements F4096073349764486348 {
    public boolean t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ H17052510251737830620 w;
    public final /* synthetic */ W3656598099029166611 x;
    public final /* synthetic */ float y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G15587250961372856720(Object obj, Object obj2, H17052510251737830620 h17052510251737830620, W3656598099029166611 w3656598099029166611, float f, R4833348786910499294 r4833348786910499294) {
        super(1, r4833348786910499294);
        this.u = obj;
        this.v = obj2;
        this.w = h17052510251737830620;
        this.x = w3656598099029166611;
        this.y = f;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        W3656598099029166611 w3656598099029166611 = this.x;
        float f = this.y;
        return new G15587250961372856720(this.u, this.v, this.w, w3656598099029166611, f, (R4833348786910499294) obj).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            F13057597822630943784 f13057597822630943784 = new F13057597822630943784(this.u, this.v, this.w, this.x, this.y, null);
            this.t = true;
            Object B = O8620973563946607355.B(f13057597822630943784, this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (B == z3437138737604933638) {
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
