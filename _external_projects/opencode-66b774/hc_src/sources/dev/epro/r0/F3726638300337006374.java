package dev.epro.r0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class F3726638300337006374 {
    public final U11450443558875589191 a;
    public final S17255966974483065294 b;
    public final S17255966974483065294 c;
    public boolean d;
    public final S14249227312368728278 e;
    public final S14249227312368728278 f;
    public final E4135271276212975889 g;
    public final /* synthetic */ S2557420383749238385 h;

    public F3726638300337006374(S2557420383749238385 s2557420383749238385, E4135271276212975889 e4135271276212975889) {
        e4135271276212975889.getClass();
        this.h = s2557420383749238385;
        this.a = new U11450443558875589191((byte) 1);
        S17255966974483065294 r = D15913187640519482289.r(O2161699089510411363.a);
        this.b = r;
        S17255966974483065294 r2 = D15913187640519482289.r(H15747516787109764287.a);
        this.c = r2;
        this.e = new S14249227312368728278(r);
        this.f = new S14249227312368728278(r2);
        this.g = e4135271276212975889;
    }

    public final void a(R14289894334981469490 r14289894334981469490) {
        r14289894334981469490.getClass();
        synchronized (this.a) {
            S17255966974483065294 s17255966974483065294 = this.b;
            s17255966974483065294.k(null, R9411874267597469228.P0((Collection) s17255966974483065294.getValue(), r14289894334981469490));
        }
    }

    public final R14289894334981469490 b(V7801742040189616406 v7801742040189616406, Bundle bundle) {
        L841391951668269384 l841391951668269384 = this.h.b;
        l841391951668269384.getClass();
        return T15504973625601650233.a(l841391951668269384.a.c, v7801742040189616406, bundle, l841391951668269384.h(), l841391951668269384.f353o);
    }

    public final void c(R14289894334981469490 r14289894334981469490) {
        F6942723054099263096 f6942723054099263096;
        r14289894334981469490.getClass();
        L841391951668269384 l841391951668269384 = this.h.b;
        S17255966974483065294 s17255966974483065294 = l841391951668269384.h;
        String str = r14289894334981469490.f;
        LinkedHashMap linkedHashMap = l841391951668269384.w;
        boolean t = S10823041268949770285.t(linkedHashMap.get(r14289894334981469490), Boolean.TRUE);
        S17255966974483065294 s172559669744830652942 = this.c;
        s172559669744830652942.k(null, T8598786036980488824.p((Set) s172559669744830652942.getValue(), r14289894334981469490));
        linkedHashMap.remove(r14289894334981469490);
        N11678082982039175888 n11678082982039175888 = l841391951668269384.f;
        if (n11678082982039175888.contains(r14289894334981469490)) {
            if (this.d) {
                return;
            }
            l841391951668269384.s();
            S17255966974483065294 s172559669744830652943 = l841391951668269384.g;
            ArrayList arrayList = new ArrayList(n11678082982039175888);
            s172559669744830652943.getClass();
            s172559669744830652943.k(null, arrayList);
            ArrayList p = l841391951668269384.p();
            s17255966974483065294.getClass();
            s17255966974483065294.k(null, p);
            return;
        }
        l841391951668269384.r(r14289894334981469490);
        if (r14289894334981469490.k.h.compareTo(Q14196755420833223976.c) >= 0) {
            r14289894334981469490.m = Q14196755420833223976.a;
            r14289894334981469490.d();
        }
        if (!n11678082982039175888.isEmpty()) {
            Iterator it = n11678082982039175888.iterator();
            while (it.hasNext()) {
                if (((R14289894334981469490) it.next()).f.equals(str)) {
                    break;
                }
            }
        }
        if (!t && (f6942723054099263096 = l841391951668269384.f353o) != null) {
            f6942723054099263096.d(str);
        }
        l841391951668269384.s();
        ArrayList p2 = l841391951668269384.p();
        s17255966974483065294.getClass();
        s17255966974483065294.k(null, p2);
    }

    public final void d(R14289894334981469490 r14289894334981469490, boolean z) {
        r14289894334981469490.getClass();
        L841391951668269384 l841391951668269384 = this.h.b;
        P3286589736814227645 p3286589736814227645 = new P3286589736814227645(this, r14289894334981469490, z);
        l841391951668269384.getClass();
        E4135271276212975889 b = l841391951668269384.s.b(r14289894334981469490.b.a);
        l841391951668269384.w.put(r14289894334981469490, Boolean.valueOf(z));
        if (!b.equals(this.g)) {
            Object obj = l841391951668269384.t.get(b);
            obj.getClass();
            ((F3726638300337006374) obj).d(r14289894334981469490, z);
            return;
        }
        C8860366629087389742 c8860366629087389742 = l841391951668269384.v;
        if (c8860366629087389742 != null) {
            c8860366629087389742.invoke(r14289894334981469490);
            p3286589736814227645.invoke();
            return;
        }
        N11678082982039175888 n11678082982039175888 = l841391951668269384.f;
        int indexOf = n11678082982039175888.indexOf(r14289894334981469490);
        if (indexOf < 0) {
            r14289894334981469490.toString();
            return;
        }
        int i = indexOf + 1;
        if (i != n11678082982039175888.c) {
            l841391951668269384.l(((R14289894334981469490) n11678082982039175888.get(i)).b.b.a, true, false);
        }
        L841391951668269384.o(l841391951668269384, r14289894334981469490);
        p3286589736814227645.invoke();
        l841391951668269384.b.invoke();
        l841391951668269384.b();
    }

    public final void e(R14289894334981469490 r14289894334981469490, boolean z) {
        Object obj;
        r14289894334981469490.getClass();
        T10320069907180517450 t10320069907180517450 = this.e.a;
        S17255966974483065294 s17255966974483065294 = this.c;
        Iterable iterable = (Iterable) s17255966974483065294.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((R14289894334981469490) it.next()) == r14289894334981469490) {
                    Iterable iterable2 = (Iterable) t10320069907180517450.getValue();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((R14289894334981469490) it2.next()) == r14289894334981469490) {
                        }
                    }
                    return;
                }
            }
        }
        s17255966974483065294.k(null, T8598786036980488824.t((Set) s17255966974483065294.getValue(), r14289894334981469490));
        List list = (List) t10320069907180517450.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            R14289894334981469490 r142898943349814694902 = (R14289894334981469490) obj;
            if (!S10823041268949770285.t(r142898943349814694902, r14289894334981469490) && ((List) t10320069907180517450.getValue()).lastIndexOf(r142898943349814694902) < ((List) t10320069907180517450.getValue()).lastIndexOf(r14289894334981469490)) {
                break;
            }
        }
        R14289894334981469490 r142898943349814694903 = (R14289894334981469490) obj;
        if (r142898943349814694903 != null) {
            s17255966974483065294.k(null, T8598786036980488824.t((Set) s17255966974483065294.getValue(), r142898943349814694903));
        }
        d(r14289894334981469490, z);
    }

    public final void f(R14289894334981469490 r14289894334981469490) {
        r14289894334981469490.getClass();
        L841391951668269384 l841391951668269384 = this.h.b;
        l841391951668269384.getClass();
        E4135271276212975889 b = l841391951668269384.s.b(r14289894334981469490.b.a);
        if (!b.equals(this.g)) {
            Object obj = l841391951668269384.t.get(b);
            if (obj != null) {
                ((F3726638300337006374) obj).f(r14289894334981469490);
                return;
            } else {
                Z3383101362411723454.j(G6547577305291411977.s("NavigatorBackStack for ", r14289894334981469490.b.a, " should already be created"));
                return;
            }
        }
        F4096073349764486348 f4096073349764486348 = l841391951668269384.u;
        if (f4096073349764486348 == null) {
            Objects.toString(r14289894334981469490.b);
        } else {
            f4096073349764486348.invoke(r14289894334981469490);
            a(r14289894334981469490);
        }
    }
}
