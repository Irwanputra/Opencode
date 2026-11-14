package dev.epro.r0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
@E9219781366349246739("navigation")
/* loaded from: classes.dex */
public class A10188109575003443817 extends E4135271276212975889 {
    public final G1840519957725232630 c;

    public A10188109575003443817(G1840519957725232630 g1840519957725232630) {
        g1840519957725232630.getClass();
        this.c = g1840519957725232630;
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final void d(List list, X4698849316906551159 x4698849316906551159) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            R14289894334981469490 r14289894334981469490 = (R14289894334981469490) it.next();
            V7801742040189616406 v7801742040189616406 = r14289894334981469490.b;
            v7801742040189616406.getClass();
            Q4132023691817090890 q4132023691817090890 = (Q4132023691817090890) v7801742040189616406;
            G6575252167976303972 g6575252167976303972 = q4132023691817090890.b;
            A7209497065939201693 a7209497065939201693 = new A7209497065939201693();
            a7209497065939201693.a = r14289894334981469490.c();
            G5793569464912558238 g5793569464912558238 = q4132023691817090890.f;
            int i = g5793569464912558238.b;
            String str = g5793569464912558238.c;
            if (i == 0 && str == null) {
                g6575252167976303972.getClass();
                String valueOf = String.valueOf(g6575252167976303972.a);
                valueOf.getClass();
                if (((Q4132023691817090890) g5793569464912558238.d).b.a == 0) {
                    valueOf = "the root navigation";
                }
                Z3383101362411723454.j("no start destination defined via app:startDestination for ".concat(valueOf));
                return;
            }
            V7801742040189616406 b = str != null ? g5793569464912558238.b(str, false) : (V7801742040189616406) V1475975160983963926.p((E8321115364184429049) g5793569464912558238.e, i);
            if (b == null) {
                String str2 = g5793569464912558238.a;
                if (str2 == null) {
                    str2 = g5793569464912558238.c;
                    if (str2 == null) {
                        str2 = String.valueOf(g5793569464912558238.b);
                    }
                    g5793569464912558238.a = str2;
                }
                str2.getClass();
                S10973172697741180971.j(G6547577305291411977.s("navigation destination ", str2, " is not a direct child of this NavGraph"));
                return;
            }
            G6575252167976303972 g65752521679763039722 = b.b;
            if (str != null) {
                if (!str.equals((String) g65752521679763039722.e)) {
                    W6610499404761400913 g = g65752521679763039722.g(str);
                    Bundle bundle = g != null ? g.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        Bundle z = O5354877807466160604.z((H9390398899829886498[]) Arrays.copyOf(new H9390398899829886498[0], 0));
                        z.putAll(bundle);
                        Bundle bundle2 = (Bundle) a7209497065939201693.a;
                        if (bundle2 != null) {
                            z.putAll(bundle2);
                        }
                        a7209497065939201693.a = z;
                    }
                }
                if (E4951175994894594588.z0((LinkedHashMap) g65752521679763039722.d).isEmpty()) {
                    continue;
                } else {
                    ArrayList J = Q3181834110876746778.J(E4951175994894594588.z0((LinkedHashMap) g65752521679763039722.d), new I12007476123594936550(a7209497065939201693, (byte) 4));
                    if (!J.isEmpty()) {
                        D11988991656201568495.t("Cannot navigate to startDestination ", b, ". Missing required arguments [", J, "]");
                        return;
                    }
                }
            }
            this.c.b(b.a).d(K5751602218013079365.U(b().b(b, b.a((Bundle) a7209497065939201693.a))), x4698849316906551159);
        }
    }

    @Override // dev.epro.r0.E4135271276212975889
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Q4132023691817090890 a() {
        return new Q4132023691817090890(this);
    }
}
