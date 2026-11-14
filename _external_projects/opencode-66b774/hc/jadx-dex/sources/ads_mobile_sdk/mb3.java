package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class mb3 implements java.util.Iterator {
    public int a = -1;
    public final /* synthetic */ ads_mobile_sdk.ob3 b;

    public mb3(ads_mobile_sdk.ob3 ob3Var) {
        this.b = ob3Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a + 1 < this.b.b;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (!hasNext()) {
            dev.epro.r0.Z3383101362411723454.u();
            return null;
        }
        java.lang.Object[] objArr = this.b.a;
        int i = this.a + 1;
        this.a = i;
        if (objArr[i] == null) {
            return null;
        }
        dev.epro.r0.Z3383101362411723454.s();
        return null;
    }
}
