package p034.p050.p053;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import p034.p035.p038.C1011;
import p034.p050.C1148;
import p034.p050.p055.p056.C1266;

/* renamed from: づざかべべ.〺つふすそ.ぉざぅち〻.びえぁぜい, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1252 {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static final ThreadLocal<TypedValue> f6132 = new ThreadLocal<>();

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final int[] f6129 = {-16842910};

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static final int[] f6131 = {R.attr.state_focused};

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final int[] f6135 = {R.attr.state_pressed};

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final int[] f6133 = {R.attr.state_checked};

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final int[] f6134 = new int[0];

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final int[] f6130 = new int[1];

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static int m2890(Context context, int i) {
        ColorStateList m2893 = m2893(context, i);
        if (m2893 != null && m2893.isStateful()) {
            return m2893.getColorForState(f6129, m2893.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f6132;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return C1011.m2351(m2891(context, i), Math.round(Color.alpha(r4) * f));
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static int m2891(Context context, int i) {
        int[] iArr = f6130;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m2892(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1148.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(C1148.AppCompatTheme_windowActionBar)) {
                String str = "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).";
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static ColorStateList m2893(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f6130;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = C1266.m2929(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
