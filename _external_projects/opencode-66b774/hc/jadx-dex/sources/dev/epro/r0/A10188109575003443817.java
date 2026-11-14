package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
@dev.epro.r0.E9219781366349246739("navigation")
public class A10188109575003443817 extends dev.epro.r0.E4135271276212975889 {
    public final dev.epro.r0.G1840519957725232630 c;

    public A10188109575003443817(dev.epro.r0.G1840519957725232630 g1840519957725232630) {
        g1840519957725232630.getClass();
        this.c = g1840519957725232630;
    }

    @Override // dev.epro.r0.E4135271276212975889
    public final void d(java.util.List list, dev.epro.r0.X4698849316906551159 x4698849316906551159) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dev.epro.r0.R14289894334981469490 r14289894334981469490 = (dev.epro.r0.R14289894334981469490) it.next();
            dev.epro.r0.Q4132023691817090890 q4132023691817090890 = r14289894334981469490.b;
            q4132023691817090890.getClass();
            dev.epro.r0.Q4132023691817090890 q41320236918170908902 = q4132023691817090890;
            dev.epro.r0.G6575252167976303972 g6575252167976303972 = ((dev.epro.r0.V7801742040189616406) q41320236918170908902).b;
            dev.epro.r0.A7209497065939201693 a7209497065939201693 = new dev.epro.r0.A7209497065939201693();
            a7209497065939201693.a = r14289894334981469490.c();
            dev.epro.r0.G5793569464912558238 g5793569464912558238 = q41320236918170908902.f;
            int i = g5793569464912558238.b;
            java.lang.String str = g5793569464912558238.c;
            if (i == 0 && str == null) {
                g6575252167976303972.getClass();
                java.lang.String strValueOf = java.lang.String.valueOf(g6575252167976303972.a);
                strValueOf.getClass();
                if (((dev.epro.r0.V7801742040189616406) ((dev.epro.r0.Q4132023691817090890) g5793569464912558238.d)).b.a == 0) {
                    strValueOf = "the root navigation";
                }
                dev.epro.r0.Z3383101362411723454.j("no start destination defined via app:startDestination for ".concat(strValueOf));
                return;
            }
            dev.epro.r0.V7801742040189616406 v7801742040189616406B = str != null ? g5793569464912558238.b(str, false) : (dev.epro.r0.V7801742040189616406) dev.epro.r0.V1475975160983963926.p((dev.epro.r0.E8321115364184429049) g5793569464912558238.e, i);
            if (v7801742040189616406B == null) {
                java.lang.String strValueOf2 = g5793569464912558238.a;
                if (strValueOf2 == null) {
                    strValueOf2 = g5793569464912558238.c;
                    if (strValueOf2 == null) {
                        strValueOf2 = java.lang.String.valueOf(g5793569464912558238.b);
                    }
                    g5793569464912558238.a = strValueOf2;
                }
                strValueOf2.getClass();
                dev.epro.r0.S10973172697741180971.j(dev.epro.r0.G6547577305291411977.s("navigation destination ", strValueOf2, " is not a direct child of this NavGraph"));
                return;
            }
            dev.epro.r0.G6575252167976303972 g65752521679763039722 = v7801742040189616406B.b;
            if (str != null) {
                if (!str.equals((java.lang.String) g65752521679763039722.e)) {
                    dev.epro.r0.W6610499404761400913 w6610499404761400913G = g65752521679763039722.g(str);
                    android.os.Bundle bundle = w6610499404761400913G != null ? w6610499404761400913G.b : null;
                    if (bundle != null && !bundle.isEmpty()) {
                        android.os.Bundle bundleZ = dev.epro.r0.O5354877807466160604.z((dev.epro.r0.H9390398899829886498[]) java.util.Arrays.copyOf(new dev.epro.r0.H9390398899829886498[0], 0));
                        bundleZ.putAll(bundle);
                        android.os.Bundle bundle2 = (android.os.Bundle) a7209497065939201693.a;
                        if (bundle2 != null) {
                            bundleZ.putAll(bundle2);
                        }
                        a7209497065939201693.a = bundleZ;
                    }
                }
                if (dev.epro.r0.E4951175994894594588.z0((java.util.LinkedHashMap) g65752521679763039722.d).isEmpty()) {
                    continue;
                } else {
                    java.util.ArrayList arrayListJ = dev.epro.r0.Q3181834110876746778.J(dev.epro.r0.E4951175994894594588.z0((java.util.LinkedHashMap) g65752521679763039722.d), new dev.epro.r0.I12007476123594936550(a7209497065939201693, (byte) 4));
                    if (!arrayListJ.isEmpty()) {
                        dev.epro.r0.D11988991656201568495.t("Cannot navigate to startDestination ", v7801742040189616406B, ". Missing required arguments [", arrayListJ, "]");
                        return;
                    }
                }
            }
            this.c.b(v7801742040189616406B.a).d(dev.epro.r0.K5751602218013079365.U(b().b(v7801742040189616406B, v7801742040189616406B.a((android.os.Bundle) a7209497065939201693.a))), x4698849316906551159);
        }
    }

    @Override // dev.epro.r0.E4135271276212975889
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public dev.epro.r0.Q4132023691817090890 a() {
        return new dev.epro.r0.Q4132023691817090890(this);
    }
}
