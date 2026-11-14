package dev.epro.r0;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.widget.PopupWindow;
import androidx.work.impl.foreground.SystemForegroundService;
import dev.epro.r0.H1785888784825263132;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class N13459929895848246258 {
    public static void a(View view, Rect rect, Rect rect2) {
        Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
        rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
    }

    public static ContentCaptureSession b(View view) {
        return view.getContentCaptureSession();
    }

    public static String c(Context context) {
        return context.getOpPackageName();
    }

    public static int d(AccessibilityManager accessibilityManager, int i, int i2) {
        return accessibilityManager.getRecommendedTimeoutMillis(i, i2);
    }

    public static AutofillId e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newAutofillId(autofillId, j);
    }

    public static ViewStructure f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j);
    }

    public static void g(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void h(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void i(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void j(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Insets k(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void l(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void m(Activity activity, H1785888784825263132.Z11244019023321623390 z11244019023321623390) {
        activity.registerActivityLifecycleCallbacks(z11244019023321623390);
    }

    public static void n(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void o(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void p(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void q(F6594473573882211675 f6594473573882211675, Rect rect) {
        f6594473573882211675.setEpicenterBounds(rect);
    }

    public static void r(F6594473573882211675 f6594473573882211675) {
        f6594473573882211675.setIsClippedToScreen(true);
    }

    public static void s(PopupWindow popupWindow) {
        popupWindow.setTouchModal(false);
    }

    public static void t(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void u(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            B14824868959299866349 n = B14824868959299866349.n();
            int i3 = SystemForegroundService.e;
            n.getClass();
        } catch (SecurityException unused2) {
            B14824868959299866349 n2 = B14824868959299866349.n();
            int i4 = SystemForegroundService.e;
            n2.getClass();
        }
    }
}
