package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public interface H4526303238406690808 {
    Object b();

    default boolean c(Object obj, Object obj2) {
        return obj.equals(b()) && obj2.equals(d());
    }

    Object d();
}
