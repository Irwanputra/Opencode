package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;
import dev.epro.r0.X1306963851013033444;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ch2 extends cu0 {
    private static final ch2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private O6641393078261985068 androidLifecycleEvents_ = in2.e;
    private long clickTimestampMs_;

    static {
        ch2 ch2Var = new ch2();
        DEFAULT_INSTANCE = ch2Var;
        cu0.a(ch2.class, ch2Var);
    }

    public static X1306963851013033444 o() {
        return (X1306963851013033444) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e = T1335862270807194835.e(i);
        if (e == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"androidLifecycleEvents_", ue.class, "clickTimestampMs_"});
        }
        if (e == 3) {
            return new ch2();
        }
        if (e != 4) {
            return null;
        }
        return new X1306963851013033444(DEFAULT_INSTANCE);
    }

    public final void a(ue ueVar) {
        O6641393078261985068 o6641393078261985068 = this.androidLifecycleEvents_;
        if (!((j) o6641393078261985068).a) {
            o6641393078261985068 = T8598786036980488824.b(o6641393078261985068);
            this.androidLifecycleEvents_ = o6641393078261985068;
        }
        o6641393078261985068.add(ueVar);
    }
}
