package ads_mobile_sdk;

import dev.epro.r0.M1656182982150902219;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class j50 extends cu0 {
    private static final j50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    private int adResourceType_;
    private int bitField0_;
    private int id_;
    private int parentId_;
    private l40 request_;
    private p40 response_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private R17185427375111049466 childIds_ = jb1.e;
    private String tagName_ = "";
    private O6641393078261985068 matchedBlacklist_ = in2.e;

    static {
        j50 j50Var = new j50();
        DEFAULT_INSTANCE = j50Var;
        cu0.a(j50.class, j50Var);
    }

    public static M1656182982150902219 o() {
        return (M1656182982150902219) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i2, cu0 cu0Var) {
        int e2 = T1335862270807194835.e(i2);
        if (e2 == 0) {
            return Byte.valueOf(this.memoizedIsInitialized);
        }
        if (e2 == 1) {
            this.memoizedIsInitialized = (byte) (cu0Var == null ? 0 : 1);
            return null;
        }
        if (e2 == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"bitField0_", "id_", "url_", "request_", "response_", "parentId_", "childIds_", "tagName_", "adResourceType_", ad.a$14, "matchedBlacklist_"});
        }
        if (e2 == 3) {
            return new j50();
        }
        if (e2 != 4) {
            return null;
        }
        return new M1656182982150902219(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.url_ = str;
    }

    public final void a(l40 l40Var) {
        this.request_ = l40Var;
        this.bitField0_ |= 4;
    }
}
