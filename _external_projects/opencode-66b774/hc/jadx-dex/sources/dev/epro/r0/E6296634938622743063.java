package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E6296634938622743063 {
    public final android.content.res.Resources a;
    public final android.content.res.Resources.Theme b;

    public E6296634938622743063(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dev.epro.r0.E6296634938622743063.class == obj.getClass()) {
            dev.epro.r0.E6296634938622743063 e6296634938622743063 = (dev.epro.r0.E6296634938622743063) obj;
            if (this.a.equals(e6296634938622743063.a) && java.util.Objects.equals(this.b, e6296634938622743063.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.a, this.b);
    }
}
