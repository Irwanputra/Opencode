package ads_mobile_sdk;

import dev.epro.r0.B4259731004323267459;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.U11450443558875589191;
import dev.epro.r0.Y10223024091508858024;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ta extends cu0 {
    private static final ta DEFAULT_INSTANCE;
    private static final B4259731004323267459 allowedFormats_converter_ = new U11450443558875589191(12);
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private long adapterInitializationTimeoutMs_;
    private O6641393078261985068 allowedAdUnits_;
    private O6641393078261985068 allowedAdapterClasses_;
    private int allowedFormatsMemoizedSerializedSize;
    private R17185427375111049466 allowedFormats_ = jb1.e;
    private O6641393078261985068 excludedAdapterClasses_;
    private O6641393078261985068 initializedAdapterClasses_;

    static {
        ta taVar = new ta();
        DEFAULT_INSTANCE = taVar;
        cu0.a(ta.class, taVar);
    }

    public ta() {
        in2 in2Var = in2.e;
        this.allowedAdUnits_ = in2Var;
        this.allowedAdapterClasses_ = in2Var;
        this.excludedAdapterClasses_ = in2Var;
        this.initializedAdapterClasses_ = in2Var;
    }

    public static Y10223024091508858024 o() {
        return (Y10223024091508858024) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0005\u0000\u0001\u0002\u0002,\u0003Ț\u0004Ț\u0005Ț\u0006Ț", new Object[]{"adapterInitializationTimeoutMs_", "allowedFormats_", "allowedAdUnits_", "allowedAdapterClasses_", "excludedAdapterClasses_", "initializedAdapterClasses_"});
        }
        if (e2 == 3) {
            return new ta();
        }
        if (e2 != 4) {
            return null;
        }
        return new Y10223024091508858024(DEFAULT_INSTANCE);
    }
}
