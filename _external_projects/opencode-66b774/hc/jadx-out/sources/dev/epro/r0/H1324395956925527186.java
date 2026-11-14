package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public interface H1324395956925527186 extends W1972671267364756056, L13148442655056575112 {
    @Override // dev.epro.r0.L13148442655056575112
    default Object getValue() {
        return Long.valueOf(((D10907589866287058828) this).g());
    }

    @Override // dev.epro.r0.W1972671267364756056
    default void setValue(Object obj) {
        ((D10907589866287058828) this).h(((Number) obj).longValue());
    }
}
