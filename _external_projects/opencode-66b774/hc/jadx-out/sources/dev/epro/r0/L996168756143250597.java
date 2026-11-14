package dev.epro.r0;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class L996168756143250597 {
    public static final B1412794554478658227 a = new B1412794554478658227(30);
    public static Paint b;

    public static Typeface a(Typeface typeface, String str, int i) {
        FontVariationAxis[] fontVariationAxisArr;
        B734579365046261692 b734579365046261692 = new B734579365046261692(typeface, str, i);
        B1412794554478658227 b1412794554478658227 = a;
        Typeface typeface2 = (Typeface) b1412794554478658227.c(b734579365046261692);
        if (typeface2 != null) {
            return typeface2;
        }
        Paint paint = b;
        if (paint == null) {
            paint = new Paint();
            b = paint;
        }
        if (i != 0) {
            if (TextUtils.isEmpty(str)) {
                fontVariationAxisArr = new FontVariationAxis[0];
            } else {
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                if (fontVariationAxisArrFromFontVariationSettings != null) {
                    fontVariationAxisArr = fontVariationAxisArrFromFontVariationSettings;
                }
            }
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 >= fontVariationAxisArr.length) {
                    break;
                }
                FontVariationAxis fontVariationAxis = fontVariationAxisArr[i2];
                if ("wght".equals(fontVariationAxis.getTag())) {
                    float styleValue = fontVariationAxis.getStyleValue() + i;
                    fontVariationAxisArr[i2] = new FontVariationAxis("wght", styleValue >= 1.0f ? Math.min(styleValue, 1000.0f) : 1.0f);
                    z = true;
                }
                i2++;
            }
            if (!z) {
                FontVariationAxis[] fontVariationAxisArr2 = new FontVariationAxis[fontVariationAxisArr.length + 1];
                System.arraycopy(fontVariationAxisArr, 0, fontVariationAxisArr2, 0, fontVariationAxisArr.length);
                float f = i + 400;
                fontVariationAxisArr2[fontVariationAxisArr.length] = new FontVariationAxis("wght", f >= 1.0f ? Math.min(f, 1000.0f) : 1.0f);
                fontVariationAxisArr = fontVariationAxisArr2;
            }
            str = FontVariationAxis.toFontVariationSettings(fontVariationAxisArr);
        }
        if (Objects.equals(paint.getFontVariationSettings(), str)) {
            paint.setFontVariationSettings(null);
        }
        paint.setTypeface(typeface);
        if (!paint.setFontVariationSettings(str)) {
            return null;
        }
        Typeface typeface3 = paint.getTypeface();
        b1412794554478658227.d(b734579365046261692, typeface3);
        return typeface3;
    }

    public static int b(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static String c(TextView textView) {
        return textView.getFontVariationSettings();
    }

    public static void d(TextView textView, int i, int i2, int i3) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, 0);
    }

    public static void e(TextView textView, int[] iArr) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
    }

    public static void f(TextView textView, String str) {
        if (Objects.equals(textView.getFontVariationSettings(), str)) {
            textView.setFontVariationSettings("");
        }
        textView.setFontVariationSettings(str);
    }
}
