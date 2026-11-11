package com.codetroopers.betterpickers.numberpicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2685;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NumberView extends LinearLayout {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ColorStateList f2237;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2238;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Typeface f2239;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2240;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2241;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Typeface f2242;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2243;

    public NumberView(Context context) {
        this(context, null);
    }

    public NumberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2242 = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        this.f2237 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2238 = (ZeroTopPaddingTextView) findViewById(C2685.number);
        this.f2240 = (ZeroTopPaddingTextView) findViewById(C2685.decimal);
        this.f2243 = (ZeroTopPaddingTextView) findViewById(C2685.decimal_separator);
        this.f2241 = (ZeroTopPaddingTextView) findViewById(C2685.minus_label);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2238;
        if (zeroTopPaddingTextView != null) {
            this.f2239 = zeroTopPaddingTextView.getTypeface();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2238;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTypeface(this.f2242);
            this.f2238.m1171();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2240;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTypeface(this.f2242);
            this.f2240.m1171();
        }
        m1158();
    }

    public void setNumber(String str, String str2, boolean z, boolean z2) {
        this.f2241.setVisibility(z2 ? 0 : 8);
        if (this.f2238 != null) {
            if (str.equals("")) {
                this.f2238.setText("-");
                this.f2238.setTypeface(this.f2242);
                this.f2238.setEnabled(false);
            } else {
                this.f2238.setText(str);
                ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2238;
                if (z) {
                    zeroTopPaddingTextView.setTypeface(this.f2239);
                    this.f2238.setEnabled(true);
                    this.f2238.m1170();
                    this.f2238.setVisibility(0);
                } else {
                    zeroTopPaddingTextView.setTypeface(this.f2242);
                    this.f2238.setEnabled(true);
                }
            }
            this.f2238.m1171();
            this.f2238.setVisibility(0);
        }
        if (this.f2240 != null) {
            if (str2.equals("")) {
                this.f2240.setVisibility(8);
            } else {
                this.f2240.setText(str2);
                this.f2240.setTypeface(this.f2242);
                this.f2240.setEnabled(true);
                this.f2240.m1171();
                this.f2240.setVisibility(0);
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2243;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setVisibility(z ? 0 : 8);
        }
    }

    public void setTheme(int i) {
        if (i != -1) {
            this.f2237 = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment).getColorStateList(C2679.BetterPickersDialogFragment_bpTextColor);
        }
        m1158();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1158() {
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2238;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f2237);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2240;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f2237);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2243;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f2237);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f2241;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTextColor(this.f2237);
        }
    }
}
