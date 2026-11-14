package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E15660526696589003737 extends dev.epro.r0.N7756202525712935399 {
    public final transient java.lang.Object[] c;
    public final transient boolean d;
    public final transient int e;

    /* JADX WARN: Multi-variable type inference failed */
    public E15660526696589003737(java.lang.Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    public final java.lang.Object get(int i) {
        dev.epro.r0.U15853425786981391261.w(i, this.e);
        java.lang.Object obj = this.c[(i * 2) + (this.d ? 1 : 0)];
        java.util.Objects.requireNonNull(obj);
        return obj;
    }

    public final boolean k() {
        return true;
    }

    public final int size() {
        return this.e;
    }
}
