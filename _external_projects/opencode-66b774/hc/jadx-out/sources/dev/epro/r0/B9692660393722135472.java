package dev.epro.r0;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B9692660393722135472 {
    public boolean A;
    public RectF B;
    public final Y257452374762370649 a;
    public Outline f;
    public float j;
    public J8045362843799184672 k;
    public B1061516154492673368 l;
    public B1061516154492673368 m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public N16536369055082677148 f179o;
    public O3228356295430981133 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public R8540738700654750557 b = A10225670138084435446.e;
    public F10342546226345611902 c = F10342546226345611902.a;
    public F4096073349764486348 d = J6249063375258466235.y;
    public final J3227772737003951788 e = new J3227772737003951788(this, 11);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final A6478343232691943615 r = new A6478343232691943615();

    static {
        S10823041268949770285.t(Build.FINGERPRINT, "robolectric");
    }

    public B9692660393722135472(Y257452374762370649 y257452374762370649) {
        this.a = y257452374762370649;
        y257452374762370649.t(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            Y257452374762370649 y257452374762370649 = this.a;
            if (z || y257452374762370649.F() > 0.0f) {
                B1061516154492673368 b1061516154492673368 = this.l;
                if (b1061516154492673368 != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = b1061516154492673368 instanceof B1061516154492673368;
                    if (!z2) {
                        D11988991656201568495.j("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = b1061516154492673368.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                D11988991656201568495.j("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setPath(path);
                        } else {
                            if (!z2) {
                                D11988991656201568495.j("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = b1061516154492673368;
                    if (outline != null) {
                        outline.setAlpha(y257452374762370649.a());
                        outline2 = outline;
                    }
                    y257452374762370649.l(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        y257452374762370649.t(false);
                        y257452374762370649.q();
                    } else {
                        y257452374762370649.t(this.A);
                    }
                } else {
                    y257452374762370649.t(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jQ = I3887072968740112330.Q(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jQ = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jQ >> 32);
                    int i5 = (int) (jQ & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(y257452374762370649.a());
                    y257452374762370649.l(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                y257452374762370649.t(false);
                y257452374762370649.l(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L75
            int r0 = r15.q
            if (r0 != 0) goto L75
            dev.epro.r0.A6478343232691943615 r0 = r15.r
            java.lang.Object r1 = r0.b
            dev.epro.r0.B9692660393722135472 r1 = (dev.epro.r0.B9692660393722135472) r1
            if (r1 == 0) goto L1c
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
            r1 = 0
            r0.b = r1
        L1c:
            java.lang.Object r0 = r0.d
            dev.epro.r0.E13273723708836014930 r0 = (dev.epro.r0.E13273723708836014930) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            dev.epro.r0.B9692660393722135472 r11 = (dev.epro.r0.B9692660393722135472) r11
            int r12 = r11.q
            int r12 = r12 + (-1)
            r11.q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.b()
        L70:
            dev.epro.r0.Y257452374762370649 r15 = r15.a
            r15.q()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B9692660393722135472.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(dev.epro.r0.L17598299826319227431 r14) {
        /*
            r13 = this;
            dev.epro.r0.A6478343232691943615 r0 = r13.r
            java.lang.Object r1 = r0.b
            dev.epro.r0.B9692660393722135472 r1 = (dev.epro.r0.B9692660393722135472) r1
            r0.c = r1
            java.lang.Object r1 = r0.d
            dev.epro.r0.E13273723708836014930 r1 = (dev.epro.r0.E13273723708836014930) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.h()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.e
            dev.epro.r0.E13273723708836014930 r2 = (dev.epro.r0.E13273723708836014930) r2
            if (r2 != 0) goto L23
            dev.epro.r0.E13273723708836014930 r2 = dev.epro.r0.L12621230156277355451.a
            dev.epro.r0.E13273723708836014930 r2 = new dev.epro.r0.E13273723708836014930
            r2.<init>()
            r0.e = r2
        L23:
            r2.j(r1)
            r1.b()
        L29:
            r1 = 1
            r0.a = r1
            dev.epro.r0.F4096073349764486348 r13 = r13.d
            r13.invoke(r14)
            r13 = 0
            r0.a = r13
            java.lang.Object r14 = r0.c
            dev.epro.r0.B9692660393722135472 r14 = (dev.epro.r0.B9692660393722135472) r14
            if (r14 == 0) goto L43
            int r1 = r14.q
            int r1 = r1 + (-1)
            r14.q = r1
            r14.b()
        L43:
            java.lang.Object r14 = r0.e
            dev.epro.r0.E13273723708836014930 r14 = (dev.epro.r0.E13273723708836014930) r14
            if (r14 == 0) goto L9c
            boolean r0 = r14.h()
            if (r0 == 0) goto L9c
            java.lang.Object[] r0 = r14.b
            long[] r1 = r14.a
            int r2 = r1.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L99
            r3 = r13
        L59:
            r4 = r1[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L94
            int r6 = r3 - r2
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r13
        L73:
            if (r8 >= r6) goto L92
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L8e
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            dev.epro.r0.B9692660393722135472 r9 = (dev.epro.r0.B9692660393722135472) r9
            int r10 = r9.q
            int r10 = r10 + (-1)
            r9.q = r10
            r9.b()
        L8e:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L73
        L92:
            if (r6 != r7) goto L99
        L94:
            if (r3 == r2) goto L99
            int r3 = r3 + 1
            goto L59
        L99:
            r14.b()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B9692660393722135472.c(dev.epro.r0.L17598299826319227431):void");
    }

    public final J8045362843799184672 d() {
        J8045362843799184672 k10859651572364480586;
        J8045362843799184672 j8045362843799184672 = this.k;
        B1061516154492673368 b1061516154492673368 = this.l;
        if (j8045362843799184672 != null) {
            return j8045362843799184672;
        }
        if (b1061516154492673368 != null) {
            L11060719515004085110 l11060719515004085110 = new L11060719515004085110(b1061516154492673368);
            this.k = l11060719515004085110;
            return l11060719515004085110;
        }
        long jQ = I3887072968740112330.Q(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jQ = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jQ >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jQ & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat6)) & 4294967295L);
            k10859651572364480586 = new K14082636229475424456(new V14120702150497747934(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2));
        } else {
            k10859651572364480586 = new K10859651572364480586(new S6349823729575121924(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = k10859651572364480586;
        return k10859651572364480586;
    }

    public final void e(float f) {
        Y257452374762370649 y257452374762370649 = this.a;
        if (y257452374762370649.a() == f) {
            return;
        }
        y257452374762370649.c(f);
    }

    public final void f(long j, long j2, float f) {
        float f2 = this.v;
        long jF = L2216691091636065972.f(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (L2216691091636065972.b(this.h, jF) && W8572396779607072172.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jF;
        this.i = j2;
        this.j = f;
        a();
    }
}
