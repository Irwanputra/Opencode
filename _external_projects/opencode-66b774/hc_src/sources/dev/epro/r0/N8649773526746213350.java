package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N8649773526746213350 extends R14062301455140331524 implements J12078565427869724451 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N8649773526746213350(J7128855986599981135 j7128855986599981135, R4833348786910499294 r4833348786910499294) {
        super(3, r4833348786910499294);
        this.v = j7128855986599981135;
    }

    @Override // dev.epro.r0.J12078565427869724451
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return new N8649773526746213350((J7128855986599981135) this.v, (R4833348786910499294) obj3).invokeSuspend(o9245300239821758723);
            default:
                ((Boolean) obj2).getClass();
                N8649773526746213350 n8649773526746213350 = new N8649773526746213350(3, (R4833348786910499294) obj3);
                n8649773526746213350.v = (D7689865999397106918) obj;
                return n8649773526746213350.invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        R4833348786910499294 r4833348786910499294 = null;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    J7128855986599981135 j7128855986599981135 = (J7128855986599981135) this.v;
                    this.u = true;
                    if (j7128855986599981135.b(this) == z3437138737604933638) {
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
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    D7689865999397106918 d7689865999397106918 = (D7689865999397106918) this.v;
                    this.u = true;
                    if (!d7689865999397106918.c.get()) {
                        Object I = G16660188620551127941.I(d7689865999397106918.a, new H2730750034712003316((Object) d7689865999397106918, r4833348786910499294, (byte) 2), this);
                        return I == z3437138737604933638 ? z3437138737604933638 : I;
                    }
                    S10973172697741180971.m("This scope has already been closed.");
                } else {
                    if (z2) {
                        E17665849472693074628.k(obj);
                        return obj;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    public /* synthetic */ N8649773526746213350(int i, R4833348786910499294 r4833348786910499294) {
        super(i, r4833348786910499294);
    }
}
