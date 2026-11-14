package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E13808449687169887804 implements dev.epro.r0.Z4972949040470868463 {
    public dev.epro.r0.Z8888095354249304160 a;
    public dev.epro.r0.P14826151584039718691 b;
    public java.lang.String c;
    public java.lang.Object d;
    public java.lang.Object[] e;
    public dev.epro.r0.R11800251031747375035 f;
    public final dev.epro.r0.N8306548196372912291 g = new dev.epro.r0.N8306548196372912291(this, (byte) 11);

    public E13808449687169887804(dev.epro.r0.Z8888095354249304160 z8888095354249304160, dev.epro.r0.P14826151584039718691 p14826151584039718691, java.lang.String str, java.lang.Object obj, java.lang.Object[] objArr) {
        this.a = z8888095354249304160;
        this.b = p14826151584039718691;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() {
        b();
    }

    public final void b() {
        java.lang.String strG;
        dev.epro.r0.P14826151584039718691 p14826151584039718691 = this.b;
        dev.epro.r0.R11800251031747375035 r11800251031747375035 = this.f;
        if (r11800251031747375035 != null) {
            dev.epro.r0.K2042933864045806308.l("entry(", r11800251031747375035, ") is not null");
            return;
        }
        if (p14826151584039718691 != null) {
            dev.epro.r0.N8306548196372912291 n8306548196372912291 = this.g;
            java.lang.Object objInvoke = n8306548196372912291.invoke();
            if (objInvoke == null || p14826151584039718691.c(objInvoke)) {
                this.f = p14826151584039718691.f(this.c, n8306548196372912291);
                return;
            }
            if (objInvoke instanceof dev.epro.r0.T14677607990713025508) {
                dev.epro.r0.T14677607990713025508 t14677607990713025508 = (dev.epro.r0.T14677607990713025508) objInvoke;
                if (t14677607990713025508.d() == dev.epro.r0.B14824868959299866349.k || t14677607990713025508.d() == dev.epro.r0.B14824868959299866349.s || t14677607990713025508.d() == dev.epro.r0.B14824868959299866349.m) {
                    strG = "MutableState containing " + t14677607990713025508.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strG = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strG = dev.epro.r0.C468629748621011703.g(objInvoke);
            }
            throw new java.lang.IllegalArgumentException(strG);
        }
    }

    public final void d() {
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.f;
        if (i1632105416032993715 != null) {
            i1632105416032993715.x();
        }
    }

    public final void f() {
        dev.epro.r0.I1632105416032993715 i1632105416032993715 = this.f;
        if (i1632105416032993715 != null) {
            i1632105416032993715.x();
        }
    }
}
