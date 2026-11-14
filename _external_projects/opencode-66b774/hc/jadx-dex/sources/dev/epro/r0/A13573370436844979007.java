package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A13573370436844979007 implements java.io.Closeable {
    public static final dev.epro.r0.P15116306960523597113 z;
    public final dev.epro.r0.P2679692661144251490 a;
    public final java.util.LinkedHashMap b = new java.util.LinkedHashMap();
    public final java.lang.String c;
    public int d;
    public int e;
    public boolean f;
    public final dev.epro.r0.M10634075818626712574 g;
    public final dev.epro.r0.Z9658010704151025794 h;
    public final dev.epro.r0.Z9658010704151025794 i;
    public final dev.epro.r0.Z9658010704151025794 j;
    public final dev.epro.r0.P2382941533350862833 k;
    public long l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f150o;
    public final dev.epro.r0.R7318511160048941271 p;
    public final dev.epro.r0.P15116306960523597113 q;
    public dev.epro.r0.P15116306960523597113 r;
    public final dev.epro.r0.Y17131958419000606632 s;
    public long t;
    public long u;
    public final dev.epro.r0.Q7316561721656982910 v;
    public final dev.epro.r0.R13387896995173874905 w;
    public final dev.epro.r0.Q9103558464140585130 x;
    public final java.util.LinkedHashSet y;

    static {
        dev.epro.r0.P15116306960523597113 p15116306960523597113 = new dev.epro.r0.P15116306960523597113();
        p15116306960523597113.b(4, 65535);
        p15116306960523597113.b(5, 16384);
        z = p15116306960523597113;
    }

    public A13573370436844979007(dev.epro.r0.I1581330382723795749 i1581330382723795749) {
        this.a = (dev.epro.r0.P2679692661144251490) i1581330382723795749.d;
        java.lang.String str = (java.lang.String) i1581330382723795749.c;
        if (str == null) {
            dev.epro.r0.S10823041268949770285.b0("connectionName");
            throw null;
        }
        this.c = str;
        this.e = 3;
        dev.epro.r0.M10634075818626712574 m10634075818626712574 = (dev.epro.r0.M10634075818626712574) i1581330382723795749.a;
        this.g = m10634075818626712574;
        this.h = m10634075818626712574.d();
        this.i = m10634075818626712574.d();
        this.j = m10634075818626712574.d();
        this.k = dev.epro.r0.P2382941533350862833.s;
        this.p = (dev.epro.r0.R7318511160048941271) i1581330382723795749.e;
        dev.epro.r0.P15116306960523597113 p15116306960523597113 = new dev.epro.r0.P15116306960523597113();
        p15116306960523597113.b(4, 16777216);
        this.q = p15116306960523597113;
        this.r = z;
        this.s = new dev.epro.r0.Y17131958419000606632(0);
        this.u = r0.a();
        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = (dev.epro.r0.Q7316561721656982910) i1581330382723795749.b;
        if (q7316561721656982910 == null) {
            dev.epro.r0.S10823041268949770285.b0("socket");
            throw null;
        }
        this.v = q7316561721656982910;
        this.w = new dev.epro.r0.R13387896995173874905((dev.epro.r0.L673873344574563461) q7316561721656982910.d);
        this.x = new dev.epro.r0.Q9103558464140585130(this, new dev.epro.r0.M15575253401561633137((dev.epro.r0.T13344602445187831655) q7316561721656982910.c));
        this.y = new java.util.LinkedHashSet();
    }

    public final void b(dev.epro.r0.N10274084507843431211 n10274084507843431211, dev.epro.r0.N10274084507843431211 n102740845078434312112, java.io.IOException iOException) {
        int i;
        java.lang.Object[] array;
        java.util.TimeZone timeZone = dev.epro.r0.C14766148968941961570.a;
        try {
            e(n10274084507843431211);
        } catch (java.io.IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                array = null;
            } else {
                array = this.b.values().toArray(new dev.epro.r0.W10382756971622296125[0]);
                this.b.clear();
            }
        }
        dev.epro.r0.W10382756971622296125[] w10382756971622296125Arr = (dev.epro.r0.W10382756971622296125[]) array;
        if (w10382756971622296125Arr != null) {
            for (dev.epro.r0.W10382756971622296125 w10382756971622296125 : w10382756971622296125Arr) {
                try {
                    w10382756971622296125.d(n102740845078434312112, iOException);
                } catch (java.io.IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (java.io.IOException unused3) {
        }
        try {
            ((java.net.Socket) ((dev.epro.r0.J15730374346044043770) this.v.b).c).close();
        } catch (java.io.IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.j.e();
    }

    public final dev.epro.r0.W10382756971622296125 c(int i) {
        dev.epro.r0.W10382756971622296125 w10382756971622296125;
        synchronized (this) {
            w10382756971622296125 = (dev.epro.r0.W10382756971622296125) this.b.get(java.lang.Integer.valueOf(i));
        }
        return w10382756971622296125;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(dev.epro.r0.N10274084507843431211.c, dev.epro.r0.N10274084507843431211.h, null);
    }

    public final dev.epro.r0.W10382756971622296125 d(int i) {
        dev.epro.r0.W10382756971622296125 w10382756971622296125;
        synchronized (this) {
            w10382756971622296125 = (dev.epro.r0.W10382756971622296125) this.b.remove(java.lang.Integer.valueOf(i));
            notifyAll();
        }
        return w10382756971622296125;
    }

    public final void e(dev.epro.r0.N10274084507843431211 n10274084507843431211) {
        synchronized (this.w) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.w.e(this.d, n10274084507843431211, dev.epro.r0.L14928198200995638215.a);
            }
        }
    }

    public final void g(long j) {
        synchronized (this) {
            try {
                dev.epro.r0.Y17131958419000606632.b(this.s, j, 0L, 2);
                long jA = this.s.a();
                if (jA >= this.q.a() / 2) {
                    o(0, jA);
                    dev.epro.r0.Y17131958419000606632.b(this.s, 0L, jA, 1);
                }
                dev.epro.r0.R7318511160048941271 r7318511160048941271 = this.p;
                dev.epro.r0.Y17131958419000606632 y17131958419000606632 = this.s;
                r7318511160048941271.getClass();
                y17131958419000606632.getClass();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.w.c);
        r6 = r2;
        r8.t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r9, boolean r10, dev.epro.r0.P5176232750190581838 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            dev.epro.r0.R13387896995173874905 r8 = r8.w
            r8.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.t     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.u     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.b     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            dev.epro.r0.R13387896995173874905 r4 = r8.w     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.c     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.t     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.t = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            dev.epro.r0.R13387896995173874905 r4 = r8.w
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A13573370436844979007.h(int, boolean, dev.epro.r0.P5176232750190581838, long):void");
    }

    public final void j(int i, dev.epro.r0.N10274084507843431211 n10274084507843431211) {
        dev.epro.r0.Z9658010704151025794.b(this.h, this.c + '[' + i + "] writeSynReset", new dev.epro.r0.E9001670793930373504(this, i, n10274084507843431211, (byte) 2));
    }

    public final void o(int i, long j) {
        dev.epro.r0.Z9658010704151025794.b(this.h, this.c + '[' + i + "] windowUpdate", new dev.epro.r0.R17222082950977507403(this, i, j));
    }
}
