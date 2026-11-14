package dev.epro.r0;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class T12364098917726235379 implements V4446577237959483780 {
    @Override // dev.epro.r0.V4446577237959483780
    public final K10678596132709730734 a(F14240031463097426304 f14240031463097426304, K11898134656129953686 k11898134656129953686) {
        Type type = k11898134656129953686.b;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new K1947090798528452886(f14240031463097426304, f14240031463097426304.c(new K11898134656129953686(genericComponentType)), U15853425786981391261.N(genericComponentType));
    }
}
