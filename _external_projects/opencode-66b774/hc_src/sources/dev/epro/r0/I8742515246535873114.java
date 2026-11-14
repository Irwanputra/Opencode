package dev.epro.r0;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I8742515246535873114 extends R5425141374325592367 implements M9021326446326000287 {
    public final ArrayList b;

    static {
        new I8742515246535873114(10).a = false;
    }

    public I8742515246535873114(int i) {
        this(new ArrayList(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // dev.epro.r0.R5425141374325592367, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof M9021326446326000287) {
            collection = ((M9021326446326000287) collection).d();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // dev.epro.r0.R5425141374325592367
    public final R5425141374325592367 b(int i) {
        ArrayList arrayList = this.b;
        if (i < arrayList.size()) {
            K2042933864045806308.h();
            return null;
        }
        ArrayList arrayList2 = new ArrayList(i);
        arrayList2.addAll(arrayList);
        return new I8742515246535873114(arrayList2);
    }

    @Override // dev.epro.r0.R5425141374325592367, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // dev.epro.r0.M9021326446326000287
    public final List d() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // dev.epro.r0.M9021326446326000287
    public final void e(B15200565448991586841 b15200565448991586841) {
        a();
        this.b.add(b15200565448991586841);
        ((AbstractList) this).modCount++;
    }

    @Override // dev.epro.r0.M9021326446326000287
    public final M9021326446326000287 f() {
        return this.a ? new G6682437202242600944(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ArrayList arrayList = this.b;
        Object obj = arrayList.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof B15200565448991586841)) {
            byte[] bArr = (byte[]) obj;
            String str = new String(bArr, X10245771154555039797.a);
            if (F2424644667972238580.a.p(0, bArr, bArr.length) == 0) {
                arrayList.set(i, str);
            }
            return str;
        }
        B15200565448991586841 b15200565448991586841 = (B15200565448991586841) obj;
        String str2 = b15200565448991586841.size() == 0 ? "" : new String(b15200565448991586841.b, b15200565448991586841.j(), b15200565448991586841.size(), X10245771154555039797.a);
        int j = b15200565448991586841.j();
        if (F2424644667972238580.a.p(j, b15200565448991586841.b, b15200565448991586841.size() + j) == 0) {
            arrayList.set(i, str2);
        }
        return str2;
    }

    @Override // dev.epro.r0.R5425141374325592367, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof B15200565448991586841)) {
            return new String((byte[]) remove, X10245771154555039797.a);
        }
        B15200565448991586841 b15200565448991586841 = (B15200565448991586841) remove;
        return b15200565448991586841.size() == 0 ? "" : new String(b15200565448991586841.b, b15200565448991586841.j(), b15200565448991586841.size(), X10245771154555039797.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof B15200565448991586841)) {
            return new String((byte[]) obj2, X10245771154555039797.a);
        }
        B15200565448991586841 b15200565448991586841 = (B15200565448991586841) obj2;
        return b15200565448991586841.size() == 0 ? "" : new String(b15200565448991586841.b, b15200565448991586841.j(), b15200565448991586841.size(), X10245771154555039797.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public I8742515246535873114(ArrayList arrayList) {
        this.b = arrayList;
    }

    @Override // dev.epro.r0.R5425141374325592367, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }
}
