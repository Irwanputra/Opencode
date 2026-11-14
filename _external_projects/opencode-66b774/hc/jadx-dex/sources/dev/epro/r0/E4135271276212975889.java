package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E4135271276212975889 {
    public dev.epro.r0.F3726638300337006374 a;
    public boolean b;

    public dev.epro.r0.V7801742040189616406 a() {
        return new dev.epro.r0.U11255333181154900556(this);
    }

    public final dev.epro.r0.F3726638300337006374 b() {
        dev.epro.r0.F3726638300337006374 f3726638300337006374 = this.a;
        if (f3726638300337006374 != null) {
            return f3726638300337006374;
        }
        dev.epro.r0.S10973172697741180971.m("You cannot access the Navigator's state until the Navigator is attached");
        return null;
    }

    public void d(java.util.List list, dev.epro.r0.X4698849316906551159 x4698849316906551159) {
        dev.epro.r0.M7968841747429118896 m7968841747429118896 = new dev.epro.r0.M7968841747429118896(dev.epro.r0.T2881242016550624223.B(dev.epro.r0.T2881242016550624223.F(new dev.epro.r0.V11146580314972738611(list, (byte) 1), new dev.epro.r0.S16262227471297796850(this, x4698849316906551159, (byte) 28))));
        while (m7968841747429118896.hasNext()) {
            b().f((dev.epro.r0.R14289894334981469490) m7968841747429118896.next());
        }
    }

    public void e(dev.epro.r0.R14289894334981469490 r14289894334981469490, boolean z) {
        java.util.List list = (java.util.List) b().e.a.getValue();
        if (!list.contains(r14289894334981469490)) {
            dev.epro.r0.D11988991656201568495.s("popBackStack was called with ", r14289894334981469490, " which does not exist in back stack ", list);
            return;
        }
        java.util.ListIterator listIterator = list.listIterator(list.size());
        dev.epro.r0.R14289894334981469490 r142898943349814694902 = null;
        while (f()) {
            r142898943349814694902 = (dev.epro.r0.R14289894334981469490) listIterator.previous();
            if (dev.epro.r0.S10823041268949770285.t(r142898943349814694902, r14289894334981469490)) {
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

    public dev.epro.r0.V7801742040189616406 c(dev.epro.r0.V7801742040189616406 v7801742040189616406) {
        return v7801742040189616406;
    }
}
