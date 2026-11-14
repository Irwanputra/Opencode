package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
@dev.epro.r0.E9219781366349246739("composable")
public final class E405169748098369564 extends dev.epro.r0.E4135271276212975889 {
    public final dev.epro.r0.V697849047308847220 c = dev.epro.r0.V4416135141588678913.t(java.lang.Boolean.FALSE);

    @Override // dev.epro.r0.E4135271276212975889
    public final dev.epro.r0.V7801742040189616406 a() {
        return new dev.epro.r0.W13535986421085416487(this, dev.epro.r0.T18016951143603335921.a);
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final void d(java.util.List list, dev.epro.r0.X4698849316906551159 x4698849316906551159) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dev.epro.r0.R14289894334981469490 r14289894334981469490 = (dev.epro.r0.R14289894334981469490) it.next();
            dev.epro.r0.F3726638300337006374 f3726638300337006374B = b();
            dev.epro.r0.T10320069907180517450 t10320069907180517450 = f3726638300337006374B.e.a;
            r14289894334981469490.getClass();
            dev.epro.r0.S17255966974483065294 s17255966974483065294 = f3726638300337006374B.c;
            java.lang.Iterable iterable = (java.lang.Iterable) s17255966974483065294.getValue();
            if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                java.util.Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((dev.epro.r0.R14289894334981469490) it2.next()) == r14289894334981469490) {
                        java.lang.Iterable iterable2 = (java.lang.Iterable) t10320069907180517450.getValue();
                        if (!(iterable2 instanceof java.util.Collection) || !((java.util.Collection) iterable2).isEmpty()) {
                            java.util.Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((dev.epro.r0.R14289894334981469490) it3.next()) == r14289894334981469490) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            dev.epro.r0.R14289894334981469490 r142898943349814694902 = (dev.epro.r0.R14289894334981469490) dev.epro.r0.R9411874267597469228.L0((java.util.List) t10320069907180517450.getValue());
            if (r142898943349814694902 != null) {
                s17255966974483065294.k((java.lang.Object) null, dev.epro.r0.T8598786036980488824.t((java.util.Set) s17255966974483065294.getValue(), r142898943349814694902));
            }
            s17255966974483065294.k((java.lang.Object) null, dev.epro.r0.T8598786036980488824.t((java.util.Set) s17255966974483065294.getValue(), r14289894334981469490));
            f3726638300337006374B.f(r14289894334981469490);
        }
        this.c.setValue(java.lang.Boolean.FALSE);
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final void e(dev.epro.r0.R14289894334981469490 r14289894334981469490, boolean z) {
        b().e(r14289894334981469490, z);
        this.c.setValue(java.lang.Boolean.TRUE);
    }

    public final void g(dev.epro.r0.R14289894334981469490 r14289894334981469490) {
        dev.epro.r0.F3726638300337006374 f3726638300337006374B = b();
        r14289894334981469490.getClass();
        dev.epro.r0.S17255966974483065294 s17255966974483065294 = f3726638300337006374B.c;
        s17255966974483065294.k((java.lang.Object) null, dev.epro.r0.T8598786036980488824.t((java.util.Set) s17255966974483065294.getValue(), r14289894334981469490));
        dev.epro.r0.L841391951668269384 l841391951668269384 = f3726638300337006374B.h.b;
        l841391951668269384.getClass();
        if (!l841391951668269384.f.contains(r14289894334981469490)) {
            dev.epro.r0.S10973172697741180971.m("Cannot transition entry that is not in the back stack");
        } else {
            r14289894334981469490.m = dev.epro.r0.Q14196755420833223976.d;
            r14289894334981469490.d();
        }
    }
}
