package ads_mobile_sdk;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class js2 implements dev.epro.r0.R16693852608535438299 {
    public final dev.epro.r0.C11752927553109765869 a;
    public final int b;
    public final dev.epro.r0.Z17282431307283367535 c;

    public js2(dev.epro.r0.C11752927553109765869 c11752927553109765869, int i, dev.epro.r0.Z17282431307283367535 z17282431307283367535) {
        c11752927553109765869.getClass();
        this.a = c11752927553109765869;
        this.b = i;
        this.c = z17282431307283367535;
    }

    public final void a(dev.epro.r0.P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        int i = this.b;
        if (i > 0) {
            p3477296814990354048.B1 = java.lang.Integer.valueOf(i);
        }
        p3477296814990354048.U = new dev.epro.r0.N42765300390889244(this.a);
        p3477296814990354048.n1 = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ads_mobile_sdk.js2)) {
            return false;
        }
        ads_mobile_sdk.js2 js2Var = (ads_mobile_sdk.js2) obj;
        return dev.epro.r0.S10823041268949770285.t(this.a, js2Var.a) && this.b == js2Var.b && this.c.equals(js2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dev.epro.r0.U1554499319261669842.h(this.b, this.a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "QualitySignal(appStats=" + this.a + ", numberOfRegisteredWebViews=" + this.b + ", adUnitQualitySignals=" + this.c + ")";
    }
}
