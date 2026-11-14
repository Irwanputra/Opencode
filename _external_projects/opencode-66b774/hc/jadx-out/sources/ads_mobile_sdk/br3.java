package ads_mobile_sdk;

import dev.epro.r0.H4546125934900659656;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S3216761178606715008;
import dev.epro.r0.W5797197595347441198;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class br3 implements S3216761178606715008 {
    public final bs3 a;
    public final jr0 b;

    public br3(bs3 bs3Var, jr0 jr0Var) {
        bs3Var.getClass();
        jr0Var.getClass();
        this.a = bs3Var;
        this.b = jr0Var;
    }

    @Override // dev.epro.r0.S3216761178606715008
    public final Object b(R4833348786910499294 r4833348786910499294) {
        jr0 jr0Var = this.b;
        jr0Var.getClass();
        if (((Boolean) jr0Var.a("gads:webview_optimize_profile:enabled", Boolean.TRUE, ao.a$11)).booleanValue()) {
            bs3 bs3Var = this.a;
            W5797197595347441198 w5797197595347441198 = bs3Var.e;
            H4546125934900659656 h4546125934900659656 = new H4546125934900659656(bs3Var, null, (byte) 21);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(h4546125934900659656, null, (byte) 1), 2);
        }
        return O9245300239821758723.a;
    }
}
