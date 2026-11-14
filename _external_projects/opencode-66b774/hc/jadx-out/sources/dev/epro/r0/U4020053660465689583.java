package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
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
        D15128981762807597517 d15128981762807597517D = d14012262140144083539.d();
        if (d15128981762807597517D != null) {
            d15128981762807597517D.e(new R12383963674855877097(1), 1);
            Object objH = d15128981762807597517D.h();
            objH.getClass();
            for (Q7617135222418928697 q7617135222418928697I = (Q7617135222418928697) objH; !q7617135222418928697I.equals(d15128981762807597517D); q7617135222418928697I = q7617135222418928697I.i()) {
                if (q7617135222418928697I instanceof Z3069203969753053913) {
                    try {
                        ((Z3069203969753053913) q7617135222418928697I).n(th);
                    } catch (Throwable th3) {
                        if (m8821877208104636290 != null) {
                            O8620973563946607355.m(m8821877208104636290, th3);
                        } else {
                            m8821877208104636290 = new M8821877208104636290("Exception in completion handler " + q7617135222418928697I + " for " + this, th3);
                        }
                    }
                }
            }
            if (m8821877208104636290 != null) {
                O(m8821877208104636290);
            }
        }
    }

    public final Throwable F(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        U4020053660465689583 u4020053660465689583 = (U4020053660465689583) obj;
        Object objM = u4020053660465689583.M();
        if (objM instanceof G5200290475234668330) {
            thC = ((G5200290475234668330) objM).c();
        } else if (objM instanceof T13610764347093379131) {
            thC = ((T13610764347093379131) objM).a;
        } else {
            if (objM instanceof D14012262140144083539) {
                Q11088980322693754445.i("Cannot be cancelling child in this state: ", objM);
                return null;
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new M7201253877242528483("Parent job is ".concat(c0(objM)), thC, u4020053660465689583) : cancellationException;
    }

    public final Object G(G5200290475234668330 g5200290475234668330, Object obj) throws Throwable {
        G5200290475234668330 g52002904752346683302;
        Throwable th;
        Throwable thI;
        U4020053660465689583 u4020053660465689583;
        G5200290475234668330 g52002904752346683303;
        T13610764347093379131 t13610764347093379131 = obj instanceof T13610764347093379131 ? (T13610764347093379131) obj : null;
        Throwable th2 = t13610764347093379131 != null ? t13610764347093379131.a : null;
        synchronized (g5200290475234668330) {
            try {
                g5200290475234668330.e();
                ArrayList arrayListG = g5200290475234668330.g(th2);
                thI = I(g5200290475234668330, arrayListG);
                if (thI != null) {
                    try {
                        if (arrayListG.size() > 1) {
                            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                            int size = arrayListG.size();
                            int i = 0;
                            while (i < size) {
                                Object obj2 = arrayListG.get(i);
                                i++;
                                Throwable th3 = (Throwable) obj2;
                                if (th3 != thI && th3 != thI && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                                    O8620973563946607355.m(thI, th3);
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
        if (thI != null && thI != th2) {
            obj = new T13610764347093379131(thI, false);
        }
        if (thI != null && (B(thI) || N(thI))) {
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
            if (unsafe.compareAndSwapObject(u4020053660465689583, j, g52002904752346683303, q14579408259617852085) || unsafe.getObjectVolatile(u4020053660465689583, j) != g52002904752346683303) {
                break;
            }
            this = u4020053660465689583;
            g5200290475234668330 = g52002904752346683303;
        }
        u4020053660465689583.E(g52002904752346683303, obj);
        return obj;
    }

    public final Object H() throws Throwable {
        Object objM = M();
        if (objM instanceof D14012262140144083539) {
            S10973172697741180971.m("This job has not completed yet");
            return null;
        }
        if (objM instanceof T13610764347093379131) {
            throw ((T13610764347093379131) objM).a;
        }
        return O4077903568229246.X(objM);
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
        D15128981762807597517 d15128981762807597517D = d14012262140144083539.d();
        if (d15128981762807597517D != null) {
            return d15128981762807597517D;
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
        B13085836186769537379 b13085836186769537379U = q15035754882231748864.u(this);
        Unsafe unsafe = T5284056093300834442.a;
        unsafe.putObjectVolatile(this, j, b13085836186769537379U);
        if (p()) {
            b13085836186769537379U.a();
            unsafe.putObjectVolatile(this, j, f15788397839700158005);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0088, code lost:
    
        return r8;
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
        Object objD0;
        do {
            objD0 = d0(M(), obj);
            if (objD0 == O4077903568229246.l) {
                return false;
            }
            if (objD0 == O4077903568229246.m) {
                return true;
            }
        } while (objD0 == O4077903568229246.n);
        t(objD0);
        return true;
    }

    public final Object T(Object obj) {
        Object objD0;
        do {
            objD0 = d0(M(), obj);
            if (objD0 == O4077903568229246.l) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                T13610764347093379131 t13610764347093379131 = obj instanceof T13610764347093379131 ? (T13610764347093379131) obj : null;
                throw new IllegalStateException(str, t13610764347093379131 != null ? t13610764347093379131.a : null);
            }
        } while (objD0 == O4077903568229246.n);
        return objD0;
    }

    public String U() {
        return getClass().getSimpleName();
    }

    public final void W(D15128981762807597517 d15128981762807597517, Throwable th) {
        d15128981762807597517.e(new R12383963674855877097(4), 4);
        Object objH = d15128981762807597517.h();
        objH.getClass();
        M8821877208104636290 m8821877208104636290 = null;
        for (Q7617135222418928697 q7617135222418928697I = (Q7617135222418928697) objH; !q7617135222418928697I.equals(d15128981762807597517); q7617135222418928697I = q7617135222418928697I.i()) {
            if ((q7617135222418928697I instanceof Z3069203969753053913) && ((Z3069203969753053913) q7617135222418928697I).m()) {
                try {
                    ((Z3069203969753053913) q7617135222418928697I).n(th);
                } catch (Throwable th2) {
                    if (m8821877208104636290 != null) {
                        O8620973563946607355.m(m8821877208104636290, th2);
                    } else {
                        m8821877208104636290 = new M8821877208104636290("Exception in completion handler " + q7617135222418928697I + " for " + this, th2);
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
        Q7617135222418928697 q7617135222418928697I = z30692039697530539132.i();
        while (true) {
            Unsafe unsafe3 = T5284056093300834442.a;
            long j2 = b;
            U4020053660465689583 u40200536604656895832 = this;
            if (unsafe3.compareAndSwapObject(u40200536604656895832, j2, z30692039697530539132, q7617135222418928697I) || unsafe3.getObjectVolatile(u40200536604656895832, j2) != z30692039697530539132) {
                return;
            } else {
                this = u40200536604656895832;
            }
        }
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public boolean b() {
        Object objM = M();
        return (objM instanceof D14012262140144083539) && ((D14012262140144083539) objM).b();
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
            D15128981762807597517 d15128981762807597517L = u4020053660465689583.L(d14012262140144083539);
            if (d15128981762807597517L == null) {
                return O4077903568229246.n;
            }
            G5200290475234668330 g5200290475234668330 = d14012262140144083539 instanceof G5200290475234668330 ? (G5200290475234668330) d14012262140144083539 : null;
            if (g5200290475234668330 == null) {
                g5200290475234668330 = new G5200290475234668330(d15128981762807597517L, null);
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
                boolean zE = g52002904752346683302.e();
                T13610764347093379131 t13610764347093379131 = obj2 instanceof T13610764347093379131 ? (T13610764347093379131) obj2 : null;
                if (t13610764347093379131 != null) {
                    g52002904752346683302.a(t13610764347093379131.a);
                }
                Throwable thC = zE ? null : g52002904752346683302.c();
                if (thC != null) {
                    u4020053660465689583.W(d15128981762807597517L, thC);
                }
                R6423080927537628451 r6423080927537628451V = V(d15128981762807597517L);
                if (r6423080927537628451V != null && u4020053660465689583.e0(g52002904752346683302, r6423080927537628451V, obj2)) {
                    return O4077903568229246.m;
                }
                d15128981762807597517L.e(new R12383963674855877097(2), 2);
                R6423080927537628451 r6423080927537628451V2 = V(d15128981762807597517L);
                return (r6423080927537628451V2 == null || !u4020053660465689583.e0(g52002904752346683302, r6423080927537628451V2, obj2)) ? u4020053660465689583.G(g52002904752346683302, obj2) : O4077903568229246.m;
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
        Object objM = M();
        if (objM instanceof T13610764347093379131) {
            return true;
        }
        return (objM instanceof G5200290475234668330) && ((G5200290475234668330) objM).e();
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
        Object objM = M();
        if (objM instanceof G5200290475234668330) {
            Throwable thC = ((G5200290475234668330) objM).c();
            if (thC == null) {
                Q11088980322693754445.i("Job is still new or active: ", this);
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
            return cancellationException == null ? new M7201253877242528483(strConcat, thC, this) : cancellationException;
        }
        if (objM instanceof D14012262140144083539) {
            Q11088980322693754445.i("Job is still new or active: ", this);
            return null;
        }
        if (!(objM instanceof T13610764347093379131)) {
            return new M7201253877242528483(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((T13610764347093379131) objM).a;
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
        int iB0;
        do {
            iB0 = b0(M());
            if (iB0 == 0) {
                return false;
            }
        } while (iB0 != 1);
        return true;
    }

    public final String toString() {
        return (U() + '{' + c0(M()) + '}') + '@' + D15445857918358799638.I(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
    
        return r5;
     */
    @Override // dev.epro.r0.Q15035754882231748864
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final dev.epro.r0.B13085836186769537379 u(dev.epro.r0.U4020053660465689583 r7) {
        /*
            r6 = this;
            dev.epro.r0.R6423080927537628451 r5 = new dev.epro.r0.R6423080927537628451
            r5.<init>(r7)
            r5.d = r6
        L7:
            java.lang.Object r4 = r6.M()
            boolean r7 = r4 instanceof dev.epro.r0.S13297578932192364679
            if (r7 == 0) goto L30
            r7 = r4
            dev.epro.r0.S13297578932192364679 r7 = (dev.epro.r0.S13297578932192364679) r7
            boolean r0 = r7.a
            if (r0 == 0) goto L2b
        L16:
            sun.misc.Unsafe r0 = dev.epro.r0.T5284056093300834442.a
            long r2 = dev.epro.r0.U4020053660465689583.b
            r1 = r6
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L22
            goto L75
        L22:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == r4) goto L29
            goto L46
        L29:
            r6 = r1
            goto L16
        L2b:
            r1 = r6
            r1.Z(r7)
            goto L46
        L30:
            r1 = r6
            boolean r6 = r4 instanceof dev.epro.r0.D14012262140144083539
            dev.epro.r0.F15788397839700158005 r7 = dev.epro.r0.F15788397839700158005.a
            r0 = 0
            if (r6 == 0) goto L77
            r6 = r4
            dev.epro.r0.D14012262140144083539 r6 = (dev.epro.r0.D14012262140144083539) r6
            dev.epro.r0.D15128981762807597517 r6 = r6.d()
            if (r6 != 0) goto L48
            dev.epro.r0.Z3069203969753053913 r4 = (dev.epro.r0.Z3069203969753053913) r4
            r1.a0(r4)
        L46:
            r6 = r1
            goto L7
        L48:
            r2 = 7
            boolean r2 = r6.e(r5, r2)
            if (r2 == 0) goto L50
            goto L75
        L50:
            r2 = 3
            boolean r6 = r6.e(r5, r2)
            java.lang.Object r1 = r1.M()
            boolean r2 = r1 instanceof dev.epro.r0.G5200290475234668330
            if (r2 == 0) goto L64
            dev.epro.r0.G5200290475234668330 r1 = (dev.epro.r0.G5200290475234668330) r1
            java.lang.Throwable r0 = r1.c()
            goto L70
        L64:
            boolean r2 = r1 instanceof dev.epro.r0.T13610764347093379131
            if (r2 == 0) goto L6b
            dev.epro.r0.T13610764347093379131 r1 = (dev.epro.r0.T13610764347093379131) r1
            goto L6c
        L6b:
            r1 = r0
        L6c:
            if (r1 == 0) goto L70
            java.lang.Throwable r0 = r1.a
        L70:
            r5.n(r0)
            if (r6 == 0) goto L76
        L75:
            return r5
        L76:
            return r7
        L77:
            java.lang.Object r6 = r1.M()
            boolean r1 = r6 instanceof dev.epro.r0.T13610764347093379131
            if (r1 == 0) goto L82
            dev.epro.r0.T13610764347093379131 r6 = (dev.epro.r0.T13610764347093379131) r6
            goto L83
        L82:
            r6 = r0
        L83:
            if (r6 == 0) goto L87
            java.lang.Throwable r0 = r6.a
        L87:
            r5.n(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.U4020053660465689583.u(dev.epro.r0.U4020053660465689583):dev.epro.r0.B13085836186769537379");
    }

    @Override // dev.epro.r0.Q15035754882231748864
    public final Object v(R4833348786910499294 r4833348786910499294) {
        Object objM;
        O9245300239821758723 o9245300239821758723;
        do {
            objM = M();
            boolean z = objM instanceof D14012262140144083539;
            o9245300239821758723 = O9245300239821758723.a;
            if (!z) {
                J8045362843799184672.K(r4833348786910499294.getContext());
                return o9245300239821758723;
            }
        } while (b0(objM) < 0);
        H7219028874700587498 h7219028874700587498 = new H7219028874700587498(1, E18444280280170001567.H(r4833348786910499294));
        h7219028874700587498.t();
        h7219028874700587498.w(new T5499530138885127132(J8045362843799184672.c0(this, true, new I18276018097207738813(h7219028874700587498)), (byte) 2));
        Object objR = h7219028874700587498.r();
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (objR != z3437138737604933638) {
            objR = o9245300239821758723;
        }
        return objR == z3437138737604933638 ? objR : o9245300239821758723;
    }

    public void w(Object obj) {
        t(obj);
    }

    public final Object y(R4833348786910499294 r4833348786910499294) throws Throwable {
        Object objM;
        do {
            objM = M();
            if (!(objM instanceof D14012262140144083539)) {
                if (objM instanceof T13610764347093379131) {
                    throw ((T13610764347093379131) objM).a;
                }
                return O4077903568229246.X(objM);
            }
        } while (b0(objM) < 0);
        N10275480315124087338 n10275480315124087338 = new N10275480315124087338(E18444280280170001567.H(r4833348786910499294), this);
        n10275480315124087338.t();
        n10275480315124087338.w(new T5499530138885127132(J8045362843799184672.c0(this, true, new R4031171079172756347(n10275480315124087338)), (byte) 2));
        return n10275480315124087338.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00be, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v10 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 253
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
