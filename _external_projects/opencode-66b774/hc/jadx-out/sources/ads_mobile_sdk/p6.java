package ads_mobile_sdk;

import android.view.View;
import dev.epro.r0.N831923027797546281;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class p6 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ r6 a;

    public p6(r6 r6Var) {
        this.a = r6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.a(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        r6 r6Var = this.a;
        if (((N831923027797546281) r6Var.b) != null) {
            if (view.getViewTreeObserver().isAlive()) {
                view.getViewTreeObserver().removeOnWindowFocusChangeListener((N831923027797546281) r6Var.b);
            }
            r6Var.b = null;
        }
    }
}
