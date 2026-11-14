package dev.epro.r0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class K8408785450183178122 extends F3160751278268780235 implements Runnable, S15634377979812012213, View.OnAttachStateChangeListener {
    public boolean c;
    public int d;
    public N3121440022506799205 e;
    public final A4559761392562572984 f;
    public final P6024466796603310388 g;
    public final U9803441765912152712 h;
    public final R5670552972627103399 i;

    public K8408785450183178122() {
        super(1);
        A4559761392562572984 a4559761392562572984 = new A4559761392562572984(9);
        I16671520673272369404.a.getClass();
        a4559761392562572984.n(H5785256719710610036.b, new Q1791978143083231206("caption bar"));
        a4559761392562572984.n(H5785256719710610036.c, new Q1791978143083231206("display cutout"));
        a4559761392562572984.n(H5785256719710610036.d, new Q1791978143083231206("ime"));
        a4559761392562572984.n(H5785256719710610036.e, new Q1791978143083231206("mandatory system gestures"));
        a4559761392562572984.n(H5785256719710610036.f, new Q1791978143083231206("navigation bars"));
        a4559761392562572984.n(H5785256719710610036.g, new Q1791978143083231206("status bars"));
        a4559761392562572984.n(H5785256719710610036.h, new Q1791978143083231206("system gestures"));
        a4559761392562572984.n(H5785256719710610036.i, new Q1791978143083231206("tappable element"));
        a4559761392562572984.n(H5785256719710610036.j, new Q1791978143083231206("waterfall"));
        this.f = a4559761392562572984;
        this.g = new P6024466796603310388(0);
        this.h = new U9803441765912152712(4);
        this.i = new R5670552972627103399();
    }

    public final void F(N3121440022506799205 n3121440022506799205) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        Q9908018528090167751 q9908018528090167751 = Q2070708025412773807.a;
        int[] iArr3 = q9908018528090167751.b;
        Object[] objArr3 = q9908018528090167751.c;
        long[] jArr3 = q9908018528090167751.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            I16671520673272369404 i16671520673272369404 = (I16671520673272369404) objArr3[i6];
                            Z1975157152518754667 i8 = n3121440022506799205.a.i(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (i8.a << 48) | (i8.b << 32) | (i8.c << 16) | i8.d;
                            Object g = this.f.g(i16671520673272369404);
                            g.getClass();
                            Q1791978143083231206 q1791978143083231206 = (Q1791978143083231206) g;
                            j2 = j3;
                            if (!D6215562826263076784.l(j4, q1791978143083231206.h)) {
                                q1791978143083231206.h = j4;
                                z2 = true;
                                if (!D6215562826263076784.l(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                Z1975157152518754667 j5 = n3121440022506799205.a.j(i7);
                                objArr2 = objArr3;
                                long j6 = (j5.b << 32) | (j5.a << 48) | (j5.c << 16) | j5.d;
                                if (!D6215562826263076784.l(q1791978143083231206.i, j6)) {
                                    q1791978143083231206.i = j6;
                                    z2 = true;
                                    if (!D6215562826263076784.l(j6, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            q1791978143083231206.a.setValue(Boolean.valueOf(n3121440022506799205.a.u(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        R825017289975842005 h = n3121440022506799205.a.h();
        if (h == null) {
            j = 0;
        } else {
            Z1975157152518754667 a = h.a();
            j = (a.a << c3) | (a.b << c2) | (a.c << c) | a.d;
        }
        A4559761392562572984 a4559761392562572984 = this.f;
        I16671520673272369404.a.getClass();
        Object g2 = a4559761392562572984.g(H5785256719710610036.j);
        g2.getClass();
        Q1791978143083231206 q17919781430832312062 = (Q1791978143083231206) g2;
        q17919781430832312062.a.setValue(Boolean.valueOf(!D6215562826263076784.l(j, 0L)));
        if (!D6215562826263076784.l(q17919781430832312062.h, j)) {
            q17919781430832312062.h = j;
            q17919781430832312062.i = j;
            z2 = z;
            if (!D6215562826263076784.l(j, 0L)) {
                z3 = z2;
            }
        }
        if (h == null) {
            U9803441765912152712 u9803441765912152712 = this.h;
            if (u9803441765912152712.b > 0) {
                u9803441765912152712.d();
                this.i.clear();
                z2 = z;
            }
        } else {
            List e = Build.VERSION.SDK_INT >= 28 ? C15025379344307230271.e(h.a) : Collections.EMPTY_LIST;
            int size = e.size();
            U9803441765912152712 u98034417659121527122 = this.h;
            if (size < u98034417659121527122.b) {
                u98034417659121527122.l(e.size(), this.h.b);
                this.i.i(e.size(), this.i.size());
                z2 = z;
            } else {
                int size2 = e.size() - this.h.b;
                int i9 = 0;
                while (i9 < size2) {
                    U9803441765912152712 u98034417659121527123 = this.h;
                    u98034417659121527123.a(V4416135141588678913.t(e.get(u98034417659121527123.b)));
                    this.i.add(new J17281777359809213045(G6547577305291411977.n(this.h.b, "display cutout rect ")));
                    i9++;
                    z2 = z;
                }
            }
            int size3 = e.size();
            for (int i10 = 0; i10 < size3; i10++) {
                Rect rect = (Rect) e.get(i10);
                W1972671267364756056 w1972671267364756056 = (W1972671267364756056) this.h.f(i10);
                if (!S10823041268949770285.t(w1972671267364756056.getValue(), rect)) {
                    w1972671267364756056.setValue(rect);
                    z2 = z;
                }
            }
            if (!e.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.g.g() != 0) && z2) {
            P6024466796603310388 p6024466796603310388 = this.g;
            p6024466796603310388.h(p6024466796603310388.g() + 1);
            synchronized (D459204867321966484.c) {
                E13273723708836014930 e13273723708836014930 = D459204867321966484.j.h;
                if (e13273723708836014930 != null) {
                    boolean z5 = z;
                    z4 = e13273723708836014930.h() == z5 ? z5 : false;
                }
            }
            if (z4) {
                D459204867321966484.c();
            }
        }
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void d(Q12598757537405990809 q12598757537405990809) {
        boolean z = false;
        this.c = false;
        int d = q12598757537405990809.a.d();
        this.d &= ~d;
        this.e = null;
        I16671520673272369404 i16671520673272369404 = (I16671520673272369404) Q2070708025412773807.a.b(d);
        if (i16671520673272369404 != null) {
            Object g = this.f.g(i16671520673272369404);
            g.getClass();
            Q1791978143083231206 q1791978143083231206 = (Q1791978143083231206) g;
            q1791978143083231206.c.h(0.0f);
            q1791978143083231206.e.h(1.0f);
            q1791978143083231206.d.h(0L);
            q1791978143083231206.c.h(0.0f);
            q1791978143083231206.b.setValue(Boolean.FALSE);
            q1791978143083231206.j = -1L;
            q1791978143083231206.k = -1L;
            P6024466796603310388 p6024466796603310388 = this.g;
            p6024466796603310388.h(p6024466796603310388.g() + 1);
            synchronized (D459204867321966484.c) {
                E13273723708836014930 e13273723708836014930 = D459204867321966484.j.h;
                if (e13273723708836014930 != null) {
                    if (e13273723708836014930.h()) {
                        z = true;
                    }
                }
            }
            if (z) {
                D459204867321966484.c();
            }
        }
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void e(Q12598757537405990809 q12598757537405990809) {
        this.c = true;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final N3121440022506799205 f(N3121440022506799205 n3121440022506799205, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Q12598757537405990809 q12598757537405990809 = (Q12598757537405990809) list.get(i);
            I16671520673272369404 i16671520673272369404 = (I16671520673272369404) Q2070708025412773807.a.b(q12598757537405990809.a.d());
            if (i16671520673272369404 != null) {
                Object g = this.f.g(i16671520673272369404);
                g.getClass();
                Q1791978143083231206 q1791978143083231206 = (Q1791978143083231206) g;
                if (((Boolean) q1791978143083231206.b.getValue()).booleanValue()) {
                    L9028203031476232898 l9028203031476232898 = q12598757537405990809.a;
                    q1791978143083231206.c.h(l9028203031476232898.c());
                    q1791978143083231206.e.h(l9028203031476232898.a());
                    q1791978143083231206.d.h(l9028203031476232898.b());
                }
            }
        }
        F(n3121440022506799205);
        return n3121440022506799205;
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final V10300877997588547986 g(Q12598757537405990809 q12598757537405990809, V10300877997588547986 v10300877997588547986) {
        N3121440022506799205 n3121440022506799205 = this.e;
        boolean z = false;
        this.c = false;
        this.e = null;
        if (q12598757537405990809.a.b() > 0 && n3121440022506799205 != null) {
            int d = q12598757537405990809.a.d();
            this.d |= d;
            I16671520673272369404 i16671520673272369404 = (I16671520673272369404) Q2070708025412773807.a.b(d);
            if (i16671520673272369404 != null) {
                Object g = this.f.g(i16671520673272369404);
                g.getClass();
                Q1791978143083231206 q1791978143083231206 = (Q1791978143083231206) g;
                Z1975157152518754667 i = n3121440022506799205.a.i(d);
                long j = (i.a << 48) | (i.b << 32) | (i.c << 16) | i.d;
                long j2 = q1791978143083231206.h;
                if (!D6215562826263076784.l(j, j2)) {
                    q1791978143083231206.j = j2;
                    q1791978143083231206.k = j;
                    q1791978143083231206.b.setValue(Boolean.TRUE);
                    L9028203031476232898 l9028203031476232898 = q12598757537405990809.a;
                    q1791978143083231206.c.h(l9028203031476232898.c());
                    q1791978143083231206.e.h(l9028203031476232898.a());
                    q1791978143083231206.d.h(l9028203031476232898.b());
                    P6024466796603310388 p6024466796603310388 = this.g;
                    p6024466796603310388.h(p6024466796603310388.g() + 1);
                    synchronized (D459204867321966484.c) {
                        E13273723708836014930 e13273723708836014930 = D459204867321966484.j.h;
                        if (e13273723708836014930 != null) {
                            if (e13273723708836014930.h()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        D459204867321966484.c();
                        return v10300877997588547986;
                    }
                }
            }
        }
        return v10300877997588547986;
    }

    @Override // dev.epro.r0.S15634377979812012213
    public final N3121440022506799205 h(View view, N3121440022506799205 n3121440022506799205) {
        if (this.c) {
            this.e = n3121440022506799205;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return n3121440022506799205;
            }
        } else if (this.d == 0) {
            F(n3121440022506799205);
        }
        return n3121440022506799205;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = W10240872260424387225.a;
        Q5747078841744593420.c(view, this);
        Q12598757537405990809.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = W10240872260424387225.a;
        Q5747078841744593420.c(view, null);
        Q12598757537405990809.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.d = 0;
            this.c = false;
            N3121440022506799205 n3121440022506799205 = this.e;
            if (n3121440022506799205 != null) {
                F(n3121440022506799205);
                this.e = null;
            }
        }
    }
}
