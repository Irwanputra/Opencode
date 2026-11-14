package ads_mobile_sdk;

import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.H1850504041015929188;
import dev.epro.r0.T1335862270807194835;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ap extends cu0 {
    private static final ap DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private boolean shouldCollectSignalsOnFullApp_;
    private boolean shouldGatherSignals_;
    private gn1 serverParameters_ = gn1.b;
    private String adapterClassName_ = "";
    private String platform_ = "";

    static {
        ap apVar = new ap();
        DEFAULT_INSTANCE = apVar;
        cu0.a(ap.class, apVar);
    }

    public static ap o() {
        return DEFAULT_INSTANCE;
    }

    public static H1850504041015929188 s() {
        return (H1850504041015929188) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            E2581631045160024594 e2581631045160024594 = ft3.d;
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ለ\u0003\u00052", new Object[]{"bitField0_", "adapterClassName_", "shouldGatherSignals_", "shouldCollectSignalsOnFullApp_", "platform_", "serverParameters_", new dn1(e2581631045160024594, e2581631045160024594, "")});
        }
        if (iE == 3) {
            return new ap();
        }
        if (iE != 4) {
            return null;
        }
        return new H1850504041015929188(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        this.bitField0_ |= 1;
        this.adapterClassName_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 8;
        this.platform_ = str;
    }

    public final gn1 p() {
        gn1 gn1Var = this.serverParameters_;
        if (gn1Var.a) {
            return gn1Var;
        }
        gn1 gn1VarB = gn1Var.b();
        this.serverParameters_ = gn1VarB;
        return gn1VarB;
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.serverParameters_);
    }

    public final boolean r() {
        return this.shouldCollectSignalsOnFullApp_;
    }
}
