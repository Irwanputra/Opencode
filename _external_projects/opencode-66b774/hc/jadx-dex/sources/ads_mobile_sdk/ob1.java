package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ob1 extends java.util.AbstractList {
    public final dev.epro.r0.R17185427375111049466 a;
    public final dev.epro.r0.B4259731004323267459 b;

    public ob1(dev.epro.r0.R17185427375111049466 r17185427375111049466, dev.epro.r0.B4259731004323267459 b4259731004323267459) {
        this.a = r17185427375111049466;
        this.b = b4259731004323267459;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i) {
        ads_mobile_sdk.jb1 jb1Var = (ads_mobile_sdk.jb1) this.a;
        jb1Var.d(i);
        return this.b.a(jb1Var.b[i]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((ads_mobile_sdk.jb1) this.a).c;
    }
}
