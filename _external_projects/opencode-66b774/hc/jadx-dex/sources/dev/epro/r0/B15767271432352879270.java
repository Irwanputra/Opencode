package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final /* synthetic */ class B15767271432352879270 implements dev.epro.r0.F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dev.epro.r0.I1283052979100930176 b;
    public final /* synthetic */ dev.epro.r0.I4293432593871965076 c;

    public /* synthetic */ B15767271432352879270(dev.epro.r0.I1283052979100930176 i1283052979100930176, dev.epro.r0.I4293432593871965076 i4293432593871965076, byte b) {
        this.a = b;
        this.b = i1283052979100930176;
        this.c = i4293432593871965076;
    }

    public final java.lang.Object invoke(java.lang.Object obj) {
        byte b = this.a;
        dev.epro.r0.O9245300239821758723 o9245300239821758723 = dev.epro.r0.O9245300239821758723.a;
        dev.epro.r0.I4293432593871965076 i4293432593871965076 = this.c;
        dev.epro.r0.I1283052979100930176 i1283052979100930176 = this.b;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        switch (b) {
            case 0:
                entry.getClass();
                dev.epro.r0.N16594346128251165883 n16594346128251165883 = (dev.epro.r0.N16594346128251165883) entry.getKey();
                dev.epro.r0.H9528616825559273309 h9528616825559273309 = (dev.epro.r0.H9528616825559273309) entry.getValue();
                while (true) {
                    dev.epro.r0.Q14196755420833223976 q14196755420833223976 = h9528616825559273309.a;
                    dev.epro.r0.Q14196755420833223976 q141967554208332239762 = i1283052979100930176.h;
                    java.util.ArrayList arrayList = i1283052979100930176.g;
                    if (q14196755420833223976.compareTo(q141967554208332239762) > 0 && !i1283052979100930176.f) {
                        dev.epro.r0.Q7316561721656982910 q7316561721656982910 = i1283052979100930176.b;
                        q7316561721656982910.getClass();
                        n16594346128251165883.getClass();
                        if (((dev.epro.r0.A4559761392562572984) q7316561721656982910.b).c(n16594346128251165883)) {
                            dev.epro.r0.J11378867428257506542 j11378867428257506542 = dev.epro.r0.P72364327365747079.Companion;
                            dev.epro.r0.Q14196755420833223976 q141967554208332239763 = h9528616825559273309.a;
                            j11378867428257506542.getClass();
                            q141967554208332239763.getClass();
                            int iOrdinal = q141967554208332239763.ordinal();
                            dev.epro.r0.P72364327365747079 p72364327365747079 = iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? null : dev.epro.r0.P72364327365747079.ON_PAUSE : dev.epro.r0.P72364327365747079.ON_STOP : dev.epro.r0.P72364327365747079.ON_DESTROY;
                            if (p72364327365747079 == null) {
                                dev.epro.r0.D11988991656201568495.r("no event down from ", h9528616825559273309.a);
                            } else {
                                arrayList.add(p72364327365747079.a());
                                h9528616825559273309.a(i4293432593871965076, p72364327365747079);
                                dev.epro.r0.P17571903987102865660.s0(arrayList);
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                entry.getClass();
                dev.epro.r0.N16594346128251165883 n165943461282511658832 = (dev.epro.r0.N16594346128251165883) entry.getKey();
                dev.epro.r0.H9528616825559273309 h95286168255592733092 = (dev.epro.r0.H9528616825559273309) entry.getValue();
                while (true) {
                    dev.epro.r0.Q14196755420833223976 q141967554208332239764 = h95286168255592733092.a;
                    dev.epro.r0.Q14196755420833223976 q141967554208332239765 = i1283052979100930176.h;
                    java.util.ArrayList arrayList2 = i1283052979100930176.g;
                    if (q141967554208332239764.compareTo(q141967554208332239765) < 0 && !i1283052979100930176.f) {
                        dev.epro.r0.Q7316561721656982910 q73165617216569829102 = i1283052979100930176.b;
                        q73165617216569829102.getClass();
                        n165943461282511658832.getClass();
                        if (((dev.epro.r0.A4559761392562572984) q73165617216569829102.b).c(n165943461282511658832)) {
                            arrayList2.add(h95286168255592733092.a);
                            dev.epro.r0.J11378867428257506542 j113788674282575065422 = dev.epro.r0.P72364327365747079.Companion;
                            dev.epro.r0.Q14196755420833223976 q141967554208332239766 = h95286168255592733092.a;
                            j113788674282575065422.getClass();
                            q141967554208332239766.getClass();
                            int iOrdinal2 = q141967554208332239766.ordinal();
                            dev.epro.r0.P72364327365747079 p723643273657470792 = iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? null : dev.epro.r0.P72364327365747079.ON_RESUME : dev.epro.r0.P72364327365747079.ON_START : dev.epro.r0.P72364327365747079.ON_CREATE;
                            if (p723643273657470792 == null) {
                                dev.epro.r0.D11988991656201568495.r("no event up from ", h95286168255592733092.a);
                            } else {
                                h95286168255592733092.a(i4293432593871965076, p723643273657470792);
                                dev.epro.r0.P17571903987102865660.s0(arrayList2);
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return null;
    }
}
