package ads_mobile_sdk;

import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.K15899002224316188312;
import dev.epro.r0.T1335862270807194835;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class qa extends cu0 {
    private static final qa DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private gn1 extras_ = gn1.b;
    private String format_ = "";

    static {
        qa qaVar = new qa();
        DEFAULT_INSTANCE = qaVar;
        cu0.a(qa.class, qaVar);
    }

    public static K15899002224316188312 q() {
        return (K15899002224316188312) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            E2581631045160024594 e2581631045160024594 = ft3.d;
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ለ\u0000\u00022", new Object[]{"bitField0_", "format_", "extras_", new dn1(e2581631045160024594, e2581631045160024594, "")});
        }
        if (iE == 3) {
            return new qa();
        }
        if (iE != 4) {
            return null;
        }
        return new K15899002224316188312(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        this.bitField0_ |= 1;
        this.format_ = str;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.extras_);
    }

    public final String p() {
        return this.format_;
    }
}
