package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class R8029976778412248429 implements H617089765907910851 {
    public final H617089765907910851 a;
    public final K192523740806967956 b;
    public float d;
    public float e;
    public U16834965109098959004 f;
    public final V697849047308847220 c = V4416135141588678913.t(new A891803927997771281(0.0f));
    public final T17817572153526645469 g = new T17817572153526645469();

    public R8029976778412248429(H617089765907910851 h617089765907910851, K192523740806967956 k192523740806967956) {
        this.a = h617089765907910851;
        this.b = k192523740806967956;
        this.d = ((h617089765907910851.e() % 12) * 0.5235988f) - 1.5707964f;
        this.e = (h617089765907910851.f() * 0.10471976f) - 1.5707964f;
        this.f = E12775674050813925581.a(this.d);
    }

    public static float j(float f) {
        double d = f % 6.283185307179586d;
        if (d < 0.0d) {
            d += 6.283185307179586d;
        }
        return (float) d;
    }

    @Override // dev.epro.r0.H617089765907910851
    public final void a(int i) {
        this.d = ((i % 12) * 0.5235988f) - 1.5707964f;
        H617089765907910851 h617089765907910851 = this.a;
        h617089765907910851.a(i);
        if (h617089765907910851.b() == 0) {
            this.f = E12775674050813925581.a(this.d);
        }
    }

    @Override // dev.epro.r0.H617089765907910851
    public final int b() {
        return this.a.b();
    }

    @Override // dev.epro.r0.H617089765907910851
    public final boolean c() {
        return this.a.c();
    }

    @Override // dev.epro.r0.H617089765907910851
    public final void d(int i) {
        this.e = (i * 0.10471976f) - 1.5707964f;
        H617089765907910851 h617089765907910851 = this.a;
        h617089765907910851.d(i);
        if (h617089765907910851.b() == 1) {
            this.f = E12775674050813925581.a(this.e);
        }
        M4722199849958580248 h = T8598786036980488824.h();
        F4096073349764486348 e = h != null ? h.e() : null;
        M4722199849958580248 o2 = T8598786036980488824.o(h);
        try {
            h617089765907910851.d(h617089765907910851.f());
        } finally {
            T8598786036980488824.x(h, o2, e);
        }
    }

    @Override // dev.epro.r0.H617089765907910851
    public final int e() {
        return this.a.e();
    }

    @Override // dev.epro.r0.H617089765907910851
    public final int f() {
        return this.a.f();
    }

    @Override // dev.epro.r0.H617089765907910851
    public final void g(int i) {
        this.a.g(i);
    }

    public final float h(float f) {
        float floatValue = ((Number) this.f.d()).floatValue() - f;
        while (floatValue > 3.1415927f) {
            floatValue -= 6.2831855f;
        }
        while (floatValue <= -3.1415927f) {
            floatValue += 6.2831855f;
        }
        return ((Number) this.f.d()).floatValue() - floatValue;
    }

    public final float i() {
        return ((A891803927997771281) this.c.getValue()).a;
    }
}
