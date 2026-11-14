package ads_mobile_sdk;

import dev.epro.r0.A8094652504661216977;
import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X11644140690951955496;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class e23 {
    public final W5797197595347441198 a;
    public final A8094652504661216977 b;
    public final O16637889491137121389 c;
    public final H15186625828076266306 d;
    public X11644140690951955496 e;

    public e23(W5797197595347441198 w5797197595347441198, A8094652504661216977 a8094652504661216977, O16637889491137121389 o16637889491137121389) {
        w5797197595347441198.getClass();
        a8094652504661216977.getClass();
        o16637889491137121389.getClass();
        this.a = w5797197595347441198;
        this.b = a8094652504661216977;
        this.c = o16637889491137121389;
        this.d = new H15186625828076266306();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.e23 r11, java.lang.String r12, dev.epro.r0.K14749510448791472029 r13) {
        /*
            boolean r0 = r13 instanceof ads_mobile_sdk.c23
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.c23 r0 = (ads_mobile_sdk.c23) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ads_mobile_sdk.c23 r0 = new ads_mobile_sdk.c23
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.d
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r6 = 0
            dev.epro.r0.Z3437138737604933638 r10 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L31
            dev.epro.r0.H15186625828076266306 r11 = r0.c
            ads_mobile_sdk.y13 r12 = r0.b
            ads_mobile_sdk.e23 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Exception -> L84
            goto L74
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r11)
            r11 = 0
            return r11
        L38:
            ads_mobile_sdk.e23 r11 = r0.a
            dev.epro.r0.E17665849472693074628.k(r13)     // Catch: java.lang.Exception -> L84
            goto L5e
        L3e:
            dev.epro.r0.E17665849472693074628.k(r13)
            dev.epro.r0.A8094652504661216977 r13 = r11.b     // Catch: java.lang.Exception -> L84
            java.lang.Object r13 = r13.get()     // Catch: java.lang.Exception -> L84
            dev.epro.r0.A5401921815192175371 r13 = (dev.epro.r0.A5401921815192175371) r13     // Catch: java.lang.Exception -> L84
            dev.epro.r0.B5703672629416386538 r4 = new dev.epro.r0.B5703672629416386538     // Catch: java.lang.Exception -> L84
            r5 = 2
            r9 = 0
            r7 = r11
            r8 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L84
            r0.a = r7     // Catch: java.lang.Exception -> L84
            r0.f = r3     // Catch: java.lang.Exception -> L84
            java.lang.Object r13 = r13.a(r4, r0)     // Catch: java.lang.Exception -> L84
            if (r13 != r10) goto L5d
            goto L71
        L5d:
            r11 = r7
        L5e:
            r12 = r13
            ads_mobile_sdk.y13 r12 = (ads_mobile_sdk.y13) r12     // Catch: java.lang.Exception -> L84
            dev.epro.r0.H15186625828076266306 r13 = r11.d     // Catch: java.lang.Exception -> L84
            r0.a = r11     // Catch: java.lang.Exception -> L84
            r0.b = r12     // Catch: java.lang.Exception -> L84
            r0.c = r13     // Catch: java.lang.Exception -> L84
            r0.f = r2     // Catch: java.lang.Exception -> L84
            java.lang.Object r0 = r13.c(r0)     // Catch: java.lang.Exception -> L84
            if (r0 != r10) goto L72
        L71:
            return r10
        L72:
            r0 = r11
            r11 = r13
        L74:
            dev.epro.r0.A18119328133183277592 r12 = dev.epro.r0.S2941385686793915703.b(r12)     // Catch: java.lang.Throwable -> L7e
            r0.e = r12     // Catch: java.lang.Throwable -> L7e
            r11.b(r6)     // Catch: java.lang.Exception -> L84
            goto L94
        L7e:
            r0 = move-exception
            r12 = r0
            r11.b(r6)     // Catch: java.lang.Exception -> L84
            throw r12     // Catch: java.lang.Exception -> L84
        L84:
            r0 = move-exception
            r11 = r0
            ads_mobile_sdk.th3 r12 = ads_mobile_sdk.ji3.a()
            ads_mobile_sdk.cc2 r13 = r12.e()
            r0 = 0
            r13.m = r0
            r12.a(r11)
        L94:
            dev.epro.r0.O9245300239821758723 r11 = dev.epro.r0.O9245300239821758723.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e23.a(ads_mobile_sdk.e23, java.lang.String, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.e23 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.a23
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.a23 r0 = (ads_mobile_sdk.a23) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.a23 r0 = new ads_mobile_sdk.a23
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 2
            r3 = 1
            r4 = 0
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3b
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            dev.epro.r0.E17665849472693074628.k(r8)
            return r8
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r4
        L31:
            dev.epro.r0.H15186625828076266306 r7 = r0.b
            ads_mobile_sdk.e23 r1 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)
            r8 = r7
            r7 = r1
            goto L4d
        L3b:
            dev.epro.r0.E17665849472693074628.k(r8)
            dev.epro.r0.H15186625828076266306 r8 = r7.d
            r0.a = r7
            r0.b = r8
            r0.e = r3
            java.lang.Object r1 = r8.c(r0)
            if (r1 != r5) goto L4d
            goto L71
        L4d:
            dev.epro.r0.X11644140690951955496 r1 = r7.e     // Catch: java.lang.Throwable -> L60
            if (r1 != 0) goto L62
            dev.epro.r0.W5797197595347441198 r1 = r7.a     // Catch: java.lang.Throwable -> L60
            dev.epro.r0.N4024785987441166868 r3 = new dev.epro.r0.N4024785987441166868     // Catch: java.lang.Throwable -> L60
            r3.<init>(r7, r4, r2)     // Catch: java.lang.Throwable -> L60
            r6 = 3
            dev.epro.r0.O11899788901879362309 r1 = dev.epro.r0.R7033599853981556291.l(r1, r4, r3, r6)     // Catch: java.lang.Throwable -> L60
            r7.e = r1     // Catch: java.lang.Throwable -> L60
            goto L62
        L60:
            r7 = move-exception
            goto L73
        L62:
            r8.b(r4)
            r0.a = r4
            r0.b = r4
            r0.e = r2
            java.lang.Object r7 = r1.s(r0)
            if (r7 != r5) goto L72
        L71:
            return r5
        L72:
            return r7
        L73:
            r8.b(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.e23.a(ads_mobile_sdk.e23, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
