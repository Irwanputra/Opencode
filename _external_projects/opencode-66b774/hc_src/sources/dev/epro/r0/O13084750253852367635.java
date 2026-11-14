package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O13084750253852367635 extends A8269341136279542501 {
    public final String a;
    public final S16571168858015125610 b;
    public final U14340554418656580554 c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;

    public O13084750253852367635(String str, S16571168858015125610 s16571168858015125610, U14340554418656580554 u14340554418656580554, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = s16571168858015125610;
        this.c = u14340554418656580554;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        O1218119530002257462 o1218119530002257462 = new O1218119530002257462();
        o1218119530002257462.f396o = this.a;
        o1218119530002257462.p = this.b;
        o1218119530002257462.q = this.c;
        o1218119530002257462.r = this.d;
        o1218119530002257462.s = this.e;
        o1218119530002257462.t = this.f;
        o1218119530002257462.u = this.g;
        return o1218119530002257462;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // dev.epro.r0.A8269341136279542501
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(dev.epro.r0.R15896830329318850690 r11) {
        /*
            r10 = this;
            dev.epro.r0.O1218119530002257462 r11 = (dev.epro.r0.O1218119530002257462) r11
            r11.getClass()
            dev.epro.r0.S16571168858015125610 r0 = r11.p
            r1 = 0
            r2 = 1
            dev.epro.r0.S16571168858015125610 r3 = r10.b
            if (r3 == r0) goto L1a
            dev.epro.r0.W1742516786250891319 r4 = r3.a
            dev.epro.r0.W1742516786250891319 r0 = r0.a
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L18
            goto L1d
        L18:
            r0 = r2
            goto L1e
        L1a:
            r3.getClass()
        L1d:
            r0 = r1
        L1e:
            java.lang.String r4 = r11.f396o
            java.lang.String r5 = r10.a
            boolean r4 = dev.epro.r0.S10823041268949770285.t(r4, r5)
            if (r4 == 0) goto L29
            goto L2f
        L29:
            r11.f396o = r5
            r1 = 0
            r11.y = r1
            r1 = r2
        L2f:
            dev.epro.r0.S16571168858015125610 r4 = r11.p
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r11.p = r3
            int r3 = r11.u
            int r5 = r10.g
            if (r3 == r5) goto L41
            r11.u = r5
            r4 = r2
        L41:
            int r3 = r11.t
            int r5 = r10.f
            if (r3 == r5) goto L4a
            r11.t = r5
            r4 = r2
        L4a:
            boolean r3 = r11.s
            boolean r5 = r10.e
            if (r3 == r5) goto L53
            r11.s = r5
            r4 = r2
        L53:
            dev.epro.r0.U14340554418656580554 r3 = r11.q
            dev.epro.r0.U14340554418656580554 r5 = r10.c
            boolean r3 = dev.epro.r0.S10823041268949770285.t(r3, r5)
            if (r3 != 0) goto L60
            r11.q = r5
            r4 = r2
        L60:
            int r3 = r11.r
            int r10 = r10.d
            if (r3 != r10) goto L68
            r2 = r4
            goto L6a
        L68:
            r11.r = r10
        L6a:
            if (r1 != 0) goto L6e
            if (r2 == 0) goto L9a
        L6e:
            dev.epro.r0.U12360584732002626345 r10 = r11.h1()
            java.lang.String r3 = r11.f396o
            dev.epro.r0.S16571168858015125610 r4 = r11.p
            dev.epro.r0.U14340554418656580554 r5 = r11.q
            int r6 = r11.r
            boolean r7 = r11.s
            int r8 = r11.t
            int r9 = r11.u
            r10.a = r3
            r10.b = r4
            r10.c = r5
            r10.d = r6
            r10.e = r7
            r10.f = r8
            r10.g = r9
            long r3 = r10.s
            r5 = 2
            long r3 = r3 << r5
            r5 = 2
            long r3 = r3 | r5
            r10.s = r3
            r10.c()
        L9a:
            boolean r10 = r11.n
            if (r10 != 0) goto L9f
            goto Lb9
        L9f:
            if (r1 != 0) goto La7
            if (r0 == 0) goto Laa
            dev.epro.r0.T8076737975737680466 r10 = r11.x
            if (r10 == 0) goto Laa
        La7:
            dev.epro.r0.E10717724117948616506.n(r11)
        Laa:
            if (r1 != 0) goto Lae
            if (r2 == 0) goto Lb4
        Lae:
            dev.epro.r0.D1286559660607336098.v(r11)
            dev.epro.r0.V1475975160983963926.D(r11)
        Lb4:
            if (r0 == 0) goto Lb9
            dev.epro.r0.V1475975160983963926.D(r11)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O13084750253852367635.c(dev.epro.r0.R15896830329318850690):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O13084750253852367635)) {
            return false;
        }
        O13084750253852367635 o13084750253852367635 = (O13084750253852367635) obj;
        return S10823041268949770285.t(this.a, o13084750253852367635.a) && S10823041268949770285.t(this.b, o13084750253852367635.b) && S10823041268949770285.t(this.c, o13084750253852367635.c) && this.d == o13084750253852367635.d && this.e == o13084750253852367635.e && this.f == o13084750253852367635.f && this.g == o13084750253852367635.g;
    }

    public final int hashCode() {
        return (((G6547577305291411977.i(X2485016533998461232.f(this.d, (this.c.hashCode() + G11450220448113054352.c(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e) + this.f) * 31) + this.g) * 31;
    }
}
