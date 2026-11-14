package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public interface K6937929821947263863 extends M15459437176959963354 {
    @Override // dev.epro.r0.M15459437176959963354
    default V9266657454036696449 a(R3937090736490516115 r3937090736490516115) {
        return new J15730374346044043770(this);
    }

    long b(float f, float f2, float f3);

    float c(float f, float f2, float f3, long j);

    float d(float f, float f2, float f3, long j);

    default float e(float f, float f2, float f3) {
        return d(f, f2, f3, b(f, f2, f3));
    }
}
