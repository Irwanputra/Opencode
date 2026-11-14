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

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vq1 extends R14062301455140331524 implements L12639328004344855510 {
    public boolean a;
    public final /* synthetic */ zq1 b;
    public final /* synthetic */ tx0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq1(zq1 zq1Var, tx0 tx0Var, boolean z, boolean z2, boolean z3, boolean z4, R4833348786910499294 r4833348786910499294) {
        super(2, r4833348786910499294);
        this.b = zq1Var;
        this.c = tx0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
    }

    @Override // dev.epro.r0.B401944902727389462
    public final R4833348786910499294 create(R4833348786910499294 r4833348786910499294, Object obj) {
        return new vq1(this.b, this.c, this.d, this.e, this.f, this.g, r4833348786910499294);
    }

    @Override // dev.epro.r0.L12639328004344855510
    public final Object invoke(Object obj, Object obj2) {
        return ((vq1) create((R4833348786910499294) obj2, (W5797197595347441198) obj)).invokeSuspend(O9245300239821758723.a);
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
        i16631908410500040363.r("sms", Boolean.valueOf(this.d));
        i16631908410500040363.r("tel", Boolean.valueOf(this.e));
        i16631908410500040363.r("calendar", Boolean.valueOf(this.f));
        i16631908410500040363.r("storePicture", Boolean.valueOf(this.g));
        i16631908410500040363.r("inlineVideo", Boolean.TRUE);
        Object objA = this.c.a(i16631908410500040363, "onDeviceFeaturesReceived", this);
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (objA != z3437138737604933638) {
            objA = o9245300239821758723;
        }
        return objA == z3437138737604933638 ? z3437138737604933638 : o9245300239821758723;
    }
}
