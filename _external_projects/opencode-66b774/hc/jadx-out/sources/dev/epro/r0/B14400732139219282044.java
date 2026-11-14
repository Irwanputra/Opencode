package dev.epro.r0;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B14400732139219282044 implements AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final V697849047308847220 a;
    public final V697849047308847220 b;

    public B14400732139219282044(K17800626310660218320 k17800626310660218320) {
        Boolean bool = Boolean.FALSE;
        this.a = V4416135141588678913.t(bool);
        this.b = V4416135141588678913.t(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.a.setValue(Boolean.valueOf(K17800626310660218320.a(accessibilityManager)));
        this.b.setValue(Boolean.valueOf(K17800626310660218320.b(accessibilityManager)));
    }
}
