package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class A15549915418839859568 extends dev.epro.r0.H960234695227575304 {
    public dev.epro.r0.Z1975157152518754667 s;

    public A15549915418839859568(dev.epro.r0.N3121440022506799205 n3121440022506799205, dev.epro.r0.A15549915418839859568 a15549915418839859568) {
        super(n3121440022506799205, a15549915418839859568);
        this.s = null;
        this.s = a15549915418839859568.s;
    }

    public dev.epro.r0.N3121440022506799205 b() {
        return dev.epro.r0.N3121440022506799205.c(((dev.epro.r0.H960234695227575304) this).c.consumeStableInsets(), (android.view.View) null);
    }

    public dev.epro.r0.N3121440022506799205 c() {
        return dev.epro.r0.N3121440022506799205.c(((dev.epro.r0.H960234695227575304) this).c.consumeSystemWindowInsets(), (android.view.View) null);
    }

    public final dev.epro.r0.Z1975157152518754667 l() {
        dev.epro.r0.Z1975157152518754667 z1975157152518754667 = this.s;
        if (z1975157152518754667 != null) {
            return z1975157152518754667;
        }
        android.view.WindowInsets windowInsets = ((dev.epro.r0.H960234695227575304) this).c;
        dev.epro.r0.Z1975157152518754667 z1975157152518754667B = dev.epro.r0.Z1975157152518754667.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.s = z1975157152518754667B;
        return z1975157152518754667B;
    }

    public boolean s() {
        return ((dev.epro.r0.H960234695227575304) this).c.isConsumed();
    }

    public void z(dev.epro.r0.Z1975157152518754667 z1975157152518754667) {
        this.s = z1975157152518754667;
    }

    public A15549915418839859568(dev.epro.r0.N3121440022506799205 n3121440022506799205, android.view.WindowInsets windowInsets) {
        super(n3121440022506799205, windowInsets);
        this.s = null;
    }
}
