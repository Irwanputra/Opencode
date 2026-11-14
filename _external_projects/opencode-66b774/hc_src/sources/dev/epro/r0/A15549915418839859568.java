package dev.epro.r0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class A15549915418839859568 extends H960234695227575304 {
    public Z1975157152518754667 s;

    public A15549915418839859568(N3121440022506799205 n3121440022506799205, A15549915418839859568 a15549915418839859568) {
        super(n3121440022506799205, a15549915418839859568);
        this.s = null;
        this.s = a15549915418839859568.s;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public N3121440022506799205 b() {
        return N3121440022506799205.c(this.c.consumeStableInsets(), null);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public N3121440022506799205 c() {
        return N3121440022506799205.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public final Z1975157152518754667 l() {
        Z1975157152518754667 z1975157152518754667 = this.s;
        if (z1975157152518754667 != null) {
            return z1975157152518754667;
        }
        WindowInsets windowInsets = this.c;
        Z1975157152518754667 b = Z1975157152518754667.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = b;
        return b;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public boolean s() {
        return this.c.isConsumed();
    }

    @Override // dev.epro.r0.J11937375245988738237
    public void z(Z1975157152518754667 z1975157152518754667) {
        this.s = z1975157152518754667;
    }

    public A15549915418839859568(N3121440022506799205 n3121440022506799205, WindowInsets windowInsets) {
        super(n3121440022506799205, windowInsets);
        this.s = null;
    }
}
