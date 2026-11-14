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
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
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
    public final Object a(R4833348786910499294 r4833348786910499294) throws IOException {
        cc2 cc2VarE;
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
                        em2 em2VarA = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
                        try {
                            try {
                                th3 th3Var = ji3.b().a;
                                cc2 cc2VarE2 = th3Var != null ? th3Var.e() : null;
                                if (cc2VarE2 != null) {
                                    W17652710899820817444 w17652710899820817444O = n01.o();
                                    w17652710899820817444O.c(5);
                                    cc2VarE2.I = (n01) w17652710899820817444O.a();
                                }
                                this.e.a(str);
                            } catch (Throwable th) {
                                try {
                                    em2VarA.b(th);
                                    if (th instanceof N340633841638932414) {
                                        throw th;
                                    }
                                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                                        em2VarA.a(th);
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
                        } catch (Exception e) {
                            th3 th3Var2 = ji3.b().a;
                            cc2VarE = th3Var2 != null ? th3Var2.e() : null;
                            if (cc2VarE != null) {
                                W17652710899820817444 w17652710899820817444O2 = n01.o();
                                w17652710899820817444O2.c(5);
                                String message = e.getMessage();
                                if (message != null) {
                                    str2 = message;
                                }
                                w17652710899820817444O2.b();
                                ((n01) w17652710899820817444O2.b).b(str2);
                                cc2VarE.I = (n01) w17652710899820817444O2.a();
                            }
                            th3 th3VarA = ji3.a();
                            th3VarA.e().m = false;
                            th3VarA.a(e);
                            jr0 jr0Var2 = this.c;
                            jr0Var2.getClass();
                            boolean zBooleanValue = ((Boolean) jr0Var2.a("gads:hsdp_unsampled_crash_reporting:enabled", Boolean.FALSE, aoVar)).booleanValue();
                            ci3 ci3Var = this.f;
                            if (zBooleanValue) {
                                ci3Var.a("HsdpServiceUnsampled.endSession", e);
                            } else {
                                ci3Var.a("HsdpService.endSession", (Throwable) e);
                            }
                        }
                        em2VarA.close();
                    } else {
                        th3 th3VarA2 = ji3.a(wv0Var, o2161699089510411363, true);
                        try {
                            try {
                                th3 th3Var3 = ji3.b().a;
                                cc2 cc2VarE3 = th3Var3 != null ? th3Var3.e() : null;
                                if (cc2VarE3 != null) {
                                    W17652710899820817444 w17652710899820817444O3 = n01.o();
                                    w17652710899820817444O3.c(5);
                                    cc2VarE3.I = (n01) w17652710899820817444O3.a();
                                }
                                this.e.a(str);
                            } catch (Exception e2) {
                                th3 th3Var4 = ji3.b().a;
                                cc2VarE = th3Var4 != null ? th3Var4.e() : null;
                                if (cc2VarE != null) {
                                    W17652710899820817444 w17652710899820817444O4 = n01.o();
                                    w17652710899820817444O4.c(5);
                                    String message2 = e2.getMessage();
                                    if (message2 != null) {
                                        str2 = message2;
                                    }
                                    w17652710899820817444O4.b();
                                    ((n01) w17652710899820817444O4.b).b(str2);
                                    cc2VarE.I = (n01) w17652710899820817444O4.a();
                                }
                                th3 th3VarA3 = ji3.a();
                                th3VarA3.e().m = false;
                                th3VarA3.a(e2);
                                jr0 jr0Var3 = this.c;
                                jr0Var3.getClass();
                                boolean zBooleanValue2 = ((Boolean) jr0Var3.a("gads:hsdp_unsampled_crash_reporting:enabled", Boolean.FALSE, aoVar)).booleanValue();
                                ci3 ci3Var2 = this.f;
                                if (zBooleanValue2) {
                                    ci3Var2.a("HsdpServiceUnsampled.endSession", e2);
                                } else {
                                    ci3Var2.a("HsdpService.endSession", (Throwable) e2);
                                }
                            }
                            th3VarA2.close();
                        } catch (Throwable th2) {
                            try {
                                th3VarA2.b(th2);
                                if (th2 instanceof N340633841638932414) {
                                    throw th2;
                                }
                                if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                                    th3VarA2.a(th2);
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
            boolean zA = a();
            byte b = 2;
            I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
            R4833348786910499294 r48333487869104992942 = null;
            if (!zA) {
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
            boolean zA = a();
            byte b = 1;
            I3826119971291161142 i3826119971291161142 = I3826119971291161142.a;
            R4833348786910499294 r48333487869104992942 = null;
            if (zA) {
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

    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.mg2 r12, boolean r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mg2.a(ads_mobile_sdk.mg2, boolean, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
