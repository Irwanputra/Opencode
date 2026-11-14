package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class E2168127913664336368 extends java.util.AbstractList implements java.util.List, dev.epro.r0.S3000285732458222736 {
    public abstract int a();

    public abstract java.lang.Object b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int i) {
        return b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
