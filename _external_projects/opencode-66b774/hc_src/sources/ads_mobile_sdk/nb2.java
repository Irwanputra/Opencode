package ads_mobile_sdk;

import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.T1335862270807194835;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class nb2 extends cu0 {
    private static final nb2 DEFAULT_INSTANCE;
    public static final int c = 9;
    public static final int d = 1;
    public static final int e = 11;
    public static final int f = 12;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 13;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 7;
    public static final int n = 8;

    /* renamed from: o, reason: collision with root package name */
    public static final int f79o = 10;
    public static final int p = 14;
    private boolean allowCompression_;
    private boolean allowCookies_;
    private O6641393078261985068 allowedKeys_;
    private O6641393078261985068 andRules_;
    private String baseUrl_;
    private int bitField0_;
    private O6641393078261985068 blobUrlKeys_;
    private O6641393078261985068 consoleLogs_;
    private O6641393078261985068 elseRules_;
    private int errorCode_;
    private String errorString_;
    private O6641393078261985068 includeSignals_;
    private vm1 pattern_;
    private gn1 include_ = gn1.b;
    private String ruleLabel_ = "";

    static {
        nb2 nb2Var = new nb2();
        DEFAULT_INSTANCE = nb2Var;
        cu0.a(nb2.class, nb2Var);
    }

    public nb2() {
        in2 in2Var = in2.e;
        this.andRules_ = in2Var;
        this.elseRules_ = in2Var;
        this.includeSignals_ = in2Var;
        this.blobUrlKeys_ = in2Var;
        this.allowedKeys_ = in2Var;
        this.consoleLogs_ = in2Var;
        this.errorString_ = "";
        this.baseUrl_ = "";
    }

    public final String A() {
        return this.ruleLabel_;
    }

    public final boolean B() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i2);
        if (e2 == 2) {
            E2581631045160024594 e2581631045160024594 = ft3.d;
            return new ps2(DEFAULT_INSTANCE, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0001\u0006\u0000\u0001ဉ\u0001\u00022\u0003\u001b\u0004Ț\u0005Ț\u0006ለ\u0002\u0007င\u0003\bለ\u0004\tለ\u0000\nဇ\u0005\u000b\u001b\f\u001b\rȚ\u000eဇ\u0006", new Object[]{"bitField0_", "pattern_", "include_", new dn1(e2581631045160024594, e2581631045160024594, ""), "includeSignals_", a41.class, "blobUrlKeys_", "consoleLogs_", "errorString_", "errorCode_", "baseUrl_", "ruleLabel_", "allowCookies_", "andRules_", nb2.class, "elseRules_", nb2.class, "allowedKeys_", "allowCompression_"});
        }
        if (e2 == 3) {
            return new nb2();
        }
        if (e2 != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }

    public final boolean o() {
        return this.allowCookies_;
    }

    public final O6641393078261985068 p() {
        return this.allowedKeys_;
    }

    public final O6641393078261985068 q() {
        return this.andRules_;
    }

    public final String r() {
        return this.baseUrl_;
    }

    public final O6641393078261985068 s() {
        return this.blobUrlKeys_;
    }

    public final O6641393078261985068 t() {
        return this.consoleLogs_;
    }

    public final O6641393078261985068 u() {
        return this.elseRules_;
    }

    public final int v() {
        return this.errorCode_;
    }

    public final String w() {
        return this.errorString_;
    }

    public final Map x() {
        return Collections.unmodifiableMap(this.include_);
    }

    public final O6641393078261985068 y() {
        return this.includeSignals_;
    }

    public final vm1 z() {
        vm1 vm1Var = this.pattern_;
        return vm1Var == null ? vm1.p() : vm1Var;
    }
}
