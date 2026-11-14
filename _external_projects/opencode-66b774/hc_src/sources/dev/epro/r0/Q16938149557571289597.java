package dev.epro.r0;

import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q16938149557571289597 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final V697849047308847220 a = V4416135141588678913.t(Boolean.FALSE);

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }
}
