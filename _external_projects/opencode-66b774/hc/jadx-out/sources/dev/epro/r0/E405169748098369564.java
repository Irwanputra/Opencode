package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
@E9219781366349246739("composable")
public final class E405169748098369564 extends E4135271276212975889 {
    public final V697849047308847220 c = V4416135141588678913.t(Boolean.FALSE);

    @Override // dev.epro.r0.E4135271276212975889
    public final V7801742040189616406 a() {
        return new W13535986421085416487(this, T18016951143603335921.a);
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final void d(List list, X4698849316906551159 x4698849316906551159) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            R14289894334981469490 r14289894334981469490 = (R14289894334981469490) it.next();
            F3726638300337006374 f3726638300337006374B = b();
            T10320069907180517450 t10320069907180517450 = f3726638300337006374B.e.a;
            r14289894334981469490.getClass();
            S17255966974483065294 s17255966974483065294 = f3726638300337006374B.c;
            Iterable iterable = (Iterable) s17255966974483065294.getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((R14289894334981469490) it2.next()) == r14289894334981469490) {
                        Iterable iterable2 = (Iterable) t10320069907180517450.getValue();
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it3 = iterable2.iterator();
                            while (it3.hasNext()) {
                                if (((R14289894334981469490) it3.next()) == r14289894334981469490) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            R14289894334981469490 r142898943349814694902 = (R14289894334981469490) R9411874267597469228.L0((List) t10320069907180517450.getValue());
            if (r142898943349814694902 != null) {
                s17255966974483065294.k(null, T8598786036980488824.t((Set) s17255966974483065294.getValue(), r142898943349814694902));
            }
            s17255966974483065294.k(null, T8598786036980488824.t((Set) s17255966974483065294.getValue(), r14289894334981469490));
            f3726638300337006374B.f(r14289894334981469490);
        }
        this.c.setValue(Boolean.FALSE);
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final void e(R14289894334981469490 r14289894334981469490, boolean z) {
        b().e(r14289894334981469490, z);
        this.c.setValue(Boolean.TRUE);
    }

    public final void g(R14289894334981469490 r14289894334981469490) {
        F3726638300337006374 f3726638300337006374B = b();
        r14289894334981469490.getClass();
        S17255966974483065294 s17255966974483065294 = f3726638300337006374B.c;
        s17255966974483065294.k(null, T8598786036980488824.t((Set) s17255966974483065294.getValue(), r14289894334981469490));
        L841391951668269384 l841391951668269384 = f3726638300337006374B.h.b;
        l841391951668269384.getClass();
        if (!l841391951668269384.f.contains(r14289894334981469490)) {
            S10973172697741180971.m("Cannot transition entry that is not in the back stack");
        } else {
            r14289894334981469490.m = Q14196755420833223976.d;
            r14289894334981469490.d();
        }
    }
}
