package ads_mobile_sdk;

import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.Y5584543079932758380;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class cq0 extends cu0 {
    private static final cq0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 8;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private int bitField0_;
    private iz consentState_;
    private boolean hasSdkInitializedPreviously_;
    private int sessionsSinceUpdate_;
    private gn1 storedSdkCoreData_ = gn1.b;
    private String flagJson_ = "";
    private String cachedUserAgent_ = "";

    static {
        cq0 cq0Var = new cq0();
        DEFAULT_INSTANCE = cq0Var;
        cu0.a(cq0.class, cq0Var);
    }

    public static cq0 q() {
        return DEFAULT_INSTANCE;
    }

    public static Y5584543079932758380 v() {
        return (Y5584543079932758380) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            E2581631045160024594 e2581631045160024594 = ft3.d;
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u00052\u0006ဉ\u0003\u0007ለ\u0004\bဇ\u0002", new Object[]{"bitField0_", "flagJson_", "sessionsSinceUpdate_", "storedSdkCoreData_", new dn1(e2581631045160024594, e2581631045160024594, ""), "consentState_", "cachedUserAgent_", "hasSdkInitializedPreviously_"});
        }
        if (iE == 3) {
            return new cq0();
        }
        if (iE != 4) {
            return null;
        }
        return new Y5584543079932758380(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.cachedUserAgent_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 1;
        this.flagJson_ = str;
    }

    public final String o() {
        return this.cachedUserAgent_;
    }

    public final iz p() {
        iz izVar = this.consentState_;
        return izVar == null ? iz.s() : izVar;
    }

    public final String r() {
        return this.flagJson_;
    }

    public final boolean s() {
        return this.hasSdkInitializedPreviously_;
    }

    public final int t() {
        return this.sessionsSinceUpdate_;
    }

    public final Map u() {
        return Collections.unmodifiableMap(this.storedSdkCoreData_);
    }

    public final void a(iz izVar) {
        Objects.requireNonNull(izVar);
        this.consentState_ = izVar;
        this.bitField0_ |= 8;
    }

    public static cq0 a(FileInputStream fileInputStream) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, new su(fileInputStream), nl0.a());
        cu0.a(cu0VarA);
        return (cq0) cu0VarA;
    }
}
