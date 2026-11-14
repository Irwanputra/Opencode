package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W543543915243615877 implements E1725159089660790042 {
    public final V9266657454036696449 a;
    public final R3937090736490516115 b;
    public Object c;
    public Object d;
    public Z13251062865217617579 e;
    public Z13251062865217617579 f;
    public final Z13251062865217617579 g;
    public long h;
    public Z13251062865217617579 i;

    public W543543915243615877(M15459437176959963354 m15459437176959963354, R3937090736490516115 r3937090736490516115, Object obj, Object obj2, Z13251062865217617579 z13251062865217617579) {
        this.a = m15459437176959963354.a(r3937090736490516115);
        this.b = r3937090736490516115;
        this.c = obj2;
        this.d = obj;
        O3410298526443296213 o3410298526443296213 = (O3410298526443296213) r3937090736490516115;
        this.e = (Z13251062865217617579) o3410298526443296213.a.invoke(obj);
        F4096073349764486348 f4096073349764486348 = o3410298526443296213.a;
        this.f = (Z13251062865217617579) f4096073349764486348.invoke(obj2);
        this.g = z13251062865217617579 != null ? E3422549137300678133.N(z13251062865217617579) : ((Z13251062865217617579) f4096073349764486348.invoke(obj)).c();
        this.h = -1L;
    }

    @Override // dev.epro.r0.E1725159089660790042
    public final boolean a() {
        return this.a.a();
    }

    @Override // dev.epro.r0.E1725159089660790042
    public final Object b(long j) {
        if (g(j)) {
            return this.c;
        }
        Z13251062865217617579 z13251062865217617579E = this.a.e(j, this.e, this.f, this.g);
        int iB = z13251062865217617579E.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(z13251062865217617579E.a(i))) {
                H18335142247802896069.b("AnimationVector cannot contain a NaN. " + z13251062865217617579E + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return ((O3410298526443296213) this.b).b.invoke(z13251062865217617579E);
    }

    @Override // dev.epro.r0.E1725159089660790042
    public final long c() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jB = this.a.b(this.e, this.f, this.g);
        this.h = jB;
        return jB;
    }

    @Override // dev.epro.r0.E1725159089660790042
    public final R3937090736490516115 d() {
        return this.b;
    }

    @Override // dev.epro.r0.E1725159089660790042
    public final Object e() {
        return this.c;
    }

    @Override // dev.epro.r0.E1725159089660790042
    public final Z13251062865217617579 f(long j) {
        if (!g(j)) {
            return this.a.r(j, this.e, this.f, this.g);
        }
        Z13251062865217617579 z13251062865217617579 = this.i;
        if (z13251062865217617579 != null) {
            return z13251062865217617579;
        }
        Z13251062865217617579 z13251062865217617579D = this.a.d(this.e, this.f, this.g);
        this.i = z13251062865217617579D;
        return z13251062865217617579D;
    }

    public final void h(Object obj) {
        if (S10823041268949770285.t(obj, this.d)) {
            return;
        }
        this.d = obj;
        this.e = (Z13251062865217617579) ((O3410298526443296213) this.b).a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final void i(Object obj) {
        if (S10823041268949770285.t(this.c, obj)) {
            return;
        }
        this.c = obj;
        this.f = (Z13251062865217617579) ((O3410298526443296213) this.b).a.invoke(obj);
        this.i = null;
        this.h = -1L;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (c() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
