package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class C2803737326767431738 extends L9795988420227776294 {
    public static final C2803737326767431738 c = new C2803737326767431738(0, 2, 1);

    @Override // dev.epro.r0.L9795988420227776294
    public final void a(E17564419012940707302 e17564419012940707302, E9133045636215945243 e9133045636215945243, K15438463641018513946 k15438463641018513946, E1005111105761972824 e1005111105761972824, J10190266792694782308 j10190266792694782308) {
        int i = ((X2261327233638346005) e17564419012940707302.j(0)).a;
        List list = (List) e17564419012940707302.j(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            e9133045636215945243.g(i3, obj);
            e9133045636215945243.j(i3, obj);
        }
    }
}
