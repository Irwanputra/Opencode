package dev.epro.r0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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

    /* JADX INFO: renamed from: o, reason: collision with root package name */
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

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.d
            monitor-enter(r0)
            r14.w(r15)     // Catch: java.lang.Throwable -> L4f
            dev.epro.r0.A4559761392562572984 r1 = r14.j     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.g(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof dev.epro.r0.E13273723708836014930     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            dev.epro.r0.E13273723708836014930 r15 = (dev.epro.r0.E13273723708836014930) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.b     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.a     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.32E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            dev.epro.r0.B4739506393801054036 r10 = (dev.epro.r0.B4739506393801054036) r10     // Catch: java.lang.Throwable -> L4f
            r14.w(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r14 = move-exception
            goto L63
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            dev.epro.r0.B4739506393801054036 r15 = (dev.epro.r0.B4739506393801054036) r15     // Catch: java.lang.Throwable -> L4f
            r14.w(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12944751221596631194.A(java.lang.Object):void");
    }

    public final void B(L12639328004344855510 l12639328004344855510) {
        boolean zL = l();
        t();
        Y5209789131793062978 y5209789131793062978 = this.a;
        if (!zL) {
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
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof E13273723708836014930;
        O4470875117480878473 o4470875117480878473 = O4470875117480878473.a;
        E13273723708836014930 e13273723708836014930 = this.h;
        E13273723708836014930 e132737237088360149302 = this.i;
        A4559761392562572984 a4559761392562572984 = this.m;
        if (!z2) {
            V4878375136513573151 v4878375136513573151 = (V4878375136513573151) objG;
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
        E13273723708836014930 e132737237088360149303 = (E13273723708836014930) objG;
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

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // dev.epro.r0.V8232844453216786975
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 217
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
            O4470875117480878473 o4470875117480878473V = v(v4878375136513573151, m7798980774515057476, obj);
            if (o4470875117480878473V != O4470875117480878473.a) {
                this.t.z();
            }
            return o4470875117480878473V;
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

    /* JADX WARN: Removed duplicated region for block: B:73:0x0183 A[EDGE_INSN: B:73:0x0183->B:220:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12944751221596631194.f(java.util.Set, boolean):void");
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

    /* JADX WARN: Removed duplicated region for block: B:75:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(dev.epro.r0.M18113111391818111737 r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12944751221596631194.h(dev.epro.r0.M18113111391818111737):void");
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
        boolean zG;
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
                            boolean z = obj2 instanceof E13273723708836014930;
                            j5 = j8;
                            A4559761392562572984 a45597613925625729842 = this.g;
                            if (z) {
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
                                zG = e13273723708836014930.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                obj2.getClass();
                                zG = !a45597613925625729842.c((B4739506393801054036) obj2);
                            }
                            if (zG) {
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
        synchronized (this.d) {
            try {
                if (this.q != null) {
                    L4738636499147270068.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f.b == 0;
                if (!z || !this.e.a.g()) {
                    Trace.beginSection("Compose:deactivate");
                    try {
                        E1005111105761972824 e1005111105761972824 = this.u;
                        try {
                            e1005111105761972824.j(this.e, this.v.A());
                            if (!z) {
                                E1092155023341394263 e1092155023341394263 = this.f;
                                E1005111105761972824 e10051111057619728242 = this.u;
                                K15438463641018513946 k15438463641018513946K = e1092155023341394263.k();
                                try {
                                    k15438463641018513946K.m(k15438463641018513946K.t, new T14793413619962821194(e10051111057619728242, k15438463641018513946K, (byte) 27));
                                    k15438463641018513946K.e(true);
                                    this.b.k();
                                    e1005111105761972824.d();
                                } catch (Throwable th) {
                                    k15438463641018513946K.e(false);
                                    throw th;
                                }
                            }
                            e1005111105761972824.c();
                            e1005111105761972824.b();
                        } catch (Throwable th2) {
                            e1005111105761972824.b();
                            throw th2;
                        }
                    } finally {
                        Trace.endSection();
                    }
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
                                K15438463641018513946 k15438463641018513946K = e1092155023341394263.k();
                                try {
                                    k15438463641018513946K.m(k15438463641018513946K.t, new K5271540294206541871(e10051111057619728242, (byte) 11));
                                    k15438463641018513946K.I();
                                    k15438463641018513946K.e(true);
                                    this.b.a();
                                    this.b.k();
                                    e1005111105761972824.d();
                                } catch (Throwable th) {
                                    k15438463641018513946K.e(false);
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
        int i = 0;
        while (true) {
            if (i < size) {
                if (((Y6676784304453696344) ((H9390398899829886498) arrayList.get(i)).a).c != this) {
                    N2332913310205178802.a("Check failed");
                    break;
                }
                i++;
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c9 A[Catch: all -> 0x0044, EDGE_INSN: B:79:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], EDGE_INSN: B:80:0x00c9->B:64:0x00c9 BREAK  A[LOOP:0: B:48:0x008a->B:60:0x00c1], TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:4:0x0009, B:6:0x000e, B:8:0x0016, B:10:0x001d, B:14:0x0027, B:16:0x0031, B:13:0x0022, B:25:0x0049, B:27:0x004f, B:32:0x005a, B:36:0x0060, B:37:0x0068, B:40:0x006e, B:41:0x0074, B:43:0x007a, B:45:0x007e, B:48:0x008a, B:50:0x009a, B:52:0x00a6, B:54:0x00af, B:57:0x00b9, B:60:0x00c1, B:61:0x00c4, B:64:0x00c9), top: B:77:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.O4470875117480878473 v(dev.epro.r0.V4878375136513573151 r20, dev.epro.r0.M7798980774515057476 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S12944751221596631194.v(dev.epro.r0.V4878375136513573151, dev.epro.r0.M7798980774515057476, java.lang.Object):dev.epro.r0.O4470875117480878473");
    }

    public final void w(Object obj) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof E13273723708836014930;
        O4470875117480878473 o4470875117480878473 = O4470875117480878473.d;
        A4559761392562572984 a4559761392562572984 = this.m;
        if (!z) {
            V4878375136513573151 v4878375136513573151 = (V4878375136513573151) objG;
            if (v4878375136513573151.b(obj) != o4470875117480878473 || (obj instanceof B4739506393801054036)) {
                return;
            }
            E7125458317232359087.e(a4559761392562572984, obj, v4878375136513573151);
            return;
        }
        E13273723708836014930 e13273723708836014930 = (E13273723708836014930) objG;
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
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
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
    public final void z(Q16533201950876191546 q16533201950876191546) {
        Object obj;
        while (true) {
            Object obj2 = this.c.get();
            if (obj2 == null || obj2.equals(D1286559660607336098.b)) {
                obj = q16533201950876191546;
            } else if (obj2 instanceof Set) {
                obj = new Set[]{obj2, q16533201950876191546};
            } else {
                if (!(obj2 instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.c).toString());
                }
                Set[] setArr = (Set[]) obj2;
                int length = setArr.length;
                Object[] objArrCopyOf = Arrays.copyOf(setArr, length + 1);
                objArrCopyOf[length] = q16533201950876191546;
                obj = objArrCopyOf;
            }
            AtomicReference atomicReference = this.c;
            while (!atomicReference.compareAndSet(obj2, obj)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            if (obj2 == null) {
                synchronized (this.d) {
                    r();
                }
                return;
            }
            return;
        }
    }
}
