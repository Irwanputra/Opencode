package dev.epro.r0;

import java.util.Map;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class S8064361206571326475 implements Map.Entry {
    public S8064361206571326475 a;
    public S8064361206571326475 b;
    public S8064361206571326475 c;
    public S8064361206571326475 d;
    public S8064361206571326475 e;
    public final Object f;
    public final boolean g;
    public Object h;
    public int i;

    public S8064361206571326475(boolean z, S8064361206571326475 s8064361206571326475, Object obj, S8064361206571326475 s80643612065713264752, S8064361206571326475 s80643612065713264753) {
        this.a = s8064361206571326475;
        this.f = obj;
        this.g = z;
        this.i = 1;
        this.d = s80643612065713264752;
        this.e = s80643612065713264753;
        s80643612065713264753.d = this;
        s80643612065713264752.e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.h;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.h;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.g) {
            Z3383101362411723454.k("value == null");
            return null;
        }
        Object obj2 = this.h;
        this.h = obj;
        return obj2;
    }

    public final String toString() {
        return this.f + "=" + this.h;
    }

    public S8064361206571326475(boolean z) {
        this.f = null;
        this.g = z;
        this.e = this;
        this.d = this;
    }
}
