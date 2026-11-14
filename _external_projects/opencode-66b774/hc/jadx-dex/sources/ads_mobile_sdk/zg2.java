package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class zg2 implements dev.epro.r0.B699768225374366618 {
    public final ads_mobile_sdk.z1 a;
    public final dev.epro.r0.O16637889491137121389 b;
    public final ads_mobile_sdk.hv c;
    public final dev.epro.r0.W5797197595347441198 d;
    public final ads_mobile_sdk.kz2 e;
    public final java.lang.Object f;
    public final dev.epro.r0.X1306963851013033444 g;
    public boolean h;
    public boolean i;
    public dev.epro.r0.X7175349259954592591 j;

    public zg2(ads_mobile_sdk.z1 z1Var, dev.epro.r0.O16637889491137121389 o16637889491137121389, ads_mobile_sdk.hv hvVar, dev.epro.r0.W5797197595347441198 w5797197595347441198, ads_mobile_sdk.kz2 kz2Var) {
        z1Var.getClass();
        o16637889491137121389.getClass();
        hvVar.getClass();
        w5797197595347441198.getClass();
        kz2Var.getClass();
        this.a = z1Var;
        this.b = o16637889491137121389;
        this.c = hvVar;
        this.d = w5797197595347441198;
        this.e = kz2Var;
        this.f = new java.lang.Object();
        dev.epro.r0.X1306963851013033444 x1306963851013033444O = ads_mobile_sdk.ch2.o();
        x1306963851013033444O.getClass();
        this.g = x1306963851013033444O;
    }

    public static final void a(ads_mobile_sdk.zg2 zg2Var) {
        synchronized (zg2Var.f) {
            if (zg2Var.i) {
                return;
            }
            ads_mobile_sdk.kz2 kz2Var = zg2Var.e;
            ads_mobile_sdk.wv0 wv0Var = ads_mobile_sdk.wv0.CUI_NAME_POST_CLICK_LIFECYCLE_MONITORING;
            dev.epro.r0.O2161699089510411363 o2161699089510411363 = dev.epro.r0.O2161699089510411363.a;
            ads_mobile_sdk.mi3 mi3Var = new ads_mobile_sdk.mi3(new ads_mobile_sdk.ur2(), new ads_mobile_sdk.fh1(), new ads_mobile_sdk.tu2(), new ads_mobile_sdk.s8());
            if (ads_mobile_sdk.ji3.b().a == null) {
                ads_mobile_sdk.em2 em2VarA = ads_mobile_sdk.kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                try {
                    zg2Var.i = true;
                    ads_mobile_sdk.ji3.a().e().H = (ads_mobile_sdk.ch2) zg2Var.g.a();
                    ads_mobile_sdk.ji3.a().a.b.b = zg2Var.c.h;
                    em2VarA.close();
                } catch (java.lang.Throwable th) {
                    try {
                        em2VarA.b(th);
                        if (th instanceof dev.epro.r0.N340633841638932414) {
                            throw th;
                        }
                        if (!(th instanceof dev.epro.r0.P2480554073835519965) && !(th instanceof java.util.concurrent.CancellationException)) {
                            em2VarA.a(th);
                        }
                        if (th instanceof dev.epro.r0.P2480554073835519965) {
                            throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th);
                        }
                        if (th instanceof java.util.concurrent.CancellationException) {
                            throw new ads_mobile_sdk.du0(th);
                        }
                        if (!(th instanceof ads_mobile_sdk.dv0)) {
                            throw new ads_mobile_sdk.iu0(th);
                        }
                        throw th;
                    } finally {
                    }
                }
            } else {
                ads_mobile_sdk.th3 th3VarA = ads_mobile_sdk.ji3.a(wv0Var, o2161699089510411363, true);
                try {
                    zg2Var.i = true;
                    ads_mobile_sdk.ji3.a().e().H = (ads_mobile_sdk.ch2) zg2Var.g.a();
                    ads_mobile_sdk.ji3.a().a.b.b = zg2Var.c.h;
                    th3VarA.close();
                } catch (java.lang.Throwable th2) {
                    try {
                        th3VarA.b(th2);
                        if (th2 instanceof dev.epro.r0.N340633841638932414) {
                            throw th2;
                        }
                        if (!(th2 instanceof dev.epro.r0.P2480554073835519965) && !(th2 instanceof java.util.concurrent.CancellationException)) {
                            th3VarA.a(th2);
                        }
                        if (th2 instanceof dev.epro.r0.P2480554073835519965) {
                            throw new ads_mobile_sdk.lw0((dev.epro.r0.P2480554073835519965) th2);
                        }
                        if (th2 instanceof java.util.concurrent.CancellationException) {
                            throw new ads_mobile_sdk.du0(th2);
                        }
                        if (!(th2 instanceof ads_mobile_sdk.dv0)) {
                            throw new ads_mobile_sdk.iu0(th2);
                        }
                        throw th2;
                    } finally {
                    }
                }
            }
        }
    }

    public final void a$1(int i) {
        synchronized (this.f) {
            try {
                if (!this.i && this.h) {
                    dev.epro.r0.X1306963851013033444 x1306963851013033444 = this.g;
                    dev.epro.r0.F8558020411982013788 f8558020411982013788O = ads_mobile_sdk.ue.o();
                    f8558020411982013788O.getClass();
                    if (i == 0) {
                        throw null;
                    }
                    f8558020411982013788O.b();
                    ads_mobile_sdk.ue ueVar = (ads_mobile_sdk.ue) f8558020411982013788O.b;
                    ueVar.getClass();
                    int i2 = 0;
                    if (i != 10) {
                        switch (i) {
                            case 1:
                                break;
                            case 2:
                                i2 = 1;
                                break;
                            case 3:
                                i2 = 2;
                                break;
                            case 4:
                                i2 = 3;
                                break;
                            case 5:
                                i2 = 4;
                                break;
                            case 6:
                                i2 = 5;
                                break;
                            case 7:
                                i2 = 6;
                                break;
                            case 8:
                                i2 = 7;
                                break;
                            case 9:
                                i2 = 8;
                                break;
                            case 10:
                                i2 = -1;
                                break;
                            default:
                                throw null;
                        }
                    } else {
                        byte[] bArr = ads_mobile_sdk.rb1.a;
                        dev.epro.r0.S10973172697741180971.j("Can't get the number of an unknown enum value.");
                    }
                    ueVar.eventType_ = i2;
                    this.b.getClass();
                    long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    f8558020411982013788O.b();
                    ((ads_mobile_sdk.ue) f8558020411982013788O.b).timestampMs_ = jCurrentTimeMillis;
                    ads_mobile_sdk.ue ueVar2 = (ads_mobile_sdk.ue) f8558020411982013788O.a();
                    x1306963851013033444.b();
                    ((ads_mobile_sdk.ch2) x1306963851013033444.b).a(ueVar2);
                    if (i == 9) {
                        dev.epro.r0.X7175349259954592591 x7175349259954592591 = this.j;
                        if (x7175349259954592591 != null) {
                            x7175349259954592591.c((java.util.concurrent.CancellationException) null);
                        }
                        dev.epro.r0.W5797197595347441198 w5797197595347441198 = this.d;
                        dev.epro.r0.R16580349318584449994 r16580349318584449994 = new dev.epro.r0.R16580349318584449994(this, (dev.epro.r0.R4833348786910499294) null, (byte) 17);
                        dev.epro.r0.I3826119971291161142 i3826119971291161142 = dev.epro.r0.I3826119971291161142.a;
                        w5797197595347441198.getClass();
                        dev.epro.r0.R7033599853981556291.E(w5797197595347441198, i3826119971291161142, (dev.epro.r0.L856869997670741194) null, new dev.epro.r0.P7598478828797568949(r16580349318584449994, (dev.epro.r0.R4833348786910499294) null, (byte) 1), 2);
                    }
                }
            } finally {
            }
        }
    }

    @Override // dev.epro.r0.B699768225374366618
    public final void b$1() {
        a$1(6);
    }

    @Override // dev.epro.r0.B699768225374366618
    public final void c() {
        a$1(3);
    }

    @Override // dev.epro.r0.B699768225374366618
    public final void d() {
        a$1(2);
    }

    @Override // dev.epro.r0.B699768225374366618
    public final void onDestroy() {
        a$1(9);
    }

    @Override // dev.epro.r0.B699768225374366618
    public final void onPause() {
        a$1(7);
    }

    @Override // dev.epro.r0.B699768225374366618
    public final void onResume() {
        a$1(5);
    }

    @Override // dev.epro.r0.B699768225374366618
    public final void onStop() {
        a$1(8);
    }

    @Override // dev.epro.r0.B699768225374366618
    public final void a$1() {
        a$1(4);
    }
}
