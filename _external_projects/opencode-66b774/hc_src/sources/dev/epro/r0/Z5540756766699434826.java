package dev.epro.r0;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public class Z5540756766699434826 extends H4776669175763245653 {
    public final Window a;
    public final M9197813449740923653 b;

    public Z5540756766699434826(Window window, M9197813449740923653 m9197813449740923653) {
        this.a = window;
        this.b = m9197813449740923653;
    }

    @Override // dev.epro.r0.H4776669175763245653
    public final void i(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    t(4);
                } else if (i2 == 2) {
                    t(2);
                } else if (i2 == 8) {
                    ((M9197813449740923653) this.b.b).f();
                }
            }
        }
    }

    @Override // dev.epro.r0.H4776669175763245653
    public final void n(boolean z) {
        if (!z) {
            u(8192);
            return;
        }
        Window window = this.a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        t(8192);
    }

    @Override // dev.epro.r0.H4776669175763245653
    public final void o() {
        this.a.getDecorView().setTag(356039078, 2);
        u(2048);
        t(4096);
    }

    public final void t(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void u(int i) {
        View decorView = this.a.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
