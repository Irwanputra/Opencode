package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class A1678340015183642392 {
    public final String a;
    public final int b;
    public final boolean c;

    public A1678340015183642392(String str, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A1678340015183642392)) {
            return false;
        }
        A1678340015183642392 a1678340015183642392 = (A1678340015183642392) obj;
        return S10823041268949770285.t(this.a, a1678340015183642392.a) && this.b == a1678340015183642392.b && this.c == a1678340015183642392.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return E12098517352909843120.o(G6547577305291411977.x(this.b, "LiteVpnRoute(address=", this.a, ", prefixLength=", ", ipv6="), this.c, ")");
    }
}
