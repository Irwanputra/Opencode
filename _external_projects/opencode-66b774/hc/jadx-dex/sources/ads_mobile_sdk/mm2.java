package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mm2 implements dev.epro.r0.W11349799793478038591 {
    public final android.content.Context a;
    public final java.util.concurrent.ExecutorService b;
    public final ads_mobile_sdk.j11 c;
    public final java.lang.String d;
    public final int e;
    public final java.lang.String f;
    public final ads_mobile_sdk.vi3 g;
    public final ads_mobile_sdk.ym2 h;

    public mm2(android.content.Context context, java.util.concurrent.ExecutorService executorService, ads_mobile_sdk.j7 j7Var, ads_mobile_sdk.j11 j11Var, ads_mobile_sdk.vi3 vi3Var, ads_mobile_sdk.ym2 ym2Var) {
        int i;
        this.a = context;
        this.b = executorService;
        this.c = j11Var;
        this.g = vi3Var;
        this.h = ym2Var;
        this.d = j7Var.F();
        switch (dev.epro.r0.E12098517352909843120._getNumber$1(j7Var.E())) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        this.e = i != 0 ? i : 1;
        this.f = j7Var.L().t();
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        int i;
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_ORCAS_FETCHER_FETCH_PROGRAM;
        dev.epro.r0.X8174393611044482612 x8174393611044482612O = ads_mobile_sdk.u7.o();
        byte[] bArrB = dev.epro.r0.Q6203700555324584864.b();
        ads_mobile_sdk.qq qqVarA = ads_mobile_sdk.sq.a(0, bArrB, bArrB.length);
        x8174393611044482612O.b();
        ((ads_mobile_sdk.u7) x8174393611044482612O.b).a(qqVarA);
        long j = android.os.Build.VERSION.SDK_INT;
        x8174393611044482612O.b();
        ads_mobile_sdk.u7 u7Var = (ads_mobile_sdk.u7) x8174393611044482612O.b;
        u7Var.bitField0_ |= 2;
        u7Var.apiLevel_ = j;
        java.lang.String str = android.os.Build.MODEL;
        x8174393611044482612O.b();
        ((ads_mobile_sdk.u7) x8174393611044482612O.b).d(str);
        android.content.Context context = this.a;
        java.lang.String packageName = context.getPackageName();
        x8174393611044482612O.b();
        ((ads_mobile_sdk.u7) x8174393611044482612O.b).b(packageName);
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        x8174393611044482612O.b();
        ads_mobile_sdk.u7 u7Var2 = (ads_mobile_sdk.u7) x8174393611044482612O.b;
        u7Var2.bitField0_ |= 16;
        u7Var2.appVersionCode_ = i;
        x8174393611044482612O.b();
        ((ads_mobile_sdk.u7) x8174393611044482612O.b).c(this.d);
        x8174393611044482612O.b();
        ads_mobile_sdk.u7 u7Var3 = (ads_mobile_sdk.u7) x8174393611044482612O.b;
        u7Var3.getClass();
        u7Var3.osType_ = dev.epro.r0.X2485016533998461232.b(2);
        u7Var3.bitField0_ |= 64;
        x8174393611044482612O.b();
        ads_mobile_sdk.u7 u7Var4 = (ads_mobile_sdk.u7) x8174393611044482612O.b;
        u7Var4.getClass();
        u7Var4.hostType_ = dev.epro.r0.E12098517352909843120._getNumber(this.e);
        u7Var4.bitField0_ |= 128;
        dev.epro.r0.T7468265282056741718 t7468265282056741718S = dev.epro.r0.B11509606741455062017.s(dev.epro.r0.I13152720973475179368.q(this.c.a(android.net.Uri.parse(this.f).buildUpon().appendQueryParameter("aspq", dev.epro.r0.V4416135141588678913.d(true).c(((ads_mobile_sdk.u7) x8174393611044482612O.a()).a())).build().toString(), null, false, new byte[0])), new dev.epro.r0.F11332740110010766311(this, (byte) 0), this.b);
        dev.epro.r0.F11332740110010766311 f11332740110010766311 = new dev.epro.r0.F11332740110010766311(this, (byte) 1);
        dev.epro.r0.Z886113521968091188 z886113521968091188 = dev.epro.r0.Z886113521968091188.a;
        dev.epro.r0.L7743116545240101509 l7743116545240101509P = t7468265282056741718S.p(java.net.UnknownHostException.class, f11332740110010766311, z886113521968091188).p(java.net.SocketException.class, new dev.epro.r0.F11332740110010766311(this, (byte) 2), z886113521968091188);
        this.g.a(yk0Var, l7743116545240101509P);
        return l7743116545240101509P;
    }
}
