package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A1678340015183642392 {
    public final java.lang.String a;
    public final int b;
    public final boolean c;

    public A1678340015183642392(java.lang.String str, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dev.epro.r0.A1678340015183642392)) {
            return false;
        }
        dev.epro.r0.A1678340015183642392 a1678340015183642392 = (dev.epro.r0.A1678340015183642392) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, a1678340015183642392.a) && this.b == a1678340015183642392.b && this.c == a1678340015183642392.c;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.c) + dev.epro.r0.X2485016533998461232.f(this.b, this.a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        return dev.epro.r0.E12098517352909843120.o(dev.epro.r0.G6547577305291411977.x(this.b, "LiteVpnRoute(address=", this.a, ", prefixLength=", ", ipv6="), this.c, ")");
    }
}
