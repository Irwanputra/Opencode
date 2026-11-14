package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class X17832762133164229673 implements Cloneable {
    public final K17275736824900228431 a;
    public K17275736824900228431 b;

    public X17832762133164229673(K17275736824900228431 k17275736824900228431) {
        this.a = k17275736824900228431;
        if (k17275736824900228431.e()) {
            S10973172697741180971.j("Default instance must be immutable.");
            throw null;
        }
        this.b = k17275736824900228431.f();
    }

    public final K17275736824900228431 a() {
        boolean zE = this.b.e();
        K17275736824900228431 k17275736824900228431 = this.b;
        if (!zE) {
            return k17275736824900228431;
        }
        k17275736824900228431.getClass();
        X1177226880161088161 x1177226880161088161 = X1177226880161088161.c;
        x1177226880161088161.getClass();
        x1177226880161088161.a(k17275736824900228431.getClass()).b(k17275736824900228431);
        k17275736824900228431.b &= Integer.MAX_VALUE;
        return this.b;
    }

    public final Object clone() {
        X17832762133164229673 x17832762133164229673 = (X17832762133164229673) this.a.a(5);
        x17832762133164229673.b = a();
        return x17832762133164229673;
    }
}
