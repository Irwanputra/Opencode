package com.codetroopers.betterpickers.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import p131.p221.p222.C2676;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ZeroTopPaddingTextView extends TextView {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final Typeface f2335 = Typeface.create("san-serif", 1);

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final Typeface f2336 = Typeface.create("sans-serif-condensed", 1);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2337;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f2338;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public String f2339;

    public ZeroTopPaddingTextView(Context context) {
        this(context, null);
    }

    public ZeroTopPaddingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ZeroTopPaddingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2337 = 0;
        this.f2338 = "";
        this.f2339 = "";
        this.f2338 = getResources().getString(C2676.number_picker_seperator);
        this.f2339 = getResources().getString(C2676.time_picker_time_seperator);
        setIncludeFontPadding(false);
        m1171();
    }

    public void setPaddingRight(int i) {
        this.f2337 = i;
        m1171();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m1170() {
        setPadding(0, (int) (getTextSize() * (-0.208f)), this.f2337, (int) (getTextSize() * (-0.208f)));
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1171() {
        float f;
        float f2;
        float f3 = 0.208f;
        if (getPaint().getTypeface() == null || !getPaint().getTypeface().equals(Typeface.DEFAULT_BOLD)) {
            f = 0.328f;
            f2 = 0.25f;
        } else {
            f = 0.208f;
            f2 = 0.208f;
        }
        if (getTypeface() != null && getTypeface().equals(f2335)) {
            f = 0.208f;
            f2 = 0.208f;
        }
        if (getTypeface() == null || !getTypeface().equals(f2336)) {
            f3 = f;
        } else {
            f2 = 0.208f;
        }
        setPadding(0, (int) (getTextSize() * (-f3)), this.f2337, (int) (getTextSize() * (-f2)));
    }
}
