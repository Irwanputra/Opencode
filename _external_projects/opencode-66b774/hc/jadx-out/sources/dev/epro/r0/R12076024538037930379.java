package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class R12076024538037930379 implements V4446577237959483780 {
    @Override // dev.epro.r0.V4446577237959483780
    public final K10678596132709730734 a(F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
        Class superclass = k11898134656129953686.a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new Q9578470633816342965(superclass);
    }
}
