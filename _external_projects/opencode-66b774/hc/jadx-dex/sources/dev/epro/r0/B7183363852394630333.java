package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B7183363852394630333 extends dev.epro.r0.B16024634506412482045 {
    public int a;
    public final /* synthetic */ dev.epro.r0.E8321115364184429049 b;

    public B7183363852394630333(dev.epro.r0.E8321115364184429049 e8321115364184429049) {
        this.b = e8321115364184429049;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.d();
    }

    @Override // dev.epro.r0.B16024634506412482045
    public final int nextInt() {
        int i = this.a;
        this.a = i + 1;
        return this.b.b(i);
    }
}
