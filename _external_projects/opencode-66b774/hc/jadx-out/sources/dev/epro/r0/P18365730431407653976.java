package dev.epro.r0;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class P18365730431407653976 extends O12480419689618776857 {
    @Override // dev.epro.r0.S6755585031191421201, dev.epro.r0.P11057046163214509468
    public void b(C4825768887677330761 c4825768887677330761, C4825768887677330761 c48257688876773307612, Window window, View view, boolean z, boolean z2) {
        c4825768887677330761.getClass();
        c48257688876773307612.getClass();
        window.getClass();
        view.getClass();
        E17665849472693074628.i(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(c48257688876773307612.a == 0);
        M9197813449740923653 m9197813449740923653 = new M9197813449740923653(view);
        int i = Build.VERSION.SDK_INT;
        H4776669175763245653 s7186231212856355878 = i >= 35 ? new S7186231212856355878(window, m9197813449740923653) : i >= 30 ? new S3454875417302688768(window, m9197813449740923653) : i >= 26 ? new N17192714187392118750(window, m9197813449740923653) : new Z5540756766699434826(window, m9197813449740923653);
        s7186231212856355878.n(!z);
        s7186231212856355878.m(!z2);
    }
}
