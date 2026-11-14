package dev.epro.r0;

import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class W16135392790107701346 extends N7756202525712935399 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ N7756202525712935399 e;

    public W16135392790107701346(N7756202525712935399 n7756202525712935399, int i, int i2) {
        this.e = n7756202525712935399;
        this.c = i;
        this.d = i2;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final Object[] c() {
        return this.e.c();
    }

    @Override // java.util.List
    public final Object get(int i) {
        U15853425786981391261.w(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int i() {
        return this.e.j() + this.c + this.d;
    }

    @Override // dev.epro.r0.N7756202525712935399, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int j() {
        return this.e.j() + this.c;
    }

    @Override // dev.epro.r0.N7756202525712935399, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // dev.epro.r0.N7756202525712935399, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final N7756202525712935399 subList(int i, int i2) {
        U15853425786981391261.B(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // dev.epro.r0.N7756202525712935399, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
