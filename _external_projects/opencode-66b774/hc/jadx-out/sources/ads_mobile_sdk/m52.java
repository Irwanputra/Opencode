package ads_mobile_sdk;

import dev.epro.r0.B13729205492206812220;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P9893650590651797888;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class m52 extends P9893650590651797888 implements B13729205492206812220 {
    public final /* synthetic */ m6 a;
    public final /* synthetic */ byte i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m52(m6 m6Var, byte b) {
        super(0);
        this.i = b;
        this.a = m6Var;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.i;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        m6 m6Var = this.a;
        switch (b) {
            case 0:
                m6Var.a();
                break;
            default:
                m6Var.b();
                break;
        }
        return o9245300239821758723;
    }
}
