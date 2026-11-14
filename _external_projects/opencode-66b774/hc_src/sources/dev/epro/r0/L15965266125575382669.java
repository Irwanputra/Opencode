package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L15965266125575382669 extends T7441316690157960089 implements L12639328004344855510 {
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ W5797197595347441198 v;
    public final /* synthetic */ H16689892403409870979 w;
    public final /* synthetic */ F4096073349764486348 x;
    public final /* synthetic */ J12078565427869724451 y;
    public final /* synthetic */ F4096073349764486348 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L15965266125575382669(W5797197595347441198 w5797197595347441198, H16689892403409870979 h16689892403409870979, F4096073349764486348 f4096073349764486348, J12078565427869724451 j12078565427869724451, F4096073349764486348 f40960733497644863482, R4833348786910499294 r4833348786910499294) {
        super(r4833348786910499294);
        this.v = w5797197595347441198;
        this.w = h16689892403409870979;
        this.x = f4096073349764486348;
        this.y = j12078565427869724451;
        this.z = f40960733497644863482;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        L15965266125575382669 l15965266125575382669 = new L15965266125575382669(this.v, this.w, this.x, this.y, this.z, r4833348786910499294);
        l15965266125575382669.u = obj;
        return l15965266125575382669;
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((L15965266125575382669) create((R4833348786910499294) obj2, (Z7637734454282223795) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.t;
        if (!z) {
            E17665849472693074628.k(obj);
            Z7637734454282223795 z7637734454282223795 = (Z7637734454282223795) this.u;
            this.t = true;
            Object h = U2645994142831146282.h(z7637734454282223795, this.v, this.w, this.x, this.y, this.z, this);
            Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
            if (h == z3437138737604933638) {
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
