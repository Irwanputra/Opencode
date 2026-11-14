package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q17328187304616842000 implements C16999414938027834076 {
    public final /* synthetic */ W5896017744614017491 a;

    public Q17328187304616842000(W5896017744614017491 w5896017744614017491) {
        this.a = w5896017744614017491;
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final int a() {
        W5896017744614017491 w5896017744614017491 = this.a;
        return (int) (w5896017744614017491.g().r == R7000310675073492254.a ? w5896017744614017491.g().i() & 4294967295L : w5896017744614017491.g().i() >> 32);
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final float b() {
        W5896017744614017491 w5896017744614017491 = this.a;
        return (w5896017744614017491.d.b.g() * 500) + w5896017744614017491.d.c.g();
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final Z9903412080743350895 c() {
        return new Z9903412080743350895(-1, -1);
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final Object d(int i, I3566570148522791385 i3566570148522791385) {
        Object objI = W5896017744614017491.i(this.a, i, i3566570148522791385);
        return objI == Z3437138737604933638.a ? objI : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final int e() {
        W5896017744614017491 w5896017744614017491 = this.a;
        return (-w5896017744614017491.g().f328o) + w5896017744614017491.g().s;
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final float f() {
        W5896017744614017491 w5896017744614017491 = this.a;
        int iG = w5896017744614017491.d.b.g();
        int iG2 = w5896017744614017491.d.c.g();
        return w5896017744614017491.c() ? (iG * 500) + iG2 + 100.0f : (iG * 500) + iG2;
    }
}
