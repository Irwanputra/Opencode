package ads_mobile_sdk;

import dev.epro.r0.A13333228626634894082;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qv0 extends cu0 {
    private static final qv0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private xt clientPingMetadata_;
    private O6641393078261985068 payloads_ = in2.e;

    static {
        qv0 qv0Var = new qv0();
        DEFAULT_INSTANCE = qv0Var;
        cu0.a(qv0.class, qv0Var);
    }

    public static A13333228626634894082 o() {
        return (A13333228626634894082) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "payloads_", pv0.class, "clientPingMetadata_"});
        }
        if (e == 3) {
            return new qv0();
        }
        if (e != 4) {
            return null;
        }
        return new A13333228626634894082(DEFAULT_INSTANCE);
    }

    public final void a(pv0 pv0Var) {
        O6641393078261985068 o6641393078261985068 = this.payloads_;
        if (!((j) o6641393078261985068).a) {
            o6641393078261985068 = T8598786036980488824.b(o6641393078261985068);
            this.payloads_ = o6641393078261985068;
        }
        o6641393078261985068.add(pv0Var);
    }

    public final void a(xt xtVar) {
        this.clientPingMetadata_ = xtVar;
        this.bitField0_ |= 1;
    }
}
