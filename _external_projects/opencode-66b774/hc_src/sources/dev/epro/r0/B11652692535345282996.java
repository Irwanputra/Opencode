package dev.epro.r0;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B11652692535345282996 {
    public final W8455343525638953052 a;
    public final J15730374346044043770 b;
    public final C13374971588771233833 c;
    public boolean d = false;
    public int e = -1;

    public B11652692535345282996(W8455343525638953052 w8455343525638953052, J15730374346044043770 j15730374346044043770, ClassLoader classLoader, U1393585516073146670 u1393585516073146670, J13380993798601407787 j13380993798601407787) {
        this.a = w8455343525638953052;
        this.b = j15730374346044043770;
        C13374971588771233833 a = u1393585516073146670.a(j13380993798601407787.a);
        Bundle bundle = j13380993798601407787.j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        P14575954172000745949 p14575954172000745949 = a.r;
        if (p14575954172000745949 != null && (p14575954172000745949.E || p14575954172000745949.F)) {
            S10973172697741180971.m("Fragment already added and state has been saved");
            throw null;
        }
        a.f = bundle;
        a.e = j13380993798601407787.b;
        a.m = j13380993798601407787.c;
        a.f181o = true;
        a.v = j13380993798601407787.d;
        a.w = j13380993798601407787.e;
        a.x = j13380993798601407787.f;
        a.A = j13380993798601407787.g;
        a.l = j13380993798601407787.h;
        a.z = j13380993798601407787.i;
        a.y = j13380993798601407787.k;
        a.K = Q14196755420833223976.values()[j13380993798601407787.l];
        Bundle bundle2 = j13380993798601407787.m;
        if (bundle2 != null) {
            a.b = bundle2;
        } else {
            a.b = new Bundle();
        }
        this.c = a;
    }

    public final void a() {
        C13374971588771233833 c13374971588771233833 = this.c;
        c13374971588771233833.t.I();
        c13374971588771233833.a = 3;
        c13374971588771233833.C = false;
        c13374971588771233833.C = true;
        if (!c13374971588771233833.C) {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onActivityCreated()");
            return;
        }
        c13374971588771233833.b = null;
        P14575954172000745949 p14575954172000745949 = c13374971588771233833.t;
        p14575954172000745949.E = false;
        p14575954172000745949.F = false;
        p14575954172000745949.L.g = false;
        p14575954172000745949.s(4);
        this.a.n(false);
    }

    public final void b() {
        C13374971588771233833 c13374971588771233833 = this.c;
        C13374971588771233833 c133749715887712338332 = c13374971588771233833.g;
        B11652692535345282996 b11652692535345282996 = null;
        J15730374346044043770 j15730374346044043770 = this.b;
        if (c133749715887712338332 != null) {
            B11652692535345282996 b116526925353452829962 = (B11652692535345282996) ((HashMap) j15730374346044043770.d).get(c133749715887712338332.e);
            if (b116526925353452829962 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(c13374971588771233833);
                C13374971588771233833 c133749715887712338333 = c13374971588771233833.g;
                sb.append(" declared target fragment ");
                sb.append(c133749715887712338333);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            c13374971588771233833.h = c13374971588771233833.g.e;
            c13374971588771233833.g = null;
            b11652692535345282996 = b116526925353452829962;
        } else {
            String str = c13374971588771233833.h;
            if (str != null && (b11652692535345282996 = (B11652692535345282996) ((HashMap) j15730374346044043770.d).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(c13374971588771233833);
                sb2.append(" declared target fragment ");
                S10973172697741180971.m(G6547577305291411977.u(sb2, c13374971588771233833.h, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (b11652692535345282996 != null) {
            b11652692535345282996.j();
        }
        P14575954172000745949 p14575954172000745949 = c13374971588771233833.r;
        c13374971588771233833.s = p14575954172000745949.t;
        c13374971588771233833.u = p14575954172000745949.v;
        W8455343525638953052 w8455343525638953052 = this.a;
        w8455343525638953052.t(false);
        ArrayList arrayList = c13374971588771233833.P;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C13374971588771233833 c133749715887712338334 = ((X6729807414707112278) obj).a;
            ((U8000365519789522238) c133749715887712338334.O.b).a();
            C775827382551829194.J(c133749715887712338334);
        }
        arrayList.clear();
        c13374971588771233833.t.b(c13374971588771233833.s, c13374971588771233833.c(), c13374971588771233833);
        c13374971588771233833.a = 0;
        c13374971588771233833.C = false;
        c13374971588771233833.q(c13374971588771233833.s.r);
        if (!c13374971588771233833.C) {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onAttach()");
            return;
        }
        Iterator it = c13374971588771233833.r.m.iterator();
        while (it.hasNext()) {
            ((T10859954020941270144) it.next()).c();
        }
        P14575954172000745949 p145759541720007459492 = c13374971588771233833.t;
        p145759541720007459492.E = false;
        p145759541720007459492.F = false;
        p145759541720007459492.L.g = false;
        p145759541720007459492.s(0);
        w8455343525638953052.o(false);
    }

    public final int c() {
        C13374971588771233833 c13374971588771233833 = this.c;
        if (c13374971588771233833.r == null) {
            return c13374971588771233833.a;
        }
        int i = this.e;
        int ordinal = c13374971588771233833.K.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (c13374971588771233833.m) {
            boolean z = c13374971588771233833.n;
            int i2 = this.e;
            i = z ? Math.max(i2, 2) : i2 < 4 ? Math.min(i, c13374971588771233833.a) : Math.min(i, 1);
        }
        if (!c13374971588771233833.k) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = c13374971588771233833.D;
        if (viewGroup != null) {
            K16824163401944882247 d = K16824163401944882247.d(viewGroup, c13374971588771233833.k().C());
            ArrayList arrayList = d.b;
            if (arrayList.size() > 0) {
                ((G10824784060060027788) arrayList.get(0)).getClass();
                throw null;
            }
            ArrayList arrayList2 = d.c;
            if (arrayList2.size() > 0) {
                ((G10824784060060027788) arrayList2.get(0)).getClass();
                throw null;
            }
        }
        if (c13374971588771233833.l) {
            i = c13374971588771233833.o() ? Math.min(i, 1) : Math.min(i, -1);
        }
        return (!c13374971588771233833.E || c13374971588771233833.a >= 5) ? i : Math.min(i, 4);
    }

    public final void d() {
        Parcelable parcelable;
        C13374971588771233833 c13374971588771233833 = this.c;
        boolean z = c13374971588771233833.I;
        Bundle bundle = c13374971588771233833.b;
        if (z) {
            if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
                c13374971588771233833.t.N(parcelable);
                P14575954172000745949 p14575954172000745949 = c13374971588771233833.t;
                p14575954172000745949.E = false;
                p14575954172000745949.F = false;
                p14575954172000745949.L.g = false;
                p14575954172000745949.s(1);
            }
            c13374971588771233833.a = 1;
            return;
        }
        W8455343525638953052 w8455343525638953052 = this.a;
        w8455343525638953052.u(false);
        Bundle bundle2 = c13374971588771233833.b;
        c13374971588771233833.t.I();
        c13374971588771233833.a = 1;
        c13374971588771233833.C = false;
        c13374971588771233833.L.a(new T2895949985821598034());
        c13374971588771233833.O.v(bundle2);
        c13374971588771233833.r(bundle2);
        c13374971588771233833.I = true;
        if (!c13374971588771233833.C) {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onCreate()");
        } else {
            c13374971588771233833.L.e(P72364327365747079.ON_CREATE);
            w8455343525638953052.p(false);
        }
    }

    public final void e() {
        String str;
        C13374971588771233833 c13374971588771233833 = this.c;
        if (c13374971588771233833.m) {
            return;
        }
        LayoutInflater u = c13374971588771233833.u(c13374971588771233833.b);
        ViewGroup viewGroup = c13374971588771233833.D;
        if (viewGroup == null) {
            int i = c13374971588771233833.w;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + c13374971588771233833 + " for a container view with no id");
                }
                viewGroup = (ViewGroup) c13374971588771233833.r.u.S(i);
                if (viewGroup == null) {
                    if (!c13374971588771233833.f181o) {
                        try {
                            str = c13374971588771233833.z().getResources().getResourceName(c13374971588771233833.w);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(c13374971588771233833.w) + " (" + str + ") for fragment " + c13374971588771233833);
                    }
                } else if (!(viewGroup instanceof B8973123839147806920)) {
                    Z6416034831270929891 z6416034831270929891 = X3799397131215715439.a;
                    new D1853448697196391467("Attempting to add fragment " + c13374971588771233833 + " to container " + viewGroup + " which is not a FragmentContainerView");
                    X3799397131215715439.a(c13374971588771233833).getClass();
                }
            }
        }
        c13374971588771233833.D = viewGroup;
        c13374971588771233833.y(u, viewGroup, c13374971588771233833.b);
        c13374971588771233833.a = 2;
    }

    public final void f() {
        C13374971588771233833 A;
        C13374971588771233833 c13374971588771233833 = this.c;
        int i = 0;
        boolean z = c13374971588771233833.l && !c13374971588771233833.o();
        J15730374346044043770 j15730374346044043770 = this.b;
        if (z) {
        }
        if (!z) {
            J12447903228903363333 j12447903228903363333 = (J12447903228903363333) j15730374346044043770.b;
            if (!((j12447903228903363333.b.containsKey(c13374971588771233833.e) && j12447903228903363333.e) ? j12447903228903363333.f : true)) {
                String str = c13374971588771233833.h;
                if (str != null && (A = j15730374346044043770.A(str)) != null && A.A) {
                    c13374971588771233833.g = A;
                }
                c13374971588771233833.a = 0;
                return;
            }
        }
        boolean z2 = c13374971588771233833.s != null ? ((J12447903228903363333) j15730374346044043770.b).f : !r5.r.isChangingConfigurations();
        if (z || z2) {
            ((J12447903228903363333) j15730374346044043770.b).e(c13374971588771233833.e);
        }
        c13374971588771233833.t.j();
        c13374971588771233833.L.e(P72364327365747079.ON_DESTROY);
        c13374971588771233833.a = 0;
        c13374971588771233833.C = false;
        c13374971588771233833.I = false;
        c13374971588771233833.C = true;
        if (!c13374971588771233833.C) {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onDestroy()");
            return;
        }
        this.a.q(false);
        ArrayList E = j15730374346044043770.E();
        int size = E.size();
        while (i < size) {
            Object obj = E.get(i);
            i++;
            B11652692535345282996 b11652692535345282996 = (B11652692535345282996) obj;
            if (b11652692535345282996 != null) {
                C13374971588771233833 c133749715887712338332 = b11652692535345282996.c;
                if (c13374971588771233833.e.equals(c133749715887712338332.h)) {
                    c133749715887712338332.g = c13374971588771233833;
                    c133749715887712338332.h = null;
                }
            }
        }
        String str2 = c13374971588771233833.h;
        if (str2 != null) {
            c13374971588771233833.g = j15730374346044043770.A(str2);
        }
        j15730374346044043770.O(this);
    }

    public final void g() {
        C13374971588771233833 c13374971588771233833 = this.c;
        c13374971588771233833.t.s(1);
        c13374971588771233833.a = 1;
        c13374971588771233833.C = false;
        c13374971588771233833.s();
        if (!c13374971588771233833.C) {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onDestroyView()");
            return;
        }
        L3530692241870850490 i = c13374971588771233833.i();
        i.getClass();
        H6810052497267380403 h6810052497267380403 = H6810052497267380403.b;
        h6810052497267380403.getClass();
        J15730374346044043770 j15730374346044043770 = new J15730374346044043770(i, R7426518007885973761.c, h6810052497267380403);
        V6281043481934004271 a = J17975719213314763068.a(R7426518007885973761.class);
        String b = a.b();
        if (b == null) {
            S10973172697741180971.j("Local and anonymous classes can not be ViewModels");
            return;
        }
        E8321115364184429049 e8321115364184429049 = ((R7426518007885973761) j15730374346044043770.L(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b))).b;
        if (e8321115364184429049.d() > 0) {
            e8321115364184429049.e(0).getClass();
            Z3383101362411723454.s();
            return;
        }
        c13374971588771233833.p = false;
        this.a.z(false);
        c13374971588771233833.D = null;
        c13374971588771233833.M.e(null);
        c13374971588771233833.n = false;
    }

    public final void h() {
        C13374971588771233833 c13374971588771233833 = this.c;
        c13374971588771233833.a = -1;
        c13374971588771233833.C = false;
        c13374971588771233833.t();
        if (!c13374971588771233833.C) {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onDetach()");
            return;
        }
        P14575954172000745949 p14575954172000745949 = c13374971588771233833.t;
        if (!p14575954172000745949.G) {
            p14575954172000745949.j();
            c13374971588771233833.t = new P14575954172000745949();
        }
        this.a.r(false);
        c13374971588771233833.a = -1;
        c13374971588771233833.s = null;
        c13374971588771233833.u = null;
        c13374971588771233833.r = null;
        if (!c13374971588771233833.l || c13374971588771233833.o()) {
            J12447903228903363333 j12447903228903363333 = (J12447903228903363333) this.b.b;
            if (!((j12447903228903363333.b.containsKey(c13374971588771233833.e) && j12447903228903363333.e) ? j12447903228903363333.f : true)) {
                return;
            }
        }
        c13374971588771233833.m();
    }

    public final void i() {
        C13374971588771233833 c13374971588771233833 = this.c;
        if (c13374971588771233833.m && c13374971588771233833.n && !c13374971588771233833.p) {
            c13374971588771233833.y(c13374971588771233833.u(c13374971588771233833.b), null, c13374971588771233833.b);
        }
    }

    public final void j() {
        J15730374346044043770 j15730374346044043770 = this.b;
        C13374971588771233833 c13374971588771233833 = this.c;
        if (this.d) {
            return;
        }
        try {
            this.d = true;
            boolean z = false;
            while (true) {
                int c = c();
                int i = c13374971588771233833.a;
                if (c == i) {
                    if (!z && i == -1 && c13374971588771233833.l && !c13374971588771233833.o()) {
                        ((J12447903228903363333) j15730374346044043770.b).e(c13374971588771233833.e);
                        j15730374346044043770.O(this);
                        c13374971588771233833.m();
                    }
                    if (c13374971588771233833.H) {
                        P14575954172000745949 p14575954172000745949 = c13374971588771233833.r;
                        if (p14575954172000745949 != null && c13374971588771233833.k && P14575954172000745949.D(c13374971588771233833)) {
                            p14575954172000745949.D = true;
                        }
                        c13374971588771233833.H = false;
                        c13374971588771233833.t.m();
                    }
                    this.d = false;
                    return;
                }
                if (c <= i) {
                    switch (i - 1) {
                        case -1:
                            h();
                            break;
                        case 0:
                            f();
                            break;
                        case 1:
                            g();
                            c13374971588771233833.a = 1;
                            break;
                        case 2:
                            c13374971588771233833.n = false;
                            c13374971588771233833.a = 2;
                            break;
                        case 3:
                            c13374971588771233833.a = 3;
                            break;
                        case 4:
                            n();
                            break;
                        case 5:
                            c13374971588771233833.a = 5;
                            break;
                        case 6:
                            c13374971588771233833.t.s(5);
                            c13374971588771233833.L.e(P72364327365747079.ON_PAUSE);
                            c13374971588771233833.a = 6;
                            c13374971588771233833.C = true;
                            this.a.s(false);
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            d();
                            break;
                        case 2:
                            i();
                            e();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            c13374971588771233833.a = 4;
                            break;
                        case 5:
                            m();
                            break;
                        case 6:
                            c13374971588771233833.a = 6;
                            break;
                        case 7:
                            l();
                            break;
                    }
                }
                z = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void k(ClassLoader classLoader) {
        C13374971588771233833 c13374971588771233833 = this.c;
        Bundle bundle = c13374971588771233833.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        c13374971588771233833.c = c13374971588771233833.b.getSparseParcelableArray("android:view_state");
        c13374971588771233833.d = c13374971588771233833.b.getBundle("android:view_registry_state");
        String string = c13374971588771233833.b.getString("android:target_state");
        c13374971588771233833.h = string;
        if (string != null) {
            c13374971588771233833.i = c13374971588771233833.b.getInt("android:target_req_state", 0);
        }
        boolean z = c13374971588771233833.b.getBoolean("android:user_visible_hint", true);
        c13374971588771233833.F = z;
        if (z) {
            return;
        }
        c13374971588771233833.E = true;
    }

    public final void l() {
        C13374971588771233833 c13374971588771233833 = this.c;
        J6694999111306656479 j6694999111306656479 = c13374971588771233833.G;
        View view = j6694999111306656479 == null ? null : j6694999111306656479.i;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        c13374971588771233833.d().i = null;
        c13374971588771233833.t.I();
        c13374971588771233833.t.x(true);
        c13374971588771233833.a = 7;
        c13374971588771233833.C = false;
        c13374971588771233833.C = true;
        if (!c13374971588771233833.C) {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onResume()");
            return;
        }
        c13374971588771233833.L.e(P72364327365747079.ON_RESUME);
        P14575954172000745949 p14575954172000745949 = c13374971588771233833.t;
        p14575954172000745949.E = false;
        p14575954172000745949.F = false;
        p14575954172000745949.L.g = false;
        p14575954172000745949.s(7);
        this.a.v(false);
        c13374971588771233833.b = null;
        c13374971588771233833.c = null;
        c13374971588771233833.d = null;
    }

    public final void m() {
        C13374971588771233833 c13374971588771233833 = this.c;
        c13374971588771233833.t.I();
        c13374971588771233833.t.x(true);
        c13374971588771233833.a = 5;
        c13374971588771233833.C = false;
        c13374971588771233833.w();
        if (!c13374971588771233833.C) {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onStart()");
            return;
        }
        c13374971588771233833.L.e(P72364327365747079.ON_START);
        P14575954172000745949 p14575954172000745949 = c13374971588771233833.t;
        p14575954172000745949.E = false;
        p14575954172000745949.F = false;
        p14575954172000745949.L.g = false;
        p14575954172000745949.s(5);
        this.a.x(false);
    }

    public final void n() {
        C13374971588771233833 c13374971588771233833 = this.c;
        P14575954172000745949 p14575954172000745949 = c13374971588771233833.t;
        p14575954172000745949.F = true;
        p14575954172000745949.L.g = true;
        p14575954172000745949.s(4);
        c13374971588771233833.L.e(P72364327365747079.ON_STOP);
        c13374971588771233833.a = 4;
        c13374971588771233833.C = false;
        c13374971588771233833.x();
        if (c13374971588771233833.C) {
            this.a.y(false);
        } else {
            Q11088980322693754445.g(c13374971588771233833, " did not call through to super.onStop()");
        }
    }

    public B11652692535345282996(W8455343525638953052 w8455343525638953052, J15730374346044043770 j15730374346044043770, C13374971588771233833 c13374971588771233833) {
        this.a = w8455343525638953052;
        this.b = j15730374346044043770;
        this.c = c13374971588771233833;
    }

    public B11652692535345282996(W8455343525638953052 w8455343525638953052, J15730374346044043770 j15730374346044043770, C13374971588771233833 c13374971588771233833, J13380993798601407787 j13380993798601407787) {
        this.a = w8455343525638953052;
        this.b = j15730374346044043770;
        this.c = c13374971588771233833;
        c13374971588771233833.c = null;
        c13374971588771233833.d = null;
        c13374971588771233833.q = 0;
        c13374971588771233833.n = false;
        c13374971588771233833.k = false;
        C13374971588771233833 c133749715887712338332 = c13374971588771233833.g;
        c13374971588771233833.h = c133749715887712338332 != null ? c133749715887712338332.e : null;
        c13374971588771233833.g = null;
        Bundle bundle = j13380993798601407787.m;
        if (bundle != null) {
            c13374971588771233833.b = bundle;
        } else {
            c13374971588771233833.b = new Bundle();
        }
    }
}
