package dev.epro.r0;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A5949560647331355346 extends AbstractCollection {
    public final /* synthetic */ T5910761665012682387 a;

    public A5949560647331355346(T5910761665012682387 t5910761665012682387) {
        this.a = t5910761665012682387;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        T5910761665012682387 t5910761665012682387 = this.a;
        Map mapB = t5910761665012682387.b();
        return mapB != null ? mapB.values().iterator() : new I16505841721158300488(t5910761665012682387, (byte) 2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
