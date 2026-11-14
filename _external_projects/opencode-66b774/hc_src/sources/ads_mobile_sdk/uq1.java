package ads_mobile_sdk;

import dev.epro.r0.E17665849472693074628;
import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.L12639328004344855510;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class uq1 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ zq1 b;
    public final /* synthetic */ tx0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq1(zq1 zq1Var, tx0 tx0Var, int i, int i2, int i3, int i4, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = zq1Var;
        this.c = tx0Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new uq1(this.b, this.c, this.d, this.e, this.f, this.g, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((uq1) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.B401944902727389462
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (z) {
            if (z) {
                E17665849472693074628.k(obj);
                return o9245300239821758723;
            }
            S10973172697741180971.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        E17665849472693074628.k(obj);
        bq1 bq1Var = this.b.c;
        this.a = true;
        bq1Var.getClass();
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.s("x", new Integer(this.d));
        i16631908410500040363.s("y", new Integer(this.e));
        i16631908410500040363.s("width", new Integer(this.f));
        i16631908410500040363.s("height", new Integer(this.g));
        Object a = this.c.a(i16631908410500040363, "onDefaultPositionReceived", this);
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (a != z3437138737604933638) {
            a = o9245300239821758723;
        }
        return a == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
    }
}
