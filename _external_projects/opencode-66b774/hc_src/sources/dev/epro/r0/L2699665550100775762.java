package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L2699665550100775762 extends F12738319475220657879 {
    public final transient A13981518004556070623 d;
    public final transient E15660526696589003737 e;

    public L2699665550100775762(A13981518004556070623 a13981518004556070623, E15660526696589003737 e15660526696589003737) {
        this.d = a13981518004556070623;
        this.e = e15660526696589003737;
    }

    @Override // dev.epro.r0.F12738319475220657879, dev.epro.r0.H9330595680939527366
    public final N7756202525712935399 a() {
        return this.e;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int b(Object[] objArr) {
        return this.e.b(objArr);
    }

    @Override // dev.epro.r0.H9330595680939527366, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: l */
    public final U1864172318023436692 iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.f;
    }
}
