package dev.epro.r0;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
                Map b2 = t5910761665012682387.b();
                if (b2 != null) {
                    return b2.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int d = t5910761665012682387.d(entry.getKey());
                    if (d != -1 && M2066880349381062048.A(t5910761665012682387.j()[d], entry.getValue())) {
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
                Map b2 = t5910761665012682387.b();
                return b2 != null ? b2.entrySet().iterator() : new I16505841721158300488(t5910761665012682387, (byte) 1);
            default:
                Map b3 = t5910761665012682387.b();
                return b3 != null ? b3.keySet().iterator() : new I16505841721158300488(t5910761665012682387, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.a;
        T5910761665012682387 t5910761665012682387 = this.b;
        switch (b) {
            case 0:
                Map b2 = t5910761665012682387.b();
                if (b2 == null) {
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        if (!t5910761665012682387.f()) {
                            int c = t5910761665012682387.c();
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            Object obj2 = t5910761665012682387.a;
                            Objects.requireNonNull(obj2);
                            int V = D15445857918358799638.V(key, value, c, obj2, t5910761665012682387.h(), t5910761665012682387.i(), t5910761665012682387.j());
                            if (V != -1) {
                                t5910761665012682387.e(V, c);
                                t5910761665012682387.f--;
                                t5910761665012682387.e += 32;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            default:
                Map b3 = t5910761665012682387.b();
                if (b3 == null) {
                    if (t5910761665012682387.g(obj) != T5910761665012682387.j) {
                        break;
                    }
                } else {
                    break;
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
