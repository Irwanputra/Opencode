package com.google.android.material.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p034.p050.p055.p056.C1266;
import p131.p161.p162.p163.C2243;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TabItem extends View {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final CharSequence f3442;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Drawable f3443;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f3444;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2243.TabItem);
        this.f3442 = obtainStyledAttributes.getText(C2243.TabItem_android_text);
        int i = C2243.TabItem_android_icon;
        this.f3443 = (!obtainStyledAttributes.hasValue(i) || (resourceId = obtainStyledAttributes.getResourceId(i, 0)) == 0) ? obtainStyledAttributes.getDrawable(i) : C1266.m2928(context, resourceId);
        this.f3444 = obtainStyledAttributes.getResourceId(C2243.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
