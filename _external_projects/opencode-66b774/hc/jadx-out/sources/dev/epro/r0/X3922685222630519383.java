package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X3922685222630519383 extends E1517907155487775131 {
    public final long[] d;

    /* JADX WARN: Illegal instructions before constructor call */
    public X3922685222630519383(D2456187031834883815 d2456187031834883815) {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        super(jArr, jArr2, jArr4);
        this.d = jArr3;
        Q7316561721656982910 q7316561721656982910 = d2456187031834883815.a;
        O4077903568229246.T(jArr, (long[]) q7316561721656982910.c, (long[]) q7316561721656982910.b);
        O4077903568229246.S(jArr2, (long[]) q7316561721656982910.c, (long[]) q7316561721656982910.b);
        System.arraycopy((long[]) q7316561721656982910.d, 0, jArr3, 0, 10);
        O4077903568229246.E(jArr4, d2456187031834883815.b, F1919009084933321653.b);
    }

    @Override // dev.epro.r0.E1517907155487775131
    public final void b(long[] jArr, long[] jArr2) {
        O4077903568229246.E(jArr, jArr2, this.d);
    }
}
