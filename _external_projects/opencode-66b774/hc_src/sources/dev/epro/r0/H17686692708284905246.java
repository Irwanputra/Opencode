package dev.epro.r0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class H17686692708284905246 implements E5386183571211952538 {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(H17686692708284905246.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicReferenceFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    public static final /* synthetic */ long i;
    public static final /* synthetic */ long j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public static final /* synthetic */ long m;
    public static final /* synthetic */ long n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ long f269o;
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        f269o = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("sendersAndCloseStatus$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(H17686692708284905246.class, "receivers$volatile");
        m = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("receivers$volatile"));
        d = AtomicLongFieldUpdater.newUpdater(H17686692708284905246.class, "bufferEnd$volatile");
        h = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("bufferEnd$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(H17686692708284905246.class, "completedExpandBuffersAndPauseFlag$volatile");
        k = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("completedExpandBuffersAndPauseFlag$volatile"));
        n = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("sendSegment$volatile"));
        f = AtomicReferenceFieldUpdater.newUpdater(H17686692708284905246.class, Object.class, "receiveSegment$volatile");
        l = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("receiveSegment$volatile"));
        i = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("bufferEndSegment$volatile"));
        g = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("_closeCause$volatile"));
        j = unsafe.objectFieldOffset(H17686692708284905246.class.getDeclaredField("closeHandler$volatile"));
    }

    public H17686692708284905246(int i2) {
        this.a = i2;
        if (i2 < 0) {
            S10973172697741180971.i(G6547577305291411977.o(i2, "Invalid channel capacity: ", ", should be >=0"));
            throw null;
        }
        E7893495821728651450 e7893495821728651450 = J11102083402305026174.a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = o();
        E7893495821728651450 e78934958217286514502 = new E7893495821728651450(0L, null, this, 3);
        this.sendSegment$volatile = e78934958217286514502;
        this.receiveSegment$volatile = e78934958217286514502;
        if (C()) {
            e78934958217286514502 = J11102083402305026174.a;
            e78934958217286514502.getClass();
        }
        this.bufferEndSegment$volatile = e78934958217286514502;
        this._closeCause$volatile = J11102083402305026174.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object G(dev.epro.r0.H17686692708284905246 r13, dev.epro.r0.K14749510448791472029 r14) {
        /*
            boolean r0 = r14 instanceof dev.epro.r0.O15325915191532773338
            if (r0 == 0) goto L14
            r0 = r14
            dev.epro.r0.O15325915191532773338 r0 = (dev.epro.r0.O15325915191532773338) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.v = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            dev.epro.r0.O15325915191532773338 r0 = new dev.epro.r0.O15325915191532773338
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.t
            int r0 = r6.v
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2c
            dev.epro.r0.E17665849472693074628.k(r14)
            dev.epro.r0.M7349931961628075932 r14 = (dev.epro.r0.M7349931961628075932) r14
            java.lang.Object r13 = r14.a
            return r13
        L2c:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            dev.epro.r0.S10973172697741180971.m(r13)
            return r1
        L32:
            dev.epro.r0.E17665849472693074628.k(r14)
            sun.misc.Unsafe r14 = dev.epro.r0.T5284056093300834442.a
            long r3 = dev.epro.r0.H17686692708284905246.l
            java.lang.Object r14 = r14.getObjectVolatile(r13, r3)
            dev.epro.r0.E7893495821728651450 r14 = (dev.epro.r0.E7893495821728651450) r14
        L3f:
            boolean r0 = r13.z()
            if (r0 == 0) goto L4f
            java.lang.Throwable r13 = r13.p()
            dev.epro.r0.I12241705932167711945 r14 = new dev.epro.r0.I12241705932167711945
            r14.<init>(r13)
            return r14
        L4f:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = dev.epro.r0.H17686692708284905246.c
            long r4 = r0.getAndIncrement(r13)
            int r0 = dev.epro.r0.J11102083402305026174.b
            long r7 = (long) r0
            long r9 = r4 / r7
            long r7 = r4 % r7
            int r3 = (int) r7
            long r7 = r14.d
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 == 0) goto L6c
            dev.epro.r0.E7893495821728651450 r0 = r13.j(r9, r14)
            if (r0 != 0) goto L6a
            goto L3f
        L6a:
            r8 = r0
            goto L6d
        L6c:
            r8 = r14
        L6d:
            r12 = 0
            r7 = r13
            r9 = r3
            r10 = r4
            java.lang.Object r13 = r7.M(r8, r9, r10, r12)
            dev.epro.r0.D14731132657808549702 r14 = dev.epro.r0.J11102083402305026174.m
            if (r13 == r14) goto La1
            dev.epro.r0.D14731132657808549702 r14 = dev.epro.r0.J11102083402305026174.f301o
            if (r13 != r14) goto L8b
            long r13 = r7.v()
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 >= 0) goto L88
            r8.a()
        L88:
            r13 = r7
            r14 = r8
            goto L3f
        L8b:
            dev.epro.r0.D14731132657808549702 r14 = dev.epro.r0.J11102083402305026174.n
            if (r13 != r14) goto L9d
            r6.v = r2
            r1 = r7
            r2 = r8
            java.lang.Object r13 = r1.H(r2, r3, r4, r6)
            dev.epro.r0.Z3437138737604933638 r14 = dev.epro.r0.Z3437138737604933638.a
            if (r13 != r14) goto L9c
            return r14
        L9c:
            return r13
        L9d:
            r8.a()
            return r13
        La1:
            java.lang.String r13 = "unexpected"
            dev.epro.r0.S10973172697741180971.m(r13)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H17686692708284905246.G(dev.epro.r0.H17686692708284905246, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final boolean A() {
        return y(T5284056093300834442.a.getLongVolatile(this, f269o), false);
    }

    public boolean B() {
        return false;
    }

    public final boolean C() {
        long o2 = o();
        return o2 == 0 || o2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r5.f() == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r5.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(long r7, dev.epro.r0.E7893495821728651450 r9) {
        /*
            r6 = this;
        L0:
            long r0 = r9.d
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L11
            dev.epro.r0.M2655555874565458115 r0 = r9.c()
            dev.epro.r0.E7893495821728651450 r0 = (dev.epro.r0.E7893495821728651450) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r9 = r0
            goto L0
        L11:
            r5 = r9
        L12:
            boolean r7 = r5.d()
            if (r7 == 0) goto L23
            dev.epro.r0.M2655555874565458115 r7 = r5.c()
            dev.epro.r0.E7893495821728651450 r7 = (dev.epro.r0.E7893495821728651450) r7
            if (r7 != 0) goto L21
            goto L23
        L21:
            r5 = r7
            goto L12
        L23:
            sun.misc.Unsafe r7 = dev.epro.r0.T5284056093300834442.a
            long r8 = dev.epro.r0.H17686692708284905246.i
            java.lang.Object r7 = r7.getObjectVolatile(r6, r8)
            r4 = r7
            dev.epro.r0.X17453750288186724334 r4 = (dev.epro.r0.X17453750288186724334) r4
            long r0 = r4.d
            long r2 = r5.d
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L37
            goto L53
        L37:
            boolean r7 = r5.j()
            if (r7 != 0) goto L3f
            r9 = r5
            goto L11
        L3f:
            sun.misc.Unsafe r0 = dev.epro.r0.T5284056093300834442.a
            long r2 = dev.epro.r0.H17686692708284905246.i
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L54
            boolean r6 = r4.f()
            if (r6 == 0) goto L53
            r4.e()
        L53:
            return
        L54:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r8)
            if (r6 == r4) goto L65
            boolean r6 = r5.f()
            if (r6 == 0) goto L63
            r5.e()
        L63:
            r6 = r1
            goto L23
        L65:
            r6 = r1
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H17686692708284905246.D(long, dev.epro.r0.E7893495821728651450):void");
    }

    public final Object E(R4833348786910499294 r4833348786910499294, Object obj) {
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r4833348786910499294));
        h7219028874700587498.t();
        h7219028874700587498.resumeWith(new C10696704014433963524(u()));
        Object r = h7219028874700587498.r();
        return r == Z3437138737604933638.a ? r : O9245300239821758723.a;
    }

    public final void F(Object obj, H7219028874700587498 h7219028874700587498) {
        h7219028874700587498.resumeWith(new C10696704014433963524(u()));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(dev.epro.r0.E7893495821728651450 r10, int r11, long r12, dev.epro.r0.K14749510448791472029 r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H17686692708284905246.H(dev.epro.r0.E7893495821728651450, int, long, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public final void I(O3606826322388932410 o3606826322388932410) {
        E7893495821728651450 e7893495821728651450;
        H17686692708284905246 h17686692708284905246;
        O3606826322388932410 o36068263223889324102;
        int i2;
        E7893495821728651450 e78934958217286514502 = (E7893495821728651450) T5284056093300834442.a.getObjectVolatile(this, l);
        while (!this.z()) {
            long andIncrement = c.getAndIncrement(this);
            long j2 = J11102083402305026174.b;
            long j3 = andIncrement / j2;
            int i3 = (int) (andIncrement % j2);
            if (e78934958217286514502.d != j3) {
                E7893495821728651450 j4 = this.j(j3, e78934958217286514502);
                if (j4 == null) {
                    continue;
                } else {
                    e7893495821728651450 = j4;
                    o36068263223889324102 = o3606826322388932410;
                    i2 = i3;
                    h17686692708284905246 = this;
                }
            } else {
                e7893495821728651450 = e78934958217286514502;
                h17686692708284905246 = this;
                o36068263223889324102 = o3606826322388932410;
                i2 = i3;
            }
            Object M = h17686692708284905246.M(e7893495821728651450, i2, andIncrement, o36068263223889324102);
            e78934958217286514502 = e7893495821728651450;
            if (M == J11102083402305026174.m) {
                O3606826322388932410 o36068263223889324103 = o36068263223889324102 != null ? o36068263223889324102 : null;
                if (o36068263223889324103 != null) {
                    o36068263223889324103.c = e78934958217286514502;
                    o36068263223889324103.d = i2;
                    return;
                }
                return;
            }
            if (M != J11102083402305026174.f301o) {
                if (M == J11102083402305026174.n) {
                    S10973172697741180971.m("unexpected");
                    return;
                } else {
                    e78934958217286514502.a();
                    o36068263223889324102.e = M;
                    return;
                }
            }
            if (andIncrement < h17686692708284905246.v()) {
                e78934958217286514502.a();
            }
            this = h17686692708284905246;
            o3606826322388932410 = o36068263223889324102;
        }
        o3606826322388932410.e = J11102083402305026174.l;
    }

    public final void J(J1083986568308928281 j1083986568308928281, boolean z) {
        if (j1083986568308928281 instanceof U15014152283416496379) {
            ((R4833348786910499294) j1083986568308928281).resumeWith(new C10696704014433963524(z ? s() : u()));
            return;
        }
        if (j1083986568308928281 instanceof Y214411975162163635) {
            ((Y214411975162163635) j1083986568308928281).a.resumeWith(new M7349931961628075932(new I12241705932167711945(p())));
            return;
        }
        if (!(j1083986568308928281 instanceof F8228714002503597451)) {
            if (j1083986568308928281 instanceof O3606826322388932410) {
                ((O3606826322388932410) j1083986568308928281).i(this, J11102083402305026174.l);
                return;
            } else {
                Q11088980322693754445.i("Unexpected waiter: ", j1083986568308928281);
                return;
            }
        }
        F8228714002503597451 f8228714002503597451 = (F8228714002503597451) j1083986568308928281;
        H7219028874700587498 h7219028874700587498 = f8228714002503597451.b;
        h7219028874700587498.getClass();
        f8228714002503597451.b = null;
        f8228714002503597451.a = J11102083402305026174.l;
        Throwable p = f8228714002503597451.c.p();
        if (p == null) {
            h7219028874700587498.resumeWith(Boolean.FALSE);
        } else {
            h7219028874700587498.resumeWith(new C10696704014433963524(p));
        }
    }

    public final boolean K(Object obj, Object obj2) {
        if (obj instanceof O3606826322388932410) {
            return ((O3606826322388932410) obj).i(this, obj2) == 0;
        }
        if (obj instanceof Y214411975162163635) {
            H7219028874700587498 h7219028874700587498 = ((Y214411975162163635) obj).a;
            M7349931961628075932 m7349931961628075932 = new M7349931961628075932(obj2);
            E7893495821728651450 e7893495821728651450 = J11102083402305026174.a;
            D14731132657808549702 f2 = h7219028874700587498.f(m7349931961628075932, null);
            if (f2 == null) {
                return false;
            }
            h7219028874700587498.x(f2);
            return true;
        }
        if (!(obj instanceof F8228714002503597451)) {
            if (!(obj instanceof U15014152283416496379)) {
                Q11088980322693754445.i("Unexpected receiver type: ", obj);
                return false;
            }
            U15014152283416496379 u15014152283416496379 = (U15014152283416496379) obj;
            E7893495821728651450 e78934958217286514502 = J11102083402305026174.a;
            D14731132657808549702 f3 = u15014152283416496379.f(obj2, null);
            if (f3 == null) {
                return false;
            }
            u15014152283416496379.x(f3);
            return true;
        }
        F8228714002503597451 f8228714002503597451 = (F8228714002503597451) obj;
        H7219028874700587498 h72190288747005874982 = f8228714002503597451.b;
        h72190288747005874982.getClass();
        f8228714002503597451.b = null;
        f8228714002503597451.a = obj2;
        Boolean bool = Boolean.TRUE;
        f8228714002503597451.c.getClass();
        E7893495821728651450 e78934958217286514503 = J11102083402305026174.a;
        D14731132657808549702 f4 = h72190288747005874982.f(bool, null);
        if (f4 == null) {
            return false;
        }
        h72190288747005874982.x(f4);
        return true;
    }

    public final boolean L(Object obj, E7893495821728651450 e7893495821728651450, int i2) {
        H6489656497550648393 h6489656497550648393;
        boolean z = obj instanceof U15014152283416496379;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        if (z) {
            U15014152283416496379 u15014152283416496379 = (U15014152283416496379) obj;
            E7893495821728651450 e78934958217286514502 = J11102083402305026174.a;
            D14731132657808549702 f2 = u15014152283416496379.f(o9245300239821758723, null);
            if (f2 == null) {
                return false;
            }
            u15014152283416496379.x(f2);
            return true;
        }
        if (!(obj instanceof O3606826322388932410)) {
            Q11088980322693754445.i("Unexpected waiter: ", obj);
            return false;
        }
        int i3 = ((O3606826322388932410) obj).i(this, o9245300239821758723);
        H6489656497550648393 h64896564975506483932 = H6489656497550648393.a;
        H6489656497550648393 h64896564975506483933 = H6489656497550648393.b;
        if (i3 == 0) {
            h6489656497550648393 = h64896564975506483932;
        } else if (i3 == 1) {
            h6489656497550648393 = h64896564975506483933;
        } else if (i3 == 2) {
            h6489656497550648393 = H6489656497550648393.c;
        } else {
            if (i3 != 3) {
                D11988991656201568495.h(i3, "Unexpected internal result: ");
                return false;
            }
            h6489656497550648393 = H6489656497550648393.d;
        }
        if (h6489656497550648393 == h64896564975506483933) {
            e7893495821728651450.n(i2, null);
        }
        return h6489656497550648393 == h64896564975506483932;
    }

    public final Object M(E7893495821728651450 e7893495821728651450, int i2, long j2, Object obj) {
        Object l2 = e7893495821728651450.l(i2);
        AtomicReferenceArray atomicReferenceArray = e7893495821728651450.h;
        long j3 = f269o;
        if (l2 == null) {
            if (j2 >= (T5284056093300834442.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                if (obj == null) {
                    return J11102083402305026174.n;
                }
                if (e7893495821728651450.k(i2, l2, obj)) {
                    h();
                    return J11102083402305026174.m;
                }
            }
        } else if (l2 == J11102083402305026174.d && e7893495821728651450.k(i2, l2, J11102083402305026174.i)) {
            h();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            e7893495821728651450.n(i2, null);
            return obj2;
        }
        while (true) {
            Object l3 = e7893495821728651450.l(i2);
            if (l3 == null || l3 == J11102083402305026174.e) {
                if (j2 < (T5284056093300834442.a.getLongVolatile(this, j3) & 1152921504606846975L)) {
                    if (e7893495821728651450.k(i2, l3, J11102083402305026174.h)) {
                        h();
                        return J11102083402305026174.f301o;
                    }
                } else {
                    if (obj == null) {
                        return J11102083402305026174.n;
                    }
                    if (e7893495821728651450.k(i2, l3, obj)) {
                        h();
                        return J11102083402305026174.m;
                    }
                }
            } else if (l3 != J11102083402305026174.d) {
                D14731132657808549702 d14731132657808549702 = J11102083402305026174.j;
                if (l3 == d14731132657808549702) {
                    return J11102083402305026174.f301o;
                }
                if (l3 == J11102083402305026174.h) {
                    return J11102083402305026174.f301o;
                }
                if (l3 == J11102083402305026174.l) {
                    h();
                    return J11102083402305026174.f301o;
                }
                if (l3 != J11102083402305026174.g && e7893495821728651450.k(i2, l3, J11102083402305026174.f)) {
                    boolean z = l3 instanceof G633373366446159924;
                    if (z) {
                        l3 = ((G633373366446159924) l3).a;
                    }
                    if (L(l3, e7893495821728651450, i2)) {
                        e7893495821728651450.o(i2, J11102083402305026174.i);
                        h();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        e7893495821728651450.n(i2, null);
                        return obj3;
                    }
                    e7893495821728651450.o(i2, d14731132657808549702);
                    e7893495821728651450.i();
                    if (z) {
                        h();
                    }
                    return J11102083402305026174.f301o;
                }
            } else if (e7893495821728651450.k(i2, l3, J11102083402305026174.i)) {
                h();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                e7893495821728651450.n(i2, null);
                return obj4;
            }
        }
    }

    public final int N(E7893495821728651450 e7893495821728651450, int i2, Object obj, long j2, Object obj2, boolean z) {
        e7893495821728651450.n(i2, obj);
        if (z) {
            return O(e7893495821728651450, i2, obj, j2, obj2, z);
        }
        Object l2 = e7893495821728651450.l(i2);
        if (l2 == null) {
            if (b(j2)) {
                if (e7893495821728651450.k(i2, null, J11102083402305026174.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (e7893495821728651450.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (l2 instanceof J1083986568308928281) {
            e7893495821728651450.n(i2, null);
            if (K(l2, obj)) {
                e7893495821728651450.o(i2, J11102083402305026174.i);
                return 0;
            }
            D14731132657808549702 d14731132657808549702 = J11102083402305026174.k;
            if (e7893495821728651450.h.getAndSet((i2 * 2) + 1, d14731132657808549702) == d14731132657808549702) {
                return 5;
            }
            e7893495821728651450.m(i2, true);
            return 5;
        }
        return O(e7893495821728651450, i2, obj, j2, obj2, z);
    }

    public final int O(E7893495821728651450 e7893495821728651450, int i2, Object obj, long j2, Object obj2, boolean z) {
        while (true) {
            Object l2 = e7893495821728651450.l(i2);
            if (l2 == null) {
                if (!b(j2) || z) {
                    if (z) {
                        if (e7893495821728651450.k(i2, null, J11102083402305026174.j)) {
                            e7893495821728651450.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (e7893495821728651450.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (e7893495821728651450.k(i2, null, J11102083402305026174.d)) {
                    break;
                }
            } else {
                if (l2 != J11102083402305026174.e) {
                    D14731132657808549702 d14731132657808549702 = J11102083402305026174.k;
                    if (l2 == d14731132657808549702) {
                        e7893495821728651450.n(i2, null);
                        return 5;
                    }
                    if (l2 == J11102083402305026174.h) {
                        e7893495821728651450.n(i2, null);
                        return 5;
                    }
                    if (l2 == J11102083402305026174.l) {
                        e7893495821728651450.n(i2, null);
                        A();
                        return 4;
                    }
                    e7893495821728651450.n(i2, null);
                    if (l2 instanceof G633373366446159924) {
                        l2 = ((G633373366446159924) l2).a;
                    }
                    if (K(l2, obj)) {
                        e7893495821728651450.o(i2, J11102083402305026174.i);
                        return 0;
                    }
                    if (e7893495821728651450.h.getAndSet((i2 * 2) + 1, d14731132657808549702) != d14731132657808549702) {
                        e7893495821728651450.m(i2, true);
                    }
                    return 5;
                }
                if (e7893495821728651450.k(i2, l2, J11102083402305026174.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void P(long j2) {
        H17686692708284905246 h17686692708284905246 = this;
        if (h17686692708284905246.C()) {
            return;
        }
        while (h17686692708284905246.o() <= j2) {
            h17686692708284905246 = this;
        }
        int i2 = J11102083402305026174.c;
        int i3 = 0;
        while (true) {
            long j3 = k;
            if (i3 < i2) {
                long o2 = h17686692708284905246.o();
                if (o2 == (T5284056093300834442.a.getLongVolatile(h17686692708284905246, j3) & 4611686018427387903L) && o2 == h17686692708284905246.o()) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    Unsafe unsafe = T5284056093300834442.a;
                    long longVolatile = unsafe.getLongVolatile(h17686692708284905246, j3);
                    if (unsafe.compareAndSwapLong(h17686692708284905246, k, longVolatile, 4611686018427387904L + (longVolatile & 4611686018427387903L))) {
                        break;
                    } else {
                        h17686692708284905246 = this;
                    }
                }
                while (true) {
                    long o3 = h17686692708284905246.o();
                    Unsafe unsafe2 = T5284056093300834442.a;
                    long longVolatile2 = unsafe2.getLongVolatile(h17686692708284905246, j3);
                    long j4 = longVolatile2 & 4611686018427387903L;
                    boolean z = (longVolatile2 & 4611686018427387904L) != 0;
                    if (o3 == j4 && o3 == h17686692708284905246.o()) {
                        break;
                    }
                    if (z) {
                        h17686692708284905246 = this;
                    } else {
                        h17686692708284905246 = this;
                        unsafe2.compareAndSwapLong(h17686692708284905246, k, longVolatile2, j4 + 4611686018427387904L);
                    }
                }
                while (true) {
                    Unsafe unsafe3 = T5284056093300834442.a;
                    long longVolatile3 = unsafe3.getLongVolatile(h17686692708284905246, j3);
                    if (unsafe3.compareAndSwapLong(h17686692708284905246, k, longVolatile3, longVolatile3 & 4611686018427387903L)) {
                        return;
                    } else {
                        h17686692708284905246 = this;
                    }
                }
            }
        }
    }

    @Override // dev.epro.r0.N13814068345032586384
    public Object a(Object obj) {
        H17686692708284905246 h17686692708284905246 = this;
        Unsafe unsafe = T5284056093300834442.a;
        long j2 = 1152921504606846975L;
        boolean z = h17686692708284905246.y(unsafe.getLongVolatile(h17686692708284905246, f269o), false) ? false : !h17686692708284905246.b(r2 & 1152921504606846975L);
        F15209282533750470613 f15209282533750470613 = M7349931961628075932.b;
        if (z) {
            return f15209282533750470613;
        }
        Object obj2 = J11102083402305026174.j;
        E7893495821728651450 e7893495821728651450 = (E7893495821728651450) unsafe.getObjectVolatile(h17686692708284905246, n);
        while (true) {
            long andIncrement = b.getAndIncrement(h17686692708284905246);
            long j3 = andIncrement & j2;
            boolean y = h17686692708284905246.y(andIncrement, false);
            int i2 = J11102083402305026174.b;
            long j4 = i2;
            long j5 = j3 / j4;
            int i3 = (int) (j3 % j4);
            if (e7893495821728651450.d != j5) {
                E7893495821728651450 k2 = h17686692708284905246.k(j5, e7893495821728651450);
                if (k2 != null) {
                    e7893495821728651450 = k2;
                } else {
                    if (y) {
                        return new I12241705932167711945(h17686692708284905246.u());
                    }
                    j2 = 1152921504606846975L;
                }
            }
            int N = h17686692708284905246.N(e7893495821728651450, i3, obj, j3, obj2, y);
            O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
            if (N == 0) {
                e7893495821728651450.a();
                return o9245300239821758723;
            }
            if (N == 1) {
                return o9245300239821758723;
            }
            if (N == 2) {
                if (y) {
                    e7893495821728651450.i();
                    return new I12241705932167711945(u());
                }
                J1083986568308928281 j1083986568308928281 = obj2 instanceof J1083986568308928281 ? (J1083986568308928281) obj2 : null;
                if (j1083986568308928281 != null) {
                    j1083986568308928281.a(e7893495821728651450, i3 + i2);
                }
                e7893495821728651450.i();
                return f15209282533750470613;
            }
            if (N == 3) {
                S10973172697741180971.m("unexpected");
                return null;
            }
            if (N == 4) {
                if (j3 < t()) {
                    e7893495821728651450.a();
                }
                return new I12241705932167711945(u());
            }
            if (N == 5) {
                e7893495821728651450.a();
            }
            j2 = 1152921504606846975L;
            h17686692708284905246 = this;
        }
    }

    public final boolean b(long j2) {
        return j2 < o() || j2 < t() + ((long) this.a);
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        e(cancellationException, true);
    }

    public final boolean d(Throwable th) {
        return e(th, false);
    }

    public final boolean e(Throwable th, boolean z) {
        boolean z2;
        Unsafe unsafe;
        long j2;
        long longVolatile;
        long j3;
        Object objectVolatile;
        Unsafe unsafe2;
        Unsafe unsafe3;
        long j4;
        long longVolatile2;
        H17686692708284905246 h17686692708284905246 = this;
        if (z) {
            while (true) {
                Unsafe unsafe4 = T5284056093300834442.a;
                long j5 = f269o;
                long longVolatile3 = unsafe4.getLongVolatile(h17686692708284905246, j5);
                if (((int) (longVolatile3 >> 60)) != 0) {
                    break;
                }
                E7893495821728651450 e7893495821728651450 = J11102083402305026174.a;
                if (unsafe4.compareAndSwapLong(h17686692708284905246, j5, longVolatile3, (longVolatile3 & 1152921504606846975L) + 1152921504606846976L)) {
                    break;
                }
                h17686692708284905246 = this;
            }
        }
        D14731132657808549702 d14731132657808549702 = J11102083402305026174.s;
        while (true) {
            Unsafe unsafe5 = T5284056093300834442.a;
            long j6 = g;
            if (unsafe5.compareAndSwapObject(this, j6, d14731132657808549702, th)) {
                z2 = true;
                break;
            }
            if (unsafe5.getObjectVolatile(this, j6) != d14731132657808549702) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                unsafe3 = T5284056093300834442.a;
                j4 = f269o;
                longVolatile2 = unsafe3.getLongVolatile(this, j4);
            } while (!unsafe3.compareAndSwapLong(this, j4, longVolatile2, (longVolatile2 & 1152921504606846975L) + 3458764513820540928L));
        } else {
            do {
                unsafe = T5284056093300834442.a;
                j2 = f269o;
                longVolatile = unsafe.getLongVolatile(this, j2);
                int i2 = (int) (longVolatile >> 60);
                if (i2 == 0) {
                    j3 = (longVolatile & 1152921504606846975L) + 2305843009213693952L;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = (longVolatile & 1152921504606846975L) + 3458764513820540928L;
                }
            } while (!unsafe.compareAndSwapLong(this, j2, longVolatile, j3));
        }
        A();
        if (z2) {
            loop3: while (true) {
                Unsafe unsafe6 = T5284056093300834442.a;
                long j7 = j;
                objectVolatile = unsafe6.getObjectVolatile(this, j7);
                D14731132657808549702 d147311326578085497022 = objectVolatile == null ? J11102083402305026174.q : J11102083402305026174.r;
                do {
                    unsafe2 = T5284056093300834442.a;
                    if (unsafe2.compareAndSwapObject(this, j, objectVolatile, d147311326578085497022)) {
                        break loop3;
                    }
                } while (unsafe2.getObjectVolatile(this, j7) == objectVolatile);
            }
            if (objectVolatile != null) {
                V12319504402545346730.s(1, objectVolatile);
                ((F4096073349764486348) objectVolatile).invoke(p());
                return z2;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        r0 = (dev.epro.r0.E7893495821728651450) ((dev.epro.r0.M2655555874565458115) dev.epro.r0.T5284056093300834442.a.getObjectVolatile(r0, dev.epro.r0.M2655555874565458115.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.E7893495821728651450 f(long r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H17686692708284905246.f(long):dev.epro.r0.E7893495821728651450");
    }

    public final void g(long j2) {
        E7893495821728651450 e7893495821728651450 = (E7893495821728651450) T5284056093300834442.a.getObjectVolatile(this, l);
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j3 = m;
            long longVolatile = unsafe.getLongVolatile(this, j3);
            if (j2 < Math.max(this.a + longVolatile, this.o())) {
                return;
            }
            H17686692708284905246 h17686692708284905246 = this;
            if (unsafe.compareAndSwapLong(h17686692708284905246, j3, longVolatile, 1 + longVolatile)) {
                long j4 = J11102083402305026174.b;
                long j5 = longVolatile / j4;
                int i2 = (int) (longVolatile % j4);
                if (e7893495821728651450.d != j5) {
                    E7893495821728651450 j6 = h17686692708284905246.j(j5, e7893495821728651450);
                    if (j6 != null) {
                        e7893495821728651450 = j6;
                    }
                }
                E7893495821728651450 e78934958217286514502 = e7893495821728651450;
                if (h17686692708284905246.M(e78934958217286514502, i2, longVolatile, null) != J11102083402305026174.f301o) {
                    e78934958217286514502.a();
                } else if (longVolatile < h17686692708284905246.v()) {
                    e78934958217286514502.a();
                }
                this = h17686692708284905246;
                e7893495821728651450 = e78934958217286514502;
            }
            this = h17686692708284905246;
        }
    }

    public final void h() {
        Object o2;
        Unsafe unsafe;
        if (C()) {
            return;
        }
        Unsafe unsafe2 = T5284056093300834442.a;
        long j2 = i;
        E7893495821728651450 e7893495821728651450 = (E7893495821728651450) unsafe2.getObjectVolatile(this, j2);
        loop0: while (true) {
            long andIncrement = d.getAndIncrement(this);
            long j3 = andIncrement / J11102083402305026174.b;
            if (v() <= andIncrement) {
                if (e7893495821728651450.d < j3 && e7893495821728651450.c() != null) {
                    D(j3, e7893495821728651450);
                }
                w(1L);
                return;
            }
            if (e7893495821728651450.d != j3) {
                K3176212305241750029 k3176212305241750029 = K3176212305241750029.h;
                while (true) {
                    o2 = O4077903568229246.o(e7893495821728651450, j3, k3176212305241750029);
                    if (!T3224757362656795885.i(o2)) {
                        X17453750288186724334 h2 = T3224757362656795885.h(o2);
                        while (true) {
                            X17453750288186724334 x17453750288186724334 = (X17453750288186724334) T5284056093300834442.a.getObjectVolatile(this, j2);
                            if (x17453750288186724334.d >= h2.d) {
                                break;
                            }
                            if (!h2.j()) {
                                break;
                            }
                            do {
                                unsafe = T5284056093300834442.a;
                                if (unsafe.compareAndSwapObject(this, i, x17453750288186724334, h2)) {
                                    if (x17453750288186724334.f()) {
                                        x17453750288186724334.e();
                                    }
                                }
                            } while (unsafe.getObjectVolatile(this, j2) == x17453750288186724334);
                            if (h2.f()) {
                                h2.e();
                            }
                        }
                    } else {
                        break;
                    }
                }
                E7893495821728651450 e78934958217286514502 = null;
                if (T3224757362656795885.i(o2)) {
                    A();
                    D(j3, e7893495821728651450);
                    w(1L);
                } else {
                    E7893495821728651450 e78934958217286514503 = (E7893495821728651450) T3224757362656795885.h(o2);
                    long j4 = e78934958217286514503.d;
                    if (j4 > j3) {
                        long j5 = J11102083402305026174.b * j4;
                        if (T5284056093300834442.a.compareAndSwapLong(this, h, 1 + andIncrement, j5)) {
                            w(j5 - andIncrement);
                        } else {
                            w(1L);
                        }
                    } else {
                        e78934958217286514502 = e78934958217286514503;
                    }
                }
                if (e78934958217286514502 == null) {
                    continue;
                } else {
                    e7893495821728651450 = e78934958217286514502;
                }
            }
            int i2 = (int) (andIncrement % J11102083402305026174.b);
            Object l2 = e7893495821728651450.l(i2);
            boolean z = l2 instanceof J1083986568308928281;
            long j6 = m;
            if (!z || andIncrement < T5284056093300834442.a.getLongVolatile(this, j6) || !e7893495821728651450.k(i2, l2, J11102083402305026174.g)) {
                while (true) {
                    Object l3 = e7893495821728651450.l(i2);
                    if (!(l3 instanceof J1083986568308928281)) {
                        if (l3 != J11102083402305026174.j) {
                            if (l3 != null) {
                                if (l3 == J11102083402305026174.d || l3 == J11102083402305026174.h || l3 == J11102083402305026174.i || l3 == J11102083402305026174.k || l3 == J11102083402305026174.l) {
                                    break loop0;
                                } else if (l3 != J11102083402305026174.f) {
                                    Q11088980322693754445.i("Unexpected cell state: ", l3);
                                    return;
                                }
                            } else if (e7893495821728651450.k(i2, l3, J11102083402305026174.e)) {
                                break loop0;
                            }
                        } else {
                            break;
                        }
                    } else if (andIncrement < T5284056093300834442.a.getLongVolatile(this, j6)) {
                        if (e7893495821728651450.k(i2, l3, new G633373366446159924((J1083986568308928281) l3))) {
                            break loop0;
                        }
                    } else if (e7893495821728651450.k(i2, l3, J11102083402305026174.g)) {
                        if (L(l3, e7893495821728651450, i2)) {
                            e7893495821728651450.o(i2, J11102083402305026174.d);
                            break;
                        } else {
                            e7893495821728651450.o(i2, J11102083402305026174.j);
                            e7893495821728651450.i();
                        }
                    }
                }
            } else if (L(l2, e7893495821728651450, i2)) {
                e7893495821728651450.o(i2, J11102083402305026174.d);
                break;
            } else {
                e7893495821728651450.o(i2, J11102083402305026174.j);
                e7893495821728651450.i();
                w(1L);
            }
        }
        w(1L);
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final J15730374346044043770 i() {
        B13274889377228702199 b13274889377228702199 = B13274889377228702199.h;
        V12319504402545346730.s(3, b13274889377228702199);
        J9908514448265864926 j9908514448265864926 = J9908514448265864926.h;
        V12319504402545346730.s(3, j9908514448265864926);
        return new J15730374346044043770(this, b13274889377228702199, j9908514448265864926, null, (byte) 14);
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final F8228714002503597451 iterator() {
        return new F8228714002503597451(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c4, code lost:
    
        if (r8.f() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        r8.e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.E7893495821728651450 j(long r16, dev.epro.r0.E7893495821728651450 r18) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H17686692708284905246.j(long, dev.epro.r0.E7893495821728651450):dev.epro.r0.E7893495821728651450");
    }

    public final E7893495821728651450 k(long j2, E7893495821728651450 e7893495821728651450) {
        Object o2;
        E7893495821728651450 e78934958217286514502;
        long j3;
        Unsafe unsafe;
        H17686692708284905246 h17686692708284905246 = this;
        E7893495821728651450 e78934958217286514503 = J11102083402305026174.a;
        K3176212305241750029 k3176212305241750029 = K3176212305241750029.h;
        loop0: while (true) {
            o2 = O4077903568229246.o(e7893495821728651450, j2, k3176212305241750029);
            if (!T3224757362656795885.i(o2)) {
                X17453750288186724334 h2 = T3224757362656795885.h(o2);
                while (true) {
                    Unsafe unsafe2 = T5284056093300834442.a;
                    long j4 = n;
                    X17453750288186724334 x17453750288186724334 = (X17453750288186724334) unsafe2.getObjectVolatile(h17686692708284905246, j4);
                    if (x17453750288186724334.d >= h2.d) {
                        break loop0;
                    }
                    if (!h2.j()) {
                        break;
                    }
                    do {
                        unsafe = T5284056093300834442.a;
                        if (unsafe.compareAndSwapObject(h17686692708284905246, n, x17453750288186724334, h2)) {
                            if (x17453750288186724334.f()) {
                                x17453750288186724334.e();
                            }
                        }
                    } while (unsafe.getObjectVolatile(h17686692708284905246, j4) == x17453750288186724334);
                    if (h2.f()) {
                        h2.e();
                    }
                }
            } else {
                break;
            }
        }
        E7893495821728651450 e78934958217286514504 = null;
        if (T3224757362656795885.i(o2)) {
            h17686692708284905246.A();
            if (e7893495821728651450.d * J11102083402305026174.b >= h17686692708284905246.t()) {
                return null;
            }
            e7893495821728651450.a();
            return null;
        }
        E7893495821728651450 e78934958217286514505 = (E7893495821728651450) T3224757362656795885.h(o2);
        long j5 = e78934958217286514505.d;
        if (j5 <= j2) {
            return e78934958217286514505;
        }
        long j6 = j5 * J11102083402305026174.b;
        while (true) {
            Unsafe unsafe3 = T5284056093300834442.a;
            long j7 = f269o;
            long longVolatile = unsafe3.getLongVolatile(h17686692708284905246, j7);
            long j8 = 1152921504606846975L & longVolatile;
            if (j8 >= j6) {
                e78934958217286514502 = e78934958217286514504;
                j3 = j5;
                break;
            }
            e78934958217286514502 = e78934958217286514504;
            j3 = j5;
            if (unsafe3.compareAndSwapLong(h17686692708284905246, j7, longVolatile, j8 + (((int) (longVolatile >> 60)) << 60))) {
                break;
            }
            h17686692708284905246 = this;
            e78934958217286514504 = e78934958217286514502;
            j5 = j3;
        }
        if (j3 * J11102083402305026174.b >= t()) {
            return e78934958217286514502;
        }
        e78934958217286514505.a();
        return e78934958217286514502;
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final Object l(L9506193609949700881 l9506193609949700881) {
        return G(this, l9506193609949700881);
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final Object m() {
        E7893495821728651450 e7893495821728651450;
        Unsafe unsafe = T5284056093300834442.a;
        long longVolatile = unsafe.getLongVolatile(this, m);
        long longVolatile2 = unsafe.getLongVolatile(this, f269o);
        if (y(longVolatile2, true)) {
            return new I12241705932167711945(p());
        }
        long j2 = longVolatile2 & 1152921504606846975L;
        F15209282533750470613 f15209282533750470613 = M7349931961628075932.b;
        if (longVolatile >= j2) {
            return f15209282533750470613;
        }
        Object obj = J11102083402305026174.k;
        E7893495821728651450 e78934958217286514502 = (E7893495821728651450) unsafe.getObjectVolatile(this, l);
        while (!this.z()) {
            long andIncrement = c.getAndIncrement(this);
            long j3 = J11102083402305026174.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (e78934958217286514502.d != j4) {
                E7893495821728651450 j5 = this.j(j4, e78934958217286514502);
                if (j5 == null) {
                    continue;
                } else {
                    e7893495821728651450 = j5;
                }
            } else {
                e7893495821728651450 = e78934958217286514502;
            }
            H17686692708284905246 h17686692708284905246 = this;
            Object M = h17686692708284905246.M(e7893495821728651450, i2, andIncrement, obj);
            e78934958217286514502 = e7893495821728651450;
            if (M == J11102083402305026174.m) {
                J1083986568308928281 j1083986568308928281 = obj instanceof J1083986568308928281 ? (J1083986568308928281) obj : null;
                if (j1083986568308928281 != null) {
                    j1083986568308928281.a(e78934958217286514502, i2);
                }
                h17686692708284905246.P(andIncrement);
                e78934958217286514502.i();
                return f15209282533750470613;
            }
            if (M != J11102083402305026174.f301o) {
                if (M != J11102083402305026174.n) {
                    e78934958217286514502.a();
                    return M;
                }
                S10973172697741180971.m("unexpected");
                return null;
            }
            if (andIncrement < h17686692708284905246.v()) {
                e78934958217286514502.a();
            }
            this = h17686692708284905246;
        }
        return new I12241705932167711945(this.p());
    }

    @Override // dev.epro.r0.E5386183571211952538
    public final Object n(R4833348786910499294 r4833348786910499294) {
        E7893495821728651450 e7893495821728651450;
        Throwable th;
        E7893495821728651450 e78934958217286514502;
        Unsafe unsafe = T5284056093300834442.a;
        long j2 = l;
        E7893495821728651450 e78934958217286514503 = (E7893495821728651450) unsafe.getObjectVolatile(this, j2);
        while (!this.z()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = J11102083402305026174.b;
            long j4 = andIncrement / j3;
            int i2 = (int) (andIncrement % j3);
            if (e78934958217286514503.d != j4) {
                E7893495821728651450 j5 = this.j(j4, e78934958217286514503);
                if (j5 == null) {
                    continue;
                } else {
                    e7893495821728651450 = j5;
                }
            } else {
                e7893495821728651450 = e78934958217286514503;
            }
            H17686692708284905246 h17686692708284905246 = this;
            Object M = h17686692708284905246.M(e7893495821728651450, i2, andIncrement, null);
            D14731132657808549702 d14731132657808549702 = J11102083402305026174.m;
            if (M == d14731132657808549702) {
                S10973172697741180971.m("unexpected");
                return null;
            }
            D14731132657808549702 d147311326578085497022 = J11102083402305026174.f301o;
            if (M == d147311326578085497022) {
                if (andIncrement < h17686692708284905246.v()) {
                    e7893495821728651450.a();
                }
                this = h17686692708284905246;
                e78934958217286514503 = e7893495821728651450;
            } else {
                if (M != J11102083402305026174.n) {
                    e7893495821728651450.a();
                    return M;
                }
                H7219028874700587498 H = V12319504402545346730.H(E18444280280170001567.H(r4833348786910499294));
                try {
                    Object M2 = h17686692708284905246.M(e7893495821728651450, i2, andIncrement, H);
                    if (M2 == d14731132657808549702) {
                        H.a(e7893495821728651450, i2);
                    } else {
                        if (M2 == d147311326578085497022) {
                            if (andIncrement < h17686692708284905246.v()) {
                                e7893495821728651450.a();
                            }
                            E7893495821728651450 e78934958217286514504 = (E7893495821728651450) T5284056093300834442.a.getObjectVolatile(h17686692708284905246, j2);
                            while (true) {
                                if (h17686692708284905246.z()) {
                                    H.resumeWith(new C10696704014433963524(h17686692708284905246.s()));
                                    break;
                                }
                                H7219028874700587498 h7219028874700587498 = H;
                                try {
                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(h17686692708284905246);
                                    long j6 = J11102083402305026174.b;
                                    long j7 = andIncrement2 / j6;
                                    int i3 = (int) (andIncrement2 % j6);
                                    if (e78934958217286514504.d != j7) {
                                        try {
                                            E7893495821728651450 j8 = h17686692708284905246.j(j7, e78934958217286514504);
                                            if (j8 == null) {
                                                H = h7219028874700587498;
                                            } else {
                                                e78934958217286514502 = j8;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            H = h7219028874700587498;
                                            H.B();
                                            throw th;
                                        }
                                    } else {
                                        e78934958217286514502 = e78934958217286514504;
                                    }
                                    H17686692708284905246 h176866927082849052462 = h17686692708284905246;
                                    M2 = h176866927082849052462.M(e78934958217286514502, i3, andIncrement2, h7219028874700587498);
                                    h17686692708284905246 = h176866927082849052462;
                                    E7893495821728651450 e78934958217286514505 = e78934958217286514502;
                                    H = h7219028874700587498;
                                    if (M2 == J11102083402305026174.m) {
                                        H.a(e78934958217286514505, i3);
                                        break;
                                    }
                                    if (M2 == J11102083402305026174.f301o) {
                                        if (andIncrement2 < h17686692708284905246.v()) {
                                            e78934958217286514505.a();
                                        }
                                        e78934958217286514504 = e78934958217286514505;
                                    } else {
                                        if (M2 == J11102083402305026174.n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        e78934958217286514505.a();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    H = h7219028874700587498;
                                    th = th;
                                    H.B();
                                    throw th;
                                }
                            }
                        } else {
                            e7893495821728651450.a();
                        }
                        H.d(M2, null);
                    }
                    return H.r();
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        Throwable s = this.s();
        int i4 = I5890971570803031647.a;
        throw s;
    }

    public final long o() {
        return T5284056093300834442.a.getLongVolatile(this, h);
    }

    public final Throwable p() {
        return (Throwable) T5284056093300834442.a.getObjectVolatile(this, g);
    }

    public final J15730374346044043770 q() {
        Y13292105442514773767 y13292105442514773767 = Y13292105442514773767.h;
        V12319504402545346730.s(3, y13292105442514773767);
        C17864129549031009149 c17864129549031009149 = C17864129549031009149.h;
        V12319504402545346730.s(3, c17864129549031009149);
        return new J15730374346044043770(this, y13292105442514773767, c17864129549031009149, null, (byte) 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0165 A[RETURN] */
    @Override // dev.epro.r0.N13814068345032586384
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(dev.epro.r0.R4833348786910499294 r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H17686692708284905246.r(dev.epro.r0.R4833348786910499294, java.lang.Object):java.lang.Object");
    }

    public final Throwable s() {
        Throwable p = p();
        return p == null ? new E9790414555395670421("Channel was closed") : p;
    }

    public final long t() {
        return T5284056093300834442.a.getLongVolatile(this, m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ae, code lost:
    
        r3 = (dev.epro.r0.E7893495821728651450) r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b5, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H17686692708284905246.toString():java.lang.String");
    }

    public final Throwable u() {
        Throwable p = p();
        return p == null ? new C2686673318923772971("Channel was closed") : p;
    }

    public final long v() {
        return T5284056093300834442.a.getLongVolatile(this, f269o) & 1152921504606846975L;
    }

    public final void w(long j2) {
        if ((e.addAndGet(this, j2) & 4611686018427387904L) != 0) {
            while ((T5284056093300834442.a.getLongVolatile(this, k) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a0, code lost:
    
        r12 = (dev.epro.r0.E7893495821728651450) ((dev.epro.r0.M2655555874565458115) dev.epro.r0.T5284056093300834442.a.getObjectVolatile(r12, dev.epro.r0.M2655555874565458115.b));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(long r12, boolean r14) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H17686692708284905246.y(long, boolean):boolean");
    }

    public final boolean z() {
        return y(T5284056093300834442.a.getLongVolatile(this, f269o), true);
    }
}
