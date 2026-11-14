package ads_mobile_sdk;

import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.W17538889179347911592;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class b6 extends cu0 {
    private static final b6 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private long createTimeMs_;
    private int status_;
    private String filename_ = "";
    private String checksum_ = "";

    static {
        b6 b6Var = new b6();
        DEFAULT_INSTANCE = b6Var;
        cu0.a(b6.class, b6Var);
    }

    public static W17538889179347911592 s() {
        return (W17538889179347911592) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ለ\u0002\u0004ဌ\u0003", new Object[]{"bitField0_", "filename_", "createTimeMs_", "checksum_", "status_"});
        }
        if (iE == 3) {
            return new b6();
        }
        if (iE != 4) {
            return null;
        }
        return new W17538889179347911592(DEFAULT_INSTANCE);
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.checksum_ = str;
    }

    public final void c(String str) {
        this.bitField0_ |= 1;
        this.filename_ = str;
    }

    public final String o() {
        return this.checksum_;
    }

    public final long p() {
        return this.createTimeMs_;
    }

    public final String q() {
        return this.filename_;
    }

    public final int r$1() {
        int i = this.status_;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 3 : 2 : 1;
        if (i2 == 0) {
            return 4;
        }
        return i2;
    }
}
