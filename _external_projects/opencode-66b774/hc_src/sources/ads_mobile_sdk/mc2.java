package ads_mobile_sdk;

import dev.epro.r0.B7506245556754967052;
import dev.epro.r0.B8669154544800329371;
import dev.epro.r0.E17093345031926825464;
import dev.epro.r0.E17149812035295265804;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.I3826119971291161142;
import dev.epro.r0.J8045362843799184672;
import dev.epro.r0.M9216324016624295870;
import dev.epro.r0.N13798149404328803870;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.P7598478828797568949;
import dev.epro.r0.R14062301455140331524;
import dev.epro.r0.R5692663580087387669;
import dev.epro.r0.R7033599853981556291;
import dev.epro.r0.V2597580950516131749;
import dev.epro.r0.W5797197595347441198;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class mc2 implements B8669154544800329371 {
    public final W5797197595347441198 a;
    public final V2597580950516131749 b;
    public final B7506245556754967052 c;
    public final kz2 d;
    public final O16637889491137121389 e;
    public final H15186625828076266306 f;
    public final ConcurrentHashMap g;
    public boolean h;
    public R5692663580087387669 i;

    public mc2(W5797197595347441198 w5797197595347441198, V2597580950516131749 v2597580950516131749, B7506245556754967052 b7506245556754967052, kz2 kz2Var, O16637889491137121389 o16637889491137121389) {
        w5797197595347441198.getClass();
        b7506245556754967052.getClass();
        kz2Var.getClass();
        o16637889491137121389.getClass();
        this.a = w5797197595347441198;
        this.b = v2597580950516131749;
        this.c = b7506245556754967052;
        this.d = kz2Var;
        this.e = o16637889491137121389;
        this.f = new H15186625828076266306();
        this.g = new ConcurrentHashMap();
        this.h = true;
        R5692663580087387669 k = J8045362843799184672.k();
        if (this.h || !((Boolean) b7506245556754967052.a("gads:pc:pause_auto_refresh_on_app_background", Boolean.FALSE, ao.a$11)).booleanValue()) {
            k.f0();
        }
        this.i = k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (r8.v(r0) == r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        if (r9.c(r0) == r5) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.mc2 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.lc2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.lc2 r0 = (ads_mobile_sdk.lc2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.lc2 r0 = new ads_mobile_sdk.lc2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L81
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r4
        L31:
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.mc2 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r8
            r8 = r1
            goto L4d
        L3b:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.H15186625828076266306 r9 = r8.f
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r1 = r9.c(r0)
            if (r1 != r5) goto L4d
            goto L80
        L4d:
            dev.epro.r0.B7506245556754967052 r1 = r8.c     // Catch: java.lang.Throwable -> L6c
            java.lang.String r3 = "gads:pc:pause_auto_refresh_on_app_background"
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.ao r7 = ads_mobile_sdk.ao.a$11     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = r1.a(r3, r6, r7)     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6c
            if (r1 == 0) goto L6e
            dev.epro.r0.R5692663580087387669 r1 = r8.i     // Catch: java.lang.Throwable -> L6c
            boolean r1 = r1.p()     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L6e
            dev.epro.r0.R5692663580087387669 r8 = r8.i     // Catch: java.lang.Throwable -> L6c
            goto L6f
        L6c:
            r8 = move-exception
            goto L84
        L6e:
            r8 = r4
        L6f:
            r9.b(r4)
            if (r8 == 0) goto L81
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r8 = r8.v(r0)
            if (r8 != r5) goto L81
        L80:
            return r5
        L81:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a
            return r8
        L84:
            r9.b(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mc2.a(ads_mobile_sdk.mc2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.mc2 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.jc2
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.jc2 r0 = (ads_mobile_sdk.jc2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.jc2 r0 = new ads_mobile_sdk.jc2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r5 = r0.b
            ads_mobile_sdk.mc2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)
            r6 = r5
            r5 = r0
            goto L46
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r6)
            dev.epro.r0.H15186625828076266306 r6 = r5.f
            r0.a = r5
            r0.b = r6
            r0.e = r2
            java.lang.Object r0 = r6.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            r0 = 0
            r5.h = r0     // Catch: java.lang.Throwable -> L6c
            dev.epro.r0.B7506245556754967052 r0 = r5.c     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = "gads:pc:pause_auto_refresh_on_app_background"
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.ao r4 = ads_mobile_sdk.ao.a$11     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r0.a(r1, r2, r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6e
            dev.epro.r0.R5692663580087387669 r0 = r5.i     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6e
            dev.epro.r0.R5692663580087387669 r0 = dev.epro.r0.J8045362843799184672.k()     // Catch: java.lang.Throwable -> L6c
            r5.i = r0     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r5 = move-exception
            goto L74
        L6e:
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L6c
            r6.b(r3)
            return r5
        L74:
            r6.b(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mc2.b(ads_mobile_sdk.mc2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x0046, B:13:0x005d, B:14:0x0063), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(ads_mobile_sdk.mc2 r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.kc2
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.kc2 r0 = (ads_mobile_sdk.kc2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.kc2 r0 = new ads_mobile_sdk.kc2
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r6 = r0.b
            ads_mobile_sdk.mc2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r7)
            r7 = r6
            r6 = r0
            goto L46
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r7)
            dev.epro.r0.H15186625828076266306 r7 = r6.f
            r0.a = r6
            r0.b = r7
            r0.e = r2
            java.lang.Object r0 = r7.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            dev.epro.r0.B7506245556754967052 r0 = r6.c     // Catch: java.lang.Throwable -> L61
            r0.getClass()     // Catch: java.lang.Throwable -> L61
            java.lang.String r1 = "gads:pc:reschedule_auto_refresh_on_app_foreground"
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L61
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$11     // Catch: java.lang.Throwable -> L61
            java.lang.Object r0 = r0.a(r1, r4, r5)     // Catch: java.lang.Throwable -> L61
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L61
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L63
            r6.a$1()     // Catch: java.lang.Throwable -> L61
            goto L63
        L61:
            r6 = move-exception
            goto L70
        L63:
            r6.h = r2     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.R5692663580087387669 r6 = r6.i     // Catch: java.lang.Throwable -> L61
            r6.f0()     // Catch: java.lang.Throwable -> L61
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L61
            r7.b(r3)
            return r6
        L70:
            r7.b(r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.mc2.c(ads_mobile_sdk.mc2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void a$1() {
        this.e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        for (sk skVar : this.g.values()) {
            if (skVar.h.b()) {
                long j = skVar.g - currentTimeMillis;
                long j2 = 0;
                if (j <= 0) {
                    E17149812035295265804 e17149812035295265804 = E17093345031926825464.b;
                } else {
                    E17149812035295265804 e171498120352952658042 = E17093345031926825464.b;
                    j2 = M9216324016624295870.a0(j, N13798149404328803870.MILLISECONDS);
                }
                skVar.h.c(null);
                mc2 mc2Var = this;
                ic2 ic2Var = new ic2(j2, mc2Var, skVar, null);
                W5797197595347441198 w5797197595347441198 = mc2Var.a;
                w5797197595347441198.getClass();
                skVar.h = R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(ic2Var, null, (byte) 1), 2);
                this = mc2Var;
            }
        }
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object d(long j, R14062301455140331524 r14062301455140331524) {
        return b(this, r14062301455140331524);
    }

    @Override // dev.epro.r0.B8669154544800329371
    public final Object b(long j, R14062301455140331524 r14062301455140331524) {
        return c(this, r14062301455140331524);
    }

    public final void a(String str) {
        str.getClass();
        sk skVar = (sk) this.g.remove(str);
        if (skVar != null) {
            skVar.h.c(null);
        }
    }
}
