package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.J4422749016291691854;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.W5797197595347441198;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class qn0 extends cs0 implements J4422749016291691854 {
    public final y2 M;
    public final kz2 N;
    public final mi3 O;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qn0(android.content.Context r16, dev.epro.r0.W5797197595347441198 r17, dev.epro.r0.G8001132634698687269 r18, dev.epro.r0.W5797197595347441198 r19, ads_mobile_sdk.jr0 r20, ads_mobile_sdk.ci3 r21, ads_mobile_sdk.k8 r22, java.lang.String r23, ads_mobile_sdk.y2 r24, dev.epro.r0.G2352924714470945535 r25, ads_mobile_sdk.jy0 r26, ads_mobile_sdk.kz2 r27, ads_mobile_sdk.mi3 r28, ads_mobile_sdk.qw2 r29, ads_mobile_sdk.z1 r30, dev.epro.r0.Z5089078543653785389 r31, ads_mobile_sdk.rw0 r32, dev.epro.r0.U2595023890546017274 r33) {
        /*
            r15 = this;
            r0 = r26
            r16.getClass()
            r17.getClass()
            r18.getClass()
            r19.getClass()
            r20.getClass()
            r21.getClass()
            r22.getClass()
            r23.getClass()
            r24.getClass()
            r25.getClass()
            r0.getClass()
            r27.getClass()
            r28.getClass()
            r29.getClass()
            r30.getClass()
            r31.getClass()
            r32.getClass()
            r33.getClass()
            java.util.Optional r14 = java.util.Optional.of(r25)
            r14.getClass()
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r23
            r9 = r29
            r10 = r30
            r11 = r31
            r12 = r32
            r13 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = r24
            r15.M = r2
            r2 = r27
            r15.N = r2
            r2 = r28
            r15.O = r2
            r15.q = r0
            r15.G = r0
            java.util.concurrent.atomic.AtomicBoolean r15 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r15.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qn0.<init>(android.content.Context, dev.epro.r0.W5797197595347441198, dev.epro.r0.G8001132634698687269, dev.epro.r0.W5797197595347441198, ads_mobile_sdk.jr0, ads_mobile_sdk.ci3, ads_mobile_sdk.k8, java.lang.String, ads_mobile_sdk.y2, dev.epro.r0.G2352924714470945535, ads_mobile_sdk.jy0, ads_mobile_sdk.kz2, ads_mobile_sdk.mi3, ads_mobile_sdk.qw2, ads_mobile_sdk.z1, dev.epro.r0.Z5089078543653785389, ads_mobile_sdk.rw0, dev.epro.r0.U2595023890546017274):void");
    }

    @Override // dev.epro.r0.J4422749016291691854
    public final void a(Context context, boolean z, boolean z2) {
        context.getClass();
        kz2 kz2Var = this.N;
        wv0 wv0Var = wv0.CUI_NAME_ADSHOW;
        List U = K5751602218013079365.U(this.E.toString());
        mi3 mi3Var = this.O;
        byte b = 2;
        R4833348786910499294 r4833348786910499294 = null;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, U, mi3Var);
            try {
                xv.a("show() is not supported for cross-process ad. Use getView() instead.", (Exception) null);
                zi3.a(this.d, new ln0(this, r4833348786910499294, b));
                zi3.a(6, "show() is not supported for cross-process ad.", null);
                a.close();
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
                } finally {
                }
            }
        } else {
            th3 a2 = ji3.a(wv0Var, O2161699089510411363.a, true);
            try {
                xv.a("show() is not supported for cross-process ad. Use getView() instead.", (Exception) null);
                zi3.a(this.d, new ln0(this, r4833348786910499294, b));
                zi3.a(6, "show() is not supported for cross-process ad.", null);
                a2.close();
            } catch (Throwable th2) {
                try {
                    a2.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        a2.a(th2);
                    }
                    if (th2 instanceof P2480554073835519965) {
                        throw new lw0(th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new du0(th2);
                    }
                    if (!(th2 instanceof dv0)) {
                        throw new iu0(th2);
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // ads_mobile_sdk.et0
    public final void a$1(int i) {
        R4833348786910499294 r4833348786910499294 = null;
        if (i == 0) {
            throw null;
        }
        ln0 ln0Var = new ln0(this, r4833348786910499294, (byte) 0);
        W5797197595347441198 w5797197595347441198 = this.d;
        w5797197595347441198.getClass();
        R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(ln0Var, null, (byte) 1), 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        if (r6 == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r6 == r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // ads_mobile_sdk.et0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.kn0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.kn0 r0 = (ads_mobile_sdk.kn0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.kn0 r0 = new ads_mobile_sdk.kn0
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L36
            if (r1 != r3) goto L30
            dev.epro.r0.E17665849472693074628.k(r10)
            return r6
        L30:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r9)
            return r2
        L36:
            ads_mobile_sdk.qn0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L73
        L3c:
            ads_mobile_sdk.qn0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L52
        L42:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r9
            r0.d = r5
            ads_mobile_sdk.tx0 r10 = r9.j()
            r10.f113o = r2
            if (r6 != r7) goto L52
            goto L7e
        L52:
            ads_mobile_sdk.jr0 r10 = r9.e
            r10.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$11
            java.lang.String r8 = "gad:interstitial_notify_publisher_without_delay"
            java.lang.Object r10 = r10.a(r8, r1, r5)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L73
            r0.a = r9
            r0.d = r4
            r9.d(r0)
            if (r6 != r7) goto L73
            goto L7e
        L73:
            ads_mobile_sdk.y2 r9 = r9.M
            r0.a = r2
            r0.d = r3
            r9.a(r0)
            if (r6 != r7) goto L7f
        L7e:
            return r7
        L7f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qn0.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // dev.epro.r0.J4422749016291691854
    public final void d() {
        kz2 kz2Var = this.N;
        wv0 wv0Var = wv0.CUI_NAME_ADSHOW_WITH_VIEW;
        List U = K5751602218013079365.U(this.E.toString());
        mi3 mi3Var = this.O;
        R4833348786910499294 r4833348786910499294 = null;
        byte b = 1;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, U, mi3Var);
            try {
                this.n.set(true);
                ((tx0) this.H.getValue()).f113o = this;
                J8045362843799184672.s0(new ln0(this, r4833348786910499294, b));
                a$2();
                a.close();
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
                } finally {
                }
            }
        } else {
            th3 a2 = ji3.a(wv0Var, O2161699089510411363.a, true);
            try {
                this.n.set(true);
                ((tx0) this.H.getValue()).f113o = this;
                J8045362843799184672.s0(new ln0(this, r4833348786910499294, b));
                a$2();
                a2.close();
            } catch (Throwable th2) {
                try {
                    a2.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        a2.a(th2);
                    }
                    if (th2 instanceof P2480554073835519965) {
                        throw new lw0(th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new du0(th2);
                    }
                    if (!(th2 instanceof dv0)) {
                        throw new iu0(th2);
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    @Override // ads_mobile_sdk.et0
    public final O9245300239821758723 a(K14749510448791472029 k14749510448791472029) {
        d(k14749510448791472029);
        return O9245300239821758723.a;
    }

    @Override // ads_mobile_sdk.et0
    public final O9245300239821758723 d(R4833348786910499294 r4833348786910499294) {
        boolean z = this.n.get();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (z) {
            this.M.g(r4833348786910499294);
        }
        return o9245300239821758723;
    }
}
