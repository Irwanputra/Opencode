package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E2617735461520075070 {

    @dev.epro.r0.O7462376509978667369("adapter_version")
    public final java.lang.String a;

    @dev.epro.r0.O7462376509978667369("sdk_version")
    public final java.lang.String b;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.E2617735461520075070)) {
            return false;
        }
        dev.epro.r0.E2617735461520075070 e2617735461520075070 = (dev.epro.r0.E2617735461520075070) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, e2617735461520075070.a) && dev.epro.r0.S10823041268949770285.t(this.b, e2617735461520075070.b);
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.E12098517352909843120.m("AdapterVersionData(adapterVersion=", this.a, ", sdkVersion=", this.b, ")");
    }
}
