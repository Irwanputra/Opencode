package dev.epro.r0;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C1309492667323693710 {
    public final int a;
    public final Method b;

    public C1309492667323693710(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1309492667323693710)) {
            return false;
        }
        C1309492667323693710 c1309492667323693710 = (C1309492667323693710) obj;
        return this.a == c1309492667323693710.a && this.b.getName().equals(c1309492667323693710.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
