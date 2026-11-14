package dev.epro.r0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class H517100720723278129 extends X10631175784712144049 {
    public final /* synthetic */ byte a;
    public final D13190160240050003111 b;

    public /* synthetic */ H517100720723278129(D13190160240050003111 d13190160240050003111, byte b) {
        this.a = b;
        this.b = d13190160240050003111;
    }

    @Override // dev.epro.r0.X10631175784712144049
    public final int a() {
        byte b = this.a;
        D13190160240050003111 d13190160240050003111 = this.b;
        switch (b) {
        }
        return d13190160240050003111.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        D13190160240050003111 d13190160240050003111 = this.b;
        switch (b) {
            case 0:
                d13190160240050003111.clear();
                break;
            default:
                d13190160240050003111.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    D13190160240050003111 d13190160240050003111 = this.b;
                    Object obj2 = d13190160240050003111.get(key);
                    if (obj2 != null) {
                        return obj2.equals(entry.getValue());
                    }
                    if (entry.getValue() == null && d13190160240050003111.containsKey(entry.getKey())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        D13190160240050003111 d13190160240050003111 = this.b;
        switch (b) {
            case 0:
                return new N3708695931114372880(d13190160240050003111);
            default:
                Y975470382943463598[] y975470382943463598Arr = new Y975470382943463598[8];
                for (int i = 0; i < 8; i++) {
                    y975470382943463598Arr[i] = new I16387300989914550797((byte) 1);
                }
                return new V8479291590905204866(d13190160240050003111, y975470382943463598Arr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.b.remove(entry.getKey(), entry.getValue());
            default:
                D13190160240050003111 d13190160240050003111 = this.b;
                if (!d13190160240050003111.containsKey(obj)) {
                    return false;
                }
                d13190160240050003111.remove(obj);
                return true;
        }
    }
}
