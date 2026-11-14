package dev.epro.r0;

import ads_mobile_sdk.ji3;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P7598478828797568949 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t;
    public boolean u;
    public /* synthetic */ Object v;
    public final /* synthetic */ L12639328004344855510 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ P7598478828797568949(L12639328004344855510 l12639328004344855510, R4833348786910499294 r4833348786910499294, byte b) {
        super(2, r4833348786910499294);
        this.t = b;
        this.w = l12639328004344855510;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        L12639328004344855510 l12639328004344855510 = this.w;
        switch (b) {
            case 0:
                P7598478828797568949 p7598478828797568949 = new P7598478828797568949(l12639328004344855510, r4833348786910499294, (byte) 0);
                p7598478828797568949.v = obj;
                return p7598478828797568949;
            case 1:
                P7598478828797568949 p75984788287975689492 = new P7598478828797568949(l12639328004344855510, r4833348786910499294, (byte) 1);
                p75984788287975689492.v = obj;
                return p75984788287975689492;
            case 2:
                P7598478828797568949 p75984788287975689493 = new P7598478828797568949(l12639328004344855510, r4833348786910499294, (byte) 2);
                p75984788287975689493.v = obj;
                return p75984788287975689493;
            default:
                P7598478828797568949 p75984788287975689494 = new P7598478828797568949(l12639328004344855510, r4833348786910499294, (byte) 3);
                p75984788287975689494.v = obj;
                return p75984788287975689494;
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((P7598478828797568949) create((R4833348786910499294) obj2, (D16915965609090523564) obj)).invokeSuspend(o9245300239821758723);
            case 1:
                P7598478828797568949 p7598478828797568949 = new P7598478828797568949(this.w, (R4833348786910499294) obj2, (byte) 1);
                p7598478828797568949.v = (W5797197595347441198) obj;
                return p7598478828797568949.invokeSuspend(o9245300239821758723);
            case 2:
                return ((P7598478828797568949) create((R4833348786910499294) obj2, (D16915965609090523564) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((P7598478828797568949) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        L12639328004344855510 l12639328004344855510 = this.w;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    D16915965609090523564 d16915965609090523564 = (D16915965609090523564) this.v;
                    this.u = true;
                    obj = l12639328004344855510.invoke(d16915965609090523564, this);
                    if (obj == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                D16915965609090523564 d169159656090905235642 = (D16915965609090523564) obj;
                d169159656090905235642.getClass();
                d169159656090905235642.b.a.set(true);
                return d169159656090905235642;
            case 1:
                boolean z2 = this.u;
                if (z2) {
                    if (z2) {
                        E17665849472693074628.k(obj);
                        return o9245300239821758723;
                    }
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                E17665849472693074628.k(obj);
                W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.v;
                ji3.a(ji3.b(), null);
                this.u = true;
                return l12639328004344855510.invoke(w5797197595347441198, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
            case 2:
                boolean z3 = this.u;
                if (!z3) {
                    E17665849472693074628.k(obj);
                    D16915965609090523564 d169159656090905235643 = new D16915965609090523564(new LinkedHashMap(((D16915965609090523564) this.v).a()), false);
                    this.v = d169159656090905235643;
                    this.u = true;
                    return l12639328004344855510.invoke(d169159656090905235643, this) == z3437138737604933638 ? z3437138737604933638 : d169159656090905235643;
                }
                if (!z3) {
                    S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                D16915965609090523564 d169159656090905235644 = (D16915965609090523564) this.v;
                E17665849472693074628.k(obj);
                return d169159656090905235644;
            default:
                boolean z4 = this.u;
                if (!z4) {
                    E17665849472693074628.k(obj);
                    W5797197595347441198 w57971975953474411982 = (W5797197595347441198) this.v;
                    this.u = true;
                    return l12639328004344855510.invoke(w57971975953474411982, this) == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
                }
                if (z4) {
                    E17665849472693074628.k(obj);
                    return o9245300239821758723;
                }
                S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
