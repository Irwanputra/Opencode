package dev.epro.r0;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class E4135271276212975889 {
    public F3726638300337006374 a;
    public boolean b;

    public V7801742040189616406 a() {
        return new U11255333181154900556(this);
    }

    public final F3726638300337006374 b() {
        F3726638300337006374 f3726638300337006374 = this.a;
        if (f3726638300337006374 != null) {
            return f3726638300337006374;
        }
        S10973172697741180971.m("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(List list, X4698849316906551159 x4698849316906551159) {
        M7968841747429118896 m7968841747429118896 = new M7968841747429118896(T2881242016550624223.B(T2881242016550624223.F(new V11146580314972738611(list, (byte) 1), new S16262227471297796850(this, x4698849316906551159, (byte) 28))));
        while (m7968841747429118896.hasNext()) {
            b().f((R14289894334981469490) m7968841747429118896.next());
        }
    }

    public void e(R14289894334981469490 r14289894334981469490, boolean z) {
        List list = (List) b().e.a.getValue();
        if (!list.contains(r14289894334981469490)) {
            D11988991656201568495.s("popBackStack was called with ", r14289894334981469490, " which does not exist in back stack ", list);
            return;
        }
        ListIterator listIterator = list.listIterator(list.size());
        R14289894334981469490 r142898943349814694902 = null;
        while (f()) {
            r142898943349814694902 = (R14289894334981469490) listIterator.previous();
            if (S10823041268949770285.t(r142898943349814694902, r14289894334981469490)) {
                break;
            }
        }
        if (r142898943349814694902 != null) {
            b().d(r142898943349814694902, z);
        }
    }

    public boolean f() {
        return true;
    }

    public V7801742040189616406 c(V7801742040189616406 v7801742040189616406) {
        return v7801742040189616406;
    }
}
