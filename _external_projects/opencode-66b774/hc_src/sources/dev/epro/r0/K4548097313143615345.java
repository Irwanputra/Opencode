package dev.epro.r0;

import ads_mobile_sdk.cw0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public interface K4548097313143615345 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #2 {all -> 0x002a, blocks: (B:11:0x0026, B:12:0x0065, B:14:0x006b), top: B:10:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081 A[Catch: all -> 0x008d, TryCatch #3 {all -> 0x008d, blocks: (B:21:0x007a, B:23:0x0081, B:25:0x0085, B:27:0x0089, B:28:0x008f, B:30:0x0093, B:32:0x0097, B:34:0x009b, B:35:0x009c, B:36:0x00a1, B:37:0x00a2, B:38:0x00a9, B:39:0x00aa, B:40:0x00b1, B:41:0x00b2), top: B:20:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2 A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #3 {all -> 0x008d, blocks: (B:21:0x007a, B:23:0x0081, B:25:0x0085, B:27:0x0089, B:28:0x008f, B:30:0x0093, B:32:0x0097, B:34:0x009b, B:35:0x009c, B:36:0x00a1, B:37:0x00a2, B:38:0x00a9, B:39:0x00aa, B:40:0x00b1, B:41:0x00b2), top: B:20:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object a(dev.epro.r0.K4548097313143615345 r7, dev.epro.r0.K14749510448791472029 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.e83
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.e83 r0 = (ads_mobile_sdk.e83) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.e83 r0 = new ads_mobile_sdk.e83
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            ads_mobile_sdk.th3 r7 = r0.b
            ads_mobile_sdk.th3 r0 = r0.a
            dev.epro.r0.E17665849472693074628.k(r8)     // Catch: java.lang.Throwable -> L2a
            goto L65
        L2a:
            r8 = move-exception
            goto L7a
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r7)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r8)
            java.util.WeakHashMap r8 = ads_mobile_sdk.ji3.a
            dev.epro.r0.O2161699089510411363 r8 = dev.epro.r0.O2161699089510411363.a
            ads_mobile_sdk.wv0 r1 = ads_mobile_sdk.wv0.CUI_NAME_SIGNAL
            ads_mobile_sdk.th3 r8 = ads_mobile_sdk.ji3.a(r1, r8, r2)
            ads_mobile_sdk.th3 r1 = ads_mobile_sdk.ji3.a()     // Catch: java.lang.Throwable -> L76
            ads_mobile_sdk.cc2 r1 = r1.e()     // Catch: java.lang.Throwable -> L76
            ads_mobile_sdk.u73 r4 = new ads_mobile_sdk.u73     // Catch: java.lang.Throwable -> L76
            ads_mobile_sdk.cw0 r5 = r7.mo19a()     // Catch: java.lang.Throwable -> L76
            r6 = 6
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L76
            r1.t = r4     // Catch: java.lang.Throwable -> L76
            r0.a = r8     // Catch: java.lang.Throwable -> L76
            r0.b = r8     // Catch: java.lang.Throwable -> L76
            r0.e = r2     // Catch: java.lang.Throwable -> L76
            java.lang.Object r7 = r7.d(r0)     // Catch: java.lang.Throwable -> L76
            dev.epro.r0.Z3437138737604933638 r0 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r0) goto L62
            return r0
        L62:
            r0 = r8
            r8 = r7
            r7 = r0
        L65:
            dev.epro.r0.M16184408391440927034 r8 = (dev.epro.r0.M16184408391440927034) r8     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r8 instanceof ads_mobile_sdk.pu0     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L72
            r1 = r8
            ads_mobile_sdk.pu0 r1 = (ads_mobile_sdk.pu0) r1     // Catch: java.lang.Throwable -> L2a
            r2 = 0
            ads_mobile_sdk.zi3.a(r1, r2)     // Catch: java.lang.Throwable -> L2a
        L72:
            dev.epro.r0.Z1953481206310471956.z(r7, r3)
            return r8
        L76:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r0
        L7a:
            r0.b(r8)     // Catch: java.lang.Throwable -> L8d
            boolean r1 = r8 instanceof dev.epro.r0.N340633841638932414     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto Lb2
            boolean r1 = r8 instanceof dev.epro.r0.P2480554073835519965     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L8f
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L8f
            r0.a(r8)     // Catch: java.lang.Throwable -> L8d
            goto L8f
        L8d:
            r8 = move-exception
            goto Lb3
        L8f:
            boolean r0 = r8 instanceof dev.epro.r0.P2480554073835519965     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto Laa
            boolean r0 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto La2
            boolean r0 = r8 instanceof ads_mobile_sdk.dv0     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L9c
            throw r8     // Catch: java.lang.Throwable -> L8d
        L9c:
            ads_mobile_sdk.iu0 r0 = new ads_mobile_sdk.iu0     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        La2:
            ads_mobile_sdk.du0 r0 = new ads_mobile_sdk.du0     // Catch: java.lang.Throwable -> L8d
            java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        Laa:
            ads_mobile_sdk.lw0 r0 = new ads_mobile_sdk.lw0     // Catch: java.lang.Throwable -> L8d
            dev.epro.r0.P2480554073835519965 r8 = (dev.epro.r0.P2480554073835519965) r8     // Catch: java.lang.Throwable -> L8d
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L8d
            throw r0     // Catch: java.lang.Throwable -> L8d
        Lb2:
            throw r8     // Catch: java.lang.Throwable -> L8d
        Lb3:
            throw r8     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r0 = move-exception
            dev.epro.r0.Z1953481206310471956.z(r7, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K4548097313143615345.a(dev.epro.r0.K4548097313143615345, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* renamed from: a */
    cw0 mo19a();

    default Object c(R4833348786910499294 r4833348786910499294) {
        return a(this, (K14749510448791472029) r4833348786910499294);
    }

    Object d(R4833348786910499294 r4833348786910499294);
}
