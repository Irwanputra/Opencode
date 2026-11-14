package dev.epro.r0;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class U12539945048130217525 extends C1290752467339106930 {
    @Override // dev.epro.r0.C1290752467339106930
    public final int a(int i) {
        return (j().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    @Override // dev.epro.r0.C1290752467339106930
    public final double c() {
        return j().nextDouble();
    }

    @Override // dev.epro.r0.C1290752467339106930
    public final int f() {
        return j().nextInt();
    }

    @Override // dev.epro.r0.C1290752467339106930
    public final long h() {
        return j().nextLong();
    }

    public Random j() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }

    public final int k(int i) {
        return j().nextInt(i);
    }
}
