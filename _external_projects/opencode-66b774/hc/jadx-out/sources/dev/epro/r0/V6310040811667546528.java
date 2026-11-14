package dev.epro.r0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class V6310040811667546528 extends A15549915418839859568 {
    public V6310040811667546528(N3121440022506799205 n3121440022506799205, WindowInsets windowInsets) {
        super(n3121440022506799205, windowInsets);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public N3121440022506799205 a() {
        return N3121440022506799205.c(this.c.consumeDisplayCutout(), null);
    }

    @Override // dev.epro.r0.H960234695227575304, dev.epro.r0.J11937375245988738237
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V6310040811667546528)) {
            return false;
        }
        V6310040811667546528 v6310040811667546528 = (V6310040811667546528) obj;
        return Objects.equals(this.c, v6310040811667546528.c) && Objects.equals(this.g, v6310040811667546528.g) && H960234695227575304.M(this.h, v6310040811667546528.h);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public R825017289975842005 h() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new R825017289975842005(displayCutout);
    }

    @Override // dev.epro.r0.J11937375245988738237
    public int hashCode() {
        return this.c.hashCode();
    }

    public V6310040811667546528(N3121440022506799205 n3121440022506799205, V6310040811667546528 v6310040811667546528) {
        super(n3121440022506799205, v6310040811667546528);
    }
}
