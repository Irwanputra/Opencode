package ads_mobile_sdk;

import dev.epro.r0.B16233345865283492429;
import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.V16504496955554646429;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import org.chromium.net.CronetEngine;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class t20 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ long b;
    public final /* synthetic */ w20 c;
    public final /* synthetic */ y11 d;
    public final /* synthetic */ CronetEngine e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(long j, w20 w20Var, y11 y11Var, CronetEngine cronetEngine, boolean z, boolean z2, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = j;
        this.c = w20Var;
        this.d = y11Var;
        this.e = cronetEngine;
        this.f = z;
        this.g = z2;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new t20(this.b, this.c, this.d, this.e, this.f, this.g, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((t20) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                E17665849472693074628.k(obj);
                return obj;
            }
            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        E17665849472693074628.k(obj);
        B16233345865283492429 b16233345865283492429 = new B16233345865283492429(this.c, this.d, this.e, this.f, this.g, (R4833348786910499294) null);
        this.a = true;
        Object q = V16504496955554646429.q(this.b, b16233345865283492429, this);
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        return q == z3437138737604933638 ? z3437138737604933638 : q;
    }
}
