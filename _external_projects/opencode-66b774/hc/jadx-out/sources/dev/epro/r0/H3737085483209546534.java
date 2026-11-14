package dev.epro.r0;

import android.graphics.Rect;
import android.graphics.RectF;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class H3737085483209546534 {
    public static float a(float f, DisplayMetrics displayMetrics) {
        return TypedValue.deriveDimension(1, f, displayMetrics);
    }

    public static AccessibilityNodeInfo.AccessibilityAction b() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float c(VelocityTracker velocityTracker, int i) {
        return velocityTracker.getAxisVelocity(i);
    }

    public static void d(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int[] f(I18150855591218230259 i18150855591218230259, RectF rectF, int i, final K5271540294206541871 k5271540294206541871) {
        return i18150855591218230259.f.getRangeForRect(rectF, i == 1 ? new T7058566632182198456(new F6353700998356592239((Object) i18150855591218230259.f.getText(), (Object) i18150855591218230259.k(), (byte) 0)) : new GraphemeClusterSegmentFinder(i18150855591218230259.f.getText(), i18150855591218230259.a), new Layout.TextInclusionStrategy() { // from class: dev.epro.r0.D4925457306196655488
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return ((Boolean) k5271540294206541871.invoke(rectF2, rectF3)).booleanValue();
            }
        });
    }

    public static int g(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i, i2, i3);
    }

    public static int h(ViewConfiguration viewConfiguration, int i, int i2, int i3) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i, i2, i3);
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean j(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static void k(AccessibilityEvent accessibilityEvent, boolean z) {
        accessibilityEvent.setAccessibilityDataSensitive(z);
    }

    public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static void m(TextView textView, int i, float f) {
        textView.setLineHeight(i, f);
    }
}
