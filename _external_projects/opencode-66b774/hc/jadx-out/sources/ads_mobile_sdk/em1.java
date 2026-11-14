package ads_mobile_sdk;

import dev.epro.r0.A12898437406648192953;
import dev.epro.r0.T1335862270807194835;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class em1 extends cu0 {
    private static final em1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    private int bitField0_;
    private long eventCount_;
    private long eventId_;
    private long runtimeMs_;
    private int status_;
    private String exceptionName_ = "";
    private String stackTrace_ = "";
    private String debugInfo_ = "";

    static {
        em1 em1Var = new em1();
        DEFAULT_INSTANCE = em1Var;
        cu0.a(em1.class, em1Var);
    }

    public static A12898437406648192953 o() {
        return (A12898437406648192953) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဈ\u0006", new Object[]{"bitField0_", "eventId_", "runtimeMs_", "status_", ad.a$15, "exceptionName_", "stackTrace_", "eventCount_", "debugInfo_"});
        }
        if (iE == 3) {
            return new em1();
        }
        if (iE != 4) {
            return null;
        }
        return new A12898437406648192953(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.debugInfo_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 8;
        this.exceptionName_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.stackTrace_ = str;
    }
}
