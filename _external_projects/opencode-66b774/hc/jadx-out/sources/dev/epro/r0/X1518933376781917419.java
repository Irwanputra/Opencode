package dev.epro.r0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class X1518933376781917419 extends K12387811218152668980 {
    public static final N3121440022506799205 w = N3121440022506799205.c(WindowInsets.CONSUMED, null);

    public X1518933376781917419(N3121440022506799205 n3121440022506799205, WindowInsets windowInsets) {
        super(n3121440022506799205, windowInsets);
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 i(int i) {
        return Z1975157152518754667.c(this.c.getInsets(P11294723927105127505.a(i)));
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 j(int i) {
        return Z1975157152518754667.c(this.c.getInsetsIgnoringVisibility(P11294723927105127505.a(i)));
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public boolean u(int i) {
        return this.c.isVisible(P11294723927105127505.a(i));
    }

    public X1518933376781917419(N3121440022506799205 n3121440022506799205, X1518933376781917419 x1518933376781917419) {
        super(n3121440022506799205, x1518933376781917419);
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public final void d(View view) {
    }
}
