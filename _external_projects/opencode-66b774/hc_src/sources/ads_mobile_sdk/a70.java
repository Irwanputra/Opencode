package ads_mobile_sdk;

import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.U1061257129253093767;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class a70 extends cu0 {
    private static final a70 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private gn1 concatenatedSignalsMap_ = gn1.b;
    private pb2 patternMatchingFlag_;
    private uh2 preProcessingFlag_;

    static {
        a70 a70Var = new a70();
        DEFAULT_INSTANCE = a70Var;
        cu0.a(a70.class, a70Var);
    }

    public static a70 p() {
        return DEFAULT_INSTANCE;
    }

    public static U1061257129253093767 s() {
        return (U1061257129253093767) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i);
        if (e2 == 2) {
            E2581631045160024594 e2581631045160024594 = ft3.d;
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00032", new Object[]{"bitField0_", "patternMatchingFlag_", "preProcessingFlag_", "concatenatedSignalsMap_", new dn1(e2581631045160024594, e2581631045160024594, "")});
        }
        if (e2 == 3) {
            return new a70();
        }
        if (e2 != 4) {
            return null;
        }
        return new U1061257129253093767(DEFAULT_INSTANCE);
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.concatenatedSignalsMap_);
    }

    public final pb2 q() {
        pb2 pb2Var = this.patternMatchingFlag_;
        return pb2Var == null ? pb2.o() : pb2Var;
    }

    public final uh2 r() {
        uh2 uh2Var = this.preProcessingFlag_;
        return uh2Var == null ? uh2.o() : uh2Var;
    }

    public final void a(pb2 pb2Var) {
        this.patternMatchingFlag_ = pb2Var;
        this.bitField0_ |= 1;
    }

    public final void a(uh2 uh2Var) {
        this.preProcessingFlag_ = uh2Var;
        this.bitField0_ |= 2;
    }

    public static a70 a(FileInputStream fileInputStream) {
        cu0 a = cu0.a(DEFAULT_INSTANCE, new su(fileInputStream), nl0.a());
        cu0.a(a);
        return (a70) a;
    }
}
