package dev.epro.r0;

import java.util.concurrent.CancellationException;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class H7219028874700587498 extends H14047115090875094711 implements U15014152283416496379, B10350247327218861320, J1083986568308928281 {
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final R4833348786910499294 d;
    public final G8001132634698687269 e;

    static {
        Unsafe unsafe = T5284056093300834442.a;
        f = unsafe.objectFieldOffset(H7219028874700587498.class.getDeclaredField("_decisionAndIndex$volatile"));
        h = unsafe.objectFieldOffset(H7219028874700587498.class.getDeclaredField("_state$volatile"));
        g = unsafe.objectFieldOffset(H7219028874700587498.class.getDeclaredField("_parentHandle$volatile"));
    }

    public H7219028874700587498(int i, R4833348786910499294 r4833348786910499294) {
        super(i);
        this.d = r4833348786910499294;
        this.e = r4833348786910499294.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = E17368208470737500956.a;
    }

    public static Object E(B9271643986061518267 b9271643986061518267, Object obj, int i, J12078565427869724451 j12078565427869724451) {
        if (obj instanceof T13610764347093379131) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (j12078565427869724451 != null || (b9271643986061518267 instanceof N8760694116812456657)) {
            return new X15830299412964774035(obj, b9271643986061518267 instanceof N8760694116812456657 ? (N8760694116812456657) b9271643986061518267 : null, j12078565427869724451, (Throwable) null, 16);
        }
        return obj;
    }

    public static void z(B9271643986061518267 b9271643986061518267, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + b9271643986061518267 + ", already has " + obj).toString());
    }

    public String A() {
        return "CancellableContinuation";
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r9.o();
        r9.k(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r10 = this;
            dev.epro.r0.R4833348786910499294 r0 = r10.d
            boolean r1 = r0 instanceof dev.epro.r0.N16152488056535110728
            r2 = 0
            if (r1 == 0) goto Lb
            dev.epro.r0.N16152488056535110728 r0 = (dev.epro.r0.N16152488056535110728) r0
            r4 = r0
            goto Lc
        Lb:
            r4 = r2
        Lc:
            if (r4 == 0) goto L63
            long r0 = dev.epro.r0.N16152488056535110728.h
        L10:
            sun.misc.Unsafe r3 = dev.epro.r0.T5284056093300834442.a
            java.lang.Object r7 = r3.getObjectVolatile(r4, r0)
            r3 = r7
            dev.epro.r0.D14731132657808549702 r7 = dev.epro.r0.J8045362843799184672.c
            if (r3 != r7) goto L32
        L1b:
            sun.misc.Unsafe r3 = dev.epro.r0.T5284056093300834442.a
            long r5 = dev.epro.r0.N16152488056535110728.h
            r8 = r10
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r9 = r8
            if (r10 == 0) goto L28
            goto L46
        L28:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 == r7) goto L30
            r10 = r9
            goto L10
        L30:
            r10 = r9
            goto L1b
        L32:
            r9 = r10
            boolean r10 = r3 instanceof java.lang.Throwable
            if (r10 == 0) goto L5d
            r7 = r3
        L38:
            sun.misc.Unsafe r3 = dev.epro.r0.T5284056093300834442.a
            long r5 = dev.epro.r0.N16152488056535110728.h
            r8 = 0
            boolean r10 = r3.compareAndSwapObject(r4, r5, r7, r8)
            if (r10 == 0) goto L50
            r2 = r7
            java.lang.Throwable r2 = (java.lang.Throwable) r2
        L46:
            if (r2 != 0) goto L49
            goto L63
        L49:
            r9.o()
            r9.k(r2)
            return
        L50:
            java.lang.Object r10 = r3.getObjectVolatile(r4, r0)
            if (r10 != r7) goto L57
            goto L38
        L57:
            java.lang.String r10 = "Failed requirement."
            dev.epro.r0.S10973172697741180971.j(r10)
            return
        L5d:
            r7 = r3
            java.lang.String r10 = "Inconsistent state "
            dev.epro.r0.Q11088980322693754445.i(r10, r7)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H7219028874700587498.B():void");
    }

    public final void C(Object obj, int i, J12078565427869724451 j12078565427869724451) {
        H7219028874700587498 h7219028874700587498;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof B9271643986061518267)) {
                H7219028874700587498 h72190288747005874982 = this;
                if (objectVolatile instanceof E5022200037506367224) {
                    E5022200037506367224 e5022200037506367224 = (E5022200037506367224) objectVolatile;
                    if (unsafe.compareAndSwapInt(e5022200037506367224, E5022200037506367224.c, 0, 1)) {
                        if (j12078565427869724451 != null) {
                            h72190288747005874982.m(j12078565427869724451, e5022200037506367224.a, obj);
                            return;
                        }
                        return;
                    }
                }
                Q11088980322693754445.i("Already resumed, but proposed with update ", obj);
                return;
            }
            Object E = E((B9271643986061518267) objectVolatile, obj, i, j12078565427869724451);
            while (true) {
                Unsafe unsafe2 = T5284056093300834442.a;
                h7219028874700587498 = this;
                if (unsafe2.compareAndSwapObject(h7219028874700587498, h, objectVolatile, E)) {
                    if (!h7219028874700587498.y()) {
                        h7219028874700587498.o();
                    }
                    h7219028874700587498.p(i);
                    return;
                } else if (unsafe2.getObjectVolatile(h7219028874700587498, j) != objectVolatile) {
                    break;
                } else {
                    this = h7219028874700587498;
                }
            }
            this = h7219028874700587498;
        }
    }

    public final void D(D11883231851729262595 d11883231851729262595) {
        R4833348786910499294 r4833348786910499294 = this.d;
        N16152488056535110728 n16152488056535110728 = r4833348786910499294 instanceof N16152488056535110728 ? (N16152488056535110728) r4833348786910499294 : null;
        C(O9245300239821758723.a, (n16152488056535110728 != null ? n16152488056535110728.d : null) == d11883231851729262595 ? 4 : this.c, null);
    }

    public final D14731132657808549702 F(Object obj, J12078565427869724451 j12078565427869724451) {
        H7219028874700587498 h7219028874700587498;
        D14731132657808549702 d14731132657808549702 = J8045362843799184672.a;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof B9271643986061518267)) {
                return null;
            }
            Object E = E((B9271643986061518267) objectVolatile, obj, this.c, j12078565427869724451);
            while (true) {
                Unsafe unsafe2 = T5284056093300834442.a;
                h7219028874700587498 = this;
                if (unsafe2.compareAndSwapObject(h7219028874700587498, h, objectVolatile, E)) {
                    if (!h7219028874700587498.y()) {
                        h7219028874700587498.o();
                    }
                    return d14731132657808549702;
                }
                if (unsafe2.getObjectVolatile(h7219028874700587498, j) != objectVolatile) {
                    break;
                }
                this = h7219028874700587498;
            }
            this = h7219028874700587498;
        }
    }

    @Override // dev.epro.r0.J1083986568308928281
    public final void a(X17453750288186724334 x17453750288186724334, int i) {
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if ((intVolatile & 536870911) != 536870911) {
                S10973172697741180971.m("invokeOnCancellation should be called at most once");
                return;
            }
            H7219028874700587498 h7219028874700587498 = this;
            if (unsafe.compareAndSwapInt(h7219028874700587498, j, intVolatile, ((intVolatile >> 29) << 29) + i)) {
                h7219028874700587498.w(x17453750288186724334);
                return;
            }
            this = h7219028874700587498;
        }
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final boolean b() {
        return s() instanceof B9271643986061518267;
    }

    @Override // dev.epro.r0.H14047115090875094711
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        H7219028874700587498 h7219028874700587498;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (objectVolatile instanceof B9271643986061518267) {
                S10973172697741180971.m("Not completed");
                return;
            }
            if (objectVolatile instanceof T13610764347093379131) {
                return;
            }
            if (objectVolatile instanceof X15830299412964774035) {
                X15830299412964774035 x15830299412964774035 = (X15830299412964774035) objectVolatile;
                if (x15830299412964774035.e != null) {
                    S10973172697741180971.m("Must be called at most once");
                    return;
                }
                X15830299412964774035 a = X15830299412964774035.a(x15830299412964774035, null, cancellationException, 15);
                while (true) {
                    Unsafe unsafe2 = T5284056093300834442.a;
                    H7219028874700587498 h72190288747005874982 = this;
                    if (unsafe2.compareAndSwapObject(h72190288747005874982, h, objectVolatile, a)) {
                        N8760694116812456657 n8760694116812456657 = x15830299412964774035.b;
                        if (n8760694116812456657 != null) {
                            h72190288747005874982.l(n8760694116812456657, cancellationException);
                        }
                        J12078565427869724451 j12078565427869724451 = x15830299412964774035.c;
                        if (j12078565427869724451 != null) {
                            h72190288747005874982.m(j12078565427869724451, cancellationException, x15830299412964774035.a);
                            return;
                        }
                        return;
                    }
                    if (unsafe2.getObjectVolatile(h72190288747005874982, j) != objectVolatile) {
                        cancellationException2 = cancellationException;
                        h7219028874700587498 = h72190288747005874982;
                        break;
                    }
                    this = h72190288747005874982;
                }
            } else {
                H7219028874700587498 h72190288747005874983 = this;
                CancellationException cancellationException3 = cancellationException;
                X15830299412964774035 x158302994129647740352 = new X15830299412964774035(objectVolatile, (N8760694116812456657) null, (J12078565427869724451) null, cancellationException3, 14);
                cancellationException2 = cancellationException3;
                while (true) {
                    X15830299412964774035 x158302994129647740353 = x158302994129647740352;
                    Unsafe unsafe3 = T5284056093300834442.a;
                    h7219028874700587498 = h72190288747005874983;
                    boolean compareAndSwapObject = unsafe3.compareAndSwapObject(h7219028874700587498, h, objectVolatile, x158302994129647740353);
                    x158302994129647740352 = x158302994129647740353;
                    if (compareAndSwapObject) {
                        return;
                    }
                    if (unsafe3.getObjectVolatile(h7219028874700587498, j) != objectVolatile) {
                        break;
                    } else {
                        h72190288747005874983 = h7219028874700587498;
                    }
                }
            }
            cancellationException = cancellationException2;
            this = h7219028874700587498;
        }
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final void d(Object obj, J12078565427869724451 j12078565427869724451) {
        C(obj, this.c, j12078565427869724451);
    }

    @Override // dev.epro.r0.H14047115090875094711
    public final R4833348786910499294 e() {
        return this.d;
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final D14731132657808549702 f(Object obj, J12078565427869724451 j12078565427869724451) {
        return F(obj, j12078565427869724451);
    }

    @Override // dev.epro.r0.H14047115090875094711
    public final Throwable g(Object obj) {
        Throwable g2 = super.g(obj);
        if (g2 != null) {
            return g2;
        }
        return null;
    }

    @Override // dev.epro.r0.B10350247327218861320
    public final B10350247327218861320 getCallerFrame() {
        R4833348786910499294 r4833348786910499294 = this.d;
        if (r4833348786910499294 instanceof B10350247327218861320) {
            return (B10350247327218861320) r4833348786910499294;
        }
        return null;
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final G8001132634698687269 getContext() {
        return this.e;
    }

    @Override // dev.epro.r0.H14047115090875094711
    public final Object h(Object obj) {
        return obj instanceof X15830299412964774035 ? ((X15830299412964774035) obj).a : obj;
    }

    @Override // dev.epro.r0.H14047115090875094711
    public final Object j() {
        return s();
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final boolean k(Throwable th) {
        H7219028874700587498 h7219028874700587498;
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = h;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (!(objectVolatile instanceof B9271643986061518267)) {
                return false;
            }
            E5022200037506367224 e5022200037506367224 = new E5022200037506367224(this, th, (objectVolatile instanceof N8760694116812456657) || (objectVolatile instanceof X17453750288186724334));
            while (true) {
                Unsafe unsafe2 = T5284056093300834442.a;
                h7219028874700587498 = this;
                if (unsafe2.compareAndSwapObject(h7219028874700587498, h, objectVolatile, e5022200037506367224)) {
                    B9271643986061518267 b9271643986061518267 = (B9271643986061518267) objectVolatile;
                    if (b9271643986061518267 instanceof N8760694116812456657) {
                        h7219028874700587498.l((N8760694116812456657) objectVolatile, th);
                    } else if (b9271643986061518267 instanceof X17453750288186724334) {
                        h7219028874700587498.n((X17453750288186724334) objectVolatile, th);
                    }
                    if (!h7219028874700587498.y()) {
                        h7219028874700587498.o();
                    }
                    h7219028874700587498.p(h7219028874700587498.c);
                    return true;
                }
                if (unsafe2.getObjectVolatile(h7219028874700587498, j) != objectVolatile) {
                    break;
                }
                this = h7219028874700587498;
            }
            this = h7219028874700587498;
        }
    }

    public final void l(N8760694116812456657 n8760694116812456657, Throwable th) {
        try {
            n8760694116812456657.b(th);
        } catch (Throwable th2) {
            C9869900372345142877.I(this.e, new M8821877208104636290("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(J12078565427869724451 j12078565427869724451, Throwable th, Object obj) {
        G8001132634698687269 g8001132634698687269 = this.e;
        try {
            j12078565427869724451.invoke(th, obj, g8001132634698687269);
        } catch (Throwable th2) {
            C9869900372345142877.I(g8001132634698687269, new M8821877208104636290("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(X17453750288186724334 x17453750288186724334, Throwable th) {
        G8001132634698687269 g8001132634698687269 = this.e;
        int intVolatile = T5284056093300834442.a.getIntVolatile(this, f) & 536870911;
        if (intVolatile == 536870911) {
            S10973172697741180971.m("The index for Segment.onCancellation(..) is broken");
            return;
        }
        try {
            x17453750288186724334.h(intVolatile, g8001132634698687269);
        } catch (Throwable th2) {
            C9869900372345142877.I(g8001132634698687269, new M8821877208104636290("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void o() {
        Unsafe unsafe = T5284056093300834442.a;
        long j = g;
        U16840712152025914198 u16840712152025914198 = (U16840712152025914198) unsafe.getObjectVolatile(this, j);
        if (u16840712152025914198 == null) {
            return;
        }
        u16840712152025914198.a();
        unsafe.putObjectVolatile(this, j, F15788397839700158005.a);
    }

    public final void p(int i) {
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i2 = intVolatile >> 29;
            if (i2 != 0) {
                if (i2 != 1) {
                    S10973172697741180971.m("Already resumed");
                    return;
                }
                boolean z = i == 4;
                R4833348786910499294 r4833348786910499294 = this.d;
                if (!z && (r4833348786910499294 instanceof N16152488056535110728)) {
                    boolean z2 = i == 1 || i == 2;
                    int i3 = this.c;
                    if (z2 == (i3 == 1 || i3 == 2)) {
                        N16152488056535110728 n16152488056535110728 = (N16152488056535110728) r4833348786910499294;
                        D11883231851729262595 d11883231851729262595 = n16152488056535110728.d;
                        G8001132634698687269 context = n16152488056535110728.e.getContext();
                        if (d11883231851729262595.B(context)) {
                            d11883231851729262595.z(context, this);
                            return;
                        }
                        I17129535152515035455 a = P13752028179861838617.a();
                        if (a.c >= 4294967296L) {
                            a.E(this);
                            return;
                        }
                        a.F(true);
                        try {
                            E12775674050813925581.K(this, r4833348786910499294, true);
                            do {
                            } while (a.H());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                E12775674050813925581.K(this, r4833348786910499294, z);
                return;
            }
            H7219028874700587498 h7219028874700587498 = this;
            if (unsafe.compareAndSwapInt(h7219028874700587498, j, intVolatile, 1073741824 + (536870911 & intVolatile))) {
                return;
            } else {
                this = h7219028874700587498;
            }
        }
    }

    public Throwable q(U4020053660465689583 u4020053660465689583) {
        return u4020053660465689583.o();
    }

    public final Object r() {
        Q15035754882231748864 q15035754882231748864;
        boolean y = y();
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            int i = intVolatile >> 29;
            if (i != 0) {
                if (i != 2) {
                    S10973172697741180971.m("Already suspended");
                    return null;
                }
                if (y) {
                    this.B();
                }
                Object s = this.s();
                if (s instanceof T13610764347093379131) {
                    throw ((T13610764347093379131) s).a;
                }
                int i2 = this.c;
                if ((i2 != 1 && i2 != 2) || (q15035754882231748864 = (Q15035754882231748864) this.e.get(P2382941533350862833.p)) == null || q15035754882231748864.b()) {
                    return this.h(s);
                }
                CancellationException o2 = q15035754882231748864.o();
                this.c(o2);
                throw o2;
            }
            H7219028874700587498 h7219028874700587498 = this;
            if (unsafe.compareAndSwapInt(h7219028874700587498, j, intVolatile, SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING + (536870911 & intVolatile))) {
                if (((U16840712152025914198) unsafe.getObjectVolatile(h7219028874700587498, g)) == null) {
                    h7219028874700587498.u();
                }
                if (y) {
                    h7219028874700587498.B();
                }
                return Z3437138737604933638.a;
            }
            this = h7219028874700587498;
        }
    }

    @Override // dev.epro.r0.R4833348786910499294
    public final void resumeWith(Object obj) {
        Throwable a = I11772848013184437928.a(obj);
        if (a != null) {
            obj = new T13610764347093379131(a, false);
        }
        C(obj, this.c, null);
    }

    public final Object s() {
        return T5284056093300834442.a.getObjectVolatile(this, h);
    }

    public final void t() {
        U16840712152025914198 u = u();
        if (u == null || (s() instanceof B9271643986061518267)) {
            return;
        }
        u.a();
        T5284056093300834442.a.putObjectVolatile(this, g, F15788397839700158005.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(A());
        sb.append('(');
        sb.append(D15445857918358799638.g0(this.d));
        sb.append("){");
        Object s = s();
        sb.append(s instanceof B9271643986061518267 ? "Active" : s instanceof E5022200037506367224 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(D15445857918358799638.I(this));
        return sb.toString();
    }

    public final U16840712152025914198 u() {
        Q15035754882231748864 q15035754882231748864 = (Q15035754882231748864) this.e.get(P2382941533350862833.p);
        if (q15035754882231748864 == null) {
            return null;
        }
        U16840712152025914198 c0 = J8045362843799184672.c0(q15035754882231748864, true, new M3903608651115003917(this));
        while (true) {
            Unsafe unsafe = T5284056093300834442.a;
            long j = g;
            H7219028874700587498 h7219028874700587498 = this;
            if (!unsafe.compareAndSwapObject(h7219028874700587498, j, (Object) null, c0) && unsafe.getObjectVolatile(h7219028874700587498, j) == null) {
                this = h7219028874700587498;
            }
        }
        return c0;
    }

    public final void v(F4096073349764486348 f4096073349764486348) {
        w(new T5499530138885127132(f4096073349764486348, (byte) 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c6, code lost:
    
        z(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c9, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(dev.epro.r0.B9271643986061518267 r11) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H7219028874700587498.w(dev.epro.r0.B9271643986061518267):void");
    }

    @Override // dev.epro.r0.U15014152283416496379
    public final void x(Object obj) {
        p(this.c);
    }

    public final boolean y() {
        if (this.c == 2) {
            return T5284056093300834442.a.getObjectVolatile((N16152488056535110728) this.d, N16152488056535110728.h) != null;
        }
        return false;
    }
}
