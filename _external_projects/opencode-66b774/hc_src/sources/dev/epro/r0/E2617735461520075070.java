package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E2617735461520075070 {

    @O7462376509978667369("adapter_version")
    public final String a;

    @O7462376509978667369("sdk_version")
    public final String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E2617735461520075070)) {
            return false;
        }
        E2617735461520075070 e2617735461520075070 = (E2617735461520075070) obj;
        return S10823041268949770285.t(this.a, e2617735461520075070.a) && S10823041268949770285.t(this.b, e2617735461520075070.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return E12098517352909843120.m("AdapterVersionData(adapterVersion=", this.a, ", sdkVersion=", this.b, ")");
    }
}
