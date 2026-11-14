package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B7526239878873455655 {
    public final java.lang.String a;
    public final boolean b;

    public B7526239878873455655(java.lang.String str, boolean z) {
        if (android.text.TextUtils.isEmpty(str)) {
            dev.epro.r0.S10973172697741180971.j("Given String is empty or null");
            throw null;
        }
        this.a = str;
        if (android.text.TextUtils.isEmpty("com.google.android.gms")) {
            dev.epro.r0.S10973172697741180971.j("Given String is empty or null");
            throw null;
        }
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.B7526239878873455655)) {
            return false;
        }
        dev.epro.r0.B7526239878873455655 b7526239878873455655 = (dev.epro.r0.B7526239878873455655) obj;
        return dev.epro.r0.V1475975160983963926.t(this.a, b7526239878873455655.a) && dev.epro.r0.V1475975160983963926.t("com.google.android.gms", "com.google.android.gms") && dev.epro.r0.V1475975160983963926.t((java.lang.Object) null, (java.lang.Object) null) && this.b == b7526239878873455655.b;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{this.a, "com.google.android.gms", null, 4225, java.lang.Boolean.valueOf(this.b)});
    }

    public final java.lang.String toString() {
        java.lang.String str = this.a;
        if (str != null) {
            return str;
        }
        dev.epro.r0.M18113111391818111737.v((java.lang.Object) null);
        throw null;
    }
}
