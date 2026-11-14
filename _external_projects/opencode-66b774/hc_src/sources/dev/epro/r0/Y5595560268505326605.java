package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y5595560268505326605 extends T9533098554585011700 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public M8849337839148886240 e;
    public Object f;
    public int g;

    public Y5595560268505326605(long j) {
        super(j);
        M8849337839148886240 m8849337839148886240 = C7857973833719834669.a;
        m8849337839148886240.getClass();
        this.e = m8849337839148886240;
        this.f = h;
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final void a(T9533098554585011700 t9533098554585011700) {
        t9533098554585011700.getClass();
        Y5595560268505326605 y5595560268505326605 = (Y5595560268505326605) t9533098554585011700;
        this.e = y5595560268505326605.e;
        this.f = y5595560268505326605.f;
        this.g = y5595560268505326605.g;
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final T9533098554585011700 c(long j) {
        return new Y5595560268505326605(j);
    }

    public final boolean d(B4739506393801054036 b4739506393801054036, M4722199849958580248 m4722199849958580248) {
        boolean z;
        boolean z2;
        Object obj = D459204867321966484.c;
        synchronized (obj) {
            z = true;
            if (this.c == m4722199849958580248.g()) {
                if (this.d == m4722199849958580248.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != e(b4739506393801054036, m4722199849958580248))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.c = m4722199849958580248.g();
            this.d = m4722199849958580248.h();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [dev.epro.r0.Y5595560268505326605] */
    /* JADX WARN: Type inference failed for: r13v5, types: [dev.epro.r0.T9533098554585011700] */
    /* JADX WARN: Type inference failed for: r13v6, types: [dev.epro.r0.T9533098554585011700, java.lang.Object] */
    public final int e(B4739506393801054036 b4739506393801054036, M4722199849958580248 m4722199849958580248) {
        M8849337839148886240 m8849337839148886240;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? g;
        synchronized (D459204867321966484.c) {
            m8849337839148886240 = this.e;
        }
        int i5 = 7;
        if (m8849337839148886240.e == 0) {
            return 7;
        }
        D389890677992184566 a = Z3658309082448601011.a();
        Object[] objArr3 = a.a;
        int i6 = a.c;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((I16737082536984153748) objArr3[i7]).b();
        }
        try {
            Object[] objArr4 = m8849337839148886240.b;
            int[] iArr = m8849337839148886240.c;
            long[] jArr3 = m8849337839148886240.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z ? 1 : 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                O13595511762861117873 o13595511762861117873 = (O13595511762861117873) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (o13595511762861117873 instanceof B4739506393801054036) {
                                        B4739506393801054036 b47395063938010540362 = (B4739506393801054036) o13595511762861117873;
                                        g = b47395063938010540362.g((Y5595560268505326605) D459204867321966484.g(b47395063938010540362.d, m4722199849958580248), m4722199849958580248, z, b47395063938010540362.b);
                                        M8849337839148886240 m88493378391488862402 = g.e;
                                        Object[] objArr5 = m88493378391488862402.b;
                                        long[] jArr4 = m88493378391488862402.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + System.identityHashCode((O13595511762861117873) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        g = D459204867321966484.g(o13595511762861117873.a(), m4722199849958580248);
                                    }
                                    i = (((i * 31) + System.identityHashCode(g)) * 31) + Long.hashCode(g.a);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                    objArr4 = objArr;
                    z = false;
                }
            }
            i = i5;
            Object[] objArr6 = a.a;
            int i18 = a.c;
            for (int i19 = 0; i19 < i18; i19++) {
                ((I16737082536984153748) objArr6[i19]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = a.a;
            int i20 = a.c;
            for (int i21 = 0; i21 < i20; i21++) {
                ((I16737082536984153748) objArr7[i21]).a();
            }
            throw th;
        }
    }
}
