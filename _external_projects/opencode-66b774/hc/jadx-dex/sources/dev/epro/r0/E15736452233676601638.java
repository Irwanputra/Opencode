package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E15736452233676601638 extends dev.epro.r0.M9197813449740923653 {
    public android.view.View c;

    public final void f() {
        android.view.View view = this.c;
        android.view.WindowInsetsController windowInsetsControllerK = view != null ? dev.epro.r0.Q10109392975126564544.k(view) : null;
        if (windowInsetsControllerK == null) {
            super.f();
            return;
        }
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
        dev.epro.r0.X304622398972250831 x304622398972250831 = new dev.epro.r0.X304622398972250831(atomicBoolean);
        dev.epro.r0.Q10109392975126564544.t(windowInsetsControllerK, x304622398972250831);
        if (!atomicBoolean.get() && view != null) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        dev.epro.r0.Q10109392975126564544.C(windowInsetsControllerK, x304622398972250831);
        dev.epro.r0.Q10109392975126564544.B(windowInsetsControllerK, dev.epro.r0.Q10109392975126564544.b());
    }

    public final void p() {
        android.view.View view = this.c;
        if (view != null && android.os.Build.VERSION.SDK_INT < 33) {
            ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        android.view.WindowInsetsController windowInsetsControllerK = view != null ? dev.epro.r0.Q10109392975126564544.k(view) : null;
        if (windowInsetsControllerK != null) {
            dev.epro.r0.Q10109392975126564544.s(windowInsetsControllerK, dev.epro.r0.Q10109392975126564544.b());
        }
        super.p();
    }
}
