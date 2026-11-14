package ads_mobile_sdk;

import android.os.Bundle;
import dev.epro.r0.H4546125934900659656;
import dev.epro.r0.H9390398899829886498;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.K3615309688696506893;
import dev.epro.r0.O5354877807466160604;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R12517428114166698439;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.U4857089234315512256;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z17140323912468745023;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class pm0 implements Z17140323912468745023, K3615309688696506893 {
    public final U4857089234315512256 a;
    public final um0 b;
    public final z1 c;
    public final W5797197595347441198 d;

    public pm0(U4857089234315512256 u4857089234315512256, um0 um0Var, z1 z1Var, W5797197595347441198 w5797197595347441198) {
        u4857089234315512256.getClass();
        um0Var.getClass();
        z1Var.getClass();
        w5797197595347441198.getClass();
        this.a = u4857089234315512256;
        this.b = um0Var;
        this.c = z1Var;
        this.d = w5797197595347441198;
    }

    @Override // dev.epro.r0.K3615309688696506893
    public final O9245300239821758723 a(R12517428114166698439 r12517428114166698439, R4833348786910499294 r4833348786910499294) {
        String e;
        Object a = this.b.a("generateEventId");
        String obj = a != null ? a.toString() : null;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (obj == null || (e = this.a.e()) == null) {
            return o9245300239821758723;
        }
        Bundle z = O5354877807466160604.z(new H9390398899829886498("_ai", e), new H9390398899829886498("reward_type", r12517428114166698439.getType()), new H9390398899829886498("reward_value", new Integer(r12517428114166698439.getAmount())));
        Bundle bundle = this.c.q;
        bundle.putBundle("_ar", z);
        H4546125934900659656 h4546125934900659656 = new H4546125934900659656(this, bundle, obj, (R4833348786910499294) null, (byte) 18);
        W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(h4546125934900659656, null, (byte) 1), 2);
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.Z17140323912468745023
    public final Object a(boolean z, R4833348786910499294 r4833348786910499294) {
        String e = this.a.e();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (e == null) {
            return o9245300239821758723;
        }
        fb fbVar = new fb(this, e, z, (R4833348786910499294) null);
        W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(fbVar, null, (byte) 1), 2);
        return o9245300239821758723;
    }
}
