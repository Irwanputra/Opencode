package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.N12893830608069839869;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.T913357428039952817;
import dev.epro.r0.U2595023890546017274;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.Z3437138737604933638;
import dev.epro.r0.Z5089078543653785389;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract class kt0 extends cs0 {
    public final g0 M;
    public final y2 N;
    public boolean O;
    public boolean P;

    /* JADX WARN: Illegal instructions before constructor call */
    public kt0(Context context, W5797197595347441198 w5797197595347441198, G8001132634698687269 g8001132634698687269, W5797197595347441198 w57971975953474411982, jr0 jr0Var, ci3 ci3Var, String str, qw2 qw2Var, z1 z1Var, g0 g0Var, y2 y2Var, Z5089078543653785389 z5089078543653785389, rw0 rw0Var, U2595023890546017274 u2595023890546017274) {
        context.getClass();
        w5797197595347441198.getClass();
        g8001132634698687269.getClass();
        w57971975953474411982.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        str.getClass();
        qw2Var.getClass();
        z1Var.getClass();
        g0Var.getClass();
        y2Var.getClass();
        z5089078543653785389.getClass();
        rw0Var.getClass();
        u2595023890546017274.getClass();
        Optional optionalEmpty = Optional.empty();
        optionalEmpty.getClass();
        super(context, w5797197595347441198, g8001132634698687269, w57971975953474411982, jr0Var, ci3Var, str, qw2Var, z1Var, z5089078543653785389, rw0Var, u2595023890546017274, optionalEmpty);
        this.M = g0Var;
        this.N = y2Var;
        this.O = true;
        this.P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[PHI: r8
      0x005f: PHI (r8v2 ads_mobile_sdk.kt0) = (r8v1 ads_mobile_sdk.kt0), (r8v1 ads_mobile_sdk.kt0), (r8v5 ads_mobile_sdk.kt0) binds: [B:23:0x0051, B:25:0x005c, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.kt0 r8, android.view.View r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            boolean r0 = r10 instanceof ads_mobile_sdk.jt0
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.jt0 r0 = (ads_mobile_sdk.jt0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.jt0 r0 = new ads_mobile_sdk.jt0
            r0.<init>(r8, r10)
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
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r2
        L36:
            ads_mobile_sdk.kt0 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L5f
        L3c:
            ads_mobile_sdk.kt0 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r10)
            goto L4f
        L42:
            dev.epro.r0.E17665849472693074628.k(r10)
            r0.a = r8
            r0.d = r5
            super.a(r9, r0)
            if (r6 != r7) goto L4f
            goto L6e
        L4f:
            boolean r9 = r8.O
            if (r9 == 0) goto L5f
            ads_mobile_sdk.y2 r9 = r8.N
            r0.a = r8
            r0.d = r4
            r9.n(r0)
            if (r6 != r7) goto L5f
            goto L6e
        L5f:
            boolean r9 = r8.P
            if (r9 == 0) goto L6f
            ads_mobile_sdk.y2 r8 = r8.N
            r0.a = r2
            r0.d = r3
            r8.o(r0)
            if (r6 != r7) goto L6f
        L6e:
            return r7
        L6f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kt0.a(ads_mobile_sdk.kt0, android.view.View, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.kt0 r4, dev.epro.r0.K14749510448791472029 r5) {
        /*
            boolean r0 = r5 instanceof ads_mobile_sdk.gt0
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.gt0 r0 = (ads_mobile_sdk.gt0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.gt0 r0 = new ads_mobile_sdk.gt0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            ads_mobile_sdk.kt0 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r2
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = ads_mobile_sdk.et0.a(r4, r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L3e
            return r0
        L3e:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5f
            dev.epro.r0.W5797197595347441198 r5 = r4.d
            ads_mobile_sdk.ht0 r0 = new ads_mobile_sdk.ht0
            r1 = 0
            r0.<init>(r4, r2, r1)
            r5.getClass()
            dev.epro.r0.P7598478828797568949 r4 = new dev.epro.r0.P7598478828797568949
            r4.<init>(r0, r2, r3)
            r0 = 2
            dev.epro.r0.I3826119971291161142 r1 = dev.epro.r0.I3826119971291161142.a
            dev.epro.r0.R7033599853981556291.E(r5, r1, r2, r4, r0)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L5f:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kt0.b(ads_mobile_sdk.kt0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.et0
    public final O9245300239821758723 d(R4833348786910499294 r4833348786910499294) {
        if (this.P && this.n.get()) {
            ht0 ht0Var = new ht0(this, null, (byte) 1);
            W5797197595347441198 w5797197595347441198 = this.d;
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(ht0Var, null, (byte) 1), 2);
        }
        return O9245300239821758723.a;
    }

    @Override // ads_mobile_sdk.et0
    public final Object e(N12893830608069839869 n12893830608069839869) {
        Object objA = a(new T913357428039952817(1, "There was an internal error when attempting to show fullscreen content."), n12893830608069839869);
        return objA == Z3437138737604933638.a ? objA : O9245300239821758723.a;
    }

    @Override // ads_mobile_sdk.et0, dev.epro.r0.H8032588520594078423
    public final void onStop() {
        n();
    }

    @Override // ads_mobile_sdk.et0
    public Object b(K14749510448791472029 k14749510448791472029) {
        return a(this, k14749510448791472029);
    }

    @Override // ads_mobile_sdk.et0, dev.epro.r0.H8032588520594078423
    public Object a(T913357428039952817 t913357428039952817, R4833348786910499294 r4833348786910499294) {
        boolean z = this.P;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (z) {
            this.N.a(t913357428039952817, r4833348786910499294);
        }
        return o9245300239821758723;
    }

    @Override // ads_mobile_sdk.cs0, ads_mobile_sdk.et0
    public Object a(View view, R4833348786910499294 r4833348786910499294) {
        return a(this, view, (K14749510448791472029) r4833348786910499294);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.kt0 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.ft0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ft0 r0 = (ads_mobile_sdk.ft0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.ft0 r0 = new ads_mobile_sdk.ft0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            dev.epro.r0.E17665849472693074628.k(r9)
            return r5
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r2
        L33:
            ads_mobile_sdk.kt0 r8 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L49
        L39:
            dev.epro.r0.E17665849472693074628.k(r9)
            r0.a = r8
            r0.d = r4
            ads_mobile_sdk.tx0 r9 = r8.j()
            r9.f113o = r2
            if (r5 != r6) goto L49
            goto L69
        L49:
            ads_mobile_sdk.jr0 r9 = r8.e
            r9.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            ads_mobile_sdk.ao r4 = ads_mobile_sdk.ao.a$11
            java.lang.String r7 = "gad:interstitial_notify_publisher_without_delay"
            java.lang.Object r9 = r9.a(r7, r1, r4)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L6a
            r0.a = r2
            r0.d = r3
            r8.d(r0)
            if (r5 != r6) goto L6a
        L69:
            return r6
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.kt0.a(ads_mobile_sdk.kt0, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
