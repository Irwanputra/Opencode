package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class w53 implements dev.epro.r0.A4779768452142520513 {
    public final ads_mobile_sdk.yo3 a;
    public final ads_mobile_sdk.oc3 b;
    public final dev.epro.r0.Y5459655644324746057 c;
    public final ads_mobile_sdk.vi3 d;
    public final java.util.concurrent.ExecutorService e;
    public final java.util.concurrent.Executor f;
    public final boolean g;
    public final java.util.concurrent.atomic.AtomicReference h = new java.util.concurrent.atomic.AtomicReference("2.960507516.-1");

    public w53(ads_mobile_sdk.yo3 yo3Var, ads_mobile_sdk.oc3 oc3Var, dev.epro.r0.Y5459655644324746057 y5459655644324746057, ads_mobile_sdk.vi3 vi3Var, java.util.concurrent.ExecutorService executorService, ads_mobile_sdk.j7 j7Var) {
        this.a = yo3Var;
        this.b = oc3Var;
        this.c = y5459655644324746057;
        this.d = vi3Var;
        this.e = executorService;
        boolean zV = j7Var.v();
        this.g = zV;
        this.f = zV ? new dev.epro.r0.X14397327929232388191(executorService) : executorService;
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final dev.epro.r0.D16915945238461757356 a() {
        dev.epro.r0.I13152720973475179368 i13152720973475179368Q = dev.epro.r0.I13152720973475179368.q(this.b.a());
        dev.epro.r0.A14169635274474290551 a14169635274474290551 = new dev.epro.r0.A14169635274474290551((byte) 7);
        dev.epro.r0.Z886113521968091188 z886113521968091188 = dev.epro.r0.Z886113521968091188.a;
        return dev.epro.r0.B11509606741455062017.s(dev.epro.r0.B11509606741455062017.s(dev.epro.r0.B11509606741455062017.r(dev.epro.r0.B11509606741455062017.s(i13152720973475179368Q.p(java.lang.Throwable.class, a14169635274474290551, z886113521968091188), new dev.epro.r0.G17481828824918292827(this, (byte) 0), z886113521968091188), new dev.epro.r0.V9308799180227606465(this, (byte) 1), z886113521968091188), new dev.epro.r0.G17481828824918292827(this, (byte) 1), z886113521968091188), new dev.epro.r0.A14169635274474290551((byte) 8), z886113521968091188);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final dev.epro.r0.H8027516537527559298 b(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.V8913959282937722084(this, context, str, view, activity, (byte) 2), this.f);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final int c() {
        return 3;
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final java.lang.String b() {
        return (java.lang.String) this.h.get();
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final dev.epro.r0.H8027516537527559298 a(android.content.Context context) {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.E9507284769322407406(this, context, (byte) 4), this.e);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final dev.epro.r0.H8027516537527559298 a(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.W4600430837258405808(this, context, str, view, activity), this.e);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final void a(android.view.MotionEvent motionEvent) {
        ads_mobile_sdk.cm1 cm1VarA = this.a.a();
        ads_mobile_sdk.vi3 vi3Var = this.d;
        if (cm1VarA == null) {
            vi3Var.b(ads_mobile_sdk.yk0.EVENT_ID_DG_ENGINE_NULL_HANDLE);
            return;
        }
        if (this.g) {
            this.f.execute(new dev.epro.r0.E138661690457992157(this, cm1VarA, android.view.MotionEvent.obtain(motionEvent), (byte) 12));
            return;
        }
        try {
            cm1VarA.a(motionEvent);
        } catch (ads_mobile_sdk.wo3 e) {
            ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_UNSPECIFIED;
            vi3Var.a.a(15004, -1L, e, null);
        }
    }
}
