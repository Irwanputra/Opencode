package com.codetroopers.betterpickers.hmspicker;

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
public class HmsView extends LinearLayout {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2202;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2203;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Typeface f2204;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2205;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2206;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2207;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2208;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ColorStateList f2209;

    public HmsView(Context context) {
        this(context, null);
    }

    public HmsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2204 = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        this.f2209 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2203 = (ZeroTopPaddingTextView) findViewById(C2685.hours_ones);
        this.f2208 = (ZeroTopPaddingTextView) findViewById(C2685.minutes_tens);
        this.f2205 = (ZeroTopPaddingTextView) findViewById(C2685.minutes_ones);
        this.f2207 = (ZeroTopPaddingTextView) findViewById(C2685.seconds_tens);
        this.f2206 = (ZeroTopPaddingTextView) findViewById(C2685.seconds_ones);
        this.f2202 = (ZeroTopPaddingTextView) findViewById(C2685.minus_label);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2203;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.getTypeface();
            this.f2203.m1170();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2208;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.m1170();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2205;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.m1170();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f2207;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTypeface(this.f2204);
            this.f2207.m1171();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f2206;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setTypeface(this.f2204);
            this.f2206.m1171();
        }
    }

    public void setTheme(int i) {
        if (i != -1) {
            this.f2209 = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment).getColorStateList(C2679.BetterPickersDialogFragment_bpTextColor);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2203;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f2209);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2205;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f2209);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2208;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f2209);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f2206;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTextColor(this.f2209);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f2207;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setTextColor(this.f2209);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView6 = this.f2202;
        if (zeroTopPaddingTextView6 != null) {
            zeroTopPaddingTextView6.setTextColor(this.f2209);
        }
    }

    public void setTime(int i, int i2, int i3, int i4, int i5) {
        setTime(false, i, i2, i3, i4, i5);
    }

    public void setTime(boolean z, int i, int i2, int i3, int i4, int i5) {
        this.f2202.setVisibility(z ? 0 : 8);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2203;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setText(String.format("%d", Integer.valueOf(i)));
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2208;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setText(String.format("%d", Integer.valueOf(i2)));
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2205;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setText(String.format("%d", Integer.valueOf(i3)));
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f2207;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setText(String.format("%d", Integer.valueOf(i4)));
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f2206;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setText(String.format("%d", Integer.valueOf(i5)));
        }
    }
}
