package dev.epro.r0;

import ads_mobile_sdk.um0;
import ads_mobile_sdk.zs3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L16415741994209199050 extends R14062301455140331524 implements L12639328004344855510 {
    public final /* synthetic */ byte t = 1;
    public boolean u;
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L16415741994209199050(zs3 zs3Var, int i, String str, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.w = zs3Var;
        this.v = i;
        this.x = str;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        byte b = this.t;
        Object obj2 = this.x;
        int i = this.v;
        switch (b) {
            case 0:
                L16415741994209199050 l16415741994209199050 = new L16415741994209199050((E17523205116624666034) obj2, i, r4833348786910499294);
                l16415741994209199050.w = obj;
                return l16415741994209199050;
            default:
                return new L16415741994209199050((zs3) this.w, i, (String) obj2, r4833348786910499294);
        }
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.t;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                return ((L16415741994209199050) create((R4833348786910499294) obj2, (A7868207189447841291) obj)).invokeSuspend(o9245300239821758723);
            default:
                return ((L16415741994209199050) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(o9245300239821758723);
        }
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) throws IOException {
        byte b = this.t;
        Object obj2 = this.x;
        int i = this.v;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        switch (b) {
            case 0:
                boolean z = this.u;
                if (!z) {
                    E17665849472693074628.k(obj);
                    E17523205116624666034 e17523205116624666034 = (E17523205116624666034) obj2;
                    M8081976061220108806 m8081976061220108806 = new M8081976061220108806((A7868207189447841291) this.w, e17523205116624666034, (byte) 0);
                    R8540738700654750557 r8540738700654750557 = ((O11472352839632764090) e17523205116624666034.f.getValue()).i;
                    this.u = true;
                    if (K5751602218013079365.p(m8081976061220108806, i, 100, r8540738700654750557, this) == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o9245300239821758723;
            default:
                boolean z2 = this.u;
                if (!z2) {
                    E17665849472693074628.k(obj);
                    zs3 zs3Var = (zs3) this.w;
                    um0 um0Var = zs3Var.a;
                    this.u = true;
                    um0Var.getClass();
                    um0.a(um0Var, i, zs3Var.e.q, (String) obj2);
                    if (o9245300239821758723 == z3437138737604933638) {
                        return z3437138737604933638;
                    }
                } else {
                    if (!z2) {
                        S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    E17665849472693074628.k(obj);
                }
                return o9245300239821758723;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L16415741994209199050(E17523205116624666034 e17523205116624666034, int i, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.x = e17523205116624666034;
        this.v = i;
    }
}
