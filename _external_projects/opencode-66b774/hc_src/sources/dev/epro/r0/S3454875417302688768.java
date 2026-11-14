package dev.epro.r0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class S3454875417302688768 extends H4776669175763245653 {
    public final WindowInsetsController a;
    public final M9197813449740923653 b;
    public final Window c;

    public S3454875417302688768(Window window, M9197813449740923653 m9197813449740923653) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.a = insetsController;
        this.b = m9197813449740923653;
        this.c = window;
    }

    @Override // dev.epro.r0.H4776669175763245653
    public final void i(int i) {
        if ((i & 8) != 0) {
            ((M9197813449740923653) this.b.b).f();
        }
        this.a.hide(i & (-9));
    }

    @Override // dev.epro.r0.H4776669175763245653
    public void m(boolean z) {
        Window window = this.c;
        if (window != null) {
            if (!z) {
                t(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // dev.epro.r0.H4776669175763245653
    public void n(boolean z) {
        Window window = this.c;
        if (window != null) {
            if (!z) {
                t(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.a;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // dev.epro.r0.H4776669175763245653
    public void o() {
        Window window = this.c;
        if (window == null) {
            this.a.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        t(2048);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }

    public final void t(int i) {
        View decorView = this.c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
