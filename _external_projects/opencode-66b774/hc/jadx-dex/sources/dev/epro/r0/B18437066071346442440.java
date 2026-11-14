package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class B18437066071346442440 extends dev.epro.r0.T8224077743602349830 implements dev.epro.r0.Q2423450198286343102, dev.epro.r0.J12043550928838212009, dev.epro.r0.N5372082901916183419 {
    public final int e;
    public final int f;
    public final dev.epro.r0.T1542296375665870064 g;
    public java.lang.Object[] h;
    public long i;
    public long j;
    public int k;
    public int l;

    public B18437066071346442440(int i, int i2, dev.epro.r0.T1542296375665870064 t1542296375665870064) {
        this.e = i;
        this.f = i2;
        this.g = t1542296375665870064;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(0)|8|51|(2:10|(1:(1:(7:14|15|16|31|59|(5:32|33|(10:57|(2:42|43)|44|(1:61)|16|31|59|32|33|(0)(1:35))(0)|49|50)|46)(2:19|20))(5:21|22|59|(5:32|33|(0)(0)|49|50)|46))(4:24|53|25|26))(1:29)|55|30|31|59|(5:32|33|(0)(0)|49|50)|46) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00af, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x0036, TRY_ENTER, TryCatch #0 {all -> 0x0036, blocks: (B:15:0x002f, B:32:0x0075, B:35:0x007f, B:39:0x0092, B:42:0x0099, B:43:0x009d, B:44:0x009e, B:22:0x0047), top: B:51:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ac -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(dev.epro.r0.B18437066071346442440 r8, dev.epro.r0.S7864201625552763331 r9, dev.epro.r0.R4833348786910499294 r10) throws java.lang.Throwable {
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

    /* JADX WARN: Multi-variable type inference failed */
    public final dev.epro.r0.J12043550928838212009 a(dev.epro.r0.G8001132634698687269 g8001132634698687269, int i, dev.epro.r0.T1542296375665870064 t1542296375665870064) {
        return dev.epro.r0.C9869900372345142877.D(this, g8001132634698687269, i, t1542296375665870064);
    }

    public final dev.epro.r0.A314510841421691141 c() {
        dev.epro.r0.F8280156729697730717 f8280156729697730717 = new dev.epro.r0.F8280156729697730717();
        f8280156729697730717.a = -1L;
        return f8280156729697730717;
    }

    public final java.lang.Object collect(dev.epro.r0.S7864201625552763331 s7864201625552763331, dev.epro.r0.R4833348786910499294 r4833348786910499294) throws java.lang.Throwable {
        k(this, s7864201625552763331, r4833348786910499294);
        return dev.epro.r0.Z3437138737604933638.a;
    }

    public final dev.epro.r0.A314510841421691141[] d() {
        return new dev.epro.r0.F8280156729697730717[2];
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r8, dev.epro.r0.R4833348786910499294 r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.h(r8)
            if (r0 == 0) goto L9
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            return r7
        L9:
            dev.epro.r0.H7219028874700587498 r5 = new dev.epro.r0.H7219028874700587498
            dev.epro.r0.R4833348786910499294 r9 = dev.epro.r0.E18444280280170001567.H(r9)
            r6 = 1
            r5.<init>(r6, r9)
            r5.t()
            dev.epro.r0.R4833348786910499294[] r9 = dev.epro.r0.K5751602218013079365.a
            monitor-enter(r7)
            boolean r0 = r7.q(r8)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L30
            dev.epro.r0.O9245300239821758723 r8 = dev.epro.r0.O9245300239821758723.a     // Catch: java.lang.Throwable -> L2b
            r5.resumeWith(r8)     // Catch: java.lang.Throwable -> L2b
            dev.epro.r0.R4833348786910499294[] r8 = r7.n(r9)     // Catch: java.lang.Throwable -> L2b
            r9 = 0
            r1 = r7
            goto L59
        L2b:
            r0 = move-exception
            r8 = r0
            r1 = r7
            goto L8e
        L30:
            dev.epro.r0.E10537331155856929880 r0 = new dev.epro.r0.E10537331155856929880     // Catch: java.lang.Throwable -> L8b
            long r1 = r7.o()     // Catch: java.lang.Throwable -> L8b
            int r3 = r7.k     // Catch: java.lang.Throwable -> L86
            int r4 = r7.l     // Catch: java.lang.Throwable -> L86
            int r3 = r3 + r4
            long r3 = (long) r3
            long r2 = r1 + r3
            r1 = r7
            r4 = r8
            r0.<init>(r1, r2, r4, r5)     // Catch: java.lang.Throwable -> L54
            r1.m(r0)     // Catch: java.lang.Throwable -> L54
            int r7 = r1.l     // Catch: java.lang.Throwable -> L54
            int r7 = r7 + r6
            r1.l = r7     // Catch: java.lang.Throwable -> L54
            int r7 = r1.f     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L57
            dev.epro.r0.R4833348786910499294[] r9 = r1.n(r9)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
        L55:
            r8 = r0
            goto L8e
        L57:
            r8 = r9
            r9 = r0
        L59:
            monitor-exit(r1)
            if (r9 == 0) goto L65
            dev.epro.r0.T5499530138885127132 r7 = new dev.epro.r0.T5499530138885127132
            r0 = 2
            r7.<init>(r9, r0)
            r5.w(r7)
        L65:
            int r7 = r8.length
            r9 = 0
        L67:
            if (r9 >= r7) goto L75
            r0 = r8[r9]
            if (r0 == 0) goto L72
            dev.epro.r0.O9245300239821758723 r1 = dev.epro.r0.O9245300239821758723.a
            r0.resumeWith(r1)
        L72:
            int r9 = r9 + 1
            goto L67
        L75:
            java.lang.Object r7 = r5.r()
            dev.epro.r0.Z3437138737604933638 r8 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r8) goto L7e
            goto L80
        L7e:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
        L80:
            if (r7 != r8) goto L83
            return r7
        L83:
            dev.epro.r0.O9245300239821758723 r7 = dev.epro.r0.O9245300239821758723.a
            return r7
        L86:
            r0 = move-exception
            r1 = r7
            r7 = r0
            r8 = r7
            goto L8e
        L8b:
            r0 = move-exception
            r1 = r7
            goto L55
        L8e:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B18437066071346442440.emit(java.lang.Object, dev.epro.r0.R4833348786910499294):java.lang.Object");
    }

    public final void g() throws java.lang.Throwable {
        dev.epro.r0.B18437066071346442440 b18437066071346442440;
        synchronized (this) {
            try {
                b18437066071346442440 = this;
                try {
                    b18437066071346442440.t(o() + ((long) this.k), this.j, o() + ((long) this.k), o() + ((long) this.k) + ((long) this.l));
                } catch (java.lang.Throwable th) {
                    th = th;
                    java.lang.Throwable th2 = th;
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                b18437066071346442440 = this;
            }
        }
    }

    public final boolean h(java.lang.Object obj) {
        int i;
        boolean z;
        dev.epro.r0.R4833348786910499294[] r4833348786910499294ArrN = dev.epro.r0.K5751602218013079365.a;
        synchronized (this) {
            if (q(obj)) {
                r4833348786910499294ArrN = n(r4833348786910499294ArrN);
                z = true;
            } else {
                z = false;
            }
        }
        for (dev.epro.r0.R4833348786910499294 r4833348786910499294 : r4833348786910499294ArrN) {
            if (r4833348786910499294 != null) {
                r4833348786910499294.resumeWith(dev.epro.r0.O9245300239821758723.a);
            }
        }
        return z;
    }

    public final java.lang.Object i(dev.epro.r0.F8280156729697730717 f8280156729697730717, dev.epro.r0.R9365110755180904643 r9365110755180904643) {
        dev.epro.r0.H7219028874700587498 h7219028874700587498 = new dev.epro.r0.H7219028874700587498(1, dev.epro.r0.E18444280280170001567.H(r9365110755180904643));
        h7219028874700587498.t();
        synchronized (this) {
            try {
                if (r(f8280156729697730717) < 0) {
                    f8280156729697730717.b = h7219028874700587498;
                } else {
                    h7219028874700587498.resumeWith(dev.epro.r0.O9245300239821758723.a);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        java.lang.Object objR = h7219028874700587498.r();
        return objR == dev.epro.r0.Z3437138737604933638.a ? objR : dev.epro.r0.O9245300239821758723.a;
    }

    public final void j() {
        if (this.f != 0 || this.l > 1) {
            java.lang.Object[] objArr = this.h;
            objArr.getClass();
            while (this.l > 0) {
                long jO = o();
                int i = this.k;
                int i2 = this.l;
                if (objArr[((int) ((jO + ((long) (i + i2))) - 1)) & (objArr.length - 1)] != dev.epro.r0.C9869900372345142877.h) {
                    return;
                }
                this.l = i2 - 1;
                dev.epro.r0.C9869900372345142877.R(objArr, o() + ((long) (this.k + this.l)), null);
            }
        }
    }

    public final void l() {
        dev.epro.r0.F8280156729697730717[] f8280156729697730717Arr;
        java.lang.Object[] objArr = this.h;
        objArr.getClass();
        dev.epro.r0.C9869900372345142877.R(objArr, o(), null);
        this.k--;
        long jO = o() + 1;
        if (this.i < jO) {
            this.i = jO;
        }
        if (this.j < jO) {
            if (((dev.epro.r0.T8224077743602349830) this).b != 0 && (f8280156729697730717Arr = ((dev.epro.r0.T8224077743602349830) this).a) != null) {
                for (dev.epro.r0.F8280156729697730717 f8280156729697730717 : f8280156729697730717Arr) {
                    if (f8280156729697730717 != null) {
                        dev.epro.r0.F8280156729697730717 f82801567296977307172 = f8280156729697730717;
                        long j = f82801567296977307172.a;
                        if (j >= 0 && j < jO) {
                            f82801567296977307172.a = jO;
                        }
                    }
                }
            }
            this.j = jO;
        }
    }

    public final void m(java.lang.Object obj) {
        int i = this.k + this.l;
        java.lang.Object[] objArrP = this.h;
        if (objArrP == null) {
            objArrP = p(null, 0, 2);
        } else if (i >= objArrP.length) {
            objArrP = p(objArrP, i, objArrP.length * 2);
        }
        dev.epro.r0.C9869900372345142877.R(objArrP, o() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [dev.epro.r0.R4833348786910499294[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final dev.epro.r0.R4833348786910499294[] n(dev.epro.r0.R4833348786910499294[] r4833348786910499294Arr) {
        dev.epro.r0.A314510841421691141[] a314510841421691141Arr;
        dev.epro.r0.F8280156729697730717 f8280156729697730717;
        dev.epro.r0.R4833348786910499294 r4833348786910499294;
        int length = r4833348786910499294Arr.length;
        if (((dev.epro.r0.T8224077743602349830) this).b != 0 && (a314510841421691141Arr = ((dev.epro.r0.T8224077743602349830) this).a) != null) {
            int length2 = a314510841421691141Arr.length;
            int i = 0;
            r4833348786910499294Arr = r4833348786910499294Arr;
            while (i < length2) {
                dev.epro.r0.A314510841421691141 a314510841421691141 = a314510841421691141Arr[i];
                if (a314510841421691141 != null && (r4833348786910499294 = (f8280156729697730717 = (dev.epro.r0.F8280156729697730717) a314510841421691141).b) != null && r(f8280156729697730717) >= 0) {
                    int length3 = r4833348786910499294Arr.length;
                    r4833348786910499294Arr = r4833348786910499294Arr;
                    if (length >= length3) {
                        r4833348786910499294Arr = java.util.Arrays.copyOf((java.lang.Object[]) r4833348786910499294Arr, java.lang.Math.max(2, r4833348786910499294Arr.length * 2));
                    }
                    ((dev.epro.r0.R4833348786910499294[]) r4833348786910499294Arr)[length] = r4833348786910499294;
                    f8280156729697730717.b = null;
                    length++;
                }
                i++;
                r4833348786910499294Arr = r4833348786910499294Arr;
            }
        }
        return (dev.epro.r0.R4833348786910499294[]) r4833348786910499294Arr;
    }

    public final long o() {
        return java.lang.Math.min(this.j, this.i);
    }

    public final java.lang.Object[] p(java.lang.Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            dev.epro.r0.S10973172697741180971.m("Buffer size overflow");
            return null;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        this.h = objArr2;
        if (objArr != null) {
            long jO = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + jO;
                dev.epro.r0.C9869900372345142877.R(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(java.lang.Object r13) {
        /*
            r12 = this;
            int r1 = r12.b
            int r2 = r12.e
            r9 = 1
            if (r1 != 0) goto L23
            if (r2 != 0) goto Lb
            goto L7e
        Lb:
            r12.m(r13)
            int r1 = r12.k
            int r1 = r1 + r9
            r12.k = r1
            if (r1 <= r2) goto L18
            r12.l()
        L18:
            long r1 = r12.o()
            int r3 = r12.k
            long r3 = (long) r3
            long r1 = r1 + r3
            r12.j = r1
            return r9
        L23:
            int r1 = r12.k
            int r3 = r12.f
            if (r1 < r3) goto L46
            long r4 = r12.j
            long r6 = r12.i
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L46
            dev.epro.r0.T1542296375665870064 r1 = r12.g
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            if (r1 == r9) goto L46
            r0 = 2
            if (r1 != r0) goto L3f
            goto L7e
        L3f:
            dev.epro.r0.Z3383101362411723454.g()
            r0 = 0
            return r0
        L44:
            r0 = 0
            return r0
        L46:
            r12.m(r13)
            int r1 = r12.k
            int r1 = r1 + r9
            r12.k = r1
            if (r1 <= r3) goto L53
            r12.l()
        L53:
            long r3 = r12.o()
            int r1 = r12.k
            long r5 = (long) r1
            long r3 = r3 + r5
            long r5 = r12.i
            long r3 = r3 - r5
            int r1 = (int) r3
            if (r1 <= r2) goto L7e
            r1 = 1
            long r1 = r1 + r5
            long r3 = r12.j
            long r5 = r12.o()
            int r7 = r12.k
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = r12.o()
            int r10 = r12.k
            long r10 = (long) r10
            long r7 = r7 + r10
            int r10 = r12.l
            long r10 = (long) r10
            long r7 = r7 + r10
            r0 = r12
            r0.t(r1, r3, r5, r7)
        L7e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.B18437066071346442440.q(java.lang.Object):boolean");
    }

    public final long r(dev.epro.r0.F8280156729697730717 f8280156729697730717) {
        long j = f8280156729697730717.a;
        if (j >= o() + ((long) this.k) && (this.f > 0 || j > o() || this.l == 0)) {
            return -1L;
        }
        return j;
    }

    public final java.lang.Object s(dev.epro.r0.F8280156729697730717 f8280156729697730717) {
        java.lang.Object obj;
        dev.epro.r0.R4833348786910499294[] r4833348786910499294ArrU = dev.epro.r0.K5751602218013079365.a;
        synchronized (this) {
            try {
                long jR = r(f8280156729697730717);
                if (jR < 0) {
                    obj = dev.epro.r0.C9869900372345142877.h;
                } else {
                    long j = f8280156729697730717.a;
                    java.lang.Object[] objArr = this.h;
                    objArr.getClass();
                    java.lang.Object obj2 = objArr[((int) jR) & (objArr.length - 1)];
                    if (obj2 instanceof dev.epro.r0.E10537331155856929880) {
                        obj2 = ((dev.epro.r0.E10537331155856929880) obj2).c;
                    }
                    f8280156729697730717.a = jR + 1;
                    java.lang.Object obj3 = obj2;
                    r4833348786910499294ArrU = u(j);
                    obj = obj3;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        for (dev.epro.r0.R4833348786910499294 r4833348786910499294 : r4833348786910499294ArrU) {
            if (r4833348786910499294 != null) {
                r4833348786910499294.resumeWith(dev.epro.r0.O9245300239821758723.a);
            }
        }
        return obj;
    }

    public final void t(long j, long j2, long j3, long j4) {
        long jMin = java.lang.Math.min(j2, j);
        for (long jO = o(); jO < jMin; jO++) {
            java.lang.Object[] objArr = this.h;
            objArr.getClass();
            dev.epro.r0.C9869900372345142877.R(objArr, jO, null);
        }
        this.i = j;
        this.j = j2;
        this.k = (int) (j3 - jMin);
        this.l = (int) (j4 - j3);
    }

    public final dev.epro.r0.R4833348786910499294[] u(long j) {
        long j2;
        long j3;
        long j4;
        dev.epro.r0.R4833348786910499294[] r4833348786910499294Arr;
        dev.epro.r0.R4833348786910499294[] r4833348786910499294Arr2;
        dev.epro.r0.F8280156729697730717[] f8280156729697730717Arr;
        dev.epro.r0.D14731132657808549702 d14731132657808549702 = dev.epro.r0.C9869900372345142877.h;
        dev.epro.r0.R4833348786910499294[] r4833348786910499294Arr3 = dev.epro.r0.K5751602218013079365.a;
        if (j <= this.j) {
            long jO = o();
            long j5 = ((long) this.k) + jO;
            int i = this.f;
            if (i == 0 && this.l > 0) {
                j5++;
            }
            int i2 = 0;
            if (((dev.epro.r0.T8224077743602349830) this).b != 0 && (f8280156729697730717Arr = ((dev.epro.r0.T8224077743602349830) this).a) != null) {
                for (dev.epro.r0.F8280156729697730717 f8280156729697730717 : f8280156729697730717Arr) {
                    if (f8280156729697730717 != null) {
                        long j6 = f8280156729697730717.a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.j) {
                long jO2 = o() + ((long) this.k);
                int i3 = ((dev.epro.r0.T8224077743602349830) this).b;
                int iMin = this.l;
                if (i3 > 0) {
                    j2 = 1;
                    iMin = java.lang.Math.min(iMin, i - ((int) (jO2 - j5)));
                } else {
                    j2 = 1;
                }
                long j7 = ((long) this.l) + jO2;
                if (iMin > 0) {
                    java.lang.Object[] objArr = this.h;
                    objArr.getClass();
                    j3 = jO;
                    dev.epro.r0.R4833348786910499294[] r4833348786910499294Arr4 = new dev.epro.r0.R4833348786910499294[iMin];
                    long j8 = jO2;
                    while (true) {
                        if (jO2 >= j7) {
                            r4833348786910499294Arr2 = r4833348786910499294Arr4;
                            j4 = j5;
                            break;
                        }
                        r4833348786910499294Arr2 = r4833348786910499294Arr4;
                        java.lang.Object obj = objArr[((int) jO2) & (objArr.length - 1)];
                        if (obj != d14731132657808549702) {
                            obj.getClass();
                            dev.epro.r0.E10537331155856929880 e10537331155856929880 = (dev.epro.r0.E10537331155856929880) obj;
                            j4 = j5;
                            int i4 = i2 + 1;
                            r4833348786910499294Arr2[i2] = e10537331155856929880.d;
                            dev.epro.r0.C9869900372345142877.R(objArr, jO2, d14731132657808549702);
                            dev.epro.r0.C9869900372345142877.R(objArr, j8, e10537331155856929880.c);
                            j8 += j2;
                            if (i4 >= iMin) {
                                break;
                            }
                            i2 = i4;
                        } else {
                            j4 = j5;
                        }
                        jO2 += j2;
                        r4833348786910499294Arr4 = r4833348786910499294Arr2;
                        j5 = j4;
                    }
                    jO2 = j8;
                    r4833348786910499294Arr = r4833348786910499294Arr2;
                } else {
                    j3 = jO;
                    j4 = j5;
                    r4833348786910499294Arr = r4833348786910499294Arr3;
                }
                int i5 = (int) (jO2 - j3);
                long j9 = ((dev.epro.r0.T8224077743602349830) this).b == 0 ? jO2 : j4;
                long jMax = java.lang.Math.max(this.i, jO2 - ((long) java.lang.Math.min(this.e, i5)));
                if (i == 0 && jMax < j7) {
                    java.lang.Object[] objArr2 = this.h;
                    objArr2.getClass();
                    if (dev.epro.r0.S10823041268949770285.t(objArr2[((int) jMax) & (objArr2.length - 1)], d14731132657808549702)) {
                        jO2 += j2;
                        jMax += j2;
                    }
                }
                t(jMax, j9, jO2, j7);
                j();
                return r4833348786910499294Arr.length == 0 ? r4833348786910499294Arr : n(r4833348786910499294Arr);
            }
        }
        return r4833348786910499294Arr3;
    }
}
