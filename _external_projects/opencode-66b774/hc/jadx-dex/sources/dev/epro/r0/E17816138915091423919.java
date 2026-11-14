package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E17816138915091423919 extends dev.epro.r0.Z1085125311131623997 implements java.util.ListIterator {
    public final /* synthetic */ dev.epro.r0.L17338558938414325155 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E17816138915091423919(dev.epro.r0.L17338558938414325155 l17338558938414325155, int i) {
        super(l17338558938414325155, (byte) 0);
        this.d = l17338558938414325155;
        int iA = l17338558938414325155.a();
        if (i < 0 || i > iA) {
            dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E12098517352909843120.l("index: ", i, iA, ", size: "));
            throw null;
        }
        ((dev.epro.r0.Z1085125311131623997) this).b = i;
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((dev.epro.r0.Z1085125311131623997) this).b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((dev.epro.r0.Z1085125311131623997) this).b;
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
        if (!hasPrevious()) {
            dev.epro.r0.Z3383101362411723454.u();
            return null;
        }
        int i = ((dev.epro.r0.Z1085125311131623997) this).b - 1;
        ((dev.epro.r0.Z1085125311131623997) this).b = i;
        return this.d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((dev.epro.r0.Z1085125311131623997) this).b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
