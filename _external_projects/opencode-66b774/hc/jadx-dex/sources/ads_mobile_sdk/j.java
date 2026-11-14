package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class j extends java.util.AbstractList implements dev.epro.r0.O6641393078261985068 {
    public boolean a;

    public j(boolean z) {
        this.a = z;
    }

    public final void a$1() {
        if (this.a) {
            return;
        }
        dev.epro.r0.Z3383101362411723454.t();
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        a$1();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a$1();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        if (!(obj instanceof java.util.RandomAccess)) {
            return super.equals(obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract java.lang.Object remove(int i);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        a$1();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        a$1();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        a$1();
        return super.retainAll(collection);
    }

    public j() {
        this(true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        a$1();
        return super.addAll(collection);
    }
}
