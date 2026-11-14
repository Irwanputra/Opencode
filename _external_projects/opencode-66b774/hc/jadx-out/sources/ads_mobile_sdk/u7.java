package ads_mobile_sdk;

import android.os.Build;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.X8174393611044482612;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class u7 extends cu0 {
    private static final u7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int hostType_;
    private int osType_;
    private sq vmVersion_ = sq.b;
    private String model_ = "";
    private String appId_ = "";
    private String hostVersion_ = "";

    static {
        u7 u7Var = new u7();
        DEFAULT_INSTANCE = u7Var;
        cu0.a(u7.class, u7Var);
    }

    public static X8174393611044482612 o() {
        return (X8174393611044482612) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"bitField0_", "vmVersion_", "apiLevel_", "model_", "appId_", "appVersionCode_", "hostVersion_", "osType_", "hostType_"});
        }
        if (iE == 3) {
            return new u7();
        }
        if (iE != 4) {
            return null;
        }
        return new X8174393611044482612(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.appId_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.hostVersion_ = str;
    }

    public final void d(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.bitField0_ |= 4;
        this.model_ = str2;
    }

    public final void a(qq qqVar) {
        Objects.requireNonNull(qqVar);
        this.bitField0_ |= 1;
        this.vmVersion_ = qqVar;
    }
}
