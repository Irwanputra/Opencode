package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatTextView;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.p164.p165.C2112;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, null);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        super(C2112.m4210(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        if (C1687.m3715(context2, C2111.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = C2243.MaterialTextView;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
            int m1545 = m1545(context2, obtainStyledAttributes, C2243.MaterialTextView_android_lineHeight, C2243.MaterialTextView_lineHeight);
            obtainStyledAttributes.recycle();
            if (m1545 != -1) {
                return;
            }
            TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
            int resourceId = obtainStyledAttributes2.getResourceId(C2243.MaterialTextView_android_textAppearance, -1);
            obtainStyledAttributes2.recycle();
            if (resourceId != -1) {
                m1546(theme, resourceId);
            }
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static int m1545(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (C1687.m3715(context, C2111.textAppearanceLineHeightEnabled, true)) {
            m1546(context.getTheme(), i);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1546(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C2243.MaterialTextAppearance);
        int m1545 = m1545(getContext(), obtainStyledAttributes, C2243.MaterialTextAppearance_android_lineHeight, C2243.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (m1545 >= 0) {
            setLineHeight(m1545);
        }
    }
}
