package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E936446761334852831 implements dev.epro.r0.M7586588299491030525 {
    public final dev.epro.r0.R13600139557160461432 a;

    public E936446761334852831(dev.epro.r0.R13600139557160461432 r13600139557160461432) {
        this.a = r13600139557160461432;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof dev.epro.r0.E936446761334852831) {
            return this.a.equals(((dev.epro.r0.E936446761334852831) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
