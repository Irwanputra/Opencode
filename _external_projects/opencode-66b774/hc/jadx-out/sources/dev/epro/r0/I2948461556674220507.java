package dev.epro.r0;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I2948461556674220507 extends I6809612112758996898 {
    public I2948461556674220507(N3121440022506799205 n3121440022506799205, WindowInsets windowInsets) {
        super(n3121440022506799205, windowInsets);
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public List<Rect> f(int i) {
        return this.c.getBoundingRects(R2428889475581011517.a(i));
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public List<Rect> g(int i) {
        return this.c.getBoundingRectsIgnoringVisibility(R2428889475581011517.a(i));
    }

    public I2948461556674220507(N3121440022506799205 n3121440022506799205, I2948461556674220507 i2948461556674220507) {
        super(n3121440022506799205, i2948461556674220507);
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public void q() {
    }
}
