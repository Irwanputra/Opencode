package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D5439222595724916180 extends dev.epro.r0.Z8594524026390833435 {
    public final transient dev.epro.r0.Z8594524026390833435 f;

    public D5439222595724916180(dev.epro.r0.Z8594524026390833435 z8594524026390833435) {
        super((byte) 1);
        this.f = z8594524026390833435;
    }

    public final boolean contains(java.lang.Object obj) {
        return this.f.contains(obj);
    }

    public final java.lang.Object get(int i) {
        dev.epro.r0.Z8594524026390833435 z8594524026390833435 = this.f;
        dev.epro.r0.E10717724117948616506.q(i, z8594524026390833435.size());
        return z8594524026390833435.get((z8594524026390833435.size() - 1) - i);
    }

    public final int indexOf(java.lang.Object obj) {
        int iLastIndexOf = this.f.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (r1.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    public final int lastIndexOf(java.lang.Object obj) {
        int iIndexOf = this.f.indexOf(obj);
        if (iIndexOf >= 0) {
            return (r1.size() - 1) - iIndexOf;
        }
        return -1;
    }

    public final dev.epro.r0.Z8594524026390833435 q() {
        return this.f;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final dev.epro.r0.Z8594524026390833435 subList(int i, int i2) {
        dev.epro.r0.Z8594524026390833435 z8594524026390833435 = this.f;
        dev.epro.r0.E10717724117948616506.r(i, i2, z8594524026390833435.size());
        return z8594524026390833435.r(z8594524026390833435.size() - i2, z8594524026390833435.size() - i).q();
    }

    public final int size() {
        return this.f.size();
    }
}
