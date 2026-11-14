package ads_mobile_sdk;

import dev.epro.r0.G6043217313194465797;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class a8 extends cu0 {
    private static final a8 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private m7 clientPingMetadata_;
    private O6641393078261985068 payloads_ = in2.e;

    static {
        a8 a8Var = new a8();
        DEFAULT_INSTANCE = a8Var;
        cu0.a(a8.class, a8Var);
    }

    public static G6043217313194465797 o() {
        return (G6043217313194465797) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "payloads_", y7.class, "clientPingMetadata_"});
        }
        if (iE == 3) {
            return new a8();
        }
        if (iE != 4) {
            return null;
        }
        return new G6043217313194465797(DEFAULT_INSTANCE);
    }

    public final void a(y7 y7Var) {
        O6641393078261985068 o6641393078261985068B = this.payloads_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.payloads_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(y7Var);
    }

    public final void a(m7 m7Var) {
        Objects.requireNonNull(m7Var);
        this.clientPingMetadata_ = m7Var;
        this.bitField0_ |= 1;
    }
}
