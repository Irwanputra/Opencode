package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class B16024634506412482045 implements java.util.Iterator, dev.epro.r0.D14639766352081121636 {
    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return java.lang.Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
