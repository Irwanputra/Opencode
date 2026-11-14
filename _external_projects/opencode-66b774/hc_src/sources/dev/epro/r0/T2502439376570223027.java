package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class T2502439376570223027 implements Y337325536156316681, Cloneable {
    public final Z14368087615735085238 a;
    public Z14368087615735085238 b;

    public T2502439376570223027(Z14368087615735085238 z14368087615735085238) {
        this.a = z14368087615735085238;
        if (z14368087615735085238.o()) {
            S10973172697741180971.j("Default instance must be immutable.");
            throw null;
        }
        this.b = z14368087615735085238.r();
    }

    public final Z14368087615735085238 b() {
        Z14368087615735085238 c = c();
        c.getClass();
        if (Z14368087615735085238.n(c, true)) {
            return c;
        }
        throw new U10024139115995659738();
    }

    public final Z14368087615735085238 c() {
        boolean o2 = this.b.o();
        Z14368087615735085238 z14368087615735085238 = this.b;
        if (!o2) {
            return z14368087615735085238;
        }
        z14368087615735085238.getClass();
        C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
        c2256474256246444038.getClass();
        c2256474256246444038.a(z14368087615735085238.getClass()).b(z14368087615735085238);
        z14368087615735085238.p();
        return this.b;
    }

    public final T2502439376570223027 d() {
        T2502439376570223027 d = this.a.d();
        d.b = c();
        return d;
    }

    public final void e() {
        if (this.b.o()) {
            return;
        }
        Z14368087615735085238 r = this.a.r();
        Z14368087615735085238 z14368087615735085238 = this.b;
        C2256474256246444038 c2256474256246444038 = C2256474256246444038.c;
        c2256474256246444038.getClass();
        c2256474256246444038.a(r.getClass()).a(r, z14368087615735085238);
        this.b = r;
    }
}
