package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P12904780512189285739 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ J12078565427869724451 v;
    public final /* synthetic */ H16689892403409870979 w;
    public final /* synthetic */ N13196868278329319633 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P12904780512189285739(J12078565427869724451 j12078565427869724451, H16689892403409870979 h16689892403409870979, N13196868278329319633 n13196868278329319633, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = j12078565427869724451;
        this.w = h16689892403409870979;
        this.x = n13196868278329319633;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new P12904780512189285739(this.v, this.w, this.x, r4833348786910499294, (byte) 0);
            case 1:
                return new P12904780512189285739(this.v, this.w, this.x, r4833348786910499294, (byte) 1);
            default:
                return new P12904780512189285739(this.v, this.w, this.x, r4833348786910499294, (byte) 2);
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
        return ((P12904780512189285739) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        N13196868278329319633 n13196868278329319633 = this.x;
        H16689892403409870979 h16689892403409870979 = this.w;
        J12078565427869724451 j12078565427869724451 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    L2216691091636065972 l2216691091636065972 = new L2216691091636065972(n13196868278329319633.c);
                    this.u = true;
                    if (j12078565427869724451.invoke(h16689892403409870979, l2216691091636065972, this) == z3437138737604933638) {
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
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    L2216691091636065972 l22166910916360659722 = new L2216691091636065972(n13196868278329319633.c);
                    this.u = true;
                    if (j12078565427869724451.invoke(h16689892403409870979, l22166910916360659722, this) == z3437138737604933638) {
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
            default:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    L2216691091636065972 l22166910916360659723 = new L2216691091636065972(n13196868278329319633.c);
                    this.u = true;
                    if (j12078565427869724451.invoke(h16689892403409870979, l22166910916360659723, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z3) {
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
