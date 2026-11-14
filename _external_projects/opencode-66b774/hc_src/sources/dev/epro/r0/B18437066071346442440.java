package dev.epro.r0;

import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class B18437066071346442440 extends T8224077743602349830 implements Q2423450198286343102, J12043550928838212009, N5372082901916183419 {
    public final int e;
    public final int f;
    public final T1542296375665870064 g;
    public Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public B18437066071346442440(int i, int i2, T1542296375665870064 t1542296375665870064) {
        this.e = i;
        this.f = i2;
        this.g = t1542296375665870064;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(7:(2:3|(10:5|6|7|(2:9|(1:(1:(7:13|14|15|16|17|(3:18|19|(10:28|(2:33|34)|36|(1:38)|15|16|17|18|19|(0)(1:21))(0))|25)(2:39|40))(5:41|42|17|(3:18|19|(0)(0))|25))(4:43|44|45|46))(1:57)|47|48|16|17|(3:18|19|(0)(0))|25))|47|48|16|17|(3:18|19|(0)(0))|25)|59|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0036, code lost:
    
        r8 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:14:0x002f, B:18:0x0075, B:21:0x007f, B:30:0x0092, B:33:0x0099, B:34:0x009d, B:36:0x009e, B:42:0x0047), top: B:7:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARN: Type inference failed for: r4v1, types: [dev.epro.r0.T8224077743602349830] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [dev.epro.r0.B18437066071346442440] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [dev.epro.r0.S7864201625552763331] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v2, types: [dev.epro.r0.A314510841421691141] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [dev.epro.r0.F8280156729697730717] */
    /* JADX WARN: Type inference failed for: r9v8, types: [dev.epro.r0.F8280156729697730717] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ac -> B:15:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(dev.epro.r0.B18437066071346442440 r8, dev.epro.r0.S7864201625552763331 r9, dev.epro.r0.R4833348786910499294 r10) {
        /*
            boolean r0 = r10 instanceof dev.epro.r0.R9365110755180904643
            if (r0 == 0) goto L13
            r0 = r10
            dev.epro.r0.R9365110755180904643 r0 = (dev.epro.r0.R9365110755180904643) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            dev.epro.r0.R9365110755180904643 r0 = new dev.epro.r0.R9365110755180904643
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.x
            int r1 = r0.z
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L5a
            r8 = 1
            if (r1 == r8) goto L4b
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L39
            dev.epro.r0.Q15035754882231748864 r8 = r0.w
            dev.epro.r0.F8280156729697730717 r9 = r0.v
            dev.epro.r0.S7864201625552763331 r1 = r0.u
            dev.epro.r0.B18437066071346442440 r4 = r0.t
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L36
        L32:
            r10 = r1
            r1 = r8
            r8 = r4
            goto L72
        L36:
            r8 = move-exception
            goto Lb2
        L39:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r8)
            return
        L3f:
            dev.epro.r0.Q15035754882231748864 r8 = r0.w
            dev.epro.r0.F8280156729697730717 r9 = r0.v
            dev.epro.r0.S7864201625552763331 r1 = r0.u
            dev.epro.r0.B18437066071346442440 r4 = r0.t
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L36
            goto L75
        L4b:
            dev.epro.r0.F8280156729697730717 r9 = r0.v
            dev.epro.r0.S7864201625552763331 r8 = r0.u
            dev.epro.r0.B18437066071346442440 r1 = r0.t
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L57
            r10 = r8
            r8 = r1
            goto L66
        L57:
            r8 = move-exception
            r4 = r1
            goto Lb2
        L5a:
            dev.epro.r0.E17665849472693074628.k(r10)
            dev.epro.r0.A314510841421691141 r10 = r8.b()
            dev.epro.r0.F8280156729697730717 r10 = (dev.epro.r0.F8280156729697730717) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L66:
            dev.epro.r0.G8001132634698687269 r1 = r0.getContext()     // Catch: java.lang.Throwable -> Laf
            dev.epro.r0.P2382941533350862833 r4 = dev.epro.r0.P2382941533350862833.p     // Catch: java.lang.Throwable -> Laf
            dev.epro.r0.H7323971265464188398 r1 = r1.get(r4)     // Catch: java.lang.Throwable -> Laf
            dev.epro.r0.Q15035754882231748864 r1 = (dev.epro.r0.Q15035754882231748864) r1     // Catch: java.lang.Throwable -> Laf
        L72:
            r4 = r8
            r8 = r1
            r1 = r10
        L75:
            java.lang.Object r10 = r4.s(r9)     // Catch: java.lang.Throwable -> L36
            dev.epro.r0.D14731132657808549702 r5 = dev.epro.r0.C9869900372345142877.h     // Catch: java.lang.Throwable -> L36
            dev.epro.r0.Z3437138737604933638 r6 = dev.epro.r0.Z3437138737604933638.a
            if (r10 != r5) goto L90
            r0.t = r4     // Catch: java.lang.Throwable -> L36
            r0.u = r1     // Catch: java.lang.Throwable -> L36
            r0.v = r9     // Catch: java.lang.Throwable -> L36
            r0.w = r8     // Catch: java.lang.Throwable -> L36
            r0.z = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r4.i(r9, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L75
            goto Lae
        L90:
            if (r8 == 0) goto L9e
            boolean r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L99
            goto L9e
        L99:
            java.util.concurrent.CancellationException r8 = r8.o()     // Catch: java.lang.Throwable -> L36
            throw r8     // Catch: java.lang.Throwable -> L36
        L9e:
            r0.t = r4     // Catch: java.lang.Throwable -> L36
            r0.u = r1     // Catch: java.lang.Throwable -> L36
            r0.v = r9     // Catch: java.lang.Throwable -> L36
            r0.w = r8     // Catch: java.lang.Throwable -> L36
            r0.z = r2     // Catch: java.lang.Throwable -> L36
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L36
            if (r10 != r6) goto L32
        Lae:
            return
        Laf:
            r10 = move-exception
            r4 = r8
            r8 = r10
        Lb2:
            r4.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B18437066071346442440.k(dev.epro.r0.B18437066071346442440, dev.epro.r0.S7864201625552763331, dev.epro.r0.R4833348786910499294):void");
    }

    @Override // dev.epro.r0.N5372082901916183419
    public final J12043550928838212009 a(G8001132634698687269 g8001132634698687269, int i, T1542296375665870064 t1542296375665870064) {
        return C9869900372345142877.D(this, g8001132634698687269, i, t1542296375665870064);
    }

    @Override // dev.epro.r0.T8224077743602349830
    public final A314510841421691141 c() {
        F8280156729697730717 f8280156729697730717 = new F8280156729697730717();
        f8280156729697730717.a = -1L;
        return f8280156729697730717;
    }

    @Override // dev.epro.r0.J12043550928838212009
    public final Object collect(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294) {
        k(this, s7864201625552763331, r4833348786910499294);
        return Z3437138737604933638.a;
    }

    @Override // dev.epro.r0.T8224077743602349830
    public final A314510841421691141[] d() {
        return new F8280156729697730717[2];
    }

    @Override // dev.epro.r0.Q2423450198286343102, dev.epro.r0.S7864201625552763331
    public final Object emit(Object obj, R4833348786910499294 r4833348786910499294) {
        B18437066071346442440 b18437066071346442440;
        Throwable th;
        R4833348786910499294[] n;
        E10537331155856929880 e10537331155856929880;
        if (h(obj)) {
            return O9245300239821758723.a;
        }
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r4833348786910499294));
        h7219028874700587498.t();
        R4833348786910499294[] r4833348786910499294Arr = K5751602218013079365.a;
        synchronized (this) {
            try {
                if (q(obj)) {
                    try {
                        h7219028874700587498.resumeWith(O9245300239821758723.a);
                        n = n(r4833348786910499294Arr);
                        e10537331155856929880 = null;
                        b18437066071346442440 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        b18437066071346442440 = this;
                        throw th;
                    }
                } else {
                    try {
                        b18437066071346442440 = this;
                        try {
                            E10537331155856929880 e105373311558569298802 = new E10537331155856929880(b18437066071346442440, o() + this.k + this.l, obj, h7219028874700587498);
                            b18437066071346442440.m(e105373311558569298802);
                            b18437066071346442440.l++;
                            if (b18437066071346442440.f == 0) {
                                r4833348786910499294Arr = b18437066071346442440.n(r4833348786910499294Arr);
                            }
                            n = r4833348786910499294Arr;
                            e10537331155856929880 = e105373311558569298802;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        b18437066071346442440 = this;
                        th = th4;
                        throw th;
                    }
                }
                if (e10537331155856929880 != null) {
                    h7219028874700587498.w(new T5499530138885127132(e10537331155856929880, (byte) 2));
                }
                for (R4833348786910499294 r48333487869104992942 : n) {
                    if (r48333487869104992942 != null) {
                        r48333487869104992942.resumeWith(O9245300239821758723.a);
                    }
                }
                Object r = h7219028874700587498.r();
                Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
                if (r != z3437138737604933638) {
                    r = O9245300239821758723.a;
                }
                return r == z3437138737604933638 ? r : O9245300239821758723.a;
            } catch (Throwable th5) {
                th = th5;
                b18437066071346442440 = this;
            }
        }
    }

    @Override // dev.epro.r0.Q2423450198286343102
    public final void g() {
        B18437066071346442440 b18437066071346442440;
        synchronized (this) {
            try {
                b18437066071346442440 = this;
                try {
                    b18437066071346442440.t(o() + this.k, this.j, o() + this.k, o() + this.k + this.l);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                b18437066071346442440 = this;
            }
        }
    }

    @Override // dev.epro.r0.Q2423450198286343102
    public final boolean h(Object obj) {
        int i;
        boolean z;
        R4833348786910499294[] r4833348786910499294Arr = K5751602218013079365.a;
        synchronized (this) {
            if (q(obj)) {
                r4833348786910499294Arr = n(r4833348786910499294Arr);
                z = true;
            } else {
                z = false;
            }
        }
        for (R4833348786910499294 r4833348786910499294 : r4833348786910499294Arr) {
            if (r4833348786910499294 != null) {
                r4833348786910499294.resumeWith(O9245300239821758723.a);
            }
        }
        return z;
    }

    public final Object i(F8280156729697730717 f8280156729697730717, R9365110755180904643 r9365110755180904643) {
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r9365110755180904643));
        h7219028874700587498.t();
        synchronized (this) {
            try {
                if (r(f8280156729697730717) < 0) {
                    f8280156729697730717.b = h7219028874700587498;
                } else {
                    h7219028874700587498.resumeWith(O9245300239821758723.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object r = h7219028874700587498.r();
        return r == Z3437138737604933638.a ? r : O9245300239821758723.a;
    }

    public final void j() {
        if (this.f != 0 || this.l > 1) {
            Object[] objArr = this.h;
            objArr.getClass();
            while (this.l > 0) {
                long o2 = o();
                int i = this.k;
                int i2 = this.l;
                if (objArr[((int) ((o2 + (i + i2)) - 1)) & (objArr.length - 1)] != C9869900372345142877.h) {
                    return;
                }
                this.l = i2 - 1;
                C9869900372345142877.R(objArr, o() + this.k + this.l, null);
            }
        }
    }

    public final void l() {
        A314510841421691141[] a314510841421691141Arr;
        Object[] objArr = this.h;
        objArr.getClass();
        C9869900372345142877.R(objArr, o(), null);
        this.k--;
        long o2 = o() + 1;
        if (this.i < o2) {
            this.i = o2;
        }
        if (this.j < o2) {
            if (this.b != 0 && (a314510841421691141Arr = this.a) != null) {
                for (A314510841421691141 a314510841421691141 : a314510841421691141Arr) {
                    if (a314510841421691141 != null) {
                        F8280156729697730717 f8280156729697730717 = (F8280156729697730717) a314510841421691141;
                        long j = f8280156729697730717.a;
                        if (j >= 0 && j < o2) {
                            f8280156729697730717.a = o2;
                        }
                    }
                }
            }
            this.j = o2;
        }
    }

    public final void m(Object obj) {
        int i = this.k + this.l;
        Object[] objArr = this.h;
        if (objArr == null) {
            objArr = p(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = p(objArr, i, objArr.length * 2);
        }
        C9869900372345142877.R(objArr, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final R4833348786910499294[] n(R4833348786910499294[] r4833348786910499294Arr) {
        A314510841421691141[] a314510841421691141Arr;
        F8280156729697730717 f8280156729697730717;
        H7219028874700587498 h7219028874700587498;
        int length = r4833348786910499294Arr.length;
        if (this.b != 0 && (a314510841421691141Arr = this.a) != null) {
            int length2 = a314510841421691141Arr.length;
            int i = 0;
            r4833348786910499294Arr = r4833348786910499294Arr;
            while (i < length2) {
                A314510841421691141 a314510841421691141 = a314510841421691141Arr[i];
                if (a314510841421691141 != null && (h7219028874700587498 = (f8280156729697730717 = (F8280156729697730717) a314510841421691141).b) != null && r(f8280156729697730717) >= 0) {
                    int length3 = r4833348786910499294Arr.length;
                    r4833348786910499294Arr = r4833348786910499294Arr;
                    if (length >= length3) {
                        r4833348786910499294Arr = Arrays.copyOf(r4833348786910499294Arr, Math.max(2, r4833348786910499294Arr.length * 2));
                    }
                    r4833348786910499294Arr[length] = h7219028874700587498;
                    f8280156729697730717.b = null;
                    length++;
                }
                i++;
                r4833348786910499294Arr = r4833348786910499294Arr;
            }
        }
        return r4833348786910499294Arr;
    }

    public final long o() {
        return Math.min(this.j, this.i);
    }

    public final Object[] p(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            S10973172697741180971.m("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.h = objArr2;
        if (objArr != null) {
            long o2 = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + o2;
                C9869900372345142877.R(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(Object obj) {
        int i = this.b;
        int i2 = this.e;
        if (i != 0) {
            int i3 = this.k;
            int i4 = this.f;
            if (i3 >= i4 && this.j <= this.i) {
                int ordinal = this.g.ordinal();
                if (ordinal == 0) {
                    return false;
                }
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        Z3383101362411723454.g();
                        return false;
                    }
                }
            }
            m(obj);
            int i5 = this.k + 1;
            this.k = i5;
            if (i5 > i4) {
                l();
            }
            long o2 = o() + this.k;
            long j = this.i;
            if (((int) (o2 - j)) > i2) {
                t(1 + j, this.j, o() + this.k, o() + this.k + this.l);
            }
        } else if (i2 != 0) {
            m(obj);
            int i6 = this.k + 1;
            this.k = i6;
            if (i6 > i2) {
                l();
            }
            this.j = o() + this.k;
            return true;
        }
        return true;
    }

    public final long r(F8280156729697730717 f8280156729697730717) {
        long j = f8280156729697730717.a;
        if (j >= o() + this.k && (this.f > 0 || j > o() || this.l == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object s(F8280156729697730717 f8280156729697730717) {
        Object obj;
        R4833348786910499294[] r4833348786910499294Arr = K5751602218013079365.a;
        synchronized (this) {
            try {
                long r = r(f8280156729697730717);
                if (r < 0) {
                    obj = C9869900372345142877.h;
                } else {
                    long j = f8280156729697730717.a;
                    Object[] objArr = this.h;
                    objArr.getClass();
                    Object obj2 = objArr[((int) r) & (objArr.length - 1)];
                    if (obj2 instanceof E10537331155856929880) {
                        obj2 = ((E10537331155856929880) obj2).c;
                    }
                    f8280156729697730717.a = r + 1;
                    Object obj3 = obj2;
                    r4833348786910499294Arr = u(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (R4833348786910499294 r4833348786910499294 : r4833348786910499294Arr) {
            if (r4833348786910499294 != null) {
                r4833348786910499294.resumeWith(O9245300239821758723.a);
            }
        }
        return obj;
    }

    public final void t(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long o2 = o(); o2 < min; o2++) {
            Object[] objArr = this.h;
            objArr.getClass();
            C9869900372345142877.R(objArr, o2, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - min);
        this.l = (int) (j4 - j3);
    }

    public final R4833348786910499294[] u(long j) {
        long j2;
        long j3;
        long j4;
        R4833348786910499294[] r4833348786910499294Arr;
        R4833348786910499294[] r4833348786910499294Arr2;
        A314510841421691141[] a314510841421691141Arr;
        D14731132657808549702 d14731132657808549702 = C9869900372345142877.h;
        R4833348786910499294[] r4833348786910499294Arr3 = K5751602218013079365.a;
        if (j <= this.j) {
            long o2 = o();
            long j5 = this.k + o2;
            int i = this.f;
            if (i == 0 && this.l > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.b != 0 && (a314510841421691141Arr = this.a) != null) {
                for (A314510841421691141 a314510841421691141 : a314510841421691141Arr) {
                    if (a314510841421691141 != null) {
                        long j6 = ((F8280156729697730717) a314510841421691141).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.j) {
                long o3 = o() + this.k;
                int i3 = this.b;
                int i4 = this.l;
                if (i3 > 0) {
                    j2 = 1;
                    i4 = Math.min(i4, i - ((int) (o3 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = this.l + o3;
                if (i4 > 0) {
                    Object[] objArr = this.h;
                    objArr.getClass();
                    j3 = o2;
                    R4833348786910499294[] r4833348786910499294Arr4 = new R4833348786910499294[i4];
                    long j8 = o3;
                    while (true) {
                        if (o3 >= j7) {
                            r4833348786910499294Arr2 = r4833348786910499294Arr4;
                            j4 = j5;
                            break;
                        }
                        r4833348786910499294Arr2 = r4833348786910499294Arr4;
                        Object obj = objArr[((int) o3) & (objArr.length - 1)];
                        if (obj != d14731132657808549702) {
                            obj.getClass();
                            E10537331155856929880 e10537331155856929880 = (E10537331155856929880) obj;
                            j4 = j5;
                            int i5 = i2 + 1;
                            r4833348786910499294Arr2[i2] = e10537331155856929880.d;
                            C9869900372345142877.R(objArr, o3, d14731132657808549702);
                            C9869900372345142877.R(objArr, j8, e10537331155856929880.c);
                            j8 += j2;
                            if (i5 >= i4) {
                                break;
                            }
                            i2 = i5;
                        } else {
                            j4 = j5;
                        }
                        o3 += j2;
                        r4833348786910499294Arr4 = r4833348786910499294Arr2;
                        j5 = j4;
                    }
                    o3 = j8;
                    r4833348786910499294Arr = r4833348786910499294Arr2;
                } else {
                    j3 = o2;
                    j4 = j5;
                    r4833348786910499294Arr = r4833348786910499294Arr3;
                }
                int i6 = (int) (o3 - j3);
                long j9 = this.b == 0 ? o3 : j4;
                long max = Math.max(this.i, o3 - Math.min(this.e, i6));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.h;
                    objArr2.getClass();
                    if (S10823041268949770285.t(objArr2[((int) max) & (objArr2.length - 1)], d14731132657808549702)) {
                        o3 += j2;
                        max += j2;
                    }
                }
                t(max, j9, o3, j7);
                j();
                return r4833348786910499294Arr.length == 0 ? r4833348786910499294Arr : n(r4833348786910499294Arr);
            }
        }
        return r4833348786910499294Arr3;
    }
}
