package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C7584963549263810245 extends ads_mobile_sdk.au0 {
    public final void c(java.lang.String str) {
        java.util.Objects.requireNonNull(str);
        b();
        ((ads_mobile_sdk.vr0) this.b).q().remove(str);
    }

    public final void d(java.lang.String str, ads_mobile_sdk.g6 g6Var) {
        java.util.Objects.requireNonNull(str);
        b();
        ((ads_mobile_sdk.vr0) this.b).q().put(str, g6Var);
    }

    public final java.util.Map e() {
        return java.util.Collections.unmodifiableMap(java.util.Collections.unmodifiableMap(((ads_mobile_sdk.vr0) this.b).adResponseLists_));
    }
}
