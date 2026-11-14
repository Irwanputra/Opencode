package dev.epro.r0;

import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y1272756336278085351 extends Y10166432356890198008 {
    public final E405169748098369564 f;
    public R14289894334981469490 g;
    public final V697849047308847220 h;
    public final O15319392248629494012 i;
    public final P6024466796603310388 j;

    public Y1272756336278085351(E405169748098369564 e405169748098369564) {
        super(new U5053826207126138866((R14289894334981469490) R9411874267597469228.L0((List) e405169748098369564.b().e.a.getValue())), true);
        this.f = e405169748098369564;
        this.h = V4416135141588678913.t(Boolean.FALSE);
        this.i = new O15319392248629494012(0.0f);
        this.j = new P6024466796603310388(2);
    }

    @Override // dev.epro.r0.Y10166432356890198008
    public final void a() {
        this.h.setValue(Boolean.FALSE);
        this.i.h(0.0f);
        this.j.h(2);
        this.g = null;
    }

    @Override // dev.epro.r0.Y10166432356890198008
    public final void b() {
        V697849047308847220 v697849047308847220 = this.h;
        if (!((Boolean) v697849047308847220.getValue()).booleanValue()) {
            g();
        }
        R14289894334981469490 r14289894334981469490 = this.g;
        if (r14289894334981469490 != null) {
            this.f.e(r14289894334981469490, false);
        }
        v697849047308847220.setValue(Boolean.FALSE);
        this.i.h(0.0f);
        this.j.h(2);
        this.g = null;
    }

    @Override // dev.epro.r0.Y10166432356890198008
    public final void c(F17048500263560432125 f17048500263560432125) {
        this.h.setValue(Boolean.TRUE);
        this.i.h(f17048500263560432125.b);
        this.j.h(f17048500263560432125.a);
    }

    @Override // dev.epro.r0.Y10166432356890198008
    public final void d(F17048500263560432125 f17048500263560432125) {
        g();
        this.h.setValue(Boolean.TRUE);
        this.i.h(f17048500263560432125.b);
        this.j.h(f17048500263560432125.a);
    }

    public final void g() {
        E405169748098369564 e405169748098369564 = this.f;
        List list = (List) e405169748098369564.b().e.a.getValue();
        if (list.size() < 2) {
            return;
        }
        R14289894334981469490 r14289894334981469490 = (R14289894334981469490) R9411874267597469228.K0(list);
        R14289894334981469490 r142898943349814694902 = (R14289894334981469490) list.get(list.size() - 2);
        e405169748098369564.g(r14289894334981469490);
        e405169748098369564.g(r142898943349814694902);
        this.g = r14289894334981469490;
    }
}
