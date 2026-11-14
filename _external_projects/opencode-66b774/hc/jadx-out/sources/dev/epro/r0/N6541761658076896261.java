package dev.epro.r0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class N6541761658076896261 extends AccessibilityNodeProvider {
    public final H12843822278061842084 a;

    public N6541761658076896261(H12843822278061842084 h12843822278061842084) {
        this.a = h12843822278061842084;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        P11546267793636643785 p11546267793636643785Y = this.a.y(i);
        if (p11546267793636643785Y == null) {
            return null;
        }
        return p11546267793636643785Y.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        P11546267793636643785 p11546267793636643785A = this.a.A(i);
        if (p11546267793636643785A == null) {
            return null;
        }
        return p11546267793636643785A.a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.a.F(i, i2, bundle);
    }
}
