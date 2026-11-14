package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class U4020053660465689583 implements Q15035754882231748864 {
    public static final /* synthetic */ long a;
    public static final /* synthetic */ long b;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        b = unsafe.objectFieldOffset(U4020053660465689583.class.getDeclaredField("_state$volatile"));
        a = unsafe.objectFieldOffset(U4020053660465689583.class.getDeclaredField("_parentHandle$volatile"));
    }

    public U4020053660465689583(boolean z) {
        this._state$volatile = z ? O4077903568229246.r : O4077903568229246.q;
    }

    public static R6423080927537628451 V(Q7617135222418928697 q7617135222418928697) {
        while (q7617135222418928697.k()) {
            q7617135222418928697 = q7617135222418928697.j();
        }
        while (true) {
            q7617135222418928697 = q7617135222418928697.i();
            if (!q7617135222418928697.k()) {
                if (q7617135222418928697 instanceof R6423080927537628451) {
                    return (R6423080927537628451) q7617135222418928697;
                }
                if (q7617135222418928697 instanceof D15128981762807597517) {
                    return null;
                }
            }
        }
    }

    public static String c0(Object obj) {
        if (!(obj instanceof G5200290475234668330)) {
            return obj instanceof D14012262140144083539 ? ((D14012262140144083539) obj).b() ? "Active" : "New" : obj instanceof T13610764347093379131 ? "Cancelled" : "Completed";
        }
        G5200290475234668330 g5200290475234668330 = (G5200290475234668330) obj;
        return g5200290475234668330.e() ? "Cancelling" : g5200290475234668330.f() ? "Completing" : "Active";
    }

    public void A(CancellationException cancellationException) {
        z(cancellationException);
    }

    public final boolean B(Throwable th) {
        if (R()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        B13085836186769537379 b13085836186769537379 = (B13085836186769537379) T5284056093300834442.a.getObjectVolatile(this, a);
        return (b13085836186769537379 == null || b13085836186769537379 == F15788397839700158005.a) ? z : b13085836186769537379.c(th) || z;
    }

    public String C() {
        return "Job was cancelled";
    }

    public boolean D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return z(th) && J();
    }

    public final void E(D14012262140144083539 d14012262140144083539, Object obj) {
        Unsafe unsafe = T5284056093300834442.a;
        long j = a;
        B13085836186769537379 b13085836186769537379 = (B13085836186769537379) unsafe.getObjectVolatile(this, j);
        if (b13085836186769537379 != null) {
            b13085836186769537379.a();
            unsafe.putObjectVolatile(this, j, F15788397839700158005.a);
        }
        M8821877208104636290 m8821877208104636290 = null;
        T13610764347093379131 t13610764347093379131 = obj instanceof T13610764347093379131 ? (T13610764347093379131) obj : null;
        Throwable th = t13610764347093379131 != null ? t13610764347093379131.a : null;
        if (d14012262140144083539 instanceof Z3069203969753053913) {
            try {
                ((Z3069203969753053913) d14012262140144083539).n(th);
                return;
            } catch (Throwable th2) {
                O(new M8821877208104636290("Exception in completion handler " + d14012262140144083539 + " for " + this, th2));
                return;
            }
        }
        D15128981762807597517 d = d14012262140144083539.d();
        if (d != null) {
            d.e(new R12383963674855877097(1), 1);
            Object h = d.h();
            h.getClass();
            for (Q7617135222418928697 q7617135222418928697 = (Q7617135222418928697) h; !q7617135222418928697.equals(d); q7617135222418928697 = q7617135222418928697.i()) {
                if (q7617135222418928697 instanceof Z3069203969753053913) {
                    try {
                        ((Z3069203969753053913) q7617135222418928697).n(th);
                    } catch (Throwable th3) {
                        if (m8821877208104636290 != null) {
                            O8620973563946607355.m(m8821877208104636290, th3);
                        } else {
                            m8821877208104636290 = new M8821877208104636290("Exception in completion handler " + q7617135222418928697 + " for " + this, th3);
                        }
                    }
                }
            }
            if (m8821877208104636290 != null) {
                O(m8821877208104636290);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable F(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        U4020053660465689583 u4020053660465689583 = (U4020053660465689583) obj;
        Object M = u4020053660465689583.M();
        if (M instanceof G5200290475234668330) {
            cancellationException = ((G5200290475234668330) M).c();
        } else if (M instanceof T13610764347093379131) {
            cancellationException = ((T13610764347093379131) M).a;
        } else {
            if (M instanceof D14012262140144083539) {
                Q11088980322693754445.i("Cannot be cancelling child in this state: ", M);
                return null;
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new M7201253877242528483("Parent job is ".concat(c0(M)), cancellationException, u4020053660465689583) : cancellationException2;
    }

    public final Object G(G5200290475234668330 g5200290475234668330, Object obj) {
        G5200290475234668330 g52002904752346683302;
        Throwable th;
        Throwable I;
        U4020053660465689583 u4020053660465689583;
        G5200290475234668330 g52002904752346683303;
        T13610764347093379131 t13610764347093379131 = obj instanceof T13610764347093379131 ? (T13610764347093379131) obj : null;
        Throwable th2 = t13610764347093379131 != null ? t13610764347093379131.a : null;
        synchronized (g5200290475234668330) {
            try {
                g5200290475234668330.e();
                ArrayList g = g5200290475234668330.g(th2);
                I = I(g5200290475234668330, g);
                if (I != null) {
                    try {
                        if (g.size() > 1) {
                            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g.size()));
                            int size = g.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = g.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != I && th3 != I && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                                    O8620973563946607355.m(I, th3);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        g52002904752346683302 = g5200290475234668330;
                        throw th;
                    }
                }
            } catch (Throwable th5) {
                g52002904752346683302 = g5200290475234668330;
                th = th5;
            }
        }
        if (I != null && I != th2) {
            obj = new T13610764347093379131(I, false);
        }
        if (I != null && (B(I) || N(I))) {
            obj.getClass();
            T5284056093300834442.a.compareAndSwapInt((T13610764347093379131) obj, T13610764347093379131.b, 0, 1);
        }
        X(obj);
        Object q14579408259617852085 = obj instanceof D14012262140144083539 ? new Q14579408259617852085((D14012262140144083539) obj) : obj;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = b;
            u4020053660465689583 = this;
            g52002904752346683303 = g5200290475234668330;
            if (!unsafe.compareAndSwapObject(u4020053660465689583, j, g52002904752346683303, q14579408259617852085) && unsafe.getObjectVolatile(u4020053660465689583, j) == g52002904752346683303) {
                this = u4020053660465689583;
                g5200290475234668330 = g52002904752346683303;
            }
        }
        u4020053660465689583.E(g52002904752346683303, obj);
        return obj;
    }

    public final Object H() {
        Object M = M();
        if (M instanceof D14012262140144083539) {
            S10973172697741180971.m("This job has not completed yet");
            return null;
        }
        if (M instanceof T13610764347093379131) {
            throw ((T13610764347093379131) M).a;
        }
        return O4077903568229246.X(M);
    }

    public final Throwable I(G5200290475234668330 g5200290475234668330, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (g5200290475234668330.e()) {
                return new M7201253877242528483(C(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof P2480554073835519965) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof P2480554073835519965)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean J() {
        return true;
    }

    public boolean K() {
        return this instanceof A18119328133183277592;
    }

    public final D15128981762807597517 L(D14012262140144083539 d14012262140144083539) {
        D15128981762807597517 d = d14012262140144083539.d();
        if (d != null) {
            return d;
        }
        if (d14012262140144083539 instanceof S13297578932192364679) {
            return new D15128981762807597517();
        }
        if (d14012262140144083539 instanceof Z3069203969753053913) {
            a0((Z3069203969753053913) d14012262140144083539);
            return null;
        }
        Q11088980322693754445.i("State should have list: ", d14012262140144083539);
        return null;
    }

    public final Object M() {
        return T5284056093300834442.a.getObjectVolatile(this, b);
    }

    public boolean N(Throwable th) {
        return false;
    }

    public final void P(Q15035754882231748864 q15035754882231748864) {
        long j = a;
        F15788397839700158005 f15788397839700158005 = F15788397839700158005.a;
        if (q15035754882231748864 == null) {
            T5284056093300834442.a.putObjectVolatile(this, j, f15788397839700158005);
            return;
        }
        q15035754882231748864.start();
        B13085836186769537379 u = q15035754882231748864.u(this);
        Unsafe unsafe = T5284056093300834442.a;
        unsafe.putObjectVolatile(this, j, u);
        if (p()) {
            u.a();
            unsafe.putObjectVolatile(this, j, f15788397839700158005);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.U16840712152025914198 Q(boolean r7, dev.epro.r0.Z3069203969753053913 r8) {
        /*
            r6 = this;
            r8.d = r6
        L2:
            java.lang.Object r4 = r6.M()
            boolean r0 = r4 instanceof dev.epro.r0.S13297578932192364679
            if (r0 == 0) goto L2e
            r0 = r4
            dev.epro.r0.S13297578932192364679 r0 = (dev.epro.r0.S13297578932192364679) r0
            boolean r1 = r0.a
            if (r1 == 0) goto L28
        L11:
            sun.misc.Unsafe r0 = dev.epro.r0.T5284056093300834442.a
            long r2 = dev.epro.r0.U4020053660465689583.b
            r1 = r6
            r5 = r8
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L1e
            goto L6f
        L1e:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L25
            goto L70
        L25:
            r6 = r1
            r8 = r5
            goto L11
        L28:
            r1 = r6
            r5 = r8
            r1.Z(r0)
            goto L70
        L2e:
            r1 = r6
            r5 = r8
            boolean r6 = r4 instanceof dev.epro.r0.D14012262140144083539
            dev.epro.r0.F15788397839700158005 r8 = dev.epro.r0.F15788397839700158005.a
            r0 = 0
            if (r6 == 0) goto L73
            r6 = r4
            dev.epro.r0.D14012262140144083539 r6 = (dev.epro.r0.D14012262140144083539) r6
            dev.epro.r0.D15128981762807597517 r2 = r6.d()
            if (r2 != 0) goto L46
            dev.epro.r0.Z3069203969753053913 r4 = (dev.epro.r0.Z3069203969753053913) r4
            r1.a0(r4)
            goto L70
        L46:
            boolean r3 = r5.m()
            if (r3 == 0) goto L68
            boolean r3 = r6 instanceof dev.epro.r0.G5200290475234668330
            if (r3 == 0) goto L53
            dev.epro.r0.G5200290475234668330 r6 = (dev.epro.r0.G5200290475234668330) r6
            goto L54
        L53:
            r6 = r0
        L54:
            if (r6 == 0) goto L5a
            java.lang.Throwable r0 = r6.c()
        L5a:
            if (r0 != 0) goto L62
            r6 = 5
            boolean r6 = r2.e(r5, r6)
            goto L6d
        L62:
            if (r7 == 0) goto L88
            r5.n(r0)
            return r8
        L68:
            r6 = 1
            boolean r6 = r2.e(r5, r6)
        L6d:
            if (r6 == 0) goto L70
        L6f:
            return r5
        L70:
            r6 = r1
            r8 = r5
            goto L2
        L73:
            if (r7 == 0) goto L88
            java.lang.Object r6 = r1.M()
            boolean r7 = r6 instanceof dev.epro.r0.T13610764347093379131
            if (r7 == 0) goto L80
            dev.epro.r0.T13610764347093379131 r6 = (dev.epro.r0.T13610764347093379131) r6
            goto L81
        L80:
            r6 = r0
        L81:
            if (r6 == 0) goto L85
            java.lang.Throwable r0 = r6.a
        L85:
            r5.n(r0)
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U4020053660465689583.Q(boolean, dev.epro.r0.Z3069203969753053913):dev.epro.r0.U16840712152025914198");
    }

    public boolean R() {
        return this instanceof Q13317146054867800517;
    }

    public final boolean S(Object obj) {
        Object d0;
        do {
            d0 = d0(M(), obj);
            if (d0 == O4077903568229246.l) {
                return false;
            }
            if (d0 == O4077903568229246.m) {
                return true;
            }
        } while (d0 == O4077903568229246.n);
        t(d0);
        return true;
    }

    public final Object T(Object obj) {
        Object d0;
        do {
            d0 = d0(M(), obj);
            if (d0 == O4077903568229246.l) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                T13610764347093379131 t13610764347093379131 = obj instanceof T13610764347093379131 ? (T13610764347093379131) obj : null;
                throw new IllegalStateException(str, t13610764347093379131 != null ? t13610764347093379131.a : null);
            }
        } while (d0 == O4077903568229246.n);
        return d0;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(D15128981762807597517 d15128981762807597517, Throwable th) {
        d15128981762807597517.e(new R12383963674855877097(4), 4);
        Object h = d15128981762807597517.h();
        h.getClass();
        M8821877208104636290 m8821877208104636290 = null;
        for (Q7617135222418928697 q7617135222418928697 = (Q7617135222418928697) h; !q7617135222418928697.equals(d15128981762807597517); q7617135222418928697 = q7617135222418928697.i()) {
            if ((q7617135222418928697 instanceof Z3069203969753053913) && ((Z3069203969753053913) q7617135222418928697).m()) {
                try {
                    ((Z3069203969753053913) q7617135222418928697).n(th);
                } catch (Throwable th2) {
                    if (m8821877208104636290 != null) {
                        O8620973563946607355.m(m8821877208104636290, th2);
                    } else {
                        m8821877208104636290 = new M8821877208104636290("Exception in completion handler " + q7617135222418928697 + " for " + this, th2);
                    }
                }
            }
        }
        if (m8821877208104636290 != null) {
            O(m8821877208104636290);
        }
        B(th);
    }

    public final void Z(S13297578932192364679 s13297578932192364679) {
        D15128981762807597517 d15128981762807597517 = new D15128981762807597517();
        Object u5404637490031256753 = s13297578932192364679.a ? d15128981762807597517 : new U5404637490031256753(d15128981762807597517);
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = b;
            U4020053660465689583 u4020053660465689583 = this;
            S13297578932192364679 s132975789321923646792 = s13297578932192364679;
            if (unsafe.compareAndSwapObject(u4020053660465689583, j, s132975789321923646792, u5404637490031256753) || unsafe.getObjectVolatile(u4020053660465689583, j) != s132975789321923646792) {
                return;
            }
            this = u4020053660465689583;
            s13297578932192364679 = s132975789321923646792;
        }
    }

    public final void a0(Z3069203969753053913 z3069203969753053913) {
        Z3069203969753053913 z30692039697530539132;
        U4020053660465689583 u4020053660465689583;
        D15128981762807597517 d15128981762807597517 = new D15128981762807597517();
        Unsafe unsafe = T5284056093300834442.a;
        unsafe.putObjectVolatile(d15128981762807597517, Q7617135222418928697.b, z3069203969753053913);
        long j = Q7617135222418928697.a;
        unsafe.putObjectVolatile(d15128981762807597517, j, z3069203969753053913);
        loop0: while (true) {
            if (z3069203969753053913.h() != z3069203969753053913) {
                z30692039697530539132 = z3069203969753053913;
                break;
            }
            while (true) {
                Unsafe unsafe2 = T5284056093300834442.a;
                z30692039697530539132 = z3069203969753053913;
                if (unsafe2.compareAndSwapObject(z30692039697530539132, Q7617135222418928697.a, z3069203969753053913, d15128981762807597517)) {
                    d15128981762807597517.g(z30692039697530539132);
                    break loop0;
                }
                u4020053660465689583 = this;
                z3069203969753053913 = z30692039697530539132;
                if (unsafe2.getObjectVolatile(z30692039697530539132, j) != z30692039697530539132) {
                    break;
                } else {
                    this = u4020053660465689583;
                }
            }
            this = u4020053660465689583;
        }
        Q7617135222418928697 i = z30692039697530539132.i();
        while (true) {
            Unsafe unsafe3 = T5284056093300834442.a;
            long j2 = b;
            U4020053660465689583 u40200536604656895832 = this;
            if (unsafe3.compareAndSwapObject(u40200536604656895832, j2, z30692039697530539132, i) || unsafe3.getObjectVolatile(u40200536604656895832, j2) != z30692039697530539132) {
                return;
            } else {
                this = u40200536604656895832;
            }
        }
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public boolean b() {
        Object M = M();
        return (M instanceof D14012262140144083539) && ((D14012262140144083539) M).b();
    }

    public final int b0(Object obj) {
        Unsafe unsafe;
        Unsafe unsafe2;
        boolean z = obj instanceof S13297578932192364679;
        long j = b;
        if (z) {
            if (((S13297578932192364679) obj).a) {
                return 0;
            }
            S13297578932192364679 s13297578932192364679 = O4077903568229246.r;
            do {
                unsafe2 = T5284056093300834442.a;
                if (unsafe2.compareAndSwapObject(this, b, obj, s13297578932192364679)) {
                    Y();
                    return 1;
                }
            } while (unsafe2.getObjectVolatile(this, j) == obj);
            return -1;
        }
        if (!(obj instanceof U5404637490031256753)) {
            return 0;
        }
        D15128981762807597517 d15128981762807597517 = ((U5404637490031256753) obj).a;
        do {
            unsafe = T5284056093300834442.a;
            if (unsafe.compareAndSwapObject(this, b, obj, d15128981762807597517)) {
                Y();
                return 1;
            }
        } while (unsafe.getObjectVolatile(this, j) == obj);
        return -1;
    }

    @Override // dev.epro.r0.Q15035754882231748864, dev.epro.r0.E5386183571211952538
    public void c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new M7201253877242528483(C(), null, this);
        }
        A(cancellationException);
    }

    public final Object d0(Object obj, Object obj2) {
        Unsafe unsafe;
        long j;
        if (!(obj instanceof D14012262140144083539)) {
            return O4077903568229246.l;
        }
        if ((!(obj instanceof S13297578932192364679) && !(obj instanceof Z3069203969753053913)) || (obj instanceof R6423080927537628451) || (obj2 instanceof T13610764347093379131)) {
            U4020053660465689583 u4020053660465689583 = this;
            D14012262140144083539 d14012262140144083539 = (D14012262140144083539) obj;
            D15128981762807597517 L = u4020053660465689583.L(d14012262140144083539);
            if (L == null) {
                return O4077903568229246.n;
            }
            G5200290475234668330 g5200290475234668330 = d14012262140144083539 instanceof G5200290475234668330 ? (G5200290475234668330) d14012262140144083539 : null;
            if (g5200290475234668330 == null) {
                g5200290475234668330 = new G5200290475234668330(L, null);
            }
            G5200290475234668330 g52002904752346683302 = g5200290475234668330;
            synchronized (g52002904752346683302) {
                if (g52002904752346683302.f()) {
                    return O4077903568229246.l;
                }
                T5284056093300834442.a.putIntVolatile(g52002904752346683302, G5200290475234668330.c, 1);
                if (g52002904752346683302 != d14012262140144083539) {
                    do {
                        unsafe = T5284056093300834442.a;
                        j = b;
                        U4020053660465689583 u40200536604656895832 = u4020053660465689583;
                        u4020053660465689583 = u40200536604656895832;
                        if (unsafe.compareAndSwapObject(u40200536604656895832, j, d14012262140144083539, g52002904752346683302)) {
                        }
                    } while (unsafe.getObjectVolatile(u4020053660465689583, j) == d14012262140144083539);
                    return O4077903568229246.n;
                }
                boolean e = g52002904752346683302.e();
                T13610764347093379131 t13610764347093379131 = obj2 instanceof T13610764347093379131 ? (T13610764347093379131) obj2 : null;
                if (t13610764347093379131 != null) {
                    g52002904752346683302.a(t13610764347093379131.a);
                }
                Throwable c = e ? null : g52002904752346683302.c();
                if (c != null) {
                    u4020053660465689583.W(L, c);
                }
                R6423080927537628451 V = V(L);
                if (V != null && u4020053660465689583.e0(g52002904752346683302, V, obj2)) {
                    return O4077903568229246.m;
                }
                L.e(new R12383963674855877097(2), 2);
                R6423080927537628451 V2 = V(L);
                return (V2 == null || !u4020053660465689583.e0(g52002904752346683302, V2, obj2)) ? u4020053660465689583.G(g52002904752346683302, obj2) : O4077903568229246.m;
            }
        }
        D14012262140144083539 d140122621401440835392 = (D14012262140144083539) obj;
        Object q14579408259617852085 = obj2 instanceof D14012262140144083539 ? new Q14579408259617852085((D14012262140144083539) obj2) : obj2;
        while (true) {
            Unsafe unsafe2 = T5284056093300834442.a;
            long j2 = b;
            U4020053660465689583 u40200536604656895833 = this;
            if (unsafe2.compareAndSwapObject(u40200536604656895833, j2, d140122621401440835392, q14579408259617852085)) {
                u40200536604656895833.X(obj2);
                u40200536604656895833.E(d140122621401440835392, obj2);
                return obj2;
            }
            if (unsafe2.getObjectVolatile(u40200536604656895833, j2) != d140122621401440835392) {
                return O4077903568229246.n;
            }
            this = u40200536604656895833;
        }
    }

    public Object e() {
        return H();
    }

    public final boolean e0(G5200290475234668330 g5200290475234668330, R6423080927537628451 r6423080927537628451, Object obj) {
        while (J8045362843799184672.c0(r6423080927537628451.e, false, new G12084509347366682642(this, g5200290475234668330, r6423080927537628451, obj)) == F15788397839700158005.a) {
            r6423080927537628451 = V(r6423080927537628451);
            if (r6423080927537628451 == null) {
                return false;
            }
        }
        return true;
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final Object fold(L12639328004344855510 l12639328004344855510, Object obj) {
        return l12639328004344855510.invoke(obj, this);
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final U16840712152025914198 g(boolean z, boolean z2, C9424689592673022017 c9424689592673022017) {
        return Q(z2, z ? new G17552658483072227173(c9424689592673022017) : new B15426972316175040908(c9424689592673022017));
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final H7323971265464188398 get(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.I(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.H7323971265464188398
    public final R12081023847482212386 getKey() {
        return P2382941533350862833.p;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final boolean isCancelled() {
        Object M = M();
        if (M instanceof T13610764347093379131) {
            return true;
        }
        return (M instanceof G5200290475234668330) && ((G5200290475234668330) M).e();
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final U16840712152025914198 j(F4096073349764486348 f4096073349764486348) {
        return Q(true, new B15426972316175040908(f4096073349764486348));
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 minusKey(R12081023847482212386 r12081023847482212386) {
        return S10823041268949770285.M(this, r12081023847482212386);
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final CancellationException o() {
        CancellationException cancellationException;
        Object M = M();
        if (M instanceof G5200290475234668330) {
            Throwable c = ((G5200290475234668330) M).c();
            if (c == null) {
                Q11088980322693754445.i("Job is still new or active: ", this);
                return null;
            }
            String concat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = c instanceof CancellationException ? (CancellationException) c : null;
            return cancellationException == null ? new M7201253877242528483(concat, c, this) : cancellationException;
        }
        if (M instanceof D14012262140144083539) {
            Q11088980322693754445.i("Job is still new or active: ", this);
            return null;
        }
        if (!(M instanceof T13610764347093379131)) {
            return new M7201253877242528483(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((T13610764347093379131) M).a;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new M7201253877242528483(C(), th, this) : cancellationException;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final boolean p() {
        return !(M() instanceof D14012262140144083539);
    }

    @Override // dev.epro.r0.G8001132634698687269
    public final G8001132634698687269 plus(G8001132634698687269 g8001132634698687269) {
        return S10823041268949770285.O(this, g8001132634698687269);
    }

    public Object s(K14749510448791472029 k14749510448791472029) {
        return y(k14749510448791472029);
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final boolean start() {
        int b0;
        do {
            b0 = b0(M());
            if (b0 == 0) {
                return false;
            }
        } while (b0 != 1);
        return true;
    }

    public final String toString() {
        return (U() + '{' + c0(M()) + '}') + '@' + D15445857918358799638.I(this);
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final B13085836186769537379 u(U4020053660465689583 u4020053660465689583) {
        U4020053660465689583 u40200536604656895832;
        R6423080927537628451 r6423080927537628451 = new R6423080927537628451(u4020053660465689583);
        r6423080927537628451.d = this;
        loop0: while (true) {
            Object M = this.M();
            if (M instanceof S13297578932192364679) {
                S13297578932192364679 s13297578932192364679 = (S13297578932192364679) M;
                if (s13297578932192364679.a) {
                    while (true) {
                        Unsafe unsafe = T5284056093300834442.a;
                        long j = b;
                        u40200536604656895832 = this;
                        if (unsafe.compareAndSwapObject(u40200536604656895832, j, M, r6423080927537628451)) {
                            break loop0;
                        }
                        if (unsafe.getObjectVolatile(u40200536604656895832, j) != M) {
                            break;
                        }
                        this = u40200536604656895832;
                    }
                } else {
                    u40200536604656895832 = this;
                    u40200536604656895832.Z(s13297578932192364679);
                }
                this = u40200536604656895832;
            } else {
                u40200536604656895832 = this;
                boolean z = M instanceof D14012262140144083539;
                F15788397839700158005 f15788397839700158005 = F15788397839700158005.a;
                if (!z) {
                    Object M2 = u40200536604656895832.M();
                    T13610764347093379131 t13610764347093379131 = M2 instanceof T13610764347093379131 ? (T13610764347093379131) M2 : null;
                    r6423080927537628451.n(t13610764347093379131 != null ? t13610764347093379131.a : null);
                    return f15788397839700158005;
                }
                D15128981762807597517 d = ((D14012262140144083539) M).d();
                if (d == null) {
                    u40200536604656895832.a0((Z3069203969753053913) M);
                    this = u40200536604656895832;
                } else if (!d.e(r6423080927537628451, 7)) {
                    boolean e = d.e(r6423080927537628451, 3);
                    Object M3 = u40200536604656895832.M();
                    if (M3 instanceof G5200290475234668330) {
                        r0 = ((G5200290475234668330) M3).c();
                    } else {
                        T13610764347093379131 t136107643470933791312 = M3 instanceof T13610764347093379131 ? (T13610764347093379131) M3 : null;
                        if (t136107643470933791312 != null) {
                            r0 = t136107643470933791312.a;
                        }
                    }
                    r6423080927537628451.n(r0);
                    if (e) {
                        break loop0;
                    }
                    return f15788397839700158005;
                }
            }
        }
        return r6423080927537628451;
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final Object v(R4833348786910499294 r4833348786910499294) {
        Object M;
        O9245300239821758723 o9245300239821758723;
        do {
            M = M();
            boolean z = M instanceof D14012262140144083539;
            o9245300239821758723 = O9245300239821758723.a;
            if (!z) {
                J8045362843799184672.K(r4833348786910499294.getContext());
                return o9245300239821758723;
            }
        } while (b0(M) < 0);
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r4833348786910499294));
        h7219028874700587498.t();
        h7219028874700587498.w(new T5499530138885127132(J8045362843799184672.c0(this, true, new I18276018097207738813(h7219028874700587498)), (byte) 2));
        Object r = h7219028874700587498.r();
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (r != z3437138737604933638) {
            r = o9245300239821758723;
        }
        return r == z3437138737604933638 ? r : o9245300239821758723;
    }

    public void w(Object obj) {
        t(obj);
    }

    public final Object y(R4833348786910499294 r4833348786910499294) {
        Object M;
        do {
            M = M();
            if (!(M instanceof D14012262140144083539)) {
                if (M instanceof T13610764347093379131) {
                    throw ((T13610764347093379131) M).a;
                }
                return O4077903568229246.X(M);
            }
        } while (b0(M) < 0);
        N10275480315124087338 n10275480315124087338 = new N10275480315124087338(E18444280280170001567.H(r4833348786910499294), this);
        n10275480315124087338.t();
        n10275480315124087338.w(new T5499530138885127132(J8045362843799184672.c0(this, true, new R4031171079172756347(n10275480315124087338)), (byte) 2));
        return n10275480315124087338.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 == dev.epro.r0.O4077903568229246.m) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U4020053660465689583.z(java.lang.Object):boolean");
    }

    public void Y() {
    }

    public void O(M8821877208104636290 m8821877208104636290) {
        throw m8821877208104636290;
    }

    public void X(Object obj) {
    }

    public void t(Object obj) {
    }
}
