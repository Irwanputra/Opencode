package dev.epro.r0;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class P8215077639927470186 extends F4129676524704143290 {
    @Override // dev.epro.r0.J3301701597851028733
    public final void x(View view, Rect rect) {
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        rect.set(((WindowManager) systemService).getCurrentWindowMetrics().getBounds());
    }
}
