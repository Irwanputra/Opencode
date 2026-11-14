package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N8203386691977151956 implements A7033694156606186337, X9453547659685679028 {
    public final /* synthetic */ B13729205492206812220 a;

    public N8203386691977151956(B13729205492206812220 b13729205492206812220) {
        this.a = b13729205492206812220;
    }

    @Override // dev.epro.r0.X9453547659685679028
    public final S8977162183056139880 a() {
        return this.a;
    }

    @Override // dev.epro.r0.A7033694156606186337
    public final /* synthetic */ long b() {
        return ((L2216691091636065972) this.a.invoke()).a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A7033694156606186337) || !(obj instanceof X9453547659685679028)) {
            return false;
        }
        return S10823041268949770285.t(this.a, ((X9453547659685679028) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
