package dev.epro.r0;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S11564727846197427291 extends AbstractSet {
    public final /* synthetic */ byte a;
    public final /* synthetic */ H14305894327539119220 b;

    public /* synthetic */ S11564727846197427291(H14305894327539119220 h14305894327539119220, byte b) {
        this.a = b;
        this.b = h14305894327539119220;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.a;
        H14305894327539119220 h14305894327539119220 = this.b;
        switch (b) {
            case 0:
                h14305894327539119220.clear();
                break;
            default:
                h14305894327539119220.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        S8064361206571326475 s8064361206571326475A;
        byte b = this.a;
        H14305894327539119220 h14305894327539119220 = this.b;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                S8064361206571326475 s8064361206571326475 = null;
                if (key != null) {
                    try {
                        s8064361206571326475A = h14305894327539119220.a(key, false);
                    } catch (ClassCastException unused) {
                        s8064361206571326475A = null;
                    }
                    break;
                } else {
                    s8064361206571326475A = null;
                }
                if (s8064361206571326475A != null && Objects.equals(s8064361206571326475A.h, entry.getValue())) {
                    s8064361206571326475 = s8064361206571326475A;
                }
                return s8064361206571326475 != null;
            default:
                return h14305894327539119220.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.a;
        H14305894327539119220 h14305894327539119220 = this.b;
        switch (b) {
            case 0:
                return new L622219180424329983(h14305894327539119220, (byte) 0);
            default:
                return new L622219180424329983(h14305894327539119220, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        S8064361206571326475 s8064361206571326475A;
        byte b = this.a;
        S8064361206571326475 s8064361206571326475A2 = null;
        H14305894327539119220 h14305894327539119220 = this.b;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    if (key != null) {
                        try {
                            s8064361206571326475A = h14305894327539119220.a(key, false);
                        } catch (ClassCastException unused) {
                            s8064361206571326475A = null;
                        }
                    } else {
                        s8064361206571326475A = null;
                    }
                    if (s8064361206571326475A != null && Objects.equals(s8064361206571326475A.h, entry.getValue())) {
                        s8064361206571326475A2 = s8064361206571326475A;
                    }
                    if (s8064361206571326475A2 != null) {
                        h14305894327539119220.c(s8064361206571326475A2, true);
                        break;
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    try {
                        s8064361206571326475A2 = h14305894327539119220.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (s8064361206571326475A2 != null) {
                    h14305894327539119220.c(s8064361206571326475A2, true);
                }
                if (s8064361206571326475A2 != null) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.a;
        H14305894327539119220 h14305894327539119220 = this.b;
        switch (b) {
        }
        return h14305894327539119220.d;
    }
}
