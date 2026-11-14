package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.E7125458317232359087;
import dev.epro.r0.J4422749016291691854;
import dev.epro.r0.K5751602218013079365;
import dev.epro.r0.N12893830608069839869;
import dev.epro.r0.N340633841638932414;
import dev.epro.r0.O2161699089510411363;
import dev.epro.r0.O5378677881740157249;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2480554073835519965;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.T913357428039952817;
import dev.epro.r0.W5797197595347441198;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ro0 extends cs0 implements J4422749016291691854 {
    public final k8 M;
    public final y2 N;
    public final kz2 O;
    public final mi3 P;
    public final AtomicBoolean Q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ro0(android.content.Context r16, dev.epro.r0.W5797197595347441198 r17, dev.epro.r0.G8001132634698687269 r18, dev.epro.r0.W5797197595347441198 r19, ads_mobile_sdk.jr0 r20, ads_mobile_sdk.ci3 r21, ads_mobile_sdk.k8 r22, java.lang.String r23, ads_mobile_sdk.y2 r24, dev.epro.r0.G2352924714470945535 r25, ads_mobile_sdk.jy0 r26, ads_mobile_sdk.kz2 r27, ads_mobile_sdk.mi3 r28, ads_mobile_sdk.qw2 r29, ads_mobile_sdk.z1 r30, dev.epro.r0.Z5089078543653785389 r31, ads_mobile_sdk.rw0 r32, dev.epro.r0.U2595023890546017274 r33) {
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
            r2 = r22
            r15.M = r2
            r2 = r24
            r15.N = r2
            r2 = r27
            r15.O = r2
            r2 = r28
            r15.P = r2
            r15.q = r0
            r15.G = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r2 = 0
            r0.<init>(r2)
            r15.Q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ro0.<init>(android.content.Context, dev.epro.r0.W5797197595347441198, dev.epro.r0.G8001132634698687269, dev.epro.r0.W5797197595347441198, ads_mobile_sdk.jr0, ads_mobile_sdk.ci3, ads_mobile_sdk.k8, java.lang.String, ads_mobile_sdk.y2, dev.epro.r0.G2352924714470945535, ads_mobile_sdk.jy0, ads_mobile_sdk.kz2, ads_mobile_sdk.mi3, ads_mobile_sdk.qw2, ads_mobile_sdk.z1, dev.epro.r0.Z5089078543653785389, ads_mobile_sdk.rw0, dev.epro.r0.U2595023890546017274):void");
    }

    @Override // dev.epro.r0.J4422749016291691854
    public final void a(Context context, boolean z, boolean z2) {
        ao aoVar = ao.a$11;
        context.getClass();
        kz2 kz2Var = this.O;
        wv0 wv0Var = wv0.CUI_NAME_ADSHOW;
        List U = K5751602218013079365.U(this.E.toString());
        mi3 mi3Var = this.P;
        if (ji3.b().a == null) {
            em2 a = kz2.a(kz2Var, wv0Var, U, mi3Var);
            try {
                k8 k8Var = this.M;
                StackTraceElement[] stackTrace = new Exception().getStackTrace();
                stackTrace.getClass();
                k8Var.b(O5378677881740157249.U0(stackTrace));
                if (!p()) {
                    a.close();
                    return;
                }
                jr0 jr0Var = this.e;
                jr0Var.getClass();
                Boolean bool = Boolean.TRUE;
                if (((Boolean) jr0Var.a("gads:default_to_immersive:enabled", bool, aoVar)).booleanValue()) {
                    jr0 jr0Var2 = this.e;
                    jr0Var2.getClass();
                    if (!((Boolean) jr0Var2.a("gads:override_pub_immersive_setting:enabled", bool, aoVar)).booleanValue() && z2) {
                        this.u = z;
                    }
                    this.u = true;
                } else {
                    this.u = z;
                }
                a(context);
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
                k8 k8Var2 = this.M;
                StackTraceElement[] stackTrace2 = new Exception().getStackTrace();
                stackTrace2.getClass();
                k8Var2.b(O5378677881740157249.U0(stackTrace2));
                if (!p()) {
                    a2.close();
                    return;
                }
                jr0 jr0Var3 = this.e;
                jr0Var3.getClass();
                Boolean bool2 = Boolean.TRUE;
                if (((Boolean) jr0Var3.a("gads:default_to_immersive:enabled", bool2, aoVar)).booleanValue()) {
                    jr0 jr0Var4 = this.e;
                    jr0Var4.getClass();
                    if (!((Boolean) jr0Var4.a("gads:override_pub_immersive_setting:enabled", bool2, aoVar)).booleanValue() && z2) {
                        this.u = z;
                    }
                    this.u = true;
                } else {
                    this.u = z;
                }
                a(context);
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
            boolean r0 = r10 instanceof ads_mobile_sdk.po0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.po0 r0 = (ads_mobile_sdk.po0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.po0 r0 = new ads_mobile_sdk.po0
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
            ads_mobile_sdk.ro0 r9 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L73
        L3c:
            ads_mobile_sdk.ro0 r9 = r0.a
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
            ads_mobile_sdk.y2 r9 = r9.N
            r0.a = r2
            r0.d = r3
            r9.a(r0)
            if (r6 != r7) goto L7f
        L7e:
            return r7
        L7f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ro0.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.et0
    public final O9245300239821758723 d(R4833348786910499294 r4833348786910499294) {
        boolean z = this.n.get();
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (z) {
            this.N.g(r4833348786910499294);
        }
        return o9245300239821758723;
    }

    @Override // ads_mobile_sdk.et0
    public final Object e(N12893830608069839869 n12893830608069839869) {
        a(new T913357428039952817(1, "There was an internal error when attempting to show fullscreen content."), n12893830608069839869);
        return O9245300239821758723.a;
    }

    public final boolean p() {
        boolean d = E7125458317232359087.d(this.a);
        W5797197595347441198 w5797197595347441198 = this.d;
        if (d) {
            xv.a("Fullscreen ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://goo.gle/admob-interstitial-policies", (Exception) null);
            zi3.a(w5797197595347441198, new no0(this, null, (byte) 0));
            zi3.a(6, "Application process is in background", null);
            return false;
        }
        if (!this.Q.getAndSet(true)) {
            return true;
        }
        xv.a("This ad has already been shown.", (Exception) null);
        zi3.a(w5797197595347441198, new no0(this, null, (byte) 1));
        zi3.a(6, "The ad has already been shown", null);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
    
        if (r5 == r6) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // ads_mobile_sdk.cs0, ads_mobile_sdk.et0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.view.View r8, dev.epro.r0.R4833348786910499294 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.qo0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.qo0 r0 = (ads_mobile_sdk.qo0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L1a
        L13:
            ads_mobile_sdk.qo0 r0 = new ads_mobile_sdk.qo0
            dev.epro.r0.K14749510448791472029 r9 = (dev.epro.r0.K14749510448791472029) r9
            r0.<init>(r7, r9)
        L1a:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            dev.epro.r0.E17665849472693074628.k(r9)
            return r5
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r2
        L35:
            ads_mobile_sdk.ro0 r7 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L48
        L3b:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r7
            r0.d = r4
            super.a(r8, r0)
            if (r5 != r6) goto L48
            goto L53
        L48:
            ads_mobile_sdk.y2 r7 = r7.N
            r0.a = r2
            r0.d = r3
            r7.o(r0)
            if (r5 != r6) goto L54
        L53:
            return r6
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ro0.a(android.view.View, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    @Override // ads_mobile_sdk.et0, dev.epro.r0.H8032588520594078423
    public final Object a(T913357428039952817 t913357428039952817, R4833348786910499294 r4833348786910499294) {
        this.N.a(t913357428039952817, r4833348786910499294);
        return O9245300239821758723.a;
    }
}
