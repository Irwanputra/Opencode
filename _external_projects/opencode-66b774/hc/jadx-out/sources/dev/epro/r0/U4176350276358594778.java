package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U4176350276358594778 implements R13778158386904154684 {
    public final V697849047308847220 a;

    public U4176350276358594778(V697849047308847220 v697849047308847220) {
        this.a = v697849047308847220;
    }

    @Override // dev.epro.r0.R13778158386904154684
    public final Object a(P3648740535677465818 p3648740535677465818) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof U4176350276358594778) && this.a == ((U4176350276358594778) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ")";
    }
}
