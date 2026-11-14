package dev.epro.r0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S5911664163520104644 extends AbstractCollection implements Collection, S3000285732458222736 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ S5911664163520104644(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((H6457936572911484476) obj).clear();
                break;
            default:
                ((D13190160240050003111) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((H6457936572911484476) obj2).containsValue(obj);
            default:
                return ((D13190160240050003111) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((H6457936572911484476) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new R14031816171567756273((H6457936572911484476) obj, (byte) 2);
            default:
                D13190160240050003111 d13190160240050003111 = (D13190160240050003111) obj;
                Y975470382943463598[] y975470382943463598Arr = new Y975470382943463598[8];
                for (int i = 0; i < 8; i++) {
                    y975470382943463598Arr[i] = new I16387300989914550797((byte) 2);
                }
                return new V8479291590905204866(d13190160240050003111, y975470382943463598Arr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                H6457936572911484476 h6457936572911484476 = (H6457936572911484476) this.b;
                h6457936572911484476.c();
                int h = h6457936572911484476.h(obj);
                if (h < 0) {
                    return false;
                }
                h6457936572911484476.k(h);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                ((H6457936572911484476) this.b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                ((H6457936572911484476) this.b).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((H6457936572911484476) obj).i;
            default:
                return ((D13190160240050003111) obj).e;
        }
    }
}
