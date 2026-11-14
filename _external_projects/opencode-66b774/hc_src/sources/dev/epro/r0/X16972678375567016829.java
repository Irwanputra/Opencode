package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X16972678375567016829 extends A8269341136279542501 {
    public final float a;
    public final boolean b;

    public X16972678375567016829(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final R15896830329318850690 a() {
        U18175876226570410840 u18175876226570410840 = new U18175876226570410840();
        u18175876226570410840.f524o = this.a;
        u18175876226570410840.p = this.b;
        return u18175876226570410840;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(R15896830329318850690 r15896830329318850690) {
        U18175876226570410840 u18175876226570410840 = (U18175876226570410840) r15896830329318850690;
        u18175876226570410840.f524o = this.a;
        u18175876226570410840.p = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        X16972678375567016829 x16972678375567016829 = obj instanceof X16972678375567016829 ? (X16972678375567016829) obj : null;
        return x16972678375567016829 != null && this.a == x16972678375567016829.a && this.b == x16972678375567016829.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
