package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;
import dev.epro.r0.Y12531765857967015337;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class g6 extends cu0 {
    private static final g6 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long lastAccessTimeMs_;
    private O6641393078261985068 responses_ = in2.e;

    static {
        g6 g6Var = new g6();
        DEFAULT_INSTANCE = g6Var;
        cu0.a(g6.class, g6Var);
    }

    public static g6 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"bitField0_", "responses_", b6.class, "lastAccessTimeMs_"});
        }
        if (iE == 3) {
            return new g6();
        }
        if (iE != 4) {
            return null;
        }
        return new Y12531765857967015337(DEFAULT_INSTANCE);
    }

    public final long p() {
        return this.lastAccessTimeMs_;
    }

    public final int q() {
        return this.responses_.size();
    }

    public final O6641393078261985068 r() {
        return this.responses_;
    }

    public final void a(b6 b6Var) {
        O6641393078261985068 o6641393078261985068B = this.responses_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.responses_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(b6Var);
    }

    public final void a(int i, b6 b6Var) {
        O6641393078261985068 o6641393078261985068B = this.responses_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.responses_ = o6641393078261985068B;
        }
        o6641393078261985068B.set(i, b6Var);
    }
}
