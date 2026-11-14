package ads_mobile_sdk;

import android.os.Build;
import dev.epro.r0.L6589127411573323482;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T8598786036980488824;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class s7 extends cu0 {
    private static final s7 DEFAULT_INSTANCE;
    public static final int c = 8;
    public static final int d = 21;
    public static final int e = 22;
    public static final int f = 23;
    public static final int g = 24;
    public static final int h = 25;
    public static final int i = 40;
    public static final int j = 41;
    public static final int k = 60;
    public static final int l = 61;
    public static final int m = 62;
    public static final int n = 63;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f105o = 64;
    public static final int p = 65;
    public static final int q = 66;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int deviceType_;
    private int hostType_;
    private int osType_;
    private long requestedAdshieldVersion_;
    private long samplingDenominator_;
    private int experimentIdsMemoizedSerializedSize = -1;
    private O6641393078261985068 logEvents_ = in2.e;
    private String model_ = "";
    private String locale_ = "";
    private String country_ = "";
    private String appId_ = "";
    private String hostVersion_ = "";
    private String adshieldVersion_ = "";
    private R17185427375111049466 experimentIds_ = jb1.e;

    static {
        s7 s7Var = new s7();
        DEFAULT_INSTANCE = s7Var;
        cu0.a(s7.class, s7Var);
    }

    public static L6589127411573323482 o() {
        return (L6589127411573323482) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i2);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"bitField0_", "logEvents_", em1.class, "apiLevel_", "model_", "locale_", "country_", "deviceType_", ad.a$20, "appId_", "appVersionCode_", "hostVersion_", "adshieldVersion_", "samplingDenominator_", "requestedAdshieldVersion_", "experimentIds_", "hostType_", "osType_"});
        }
        if (iE == 3) {
            return new s7();
        }
        if (iE != 4) {
            return null;
        }
        return new L6589127411573323482(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.adshieldVersion_ = str;
    }

    public final void c(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.appId_ = str;
    }

    public final void d(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.country_ = str;
    }

    public final void e(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.hostVersion_ = str;
    }

    public final void f(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.locale_ = str;
    }

    public final void g(String str) {
        String str2 = Build.MODEL;
        Objects.requireNonNull(str2);
        this.bitField0_ |= 2;
        this.model_ = str2;
    }

    public final void a(em1 em1Var) {
        O6641393078261985068 o6641393078261985068B = this.logEvents_;
        if (!((j) o6641393078261985068B).a) {
            o6641393078261985068B = T8598786036980488824.b(o6641393078261985068B);
            this.logEvents_ = o6641393078261985068B;
        }
        o6641393078261985068B.add(em1Var);
    }
}
