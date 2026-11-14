package dev.epro.r0;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final /* synthetic */ class P16222058759139466260 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ J8477675461387041761 b;

    public /* synthetic */ P16222058759139466260(J8477675461387041761 j8477675461387041761, byte b) {
        this.a = b;
        this.b = j8477675461387041761;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        J8477675461387041761 j8477675461387041761 = this.b;
        switch (b) {
            case 0:
                View view = j8477675461387041761.d;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                X17385620293960954884 x17385620293960954884 = (X17385620293960954884) obj;
                if (x17385620293960954884.b.contains(x17385620293960954884)) {
                    B4499109999593241705 snapshotObserver = j8477675461387041761.d.getSnapshotObserver();
                    snapshotObserver.a.d(x17385620293960954884, j8477675461387041761.M, new D16945471218061474327(x17385620293960954884, j8477675461387041761, (byte) 5));
                }
                return O9245300239821758723.a;
        }
    }
}
