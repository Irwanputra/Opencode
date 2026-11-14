package dev.epro.r0;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class G6682437202242600944 extends AbstractList implements M9021326446326000287, RandomAccess {
    public final I8742515246535873114 a;

    public G6682437202242600944(I8742515246535873114 i8742515246535873114) {
        this.a = i8742515246535873114;
    }

    @Override // dev.epro.r0.M9021326446326000287
    public final List d() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // dev.epro.r0.M9021326446326000287
    public final void e(B15200565448991586841 b15200565448991586841) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        L8747532038827245841 l8747532038827245841 = new L8747532038827245841();
        l8747532038827245841.b = this.a.iterator();
        return l8747532038827245841;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        J1124597299522891789 j1124597299522891789 = new J1124597299522891789();
        j1124597299522891789.a = this.a.listIterator(i);
        return j1124597299522891789;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // dev.epro.r0.M9021326446326000287
    public final M9021326446326000287 f() {
        return this;
    }
}
