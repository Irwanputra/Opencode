package ads_mobile_sdk;

import dev.epro.r0.B8544152185772418115;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z1953481206310471956;
import java.security.GeneralSecurityException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class b30 extends c61 {
    public final W5797197595347441198 c;
    public final kz2 d;
    public final ci3 e;
    public final jr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b30(W5797197595347441198 w5797197595347441198, kz2 kz2Var, ci3 ci3Var, jr0 jr0Var) {
        super((wv0) null, 3);
        w5797197595347441198.getClass();
        kz2Var.getClass();
        ci3Var.getClass();
        jr0Var.getClass();
        this.c = w5797197595347441198;
        this.d = kz2Var;
        this.e = ci3Var;
        this.f = jr0Var;
    }

    public final void c() {
        kz2 kz2Var = this.d;
        wv0 wv0Var = wv0.CUI_NAME_SDKINIT_INIT_CRYPTO;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        mi3 mi3Var = new mi3(new ur2(), new fh1(), new tu2(), new s8());
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                try {
                    B8544152185772418115.a();
                } catch (GeneralSecurityException e) {
                    this.e.a("CryptoUtil: AeadConfig.register()", (Throwable) e);
                }
                a.close();
                return;
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
                    if (!(th instanceof dv0)) {
                        throw new iu0(th);
                    }
                    throw th;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        Z1953481206310471956.z(a, th2);
                        throw th3;
                    }
                }
            }
        }
        th3 a2 = ji3.a(wv0Var, o2161699089510411363, true);
        try {
            try {
                B8544152185772418115.a();
            } catch (Throwable th4) {
                try {
                    a2.b(th4);
                    if (th4 instanceof N340633841638932414) {
                        throw th4;
                    }
                    if (!(th4 instanceof P2480554073835519965) && !(th4 instanceof CancellationException)) {
                        a2.a(th4);
                    }
                    if (th4 instanceof P2480554073835519965) {
                        throw new lw0(th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new du0(th4);
                    }
                    if (!(th4 instanceof dv0)) {
                        throw new iu0(th4);
                    }
                    throw th4;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        Z1953481206310471956.z(a2, th5);
                        throw th6;
                    }
                }
            }
        } catch (GeneralSecurityException e2) {
            this.e.a("CryptoUtil: AeadConfig.register()", (Throwable) e2);
        }
        a2.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ads_mobile_sdk.c61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(dev.epro.r0.R4833348786910499294 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.z20
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.z20 r0 = (ads_mobile_sdk.z20) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.z20 r0 = new ads_mobile_sdk.z20
            dev.epro.r0.K14749510448791472029 r8 = (dev.epro.r0.K14749510448791472029) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2c
            ads_mobile_sdk.b30 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            goto L59
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r8)
            ads_mobile_sdk.jr0 r8 = r7.f
            r8.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$11
            java.lang.String r6 = "gads:block_init_on_crypto:enabled"
            java.lang.Object r8 = r8.a(r6, r1, r5)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L74
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = dev.epro.r0.A15222901130456174747.z(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r8 != r0) goto L59
            return r0
        L59:
            dev.epro.r0.W5797197595347441198 r8 = r7.c
            dev.epro.r0.R16580349318584449994 r0 = new dev.epro.r0.R16580349318584449994
            r0.<init>(r7, r3, r4)
            r8.getClass()
            dev.epro.r0.P7598478828797568949 r7 = new dev.epro.r0.P7598478828797568949
            r7.<init>(r0, r3, r4)
            r0 = 2
            dev.epro.r0.I3826119971291161142 r1 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r8, r1, r3, r7, r0)
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            r7.<init>(r2)
            return r7
        L74:
            r7.c()
            ads_mobile_sdk.xu0 r7 = new ads_mobile_sdk.xu0
            r7.<init>(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.b30.h(dev.epro.r0.R4833348786910499294):java.lang.Object");
    }
}
