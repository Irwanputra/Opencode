package dev.epro.r0;

import ads_mobile_sdk.q22;
import android.net.Network;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N9388237224661464957 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public final /* synthetic */ long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N9388237224661464957(Object obj, long j, Object obj2, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = obj;
        this.v = j;
        this.x = obj2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                N9388237224661464957 n9388237224661464957 = new N9388237224661464957((K16683514573337866527) obj2, this.v, r4833348786910499294);
                n9388237224661464957.w = obj;
                return n9388237224661464957;
            case 1:
                return new N9388237224661464957((q22) this.w, this.v, (Network) obj2, r4833348786910499294, (byte) 1);
            default:
                return new N9388237224661464957((C8208478698997814570) this.w, this.v, (K11590009740670147136) obj2, r4833348786910499294, (byte) 2);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((N9388237224661464957) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                return ((N9388237224661464957) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((N9388237224661464957) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Object a;
        L12639328004344855510 l12639328004344855510;
        byte b = this.t;
        long j = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj2 = this.x;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (z) {
                    if (z) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.w;
                J12078565427869724451 j12078565427869724451 = ((K16683514573337866527) obj2).L;
                L2216691091636065972 l2216691091636065972 = new L2216691091636065972(j);
                this.u = true;
                return j12078565427869724451.invoke(w5797197595347441198, l2216691091636065972, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    return ((q22) this.w).a(this.v, (Network) obj2, null, false, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
                }
                if (z2) {
                    E17665849472693074628.k(obj);
                    return o9245300239821758723;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                K11590009740670147136 k11590009740670147136 = (K11590009740670147136) obj2;
                C8208478698997814570 c8208478698997814570 = (C8208478698997814570) this.w;
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    U16834965109098959004 u16834965109098959004 = c8208478698997814570.a;
                    Q13254524308163418711 q13254524308163418711 = new Q13254524308163418711(j);
                    M15459437176959963354 m15459437176959963354 = k11590009740670147136.f323o;
                    this.u = true;
                    a = U16834965109098959004.a(u16834965109098959004, q13254524308163418711, m15459437176959963354, null, this, 12);
                    if (a == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z3) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                    a = obj;
                }
                N16276953959110768012 n16276953959110768012 = (N16276953959110768012) a;
                if (n16276953959110768012.b != G502295589610334456.b || (l12639328004344855510 = k11590009740670147136.p) == null) {
                    return o9245300239821758723;
                }
                l12639328004344855510.invoke(new Q13254524308163418711(c8208478698997814570.b), n16276953959110768012.a.b.getValue());
                return o9245300239821758723;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N9388237224661464957(K16683514573337866527 k16683514573337866527, long j, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.t = (byte) 0;
        this.x = k16683514573337866527;
        this.v = j;
    }
}
