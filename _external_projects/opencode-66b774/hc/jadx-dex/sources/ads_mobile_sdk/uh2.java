package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class uh2 extends ads_mobile_sdk.cu0 {
    private static final ads_mobile_sdk.uh2 DEFAULT_INSTANCE;
    public static final int c = 1;
    private dev.epro.r0.O6641393078261985068 rules_ = ads_mobile_sdk.in2.e;

    static {
        ads_mobile_sdk.uh2 uh2Var = new ads_mobile_sdk.uh2();
        DEFAULT_INSTANCE = uh2Var;
        ads_mobile_sdk.cu0.a(ads_mobile_sdk.uh2.class, uh2Var);
    }

    public static ads_mobile_sdk.uh2 o() {
        return DEFAULT_INSTANCE;
    }

    public static dev.epro.r0.A2833667236973130790 r() {
        return (dev.epro.r0.A2833667236973130790) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.cu0
    public final java.lang.Object a(int i, ads_mobile_sdk.cu0 cu0Var) {
        int iE = dev.epro.r0.T1335862270807194835.e(i);
        if (iE == 2) {
            return new ads_mobile_sdk.ps2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"rules_", ads_mobile_sdk.sh2.class});
        }
        if (iE == 3) {
            return new ads_mobile_sdk.uh2();
        }
        if (iE != 4) {
            return null;
        }
        return new dev.epro.r0.A2833667236973130790(DEFAULT_INSTANCE);
    }

    public final int p() {
        return this.rules_.size();
    }

    public final dev.epro.r0.O6641393078261985068 q() {
        return this.rules_;
    }

    public static ads_mobile_sdk.uh2 a(byte[] bArr) throws ads_mobile_sdk.yi1 {
        ads_mobile_sdk.cu0 cu0VarA = ads_mobile_sdk.cu0.a(DEFAULT_INSTANCE, bArr, bArr.length, ads_mobile_sdk.nl0.a());
        ads_mobile_sdk.cu0.a(cu0VarA);
        return (ads_mobile_sdk.uh2) cu0VarA;
    }
}
