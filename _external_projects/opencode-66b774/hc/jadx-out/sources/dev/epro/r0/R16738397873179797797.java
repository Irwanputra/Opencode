package dev.epro.r0;

import java.util.AbstractQueue;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class R16738397873179797797 extends AbstractQueue {
    public final /* synthetic */ X7021780317955852078 a;

    public R16738397873179797797(X7021780317955852078 x7021780317955852078) {
        this.a = x7021780317955852078;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final Object peek() {
        return this.a.d();
    }

    @Override // java.util.Queue
    public final Object poll() {
        return this.a.b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw new UnsupportedOperationException();
    }
}
