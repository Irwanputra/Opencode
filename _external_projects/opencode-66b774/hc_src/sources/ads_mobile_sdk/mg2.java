package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B9486205464174482320;
import dev.epro.r0.E1738554508920355622;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W17652710899820817444;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X14700554270388218583;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class mg2 implements E1738554508920355622 {
    public final z1 a;
    public final rg2 b;
    public final jr0 c;
    public final kz2 d;
    public final j01 e;
    public final ci3 f;
    public final W5797197595347441198 g;
    public final g0 h;

    public mg2(Context context, z1 z1Var, rg2 rg2Var, jr0 jr0Var, kz2 kz2Var, j01 j01Var, ci3 ci3Var, W5797197595347441198 w5797197595347441198, g0 g0Var) {
        context.getClass();
        z1Var.getClass();
        rg2Var.getClass();
        jr0Var.getClass();
        kz2Var.getClass();
        j01Var.getClass();
        ci3Var.getClass();
        w5797197595347441198.getClass();
        g0Var.getClass();
        this.a = z1Var;
        this.b = rg2Var;
        this.c = jr0Var;
        this.d = kz2Var;
        this.e = j01Var;
        this.f = ci3Var;
        this.g = w5797197595347441198;
        this.h = g0Var;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object a(R4833348786910499294 r4833348786910499294) {
        cc2 e;
        ao aoVar = ao.a$11;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        ug2 ug2Var = this.a.v0;
        if (ug2Var != null) {
            String str = ug2Var.e;
            if (a()) {
                jr0 jr0Var = this.c;
                jr0Var.getClass();
                if (((Boolean) jr0Var.a("gads:hsdp_service_end_session:enabled", Boolean.FALSE, aoVar)).booleanValue() && str.length() > 0) {
                    kz2 kz2Var = this.d;
                    wv0 wv0Var = wv0.CUI_NAME_HSDP_SERVICE;
                    O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
                    mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
                    String str2 = "";
                    if (ji3.b().a == null) {
                        em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                        try {
                            try {
                                th3 th3Var = ji3.b().a;
                                cc2 e2 = th3Var != null ? th3Var.e() : null;
                                if (e2 != null) {
                                    W17652710899820817444 o2 = n01.o();
                                    o2.c(5);
                                    e2.I = (n01) o2.a();
                                }
                                this.e.a(str);
                            } catch (Throwable th) {
                                try {
                                    a.b(th);
                                    if (th instanceof N340633841638932414) {
                                        throw th;
                                    }
                                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                                        a.a(th);
                                    }
                                    if (th instanceof P2480554073835519965) {
                                        throw new lw0(th);
                                    }
                                    if (th instanceof CancellationException) {
                                        throw new du0(th);
                                    }
                                    if (th instanceof dv0) {
                                        throw th;
                                    }
                                    throw new iu0(th);
                                } finally {
                                }
                            }
                        } catch (Exception e3) {
                            th3 th3Var2 = ji3.b().a;
                            e = th3Var2 != null ? th3Var2.e() : null;
                            if (e != null) {
                                W17652710899820817444 o3 = n01.o();
                                o3.c(5);
                                String message = e3.getMessage();
                                if (message != null) {
                                    str2 = message;
                                }
                                o3.b();
                                ((n01) o3.b).b(str2);
                                e.I = (n01) o3.a();
                            }
                            th3 a2 = ji3.a();
                            a2.e().m = false;
                            a2.a(e3);
                            jr0 jr0Var2 = this.c;
                            jr0Var2.getClass();
                            boolean booleanValue = ((Boolean) jr0Var2.a("gads:hsdp_unsampled_crash_reporting:enabled", Boolean.FALSE, aoVar)).booleanValue();
                            ci3 ci3Var = this.f;
                            if (booleanValue) {
                                ci3Var.a("HsdpServiceUnsampled.endSession", e3);
                            } else {
                                ci3Var.a("HsdpService.endSession", (Throwable) e3);
                            }
                        }
                        a.close();
                    } else {
                        th3 a3 = ji3.a(wv0Var, o2161699089510411363, true);
                        try {
                            try {
                                th3 th3Var3 = ji3.b().a;
                                cc2 e4 = th3Var3 != null ? th3Var3.e() : null;
                                if (e4 != null) {
                                    W17652710899820817444 o4 = n01.o();
                                    o4.c(5);
                                    e4.I = (n01) o4.a();
                                }
                                this.e.a(str);
                            } catch (Exception e5) {
                                th3 th3Var4 = ji3.b().a;
                                e = th3Var4 != null ? th3Var4.e() : null;
                                if (e != null) {
                                    W17652710899820817444 o5 = n01.o();
                                    o5.c(5);
                                    String message2 = e5.getMessage();
                                    if (message2 != null) {
                                        str2 = message2;
                                    }
                                    o5.b();
                                    ((n01) o5.b).b(str2);
                                    e.I = (n01) o5.a();
                                }
                                th3 a4 = ji3.a();
                                a4.e().m = false;
                                a4.a(e5);
                                jr0 jr0Var3 = this.c;
                                jr0Var3.getClass();
                                boolean booleanValue2 = ((Boolean) jr0Var3.a("gads:hsdp_unsampled_crash_reporting:enabled", Boolean.FALSE, aoVar)).booleanValue();
                                ci3 ci3Var2 = this.f;
                                if (booleanValue2) {
                                    ci3Var2.a("HsdpServiceUnsampled.endSession", e5);
                                } else {
                                    ci3Var2.a("HsdpService.endSession", (Throwable) e5);
                                }
                            }
                            a3.close();
                        } catch (Throwable th2) {
                            try {
                                a3.b(th2);
                                if (th2 instanceof N340633841638932414) {
                                    throw th2;
                                }
                                if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                                    a3.a(th2);
                                }
                                if (th2 instanceof P2480554073835519965) {
                                    throw new lw0(th2);
                                }
                                if (th2 instanceof CancellationException) {
                                    throw new du0(th2);
                                }
                                if (th2 instanceof dv0) {
                                    throw th2;
                                }
                                throw new iu0(th2);
                            } finally {
                            }
                        }
                    }
                }
            }
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object i(R4833348786910499294 r4833348786910499294) {
        ug2 ug2Var = this.a.v0;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (ug2Var != null) {
            boolean a = a();
            byte b = 2;
            I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
            R4833348786910499294 r48333487869104992942 = null;
            if (!a) {
                jr0 jr0Var = this.c;
                jr0Var.getClass();
                if (((Boolean) jr0Var.a("gads:play_prewarm:enabled", Boolean.TRUE, ao.a$11)).booleanValue() && ug2Var.a) {
                    String str = ug2Var.b;
                    rg2 rg2Var = this.b;
                    W5797197595347441198 w5797197595347441198 = rg2Var.a;
                    X14700554270388218583 x14700554270388218583 = new X14700554270388218583(rg2Var, str, null);
                    w5797197595347441198.getClass();
                    R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(x14700554270388218583, null, (byte) 1), 2);
                }
            } else if (a(1)) {
                B9486205464174482320 b9486205464174482320 = new B9486205464174482320(this, a(2), r48333487869104992942, b);
                W5797197595347441198 w57971975953474411982 = this.g;
                w57971975953474411982.getClass();
                R7033599853981556291.E(w57971975953474411982, i3826119971291161142, null, new P7598478828797568949(b9486205464174482320, null, (byte) 1), 2);
                return o9245300239821758723;
            }
        }
        return o9245300239821758723;
    }

    @Override // dev.epro.r0.E1738554508920355622
    public final Object q(R4833348786910499294 r4833348786910499294) {
        ug2 ug2Var = this.a.v0;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (ug2Var != null) {
            boolean a = a();
            byte b = 1;
            I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
            R4833348786910499294 r48333487869104992942 = null;
            if (a) {
                if (a(4)) {
                    B9486205464174482320 b9486205464174482320 = new B9486205464174482320(this, a(8), r48333487869104992942, b);
                    W5797197595347441198 w5797197595347441198 = this.g;
                    w5797197595347441198.getClass();
                    R7033599853981556291.E(w5797197595347441198, i3826119971291161142, null, new P7598478828797568949(b9486205464174482320, null, (byte) 1), 2);
                    return o9245300239821758723;
                }
            } else if (a(256)) {
                String str = a(512) ? ug2Var.b : "";
                rg2 rg2Var = this.b;
                W5797197595347441198 w57971975953474411982 = rg2Var.a;
                X14700554270388218583 x14700554270388218583 = new X14700554270388218583(rg2Var, str, null);
                w57971975953474411982.getClass();
                R7033599853981556291.E(w57971975953474411982, i3826119971291161142, null, new P7598478828797568949(x14700554270388218583, null, (byte) 1), 2);
            }
        }
        return o9245300239821758723;
    }

    public final boolean a(int i) {
        ug2 ug2Var = this.a.v0;
        return ((ug2Var != null ? ug2Var.f : 0) & i) != 0;
    }

    public final boolean a() {
        ug2 ug2Var;
        jr0 jr0Var = this.c;
        jr0Var.getClass();
        return ((Boolean) jr0Var.a("gads:hsdp_service:enabled", Boolean.FALSE, ao.a$11)).booleanValue() && (ug2Var = this.a.v0) != null && ug2Var.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0098, code lost:
    
        if (r14 != null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00ea A[Catch: Exception -> 0x0031, TryCatch #1 {Exception -> 0x0031, blocks: (B:11:0x002c, B:12:0x00e2, B:14:0x00ea, B:19:0x00f4), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f4 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #1 {Exception -> 0x0031, blocks: (B:11:0x002c, B:12:0x00e2, B:14:0x00ea, B:19:0x00f4), top: B:10:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.mg2 r12, boolean r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mg2.a(ads_mobile_sdk.mg2, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
