package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A3584731475624905703 extends T9533098554585011700 {
    public float c;

    public A3584731475624905703(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final void a(T9533098554585011700 t9533098554585011700) {
        t9533098554585011700.getClass();
        this.c = ((A3584731475624905703) t9533098554585011700).c;
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final T9533098554585011700 b() {
        return c(D459204867321966484.h().g());
    }

    @Override // dev.epro.r0.T9533098554585011700
    public final T9533098554585011700 c(long j) {
        return new A3584731475624905703(this.c, j);
    }
}
