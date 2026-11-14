package ads_mobile_sdk;

import dev.epro.r0.F6899175859206092457;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.N4024785987441166868;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class j23 extends c61 {
    public final W5797197595347441198 c;
    public final jr0 d;
    public final zj1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j23(W5797197595347441198 w5797197595347441198, jr0 jr0Var, zj1 zj1Var) {
        super((wv0) null, 1);
        w5797197595347441198.getClass();
        jr0Var.getClass();
        zj1Var.getClass();
        this.c = w5797197595347441198;
        this.d = jr0Var;
        this.e = zj1Var;
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        F6899175859206092457 f6899175859206092457 = this.d.s;
        f6899175859206092457.getClass();
        if (((Boolean) f6899175859206092457.a("gads:initialize_sdk_core_as_init_task:enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
            N4024785987441166868 n4024785987441166868 = new N4024785987441166868(this, null, (byte) 13);
            W5797197595347441198 w5797197595347441198 = this.c;
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(n4024785987441166868, null, (byte) 1), 2);
        }
        return new xu0(O9245300239821758723.a);
    }
}
