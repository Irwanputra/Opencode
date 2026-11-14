package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class E13808449687169887804 implements Z4972949040470868463 {
    public Z8888095354249304160 a;
    public P14826151584039718691 b;
    public String c;
    public Object d;
    public Object[] e;
    public R11800251031747375035 f;
    public final N8306548196372912291 g = new N8306548196372912291(this, (byte) 11);

    public E13808449687169887804(Z8888095354249304160 z8888095354249304160, P14826151584039718691 p14826151584039718691, String str, Object obj, Object[] objArr) {
        this.a = z8888095354249304160;
        this.b = p14826151584039718691;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void a() {
        b();
    }

    public final void b() {
        String g;
        P14826151584039718691 p14826151584039718691 = this.b;
        R11800251031747375035 r11800251031747375035 = this.f;
        if (r11800251031747375035 != null) {
            K2042933864045806308.l("entry(", r11800251031747375035, ") is not null");
            return;
        }
        if (p14826151584039718691 != null) {
            N8306548196372912291 n8306548196372912291 = this.g;
            Object invoke = n8306548196372912291.invoke();
            if (invoke == null || p14826151584039718691.c(invoke)) {
                this.f = p14826151584039718691.f(this.c, n8306548196372912291);
                return;
            }
            if (invoke instanceof T14677607990713025508) {
                T14677607990713025508 t14677607990713025508 = (T14677607990713025508) invoke;
                if (t14677607990713025508.d() == B14824868959299866349.k || t14677607990713025508.d() == B14824868959299866349.s || t14677607990713025508.d() == B14824868959299866349.m) {
                    g = "MutableState containing " + t14677607990713025508.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    g = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                g = C468629748621011703.g(invoke);
            }
            throw new IllegalArgumentException(g);
        }
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void d() {
        R11800251031747375035 r11800251031747375035 = this.f;
        if (r11800251031747375035 != null) {
            ((I1632105416032993715) r11800251031747375035).x();
        }
    }

    @Override // dev.epro.r0.Z4972949040470868463
    public final void f() {
        R11800251031747375035 r11800251031747375035 = this.f;
        if (r11800251031747375035 != null) {
            ((I1632105416032993715) r11800251031747375035).x();
        }
    }
}
