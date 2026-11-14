package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W5896017744614017491 implements G4373553504164397325 {
    public static final V10300877997588547986 w = O4077903568229246.z(new L2311487989567145532((byte) 16), new X2899556981606350920((byte) 0));
    public final O5398397151674912513 a;
    public boolean b;
    public K15976628200778816833 c;
    public final I6542595490584778312 d;
    public final V697849047308847220 e;
    public final S9385204271696540760 f;
    public float g;
    public final V16232943500580701817 h;
    public final boolean i;
    public H11725168162114556860 j;
    public final O8465802837550908662 k;
    public final U8557721631511515756 l;
    public final I2828680009210448000 m;
    public final V12816289154094534935 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B14178846910827721115 f564o;
    public final F6942723054099263096 p;
    public final Y18072866666914382106 q;
    public final W1972671267364756056 r;
    public final W1972671267364756056 s;
    public final V697849047308847220 t;
    public final V697849047308847220 u;
    public final V10300877997588547986 v;

    public W5896017744614017491(int i, int i2) {
        O5398397151674912513 o5398397151674912513 = new O5398397151674912513();
        o5398397151674912513.a = -1;
        o5398397151674912513.e = new D389890677992184566(0, new T5398360193539863765[16]);
        o5398397151674912513.c = -1;
        this.a = o5398397151674912513;
        this.d = new I6542595490584778312(i, i2, (byte) 0);
        this.e = new V697849047308847220(T13669392468939188228.a, B14824868959299866349.k);
        this.f = new S9385204271696540760();
        this.h = new V16232943500580701817(new S16262227471297796850(this, (byte) 14));
        this.i = true;
        this.k = new O8465802837550908662(this, (byte) 0);
        this.l = new U8557721631511515756();
        this.m = new I2828680009210448000();
        this.n = new V12816289154094534935((byte) 1);
        this.f564o = new B14178846910827721115(new B5635736699687884861(this, i, (byte) 3));
        this.p = new F6942723054099263096(this, (byte) 15);
        this.q = new Y18072866666914382106();
        this.r = C775827382551829194.E();
        this.s = C775827382551829194.E();
        Boolean bool = Boolean.FALSE;
        this.t = V4416135141588678913.t(bool);
        this.u = V4416135141588678913.t(bool);
        this.v = new V10300877997588547986((byte) 3);
    }

    public static Object i(W5896017744614017491 w5896017744614017491, int i, R14062301455140331524 r14062301455140331524) {
        w5896017744614017491.getClass();
        Object objE = w5896017744614017491.e(D6414970586266598845.a, new W14422599366371361201(w5896017744614017491, i, null, (byte) 0), r14062301455140331524);
        return objE == Z3437138737604933638.a ? objE : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean b() {
        return this.h.b();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // dev.epro.r0.G4373553504164397325
    public final float d(float f) {
        return this.h.d(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        if (r6.h.e(r7, r8, r0) == r5) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // dev.epro.r0.G4373553504164397325
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dev.epro.r0.D6414970586266598845 r7, dev.epro.r0.L12639328004344855510 r8, dev.epro.r0.K14749510448791472029 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof dev.epro.r0.P14105575509916868768
            if (r0 == 0) goto L13
            r0 = r9
            dev.epro.r0.P14105575509916868768 r0 = (dev.epro.r0.P14105575509916868768) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            dev.epro.r0.P14105575509916868768 r0 = new dev.epro.r0.P14105575509916868768
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
            dev.epro.r0.V697849047308847220 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            dev.epro.r0.K15976628200778816833 r1 = dev.epro.r0.T13669392468939188228.a
            if (r9 != r1) goto L5b
            r0.t = r7
            r9 = r8
            dev.epro.r0.R14062301455140331524 r9 = (dev.epro.r0.R14062301455140331524) r9
            r0.u = r9
            r0.x = r4
            dev.epro.r0.U8557721631511515756 r9 = r6.l
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r5) goto L5b
            goto L69
        L5b:
            r0.t = r2
            r0.u = r2
            r0.x = r3
            dev.epro.r0.V16232943500580701817 r6 = r6.h
            java.lang.Object r6 = r6.e(r7, r8, r0)
            if (r6 != r5) goto L6a
        L69:
            return r5
        L6a:
            dev.epro.r0.O9245300239821758723 r6 = dev.epro.r0.O9245300239821758723.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W5896017744614017491.e(dev.epro.r0.D6414970586266598845, dev.epro.r0.L12639328004344855510, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(dev.epro.r0.K15976628200778816833 r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W5896017744614017491.f(dev.epro.r0.K15976628200778816833, boolean, boolean):void");
    }

    public final K15976628200778816833 g() {
        return (K15976628200778816833) this.e.getValue();
    }

    public final void h(float f, K15976628200778816833 k15976628200778816833) {
        if (this.i) {
            O5398397151674912513 o5398397151674912513 = this.a;
            D389890677992184566 d389890677992184566 = (D389890677992184566) o5398397151674912513.e;
            List list = k15976628200778816833.n;
            List list2 = k15976628200778816833.n;
            R7000310675073492254 r7000310675073492254 = k15976628200778816833.r;
            if (!list.isEmpty()) {
                int i = 0;
                boolean z = f < 0.0f;
                int iB = O5398397151674912513.b(k15976628200778816833, z);
                int i2 = z ? ((V2435767323669307206) R9411874267597469228.K0(list2)).a + 1 : ((V2435767323669307206) R9411874267597469228.B0(list2)).a - 1;
                if (i2 >= 0 && i2 < k15976628200778816833.q) {
                    if (iB != o5398397151674912513.a && iB >= 0) {
                        if (o5398397151674912513.b != z) {
                            Object[] objArr = d389890677992184566.a;
                            int i3 = d389890677992184566.c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((T5398360193539863765) objArr[i4]).cancel();
                            }
                        }
                        o5398397151674912513.b = z;
                        o5398397151674912513.a = iB;
                        d389890677992184566.i();
                        d389890677992184566.d(d389890677992184566.c, this.p.n(iB));
                    }
                    if (z) {
                        V2435767323669307206 v2435767323669307206 = (V2435767323669307206) R9411874267597469228.K0(list2);
                        if (((I3887072968740112330.E(v2435767323669307206, r7000310675073492254) + ((int) (r7000310675073492254 == R7000310675073492254.a ? v2435767323669307206.v & 4294967295L : v2435767323669307206.v >> 32))) + k15976628200778816833.t) - k15976628200778816833.p < (-f)) {
                            Object[] objArr2 = d389890677992184566.a;
                            int i5 = d389890677992184566.c;
                            while (i < i5) {
                                ((T5398360193539863765) objArr2[i]).a();
                                i++;
                            }
                        }
                    } else if (k15976628200778816833.f328o - I3887072968740112330.E((V2435767323669307206) R9411874267597469228.B0(list2), r7000310675073492254) < f) {
                        Object[] objArr3 = d389890677992184566.a;
                        int i6 = d389890677992184566.c;
                        while (i < i6) {
                            ((T5398360193539863765) objArr3[i]).a();
                            i++;
                        }
                    }
                }
            }
            o5398397151674912513.d = f;
        }
    }
}
