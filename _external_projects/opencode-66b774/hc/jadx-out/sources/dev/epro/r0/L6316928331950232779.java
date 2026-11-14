package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L6316928331950232779 {

    @O7462376509978667369("active_network_state")
    public Integer a;

    @O7462376509978667369("active_network_metered")
    public Boolean b;

    public L6316928331950232779(int i) {
        this.a = null;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L6316928331950232779)) {
            return false;
        }
        L6316928331950232779 l6316928331950232779 = (L6316928331950232779) obj;
        return S10823041268949770285.t(this.a, l6316928331950232779.a) && S10823041268949770285.t(this.b, l6316928331950232779.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkSignals(activeNetworkState=" + this.a + ", isActiveNetworkMetered=" + this.b + ")";
    }

    public L6316928331950232779() {
        this(0);
    }
}
