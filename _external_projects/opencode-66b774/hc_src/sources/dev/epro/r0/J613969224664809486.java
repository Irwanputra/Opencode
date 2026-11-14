package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class J613969224664809486 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ S14157914735975478504 v;
    public final /* synthetic */ N235339945877347053 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J613969224664809486(S14157914735975478504 s14157914735975478504, N235339945877347053 n235339945877347053, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = s14157914735975478504;
        this.w = n235339945877347053;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new J613969224664809486(this.v, this.w, r4833348786910499294, (byte) 0);
            case 1:
                return new J613969224664809486(this.v, this.w, r4833348786910499294, (byte) 1);
            default:
                return new J613969224664809486(this.v, this.w, r4833348786910499294, (byte) 2);
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
        return ((J613969224664809486) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        S14157914735975478504 s14157914735975478504 = this.v;
        final N235339945877347053 n235339945877347053 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        final byte b2 = 1;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (Z860808776098365610.z(s14157914735975478504, n235339945877347053, this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    Object n = V1475975160983963926.n(s14157914735975478504, new M4874962628954682344(n235339945877347053, null), this);
                    if (n != z3437138737604933638) {
                        n = o9245300239821758723;
                    }
                    if (n == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    final byte b3 = 0;
                    Object e = F10757829603125321143.e(this.v, new O12298251705779459051(n235339945877347053, (byte) 0), new B13729205492206812220() { // from class: dev.epro.r0.U14137647249580176280
                        @Override // dev.epro.r0.B13729205492206812220
                        public final Object invoke() {
                            byte b4 = b3;
                            O9245300239821758723 o92453002398217587232 = O9245300239821758723.a;
                            N235339945877347053 n2353399458773470532 = n235339945877347053;
                            switch (b4) {
                                case 0:
                                    n2353399458773470532.onStop();
                                    break;
                                default:
                                    n2353399458773470532.onCancel();
                                    break;
                            }
                            return o92453002398217587232;
                        }
                    }, new B13729205492206812220() { // from class: dev.epro.r0.U14137647249580176280
                        @Override // dev.epro.r0.B13729205492206812220
                        public final Object invoke() {
                            byte b4 = b2;
                            O9245300239821758723 o92453002398217587232 = O9245300239821758723.a;
                            N235339945877347053 n2353399458773470532 = n235339945877347053;
                            switch (b4) {
                                case 0:
                                    n2353399458773470532.onStop();
                                    break;
                                default:
                                    n2353399458773470532.onCancel();
                                    break;
                            }
                            return o92453002398217587232;
                        }
                    }, new K5271540294206541871(n235339945877347053, (byte) 24), this);
                    if (e != z3437138737604933638) {
                        e = o9245300239821758723;
                    }
                    if (e == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return o9245300239821758723;
    }
}
