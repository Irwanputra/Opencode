package dev.epro.r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class D9305770446274769439 extends F3837300029271916472 {
    public final WindowInsets.Builder e;

    public D9305770446274769439(N3121440022506799205 n3121440022506799205) {
        super(n3121440022506799205);
        WindowInsets b = n3121440022506799205.b();
        this.e = b != null ? U8229365251704901623.g(b) : I9104972935492198939.f();
    }

    @Override // dev.epro.r0.F3837300029271916472
    public N3121440022506799205 b() {
        WindowInsets build;
        a();
        build = this.e.build();
        N3121440022506799205 c = N3121440022506799205.c(build, null);
        Z1975157152518754667[] z1975157152518754667Arr = this.b;
        J11937375245988738237 j11937375245988738237 = c.a;
        j11937375245988738237.w(z1975157152518754667Arr);
        j11937375245988738237.v(null);
        j11937375245988738237.B(this.c);
        j11937375245988738237.C(this.d);
        return c;
    }

    @Override // dev.epro.r0.F3837300029271916472
    public void e(Z1975157152518754667 z1975157152518754667) {
        this.e.setMandatorySystemGestureInsets(z1975157152518754667.d());
    }

    @Override // dev.epro.r0.F3837300029271916472
    public void f(Z1975157152518754667 z1975157152518754667) {
        this.e.setStableInsets(z1975157152518754667.d());
    }

    @Override // dev.epro.r0.F3837300029271916472
    public void g(Z1975157152518754667 z1975157152518754667) {
        this.e.setSystemGestureInsets(z1975157152518754667.d());
    }

    @Override // dev.epro.r0.F3837300029271916472
    public void h(Z1975157152518754667 z1975157152518754667) {
        this.e.setSystemWindowInsets(z1975157152518754667.d());
    }

    @Override // dev.epro.r0.F3837300029271916472
    public void i(Z1975157152518754667 z1975157152518754667) {
        this.e.setTappableElementInsets(z1975157152518754667.d());
    }

    public D9305770446274769439() {
        this.e = I9104972935492198939.f();
    }
}
