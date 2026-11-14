package ads_mobile_sdk;

import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.L14515889287724438211;
import dev.epro.r0.T1335862270807194835;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class iz extends cu0 {
    private static final iz DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private ax consentAllowlist_;
    private pb2 patternMatchingFlag_;
    private uh2 preProcessingFlag_;
    private gn1 concatenatedSignalsMap_ = gn1.b;
    private String consentStringJson_ = "";
    private String consentStateJson_ = "";

    static {
        iz izVar = new iz();
        DEFAULT_INSTANCE = izVar;
        cu0.a(iz.class, izVar);
    }

    public static iz s() {
        return DEFAULT_INSTANCE;
    }

    public static L14515889287724438211 w() {
        return (L14515889287724438211) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            E2581631045160024594 e2581631045160024594 = ft3.d;
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u00052\u0006ဉ\u0004", new Object[]{"bitField0_", "consentStringJson_", "consentStateJson_", "patternMatchingFlag_", "preProcessingFlag_", "concatenatedSignalsMap_", new dn1(e2581631045160024594, e2581631045160024594, ""), "consentAllowlist_"});
        }
        if (e2 == 3) {
            return new iz();
        }
        if (e2 != 4) {
            return null;
        }
        return new L14515889287724438211(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        this.bitField0_ |= 2;
        this.consentStateJson_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 1;
        this.consentStringJson_ = str;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.concatenatedSignalsMap_);
    }

    public final ax p() {
        ax axVar = this.consentAllowlist_;
        return axVar == null ? ax.r() : axVar;
    }

    public final String q() {
        return this.consentStateJson_;
    }

    public final String r() {
        return this.consentStringJson_;
    }

    public final pb2 t() {
        pb2 pb2Var = this.patternMatchingFlag_;
        return pb2Var == null ? pb2.o() : pb2Var;
    }

    public final uh2 u() {
        uh2 uh2Var = this.preProcessingFlag_;
        return uh2Var == null ? uh2.o() : uh2Var;
    }

    public final boolean v() {
        return (this.bitField0_ & 4) != 0;
    }

    public final void a(ax axVar) {
        this.consentAllowlist_ = axVar;
        this.bitField0_ |= 16;
    }
}
