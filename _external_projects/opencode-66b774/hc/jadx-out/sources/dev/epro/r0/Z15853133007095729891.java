package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Z15853133007095729891 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public final /* synthetic */ J196785984016436306 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ F4096073349764486348 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z15853133007095729891(R4833348786910499294 r4833348786910499294, J196785984016436306 j196785984016436306, boolean z, boolean z2, F4096073349764486348 f4096073349764486348) {
        super(2, r4833348786910499294);
        this.v = j196785984016436306;
        this.w = z;
        this.x = z2;
        this.y = f4096073349764486348;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new Z15853133007095729891(this.v, this.w, this.x, this.y, r4833348786910499294);
            default:
                return new Z15853133007095729891(r4833348786910499294, this.v, this.w, this.x, this.y);
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
        return ((Z15853133007095729891) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    J196785984016436306 j196785984016436306 = this.v;
                    boolean z2 = !(j196785984016436306.k() && j196785984016436306.l()) && this.w;
                    boolean z3 = this.x;
                    J196785984016436306 j1967859840164363062 = this.v;
                    K16053060172215145989 k16053060172215145989 = new K16053060172215145989(z2, z3, j1967859840164363062, null, this.y, (byte) 0);
                    this.u = true;
                    Object objR = j1967859840164363062.r(z3, k16053060172215145989, this);
                    if (objR == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    boolean z5 = this.x;
                    boolean z6 = this.w;
                    J196785984016436306 j1967859840164363063 = this.v;
                    K16053060172215145989 k160530601722151459892 = new K16053060172215145989(z5, z6, j1967859840164363063, null, this.y, (byte) 1);
                    this.u = true;
                    Object objR2 = j1967859840164363063.r(z6, k160530601722151459892, this);
                    if (objR2 == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z15853133007095729891(J196785984016436306 j196785984016436306, boolean z, boolean z2, F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.v = j196785984016436306;
        this.w = z;
        this.x = z2;
        this.y = f4096073349764486348;
    }
}
