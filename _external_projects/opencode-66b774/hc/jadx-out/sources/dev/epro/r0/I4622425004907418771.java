package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I4622425004907418771 extends T9533098554585011700 {
    public A4783298371339261043 c;
    public int d;
    public int e;

    public I4622425004907418771(long j, A4783298371339261043 a4783298371339261043) {
        super(j);
        this.c = a4783298371339261043;
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final void a(T9533098554585011700 t9533098554585011700) {
        synchronized (E3422549137300678133.m) {
            t9533098554585011700.getClass();
            this.c = ((I4622425004907418771) t9533098554585011700).c;
            this.d = ((I4622425004907418771) t9533098554585011700).d;
            this.e = ((I4622425004907418771) t9533098554585011700).e;
        }
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final T9533098554585011700 b() {
        return c(D459204867321966484.h().g());
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final T9533098554585011700 c(long j) {
        return new I4622425004907418771(j, this.c);
    }
}
