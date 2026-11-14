package dev.epro.r0;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A986668957555509901 {
    public final int a;
    public final B13729205492206812220 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final D6544101850911802081[] f;
    public final P5507001969519445237 g;
    public final N11678082982039175888 h;

    public A986668957555509901(int i, B13729205492206812220 b13729205492206812220) {
        this.a = i;
        this.b = b13729205492206812220;
        this.f = new D6544101850911802081[i];
        int i2 = Y10566681300840353022.a;
        this.g = new P5507001969519445237(i);
        this.h = new N11678082982039175888(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(dev.epro.r0.K14749510448791472029 r7) {
        /*
            r6 = this;
            dev.epro.r0.N11678082982039175888 r0 = r6.h
            boolean r1 = r7 instanceof dev.epro.r0.R12699930309109797623
            if (r1 == 0) goto L15
            r1 = r7
            dev.epro.r0.R12699930309109797623 r1 = (dev.epro.r0.R12699930309109797623) r1
            int r2 = r1.v
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.v = r2
            goto L1a
        L15:
            dev.epro.r0.R12699930309109797623 r1 = new dev.epro.r0.R12699930309109797623
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.t
            int r2 = r1.v
            r3 = 0
            dev.epro.r0.P5507001969519445237 r4 = r6.g
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L2a
            dev.epro.r0.E17665849472693074628.k(r7)
            goto L3e
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L30:
            dev.epro.r0.E17665849472693074628.k(r7)
            r1.v = r5
            java.lang.Object r7 = r4.a(r1)
            dev.epro.r0.Z3437138737604933638 r1 = dev.epro.r0.Z3437138737604933638.a
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.util.concurrent.locks.ReentrantLock r7 = r6.c     // Catch: java.lang.Throwable -> L78
            r7.lock()     // Catch: java.lang.Throwable -> L78
            boolean r1 = r6.e     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L6e
            int r1 = r6.d     // Catch: java.lang.Throwable -> L7a
            int r2 = r6.a     // Catch: java.lang.Throwable -> L7a
            if (r1 < r2) goto L54
            goto L6e
        L54:
            dev.epro.r0.D6544101850911802081 r1 = new dev.epro.r0.D6544101850911802081     // Catch: java.lang.Throwable -> L7a
            dev.epro.r0.B13729205492206812220 r2 = r6.b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L7a
            androidx.sqlite.SQLiteConnection r2 = (androidx.sqlite.SQLiteConnection) r2     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            dev.epro.r0.D6544101850911802081[] r2 = r6.f     // Catch: java.lang.Throwable -> L7a
            int r3 = r6.d     // Catch: java.lang.Throwable -> L7a
            int r5 = r3 + 1
            r6.d = r5     // Catch: java.lang.Throwable -> L7a
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7a
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.Object r6 = r0.removeLast()     // Catch: java.lang.Throwable -> L7a
            dev.epro.r0.D6544101850911802081 r6 = (dev.epro.r0.D6544101850911802081) r6     // Catch: java.lang.Throwable -> L7a
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            return r6
        L78:
            r6 = move-exception
            goto L88
        L7a:
            r6 = move-exception
            goto L84
        L7c:
            java.lang.String r6 = "Connection pool is closed"
            r0 = 21
            dev.epro.r0.S12227320117525376577.w(r0, r6)     // Catch: java.lang.Throwable -> L7a
            throw r3     // Catch: java.lang.Throwable -> L7a
        L84:
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            throw r6     // Catch: java.lang.Throwable -> L78
        L88:
            r4.e()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A986668957555509901.a(dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:14|50|48|29|(0)(0)|38|19|44|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r10 = r10;
        r9 = r9;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069 A[Catch: all -> 0x006d, TryCatch #2 {all -> 0x006d, blocks: (B:29:0x0065, B:31:0x0069, B:35:0x0071, B:39:0x0078), top: B:48:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0054 -> B:25:0x0056). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r7, dev.epro.r0.C1514843729018108890 r9, dev.epro.r0.K14749510448791472029 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof dev.epro.r0.D9610737989634590279
            if (r0 == 0) goto L13
            r0 = r10
            dev.epro.r0.D9610737989634590279 r0 = (dev.epro.r0.D9610737989634590279) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            dev.epro.r0.D9610737989634590279 r0 = new dev.epro.r0.D9610737989634590279
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.w
            int r1 = r0.y
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r7 = r0.t
            dev.epro.r0.A7209497065939201693 r9 = r0.v
            dev.epro.r0.B13729205492206812220 r1 = r0.u
            dev.epro.r0.E17665849472693074628.k(r10)     // Catch: java.lang.Throwable -> L2c
            goto L56
        L2c:
            r10 = move-exception
            goto L60
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r6)
            return r3
        L34:
            dev.epro.r0.E17665849472693074628.k(r10)
        L37:
            dev.epro.r0.A7209497065939201693 r10 = new dev.epro.r0.A7209497065939201693
            r10.<init>()
            dev.epro.r0.C288342651169725874 r1 = new dev.epro.r0.C288342651169725874     // Catch: java.lang.Throwable -> L5b
            r4 = 15
            r1.<init>(r10, r6, r3, r4)     // Catch: java.lang.Throwable -> L5b
            r0.u = r9     // Catch: java.lang.Throwable -> L5b
            r0.v = r10     // Catch: java.lang.Throwable -> L5b
            r0.t = r7     // Catch: java.lang.Throwable -> L5b
            r0.y = r2     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = dev.epro.r0.V16504496955554646429.r(r7, r1, r0)     // Catch: java.lang.Throwable -> L5b
            dev.epro.r0.Z3437138737604933638 r4 = dev.epro.r0.Z3437138737604933638.a
            if (r1 != r4) goto L54
            return r4
        L54:
            r1 = r9
            r9 = r10
        L56:
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r3
            goto L65
        L5b:
            r1 = move-exception
            r5 = r1
            r1 = r9
            r9 = r10
            r10 = r5
        L60:
            r5 = r10
            r10 = r9
            r9 = r1
            r1 = r0
            r0 = r5
        L65:
            boolean r4 = r0 instanceof dev.epro.r0.P2480554073835519965     // Catch: java.lang.Throwable -> L6d
            if (r4 == 0) goto L6f
            r9.invoke()     // Catch: java.lang.Throwable -> L6d
            goto L76
        L6d:
            r7 = move-exception
            goto L79
        L6f:
            if (r0 != 0) goto L78
            java.lang.Object r10 = r10.a     // Catch: java.lang.Throwable -> L6d
            if (r10 == 0) goto L76
            return r10
        L76:
            r0 = r1
            goto L37
        L78:
            throw r0     // Catch: java.lang.Throwable -> L6d
        L79:
            java.lang.Object r8 = r10.a
            dev.epro.r0.D6544101850911802081 r8 = (dev.epro.r0.D6544101850911802081) r8
            if (r8 == 0) goto L82
            r6.e(r8)
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.A986668957555509901.b(long, dev.epro.r0.C1514843729018108890, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (D6544101850911802081 d6544101850911802081 : this.f) {
                if (d6544101850911802081 != null) {
                    d6544101850911802081.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        N11678082982039175888 n11678082982039175888 = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            G9506192477171422664 g9506192477171422664F = K5751602218013079365.F();
            int i = n11678082982039175888.c;
            for (int i2 = 0; i2 < i; i2++) {
                g9506192477171422664F.add(n11678082982039175888.get(i2));
            }
            G9506192477171422664 g9506192477171422664V = K5751602218013079365.v(g9506192477171422664F);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(T5284056093300834442.a.getIntVolatile(this.g, Q10607868841417046693.f), 0) + ", ");
            sb.append("queue=(size=" + g9506192477171422664V.a() + ")[" + R9411874267597469228.J0(g9506192477171422664V, null, null, null, 0, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            D6544101850911802081[] d6544101850911802081Arr = this.f;
            int length = d6544101850911802081Arr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                D6544101850911802081 d6544101850911802081 = d6544101850911802081Arr[i4];
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                sb2.append(d6544101850911802081 != null ? d6544101850911802081.a.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (d6544101850911802081 != null) {
                    d6544101850911802081.d(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(D6544101850911802081 d6544101850911802081) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(d6544101850911802081);
            reentrantLock.unlock();
            this.g.e();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
