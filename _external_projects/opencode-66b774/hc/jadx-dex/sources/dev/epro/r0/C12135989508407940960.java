package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C12135989508407940960 extends dev.epro.r0.G10942763614670705019 implements java.util.List, java.util.RandomAccess {
    public static final dev.epro.r0.U16122055668975483727 e = new dev.epro.r0.U16122055668975483727(dev.epro.r0.I1430064897078411404.g, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public int a(java.lang.Object[] objArr) {
        int size = size();
        for (int i = 0; i < size; i++) {
            objArr[i] = get(i);
        }
        return size;
    }

    @Override // java.util.List
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (java.util.Objects.equals(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                dev.epro.r0.U16122055668975483727 u16122055668975483727ListIterator = listIterator(0);
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (u16122055668975483727ListIterator.hasNext()) {
                        if (!it.hasNext() || !java.util.Objects.equals(u16122055668975483727ListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    /* JADX INFO: renamed from: q */
    public dev.epro.r0.C12135989508407940960 subList(int i, int i2) {
        dev.epro.r0.E2166724654553415323.h(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? dev.epro.r0.I1430064897078411404.g : new dev.epro.r0.B6047434429717167341(this, i, i3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final dev.epro.r0.U16122055668975483727 listIterator(int i) {
        int size = size();
        if (i >= 0 && i <= size) {
            return isEmpty() ? e : new dev.epro.r0.U16122055668975483727(this, i);
        }
        dev.epro.r0.W4415201450379021245.a(dev.epro.r0.E2166724654553415323.j(i, size, "index"));
        return null;
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
