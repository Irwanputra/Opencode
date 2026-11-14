package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K133131628788954134 implements V4446577237959483780 {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ K10678596132709730734 c;

    public K133131628788954134(Class cls, Class cls2, K10678596132709730734 k10678596132709730734) {
        this.a = cls;
        this.b = cls2;
        this.c = k10678596132709730734;
    }

    @Override // dev.epro.r0.V4446577237959483780
    public final K10678596132709730734 a(F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
        Class cls = k11898134656129953686.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
    }
}
