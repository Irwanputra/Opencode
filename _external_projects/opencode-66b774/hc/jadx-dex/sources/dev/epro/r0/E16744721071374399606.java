package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E16744721071374399606 implements dev.epro.r0.H3430986877638506198 {
    public final dev.epro.r0.Q5110743215583504520 a = new dev.epro.r0.Q5110743215583504520();
    public volatile dev.epro.r0.H3430986877638506198 b;
    public java.lang.Object c;

    public E16744721071374399606(dev.epro.r0.H3430986877638506198 h3430986877638506198) {
        this.b = h3430986877638506198;
    }

    public final java.lang.Object f() {
        if (this.b != null) {
            synchronized (this.a) {
                try {
                    if (this.b != null) {
                        java.lang.Object objF = this.b.f();
                        this.c = objF;
                        this.b = null;
                        return objF;
                    }
                } finally {
                }
            }
        }
        return this.c;
    }

    public final java.lang.String toString() {
        java.lang.String strS = this.b;
        if (strS == null) {
            strS = dev.epro.r0.G6547577305291411977.s("<supplier that returned ", java.lang.String.valueOf(this.c), ">");
        }
        return dev.epro.r0.G6547577305291411977.s("Suppliers.memoize(", strS.toString(), ")");
    }
}
