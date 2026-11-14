package dev.epro.r0;

import android.os.Build;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
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

    /* JADX WARN: Removed duplicated region for block: B:78:0x0252  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(dev.epro.r0.N3121440022506799205 r28) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K8408785450183178122.F(dev.epro.r0.N3121440022506799205):void");
    }

    @Override // dev.epro.r0.F3160751278268780235
    public final void d(Q12598757537405990809 q12598757537405990809) {
        boolean z = false;
        this.c = false;
        int iD = q12598757537405990809.a.d();
        this.d &= ~iD;
        this.e = null;
        I16671520673272369404 i16671520673272369404 = (I16671520673272369404) Q2070708025412773807.a.b(iD);
        if (i16671520673272369404 != null) {
            Object objG = this.f.g(i16671520673272369404);
            objG.getClass();
            Q1791978143083231206 q1791978143083231206 = (Q1791978143083231206) objG;
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
                Object objG = this.f.g(i16671520673272369404);
                objG.getClass();
                Q1791978143083231206 q1791978143083231206 = (Q1791978143083231206) objG;
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
            int iD = q12598757537405990809.a.d();
            this.d |= iD;
            I16671520673272369404 i16671520673272369404 = (I16671520673272369404) Q2070708025412773807.a.b(iD);
            if (i16671520673272369404 != null) {
                Object objG = this.f.g(i16671520673272369404);
                objG.getClass();
                Q1791978143083231206 q1791978143083231206 = (Q1791978143083231206) objG;
                Z1975157152518754667 z1975157152518754667I = n3121440022506799205.a.i(iD);
                long j = (((long) z1975157152518754667I.a) << 48) | (((long) z1975157152518754667I.b) << 32) | (((long) z1975157152518754667I.c) << 16) | ((long) z1975157152518754667I.d);
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
