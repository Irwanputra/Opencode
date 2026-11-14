package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class U5234994727412699525 {
    public final long a;
    public final U2691514441685065476 b;
    public final U2691514441685065476 c;
    public final U2691514441685065476 d;
    public final N18033783269298797248 e;
    public Q17957571128037780363 g;
    public final U5234994727412699525 f = this;
    public int h = -1;

    public U5234994727412699525(long j, U2691514441685065476 u2691514441685065476, U2691514441685065476 u26915144416850654762, U2691514441685065476 u26915144416850654763, T14340690021504685682 t14340690021504685682) {
        this.a = j;
        this.b = u2691514441685065476;
        this.c = u26915144416850654762;
        this.d = u26915144416850654763;
        this.e = t14340690021504685682;
    }

    public final long a(V5656221289452463152 v5656221289452463152, boolean z) {
        Q17957571128037780363 q17957571128037780363;
        Z6884774333691094167 z6884774333691094167 = v5656221289452463152.b;
        Z6884774333691094167 z68847743336910941672 = v5656221289452463152.a;
        long j = this.a;
        if (z && z68847743336910941672.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && z6884774333691094167.c != j) || c() == null || (q17957571128037780363 = (Q17957571128037780363) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return E17665849472693074628.e(q17957571128037780363, W7808703833045379622.q(z ? z68847743336910941672.b : z6884774333691094167.b, 0, b(q17957571128037780363)), z, v5656221289452463152.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(dev.epro.r0.Q17957571128037780363 r10) {
        /*
            r9 = this;
            dev.epro.r0.U5234994727412699525 r0 = r9.f
            monitor-enter(r0)
            dev.epro.r0.Q17957571128037780363 r1 = r9.g     // Catch: java.lang.Throwable -> L4d
            if (r1 == r10) goto L62
            dev.epro.r0.V11538895333762958192 r1 = r10.b     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r1.c     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 1
            if (r2 != 0) goto L22
            long r7 = r10.c     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4d
            float r8 = r1.e     // Catch: java.lang.Throwable -> L4d
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L20
            goto L22
        L20:
            r7 = r3
            goto L23
        L22:
            r7 = r6
        L23:
            if (r7 == 0) goto L54
            if (r2 == 0) goto L28
            goto L54
        L28:
            long r7 = r10.c     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r2 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.e(r2)     // Catch: java.lang.Throwable -> L4d
            dev.epro.r0.V11538895333762958192 r2 = r10.b     // Catch: java.lang.Throwable -> L4d
            int r2 = r2.f     // Catch: java.lang.Throwable -> L4d
            int r2 = r2 - r6
            if (r1 <= r2) goto L39
            r1 = r2
        L39:
            if (r1 < 0) goto L4f
            dev.epro.r0.V11538895333762958192 r2 = r10.b     // Catch: java.lang.Throwable -> L4d
            float r2 = r2.f(r1)     // Catch: java.lang.Throwable -> L4d
            long r7 = r10.c     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4d
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L4f
            int r1 = r1 + (-1)
            goto L39
        L4d:
            r9 = move-exception
            goto L66
        L4f:
            if (r1 >= 0) goto L52
            goto L58
        L52:
            r3 = r1
            goto L58
        L54:
            int r1 = r1.f     // Catch: java.lang.Throwable -> L4d
            int r3 = r1 + (-1)
        L58:
            dev.epro.r0.V11538895333762958192 r1 = r10.b     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.c(r3, r6)     // Catch: java.lang.Throwable -> L4d
            r9.h = r1     // Catch: java.lang.Throwable -> L4d
            r9.g = r10     // Catch: java.lang.Throwable -> L4d
        L62:
            int r9 = r9.h     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            return r9
        L66:
            monitor-exit(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U5234994727412699525.b(dev.epro.r0.Q17957571128037780363):int");
    }

    public final B1029012102904255937 c() {
        B1029012102904255937 b1029012102904255937 = (B1029012102904255937) this.b.invoke();
        if (b1029012102904255937 == null || !b1029012102904255937.C()) {
            return null;
        }
        return b1029012102904255937;
    }

    public final V5656221289452463152 d() {
        Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) this.c.invoke();
        if (q17957571128037780363 == null) {
            return null;
        }
        int length = q17957571128037780363.a.a.b.length();
        O16392062884302746898 a = q17957571128037780363.a(0);
        long j = this.a;
        return new V5656221289452463152(new Z6884774333691094167(a, 0, j), new Z6884774333691094167(q17957571128037780363.a(Math.max(length - 1, 0)), length, j), false);
    }

    public final M11181104712105445833 e() {
        Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) this.c.invoke();
        return q17957571128037780363 == null ? new M11181104712105445833("") : q17957571128037780363.a.a;
    }
}
