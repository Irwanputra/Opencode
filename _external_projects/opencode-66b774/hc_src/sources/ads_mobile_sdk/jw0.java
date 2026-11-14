package ads_mobile_sdk;

import dev.epro.r0.I9118511705381956114;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class jw0 extends cu0 {
    private static final jw0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private xt clientPingMetadata_;
    private O6641393078261985068 payloads_ = in2.e;

    static {
        jw0 jw0Var = new jw0();
        DEFAULT_INSTANCE = jw0Var;
        cu0.a(jw0.class, jw0Var);
    }

    public static I9118511705381956114 o() {
        return (I9118511705381956114) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "payloads_", iw0.class, "clientPingMetadata_"});
        }
        if (e == 3) {
            return new jw0();
        }
        if (e != 4) {
            return null;
        }
        return new I9118511705381956114(DEFAULT_INSTANCE);
    }

    public final void a(iw0 iw0Var) {
        O6641393078261985068 o6641393078261985068 = this.payloads_;
        if (!((j) o6641393078261985068).a) {
            o6641393078261985068 = T8598786036980488824.b(o6641393078261985068);
            this.payloads_ = o6641393078261985068;
        }
        o6641393078261985068.add(iw0Var);
    }

    public final void a(xt xtVar) {
        this.clientPingMetadata_ = xtVar;
        this.bitField0_ |= 1;
    }
}
