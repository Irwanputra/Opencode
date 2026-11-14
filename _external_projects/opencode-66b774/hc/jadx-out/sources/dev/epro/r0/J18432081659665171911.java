package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J18432081659665171911 implements E13074456978433253839 {
    public final E17523205116624666034 a;

    public J18432081659665171911(E17523205116624666034 e17523205116624666034) {
        this.a = e17523205116624666034;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int a() {
        return this.a.h().f395o;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int b() {
        return Math.min(a() - 1, ((H3043063065558747866) R9411874267597469228.K0(this.a.h().l)).a);
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final boolean c() {
        return !this.a.h().l.isEmpty();
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int d() {
        int i;
        E17523205116624666034 e17523205116624666034 = this.a;
        if (e17523205116624666034.h().l.isEmpty()) {
            return 0;
        }
        O11472352839632764090 o11472352839632764090H = e17523205116624666034.h();
        int i2 = (int) (o11472352839632764090H.p == R7000310675073492254.a ? o11472352839632764090H.i() & 4294967295L : o11472352839632764090H.i() >> 32);
        int iH0 = O5354877807466160604.h0(e17523205116624666034.h());
        if (iH0 != 0 && (i = i2 / iH0) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // dev.epro.r0.E13074456978433253839
    public final int e() {
        return Math.max(0, this.a.e.b.g());
    }
}
