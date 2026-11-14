package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N5080615404647649127 extends RuntimeException {
    public final U9803441765912152712 a;
    public final U9803441765912152712 b;
    public final G1892398518770611911 c;
    public final int d;

    public N5080615404647649127(U9803441765912152712 u9803441765912152712, U9803441765912152712 u98034417659121527122, G1892398518770611911 g1892398518770611911, int i, Exception exc) {
        super(exc);
        this.a = u9803441765912152712;
        this.b = u98034417659121527122;
        this.c = g1892398518770611911;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        N3180492300688416475 q = U1554499319261669842.q(new C17035605743733350795(this, null));
        if (q.hasNext()) {
            Object next = q.next();
            if (q.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (q.hasNext()) {
                    arrayList.add(q.next());
                }
                list = arrayList;
            } else {
                list = K5751602218013079365.U(next);
            }
        } else {
            list = O2161699089510411363.a;
        }
        return G5759126466240281083.u("\n            |Failed to execute op number " + this.d + ":\n            |" + R9411874267597469228.J0(R9411874267597469228.Y0(50, list), "\n", null, null, 0, null, 62) + "\n            ");
    }
}
