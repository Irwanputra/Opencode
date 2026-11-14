package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ln3 implements dev.epro.r0.K12714355155332733186 {
    public static final /* synthetic */ int k = 0;
    public final android.content.Context a;
    public final java.lang.String b;
    public final ads_mobile_sdk.qq0 c;
    public dev.epro.r0.W5797197595347441198 d;
    public dev.epro.r0.W5797197595347441198 e;
    public ads_mobile_sdk.kz2 f;
    public ads_mobile_sdk.jr0 g;
    public final dev.epro.r0.H15186625828076266306 h;
    public final dev.epro.r0.R5692663580087387669 i;
    public java.lang.String j;

    public ln3(android.content.Context context, java.lang.String str, ads_mobile_sdk.qq0 qq0Var) {
        context.getClass();
        str.getClass();
        qq0Var.getClass();
        this.a = context;
        this.b = str;
        this.c = qq0Var;
        this.h = new dev.epro.r0.H15186625828076266306();
        this.i = dev.epro.r0.J8045362843799184672.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4 A[Catch: all -> 0x00c9, TryCatch #2 {all -> 0x00c9, blocks: (B:39:0x00a0, B:41:0x00a4, B:43:0x00a8, B:45:0x00ba, B:55:0x00cf, B:48:0x00bf, B:49:0x00c4, B:53:0x00cb, B:70:0x012a, B:71:0x012f, B:72:0x0130, B:73:0x0135), top: B:85:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0106 A[Catch: all -> 0x0128, TryCatch #1 {all -> 0x0128, blocks: (B:59:0x00f7, B:61:0x0106, B:62:0x010c), top: B:84:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010c A[Catch: all -> 0x0128, TRY_LEAVE, TryCatch #1 {all -> 0x0128, blocks: (B:59:0x00f7, B:61:0x0106, B:62:0x010c), top: B:84:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ln3 r12, dev.epro.r0.K14749510448791472029 r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ln3.a(ads_mobile_sdk.ln3, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        java.lang.Object objV = this.i.v(k14749510448791472029);
        return objV == dev.epro.r0.Z3437138737604933638.a ? objV : dev.epro.r0.O9245300239821758723.a;
    }

    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 k14749510448791472029) {
        return a(this, k14749510448791472029);
    }

    public final java.lang.Object a() {
        dev.epro.r0.H15186625828076266306 h15186625828076266306 = this.h;
        if (!h15186625828076266306.g()) {
            return null;
        }
        try {
            return this.j;
        } finally {
            h15186625828076266306.b((java.lang.Object) null);
        }
    }

    public final java.lang.String a(java.lang.String str) {
        ads_mobile_sdk.jr0 jr0Var = this.g;
        if (jr0Var != null) {
            if (((java.lang.Boolean) jr0Var.a("gads:restore_reduced_ua:enabled", java.lang.Boolean.TRUE, ads_mobile_sdk.ao.a$11)).booleanValue()) {
                java.lang.String str2 = android.os.Build.VERSION.RELEASE;
                java.lang.String str3 = android.os.Build.MODEL;
                java.lang.String str4 = android.os.Build.ID;
                java.lang.StringBuilder sbY = dev.epro.r0.G6547577305291411977.y("Android ", str2, "; ", str3, " Build/");
                sbY.append(str4);
                str = dev.epro.r0.Z13168519540281190457.D(false, str, "Android 10; K", sbY.toString());
            }
            java.lang.String strT = dev.epro.r0.G6547577305291411977.t(str, " (Mobile; ", this.b, ")");
            this.j = strT;
            return strT;
        }
        dev.epro.r0.S10823041268949770285.b0("flags");
        throw null;
    }
}
