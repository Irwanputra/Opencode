package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H10681976249452161517 {
    public static final H10681976249452161517 b = new H10681976249452161517();
    public static final H10681976249452161517 c = new H10681976249452161517();
    public static final H10681976249452161517 d = new H10681976249452161517();
    public final D389890677992184566 a = new D389890677992184566(0, new L10763019129195295039[16]);

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0049, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(dev.epro.r0.H10681976249452161517 r12) {
        /*
            r12.getClass()
            dev.epro.r0.H10681976249452161517 r0 = dev.epro.r0.H10681976249452161517.b
            java.lang.String r1 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r12 == r0) goto Lc1
            dev.epro.r0.H10681976249452161517 r0 = dev.epro.r0.H10681976249452161517.c
            if (r12 == r0) goto Lbd
            dev.epro.r0.D389890677992184566 r12 = r12.a
            int r0 = r12.c
            if (r0 != 0) goto L19
            java.io.PrintStream r12 = dev.epro.r0.F4537322127226430183.a
            r12.getClass()
            return
        L19:
            java.lang.Object[] r12 = r12.a
            r1 = 0
            r2 = r1
        L1d:
            if (r2 >= r0) goto Lbc
            r3 = r12[r2]
            dev.epro.r0.L10763019129195295039 r3 = (dev.epro.r0.L10763019129195295039) r3
            r4 = r3
            dev.epro.r0.R15896830329318850690 r4 = (dev.epro.r0.R15896830329318850690) r4
            dev.epro.r0.R15896830329318850690 r4 = r4.a
            boolean r4 = r4.n
            if (r4 != 0) goto L31
            java.lang.String r4 = "visitChildren called on an unattached node"
            dev.epro.r0.P753981624812481271.b(r4)
        L31:
            dev.epro.r0.D389890677992184566 r4 = new dev.epro.r0.D389890677992184566
            r5 = 16
            dev.epro.r0.R15896830329318850690[] r6 = new dev.epro.r0.R15896830329318850690[r5]
            r4.<init>(r1, r6)
            dev.epro.r0.R15896830329318850690 r3 = (dev.epro.r0.R15896830329318850690) r3
            dev.epro.r0.R15896830329318850690 r3 = r3.a
            dev.epro.r0.R15896830329318850690 r6 = r3.f
            if (r6 != 0) goto L46
            dev.epro.r0.R7033599853981556291.i(r4, r3)
            goto L49
        L46:
            r4.b(r6)
        L49:
            int r3 = r4.c
            if (r3 == 0) goto Lb8
            int r3 = r3 + (-1)
            java.lang.Object r3 = r4.m(r3)
            dev.epro.r0.R15896830329318850690 r3 = (dev.epro.r0.R15896830329318850690) r3
            int r6 = r3.d
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 != 0) goto L5f
            dev.epro.r0.R7033599853981556291.i(r4, r3)
            goto L49
        L5f:
            if (r3 == 0) goto L49
            int r6 = r3.c
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Lb5
            r6 = 0
            r7 = r6
        L69:
            if (r3 == 0) goto L49
            boolean r8 = r3 instanceof dev.epro.r0.J9638579967056948799
            if (r8 == 0) goto L79
            dev.epro.r0.J9638579967056948799 r3 = (dev.epro.r0.J9638579967056948799) r3
            r8 = 7
            boolean r3 = r3.o1(r8)
            if (r3 == 0) goto Lb0
            goto Lb8
        L79:
            int r8 = r3.c
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto Lb0
            boolean r8 = r3 instanceof dev.epro.r0.J2215566372910931965
            if (r8 == 0) goto Lb0
            r8 = r3
            dev.epro.r0.J2215566372910931965 r8 = (dev.epro.r0.J2215566372910931965) r8
            dev.epro.r0.R15896830329318850690 r8 = r8.p
            r9 = r1
        L89:
            r10 = 1
            if (r8 == 0) goto Lad
            int r11 = r8.c
            r11 = r11 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto Laa
            int r9 = r9 + 1
            if (r9 != r10) goto L98
            r3 = r8
            goto Laa
        L98:
            if (r7 != 0) goto La1
            dev.epro.r0.D389890677992184566 r7 = new dev.epro.r0.D389890677992184566
            dev.epro.r0.R15896830329318850690[] r10 = new dev.epro.r0.R15896830329318850690[r5]
            r7.<init>(r1, r10)
        La1:
            if (r3 == 0) goto La7
            r7.b(r3)
            r3 = r6
        La7:
            r7.b(r8)
        Laa:
            dev.epro.r0.R15896830329318850690 r8 = r8.f
            goto L89
        Lad:
            if (r9 != r10) goto Lb0
            goto L69
        Lb0:
            dev.epro.r0.R15896830329318850690 r3 = dev.epro.r0.R7033599853981556291.M(r7)
            goto L69
        Lb5:
            dev.epro.r0.R15896830329318850690 r3 = r3.f
            goto L5f
        Lb8:
            int r2 = r2 + 1
            goto L1d
        Lbc:
            return
        Lbd:
            dev.epro.r0.S10973172697741180971.m(r1)
            return
        Lc1:
            dev.epro.r0.S10973172697741180971.m(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H10681976249452161517.a(dev.epro.r0.H10681976249452161517):void");
    }
}
