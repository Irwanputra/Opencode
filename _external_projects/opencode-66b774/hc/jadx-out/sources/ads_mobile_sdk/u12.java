package ads_mobile_sdk;

import dev.epro.r0.G10308367458345557237;
import dev.epro.r0.M18113111391818111737;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class u12 implements G10308367458345557237 {
    public final bq1 a;
    public final Optional b;
    public final W5797197595347441198 c;

    public u12(bq1 bq1Var, Optional optional, W5797197595347441198 w5797197595347441198) {
        bq1Var.getClass();
        optional.getClass();
        w5797197595347441198.getClass();
        this.a = bq1Var;
        this.b = optional;
        this.c = w5797197595347441198;
    }

    @Override // dev.epro.r0.G10308367458345557237
    public final Object b(qo3 qo3Var, R4833348786910499294 r4833348786910499294) {
        int i;
        tx0 tx0Var = (tx0) M18113111391818111737.H(this.b);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (tx0Var == null || ((i = qo3Var.a) != 1 && i != 2)) {
            return o9245300239821758723;
        }
        R7033599853981556291.E(this.c, null, null, new fb((Object) this, (Object) tx0Var, (R4833348786910499294) null, (byte) 19), 3);
        return o9245300239821758723;
    }
}
