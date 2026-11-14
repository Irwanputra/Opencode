package dev.epro.r0;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G4756000168812988315 {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void b(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets d(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void e(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void f(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void g(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void h(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
