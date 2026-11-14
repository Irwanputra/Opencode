package ads_mobile_sdk;

import dev.epro.r0.B4259731004323267459;
import dev.epro.r0.N5829968851568792302;
import dev.epro.r0.R17185427375111049466;
import dev.epro.r0.T1335862270807194835;
import dev.epro.r0.Y2677586711477821327;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ax extends cu0 {
    private static final ax DEFAULT_INSTANCE;
    private static final B4259731004323267459 allowedApis_converter_ = new Y2677586711477821327((byte) 15);
    public static final int c = 1;
    private int allowedApisMemoizedSerializedSize;
    private R17185427375111049466 allowedApis_ = jb1.e;

    static {
        ax axVar = new ax();
        DEFAULT_INSTANCE = axVar;
        cu0.a(ax.class, axVar);
    }

    public static ax r() {
        return DEFAULT_INSTANCE;
    }

    public static N5829968851568792302 s() {
        return (N5829968851568792302) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final Object a(int i, cu0 cu0Var) {
        int iE = T1335862270807194835.e(i);
        if (iE == 2) {
            return new ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"allowedApis_"});
        }
        if (iE == 3) {
            return new ax();
        }
        if (iE != 4) {
            return null;
        }
        return new N5829968851568792302(DEFAULT_INSTANCE);
    }

    public final int o() {
        return ((jb1) this.allowedApis_).c;
    }

    public final ob1 p() {
        return new ob1(this.allowedApis_, allowedApis_converter_);
    }

    public final R17185427375111049466 q() {
        return this.allowedApis_;
    }

    public final void a(yw ywVar) {
        RandomAccess randomAccess = this.allowedApis_;
        boolean z = ((j) randomAccess).a;
        RandomAccess randomAccess2 = randomAccess;
        if (!z) {
            jb1 jb1Var = (jb1) randomAccess;
            jb1 jb1VarA = jb1Var.a(jb1Var.c * 2);
            this.allowedApis_ = jb1VarA;
            randomAccess2 = jb1VarA;
        }
        ((jb1) randomAccess2).b(ywVar.getNumber());
    }

    public static ax a(byte[] bArr) throws yi1 {
        cu0 cu0VarA = cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, nl0.a());
        cu0.a(cu0VarA);
        return (ax) cu0VarA;
    }
}
