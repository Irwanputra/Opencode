package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S4938745182264118441 implements R13778158386904154684 {
    public final F4096073349764486348 a;

    public S4938745182264118441(F4096073349764486348 f4096073349764486348) {
        this.a = f4096073349764486348;
    }

    @Override // dev.epro.r0.R13778158386904154684
    public final Object a(P3648740535677465818 p3648740535677465818) {
        return this.a.invoke(p3648740535677465818);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof S4938745182264118441) && S10823041268949770285.t(this.a, ((S4938745182264118441) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.a + ")";
    }
}
