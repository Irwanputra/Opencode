package dev.epro.r0;

import ads_mobile_sdk.q22;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.view.textclassifier.TextClassifier;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class O11111548397065333129 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 0;
    public boolean u;
    public final /* synthetic */ long v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O11111548397065333129(S16869475527240117894 s16869475527240117894, CharSequence charSequence, long j, D2717688760023469083 d2717688760023469083, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = s16869475527240117894;
        this.y = charSequence;
        this.v = j;
        this.x = d2717688760023469083;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                O11111548397065333129 o11111548397065333129 = new O11111548397065333129(this.v, r4833348786910499294, (K1755082528704418605) obj2, (CharSequence) obj3);
                o11111548397065333129.w = obj;
                return o11111548397065333129;
            case 1:
                return new O11111548397065333129((q22) this.w, this.v, (Network) obj2, (NetworkCapabilities) obj3, r4833348786910499294);
            case 2:
                O11111548397065333129 o111115483970653331292 = new O11111548397065333129((V5142773592757085764) obj2, this.v, (A81664135048468380) obj3, r4833348786910499294);
                o111115483970653331292.w = obj;
                return o111115483970653331292;
            default:
                return new O11111548397065333129((S16869475527240117894) this.w, (CharSequence) obj3, this.v, (D2717688760023469083) obj2, r4833348786910499294);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((O11111548397065333129) create((R4833348786910499294) obj2, T15589241373902147015.h(obj))).invokeSuspend(o9245300239821758723);
            case 1:
                return ((O11111548397065333129) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
            case 2:
                return ((O11111548397065333129) create((R4833348786910499294) obj2, (G3869673327990687150) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((O11111548397065333129) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        Object objE;
        byte b = this.t;
        long j = this.v;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj2 = this.x;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    TextClassifier textClassifierH = T15589241373902147015.h(this.w);
                    this.u = true;
                    return ((K1755082528704418605) obj2).a((CharSequence) obj3, this.v, textClassifierH, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
                }
                if (z) {
                    E17665849472693074628.k(obj);
                    return o9245300239821758723;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    this.u = true;
                    return ((q22) this.w).a(this.v, (Network) obj2, (NetworkCapabilities) obj3, false, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
                }
                if (z2) {
                    E17665849472693074628.k(obj);
                    return o9245300239821758723;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                V5142773592757085764 v5142773592757085764 = (V5142773592757085764) obj2;
                boolean z3 = this.u;
                if (z3) {
                    if (z3) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                G3869673327990687150 g3869673327990687150 = (G3869673327990687150) this.w;
                float fH = v5142773592757085764.h(j);
                L8467694984959092745 l8467694984959092745 = new L8467694984959092745((A81664135048468380) obj3, v5142773592757085764, g3869673327990687150, (byte) 9);
                this.u = true;
                return M17147082063200071302.m(0.0f, fH, null, l8467694984959092745, this, 12) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            default:
                CharSequence charSequence = (CharSequence) obj3;
                N1420218926656397722 n1420218926656397722 = ((D2717688760023469083) obj2).a;
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    S16869475527240117894 s16869475527240117894 = (S16869475527240117894) this.w;
                    this.u = true;
                    objE = ((K1755082528704418605) s16869475527240117894).e(charSequence, j, this);
                    if (objE == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z4) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                    objE = obj;
                }
                F12478849263529740365 f12478849263529740365 = (F12478849263529740365) objE;
                if (f12478849263529740365 == null) {
                    return o9245300239821758723;
                }
                long j2 = f12478849263529740365.a;
                if (!S10823041268949770285.t(n1420218926656397722.d().c, charSequence) || !F12478849263529740365.c(n1420218926656397722.d().d, j) || F12478849263529740365.c(j2, n1420218926656397722.d().d)) {
                    return o9245300239821758723;
                }
                n1420218926656397722.j(j2);
                return o9245300239821758723;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O11111548397065333129(long j, R4833348786910499294 r4833348786910499294, K1755082528704418605 k1755082528704418605, CharSequence charSequence) {
        super(2, r4833348786910499294);
        this.x = k1755082528704418605;
        this.y = charSequence;
        this.v = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O11111548397065333129(V5142773592757085764 v5142773592757085764, long j, A81664135048468380 a81664135048468380, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.x = v5142773592757085764;
        this.v = j;
        this.y = a81664135048468380;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O11111548397065333129(q22 q22Var, long j, Network network, NetworkCapabilities networkCapabilities, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = q22Var;
        this.v = j;
        this.x = network;
        this.y = networkCapabilities;
    }
}
