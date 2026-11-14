package dev.epro.r0;

import ads_mobile_sdk.i6;
import ads_mobile_sdk.p72;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class N831923027797546281 implements ViewTreeObserver.OnWindowFocusChangeListener {
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        p72.a();
        i6 i6Var = i6.d;
        boolean zA = i6Var.a();
        if (i6Var.b != zA) {
            i6Var.b = zA;
            if (i6Var.a) {
                i6Var.a(zA);
                Q16850748603044648552 q16850748603044648552 = i6Var.c;
                if (q16850748603044648552 != null) {
                    q16850748603044648552.a(zA);
                }
            }
        }
    }
}
