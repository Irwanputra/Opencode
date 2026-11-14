package ads_mobile_sdk;

import android.os.Build;
import dev.epro.r0.S2322588539201815831;
import dev.epro.r0.T1335862270807194835;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class g1 extends cu0 {
    private static final g1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int androidApiVersion_;
    private int bitField0_;
    private long versionCode_;
    private gn1 pools_ = gn1.b;
    private String packageName_ = "";
    private String deviceModel_ = "";
    private String consentStringHash_ = "";

    static {
        g1 g1Var = new g1();
        DEFAULT_INSTANCE = g1Var;
        cu0.a(g1.class, g1Var);
    }

    public static g1 q() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u00012\u0002ለ\u0000\u0003ဂ\u0001\u0004ለ\u0002\u0005င\u0003\u0006ለ\u0004", new Object[]{"bitField0_", "pools_", new dn1(ft3.d, ft3.f, vr0.p()), "packageName_", "versionCode_", "deviceModel_", "androidApiVersion_", "consentStringHash_"});
        }
        if (e2 == 3) {
            return new g1();
        }
        if (e2 != 4) {
            return null;
        }
        return new S2322588539201815831(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.consentStringHash_ = str;
    }

    public final void c(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.bitField0_ |= 4;
        this.deviceModel_ = str2;
    }

    public final void d(String str) {
        this.bitField0_ |= 1;
        this.packageName_ = str;
    }

    public final int o() {
        return this.androidApiVersion_;
    }

    public final String p() {
        return this.consentStringHash_;
    }

    public final String r() {
        return this.deviceModel_;
    }

    public final gn1 s() {
        gn1 gn1Var = this.pools_;
        if (gn1Var.a) {
            return gn1Var;
        }
        gn1 b = gn1Var.b();
        this.pools_ = b;
        return b;
    }

    public final String t() {
        return this.packageName_;
    }

    public final Map u() {
        return Collections.unmodifiableMap(this.pools_);
    }

    public final long v() {
        return this.versionCode_;
    }

    public static g1 a(FileInputStream fileInputStream) {
        cu0 a = cu0.a(DEFAULT_INSTANCE, new su(fileInputStream), nl0.a());
        cu0.a(a);
        return (g1) a;
    }
}
