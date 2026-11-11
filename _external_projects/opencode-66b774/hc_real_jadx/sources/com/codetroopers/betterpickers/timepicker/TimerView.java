package com.codetroopers.betterpickers.timepicker;

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
public class TimerView extends LinearLayout {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2313;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2314;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Typeface f2315;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2316;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2317;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Typeface f2318;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2319;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public ColorStateList f2320;

    public TimerView(Context context) {
        this(context, null);
    }

    public TimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2318 = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        this.f2320 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2319 = (ZeroTopPaddingTextView) findViewById(C2685.hours_tens);
        this.f2317 = (ZeroTopPaddingTextView) findViewById(C2685.minutes_tens);
        this.f2314 = (ZeroTopPaddingTextView) findViewById(C2685.hours_ones);
        this.f2316 = (ZeroTopPaddingTextView) findViewById(C2685.minutes_ones);
        this.f2313 = (ZeroTopPaddingTextView) findViewById(C2685.hours_seperator);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2314;
        if (zeroTopPaddingTextView != null) {
            this.f2315 = zeroTopPaddingTextView.getTypeface();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2317;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTypeface(this.f2318);
            this.f2317.m1171();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2316;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTypeface(this.f2318);
            this.f2316.m1171();
        }
    }

    public void setTheme(int i) {
        if (i != -1) {
            this.f2320 = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment).getColorStateList(C2679.BetterPickersDialogFragment_bpTextColor);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2314;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f2320);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2316;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f2320);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2319;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f2320);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f2317;
        if (zeroTopPaddingTextView4 != null) {
            zeroTopPaddingTextView4.setTextColor(this.f2320);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView5 = this.f2313;
        if (zeroTopPaddingTextView5 != null) {
            zeroTopPaddingTextView5.setTextColor(this.f2320);
        }
    }

    public void setTime(int i, int i2, int i3, int i4) {
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2319;
        if (zeroTopPaddingTextView != null) {
            if (i == -2) {
                zeroTopPaddingTextView.setVisibility(4);
            } else {
                if (i == -1) {
                    zeroTopPaddingTextView.setText("-");
                    this.f2319.setTypeface(this.f2318);
                    this.f2319.setEnabled(false);
                    this.f2319.m1171();
                } else {
                    zeroTopPaddingTextView.setText(String.format("%d", Integer.valueOf(i)));
                    this.f2319.setTypeface(this.f2315);
                    this.f2319.setEnabled(true);
                    this.f2319.m1170();
                }
                this.f2319.setVisibility(0);
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2314;
        if (zeroTopPaddingTextView2 != null) {
            if (i2 == -1) {
                zeroTopPaddingTextView2.setText("-");
                this.f2314.setTypeface(this.f2318);
                this.f2314.setEnabled(false);
                this.f2314.m1171();
            } else {
                zeroTopPaddingTextView2.setText(String.format("%d", Integer.valueOf(i2)));
                this.f2314.setTypeface(this.f2315);
                this.f2314.setEnabled(true);
                this.f2314.m1170();
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2317;
        if (zeroTopPaddingTextView3 != null) {
            if (i3 == -1) {
                zeroTopPaddingTextView3.setText("-");
                this.f2317.setEnabled(false);
            } else {
                zeroTopPaddingTextView3.setEnabled(true);
                this.f2317.setText(String.format("%d", Integer.valueOf(i3)));
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView4 = this.f2316;
        if (zeroTopPaddingTextView4 != null) {
            if (i4 == -1) {
                zeroTopPaddingTextView4.setText("-");
                this.f2316.setEnabled(false);
            } else {
                zeroTopPaddingTextView4.setText(String.format("%d", Integer.valueOf(i4)));
                this.f2316.setEnabled(true);
            }
        }
    }
}
