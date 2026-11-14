package dev.epro.r0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S12521250185291463873 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ D2717688760023469083 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S12521250185291463873(D2717688760023469083 d2717688760023469083, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = d2717688760023469083;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        D2717688760023469083 d2717688760023469083 = this.v;
        switch (b) {
            case 0:
                return new S12521250185291463873(d2717688760023469083, r4833348786910499294, (byte) 0);
            case 1:
                return new S12521250185291463873(d2717688760023469083, r4833348786910499294, (byte) 1);
            default:
                return new S12521250185291463873(d2717688760023469083, r4833348786910499294, (byte) 2);
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
        return ((S12521250185291463873) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        D2717688760023469083 d2717688760023469083 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    if (d2717688760023469083.y(this) == z3437138737604933638) {
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
                    d2717688760023469083.getClass();
                    G6219617120344415229 g6219617120344415229P = J10256772239794345968.p(new J14087722038307951427(d2717688760023469083, (byte) 5));
                    N9045590051470904367 n9045590051470904367 = N9045590051470904367.h;
                    Y13361005827119333637 y13361005827119333637 = M9216324016624295870.b;
                    V12319504402545346730.s(2, n9045590051470904367);
                    Object objCollect = M9216324016624295870.w(g6219617120344415229P, y13361005827119333637, n9045590051470904367).collect(new Z10733167746954993267((Serializable) new A8284336046188466534(), (S7864201625552763331) new O3222469587018325292(d2717688760023469083, (byte) 0), (byte) 1), this);
                    if (objCollect != z3437138737604933638) {
                        objCollect = o9245300239821758723;
                    }
                    if (objCollect != z3437138737604933638) {
                        objCollect = o9245300239821758723;
                    }
                    if (objCollect == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    d2717688760023469083.getClass();
                    Object objCollect2 = M9216324016624295870.w(J10256772239794345968.p(new J14087722038307951427(d2717688760023469083, (byte) 4)), new S11108027743417284456((byte) 7), M9216324016624295870.c).collect(new O3222469587018325292(d2717688760023469083, (byte) 1), this);
                    if (objCollect2 != z3437138737604933638) {
                        objCollect2 = o9245300239821758723;
                    }
                    if (objCollect2 == z3437138737604933638) {
                    }
                } else if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
