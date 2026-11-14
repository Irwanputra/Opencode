package dev.epro.r0;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y10342134733813765532 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ D5961215468735357278 v;
    public final /* synthetic */ W1972671267364756056 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y10342134733813765532(D5961215468735357278 d5961215468735357278, W1972671267364756056 w1972671267364756056, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.v = d5961215468735357278;
        this.w = w1972671267364756056;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        switch (this.t) {
            case 0:
                return new Y10342134733813765532(this.v, this.w, r4833348786910499294, (byte) 0);
            default:
                return new Y10342134733813765532(this.v, this.w, r4833348786910499294, (byte) 1);
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
        return ((Y10342134733813765532) create(r4833348786910499294, w5797197595347441198)).invokeSuspend(o9245300239821758723);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W1972671267364756056 w1972671267364756056 = this.w;
        D5961215468735357278 d5961215468735357278 = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    ArrayList arrayList = new ArrayList();
                    J12043550928838212009 j12043550928838212009A = d5961215468735357278.a();
                    Y6280176989120443622 y6280176989120443622 = new Y6280176989120443622(arrayList, w1972671267364756056, (byte) 0);
                    this.u = true;
                    if (j12043550928838212009A.collect(y6280176989120443622, this) == z3437138737604933638) {
                    }
                } else if (!z) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    ArrayList arrayList2 = new ArrayList();
                    J12043550928838212009 j12043550928838212009A2 = d5961215468735357278.a();
                    Y6280176989120443622 y62801769891204436222 = new Y6280176989120443622(arrayList2, w1972671267364756056, (byte) 1);
                    this.u = true;
                    if (j12043550928838212009A2.collect(y62801769891204436222, this) == z3437138737604933638) {
                    }
                } else if (!z2) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    E17665849472693074628.k(obj);
                }
                break;
        }
        return z3437138737604933638;
    }
}
