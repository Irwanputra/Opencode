package dev.epro.r0;

import ads_mobile_sdk.ji3;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X15965119713728731855 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ F4096073349764486348 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X15965119713728731855(F4096073349764486348 f4096073349764486348, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = f4096073349764486348;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        F4096073349764486348 f4096073349764486348 = this.v;
        switch (b) {
            case 0:
                return new X15965119713728731855(f4096073349764486348, r4833348786910499294, (byte) 0);
            case 1:
                return new X15965119713728731855(f4096073349764486348, r4833348786910499294, (byte) 1);
            case 2:
                return new X15965119713728731855(f4096073349764486348, r4833348786910499294, (byte) 2);
            case 3:
                return new X15965119713728731855(f4096073349764486348, r4833348786910499294, (byte) 3);
            default:
                return new X15965119713728731855(f4096073349764486348, r4833348786910499294, (byte) 4);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        F4096073349764486348 f4096073349764486348 = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((X15965119713728731855) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return new X15965119713728731855(f4096073349764486348, (R4833348786910499294) obj2, (byte) 1).invokeSuspend(o9245300239821758723);
            case 2:
                return new X15965119713728731855(f4096073349764486348, (R4833348786910499294) obj2, (byte) 2).invokeSuspend(o9245300239821758723);
            case 3:
                return new X15965119713728731855(f4096073349764486348, (R4833348786910499294) obj2, (byte) 3).invokeSuspend(o9245300239821758723);
            default:
                return ((X15965119713728731855) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        F4096073349764486348 f4096073349764486348 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (f4096073349764486348.invoke(this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object objInvoke = f4096073349764486348.invoke(this);
                    if (objInvoke == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object objInvoke2 = f4096073349764486348.invoke(this);
                    if (objInvoke2 == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 3:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    ji3.a(ji3.b(), null);
                    this.u = true;
                    Object objInvoke3 = f4096073349764486348.invoke(this);
                    if (objInvoke3 == z3437138737604933638) {
                    }
                } else if (!z4) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z5 = this.u;
                if (!z5) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (f4096073349764486348.invoke(this) == z3437138737604933638) {
                    }
                } else if (!z5) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
