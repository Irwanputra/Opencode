package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class V12013952329824586776 implements I2388620560486547149 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ List b;
    public final /* synthetic */ R14289894334981469490 c;

    public /* synthetic */ V12013952329824586776(boolean z, List list, R14289894334981469490 r14289894334981469490) {
        this.a = z;
        this.b = list;
        this.c = r14289894334981469490;
    }

    @Override // dev.epro.r0.I2388620560486547149
    public final void d(I4293432593871965076 i4293432593871965076, P72364327365747079 p72364327365747079) {
        boolean z = this.a;
        List list = this.b;
        R14289894334981469490 r14289894334981469490 = this.c;
        if (z && !list.contains(r14289894334981469490)) {
            list.add(r14289894334981469490);
        }
        if (p72364327365747079 == P72364327365747079.ON_START && !list.contains(r14289894334981469490)) {
            list.add(r14289894334981469490);
        }
        if (p72364327365747079 == P72364327365747079.ON_STOP) {
            list.remove(r14289894334981469490);
        }
    }
}
