package dev.epro.r0;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class K17800626310660218320 implements AccessibilityManager.AccessibilityStateChangeListener, L13148442655056575112 {
    public final boolean a;
    public final boolean b;
    public final V697849047308847220 c = V4416135141588678913.t(Boolean.FALSE);
    public final Q16938149557571289597 d;
    public final B14400732139219282044 e;

    public K17800626310660218320(boolean z, boolean z2, boolean z3) {
        this.a = z2;
        this.b = z3;
        B14400732139219282044 b14400732139219282044 = null;
        this.d = z ? new Q16938149557571289597() : null;
        if ((z2 || z3) && Build.VERSION.SDK_INT >= 33) {
            b14400732139219282044 = new B14400732139219282044(this);
        }
        this.e = b14400732139219282044;
    }

    public static boolean a(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && M8927913404651150384.L(settingsActivityName, "SwitchAccess", true)) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(AccessibilityManager accessibilityManager) {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16);
        int size = enabledAccessibilityServiceList.size();
        for (int i = 0; i < size; i++) {
            String settingsActivityName = enabledAccessibilityServiceList.get(i).getSettingsActivityName();
            if (settingsActivityName != null && M8927913404651150384.L(settingsActivityName, "VoiceAccess", true)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // dev.epro.r0.L13148442655056575112
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getValue() {
        /*
            r3 = this;
            dev.epro.r0.V697849047308847220 r0 = r3.c
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L4e
            r0 = 1
            dev.epro.r0.Q16938149557571289597 r1 = r3.d
            if (r1 == 0) goto L22
            dev.epro.r0.V697849047308847220 r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L22
            goto L4f
        L22:
            boolean r1 = r3.a
            dev.epro.r0.B14400732139219282044 r2 = r3.e
            if (r1 == 0) goto L39
            if (r2 == 0) goto L39
            dev.epro.r0.V697849047308847220 r1 = r2.a
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != r0) goto L39
            goto L4f
        L39:
            boolean r3 = r3.b
            if (r3 == 0) goto L4e
            if (r2 == 0) goto L4e
            dev.epro.r0.V697849047308847220 r3 = r2.b
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != r0) goto L4e
            goto L4f
        L4e:
            r0 = 0
        L4f:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.K17800626310660218320.getValue():java.lang.Object");
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }
}
