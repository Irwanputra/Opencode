package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P13457606187462299342 extends Z8594524026390833435 {
    public final transient int f;
    public final transient int g;
    public final /* synthetic */ Z8594524026390833435 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P13457606187462299342(Z8594524026390833435 z8594524026390833435, int i, int i2) {
        super((byte) 1);
        this.h = z8594524026390833435;
        this.f = i;
        this.g = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        E10717724117948616506.q(i, this.g);
        return this.h.get(i + this.f);
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final Object[] l() {
        return this.h.l();
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int m() {
        return this.h.m() + this.f;
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int n() {
        return this.h.m() + this.f + this.g;
    }

    @Override // dev.epro.r0.Z8594524026390833435, java.util.List
    /* JADX INFO: renamed from: r */
    public final Z8594524026390833435 subList(int i, int i2) {
        E10717724117948616506.r(i, i2, this.g);
        int i3 = this.f;
        return this.h.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.g;
    }
}
