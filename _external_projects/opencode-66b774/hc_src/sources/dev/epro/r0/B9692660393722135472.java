package dev.epro.r0;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
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

    /* renamed from: o, reason: collision with root package name */
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
                    y257452374762370649.l(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
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
                    long Q = I3887072968740112330.Q(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        Q = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (Q >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (Q & 4294967295L)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(y257452374762370649.a());
                    y257452374762370649.l(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                y257452374762370649.t(false);
                y257452374762370649.l(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            A6478343232691943615 a6478343232691943615 = this.r;
            B9692660393722135472 b9692660393722135472 = (B9692660393722135472) a6478343232691943615.b;
            if (b9692660393722135472 != null) {
                b9692660393722135472.q--;
                b9692660393722135472.b();
                a6478343232691943615.b = null;
            }
            E13273723708836014930 e13273723708836014930 = (E13273723708836014930) a6478343232691943615.d;
            if (e13273723708836014930 != null) {
                Object[] objArr = e13273723708836014930.b;
                long[] jArr = e13273723708836014930.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((B9692660393722135472) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                e13273723708836014930.b();
            }
            this.a.q();
        }
    }

    public final void c(L17598299826319227431 l17598299826319227431) {
        A6478343232691943615 a6478343232691943615 = this.r;
        a6478343232691943615.c = (B9692660393722135472) a6478343232691943615.b;
        E13273723708836014930 e13273723708836014930 = (E13273723708836014930) a6478343232691943615.d;
        if (e13273723708836014930 != null && e13273723708836014930.h()) {
            E13273723708836014930 e132737237088360149302 = (E13273723708836014930) a6478343232691943615.e;
            if (e132737237088360149302 == null) {
                E13273723708836014930 e132737237088360149303 = L12621230156277355451.a;
                e132737237088360149302 = new E13273723708836014930();
                a6478343232691943615.e = e132737237088360149302;
            }
            e132737237088360149302.j(e13273723708836014930);
            e13273723708836014930.b();
        }
        a6478343232691943615.a = true;
        this.d.invoke(l17598299826319227431);
        a6478343232691943615.a = false;
        B9692660393722135472 b9692660393722135472 = (B9692660393722135472) a6478343232691943615.c;
        if (b9692660393722135472 != null) {
            b9692660393722135472.q--;
            b9692660393722135472.b();
        }
        E13273723708836014930 e132737237088360149304 = (E13273723708836014930) a6478343232691943615.e;
        if (e132737237088360149304 == null || !e132737237088360149304.h()) {
            return;
        }
        Object[] objArr = e132737237088360149304.b;
        long[] jArr = e132737237088360149304.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((B9692660393722135472) objArr[(i << 3) + i3]).b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        e132737237088360149304.b();
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
        long Q = I3887072968740112330.Q(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            Q = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Q >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Q & 4294967295L)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            long floatToRawIntBits = (Float.floatToRawIntBits(r1) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L);
            float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat5) << 32) | (Float.floatToRawIntBits(intBitsToFloat6) & 4294967295L);
            k10859651572364480586 = new K14082636229475424456(new V14120702150497747934(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits2));
        } else {
            k10859651572364480586 = new K10859651572364480586(new S6349823729575121924(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
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
        float f3 = this.w;
        long f4 = L2216691091636065972.f(j, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (L2216691091636065972.b(this.h, f4) && W8572396779607072172.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = f4;
        this.i = j2;
        this.j = f;
        a();
    }
}
