package dev.epro.r0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K2976652177739377661 implements Serializable, H3430986877638506198 {
    public final transient Q5110743215583504520 a = new Q5110743215583504520();
    public final H3430986877638506198 b;
    public volatile transient boolean c;
    public transient Object d;

    public K2976652177739377661(H3430986877638506198 h3430986877638506198) {
        this.b = h3430986877638506198;
    }

    @Override // dev.epro.r0.H3430986877638506198
    public final Object f() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object objF = this.b.f();
                        this.d = objF;
                        this.c = true;
                        return objF;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        return G6547577305291411977.s("Suppliers.memoize(", (this.c ? G6547577305291411977.s("<supplier that returned ", String.valueOf(this.d), ">") : this.b).toString(), ")");
    }
}
