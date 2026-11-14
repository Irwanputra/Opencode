package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class V8608505440995891050 implements C16999414938027834076 {
    public final B4739506393801054036 a;
    public final /* synthetic */ E17523205116624666034 b;
    public final /* synthetic */ boolean c;

    public V8608505440995891050(E17523205116624666034 e17523205116624666034, boolean z) {
        this.b = e17523205116624666034;
        this.c = z;
        this.a = Z3658309082448601011.b(new P2501949772126847481(e17523205116624666034, (byte) 3));
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final int a() {
        E17523205116624666034 e17523205116624666034 = this.b;
        return (int) (e17523205116624666034.h().p == R7000310675073492254.a ? e17523205116624666034.h().i() & 4294967295L : e17523205116624666034.h().i() >> 32);
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final float b() {
        E17523205116624666034 e17523205116624666034 = this.b;
        return (e17523205116624666034.e.b.g() * 500) + e17523205116624666034.e.c.g();
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final Z9903412080743350895 c() {
        boolean z = this.c;
        B4739506393801054036 b4739506393801054036 = this.a;
        return z ? new Z9903412080743350895(((Number) b4739506393801054036.getValue()).intValue(), 1) : new Z9903412080743350895(1, ((Number) b4739506393801054036.getValue()).intValue());
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final Object d(int i, I3566570148522791385 i3566570148522791385) {
        Object objK = E17523205116624666034.k(this.b, i, i3566570148522791385);
        return objK == Z3437138737604933638.a ? objK : O9245300239821758723.a;
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final int e() {
        E17523205116624666034 e17523205116624666034 = this.b;
        return (-e17523205116624666034.h().m) + e17523205116624666034.h().q;
    }

    @Override // dev.epro.r0.C16999414938027834076
    public final float f() {
        E17523205116624666034 e17523205116624666034 = this.b;
        int iG = e17523205116624666034.e.b.g();
        int iG2 = e17523205116624666034.e.c.g();
        return e17523205116624666034.c() ? (iG * 500) + iG2 + 100.0f : (iG * 500) + iG2;
    }
}
