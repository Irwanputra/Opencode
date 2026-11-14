package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D5439222595724916180 extends Z8594524026390833435 {
    public final transient Z8594524026390833435 f;

    public D5439222595724916180(Z8594524026390833435 z8594524026390833435) {
        super((byte) 1);
        this.f = z8594524026390833435;
    }

    @Override // dev.epro.r0.Z8594524026390833435, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Z8594524026390833435 z8594524026390833435 = this.f;
        E10717724117948616506.q(i, z8594524026390833435.size());
        return z8594524026390833435.get((z8594524026390833435.size() - 1) - i);
    }

    @Override // dev.epro.r0.Z8594524026390833435, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r1.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // dev.epro.r0.Z8594524026390833435, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r1.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // dev.epro.r0.Z8594524026390833435
    public final Z8594524026390833435 q() {
        return this.f;
    }

    @Override // dev.epro.r0.Z8594524026390833435, java.util.List
    /* JADX INFO: renamed from: r */
    public final Z8594524026390833435 subList(int i, int i2) {
        Z8594524026390833435 z8594524026390833435 = this.f;
        E10717724117948616506.r(i, i2, z8594524026390833435.size());
        return z8594524026390833435.subList(z8594524026390833435.size() - i2, z8594524026390833435.size() - i).q();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.size();
    }
}
