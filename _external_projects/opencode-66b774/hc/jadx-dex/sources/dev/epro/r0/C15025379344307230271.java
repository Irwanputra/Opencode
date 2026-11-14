package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class C15025379344307230271 {
    public static android.graphics.Typeface a(android.graphics.Typeface typeface, int i, boolean z) {
        return android.graphics.Typeface.create(typeface, i, z);
    }

    public static android.os.Handler b(android.os.Looper looper) {
        return android.os.Handler.createAsync(looper);
    }

    public static android.os.Handler c(android.os.Looper looper) {
        return android.os.Handler.createAsync(looper);
    }

    public static android.view.textclassifier.TextClassifier d(android.content.Context context, dev.epro.r0.L14432282451889478852 l14432282451889478852) {
        java.lang.String str;
        android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) context.getSystemService(android.view.textclassifier.TextClassificationManager.class);
        int iOrdinal = l14432282451889478852.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                dev.epro.r0.Z3383101362411723454.g();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new android.view.textclassifier.TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static java.util.List e(android.view.DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static java.lang.String[] f(android.icu.text.DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long g(android.content.pm.PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void h(android.app.job.JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static java.lang.String i() {
        java.lang.String processName = android.app.Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int j(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getResId();
    }

    public static java.lang.String k(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getResPackage();
    }

    public static int l(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int m(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int n(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int o(android.view.DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int p(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static android.text.PrecomputedText.Params q(dev.epro.r0.Q6854864344654328121 q6854864344654328121) {
        return q6854864344654328121.getTextMetricsParams();
    }

    public static int r(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getType();
    }

    public static android.net.Uri s(java.lang.Object obj) {
        return ((android.graphics.drawable.Icon) obj).getUri();
    }

    public static void t(android.widget.TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void u(android.app.Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean v(android.view.ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
