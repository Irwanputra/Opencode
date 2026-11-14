package dev.epro.r0;

import android.app.LocaleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.StaticLayout;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class T3623367008917729099 {
    public static final void a(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
        accessibilityManager.addAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }

    public static OnBackInvokedDispatcher b(Toolbar toolbar) {
        return toolbar.findOnBackInvokedDispatcher();
    }

    public static PackageInfo c(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object d(String str, Bundle bundle) {
        return bundle.getParcelable(str, H15446768409112154310.class);
    }

    public static ArrayList e(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Object f(Intent intent) {
        return intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class);
    }

    public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean h(S9684361936304835821 s9684361936304835821) {
        return s9684361936304835821.isSelectedChildViewEnabled();
    }

    public static boolean i(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList j(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void k(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }

    public static final void l(O10311700946806650263 o10311700946806650263, Object obj) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = o10311700946806650263.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void m(O10311700946806650263 o10311700946806650263, J614522193061423954 j614522193061423954) {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (j614522193061423954 == null || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = o10311700946806650263.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(j614522193061423954);
    }

    public static final void n(AccessibilityManager accessibilityManager, AccessibilityManager$AccessibilityServicesStateChangeListener accessibilityManager$AccessibilityServicesStateChangeListener) {
        accessibilityManager.removeAccessibilityServicesStateChangeListener(accessibilityManager$AccessibilityServicesStateChangeListener);
    }

    public static final void o(CursorAnchorInfo.Builder builder, S6349823729575121924 s6349823729575121924) {
        builder.setEditorBoundsInfo(P12992571626612557236.k().setEditorBounds(X7410747940286448830.v(s6349823729575121924)).setHandwritingBounds(X7410747940286448830.v(s6349823729575121924)).build());
    }

    public static final void p(CursorAnchorInfo.Builder builder, S6349823729575121924 s6349823729575121924) {
        builder.setEditorBoundsInfo(P12992571626612557236.k().setEditorBounds(X7410747940286448830.v(s6349823729575121924)).setHandwritingBounds(X7410747940286448830.v(s6349823729575121924)).build());
    }

    public static final void q(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static void r(S9684361936304835821 s9684361936304835821, boolean z) {
        s9684361936304835821.setSelectedChildViewEnabled(z);
    }

    public static void s(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void t(Object obj, J614522193061423954 j614522193061423954) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback(j614522193061423954);
    }
}
