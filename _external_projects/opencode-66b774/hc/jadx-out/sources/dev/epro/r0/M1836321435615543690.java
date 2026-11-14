package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class M1836321435615543690 implements H617089765907910851 {
    public final boolean a;
    public final V697849047308847220 b;
    public final P6024466796603310388 c;
    public final P6024466796603310388 d;

    public M1836321435615543690(int i, int i2, boolean z) {
        if (i < 0 || i >= 24) {
            S10973172697741180971.j("initialHour should in [0..23] range");
            throw null;
        }
        if (i2 < 0 || i2 >= 60) {
            S10973172697741180971.j("initialMinute should be in [0..59] range");
            throw null;
        }
        this.a = z;
        this.b = V4416135141588678913.t(new X13590909012094200898(0));
        this.c = new P6024466796603310388(i);
        this.d = new P6024466796603310388(i2);
    }

    @Override // dev.epro.r0.H617089765907910851
    public final void a(int i) {
        this.c.h(i);
    }

    @Override // dev.epro.r0.H617089765907910851
    public final int b() {
        return ((X13590909012094200898) this.b.getValue()).a;
    }

    @Override // dev.epro.r0.H617089765907910851
    public final boolean c() {
        return this.a;
    }

    @Override // dev.epro.r0.H617089765907910851
    public final void d(int i) {
        this.d.h(i);
    }

    @Override // dev.epro.r0.H617089765907910851
    public final int e() {
        return this.c.g();
    }

    @Override // dev.epro.r0.H617089765907910851
    public final int f() {
        return this.d.g();
    }

    @Override // dev.epro.r0.H617089765907910851
    public final void g(int i) {
        this.b.setValue(new X13590909012094200898(i));
    }
}
