package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class km2 implements dev.epro.r0.W11349799793478038591 {
    public final android.content.Context a;
    public final dev.epro.r0.A8094652504661216977 b;
    public final dev.epro.r0.Z15337348271744322997 c;
    public final ads_mobile_sdk.vi3 d;
    public final java.util.concurrent.ExecutorService e;
    public final ads_mobile_sdk.xm2 f;
    public final ads_mobile_sdk.v6 g;

    public km2(android.content.Context context, dev.epro.r0.A8094652504661216977 a8094652504661216977, dev.epro.r0.Z15337348271744322997 z15337348271744322997, ads_mobile_sdk.vi3 vi3Var, java.util.concurrent.ExecutorService executorService, ads_mobile_sdk.xm2 xm2Var, ads_mobile_sdk.v6 v6Var) {
        this.a = context;
        this.b = a8094652504661216977;
        this.c = z15337348271744322997;
        this.d = vi3Var;
        this.e = executorService;
        this.f = xm2Var;
        this.g = v6Var;
    }

    public final dev.epro.r0.D16915945238461757356 a() {
        ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_DG_FETCHER_FETCH_PROGRAM;
        dev.epro.r0.A8094652504661216977 a8094652504661216977 = this.b;
        java.util.Objects.requireNonNull(a8094652504661216977);
        dev.epro.r0.J5800360223679855765 j5800360223679855765 = new dev.epro.r0.J5800360223679855765(a8094652504661216977, (byte) 6);
        java.util.concurrent.ExecutorService executorService = this.e;
        dev.epro.r0.I13152720973475179368 i13152720973475179368Q = dev.epro.r0.I13152720973475179368.q(dev.epro.r0.M9216324016624295870.X(j5800360223679855765, executorService));
        dev.epro.r0.O12123424249380946449 o12123424249380946449 = new dev.epro.r0.O12123424249380946449(this, (byte) 0);
        dev.epro.r0.Z886113521968091188 z886113521968091188 = dev.epro.r0.Z886113521968091188.a;
        dev.epro.r0.L7743116545240101509 l7743116545240101509P = dev.epro.r0.B11509606741455062017.s(dev.epro.r0.B11509606741455062017.r(dev.epro.r0.B11509606741455062017.s(i13152720973475179368Q, o12123424249380946449, z886113521968091188), new dev.epro.r0.V9308799180227606465(this, (byte) 0), z886113521968091188), new dev.epro.r0.O12123424249380946449(this, (byte) 1), executorService).p(dev.epro.r0.G17826342324976703097.class, new dev.epro.r0.A14169635274474290551((byte) 3), z886113521968091188);
        this.d.a(yk0Var, l7743116545240101509P);
        return l7743116545240101509P;
    }
}
