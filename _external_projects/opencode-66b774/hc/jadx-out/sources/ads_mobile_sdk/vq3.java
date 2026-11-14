package ads_mobile_sdk;

import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.L1518091290833714583;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class vq3 implements L1518091290833714583 {
    public final Optional a;
    public final W5797197595347441198 b;
    public final jr0 c;

    public vq3(Optional optional, W5797197595347441198 w5797197595347441198, jr0 jr0Var) {
        optional.getClass();
        w5797197595347441198.getClass();
        jr0Var.getClass();
        this.a = optional;
        this.b = w5797197595347441198;
        this.c = jr0Var;
    }

    @Override // dev.epro.r0.L1518091290833714583
    public final O9245300239821758723 a(boolean z) {
        tx0 tx0Var;
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        boolean zBooleanValue = ((Boolean) jr0Var.a("gads:pause_webview_when_not_visible", Boolean.TRUE, ao.a$11)).booleanValue();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (zBooleanValue && (tx0Var = (tx0) M18113111391818111737.H(this.a)) != null) {
            I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
            W5797197595347441198 w5797197595347441198 = this.b;
            if (z) {
                ex0 ex0Var = new ex0(tx0Var, null, (byte) 5);
                w5797197595347441198.getClass();
                R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(ex0Var, null, (byte) 1), 2);
                return o9245300239821758723;
            }
            ex0 ex0Var2 = new ex0(tx0Var, null, (byte) 6);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(ex0Var2, null, (byte) 1), 2);
        }
        return o9245300239821758723;
    }
}
