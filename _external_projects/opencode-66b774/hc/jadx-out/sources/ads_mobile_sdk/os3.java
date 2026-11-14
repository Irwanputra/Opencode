package ads_mobile_sdk;

import dev.epro.r0.I16631908410500040363;
import dev.epro.r0.L1518091290833714583;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class os3 implements L1518091290833714583 {
    public final W5797197595347441198 a;
    public final Optional b;

    public os3(W5797197595347441198 w5797197595347441198, Optional optional) {
        w5797197595347441198.getClass();
        optional.getClass();
        this.a = w5797197595347441198;
        this.b = optional;
    }

    @Override // dev.epro.r0.L1518091290833714583
    public final O9245300239821758723 a(boolean z) {
        tx0 tx0Var = (tx0) M18113111391818111737.H(this.b);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (tx0Var == null) {
            return o9245300239821758723;
        }
        String str = z ? "1" : "0";
        I16631908410500040363 i16631908410500040363 = new I16631908410500040363();
        i16631908410500040363.t("isVisible", str);
        R7033599853981556291.E(this.a, null, null, new aq1(tx0Var, i16631908410500040363, null, (byte) 1), 3);
        return o9245300239821758723;
    }
}
