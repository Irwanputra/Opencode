package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E17523205116624666034 implements G4373553504164397325 {
    public static final V10300877997588547986 y = O4077903568229246.z(new L2311487989567145532((byte) 17), new X2899556981606350920((byte) 4));
    public final O5398397151674912513 a;
    public boolean b;
    public O11472352839632764090 c;
    public boolean d;
    public final I6542595490584778312 e;
    public final V697849047308847220 f;
    public final S9385204271696540760 g;
    public float h;
    public boolean i;
    public final V16232943500580701817 j;
    public final boolean k;
    public H11725168162114556860 l;
    public final O8465802837550908662 m;
    public final U8557721631511515756 n;

    /* renamed from: o, reason: collision with root package name */
    public final I2828680009210448000 f218o;
    public final V12816289154094534935 p;
    public final B14178846910827721115 q;
    public final F6942723054099263096 r;
    public final Y18072866666914382106 s;
    public final W1972671267364756056 t;
    public final V697849047308847220 u;
    public final V697849047308847220 v;
    public final W1972671267364756056 w;
    public final V10300877997588547986 x;

    public E17523205116624666034(int i, int i2) {
        O5398397151674912513 o5398397151674912513 = new O5398397151674912513();
        o5398397151674912513.a = -1;
        o5398397151674912513.c = -1;
        this.a = o5398397151674912513;
        this.e = new I6542595490584778312(i, i2, (byte) 1);
        this.f = new V697849047308847220(E10523581248705149740.a, B14824868959299866349.k);
        this.g = new S9385204271696540760();
        this.j = new V16232943500580701817(new S16262227471297796850(this, (byte) 19));
        this.k = true;
        this.m = new O8465802837550908662(this, (byte) 1);
        this.n = new U8557721631511515756();
        this.f218o = new I2828680009210448000();
        this.p = new V12816289154094534935((byte) 1);
        this.q = new B14178846910827721115(new O16774394856129852758(this, i));
        this.r = new F6942723054099263096((Object) this, (byte) 16);
        this.s = new Y18072866666914382106();
        this.t = C775827382551829194.E();
        Boolean bool = Boolean.FALSE;
        this.u = V4416135141588678913.t(bool);
        this.v = V4416135141588678913.t(bool);
        this.w = C775827382551829194.E();
        this.x = new V10300877997588547986((byte) 3);
    }

    public static void j(E17523205116624666034 e17523205116624666034, int i) {
        if (e17523205116624666034.j.b()) {
            R7033599853981556291.E(((O11472352839632764090) e17523205116624666034.f.getValue()).h, null, null, new K17018517525825308154(e17523205116624666034, null, (byte) 2), 3);
        }
        e17523205116624666034.l(i, 0, false);
    }

    public static Object k(E17523205116624666034 e17523205116624666034, int i, R14062301455140331524 r14062301455140331524) {
        e17523205116624666034.getClass();
        Object e = e17523205116624666034.e(D6414970586266598845.a, new B13067121461607380805(e17523205116624666034, i, 0, null), r14062301455140331524);
        return e == Z3437138737604933638.a ? e : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean a() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean b() {
        return this.j.b();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final float d(float f) {
        return this.j.d(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r6.j.e(r7, r8, r0) != r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6.n.d(r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // dev.epro.r0.G4373553504164397325
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.D6414970586266598845 r7, dev.epro.r0.L12639328004344855510 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof dev.epro.r0.T3421584095917374081
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.T3421584095917374081 r0 = (dev.epro.r0.T3421584095917374081) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dev.epro.r0.T3421584095917374081 r0 = new dev.epro.r0.T3421584095917374081
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            int r1 = r0.x
            r2 = 0
            r3 = 2
            r4 = 1
            dev.epro.r0.Z3437138737604933638 r5 = dev.epro.r0.Z3437138737604933638.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r2
        L31:
            dev.epro.r0.R14062301455140331524 r7 = r0.u
            r8 = r7
            dev.epro.r0.L12639328004344855510 r8 = (dev.epro.r0.L12639328004344855510) r8
            dev.epro.r0.D6414970586266598845 r7 = r0.t
            dev.epro.r0.E17665849472693074628.k(r9)
            goto L5b
        L3c:
            dev.epro.r0.E17665849472693074628.k(r9)
            dev.epro.r0.V697849047308847220 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            dev.epro.r0.O11472352839632764090 r1 = dev.epro.r0.E10523581248705149740.a
            if (r9 != r1) goto L5b
            r0.t = r7
            r9 = r8
            dev.epro.r0.R14062301455140331524 r9 = (dev.epro.r0.R14062301455140331524) r9
            r0.u = r9
            r0.x = r4
            dev.epro.r0.U8557721631511515756 r9 = r6.n
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.t = r2
            r0.u = r2
            r0.x = r3
            dev.epro.r0.V16232943500580701817 r6 = r6.j
            java.lang.Object r6 = r6.e(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E17523205116624666034.e(dev.epro.r0.D6414970586266598845, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v2, types: [dev.epro.r0.O9245300239821758723, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r6, dev.epro.r0.K14749510448791472029 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dev.epro.r0.W2578805785476255070
            if (r0 == 0) goto L13
            r0 = r7
            dev.epro.r0.W2578805785476255070 r0 = (dev.epro.r0.W2578805785476255070) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            dev.epro.r0.W2578805785476255070 r0 = new dev.epro.r0.W2578805785476255070
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            int r1 = r0.v
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L2f
            if (r1 != r4) goto L29
            dev.epro.r0.E17665849472693074628.k(r7)     // Catch: java.lang.Throwable -> L27
            goto L46
        L27:
            r6 = move-exception
            goto L4b
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r5)
            return r2
        L2f:
            dev.epro.r0.E17665849472693074628.k(r7)
            r5.i = r4     // Catch: java.lang.Throwable -> L27
            dev.epro.r0.L16415741994209199050 r7 = new dev.epro.r0.L16415741994209199050     // Catch: java.lang.Throwable -> L27
            r7.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> L27
            r0.v = r4     // Catch: java.lang.Throwable -> L27
            dev.epro.r0.D6414970586266598845 r6 = dev.epro.r0.D6414970586266598845.a     // Catch: java.lang.Throwable -> L27
            java.lang.Object r6 = r5.e(r6, r7, r0)     // Catch: java.lang.Throwable -> L27
            dev.epro.r0.Z3437138737604933638 r7 = dev.epro.r0.Z3437138737604933638.a
            if (r6 != r7) goto L46
            return r7
        L46:
            r5.i = r3
            dev.epro.r0.O9245300239821758723 r5 = dev.epro.r0.O9245300239821758723.a
            return r5
        L4b:
            r5.i = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E17523205116624666034.f(int, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void g(O11472352839632764090 o11472352839632764090, boolean z, boolean z2) {
        float f;
        long j;
        List list = o11472352839632764090.l;
        int i = o11472352839632764090.f395o;
        int i2 = o11472352839632764090.b;
        H3043063065558747866 h3043063065558747866 = o11472352839632764090.a;
        this.q.e = list.size();
        V10300877997588547986 v10300877997588547986 = this.x;
        I6542595490584778312 i6542595490584778312 = this.e;
        if (!z && this.b) {
            this.c = o11472352839632764090;
            M4722199849958580248 h = T8598786036980488824.h();
            F4096073349764486348 e = h != null ? h.e() : null;
            M4722199849958580248 o2 = T8598786036980488824.o(h);
            try {
                if (!(((Number) ((Q17276063867044657934) v10300877997588547986.c).b.getValue()).floatValue() == 0.0f) && h3043063065558747866 != null && h3043063065558747866.a == i6542595490584778312.b.g() && i2 == i6542595490584778312.c.g()) {
                    v10300877997588547986.D();
                }
                return;
            } finally {
                T8598786036980488824.x(h, o2, e);
            }
        }
        if (z) {
            this.b = true;
        }
        this.v.setValue(Boolean.valueOf(((h3043063065558747866 != null ? h3043063065558747866.a : 0) == 0 && i2 == 0) ? false : true));
        this.u.setValue(Boolean.valueOf(o11472352839632764090.c));
        this.h -= o11472352839632764090.d;
        this.f.setValue(o11472352839632764090);
        if (z2) {
            i6542595490584778312.getClass();
            if (i2 < 0.0f) {
                Y16081827717826519461.c("scrollOffset should be non-negative");
            }
            i6542595490584778312.c.h(i2);
        } else {
            H3043063065558747866 h30430630655587478662 = (H3043063065558747866) R9411874267597469228.D0(list);
            H3043063065558747866 h30430630655587478663 = (H3043063065558747866) R9411874267597469228.L0(list);
            if (h30430630655587478662 != null) {
                f = 0.0f;
                j = h30430630655587478662.a;
            } else {
                f = 0.0f;
                j = -1;
            }
            D1286559660607336098.E(j, "firstVisibleItem:index");
            D1286559660607336098.E(h30430630655587478663 != null ? h30430630655587478663.a : -1L, "lastVisibleItem:index");
            i6542595490584778312.getClass();
            i6542595490584778312.e = h3043063065558747866 != null ? h3043063065558747866.k : null;
            if (i6542595490584778312.d || i > 0) {
                i6542595490584778312.d = true;
                if (i2 < f) {
                    Y16081827717826519461.c("scrollOffset should be non-negative");
                }
                i6542595490584778312.a(h3043063065558747866 != null ? h3043063065558747866.a : 0, i2);
            }
            if (this.k) {
                O5398397151674912513 o5398397151674912513 = this.a;
                int i3 = o5398397151674912513.a;
                boolean z3 = o5398397151674912513.b;
                if (i3 != -1 && !list.isEmpty() && i3 != O5398397151674912513.a(o11472352839632764090, z3)) {
                    o5398397151674912513.a = -1;
                    T5398360193539863765 t5398360193539863765 = (T5398360193539863765) o5398397151674912513.e;
                    if (t5398360193539863765 != null) {
                        t5398360193539863765.cancel();
                    }
                    o5398397151674912513.e = null;
                }
                int i4 = o5398397151674912513.c;
                if (i4 != -1 && o5398397151674912513.d != f && i4 != i && !list.isEmpty()) {
                    int a = O5398397151674912513.a(o11472352839632764090, o5398397151674912513.d < f);
                    if (a >= 0 && a < i) {
                        o5398397151674912513.a = a;
                        o5398397151674912513.e = F6942723054099263096.o(this.r, a);
                    }
                }
                o5398397151674912513.c = i;
            }
        }
        if (z) {
            v10300877997588547986.F(o11472352839632764090.f, o11472352839632764090.i, o11472352839632764090.h);
        }
    }

    public final O11472352839632764090 h() {
        return (O11472352839632764090) this.f.getValue();
    }

    public final void i(float f, O11472352839632764090 o11472352839632764090) {
        T5398360193539863765 t5398360193539863765;
        T5398360193539863765 t53983601935398637652;
        if (this.k) {
            boolean isEmpty = o11472352839632764090.l.isEmpty();
            O5398397151674912513 o5398397151674912513 = this.a;
            if (!isEmpty) {
                boolean z = f < 0.0f;
                int a = O5398397151674912513.a(o11472352839632764090, z);
                if (a >= 0 && a < o11472352839632764090.f395o) {
                    if (a != o5398397151674912513.a) {
                        if (o5398397151674912513.b != z) {
                            o5398397151674912513.a = -1;
                            T5398360193539863765 t53983601935398637653 = (T5398360193539863765) o5398397151674912513.e;
                            if (t53983601935398637653 != null) {
                                t53983601935398637653.cancel();
                            }
                            o5398397151674912513.e = null;
                        }
                        o5398397151674912513.b = z;
                        o5398397151674912513.a = a;
                        o5398397151674912513.e = F6942723054099263096.o(this.r, a);
                    }
                    List list = o11472352839632764090.l;
                    if (z) {
                        H3043063065558747866 h3043063065558747866 = (H3043063065558747866) R9411874267597469228.K0(list);
                        if (((h3043063065558747866.f271o + h3043063065558747866.p) + o11472352839632764090.r) - o11472352839632764090.n < (-f) && (t53983601935398637652 = (T5398360193539863765) o5398397151674912513.e) != null) {
                            t53983601935398637652.a();
                        }
                    } else if (o11472352839632764090.m - ((H3043063065558747866) R9411874267597469228.B0(list)).f271o < f && (t5398360193539863765 = (T5398360193539863765) o5398397151674912513.e) != null) {
                        t5398360193539863765.a();
                    }
                }
            }
            o5398397151674912513.d = f;
        }
    }

    public final void l(int i, int i2, boolean z) {
        I6542595490584778312 i6542595490584778312 = this.e;
        if (i6542595490584778312.b.g() != i || i6542595490584778312.c.g() != i2) {
            I2828680009210448000 i2828680009210448000 = this.f218o;
            i2828680009210448000.e();
            i2828680009210448000.b = null;
            i2828680009210448000.c = -1;
        }
        i6542595490584778312.a(i, i2);
        i6542595490584778312.e = null;
        if (!z) {
            this.t.setValue(O9245300239821758723.a);
            return;
        }
        H11725168162114556860 h11725168162114556860 = this.l;
        if (h11725168162114556860 != null) {
            h11725168162114556860.k();
        }
    }
}
