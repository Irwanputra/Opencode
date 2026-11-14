package dev.epro.r0;

import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I14333812743650240278 extends U12539945048130217525 {
    @Override // dev.epro.r0.C1290752467339106930
    public final double d() {
        return ThreadLocalRandom.current().nextDouble(1.0d);
    }

    @Override // dev.epro.r0.C1290752467339106930
    public final int g(int i) {
        return ThreadLocalRandom.current().nextInt(0, i);
    }

    @Override // dev.epro.r0.C1290752467339106930
    public final long i(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }
}
