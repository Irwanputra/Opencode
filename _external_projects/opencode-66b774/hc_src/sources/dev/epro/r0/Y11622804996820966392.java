package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public abstract class Y11622804996820966392 implements Cloneable {
    public final T3817383632789307090 a;
    public T3817383632789307090 b;

    public Y11622804996820966392(T3817383632789307090 t3817383632789307090) {
        this.a = t3817383632789307090;
        if (t3817383632789307090.g()) {
            S10973172697741180971.j("Default instance must be immutable.");
            throw null;
        }
        this.b = t3817383632789307090.i();
    }

    public final T3817383632789307090 a() {
        T3817383632789307090 b = b();
        b.getClass();
        if (T3817383632789307090.f(b, true)) {
            return b;
        }
        throw new K6038895509461751088();
    }

    public final T3817383632789307090 b() {
        boolean g = this.b.g();
        T3817383632789307090 t3817383632789307090 = this.b;
        if (!g) {
            return t3817383632789307090;
        }
        t3817383632789307090.getClass();
        X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
        x8293765978123339002.getClass();
        x8293765978123339002.a(t3817383632789307090.getClass()).b(t3817383632789307090);
        t3817383632789307090.h();
        return this.b;
    }

    public final void c() {
        if (this.b.g()) {
            return;
        }
        T3817383632789307090 i = this.a.i();
        T3817383632789307090 t3817383632789307090 = this.b;
        X8293765978123339002 x8293765978123339002 = X8293765978123339002.c;
        x8293765978123339002.getClass();
        x8293765978123339002.a(i.getClass()).a(i, t3817383632789307090);
        this.b = i;
    }

    public final Object clone() {
        Y11622804996820966392 y11622804996820966392 = (Y11622804996820966392) this.a.c(5);
        y11622804996820966392.b = b();
        return y11622804996820966392;
    }
}
