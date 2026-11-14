package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Z4204317696696431622 implements R13778158386904154684 {
    public final Object a;

    public Z4204317696696431622(Object obj) {
        this.a = obj;
    }

    @Override // dev.epro.r0.R13778158386904154684
    public final Object a(P3648740535677465818 p3648740535677465818) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Z4204317696696431622) && S10823041268949770285.t(this.a, ((Z4204317696696431622) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ")";
    }
}
