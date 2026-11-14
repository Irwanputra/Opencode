package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B14400732139219282044 implements android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener {
    public final dev.epro.r0.V697849047308847220 a;
    public final dev.epro.r0.V697849047308847220 b;

    public B14400732139219282044(dev.epro.r0.K17800626310660218320 k17800626310660218320) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.a = dev.epro.r0.V4416135141588678913.t(bool);
        this.b = dev.epro.r0.V4416135141588678913.t(bool);
    }

    public final void onAccessibilityServicesStateChanged(android.view.accessibility.AccessibilityManager accessibilityManager) {
        this.a.setValue(java.lang.Boolean.valueOf(dev.epro.r0.K17800626310660218320.a(accessibilityManager)));
        this.b.setValue(java.lang.Boolean.valueOf(dev.epro.r0.K17800626310660218320.b(accessibilityManager)));
    }
}
