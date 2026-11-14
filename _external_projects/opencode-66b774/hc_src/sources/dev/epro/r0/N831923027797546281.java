package dev.epro.r0;

import ads_mobile_sdk.i6;
import ads_mobile_sdk.p72;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class N831923027797546281 implements ViewTreeObserver.OnWindowFocusChangeListener {
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        p72.a();
        i6 i6Var = i6.d;
        boolean a = i6Var.a();
        if (i6Var.b != a) {
            i6Var.b = a;
            if (i6Var.a) {
                i6Var.a(a);
                Q16850748603044648552 q16850748603044648552 = i6Var.c;
                if (q16850748603044648552 != null) {
                    q16850748603044648552.a(a);
                }
            }
        }
    }
}
