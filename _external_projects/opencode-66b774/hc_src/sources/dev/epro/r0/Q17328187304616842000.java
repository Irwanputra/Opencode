package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
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
        Object i2 = W5896017744614017491.i(this.a, i, i3566570148522791385);
        return i2 == Z3437138737604933638.a ? i2 : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final int e() {
        W5896017744614017491 w5896017744614017491 = this.a;
        return (-w5896017744614017491.g().f328o) + w5896017744614017491.g().s;
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final float f() {
        W5896017744614017491 w5896017744614017491 = this.a;
        int g = w5896017744614017491.d.b.g();
        int g2 = w5896017744614017491.d.c.g();
        return w5896017744614017491.c() ? (g * 500) + g2 + 100.0f : (g * 500) + g2;
    }
}
