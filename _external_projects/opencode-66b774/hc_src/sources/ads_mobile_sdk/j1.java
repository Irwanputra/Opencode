package ads_mobile_sdk;

import dev.epro.r0.A8094652504661216977;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class j1 {
    public final A8094652504661216977 a;

    public j1(A8094652504661216977 a8094652504661216977) {
        a8094652504661216977.getClass();
        this.a = a8094652504661216977;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x007d, TryCatch #3 {all -> 0x007d, blocks: (B:19:0x006a, B:21:0x0071, B:23:0x0075, B:25:0x0079, B:26:0x007f, B:28:0x0083, B:30:0x0087, B:32:0x008b, B:33:0x008c, B:34:0x0091, B:35:0x0092, B:36:0x0099, B:37:0x009a, B:38:0x00a1, B:39:0x00a2), top: B:18:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:19:0x006a, B:21:0x0071, B:23:0x0075, B:25:0x0079, B:26:0x007f, B:28:0x0083, B:30:0x0087, B:32:0x008b, B:33:0x008c, B:34:0x0091, B:35:0x0092, B:36:0x0099, B:37:0x009a, B:38:0x00a1, B:39:0x00a2), top: B:18:0x006a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.F4096073349764486348 r5, dev.epro.r0.K14749510448791472029 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ads_mobile_sdk.h1
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.h1 r0 = (ads_mobile_sdk.h1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.h1 r0 = new ads_mobile_sdk.h1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            int r1 = r0.e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2c
            ads_mobile_sdk.th3 r4 = r0.b
            ads_mobile_sdk.th3 r5 = r0.a
            dev.epro.r0.E17665849472693074628.k(r6)     // Catch: java.lang.Throwable -> L2a
            goto L5e
        L2a:
            r6 = move-exception
            goto L6a
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r4)
            return r3
        L32:
            dev.epro.r0.E17665849472693074628.k(r6)
            java.util.WeakHashMap r6 = ads_mobile_sdk.ji3.a
            dev.epro.r0.O2161699089510411363 r6 = dev.epro.r0.O2161699089510411363.a
            ads_mobile_sdk.wv0 r1 = ads_mobile_sdk.wv0.CUI_NAME_PERSISTENT_CACHE_METADATA_WRITE
            ads_mobile_sdk.th3 r6 = ads_mobile_sdk.ji3.a(r1, r6, r2)
            dev.epro.r0.A8094652504661216977 r4 = r4.a     // Catch: java.lang.Throwable -> L66
            java.lang.Object r4 = r4.get()     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.A5401921815192175371 r4 = (dev.epro.r0.A5401921815192175371) r4     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.R17532065970449779817 r1 = new dev.epro.r0.R17532065970449779817     // Catch: java.lang.Throwable -> L66
            r1.<init>(r5, r3, r2)     // Catch: java.lang.Throwable -> L66
            r0.a = r6     // Catch: java.lang.Throwable -> L66
            r0.b = r6     // Catch: java.lang.Throwable -> L66
            r0.e = r2     // Catch: java.lang.Throwable -> L66
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: java.lang.Throwable -> L66
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r4 != r5) goto L5b
            return r5
        L5b:
            r5 = r6
            r6 = r4
            r4 = r5
        L5e:
            ads_mobile_sdk.g1 r6 = (ads_mobile_sdk.g1) r6     // Catch: java.lang.Throwable -> L2a
            dev.epro.r0.Z1953481206310471956.z(r4, r3)
            dev.epro.r0.O9245300239821758723 r4 = dev.epro.r0.O9245300239821758723.a
            return r4
        L66:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r5
        L6a:
            r5.b(r6)     // Catch: java.lang.Throwable -> L7d
            boolean r0 = r6 instanceof dev.epro.r0.N340633841638932414     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto La2
            boolean r0 = r6 instanceof dev.epro.r0.P2480554073835519965     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7f
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L7d
            if (r0 != 0) goto L7f
            r5.a(r6)     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r5 = move-exception
            goto La3
        L7f:
            boolean r5 = r6 instanceof dev.epro.r0.P2480554073835519965     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L9a
            boolean r5 = r6 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L7d
            if (r5 != 0) goto L92
            boolean r5 = r6 instanceof ads_mobile_sdk.dv0     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L8c
            throw r6     // Catch: java.lang.Throwable -> L7d
        L8c:
            ads_mobile_sdk.iu0 r5 = new ads_mobile_sdk.iu0     // Catch: java.lang.Throwable -> L7d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7d
            throw r5     // Catch: java.lang.Throwable -> L7d
        L92:
            ads_mobile_sdk.du0 r5 = new ads_mobile_sdk.du0     // Catch: java.lang.Throwable -> L7d
            java.util.concurrent.CancellationException r6 = (java.util.concurrent.CancellationException) r6     // Catch: java.lang.Throwable -> L7d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7d
            throw r5     // Catch: java.lang.Throwable -> L7d
        L9a:
            ads_mobile_sdk.lw0 r5 = new ads_mobile_sdk.lw0     // Catch: java.lang.Throwable -> L7d
            dev.epro.r0.P2480554073835519965 r6 = (dev.epro.r0.P2480554073835519965) r6     // Catch: java.lang.Throwable -> L7d
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L7d
            throw r5     // Catch: java.lang.Throwable -> L7d
        La2:
            throw r6     // Catch: java.lang.Throwable -> L7d
        La3:
            throw r5     // Catch: java.lang.Throwable -> La4
        La4:
            r6 = move-exception
            dev.epro.r0.Z1953481206310471956.z(r4, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.j1.a(dev.epro.r0.F4096073349764486348, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }
}
