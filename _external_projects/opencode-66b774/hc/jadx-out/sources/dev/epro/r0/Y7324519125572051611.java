package dev.epro.r0;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Y7324519125572051611 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ T5910761665012682387 b;

    public /* synthetic */ Y7324519125572051611(T5910761665012682387 t5910761665012682387, byte b) {
        this.a = b;
        this.b = t5910761665012682387;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        T5910761665012682387 t5910761665012682387 = this.b;
        switch (b) {
            case 0:
                t5910761665012682387.clear();
                break;
            default:
                t5910761665012682387.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.a;
        T5910761665012682387 t5910761665012682387 = this.b;
        switch (b) {
            case 0:
                Map mapB = t5910761665012682387.b();
                if (mapB != null) {
                    return mapB.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iD = t5910761665012682387.d(entry.getKey());
                    if (iD != -1 && M2066880349381062048.A(t5910761665012682387.j()[iD], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return t5910761665012682387.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        T5910761665012682387 t5910761665012682387 = this.b;
        switch (b) {
            case 0:
                Map mapB = t5910761665012682387.b();
                return mapB != null ? mapB.entrySet().iterator() : new I16505841721158300488(t5910761665012682387, (byte) 1);
            default:
                Map mapB2 = t5910761665012682387.b();
                return mapB2 != null ? mapB2.keySet().iterator() : new I16505841721158300488(t5910761665012682387, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        T5910761665012682387 t5910761665012682387 = this.b;
        switch (b) {
            case 0:
                Map mapB = t5910761665012682387.b();
                if (mapB != null) {
                    break;
                } else if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!t5910761665012682387.f()) {
                        int iC = t5910761665012682387.c();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = t5910761665012682387.a;
                        Objects.requireNonNull(obj2);
                        int iV = D15445857918358799638.V(key, value, iC, obj2, t5910761665012682387.h(), t5910761665012682387.i(), t5910761665012682387.j());
                        if (iV != -1) {
                            t5910761665012682387.e(iV, iC);
                            t5910761665012682387.f--;
                            t5910761665012682387.e += 32;
                            break;
                        }
                    }
                }
                break;
            default:
                Map mapB2 = t5910761665012682387.b();
                if (mapB2 == null) {
                    if (t5910761665012682387.g(obj) != T5910761665012682387.j) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        T5910761665012682387 t5910761665012682387 = this.b;
        switch (b) {
        }
        return t5910761665012682387.size();
    }
}
