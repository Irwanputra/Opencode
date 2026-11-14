package dev.epro.r0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class K12387811218152668980 extends V6310040811667546528 {
    public Z1975157152518754667 t;
    public Z1975157152518754667 u;
    public Z1975157152518754667 v;

    public K12387811218152668980(N3121440022506799205 n3121440022506799205, WindowInsets windowInsets) {
        super(n3121440022506799205, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 k() {
        Insets mandatorySystemGestureInsets;
        Z1975157152518754667 z1975157152518754667 = this.u;
        if (z1975157152518754667 != null) {
            return z1975157152518754667;
        }
        mandatorySystemGestureInsets = this.c.getMandatorySystemGestureInsets();
        Z1975157152518754667 c = Z1975157152518754667.c(mandatorySystemGestureInsets);
        this.u = c;
        return c;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 m() {
        Insets systemGestureInsets;
        Z1975157152518754667 z1975157152518754667 = this.t;
        if (z1975157152518754667 != null) {
            return z1975157152518754667;
        }
        systemGestureInsets = this.c.getSystemGestureInsets();
        Z1975157152518754667 c = Z1975157152518754667.c(systemGestureInsets);
        this.t = c;
        return c;
    }

    @Override // dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 o() {
        Insets tappableElementInsets;
        Z1975157152518754667 z1975157152518754667 = this.v;
        if (z1975157152518754667 != null) {
            return z1975157152518754667;
        }
        tappableElementInsets = this.c.getTappableElementInsets();
        Z1975157152518754667 c = Z1975157152518754667.c(tappableElementInsets);
        this.v = c;
        return c;
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public N3121440022506799205 r(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.c.inset(i, i2, i3, i4);
        return N3121440022506799205.c(inset, null);
    }

    public K12387811218152668980(N3121440022506799205 n3121440022506799205, K12387811218152668980 k12387811218152668980) {
        super(n3121440022506799205, k12387811218152668980);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // dev.epro.r0.A15549915418839859568, dev.epro.r0.J11937375245988738237
    public void z(Z1975157152518754667 z1975157152518754667) {
    }
}
