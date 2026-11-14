package ads_mobile_sdk;

import dev.epro.r0.H15186625828076266306;
import dev.epro.r0.O16637889491137121389;
import dev.epro.r0.W5797197595347441198;
import dev.epro.r0.X7175349259954592591;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class rg2 {
    public final W5797197595347441198 a;
    public final O16637889491137121389 b;
    public final jr0 c;
    public final ib1 d;
    public final kz2 e;
    public final H15186625828076266306 f;
    public long g;
    public c7 h;
    public X7175349259954592591 i;

    public rg2(W5797197595347441198 w5797197595347441198, O16637889491137121389 o16637889491137121389, jr0 jr0Var, ib1 ib1Var, kz2 kz2Var) {
        w5797197595347441198.getClass();
        o16637889491137121389.getClass();
        jr0Var.getClass();
        ib1Var.getClass();
        kz2Var.getClass();
        this.a = w5797197595347441198;
        this.b = o16637889491137121389;
        this.c = jr0Var;
        this.d = ib1Var;
        this.e = kz2Var;
        this.f = new H15186625828076266306();
        this.g = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:11:0x0046, B:13:0x007a, B:15:0x007e, B:18:0x0087, B:19:0x009b, B:20:0x009d), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.rg2 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.og2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.og2 r0 = (ads_mobile_sdk.og2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.og2 r0 = new ads_mobile_sdk.og2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            dev.epro.r0.H15186625828076266306 r8 = r0.b
            ads_mobile_sdk.rg2 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r9)
            r9 = r8
            r8 = r0
            goto L46
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.H15186625828076266306 r9 = r8.f
            r0.a = r8
            r0.b = r9
            r0.e = r2
            java.lang.Object r0 = r9.c(r0)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r0 != r1) goto L46
            return r1
        L46:
            dev.epro.r0.O16637889491137121389 r0 = r8.b     // Catch: java.lang.Throwable -> L99
            r0.getClass()     // Catch: java.lang.Throwable -> L99
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L99
            long r4 = r8.g     // Catch: java.lang.Throwable -> L99
            long r0 = r0 - r4
            ads_mobile_sdk.jr0 r2 = r8.c     // Catch: java.lang.Throwable -> L99
            r2.getClass()     // Catch: java.lang.Throwable -> L99
            java.lang.String r4 = "gads:play_prewarm_manager_connection_duration"
            dev.epro.r0.E17149812035295265804 r5 = dev.epro.r0.E17093345031926825464.b     // Catch: java.lang.Throwable -> L99
            dev.epro.r0.N13798149404328803870 r5 = dev.epro.r0.N13798149404328803870.SECONDS     // Catch: java.lang.Throwable -> L99
            r6 = 180(0xb4, float:2.52E-43)
            long r5 = dev.epro.r0.M9216324016624295870.Z(r6, r5)     // Catch: java.lang.Throwable -> L99
            dev.epro.r0.E17093345031926825464 r7 = new dev.epro.r0.E17093345031926825464     // Catch: java.lang.Throwable -> L99
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L99
            ads_mobile_sdk.ao r5 = ads_mobile_sdk.ao.a$2     // Catch: java.lang.Throwable -> L99
            java.lang.Object r2 = r2.a(r4, r7, r5)     // Catch: java.lang.Throwable -> L99
            dev.epro.r0.E17093345031926825464 r2 = (dev.epro.r0.E17093345031926825464) r2     // Catch: java.lang.Throwable -> L99
            long r4 = r2.a     // Catch: java.lang.Throwable -> L99
            long r4 = dev.epro.r0.E17093345031926825464.e(r4)     // Catch: java.lang.Throwable -> L99
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L9d
            ads_mobile_sdk.c7 r0 = r8.h     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> L99
            ads_mobile_sdk.tl2 r0 = (ads_mobile_sdk.tl2) r0     // Catch: java.lang.Throwable -> L99
            ads_mobile_sdk.k33 r0 = r0.a     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L87
            goto L9b
        L87:
            ads_mobile_sdk.d62 r1 = ads_mobile_sdk.tl2.c     // Catch: java.lang.Throwable -> L99
            r1.getClass()     // Catch: java.lang.Throwable -> L99
            r0.getClass()     // Catch: java.lang.Throwable -> L99
            ads_mobile_sdk.f33 r1 = new ads_mobile_sdk.f33     // Catch: java.lang.Throwable -> L99
            r2 = 0
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L99
            r0.b(r1)     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            r8 = move-exception
            goto La3
        L9b:
            r8.h = r3     // Catch: java.lang.Throwable -> L99
        L9d:
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L99
            r9.b(r3)
            return r8
        La3:
            r9.b(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.rg2.a(ads_mobile_sdk.rg2, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
