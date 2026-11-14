package ads_mobile_sdk;

import dev.epro.r0.B4259731004323267459;
import dev.epro.r0.G3252892568320898947;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.U11450443558875589191;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class cq extends cu0 {
    private static final cq DEFAULT_INSTANCE;
    public static final int c = 5;
    public static final int d = 4;
    private static final B4259731004323267459 dEPRECATEDAdapterBehavior_converter_ = new U11450443558875589191((byte) 14);
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    private int adapterBehaviorBitmap_;
    private bq adapterVersion_;
    private int bitField0_;
    private int dEPRECATEDAdapterBehaviorMemoizedSerializedSize;
    private zp error_;
    private boolean isPublisherCreated_;
    private long latencyMs_;
    private bq sdkVersion_;
    private String adapterClassName_ = "";
    private String buyerGeneratedRequestData_ = "";
    private R17185427375111049466 dEPRECATEDAdapterBehavior_ = jb1.e;

    static {
        cq cqVar = new cq();
        DEFAULT_INSTANCE = cqVar;
        cu0.a(cq.class, cqVar);
    }

    public static G3252892568320898947 o() {
        return (G3252892568320898947) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i2);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0001\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဈ\u0001\u0005ဈ\u0000\u0006ဇ\u0004\u0007ဉ\u0005\bဂ\u0006\tࠬ\nဋ\u0007", new Object[]{"bitField0_", "sdkVersion_", "adapterVersion_", "buyerGeneratedRequestData_", "adapterClassName_", "isPublisherCreated_", "error_", "latencyMs_", "dEPRECATEDAdapterBehavior_", tt.a$7, "adapterBehaviorBitmap_"});
        }
        if (e2 == 3) {
            return new cq();
        }
        if (e2 != 4) {
            return null;
        }
        return new G3252892568320898947(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.adapterClassName_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 2;
        this.buyerGeneratedRequestData_ = str;
    }

    public final void b(bq bqVar) {
        this.sdkVersion_ = bqVar;
        this.bitField0_ |= 4;
    }

    public final void a(bq bqVar) {
        this.adapterVersion_ = bqVar;
        this.bitField0_ |= 8;
    }

    public final void a(zp zpVar) {
        this.error_ = zpVar;
        this.bitField0_ |= 32;
    }
}
