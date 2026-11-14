package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F13057597822630943784 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ H17052510251737830620 x;
    public final /* synthetic */ W3656598099029166611 y;
    public final /* synthetic */ float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F13057597822630943784(Object obj, Object obj2, H17052510251737830620 h17052510251737830620, W3656598099029166611 w3656598099029166611, float f, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = obj;
        this.w = obj2;
        this.x = h17052510251737830620;
        this.y = w3656598099029166611;
        this.z = f;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        F13057597822630943784 f13057597822630943784 = new F13057597822630943784(this.v, this.w, this.x, this.y, this.z, r4833348786910499294);
        f13057597822630943784.u = obj;
        return f13057597822630943784;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((F13057597822630943784) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        H17052510251737830620 h17052510251737830620 = this.x;
        if (!z) {
            E17665849472693074628.k(obj);
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.u;
            Object obj2 = this.v;
            Object obj3 = this.w;
            if (S10823041268949770285.t(obj2, obj3)) {
                h17052510251737830620.f267o = null;
                if (S10823041268949770285.t(h17052510251737830620.c.getValue(), obj2)) {
                    return o9245300239821758723;
                }
            } else {
                h17052510251737830620.r();
            }
            boolean zT = S10823041268949770285.t(obj2, obj3);
            float f = this.z;
            if (!zT) {
                W3656598099029166611 w3656598099029166611 = this.y;
                w3656598099029166611.q(obj2);
                w3656598099029166611.n(0L);
                h17052510251737830620.b.setValue(obj2);
                w3656598099029166611.j(f);
            }
            h17052510251737830620.w(f);
            if (h17052510251737830620.n.i()) {
                R7033599853981556291.E(w5797197595347441198, null, null, new G16212247282630895364(h17052510251737830620, null, (byte) 13), 3);
            } else {
                h17052510251737830620.m = Long.MIN_VALUE;
            }
            this.t = true;
            Object objZ = h17052510251737830620.z(this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (objZ == z3437138737604933638) {
                return z3437138737604933638;
            }
        } else {
            if (!z) {
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            E17665849472693074628.k(obj);
        }
        h17052510251737830620.v();
        return o9245300239821758723;
    }
}
