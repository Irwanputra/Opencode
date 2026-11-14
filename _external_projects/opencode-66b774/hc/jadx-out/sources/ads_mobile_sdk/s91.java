package ads_mobile_sdk;

import android.content.Context;
import dev.epro.r0.B14824868959299866349;
import dev.epro.r0.G8001132634698687269;
import dev.epro.r0.K14749510448791472029;
import dev.epro.r0.N12893830608069839869;
import dev.epro.r0.O8620973563946607355;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.P2382941533350862833;
import dev.epro.r0.P5733283974459951585;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.T913357428039952817;
import dev.epro.r0.U2722688686349128662;
import dev.epro.r0.V3805393212198381221;
import dev.epro.r0.W5797197595347441198;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class s91 extends et0 {
    public final w81 E;
    public final V3805393212198381221 F;
    public final g0 G;
    public final tx0 H;
    public int I;

    /* JADX WARN: Illegal instructions before constructor call */
    public s91(w81 w81Var, tx0 tx0Var, V3805393212198381221 v3805393212198381221, g0 g0Var, Context context, W5797197595347441198 w5797197595347441198, G8001132634698687269 g8001132634698687269, W5797197595347441198 w57971975953474411982, jr0 jr0Var, ci3 ci3Var, String str, rw0 rw0Var, c7 c7Var) {
        tx0Var.getClass();
        v3805393212198381221.getClass();
        g0Var.getClass();
        context.getClass();
        w5797197595347441198.getClass();
        g8001132634698687269.getClass();
        w57971975953474411982.getClass();
        jr0Var.getClass();
        ci3Var.getClass();
        str.getClass();
        rw0Var.getClass();
        Optional optionalEmpty = Optional.empty();
        optionalEmpty.getClass();
        super(context, w5797197595347441198, g8001132634698687269, w57971975953474411982, jr0Var, ci3Var, str, rw0Var, c7Var, optionalEmpty);
        this.E = w81Var;
        this.F = v3805393212198381221;
        this.G = g0Var;
        this.H = tx0Var;
        this.I = -1;
        this.q = tx0Var;
        this.u = true;
    }

    @Override // ads_mobile_sdk.et0, dev.epro.r0.H8032588520594078423
    public final Object a(T913357428039952817 t913357428039952817, R4833348786910499294 r4833348786910499294) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = ((K14749510448791472029) r4833348786910499294).getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new m91(this, null, (byte) 1), 3);
        return O9245300239821758723.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ads_mobile_sdk.et0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dev.epro.r0.K14749510448791472029 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.n91
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.n91 r0 = (ads_mobile_sdk.n91) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.n91 r0 = new ads_mobile_sdk.n91
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ads_mobile_sdk.s91 r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            goto L40
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L30:
            dev.epro.r0.E17665849472693074628.k(r6)
            r0.a = r5
            r0.d = r3
            ads_mobile_sdk.tx0 r6 = r5.H
            r6.f113o = r2
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r6) goto L40
            return r6
        L40:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.n
            boolean r6 = r6.get()
            if (r6 == 0) goto L77
            dev.epro.r0.P5733283974459951585 r6 = ads_mobile_sdk.rw0.f
            dev.epro.r0.U2722688686349128662 r6 = dev.epro.r0.U2722688686349128662.b
            dev.epro.r0.G8001132634698687269 r0 = r0.getContext()
            r6.getClass()
            dev.epro.r0.G8001132634698687269 r6 = dev.epro.r0.S10823041268949770285.O(r6, r0)
            dev.epro.r0.U11450443558875589191 r0 = ads_mobile_sdk.ti3.b
            dev.epro.r0.G8001132634698687269 r6 = r6.minusKey(r0)
            dev.epro.r0.B14824868959299866349 r0 = dev.epro.r0.B14824868959299866349.e
            dev.epro.r0.G8001132634698687269 r6 = r6.minusKey(r0)
            dev.epro.r0.P2382941533350862833 r0 = dev.epro.r0.P2382941533350862833.p
            dev.epro.r0.G8001132634698687269 r6 = r6.minusKey(r0)
            dev.epro.r0.A2789795882633926065 r6 = dev.epro.r0.O8620973563946607355.a(r6)
            ads_mobile_sdk.m91 r0 = new ads_mobile_sdk.m91
            r1 = 0
            r0.<init>(r5, r2, r1)
            r5 = 3
            dev.epro.r0.R7033599853981556291.E(r6, r2, r2, r0, r5)
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s91.b(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.et0
    public final Object e(N12893830608069839869 n12893830608069839869) {
        P5733283974459951585 p5733283974459951585 = rw0.f;
        U2722688686349128662 u2722688686349128662 = U2722688686349128662.b;
        G8001132634698687269 context = n12893830608069839869.getContext();
        u2722688686349128662.getClass();
        R7033599853981556291.E(O8620973563946607355.a(S10823041268949770285.O(u2722688686349128662, context).minusKey(ti3.b).minusKey(B14824868959299866349.e).minusKey(P2382941533350862833.p)), null, null, new m91(this, null, (byte) 2), 3);
        return O9245300239821758723.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(dev.epro.r0.K14749510448791472029 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.q91
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.q91 r0 = (ads_mobile_sdk.q91) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.q91 r0 = new ads_mobile_sdk.q91
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            dev.epro.r0.O9245300239821758723 r2 = dev.epro.r0.O9245300239821758723.a
            r3 = 0
            r4 = 2
            r5 = 1
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L33
            if (r1 != r4) goto L2d
            dev.epro.r0.E17665849472693074628.k(r9)
            return r2
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r3
        L33:
            dev.epro.r0.F14240031463097426304 r8 = r0.b
            ads_mobile_sdk.s91 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            r7 = r9
            r9 = r8
            r8 = r1
            r1 = r7
            goto L56
        L3f:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.F14240031463097426304 r9 = new dev.epro.r0.F14240031463097426304
            r9.<init>()
            r0.a = r8
            r0.b = r9
            r0.e = r5
            ads_mobile_sdk.w81 r1 = r8.E
            java.lang.Object r1 = r1.t(r0)
            if (r1 != r6) goto L56
            goto L82
        L56:
            java.lang.String r9 = r9.g(r1)
            ads_mobile_sdk.tx0 r8 = r8.H
            r0.a = r3
            r0.b = r3
            r0.e = r4
            r8.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "window.inspectorInfo("
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r9 = ");"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.Object r8 = r8.a(r9, r0)
            if (r8 != r6) goto L7f
            goto L80
        L7f:
            r8 = r2
        L80:
            if (r8 != r6) goto L83
        L82:
            return r6
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s91.f(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(dev.epro.r0.K14749510448791472029 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ads_mobile_sdk.r91
            if (r0 == 0) goto L13
            r0 = r5
            ads_mobile_sdk.r91 r0 = (ads_mobile_sdk.r91) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.r91 r0 = new ads_mobile_sdk.r91
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            ads_mobile_sdk.s91 r4 = r0.a
            dev.epro.r0.E17665849472693074628.k(r5)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            r4 = 0
            return r4
        L2e:
            dev.epro.r0.E17665849472693074628.k(r5)
            r0.a = r4
            r0.d = r2
            java.lang.Object r5 = r4.f(r0)
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r5 != r0) goto L3e
            return r0
        L3e:
            ads_mobile_sdk.g0 r5 = r4.G
            android.app.Activity r5 = r5.b()
            if (r5 == 0) goto L47
            goto L49
        L47:
            android.content.Context r5 = r4.a
        L49:
            boolean r4 = r4.a(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.s91.g(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    @Override // ads_mobile_sdk.et0
    public final tx0 j() {
        return this.H;
    }

    @Override // ads_mobile_sdk.et0
    public final int k() {
        return this.I;
    }

    @Override // ads_mobile_sdk.et0
    public final void a(int i) {
        this.I = i;
    }
}
