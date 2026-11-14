package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U16964168814270949320 extends R14062301455140331524 implements F4096073349764486348 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ H17052510251737830620 v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ W3656598099029166611 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U16964168814270949320(H17052510251737830620 h17052510251737830620, Object obj, W3656598099029166611 w3656598099029166611, R4833348786910499294 r4833348786910499294, byte b) {
        super(1, r4833348786910499294);
        this.t = b;
        this.v = h17052510251737830620;
        this.w = obj;
        this.x = w3656598099029166611;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        R4833348786910499294 r4833348786910499294 = (R4833348786910499294) obj;
        switch (b) {
            case 0:
                return new U16964168814270949320(this.v, this.w, this.x, r4833348786910499294, (byte) 0).invokeSuspend(o9245300239821758723);
            default:
                return new U16964168814270949320(this.v, this.w, this.x, r4833348786910499294, (byte) 1).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        H17052510251737830620 h17052510251737830620 = this.v;
        Object obj2 = this.w;
        W3656598099029166611 w3656598099029166611 = this.x;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    I5566604416186847280 i5566604416186847280 = new I5566604416186847280(h17052510251737830620, obj2, w3656598099029166611, (R4833348786910499294) null);
                    this.u = true;
                    return O8620973563946607355.B(i5566604416186847280, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
                }
                if (z) {
                    E17665849472693074628.k(obj);
                    return o9245300239821758723;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    h17052510251737830620.q();
                    V697849047308847220 v697849047308847220 = h17052510251737830620.b;
                    h17052510251737830620.m = Long.MIN_VALUE;
                    h17052510251737830620.w(0.0f);
                    float f = obj2.equals(h17052510251737830620.c.getValue()) ? -4.0f : obj2.equals(v697849047308847220.getValue()) ? -5.0f : -3.0f;
                    w3656598099029166611.q(obj2);
                    w3656598099029166611.n(0L);
                    v697849047308847220.setValue(obj2);
                    h17052510251737830620.w(0.0f);
                    h17052510251737830620.m(obj2);
                    w3656598099029166611.j(f);
                    if (f == -3.0f) {
                        this.u = true;
                        if (h17052510251737830620.z(this) == z3437138737604933638) {
                            return z3437138737604933638;
                        }
                    }
                } else {
                    if (!z2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                w3656598099029166611.i();
                return o9245300239821758723;
        }
    }
}
