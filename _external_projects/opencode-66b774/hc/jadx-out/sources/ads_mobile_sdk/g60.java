package ads_mobile_sdk;

import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q17277826507596233195;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class g60 extends cu0 {
    private static final g60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private int bitField0_;
    private int id_;
    private int resourceId_;
    private String tag_ = "";
    private R17185427375111049466 childIds_ = jb1.e;
    private O6641393078261985068 attribute_ = in2.e;
    private sq innerHtml_ = sq.b;

    static {
        g60 g60Var = new g60();
        DEFAULT_INSTANCE = g60Var;
        cu0.a(g60.class, g60Var);
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"bitField0_", "id_", "tag_", "childIds_", "resourceId_", "attribute_", e60.class, "innerHtml_"});
        }
        if (iE == 3) {
            return new g60();
        }
        if (iE != 4) {
            return null;
        }
        return new Q17277826507596233195(DEFAULT_INSTANCE);
    }
}
