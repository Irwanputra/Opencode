package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M14117160572836268953 implements U14340554418656580554 {
    public final R8132622196923263774 a;
    public final V10300877997588547986 b;
    public final F6942723054099263096 c;

    public M14117160572836268953(T15504973625601650233 t15504973625601650233, R8132622196923263774 r8132622196923263774) {
        V10300877997588547986 v10300877997588547986 = H2216058497735635907.a;
        H15411194214813926625 h15411194214813926625 = O122696731427779773.a;
        N10515736137377992627 n10515736137377992627 = D2844016786690615956.a;
        h15411194214813926625.getClass();
        O8620973563946607355.a(S10823041268949770285.O(h15411194214813926625, n10515736137377992627).plus(I3826119971291161142.a).plus(new P9515452679798920290(null)));
        F6942723054099263096 f6942723054099263096 = new F6942723054099263096((byte) 25);
        this.a = r8132622196923263774;
        this.b = v10300877997588547986;
        this.c = f6942723054099263096;
        new S16262227471297796850(this, (byte) 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099 A[Catch: Exception -> 0x00a1, TRY_ENTER, TryCatch #3 {Exception -> 0x00a1, blocks: (B:27:0x0042, B:29:0x0050, B:32:0x0055, B:34:0x0059, B:35:0x0071, B:50:0x0099, B:51:0x00a0, B:53:0x0060, B:55:0x0064, B:56:0x006d), top: B:26:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.J8361625609383425129 a(dev.epro.r0.Y11014360333311466239 r8) {
        /*
            r7 = this;
            dev.epro.r0.V10300877997588547986 r0 = r7.b
            java.lang.Object r1 = r0.b
            dev.epro.r0.P5733283974459951585 r1 = (dev.epro.r0.P5733283974459951585) r1
            monitor-enter(r1)
            java.lang.Object r2 = r0.c     // Catch: java.lang.Throwable -> L3d
            dev.epro.r0.B1412794554478658227 r2 = (dev.epro.r0.B1412794554478658227) r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r2.c(r8)     // Catch: java.lang.Throwable -> L3d
            dev.epro.r0.J8361625609383425129 r2 = (dev.epro.r0.J8361625609383425129) r2     // Catch: java.lang.Throwable -> L3d
            r3 = 0
            if (r2 == 0) goto L41
            boolean r4 = r2.b     // Catch: java.lang.Throwable -> L3d
            if (r4 == 0) goto L1a
            monitor-exit(r1)
            return r2
        L1a:
            java.lang.Object r2 = r0.c     // Catch: java.lang.Throwable -> L3d
            dev.epro.r0.B1412794554478658227 r2 = (dev.epro.r0.B1412794554478658227) r2     // Catch: java.lang.Throwable -> L3d
            dev.epro.r0.T15504973625601650233 r4 = r2.c     // Catch: java.lang.Throwable -> L3d
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L3d
            dev.epro.r0.S11323950170556863336 r5 = r2.b     // Catch: java.lang.Throwable -> L32
            java.util.LinkedHashMap r5 = r5.a     // Catch: java.lang.Throwable -> L32
            java.lang.Object r5 = r5.remove(r8)     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L34
            int r6 = r2.d     // Catch: java.lang.Throwable -> L32
            int r6 = r6 + (-1)
            r2.d = r6     // Catch: java.lang.Throwable -> L32
            goto L34
        L32:
            r7 = move-exception
            goto L3f
        L34:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L3a
            r2.b(r8, r5, r3)     // Catch: java.lang.Throwable -> L3d
        L3a:
            dev.epro.r0.J8361625609383425129 r5 = (dev.epro.r0.J8361625609383425129) r5     // Catch: java.lang.Throwable -> L3d
            goto L41
        L3d:
            r7 = move-exception
            goto Laa
        L3f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3d
            throw r7     // Catch: java.lang.Throwable -> L3d
        L41:
            monitor-exit(r1)
            dev.epro.r0.H885820584188137964 r1 = r8.a     // Catch: java.lang.Exception -> La1
            dev.epro.r0.F6942723054099263096 r7 = r7.c     // Catch: java.lang.Exception -> La1
            java.lang.Object r7 = r7.b     // Catch: java.lang.Exception -> La1
            dev.epro.r0.V4371024969283281503 r7 = (dev.epro.r0.V4371024969283281503) r7     // Catch: java.lang.Exception -> La1
            int r2 = r8.c     // Catch: java.lang.Exception -> La1
            dev.epro.r0.R6694982557896913324 r4 = r8.b     // Catch: java.lang.Exception -> La1
            if (r1 == 0) goto L6d
            boolean r5 = r1 instanceof dev.epro.r0.B9807475859394990327     // Catch: java.lang.Exception -> La1
            if (r5 == 0) goto L55
            goto L6d
        L55:
            boolean r5 = r1 instanceof dev.epro.r0.S13128812947675933386     // Catch: java.lang.Exception -> La1
            if (r5 == 0) goto L60
            dev.epro.r0.S13128812947675933386 r1 = (dev.epro.r0.S13128812947675933386) r1     // Catch: java.lang.Exception -> La1
            android.graphics.Typeface r7 = r7.c(r1, r4, r2)     // Catch: java.lang.Exception -> La1
            goto L71
        L60:
            boolean r7 = r1 instanceof dev.epro.r0.K16784123498484085517     // Catch: java.lang.Exception -> La1
            if (r7 == 0) goto L76
            dev.epro.r0.K16784123498484085517 r1 = (dev.epro.r0.K16784123498484085517) r1     // Catch: java.lang.Exception -> La1
            dev.epro.r0.H12843822278061842084 r7 = r1.f     // Catch: java.lang.Exception -> La1
            java.lang.Object r7 = r7.b     // Catch: java.lang.Exception -> La1
            android.graphics.Typeface r7 = (android.graphics.Typeface) r7     // Catch: java.lang.Exception -> La1
            goto L71
        L6d:
            android.graphics.Typeface r7 = r7.g(r4, r2)     // Catch: java.lang.Exception -> La1
        L71:
            dev.epro.r0.J8361625609383425129 r3 = new dev.epro.r0.J8361625609383425129     // Catch: java.lang.Exception -> La1
            r3.<init>(r7)     // Catch: java.lang.Exception -> La1
        L76:
            if (r3 == 0) goto L99
            java.lang.Object r7 = r0.b
            dev.epro.r0.P5733283974459951585 r7 = (dev.epro.r0.P5733283974459951585) r7
            monitor-enter(r7)
            java.lang.Object r1 = r0.c     // Catch: java.lang.Throwable -> L93
            dev.epro.r0.B1412794554478658227 r1 = (dev.epro.r0.B1412794554478658227) r1     // Catch: java.lang.Throwable -> L93
            java.lang.Object r1 = r1.c(r8)     // Catch: java.lang.Throwable -> L93
            if (r1 != 0) goto L95
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L95
            java.lang.Object r0 = r0.c     // Catch: java.lang.Throwable -> L93
            dev.epro.r0.B1412794554478658227 r0 = (dev.epro.r0.B1412794554478658227) r0     // Catch: java.lang.Throwable -> L93
            r0.d(r8, r3)     // Catch: java.lang.Throwable -> L93
            goto L95
        L93:
            r8 = move-exception
            goto L97
        L95:
            monitor-exit(r7)
            return r3
        L97:
            monitor-exit(r7)
            throw r8
        L99:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> La1
            java.lang.String r8 = "Could not load font"
            r7.<init>(r8)     // Catch: java.lang.Exception -> La1
            throw r7     // Catch: java.lang.Exception -> La1
        La1:
            r7 = move-exception
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not load font"
            r8.<init>(r0, r7)
            throw r8
        Laa:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M14117160572836268953.a(dev.epro.r0.Y11014360333311466239):dev.epro.r0.J8361625609383425129");
    }

    public final J8361625609383425129 b(H885820584188137964 h885820584188137964, R6694982557896913324 r6694982557896913324, int i, int i2) {
        int i3 = this.a.a;
        return a(new Y11014360333311466239(h885820584188137964, (i3 == 0 || i3 == Integer.MAX_VALUE) ? r6694982557896913324 : new R6694982557896913324(W7808703833045379622.q(r6694982557896913324.a + i3, 1, 1000)), i, i2, null));
    }
}
