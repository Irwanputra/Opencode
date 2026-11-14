package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U5053826207126138866 extends O8620973563946607355 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final R14289894334981469490 f527o;

    public U5053826207126138866(R14289894334981469490 r14289894334981469490) {
        this.f527o = r14289894334981469490;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || U5053826207126138866.class != obj.getClass()) {
            return false;
        }
        return S10823041268949770285.t(this.f527o, ((U5053826207126138866) obj).f527o);
    }

    public final int hashCode() {
        R14289894334981469490 r14289894334981469490 = this.f527o;
        if (r14289894334981469490 != null) {
            return r14289894334981469490.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "NavBackStackEntryInfo(visibleEntry=" + this.f527o + ")";
    }
}
