package dev.epro.r0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P8279912765821767959 extends V9316690655140275436 {
    public final transient Object g;

    public P8279912765821767959(Object obj) {
        super((byte) 2);
        this.g = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.g.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new G289902487923560982(this.g);
    }

    @Override // dev.epro.r0.G10942763614670705019
    public final int j(Object[] objArr) {
        objArr[0] = this.g;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return G6547577305291411977.s("[", this.g.toString(), "]");
    }
}
