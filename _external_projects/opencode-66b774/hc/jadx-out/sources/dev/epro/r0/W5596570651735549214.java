package dev.epro.r0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W5596570651735549214 extends Y5209789131793062978 {
    public final X13682529397961211704 a;
    public final I1632105416032993715 b;
    public final Object c;
    public Q15035754882231748864 d;
    public Throwable e;
    public final ArrayList f;
    public List g;
    public E13273723708836014930 h;
    public final D389890677992184566 i;
    public final ArrayList j;
    public final ArrayList k;
    public final A4559761392562572984 l;
    public final V10300877997588547986 m;
    public final A4559761392562572984 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final A4559761392562572984 f563o;
    public ArrayList p;
    public E13273723708836014930 q;
    public H7219028874700587498 r;
    public final S17255966974483065294 s;
    public boolean t;
    public final S17255966974483065294 u;
    public final I1632105416032993715 v;
    public final R5692663580087387669 w;
    public final G8001132634698687269 x;
    public final M10846389789027735899 y;
    public static final S17255966974483065294 z = D15913187640519482289.r(I9221312866721349709.d);
    public static final AtomicReference A = new AtomicReference(Boolean.FALSE);

    /* JADX WARN: Type inference failed for: r1v0, types: [dev.epro.r0.X15982999125463556553] */
    /* JADX WARN: Type inference failed for: r3v0, types: [dev.epro.r0.X15982999125463556553] */
    public W5596570651735549214(G8001132634698687269 g8001132634698687269) {
        final byte b = 0;
        X13682529397961211704 x13682529397961211704 = new X13682529397961211704((X15982999125463556553) new B13729205492206812220(this) { // from class: dev.epro.r0.X15982999125463556553
            public final /* synthetic */ W5596570651735549214 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b2 = b;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                W5596570651735549214 w5596570651735549214 = this.b;
                switch (b2) {
                    case 0:
                        w5596570651735549214.I();
                        break;
                    default:
                        w5596570651735549214.I();
                        break;
                }
                return o9245300239821758723;
            }
        });
        this.a = x13682529397961211704;
        final byte b2 = 1;
        this.b = new I1632105416032993715((X15982999125463556553) new B13729205492206812220(this) { // from class: dev.epro.r0.X15982999125463556553
            public final /* synthetic */ W5596570651735549214 b;

            {
                this.b = this;
            }

            @Override // dev.epro.r0.B13729205492206812220
            public final Object invoke() {
                byte b22 = b2;
                O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
                W5596570651735549214 w5596570651735549214 = this.b;
                switch (b22) {
                    case 0:
                        w5596570651735549214.I();
                        break;
                    default:
                        w5596570651735549214.I();
                        break;
                }
                return o9245300239821758723;
            }
        });
        this.c = new Object();
        this.f = new ArrayList();
        this.h = new E13273723708836014930();
        this.i = new D389890677992184566(0, new S12944751221596631194[16]);
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new A4559761392562572984();
        this.m = new V10300877997588547986((byte) 7);
        this.n = new A4559761392562572984();
        this.f563o = new A4559761392562572984();
        this.s = D15913187640519482289.r(null);
        this.u = D15913187640519482289.r(D1635665159522810927.c);
        this.v = new I1632105416032993715((byte) 11);
        R5692663580087387669 r5692663580087387669 = new R5692663580087387669((Q15035754882231748864) g8001132634698687269.get(P2382941533350862833.p));
        r5692663580087387669.j(new H8734584053421516944(this, (byte) 18));
        this.w = r5692663580087387669;
        this.x = g8001132634698687269.plus(x13682529397961211704).plus(r5692663580087387669);
        this.y = new M10846389789027735899((byte) 23);
    }

    public static final void B(W5596570651735549214 w5596570651735549214, Y6676784304453696344 y6676784304453696344, Y6676784304453696344 y66767843044536963442) {
        List list = y66767843044536963442.h;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Y6676784304453696344 y66767843044536963443 = (Y6676784304453696344) list.get(i);
                V10300877997588547986 v10300877997588547986 = w5596570651735549214.m;
                C4085811703908263224 c4085811703908263224 = y66767843044536963443.a;
                C1629617973188005475.a((A4559761392562572984) v10300877997588547986.b, c4085811703908263224, new M13361206075017990790(y66767843044536963443, y6676784304453696344));
                C1629617973188005475.a((A4559761392562572984) v10300877997588547986.c, y6676784304453696344, c4085811703908263224);
                B(w5596570651735549214, y6676784304453696344, y66767843044536963443);
            }
        }
    }

    public static final void K(ArrayList arrayList, W5596570651735549214 w5596570651735549214, S12944751221596631194 s12944751221596631194) {
        arrayList.clear();
        synchronized (w5596570651735549214.c) {
            Iterator it = w5596570651735549214.k.iterator();
            while (it.hasNext()) {
                Y6676784304453696344 y6676784304453696344 = (Y6676784304453696344) it.next();
                if (y6676784304453696344.c.equals(s12944751221596631194)) {
                    arrayList.add(y6676784304453696344);
                    it.remove();
                }
            }
        }
    }

    public static void z(A6237865184482427403 a6237865184482427403) {
        try {
            if (a6237865184482427403.w() instanceof Y12702511936777569777) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            a6237865184482427403.c();
        }
    }

    public final void A() {
        synchronized (this.c) {
            if (((D1635665159522810927) this.u.getValue()).compareTo(D1635665159522810927.e) >= 0) {
                S17255966974483065294 s17255966974483065294 = this.u;
                D1635665159522810927 d1635665159522810927 = D1635665159522810927.b;
                s17255966974483065294.getClass();
                s17255966974483065294.k(null, d1635665159522810927);
            }
        }
        this.w.c(null);
    }

    public final U15014152283416496379 C() {
        S17255966974483065294 s17255966974483065294 = this.u;
        int iCompareTo = ((D1635665159522810927) s17255966974483065294.getValue()).compareTo(D1635665159522810927.b);
        S17255966974483065294 s172559669744830652942 = this.s;
        ArrayList arrayList = this.k;
        ArrayList arrayList2 = this.j;
        D389890677992184566 d389890677992184566 = this.i;
        if (iCompareTo > 0) {
            Object value = s172559669744830652942.getValue();
            D1635665159522810927 d1635665159522810927 = D1635665159522810927.f;
            D1635665159522810927 d16356651595228109272 = D1635665159522810927.c;
            if (value == null) {
                if (this.d == null) {
                    this.h = new E13273723708836014930();
                    d389890677992184566.i();
                    if (D() || F()) {
                        d16356651595228109272 = D1635665159522810927.d;
                    }
                } else {
                    d16356651595228109272 = (d389890677992184566.c != 0 || this.h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || D() || F() || this.l.j()) ? d1635665159522810927 : D1635665159522810927.e;
                }
            }
            s17255966974483065294.getClass();
            s17255966974483065294.k(null, d16356651595228109272);
            if (d16356651595228109272 != d1635665159522810927) {
                return null;
            }
            H7219028874700587498 h7219028874700587498 = this.r;
            this.r = null;
            return h7219028874700587498;
        }
        List listH = H();
        int size = listH.size();
        for (int i = 0; i < size; i++) {
        }
        this.f.clear();
        this.g = O2161699089510411363.a;
        this.h = new E13273723708836014930();
        d389890677992184566.i();
        arrayList2.clear();
        arrayList.clear();
        this.p = null;
        H7219028874700587498 h72190288747005874982 = this.r;
        if (h72190288747005874982 != null) {
            h72190288747005874982.k(null);
        }
        this.r = null;
        s172559669744830652942.j(null);
        return null;
    }

    public final boolean D() {
        return !this.t && (((X13205888428499400927) ((I1581330382723795749) this.a.c).c).get() & 134217727) > 0;
    }

    public final boolean E() {
        return this.i.c != 0 || D() || F() || this.l.j();
    }

    public final boolean F() {
        return !this.t && (((X13205888428499400927) ((I1581330382723795749) this.b.c).c).get() & 134217727) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.c
            monitor-enter(r0)
            dev.epro.r0.E13273723708836014930 r1 = r2.h     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.h()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            dev.epro.r0.D389890677992184566 r1 = r2.i     // Catch: java.lang.Throwable -> L21
            int r1 = r1.c     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L12
            goto L23
        L12:
            boolean r1 = r2.D()     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L23
            boolean r2 = r2.F()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L1f
            goto L23
        L1f:
            r2 = 0
            goto L24
        L21:
            r2 = move-exception
            goto L26
        L23:
            r2 = 1
        L24:
            monitor-exit(r0)
            return r2
        L26:
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W5596570651735549214.G():boolean");
    }

    public final List H() {
        List list = this.g;
        if (list != null) {
            return list;
        }
        ArrayList arrayList = this.f;
        List arrayList2 = arrayList.isEmpty() ? O2161699089510411363.a : new ArrayList(arrayList);
        this.g = arrayList2;
        return arrayList2;
    }

    public final void I() {
        U15014152283416496379 u15014152283416496379C;
        synchronized (this.c) {
            u15014152283416496379C = C();
            if (((D1635665159522810927) this.u.getValue()).compareTo(D1635665159522810927.b) <= 0) {
                Throwable th = this.e;
                CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                cancellationException.initCause(th);
                throw cancellationException;
            }
        }
        if (u15014152283416496379C != null) {
            ((H7219028874700587498) u15014152283416496379C).resumeWith(O9245300239821758723.a);
        }
    }

    public final void J(S12944751221596631194 s12944751221596631194) {
        synchronized (this.c) {
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((Y6676784304453696344) arrayList.get(i)).c.equals(s12944751221596631194)) {
                    ArrayList arrayList2 = new ArrayList();
                    K(arrayList2, this, s12944751221596631194);
                    while (!arrayList2.isEmpty()) {
                        L(arrayList2, null);
                        K(arrayList2, this, s12944751221596631194);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0155, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015a, code lost:
    
        if (r4 >= r3) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0164, code lost:
    
        if (((dev.epro.r0.H9390398899829886498) r10.get(r4)).b == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0166, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0169, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0177, code lost:
    
        if (r8 >= r4) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0179, code lost:
    
        r11 = (dev.epro.r0.H9390398899829886498) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0181, code lost:
    
        if (r11.b != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0183, code lost:
    
        r11 = (dev.epro.r0.Y6676784304453696344) r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018c, code lost:
    
        if (r11 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018e, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0191, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0194, code lost:
    
        r4 = r16.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0197, code lost:
    
        dev.epro.r0.P17571903987102865660.n0(r16.k, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019c, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019d, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (r8 >= r4) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ad, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b6, code lost:
    
        if (((dev.epro.r0.H9390398899829886498) r11).b == null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01be, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List L(java.util.List r17, dev.epro.r0.E13273723708836014930 r18) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W5596570651735549214.L(java.util.List, dev.epro.r0.E13273723708836014930):java.util.List");
    }

    public final S12944751221596631194 M(S12944751221596631194 s12944751221596631194, E13273723708836014930 e13273723708836014930) {
        A6237865184482427403 a6237865184482427403C;
        if (s12944751221596631194.v.F || s12944751221596631194.w == 3) {
            return null;
        }
        E13273723708836014930 e132737237088360149302 = this.q;
        if (e132737237088360149302 == null || !e132737237088360149302.c(s12944751221596631194)) {
            H8734584053421516944 h8734584053421516944 = new H8734584053421516944(s12944751221596631194, (byte) 17);
            F16051537739966011766 f16051537739966011766 = new F16051537739966011766(s12944751221596631194, e13273723708836014930, (byte) 1);
            M4722199849958580248 m4722199849958580248H = D459204867321966484.h();
            A6237865184482427403 a6237865184482427403 = m4722199849958580248H instanceof A6237865184482427403 ? (A6237865184482427403) m4722199849958580248H : null;
            if (a6237865184482427403 == null || (a6237865184482427403C = a6237865184482427403.C(h8734584053421516944, f16051537739966011766)) == null) {
                S10973172697741180971.m("Cannot create a mutable snapshot of an read-only snapshot");
            } else {
                try {
                    M4722199849958580248 m4722199849958580248J = a6237865184482427403C.j();
                    if (e13273723708836014930 != null) {
                        try {
                            if (e13273723708836014930.h()) {
                                P3286589736814227645 p3286589736814227645 = new P3286589736814227645((Object) e13273723708836014930, (Object) s12944751221596631194, (byte) 20);
                                M3727281027331139839 m3727281027331139839 = s12944751221596631194.v;
                                if (m3727281027331139839.F) {
                                    N2332913310205178802.a("Preparing a composition while composing is not supported");
                                }
                                m3727281027331139839.F = true;
                                try {
                                    p3286589736814227645.invoke();
                                    m3727281027331139839.F = false;
                                } catch (Throwable th) {
                                    m3727281027331139839.F = false;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            M4722199849958580248.q(m4722199849958580248J);
                            throw th2;
                        }
                    }
                    boolean zY = s12944751221596631194.y();
                    M4722199849958580248.q(m4722199849958580248J);
                    if (zY) {
                        return s12944751221596631194;
                    }
                } finally {
                    z(a6237865184482427403C);
                }
            }
        }
        return null;
    }

    public final void N(Throwable th, S12944751221596631194 s12944751221596631194) throws Throwable {
        if (!((Boolean) A.get()).booleanValue() || (th instanceof R13294684162264377876)) {
            synchronized (this.c) {
                T5147730665491531531 t5147730665491531531 = (T5147730665491531531) this.s.getValue();
                if (t5147730665491531531 != null) {
                    throw t5147730665491531531.a;
                }
                S17255966974483065294 s17255966974483065294 = this.s;
                T5147730665491531531 t51477306654915315312 = new T5147730665491531531(th);
                s17255966974483065294.getClass();
                s17255966974483065294.k(null, t51477306654915315312);
            }
            throw th;
        }
        synchronized (this.c) {
            try {
                this.j.clear();
                this.i.i();
                this.h = new E13273723708836014930();
                this.k.clear();
                this.l.a();
                this.n.a();
                S17255966974483065294 s172559669744830652942 = this.s;
                T5147730665491531531 t51477306654915315313 = new T5147730665491531531(th);
                s172559669744830652942.getClass();
                s172559669744830652942.k(null, t51477306654915315313);
                if (s12944751221596631194 != null) {
                    P(s12944751221596631194);
                }
                if (C() != null) {
                    N2332913310205178802.a("expected to go to inactive state due to composition error");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean O() {
        boolean zE;
        synchronized (this.c) {
            if (this.h.g()) {
                return E();
            }
            List listH = H();
            Q16533201950876191546 q16533201950876191546 = new Q16533201950876191546(this.h);
            this.h = new E13273723708836014930();
            try {
                int size = listH.size();
                for (int i = 0; i < size; i++) {
                    ((S12944751221596631194) listH.get(i)).z(q16533201950876191546);
                    if (((D1635665159522810927) this.u.getValue()).compareTo(D1635665159522810927.b) <= 0) {
                        break;
                    }
                }
                synchronized (this.c) {
                    if (C() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zE = E();
                }
                return zE;
            } catch (Throwable th) {
                synchronized (this.c) {
                    E13273723708836014930 e13273723708836014930 = this.h;
                    int i2 = e13273723708836014930.d;
                    Iterator<E> it = q16533201950876191546.iterator();
                    while (it.hasNext()) {
                        e13273723708836014930.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void P(S12944751221596631194 s12944751221596631194) {
        ArrayList arrayList = this.p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.p = arrayList;
        }
        if (!arrayList.contains(s12944751221596631194)) {
            arrayList.add(s12944751221596631194);
        }
        if (this.f.remove(s12944751221596631194)) {
            this.g = null;
        }
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void a(S12944751221596631194 s12944751221596631194, L12639328004344855510 l12639328004344855510) throws Throwable {
        D1635665159522810927 d1635665159522810927;
        boolean z2;
        A6237865184482427403 a6237865184482427403C;
        boolean z3 = s12944751221596631194.v.F;
        synchronized (this.c) {
            D1635665159522810927 d16356651595228109272 = (D1635665159522810927) this.u.getValue();
            d1635665159522810927 = D1635665159522810927.b;
            z2 = d16356651595228109272.compareTo(d1635665159522810927) > 0 ? !H().contains(s12944751221596631194) : true;
        }
        try {
            H8734584053421516944 h8734584053421516944 = new H8734584053421516944(s12944751221596631194, (byte) 17);
            F16051537739966011766 f16051537739966011766 = new F16051537739966011766(s12944751221596631194, (Object) null, (byte) 1);
            M4722199849958580248 m4722199849958580248H = D459204867321966484.h();
            A6237865184482427403 a6237865184482427403 = m4722199849958580248H instanceof A6237865184482427403 ? (A6237865184482427403) m4722199849958580248H : null;
            if (a6237865184482427403 == null || (a6237865184482427403C = a6237865184482427403.C(h8734584053421516944, f16051537739966011766)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                M4722199849958580248 m4722199849958580248J = a6237865184482427403C.j();
                try {
                    s12944751221596631194.m(l12639328004344855510);
                    synchronized (this.c) {
                        if (((D1635665159522810927) this.u.getValue()).compareTo(d1635665159522810927) > 0 && !H().contains(s12944751221596631194)) {
                            this.f.add(s12944751221596631194);
                            this.g = null;
                        }
                    }
                    if (!z3) {
                        D459204867321966484.h().m();
                    }
                    try {
                        J(s12944751221596631194);
                        try {
                            s12944751221596631194.g();
                            s12944751221596631194.i();
                            if (z3) {
                                return;
                            }
                            D459204867321966484.h().m();
                        } catch (Throwable th) {
                            N(th, null);
                        }
                    } catch (Throwable th2) {
                        N(th2, s12944751221596631194);
                    }
                } finally {
                    M4722199849958580248.q(m4722199849958580248J);
                }
            } finally {
                z(a6237865184482427403C);
            }
        } catch (Throwable th3) {
            if (z2) {
                synchronized (this.c) {
                }
            }
            N(th3, s12944751221596631194);
        }
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final E13273723708836014930 b(S12944751221596631194 s12944751221596631194, Y16033830328113725410 y16033830328113725410, L12639328004344855510 l12639328004344855510) {
        I1632105416032993715 i1632105416032993715 = this.v;
        try {
            Y16033830328113725410 y160338303281137254102 = s12944751221596631194.p;
            s12944751221596631194.p = y16033830328113725410;
            try {
                a(s12944751221596631194, l12639328004344855510);
                E13273723708836014930 e13273723708836014930 = (E13273723708836014930) i1632105416032993715.e();
                if (e13273723708836014930 == null) {
                    e13273723708836014930 = L12621230156277355451.a;
                    e13273723708836014930.getClass();
                }
                return e13273723708836014930;
            } finally {
                s12944751221596631194.p = y160338303281137254102;
            }
        } finally {
            i1632105416032993715.w(null);
        }
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void c(Y6676784304453696344 y6676784304453696344) {
        U15014152283416496379 u15014152283416496379C;
        synchronized (this.c) {
            try {
                C1629617973188005475.a(this.l, y6676784304453696344.a, y6676784304453696344);
                if (y6676784304453696344.h != null) {
                    B(this, y6676784304453696344, y6676784304453696344);
                }
                u15014152283416496379C = C();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (u15014152283416496379C != null) {
            ((H7219028874700587498) u15014152283416496379C).resumeWith(O9245300239821758723.a);
        }
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final G8001132634698687269 k() {
        return this.x;
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void m(Y6676784304453696344 y6676784304453696344) {
        U15014152283416496379 u15014152283416496379C;
        synchronized (this.c) {
            this.k.add(y6676784304453696344);
            u15014152283416496379C = C();
        }
        if (u15014152283416496379C != null) {
            ((H7219028874700587498) u15014152283416496379C).resumeWith(O9245300239821758723.a);
        }
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void n(S12944751221596631194 s12944751221596631194) {
        U15014152283416496379 u15014152283416496379C;
        synchronized (this.c) {
            if (this.i.j(s12944751221596631194)) {
                u15014152283416496379C = null;
            } else {
                this.i.b(s12944751221596631194);
                u15014152283416496379C = C();
            }
        }
        if (u15014152283416496379C != null) {
            ((H7219028874700587498) u15014152283416496379C).resumeWith(O9245300239821758723.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    @Override // dev.epro.r0.Y5209789131793062978
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(dev.epro.r0.Y6676784304453696344 r18, dev.epro.r0.O13174596225133003133 r19, dev.epro.r0.E9133045636215945243 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.c
            monitor-enter(r3)
            dev.epro.r0.A4559761392562572984 r4 = r0.n     // Catch: java.lang.Throwable -> L80
            r4.n(r1, r2)     // Catch: java.lang.Throwable -> L80
            dev.epro.r0.A4559761392562572984 r4 = r0.f563o     // Catch: java.lang.Throwable -> L80
            java.lang.Object r1 = r4.g(r1)     // Catch: java.lang.Throwable -> L80
            if (r1 != 0) goto L1c
            dev.epro.r0.U9803441765912152712 r1 = dev.epro.r0.M17189296052689530719.b     // Catch: java.lang.Throwable -> L80
            r1.getClass()     // Catch: java.lang.Throwable -> L80
            goto L2f
        L1c:
            boolean r4 = r1 instanceof dev.epro.r0.U9803441765912152712     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L23
            dev.epro.r0.U9803441765912152712 r1 = (dev.epro.r0.U9803441765912152712) r1     // Catch: java.lang.Throwable -> L80
            goto L2f
        L23:
            java.lang.Object[] r4 = dev.epro.r0.M17189296052689530719.a     // Catch: java.lang.Throwable -> L80
            dev.epro.r0.U9803441765912152712 r4 = new dev.epro.r0.U9803441765912152712     // Catch: java.lang.Throwable -> L80
            r5 = 1
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L80
            r4.a(r1)     // Catch: java.lang.Throwable -> L80
            r1 = r4
        L2f:
            boolean r4 = r1.i()     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L8d
            dev.epro.r0.E1092155023341394263 r2 = r2.a     // Catch: java.lang.Throwable -> L80
            r4 = r20
            dev.epro.r0.A4559761392562572984 r1 = r2.c(r4, r1)     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r2 = r1.b     // Catch: java.lang.Throwable -> L80
            java.lang.Object[] r4 = r1.c     // Catch: java.lang.Throwable -> L80
            long[] r1 = r1.a     // Catch: java.lang.Throwable -> L80
            int r5 = r1.length     // Catch: java.lang.Throwable -> L80
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8d
            r6 = 0
            r7 = r6
        L4a:
            r8 = r1[r7]     // Catch: java.lang.Throwable -> L80
            long r10 = ~r8     // Catch: java.lang.Throwable -> L80
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L88
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L80
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L64:
            if (r12 >= r10) goto L86
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.32E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L82
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L80
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L80
            dev.epro.r0.O13174596225133003133 r13 = (dev.epro.r0.O13174596225133003133) r13     // Catch: java.lang.Throwable -> L80
            dev.epro.r0.Y6676784304453696344 r14 = (dev.epro.r0.Y6676784304453696344) r14     // Catch: java.lang.Throwable -> L80
            dev.epro.r0.A4559761392562572984 r15 = r0.n     // Catch: java.lang.Throwable -> L80
            r15.n(r14, r13)     // Catch: java.lang.Throwable -> L80
            goto L82
        L80:
            r0 = move-exception
            goto L8f
        L82:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L64
        L86:
            if (r10 != r11) goto L8d
        L88:
            if (r7 == r5) goto L8d
            int r7 = r7 + 1
            goto L4a
        L8d:
            monitor-exit(r3)
            return
        L8f:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.W5596570651735549214.o(dev.epro.r0.Y6676784304453696344, dev.epro.r0.O13174596225133003133, dev.epro.r0.E9133045636215945243):void");
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final O13174596225133003133 p(Y6676784304453696344 y6676784304453696344) {
        O13174596225133003133 o13174596225133003133;
        synchronized (this.c) {
            o13174596225133003133 = (O13174596225133003133) this.n.l(y6676784304453696344);
        }
        return o13174596225133003133;
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final E13273723708836014930 q(S12944751221596631194 s12944751221596631194, Y16033830328113725410 y16033830328113725410, E13273723708836014930 e13273723708836014930) {
        I1632105416032993715 i1632105416032993715 = this.v;
        try {
            O();
            s12944751221596631194.z(new Q16533201950876191546(e13273723708836014930));
            Y16033830328113725410 y160338303281137254102 = s12944751221596631194.p;
            s12944751221596631194.p = y16033830328113725410;
            try {
                S12944751221596631194 s12944751221596631194M = M(s12944751221596631194, null);
                if (s12944751221596631194M != null) {
                    J(s12944751221596631194);
                    s12944751221596631194M.g();
                    s12944751221596631194M.i();
                }
                E13273723708836014930 e132737237088360149302 = (E13273723708836014930) i1632105416032993715.e();
                if (e132737237088360149302 == null) {
                    e132737237088360149302 = L12621230156277355451.a;
                    e132737237088360149302.getClass();
                }
                return e132737237088360149302;
            } finally {
                s12944751221596631194.p = y160338303281137254102;
            }
        } finally {
            i1632105416032993715.w(null);
        }
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void t(V4878375136513573151 v4878375136513573151) {
        I1632105416032993715 i1632105416032993715 = this.v;
        E13273723708836014930 e13273723708836014930 = (E13273723708836014930) i1632105416032993715.e();
        if (e13273723708836014930 == null) {
            E13273723708836014930 e132737237088360149302 = L12621230156277355451.a;
            e13273723708836014930 = new E13273723708836014930();
            i1632105416032993715.w(e13273723708836014930);
        }
        e13273723708836014930.a(v4878375136513573151);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void u(S12944751221596631194 s12944751221596631194) {
        synchronized (this.c) {
            try {
                E13273723708836014930 e13273723708836014930 = this.q;
                if (e13273723708836014930 == null) {
                    E13273723708836014930 e132737237088360149302 = L12621230156277355451.a;
                    e13273723708836014930 = new E13273723708836014930();
                    this.q = e13273723708836014930;
                }
                e13273723708836014930.a(s12944751221596631194);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final P8628803860726212495 v(W2269277550458425547 w2269277550458425547) {
        I1632105416032993715 i1632105416032993715 = this.b;
        I1581330382723795749 i1581330382723795749 = (I1581330382723795749) i1632105416032993715.c;
        B7587227939599417975 b7587227939599417975 = new B7587227939599417975();
        b7587227939599417975.a = w2269277550458425547;
        return i1581330382723795749.d(b7587227939599417975, (P3286589736814227645) i1632105416032993715.d);
    }

    @Override // dev.epro.r0.Y5209789131793062978
    public final void y(S12944751221596631194 s12944751221596631194) {
        synchronized (this.c) {
            if (this.f.remove(s12944751221596631194)) {
                this.g = null;
            }
            this.i.l(s12944751221596631194);
            this.j.remove(s12944751221596631194);
        }
    }
}
