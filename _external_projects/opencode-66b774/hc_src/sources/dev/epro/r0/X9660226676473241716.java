package dev.epro.r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X9660226676473241716 extends X10631175784712144049 {
    public final /* synthetic */ byte a;
    public final H6457936572911484476 b;

    public /* synthetic */ X9660226676473241716(H6457936572911484476 h6457936572911484476, byte b) {
        this.a = b;
        this.b = h6457936572911484476;
    }

    @Override // dev.epro.r0.X10631175784712144049
    public final int a() {
        byte b = this.a;
        H6457936572911484476 h6457936572911484476 = this.b;
        switch (b) {
        }
        return h6457936572911484476.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        byte b = this.a;
        collection.getClass();
        switch (b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        H6457936572911484476 h6457936572911484476 = this.b;
        switch (b) {
            case 0:
                h6457936572911484476.clear();
                break;
            default:
                h6457936572911484476.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        H6457936572911484476 h6457936572911484476 = this.b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int g = h6457936572911484476.g(entry.getKey());
                if (g < 0) {
                    return false;
                }
                Object[] objArr = h6457936572911484476.b;
                objArr.getClass();
                return S10823041268949770285.t(objArr[g], entry.getValue());
            default:
                return h6457936572911484476.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                return this.b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        byte b = this.a;
        H6457936572911484476 h6457936572911484476 = this.b;
        switch (b) {
        }
        return h6457936572911484476.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        H6457936572911484476 h6457936572911484476 = this.b;
        switch (b) {
            case 0:
                return new R14031816171567756273(h6457936572911484476, (byte) 0);
            default:
                return new R14031816171567756273(h6457936572911484476, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        H6457936572911484476 h6457936572911484476 = this.b;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    h6457936572911484476.c();
                    int g = h6457936572911484476.g(entry.getKey());
                    if (g >= 0) {
                        Object[] objArr = h6457936572911484476.b;
                        objArr.getClass();
                        if (S10823041268949770285.t(objArr[g], entry.getValue())) {
                            h6457936572911484476.k(g);
                            break;
                        }
                    }
                }
                break;
            default:
                h6457936572911484476.c();
                int g2 = h6457936572911484476.g(obj);
                if (g2 >= 0) {
                    h6457936572911484476.k(g2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        byte b = this.a;
        H6457936572911484476 h6457936572911484476 = this.b;
        collection.getClass();
        switch (b) {
            case 0:
                h6457936572911484476.c();
                break;
            default:
                h6457936572911484476.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        byte b = this.a;
        H6457936572911484476 h6457936572911484476 = this.b;
        collection.getClass();
        switch (b) {
            case 0:
                h6457936572911484476.c();
                break;
            default:
                h6457936572911484476.c();
                break;
        }
        return super.retainAll(collection);
    }
}
