package ads_mobile_sdk;

import dev.epro.r0.E1738554508920355622;
import dev.epro.r0.F11004654978627682545;
import dev.epro.r0.I12024973293062010767;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R16580349318584449994;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S3216761178606715008;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class k80 extends c61 implements S3216761178606715008, I12024973293062010767, E1738554508920355622 {
    public final i80 c;
    public final W5797197595347441198 d;
    public final jr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k80(i80 i80Var, W5797197595347441198 w5797197595347441198, jr0 jr0Var) {
        super((wv0) null, 1);
        i80Var.getClass();
        w5797197595347441198.getClass();
        jr0Var.getClass();
        this.c = i80Var;
        this.d = w5797197595347441198;
        this.e = jr0Var;
    }

    @Override // dev.epro.r0.I12024973293062010767
    public final Object a(d33 d33Var, z1 z1Var, F11004654978627682545 f11004654978627682545, R4833348786910499294 r4833348786910499294) {
        jr0 jr0Var = this.e;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:cct_v2_prewarm_on_ad_loaded:enabled", Boolean.FALSE, ao.a$11)).booleanValue()) {
            b$1();
        }
        return O9245300239821758723.a;
    }

    public final void b$1() {
        R16580349318584449994 r16580349318584449994 = new R16580349318584449994(this, null, (byte) 10);
        W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(r16580349318584449994, null, (byte) 1), 2);
    }

    @Override // dev.epro.r0.S3216761178606715008
    public final void f() {
        jr0 jr0Var = this.e;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:cct_v2_prewarm_on_signal_generated:enabled", Boolean.FALSE, ao.a$11)).booleanValue()) {
            b$1();
        }
    }

    @Override // ads_mobile_sdk.c61
    public final Object h(R4833348786910499294 r4833348786910499294) {
        jr0 jr0Var = this.e;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:cct_v2_prewarm_at_init:enabled", Boolean.FALSE, ao.a$11)).booleanValue()) {
            b$1();
        }
        return new xu0(O9245300239821758723.a);
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object q(R4833348786910499294 r4833348786910499294) {
        jr0 jr0Var = this.e;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:cct_v2_prewarm_on_impression:enabled", Boolean.FALSE, ao.a$11)).booleanValue()) {
            b$1();
        }
        return O9245300239821758723.a;
    }
}
