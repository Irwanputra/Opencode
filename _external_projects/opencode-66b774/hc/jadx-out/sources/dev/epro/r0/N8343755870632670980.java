package dev.epro.r0;

import java.util.IdentityHashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N8343755870632670980 extends IdentityHashMap {
    @Override // java.util.IdentityHashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        J9761478802862050991 j9761478802862050991 = (J9761478802862050991) obj2;
        return (J9761478802862050991) super.put(obj, new J12933753562753776578(j9761478802862050991.a, j9761478802862050991.b, j9761478802862050991.c));
    }
}
