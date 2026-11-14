package dev.epro.r0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B18372450834991815898 extends F12738319475220657879 {
    public final transient A13981518004556070623 d;
    public final transient Object[] e;
    public final transient int f;

    public B18372450834991815898(A13981518004556070623 a13981518004556070623, Object[] objArr, int i) {
        this.d = a13981518004556070623;
        this.e = objArr;
        this.f = i;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final int b(Object[] objArr) {
        return a().b(objArr);
    }

    @Override // dev.epro.r0.H9330595680939527366, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.H9330595680939527366
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final U1864172318023436692 iterator() {
        return a().listIterator(0);
    }

    @Override // dev.epro.r0.F12738319475220657879
    public final N7756202525712935399 o() {
        return new I8109741225409501516(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f;
    }
}
