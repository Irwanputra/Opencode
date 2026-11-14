package dev.epro.r0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S12944751221596631194 implements V8232844453216786975, R13600139557160461432 {
    public final Y5209789131793062978 a;
    public final Z5153954235810715664 b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final V8500408966188516816 e;
    public final E1092155023341394263 f;
    public final A4559761392562572984 g;
    public final E13273723708836014930 h;
    public final E13273723708836014930 i;
    public final A4559761392562572984 j;
    public final M18113111391818111737 k;
    public final M18113111391818111737 l;
    public final A4559761392562572984 m;
    public A4559761392562572984 n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f479o;
    public Y16033830328113725410 p;
    public Y979168416190219423 q;
    public S12944751221596631194 r;
    public int s;
    public final H12843822278061842084 t;
    public final E1005111105761972824 u;
    public final M3727281027331139839 v;
    public byte w;

    public S12944751221596631194(Y5209789131793062978 y5209789131793062978, Z5153954235810715664 z5153954235810715664) {
        this.a = y5209789131793062978;
        this.b = z5153954235810715664;
        V8500408966188516816 v8500408966188516816 = new V8500408966188516816(new E13273723708836014930());
        this.e = v8500408966188516816;
        E1092155023341394263 e1092155023341394263 = new E1092155023341394263();
        if (y5209789131793062978.e()) {
            e1092155023341394263.k = new Q9908018528090167751();
        }
        if (y5209789131793062978.g()) {
            e1092155023341394263.b();
        }
        this.f = e1092155023341394263;
        this.g = E7125458317232359087.f();
        this.h = new E13273723708836014930();
        this.i = new E13273723708836014930();
        this.j = E7125458317232359087.f();
        M18113111391818111737 m18113111391818111737 = new M18113111391818111737();
        this.k = m18113111391818111737;
        M18113111391818111737 m181131113918181117372 = new M18113111391818111737();
        this.l = m181131113918181117372;
        this.m = E7125458317232359087.f();
        this.n = E7125458317232359087.f();
        H12843822278061842084 h12843822278061842084 = new H12843822278061842084((Object) y5209789131793062978, (byte) 21);
        this.t = h12843822278061842084;
        this.u = new E1005111105761972824((byte) 0);
        M3727281027331139839 m3727281027331139839 = new M3727281027331139839(z5153954235810715664, y5209789131793062978, S13318420980680640021.a(e1092155023341394263), v8500408966188516816, m18113111391818111737, m181131113918181117372, h12843822278061842084, this);
        y5209789131793062978.s(m3727281027331139839);
        this.v = m3727281027331139839;
    }

    public final void A(Object obj) {
        synchronized (this.d) {
            try {
                w(obj);
                Object g = this.j.g(obj);
                if (g != null) {
                    if (g instanceof E13273723708836014930) {
                        E13273723708836014930 e13273723708836014930 = (E13273723708836014930) g;
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
                                            w((B4739506393801054036) objArr[(i << 3) + i3]);
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
                    } else {
                        w((B4739506393801054036) g);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void B(L12639328004344855510 l12639328004344855510) {
        boolean l = l();
        t();
        Y5209789131793062978 y5209789131793062978 = this.a;
        if (!l) {
            y5209789131793062978.a(this, l12639328004344855510);
            return;
        }
        M3727281027331139839 m3727281027331139839 = this.v;
        m3727281027331139839.z = 0;
        m3727281027331139839.y = true;
        y5209789131793062978.a(this, l12639328004344855510);
        if (m3727281027331139839.F || m3727281027331139839.z != 0) {
            L4738636499147270068.a("Cannot disable reuse from root if it was caused by other groups");
        }
        m3727281027331139839.z = -1;
        m3727281027331139839.y = false;
    }

    public final void a() {
        this.c.set(null);
        this.k.a.b0();
        this.l.a.b0();
        V8500408966188516816 v8500408966188516816 = this.e;
        if (v8500408966188516816.a.g()) {
            return;
        }
        E1005111105761972824 e1005111105761972824 = this.u;
        try {
            e1005111105761972824.j(v8500408966188516816, this.v.A());
            e1005111105761972824.c();
        } finally {
            e1005111105761972824.b();
        }
    }

    @Override // dev.epro.r0.V8232844453216786975
    public final void b() {
        this.f479o = true;
        this.t.z();
    }

    public final void c(Object obj, boolean z) {
        Object g = this.g.g(obj);
        if (g == null) {
            return;
        }
        boolean z2 = g instanceof E13273723708836014930;
        O4470875117480878473 o4470875117480878473 = O4470875117480878473.a;
        E13273723708836014930 e13273723708836014930 = this.h;
        E13273723708836014930 e132737237088360149302 = this.i;
        A4559761392562572984 a4559761392562572984 = this.m;
        if (!z2) {
            V4878375136513573151 v4878375136513573151 = (V4878375136513573151) g;
            if (E7125458317232359087.o(a4559761392562572984, obj, v4878375136513573151) || v4878375136513573151.b(obj) == o4470875117480878473) {
                return;
            }
            if (v4878375136513573151.g == null || z) {
                e13273723708836014930.a(v4878375136513573151);
                return;
            } else {
                e132737237088360149302.a(v4878375136513573151);
                return;
            }
        }
        E13273723708836014930 e132737237088360149303 = (E13273723708836014930) g;
        Object[] objArr = e132737237088360149303.b;
        long[] jArr = e132737237088360149303.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        V4878375136513573151 v48783751365135731512 = (V4878375136513573151) objArr[(i << 3) + i3];
                        if (!E7125458317232359087.o(a4559761392562572984, obj, v48783751365135731512) && v48783751365135731512.b(obj) != o4470875117480878473) {
                            if (v48783751365135731512.g == null || z) {
                                e13273723708836014930.a(v48783751365135731512);
                            } else {
                                e132737237088360149302.a(v48783751365135731512);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // dev.epro.r0.V8232844453216786975
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12944751221596631194.d(java.lang.Object):void");
    }

    @Override // dev.epro.r0.V8232844453216786975
    public final O4470875117480878473 e(V4878375136513573151 v4878375136513573151, Object obj) {
        S12944751221596631194 s12944751221596631194;
        int i = v4878375136513573151.b;
        if ((i & 2) != 0) {
            v4878375136513573151.b = i | 4;
        }
        M7798980774515057476 m7798980774515057476 = v4878375136513573151.c;
        if (m7798980774515057476 == null || !m7798980774515057476.a()) {
            return O4470875117480878473.a;
        }
        E1092155023341394263 e1092155023341394263 = this.f;
        e1092155023341394263.getClass();
        M7798980774515057476 m77989807745150574762 = v4878375136513573151.c;
        if (m77989807745150574762 != null && e1092155023341394263.l(G16660188620551127941.t(m77989807745150574762))) {
            if (v4878375136513573151.d == null) {
                return O4470875117480878473.a;
            }
            O4470875117480878473 v = v(v4878375136513573151, m7798980774515057476, obj);
            if (v != O4470875117480878473.a) {
                this.t.z();
            }
            return v;
        }
        synchronized (this.d) {
            s12944751221596631194 = this.r;
        }
        if (s12944751221596631194 != null) {
            M3727281027331139839 m3727281027331139839 = s12944751221596631194.v;
            if (m3727281027331139839.F && m3727281027331139839.f0(v4878375136513573151, obj)) {
                return O4470875117480878473.d;
            }
        }
        return O4470875117480878473.a;
    }

    public final void f(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        int i;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean c2;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean z2;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c3;
        long j8;
        int i2;
        int i3;
        long[] jArr9;
        boolean z3 = set instanceof Q16533201950876191546;
        A4559761392562572984 a4559761392562572984 = this.j;
        Object obj = null;
        int i4 = 8;
        if (z3) {
            E13273723708836014930 e13273723708836014930 = ((Q16533201950876191546) set).a;
            Object[] objArr = e13273723708836014930.b;
            long[] jArr10 = e13273723708836014930.a;
            int length = jArr10.length - 2;
            if (length >= 0) {
                int i5 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr10[i5];
                    char c4 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i5 << 3) + i7];
                                c3 = c4;
                                if (obj2 instanceof V4878375136513573151) {
                                    ((V4878375136513573151) obj2).b(obj);
                                } else {
                                    c(obj2, z);
                                    Object g = a4559761392562572984.g(obj2);
                                    if (g != null) {
                                        if (g instanceof E13273723708836014930) {
                                            E13273723708836014930 e132737237088360149302 = (E13273723708836014930) g;
                                            Object[] objArr2 = e132737237088360149302.b;
                                            long[] jArr11 = e132737237088360149302.a;
                                            int length2 = jArr11.length - 2;
                                            if (length2 >= 0) {
                                                int i8 = i4;
                                                i2 = length;
                                                int i9 = 0;
                                                while (true) {
                                                    long j10 = jArr11[i9];
                                                    j8 = j9;
                                                    long[] jArr12 = jArr11;
                                                    if ((((~j10) << c3) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        int i11 = 0;
                                                        while (i11 < i10) {
                                                            if ((j10 & 255) < 128) {
                                                                jArr9 = jArr10;
                                                                c((B4739506393801054036) objArr2[(i9 << 3) + i11], z);
                                                            } else {
                                                                jArr9 = jArr10;
                                                            }
                                                            j10 >>= i8;
                                                            i11++;
                                                            jArr10 = jArr9;
                                                        }
                                                        jArr8 = jArr10;
                                                        if (i10 != i8) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr10;
                                                    }
                                                    if (i9 == length2) {
                                                        break;
                                                    }
                                                    i9++;
                                                    jArr11 = jArr12;
                                                    j9 = j8;
                                                    jArr10 = jArr8;
                                                    i8 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr10;
                                            j8 = j9;
                                            i2 = length;
                                            c((B4739506393801054036) g, z);
                                        }
                                        i3 = 8;
                                    }
                                }
                                jArr8 = jArr10;
                                j8 = j9;
                                i2 = length;
                                i3 = 8;
                            } else {
                                jArr8 = jArr10;
                                c3 = c4;
                                j8 = j9;
                                i2 = length;
                                i3 = i4;
                            }
                            j9 = j8 >> i3;
                            i7++;
                            length = i2;
                            i4 = i3;
                            c4 = c3;
                            jArr10 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr10;
                        c = c4;
                        int i12 = length;
                        if (i6 != i4) {
                            break;
                        } else {
                            length = i12;
                        }
                    } else {
                        jArr7 = jArr10;
                        c = 7;
                    }
                    if (i5 == length) {
                        break;
                    }
                    i5++;
                    jArr10 = jArr7;
                    obj = null;
                    i4 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof V4878375136513573151) {
                    ((V4878375136513573151) obj3).b(null);
                } else {
                    c(obj3, z);
                    Object g2 = a4559761392562572984.g(obj3);
                    if (g2 != null) {
                        if (g2 instanceof E13273723708836014930) {
                            E13273723708836014930 e132737237088360149303 = (E13273723708836014930) g2;
                            Object[] objArr3 = e132737237088360149303.b;
                            long[] jArr13 = e132737237088360149303.a;
                            int length3 = jArr13.length - 2;
                            if (length3 >= 0) {
                                while (true) {
                                    long j11 = jArr13[i];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                c((B4739506393801054036) objArr3[(i << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    i = i != length3 ? i + 1 : 0;
                                }
                            }
                        } else {
                            c((B4739506393801054036) g2, z);
                        }
                    }
                }
            }
        }
        A4559761392562572984 a45597613925625729842 = this.g;
        E13273723708836014930 e132737237088360149304 = this.h;
        if (z) {
            E13273723708836014930 e132737237088360149305 = this.i;
            if (e132737237088360149305.h()) {
                long[] jArr14 = a45597613925625729842.a;
                int length4 = jArr14.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr14[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = a45597613925625729842.b[i18];
                                    Object obj5 = a45597613925625729842.c[i18];
                                    if (obj5 instanceof E13273723708836014930) {
                                        E13273723708836014930 e132737237088360149306 = (E13273723708836014930) obj5;
                                        Object[] objArr4 = e132737237088360149306.b;
                                        long[] jArr15 = e132737237088360149306.a;
                                        int length5 = jArr15.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr15[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr16 = jArr15;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr14;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            V4878375136513573151 v4878375136513573151 = (V4878375136513573151) objArr5[i22];
                                                            if (e132737237088360149305.c(v4878375136513573151) || e132737237088360149304.c(v4878375136513573151)) {
                                                                e132737237088360149306.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr14;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr14 = jArr6;
                                                    }
                                                    jArr5 = jArr14;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr14;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr15 = jArr16;
                                                jArr14 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr14;
                                            j6 = j12;
                                        }
                                        z2 = e132737237088360149306.g();
                                    } else {
                                        jArr5 = jArr14;
                                        j6 = j12;
                                        obj5.getClass();
                                        V4878375136513573151 v48783751365135731512 = (V4878375136513573151) obj5;
                                        z2 = e132737237088360149305.c(v48783751365135731512) || e132737237088360149304.c(v48783751365135731512);
                                    }
                                    if (z2) {
                                        a45597613925625729842.m(i18);
                                    }
                                } else {
                                    jArr5 = jArr14;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr14 = jArr5;
                            }
                            jArr4 = jArr14;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr14;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr14 = jArr4;
                    }
                }
                e132737237088360149305.b();
                k();
                return;
            }
        }
        if (e132737237088360149304.h()) {
            long[] jArr17 = a45597613925625729842.a;
            int length6 = jArr17.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr17[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = a45597613925625729842.b[i26];
                                Object obj7 = a45597613925625729842.c[i26];
                                if (obj7 instanceof E13273723708836014930) {
                                    E13273723708836014930 e132737237088360149307 = (E13273723708836014930) obj7;
                                    Object[] objArr6 = e132737237088360149307.b;
                                    long[] jArr18 = e132737237088360149307.a;
                                    int length7 = jArr18.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr18[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr19 = jArr18;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr17;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (e132737237088360149304.c((V4878375136513573151) objArr7[i30])) {
                                                            e132737237088360149307.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr17;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr17 = jArr3;
                                                }
                                                jArr2 = jArr17;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr17;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr18 = jArr19;
                                            jArr17 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr17;
                                        j4 = j14;
                                    }
                                    c2 = e132737237088360149307.g();
                                } else {
                                    jArr2 = jArr17;
                                    j4 = j14;
                                    obj7.getClass();
                                    c2 = e132737237088360149304.c((V4878375136513573151) obj7);
                                }
                                if (c2) {
                                    a45597613925625729842.m(i26);
                                }
                            } else {
                                jArr2 = jArr17;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr17 = jArr2;
                        }
                        jArr = jArr17;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr17;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr17 = jArr;
                }
            }
            k();
            e132737237088360149304.b();
        }
    }

    public final void g() {
        synchronized (this.d) {
            try {
                h(this.k);
                r();
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        E1005111105761972824 e1005111105761972824 = this.u;
                        try {
                            e1005111105761972824.j(this.e, this.v.A());
                            e1005111105761972824.c();
                            e1005111105761972824.b();
                        } catch (Throwable th2) {
                            e1005111105761972824.b();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void h(M18113111391818111737 m18113111391818111737) {
        E1005111105761972824 e1005111105761972824;
        long[] jArr;
        int i;
        long[] jArr2;
        E1005111105761972824 e10051111057619728242;
        long j;
        char c;
        long j2;
        int i2;
        boolean z;
        long j3;
        M18113111391818111737 m181131113918181117372 = this.l;
        M3727281027331139839 m3727281027331139839 = this.v;
        W12685451225593881345 A = m3727281027331139839.A();
        E1005111105761972824 e10051111057619728243 = this.u;
        e10051111057619728243.j(this.e, A);
        try {
            if (m18113111391818111737.a.d0()) {
                try {
                    if (m181131113918181117372.a.d0() && this.q == null) {
                        e10051111057619728243.c();
                    }
                    return;
                } finally {
                }
            }
            Y979168416190219423 y979168416190219423 = this.q;
            E9133045636215945243 e9133045636215945243 = y979168416190219423 != null ? y979168416190219423.l : this.b;
            try {
                Trace.beginSection(e9133045636215945243.equals(y979168416190219423 != null ? y979168416190219423.l : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    Y979168416190219423 y9791684161902194232 = this.q;
                    E1005111105761972824 e10051111057619728244 = y9791684161902194232 != null ? y9791684161902194232.k : e10051111057619728243;
                    E1092155023341394263 e1092155023341394263 = this.f;
                    W12685451225593881345 A2 = m3727281027331139839.A();
                    K15438463641018513946 k = S13318420980680640021.a(e1092155023341394263).k();
                    int i3 = 0;
                    try {
                        m18113111391818111737.D(e9133045636215945243, k, e10051111057619728244, A2);
                        k.e(true);
                        e9133045636215945243.k();
                        Trace.endSection();
                        e10051111057619728243.d();
                        e10051111057619728243.e();
                        if (this.f479o) {
                            Trace.beginSection("Compose:unobserve");
                            try {
                                this.f479o = false;
                                A4559761392562572984 a4559761392562572984 = this.g;
                                long[] jArr3 = a4559761392562572984.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = a4559761392562572984.b[i8];
                                                    Object obj2 = a4559761392562572984.c[i8];
                                                    if (obj2 instanceof E13273723708836014930) {
                                                        E13273723708836014930 e13273723708836014930 = (E13273723708836014930) obj2;
                                                        Object[] objArr = e13273723708836014930.b;
                                                        long[] jArr4 = e13273723708836014930.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        e10051111057619728242 = e10051111057619728243;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((V4878375136513573151) objArr[i13]).a()) {
                                                                                    e13273723708836014930.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i10 == length2) {
                                                                        break;
                                                                    }
                                                                    i10++;
                                                                    jArr4 = jArr5;
                                                                    j4 = j;
                                                                    i9 = 8;
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    Trace.endSection();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        z = e13273723708836014930.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        e10051111057619728242 = e10051111057619728243;
                                                        j = j4;
                                                        obj2.getClass();
                                                        z = !((V4878375136513573151) obj2).a();
                                                    }
                                                    if (z) {
                                                        a4559761392562572984.m(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    e10051111057619728242 = e10051111057619728243;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                e10051111057619728243 = e10051111057619728242;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            e1005111105761972824 = e10051111057619728243;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            e1005111105761972824 = e10051111057619728243;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        e10051111057619728243 = e1005111105761972824;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    e1005111105761972824 = e10051111057619728243;
                                }
                                k();
                                Trace.endSection();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            e1005111105761972824 = e10051111057619728243;
                        }
                        try {
                            if (m181131113918181117372.a.d0() && this.q == null) {
                                e1005111105761972824.c();
                            }
                        } finally {
                            e1005111105761972824.b();
                        }
                    } catch (Throwable th3) {
                        try {
                            k.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            Trace.endSection();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                try {
                    if (m181131113918181117372.a.d0() && this.q == null) {
                        e10051111057619728243.c();
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void i() {
        synchronized (this.d) {
            try {
                M18113111391818111737 m18113111391818111737 = this.l;
                m18113111391818111737.getClass();
                if (!m18113111391818111737.a.d0()) {
                    h(this.l);
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        E1005111105761972824 e1005111105761972824 = this.u;
                        try {
                            e1005111105761972824.j(this.e, this.v.A());
                            e1005111105761972824.c();
                            e1005111105761972824.b();
                        } catch (Throwable th2) {
                            e1005111105761972824.b();
                            throw th2;
                        }
                    }
                    throw th;
                } finally {
                }
            }
        }
    }

    public final void j() {
        E1005111105761972824 e1005111105761972824;
        synchronized (this.d) {
            try {
                this.v.v = null;
                if (!this.e.a.g()) {
                    e1005111105761972824 = this.u;
                    try {
                        e1005111105761972824.j(this.e, this.v.A());
                        e1005111105761972824.c();
                        e1005111105761972824.b();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.a.g()) {
                        e1005111105761972824 = this.u;
                        try {
                            e1005111105761972824.j(this.e, this.v.A());
                            e1005111105761972824.c();
                            e1005111105761972824.b();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void k() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean z;
        int i4;
        int i5;
        A4559761392562572984 a4559761392562572984 = this.j;
        long[] jArr3 = a4559761392562572984.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = a4559761392562572984.b[i10];
                            Object obj2 = a4559761392562572984.c[i10];
                            c2 = c3;
                            boolean z2 = obj2 instanceof E13273723708836014930;
                            j5 = j8;
                            A4559761392562572984 a45597613925625729842 = this.g;
                            if (z2) {
                                E13273723708836014930 e13273723708836014930 = (E13273723708836014930) obj2;
                                Object[] objArr = e13273723708836014930.b;
                                long[] jArr4 = e13273723708836014930.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!a45597613925625729842.c((B4739506393801054036) objArr[i15])) {
                                                        e13273723708836014930.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                z = e13273723708836014930.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                z = !a45597613925625729842.c((B4739506393801054036) obj2);
                            }
                            if (z) {
                                a4559761392562572984.m(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        E13273723708836014930 e132737237088360149302 = this.i;
        if (!e132737237088360149302.h()) {
            return;
        }
        Object[] objArr2 = e132737237088360149302.b;
        long[] jArr5 = e132737237088360149302.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((V4878375136513573151) objArr2[i20]).g == null) {
                            e132737237088360149302.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.w != 1) {
                z = false;
            }
            if (z) {
                this.w = (byte) 0;
            }
        }
        return z;
    }

    public final void m(L12639328004344855510 l12639328004344855510) {
        try {
            synchronized (this.d) {
                q();
                A4559761392562572984 a4559761392562572984 = this.n;
                this.n = E7125458317232359087.f();
                try {
                    M3727281027331139839 m3727281027331139839 = this.v;
                    Y16033830328113725410 y16033830328113725410 = this.p;
                    if (!m3727281027331139839.e.a.d0()) {
                        N2332913310205178802.a("Expected applyChanges() to have been called");
                    }
                    m3727281027331139839.P = y16033830328113725410;
                    try {
                        m3727281027331139839.o(a4559761392562572984, l12639328004344855510);
                    } finally {
                        m3727281027331139839.P = null;
                    }
                } catch (Throwable th) {
                    this.n = a4559761392562572984;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.e.a.g()) {
                    E1005111105761972824 e1005111105761972824 = this.u;
                    try {
                        e1005111105761972824.j(this.e, this.v.A());
                        e1005111105761972824.c();
                        e1005111105761972824.b();
                    } catch (Throwable th3) {
                        e1005111105761972824.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final Y979168416190219423 n(boolean z, L12639328004344855510 l12639328004344855510) {
        if (this.q != null) {
            L4738636499147270068.b("A pausable composition is in progress");
        }
        Y979168416190219423 y979168416190219423 = new Y979168416190219423(this, this.a, this.v, this.e, l12639328004344855510, z, this.b, this.d);
        this.q = y979168416190219423;
        return y979168416190219423;
    }

    public final void o() {
        E1005111105761972824 e1005111105761972824;
        synchronized (this.d) {
            try {
                if (this.q != null) {
                    L4738636499147270068.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f.b == 0;
                try {
                    try {
                        if (z) {
                            if (!this.e.a.g()) {
                            }
                            this.g.a();
                            this.j.a();
                            this.n.a();
                            this.k.a.b0();
                            this.l.a.b0();
                            M3727281027331139839 m3727281027331139839 = this.v;
                            m3727281027331139839.E.clear();
                            m3727281027331139839.s.clear();
                            m3727281027331139839.e.a.b0();
                            m3727281027331139839.v = null;
                            this.w = (byte) 1;
                        }
                        e1005111105761972824.j(this.e, this.v.A());
                        if (!z) {
                            E1092155023341394263 e1092155023341394263 = this.f;
                            E1005111105761972824 e10051111057619728242 = this.u;
                            K15438463641018513946 k = e1092155023341394263.k();
                            try {
                                k.m(k.t, new T14793413619962821194(e10051111057619728242, k, (byte) 27));
                                k.e(true);
                                this.b.k();
                                e1005111105761972824.d();
                            } catch (Throwable th) {
                                k.e(false);
                                throw th;
                            }
                        }
                        e1005111105761972824.c();
                        e1005111105761972824.b();
                        this.g.a();
                        this.j.a();
                        this.n.a();
                        this.k.a.b0();
                        this.l.a.b0();
                        M3727281027331139839 m37272810273311398392 = this.v;
                        m37272810273311398392.E.clear();
                        m37272810273311398392.s.clear();
                        m37272810273311398392.e.a.b0();
                        m37272810273311398392.v = null;
                        this.w = (byte) 1;
                    } catch (Throwable th2) {
                        e1005111105761972824.b();
                        throw th2;
                    }
                    e1005111105761972824 = this.u;
                } finally {
                    Trace.endSection();
                }
                Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void p() {
        synchronized (this.d) {
            try {
                if (this.v.F) {
                    L4738636499147270068.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.w != 3) {
                    this.w = (byte) 3;
                    M18113111391818111737 m18113111391818111737 = this.v.L;
                    if (m18113111391818111737 != null) {
                        h(m18113111391818111737);
                    }
                    boolean z = this.f.b == 0;
                    if (!z || !this.e.a.g()) {
                        E1005111105761972824 e1005111105761972824 = this.u;
                        try {
                            e1005111105761972824.j(this.e, this.v.A());
                            if (!z) {
                                E1092155023341394263 e1092155023341394263 = this.f;
                                E1005111105761972824 e10051111057619728242 = this.u;
                                K15438463641018513946 k = e1092155023341394263.k();
                                try {
                                    k.m(k.t, new K5271540294206541871(e10051111057619728242, (byte) 11));
                                    k.I();
                                    k.e(true);
                                    this.b.a();
                                    this.b.k();
                                    e1005111105761972824.d();
                                } catch (Throwable th) {
                                    k.e(false);
                                    throw th;
                                }
                            }
                            e1005111105761972824.c();
                            e1005111105761972824.b();
                        } catch (Throwable th2) {
                            e1005111105761972824.b();
                            throw th2;
                        }
                    }
                    this.m.a();
                    M3727281027331139839 m3727281027331139839 = this.v;
                    m3727281027331139839.getClass();
                    Trace.beginSection("Compose:Composer.dispose");
                    try {
                        m3727281027331139839.b.x(m3727281027331139839);
                        m3727281027331139839.E.clear();
                        m3727281027331139839.s.clear();
                        m3727281027331139839.e.a.b0();
                        m3727281027331139839.v = null;
                        m3727281027331139839.a.a();
                        Trace.endSection();
                    } catch (Throwable th3) {
                        Trace.endSection();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.a.y(this);
    }

    public final void q() {
        Object obj = D1286559660607336098.b;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                N2332913310205178802.b("pending composition has not been applied");
                Z3383101362411723454.n();
                return;
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                N2332913310205178802.b("corrupt pendingModifications drain: " + atomicReference);
                Z3383101362411723454.n();
                return;
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }

    public final void r() {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (S10823041268949770285.t(andSet, D1286559660607336098.b)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                f(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.q == null) {
                N2332913310205178802.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            N2332913310205178802.b("corrupt pendingModifications drain: " + atomicReference);
            Z3383101362411723454.n();
        }
    }

    public final void s() {
        H15747516787109764287 h15747516787109764287 = H15747516787109764287.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(h15747516787109764287);
        if (S10823041268949770285.t(andSet, D1286559660607336098.b) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            N2332913310205178802.b("corrupt pendingModifications drain: " + atomicReference);
            Z3383101362411723454.n();
            return;
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    public final void t() {
        byte b = this.w;
        if (b != 0) {
            L4738636499147270068.b(b != 1 ? b != 2 ? b != 3 ? "" : "The composition is disposed" : "A previous pausable composition for this composition was cancelled. This composition must be disposed." : "The composition should be activated before setting content.");
        }
        if (this.q == null) {
            return;
        }
        L4738636499147270068.b("A pausable composition is in progress");
    }

    public final void u(ArrayList arrayList) {
        V8500408966188516816 v8500408966188516816 = this.e;
        M3727281027331139839 m3727281027331139839 = this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Y6676784304453696344) ((H9390398899829886498) arrayList.get(i)).a).c != this) {
                N2332913310205178802.a("Check failed");
                break;
            }
        }
        try {
            m3727281027331139839.getClass();
            Trace.beginSection("Compose:insertMovableContent");
            try {
                try {
                    m3727281027331139839.C(arrayList);
                    m3727281027331139839.i();
                } catch (Throwable th) {
                    m3727281027331139839.a();
                    throw th;
                }
            } finally {
                Trace.endSection();
            }
        } catch (Throwable th2) {
            try {
                if (!v8500408966188516816.a.g()) {
                    E1005111105761972824 e1005111105761972824 = this.u;
                    try {
                        e1005111105761972824.j(v8500408966188516816, m3727281027331139839.A());
                        e1005111105761972824.c();
                        e1005111105761972824.b();
                    } catch (Throwable th3) {
                        e1005111105761972824.b();
                        throw th3;
                    }
                }
                throw th2;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final O4470875117480878473 v(V4878375136513573151 v4878375136513573151, M7798980774515057476 m7798980774515057476, Object obj) {
        S12944751221596631194 s12944751221596631194;
        synchronized (this.d) {
            try {
                S12944751221596631194 s129447512215966311942 = this.r;
                if (s129447512215966311942 != null) {
                    E1092155023341394263 e1092155023341394263 = this.f;
                    int i = this.s;
                    if (e1092155023341394263.g) {
                        N2332913310205178802.a("Writer is active");
                    }
                    if (i < 0 || i >= e1092155023341394263.b) {
                        N2332913310205178802.a("Invalid group index");
                    }
                    M7798980774515057476 t = G16660188620551127941.t(m7798980774515057476);
                    if (e1092155023341394263.l(t)) {
                        int i2 = e1092155023341394263.a[(i * 5) + 3] + i;
                        int i3 = t.a;
                        s12944751221596631194 = (i <= i3 && i3 < i2) ? s129447512215966311942 : null;
                    }
                    s129447512215966311942 = null;
                }
                if (s12944751221596631194 == null) {
                    M3727281027331139839 m3727281027331139839 = this.v;
                    if (m3727281027331139839.F && m3727281027331139839.f0(v4878375136513573151, obj)) {
                        return O4470875117480878473.d;
                    }
                    if (obj == null) {
                        this.n.n(v4878375136513573151, N5158094851646208854.m);
                    } else {
                        boolean z = obj instanceof B4739506393801054036;
                        A4559761392562572984 a4559761392562572984 = this.n;
                        if (z) {
                            Object g = a4559761392562572984.g(v4878375136513573151);
                            if (g != null) {
                                if (g instanceof E13273723708836014930) {
                                    E13273723708836014930 e13273723708836014930 = (E13273723708836014930) g;
                                    Object[] objArr = e13273723708836014930.b;
                                    long[] jArr = e13273723708836014930.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i4 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i4];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                                for (int i6 = 0; i6 < i5; i6++) {
                                                    if ((255 & j) < 128 && objArr[(i4 << 3) + i6] == N5158094851646208854.m) {
                                                        break loop0;
                                                    }
                                                    j >>= 8;
                                                }
                                                if (i5 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i4 == length) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                } else if (g == N5158094851646208854.m) {
                                }
                            }
                            E7125458317232359087.e(this.n, v4878375136513573151, obj);
                        } else {
                            a4559761392562572984.n(v4878375136513573151, N5158094851646208854.m);
                        }
                    }
                }
                if (s12944751221596631194 != null) {
                    return s12944751221596631194.v(v4878375136513573151, m7798980774515057476, obj);
                }
                this.a.n(this);
                return this.v.F ? O4470875117480878473.c : O4470875117480878473.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void w(Object obj) {
        Object g = this.g.g(obj);
        if (g == null) {
            return;
        }
        boolean z = g instanceof E13273723708836014930;
        O4470875117480878473 o4470875117480878473 = O4470875117480878473.d;
        A4559761392562572984 a4559761392562572984 = this.m;
        if (!z) {
            V4878375136513573151 v4878375136513573151 = (V4878375136513573151) g;
            if (v4878375136513573151.b(obj) != o4470875117480878473 || (obj instanceof B4739506393801054036)) {
                return;
            }
            E7125458317232359087.e(a4559761392562572984, obj, v4878375136513573151);
            return;
        }
        E13273723708836014930 e13273723708836014930 = (E13273723708836014930) g;
        Object[] objArr = e13273723708836014930.b;
        long[] jArr = e13273723708836014930.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        V4878375136513573151 v48783751365135731512 = (V4878375136513573151) objArr[(i << 3) + i3];
                        if (v48783751365135731512.b(obj) == o4470875117480878473 && !(obj instanceof B4739506393801054036)) {
                            E7125458317232359087.e(a4559761392562572984, obj, v48783751365135731512);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(java.util.Set r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof dev.epro.r0.Q16533201950876191546
            dev.epro.r0.A4559761392562572984 r3 = r0.j
            dev.epro.r0.A4559761392562572984 r0 = r0.g
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L5e
            dev.epro.r0.Q16533201950876191546 r1 = (dev.epro.r0.Q16533201950876191546) r1
            dev.epro.r0.E13273723708836014930 r1 = r1.a
            java.lang.Object[] r2 = r1.b
            long[] r1 = r1.a
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L7b
            r7 = r4
        L1c:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L59
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L36:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            boolean r14 = r0.c(r13)
            if (r14 != 0) goto L52
            boolean r13 = r3.c(r13)
            if (r13 == 0) goto L53
        L52:
            return r5
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L36
        L57:
            if (r10 != r11) goto L7b
        L59:
            if (r7 == r6) goto L7b
            int r7 = r7 + 1
            goto L1c
        L5e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L64:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r1.next()
            boolean r6 = r0.c(r2)
            if (r6 != 0) goto L7a
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L64
        L7a:
            return r5
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12944751221596631194.x(java.util.Set):boolean");
    }

    public final boolean y() {
        synchronized (this.d) {
            Y979168416190219423 y979168416190219423 = this.q;
            boolean z = false;
            if (y979168416190219423 != null && (y979168416190219423.h.get() != Z3361759032029918772.e || y979168416190219423.i != Q9282725956684299602.g())) {
                AtomicReference atomicReference = y979168416190219423.h;
                Z3361759032029918772 z3361759032029918772 = Z3361759032029918772.f;
                Z3361759032029918772 z33617590320299187722 = Z3361759032029918772.d;
                while (!atomicReference.compareAndSet(z3361759032029918772, z33617590320299187722) && atomicReference.get() == z3361759032029918772) {
                }
                y979168416190219423.l.a.a(9);
                return false;
            }
            q();
            try {
                A4559761392562572984 a4559761392562572984 = this.n;
                this.n = E7125458317232359087.f();
                try {
                    M3727281027331139839 m3727281027331139839 = this.v;
                    Y16033830328113725410 y16033830328113725410 = this.p;
                    Z17561488864728364842 z17561488864728364842 = m3727281027331139839.e.a;
                    if (!z17561488864728364842.d0()) {
                        N2332913310205178802.a("Expected applyChanges() to have been called");
                    }
                    if (a4559761392562572984.e > 0 || !m3727281027331139839.s.isEmpty()) {
                        m3727281027331139839.P = y16033830328113725410;
                        try {
                            m3727281027331139839.o(a4559761392562572984, null);
                            m3727281027331139839.P = null;
                            z = !z17561488864728364842.d0();
                        } catch (Throwable th) {
                            m3727281027331139839.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        r();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.n = a4559761392562572984;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.e.a.g()) {
                        E1005111105761972824 e1005111105761972824 = this.u;
                        try {
                            e1005111105761972824.j(this.e, this.v.A());
                            e1005111105761972824.c();
                            e1005111105761972824.b();
                        } catch (Throwable th4) {
                            e1005111105761972824.b();
                            throw th4;
                        }
                    }
                    throw th3;
                } catch (Throwable th5) {
                    a();
                    throw th5;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Set[]] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object[]] */
    public final void z(Q16533201950876191546 q16533201950876191546) {
        Q16533201950876191546 q165332019508761915462;
        while (true) {
            Object obj = this.c.get();
            if (obj == null || obj.equals(D1286559660607336098.b)) {
                q165332019508761915462 = q16533201950876191546;
            } else if (obj instanceof Set) {
                q165332019508761915462 = new Set[]{obj, q16533201950876191546};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.c).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = q16533201950876191546;
                q165332019508761915462 = copyOf;
            }
            AtomicReference atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj, q165332019508761915462)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.d) {
                    r();
                }
                return;
            }
            return;
        }
    }
}
