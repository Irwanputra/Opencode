package dev.epro.r0;

import android.app.Application;
import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.List;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public abstract class C15025379344307230271 {
    public static Typeface a(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler c(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static TextClassifier d(Context context, L14432282451889478852 l14432282451889478852) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int ordinal = l14432282451889478852.ordinal();
        if (ordinal == 0) {
            str = "edittext";
        } else {
            if (ordinal != 1) {
                Z3383101362411723454.g();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static List e(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static String[] f(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long g(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static void h(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }

    public static String i() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int j(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String k(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int l(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int m(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int n(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int p(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params q(Q6854864344654328121 q6854864344654328121) {
        return q6854864344654328121.getTextMetricsParams();
    }

    public static int r(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri s(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static void t(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static void u(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static boolean v(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
