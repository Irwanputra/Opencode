package dev.epro.r0;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class I6809612112758996898 extends R11468698777038055282 {
    public static final N3121440022506799205 x;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        x = N3121440022506799205.c(windowInsets, null);
    }

    public I6809612112758996898(N3121440022506799205 n3121440022506799205, WindowInsets windowInsets) {
        super(n3121440022506799205, windowInsets);
    }

    @Override // dev.epro.r0.X1518933376781917419, dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 i(int i) {
        Insets insets;
        insets = this.c.getInsets(R2428889475581011517.a(i));
        return Z1975157152518754667.c(insets);
    }

    @Override // dev.epro.r0.X1518933376781917419, dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public Z1975157152518754667 j(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(R2428889475581011517.a(i));
        return Z1975157152518754667.c(insetsIgnoringVisibility);
    }

    @Override // dev.epro.r0.X1518933376781917419, dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public boolean u(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(R2428889475581011517.a(i));
        return isVisible;
    }

    public I6809612112758996898(N3121440022506799205 n3121440022506799205, I6809612112758996898 i6809612112758996898) {
        super(n3121440022506799205, i6809612112758996898);
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public void p(View view) {
    }
}
