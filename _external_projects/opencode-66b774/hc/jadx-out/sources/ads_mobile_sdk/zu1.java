package ads_mobile_sdk;

import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.T16895755319777707412;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class zu1 extends cu0 {
    private static final zu1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private gn1 adUnitToUseMediaView_ = gn1.b;
    private long appVersionCode_;

    static {
        zu1 zu1Var = new zu1();
        DEFAULT_INSTANCE = zu1Var;
        cu0.a(zu1.class, zu1Var);
    }

    public static zu1 q() {
        return DEFAULT_INSTANCE;
    }

    public static T16895755319777707412 r() {
        return (T16895755319777707412) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u00022", new Object[]{"appVersionCode_", "adUnitToUseMediaView_", new dn1(ft3.d, ft3.c, Boolean.FALSE)});
        }
        if (iE == 3) {
            return new zu1();
        }
        if (iE != 4) {
            return null;
        }
        return new T16895755319777707412(DEFAULT_INSTANCE);
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.adUnitToUseMediaView_);
    }

    public final long p() {
        return this.appVersionCode_;
    }

    public static zu1 a(FileInputStream fileInputStream) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, new su(fileInputStream), nl0.a());
        cu0.a(cu0VarA);
        return (zu1) cu0VarA;
    }
}
