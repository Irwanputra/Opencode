package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class E16744721071374399606 implements H3430986877638506198 {
    public final Q5110743215583504520 a = new Q5110743215583504520();
    public volatile H3430986877638506198 b;
    public Object c;

    public E16744721071374399606(H3430986877638506198 h3430986877638506198) {
        this.b = h3430986877638506198;
    }

    @Override // dev.epro.r0.H3430986877638506198
    public final Object f() {
        if (this.b != null) {
            synchronized (this.a) {
                try {
                    if (this.b != null) {
                        Object objF = this.b.f();
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

    public final String toString() {
        Object objS = this.b;
        if (objS == null) {
            objS = G6547577305291411977.s("<supplier that returned ", String.valueOf(this.c), ">");
        }
        return G6547577305291411977.s("Suppliers.memoize(", objS.toString(), ")");
    }
}
