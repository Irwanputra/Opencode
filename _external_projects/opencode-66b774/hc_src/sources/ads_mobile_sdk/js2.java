package ads_mobile_sdk;

import dev.epro.r0.C11752927553109765869;
import dev.epro.r0.N42765300390889244;
import dev.epro.r0.P3477296814990354048;
import dev.epro.r0.R16693852608535438299;
import dev.epro.r0.S10823041268949770285;
import dev.epro.r0.U1554499319261669842;
import dev.epro.r0.Z17282431307283367535;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class js2 implements R16693852608535438299 {
    public final C11752927553109765869 a;
    public final int b;
    public final Z17282431307283367535 c;

    public js2(C11752927553109765869 c11752927553109765869, int i, Z17282431307283367535 z17282431307283367535) {
        c11752927553109765869.getClass();
        this.a = c11752927553109765869;
        this.b = i;
        this.c = z17282431307283367535;
    }

    @Override // dev.epro.r0.R16693852608535438299
    public final void a(P3477296814990354048 p3477296814990354048) {
        p3477296814990354048.getClass();
        int i = this.b;
        if (i > 0) {
            p3477296814990354048.B1 = Integer.valueOf(i);
        }
        p3477296814990354048.U = new N42765300390889244(this.a);
        p3477296814990354048.n1 = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js2)) {
            return false;
        }
        js2 js2Var = (js2) obj;
        return S10823041268949770285.t(this.a, js2Var.a) && this.b == js2Var.b && this.c.equals(js2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + U1554499319261669842.h(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QualitySignal(appStats=" + this.a + ", numberOfRegisteredWebViews=" + this.b + ", adUnitQualitySignals=" + this.c + ")";
    }
}
