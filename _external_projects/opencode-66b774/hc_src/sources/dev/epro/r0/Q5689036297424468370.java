package dev.epro.r0;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Q5689036297424468370 implements X15211751545736488346 {
    public final AccessibilityManager a;

    public Q5689036297424468370(Context context) {
        Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager) systemService;
    }
}
