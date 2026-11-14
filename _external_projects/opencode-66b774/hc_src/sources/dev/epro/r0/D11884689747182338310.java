package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class D11884689747182338310 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ U830809347177809305 v;
    public /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ D11884689747182338310(U830809347177809305 u830809347177809305, long j, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = u830809347177809305;
        this.w = j;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                D11884689747182338310 d11884689747182338310 = new D11884689747182338310(this.v, r4833348786910499294);
                d11884689747182338310.w = ((L2216691091636065972) obj).a;
                return d11884689747182338310;
            case 1:
                return new D11884689747182338310(this.v, this.w, r4833348786910499294, (byte) 1);
            case 2:
                return new D11884689747182338310(this.v, this.w, r4833348786910499294, (byte) 2);
            default:
                return new D11884689747182338310(this.v, this.w, r4833348786910499294, (byte) 3);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                long j = ((L2216691091636065972) obj).a;
                D11884689747182338310 d11884689747182338310 = new D11884689747182338310(this.v, (R4833348786910499294) obj2);
                d11884689747182338310.w = j;
                return d11884689747182338310.invokeSuspend(o9245300239821758723);
            case 1:
                return ((D11884689747182338310) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 2:
                return ((D11884689747182338310) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((D11884689747182338310) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        U830809347177809305 u830809347177809305 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    long j = this.w;
                    this.u = true;
                    Object b2 = F7156479658963581662.b(u830809347177809305.R, j, this);
                    if (b2 == z3437138737604933638) {
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
                    V5142773592757085764 v5142773592757085764 = u830809347177809305.R;
                    A18107078866102800328 a18107078866102800328 = new A18107078866102800328(this.w, null);
                    this.u = true;
                    if (v5142773592757085764.g(D6414970586266598845.b, a18107078866102800328, this) == z3437138737604933638) {
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
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    V5142773592757085764 v51427735927570857642 = u830809347177809305.R;
                    long j2 = this.w;
                    this.u = true;
                    if (v51427735927570857642.c(j2, true, this) == z3437138737604933638) {
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
            default:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    V5142773592757085764 v51427735927570857643 = u830809347177809305.R;
                    long j3 = this.w;
                    this.u = true;
                    if (v51427735927570857643.c(j3, false, this) == z3437138737604933638) {
                        break;
                    }
                } else if (!z4) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11884689747182338310(U830809347177809305 u830809347177809305, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 0;
        this.v = u830809347177809305;
    }
}
