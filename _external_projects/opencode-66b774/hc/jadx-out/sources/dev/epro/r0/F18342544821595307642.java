package dev.epro.r0;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.autofill.AutofillId;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class F18342544821595307642 {
    public static final ColorSpace a(G5298154673482189769 g5298154673482189769) {
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.f223o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (S10823041268949770285.t(g5298154673482189769, E4238948680093459570.n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            ColorSpace colorSpace = S10823041268949770285.t(g5298154673482189769, E4238948680093459570.v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : S10823041268949770285.t(g5298154673482189769, E4238948680093459570.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (i >= 36) {
            ColorSpace colorSpace2 = S10823041268949770285.t(g5298154673482189769, E4238948680093459570.x) ? ColorSpace.get(G9045647016837122466.d()) : null;
            if (colorSpace2 != null) {
                return colorSpace2;
            }
        }
        if (!(g5298154673482189769 instanceof H8745424616867554108)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        String str = g5298154673482189769.a;
        H8745424616867554108 h8745424616867554108 = (H8745424616867554108) g5298154673482189769;
        float[] fArrA = h8745424616867554108.d.a();
        P4785861829097979576 p4785861829097979576 = h8745424616867554108.g;
        ColorSpace.Rgb.TransferParameters transferParameters = p4785861829097979576 != null ? new ColorSpace.Rgb.TransferParameters(p4785861829097979576.b, p4785861829097979576.c, p4785861829097979576.d, p4785861829097979576.e, p4785861829097979576.f, p4785861829097979576.g, p4785861829097979576.a) : null;
        float[] fArr = h8745424616867554108.i;
        final byte b = 0;
        if (transferParameters != null) {
            T15589241373902147015.z();
            ColorSpace.Rgb rgb = new ColorSpace.Rgb(str, h8745424616867554108.h, fArrA, transferParameters);
            if (Float.isNaN(fArr[0]) || Arrays.equals(rgb.getTransform(), fArr)) {
                return rgb;
            }
            T15589241373902147015.z();
            return new ColorSpace.Rgb(str, fArr, transferParameters);
        }
        T15589241373902147015.z();
        float[] fArr2 = h8745424616867554108.h;
        final D8340673431449205037 d8340673431449205037 = h8745424616867554108.l;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: dev.epro.r0.S18348824340779913136
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                byte b2 = b;
                F4096073349764486348 f4096073349764486348 = d8340673431449205037;
                switch (b2) {
                }
                return ((Number) f4096073349764486348.invoke(Double.valueOf(d))).doubleValue();
            }
        };
        final D8340673431449205037 d83406734314492050372 = h8745424616867554108.f278o;
        final byte b2 = 1;
        return new ColorSpace.Rgb(str, fArr2, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: dev.epro.r0.S18348824340779913136
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d) {
                byte b22 = b2;
                F4096073349764486348 f4096073349764486348 = d83406734314492050372;
                switch (b22) {
                }
                return ((Number) f4096073349764486348.invoke(Double.valueOf(d))).doubleValue();
            }
        }, h8745424616867554108.e, h8745424616867554108.f);
    }

    public static Notification.Builder b(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Icon c(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    public static AutofillId d(View view) {
        return view.getAutofillId();
    }

    public static float e(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float g(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static TextClassifier h(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public static float i(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }

    public static boolean j(File file, File file2) {
        try {
            Files.move(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void k(Window.Callback callback, boolean z) {
        callback.onPointerCaptureChanged(z);
    }

    public static Intent l(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return (i & 4) != 0 ? context.registerReceiver(broadcastReceiver, intentFilter, B5998207562248239613.C(context), null) : context.registerReceiver(broadcastReceiver, intentFilter, null, null, 0);
    }

    public static Intent m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        return context.registerReceiver(broadcastReceiver, intentFilter, null, null, i);
    }

    public static void n(MenuItem menuItem, char c, int i) {
        menuItem.setAlphabeticShortcut(c, i);
    }

    public static void o(Notification.Builder builder) {
        builder.setBadgeIconType(0);
    }

    public static void p(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setContentDescription(charSequence);
    }

    public static void q(Notification.Builder builder) {
        builder.setGroupAlertBehavior(0);
    }

    public static void r(MenuItem menuItem, ColorStateList colorStateList) {
        menuItem.setIconTintList(colorStateList);
    }

    public static void s(MenuItem menuItem, PorterDuff.Mode mode) {
        menuItem.setIconTintMode(mode);
    }

    public static void t(MenuItem menuItem, char c, int i) {
        menuItem.setNumericShortcut(c, i);
    }

    public static void u(Notification.Builder builder) {
        builder.setSettingsText(null);
    }

    public static void v(Notification.Builder builder) {
        builder.setShortcutId(null);
    }

    public static void w(Notification.Builder builder) {
        builder.setTimeoutAfter(0L);
    }

    public static void x(MenuItem menuItem, CharSequence charSequence) {
        menuItem.setTooltipText(charSequence);
    }

    public static void y(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static void z(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
