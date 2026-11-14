package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class a63 implements dev.epro.r0.A4779768452142520513 {
    public final ads_mobile_sdk.qm1 a;
    public final dev.epro.r0.Y5459655644324746057 c;
    public final dev.epro.r0.P190945702497543440 d;
    public final java.util.concurrent.ExecutorService e;
    public final java.util.concurrent.Executor f;
    public final ads_mobile_sdk.ub3 g;
    public final ads_mobile_sdk.vi3 h;
    public final java.lang.Object i = new java.lang.Object();
    public final java.lang.String j;
    public final long k;
    public final long l;
    public final boolean m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6o;
    public dev.epro.r0.L405259260506140193 p;

    public a63(ads_mobile_sdk.qm1 qm1Var, dev.epro.r0.Y5459655644324746057 y5459655644324746057, dev.epro.r0.P190945702497543440 p190945702497543440, ads_mobile_sdk.ub3 ub3Var, ads_mobile_sdk.vi3 vi3Var, ads_mobile_sdk.j7 j7Var, java.util.concurrent.ExecutorService executorService) {
        this.a = qm1Var;
        this.c = y5459655644324746057;
        this.d = p190945702497543440;
        this.e = executorService;
        this.g = ub3Var;
        this.h = vi3Var;
        this.j = j7Var.F();
        this.k = j7Var.H();
        this.l = j7Var.D();
        this.m = j7Var.p();
        this.n = j7Var.C();
        boolean zV = j7Var.v();
        this.f6o = zV;
        this.f = zV ? new dev.epro.r0.X14397327929232388191(executorService) : executorService;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0a(java.util.HashMap r15) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.a63.m0a(java.util.HashMap):void");
    }

    public final void b(android.view.InputEvent inputEvent) {
        try {
            synchronized (this.i) {
                try {
                    dev.epro.r0.L405259260506140193 l405259260506140193 = this.p;
                    if (l405259260506140193 != null) {
                        java.util.HashMap map = new java.util.HashMap();
                        map.put("evt", inputEvent);
                        ((dev.epro.r0.Q6203700555324584864) l405259260506140193.c).a(l405259260506140193.b, java.util.Optional.of(map));
                    } else {
                        this.h.b(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_ENGINE_REPORT_TOUCH_EVENT_NULL_HOLDER);
                    }
                } finally {
                }
            }
        } catch (dev.epro.r0.I10296188574218802332 | dev.epro.r0.X11759594239978599137 e) {
            ads_mobile_sdk.vi3 vi3Var = this.h;
            ads_mobile_sdk.yk0 yk0Var = ads_mobile_sdk.yk0.EVENT_ID_UNSPECIFIED;
            vi3Var.a.a(20103, -1L, e, null);
        }
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final int c() {
        return 4;
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final java.lang.String b() {
        synchronized (this.i) {
            try {
                dev.epro.r0.L405259260506140193 l405259260506140193 = this.p;
                if (l405259260506140193 != null) {
                    return (java.lang.String) l405259260506140193.d;
                }
                return "3.960507516.-1";
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final dev.epro.r0.H8027516537527559298 b(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.V8913959282937722084(this, context, str, view, activity, (byte) 1), this.f);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final void a(android.view.MotionEvent motionEvent) {
        if (this.f6o) {
            this.f.execute(new dev.epro.r0.Q9622116641457785369(this, android.view.MotionEvent.obtain(motionEvent), (byte) 19));
        } else {
            b(motionEvent);
        }
    }

    public final java.lang.String a(java.util.HashMap map) {
        ads_mobile_sdk.vi3 vi3Var = this.h;
        try {
            new ads_mobile_sdk.sh3(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_ENGINE_COLLECT_SIGNAL_VM_INVOCATION, vi3Var.b, vi3Var.a).b();
            synchronized (this.i) {
                dev.epro.r0.L405259260506140193 l405259260506140193 = this.p;
                if (l405259260506140193 == null) {
                    this.h.b(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_ENGINE_COLLECT_SIGNAL_NULL_HOLDER);
                    return "";
                }
                return dev.epro.r0.V4416135141588678913.d(true).c((byte[]) ((dev.epro.r0.Q6203700555324584864) l405259260506140193.c).a(l405259260506140193.a, java.util.Optional.of(map)));
            }
        } finally {
        }
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final dev.epro.r0.H8027516537527559298 a(android.content.Context context) {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.E9507284769322407406(this, context, (byte) 1), this.e);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final dev.epro.r0.H8027516537527559298 a(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return dev.epro.r0.M9216324016624295870.X(new dev.epro.r0.V8913959282937722084(this, context, str, view, activity, (byte) 0), this.e);
    }

    @Override // dev.epro.r0.A4779768452142520513
    public final dev.epro.r0.D16915945238461757356 a() {
        dev.epro.r0.Z886113521968091188 z886113521968091188 = dev.epro.r0.Z886113521968091188.a;
        boolean z = this.n;
        dev.epro.r0.P190945702497543440 p190945702497543440 = this.d;
        if (z) {
            return dev.epro.r0.B11509606741455062017.s(p190945702497543440.d(), new dev.epro.r0.Y7950767981527193340(this, (byte) 1), z886113521968091188);
        }
        dev.epro.r0.I13152720973475179368 i13152720973475179368Q = dev.epro.r0.I13152720973475179368.q(p190945702497543440.a());
        dev.epro.r0.A14169635274474290551 a14169635274474290551 = new dev.epro.r0.A14169635274474290551((byte) 0);
        java.util.concurrent.ExecutorService executorService = this.e;
        dev.epro.r0.V9379369092627242728 v9379369092627242728R = dev.epro.r0.B11509606741455062017.r(i13152720973475179368Q.p(java.lang.Throwable.class, a14169635274474290551, executorService), new dev.epro.r0.Y6940760607507242917(this, (byte) 0), executorService);
        dev.epro.r0.L7743116545240101509 b12011109330427901384 = new dev.epro.r0.B12011109330427901384(v9379369092627242728R, java.lang.Throwable.class, new dev.epro.r0.Y6940760607507242917(this, (byte) 1));
        v9379369092627242728R.a(b12011109330427901384, dev.epro.r0.C12265524002282074474.b0(z886113521968091188, b12011109330427901384));
        return b12011109330427901384;
    }

    public final void a(dev.epro.r0.Q6203700555324584864 q6203700555324584864, byte[] bArr, boolean z) {
        ads_mobile_sdk.vi3 vi3Var = this.h;
        ads_mobile_sdk.sh3 sh3Var = new ads_mobile_sdk.sh3(ads_mobile_sdk.yk0.EVENT_ID_ORCAS_ENGINE_INIT_VM_LOAD, vi3Var.b, vi3Var.a);
        try {
            try {
                sh3Var.b();
                synchronized (this.i) {
                    this.p = dev.epro.r0.L405259260506140193.a(q6203700555324584864, bArr, z);
                }
                sh3Var.a();
            } catch (dev.epro.r0.X11759594239978599137 e) {
                e = e;
                sh3Var.a(e);
                throw new dev.epro.r0.M8821877208104636290("r: 2", e);
            } catch (dev.epro.r0.I10296188574218802332 e2) {
                e = e2;
                sh3Var.a(e);
                throw new dev.epro.r0.M8821877208104636290("r: 2", e);
            } catch (java.lang.Throwable th) {
                sh3Var.a(th);
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            sh3Var.a();
            throw th2;
        }
    }
}
