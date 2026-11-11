package com.codetroopers.betterpickers.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.View;
import com.codetroopers.betterpickers.widget.PickerLinearLayout;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import com.codetroopers.betterpickers.widget.ZeroTopPaddingTextView;
import p131.p155.p156.p157.C2098;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2685;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DateView extends PickerLinearLayout {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ColorStateList f2132;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2133;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public UnderlinePageIndicatorPicker f2134;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2135;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Typeface f2136;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Typeface f2137;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2138;

    public DateView(Context context) {
        this(context, null);
    }

    public DateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2136 = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        this.f2137 = Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
        this.f2132 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
        setWillNotDraw(false);
    }

    public ZeroTopPaddingTextView getDate() {
        return this.f2135;
    }

    public ZeroTopPaddingTextView getMonth() {
        return this.f2133;
    }

    public ZeroTopPaddingTextView getYear() {
        return this.f2138;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2134.setTitleView(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        ZeroTopPaddingTextView zeroTopPaddingTextView;
        super.onFinishInflate();
        this.f2133 = (ZeroTopPaddingTextView) findViewById(C2685.month);
        this.f2135 = (ZeroTopPaddingTextView) findViewById(C2685.date);
        this.f2138 = (ZeroTopPaddingTextView) findViewById(C2685.year_label);
        char[] dateFormatOrder = DateFormat.getDateFormatOrder(getContext());
        removeAllViews();
        for (char c : dateFormatOrder) {
            if (c == 'M') {
                zeroTopPaddingTextView = this.f2133;
            } else if (c == 'd') {
                zeroTopPaddingTextView = this.f2135;
            } else if (c == 'y') {
                zeroTopPaddingTextView = this.f2138;
            }
            addView(zeroTopPaddingTextView);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2135;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTypeface(this.f2136);
            this.f2135.m1171();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2133;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTypeface(this.f2136);
            this.f2133.m1171();
        }
        m1138();
    }

    public void setDate(String str, int i, int i2) {
        if (this.f2133 != null) {
            if (str.equals("")) {
                this.f2133.setText("-");
                this.f2133.setTypeface(this.f2136);
                this.f2133.setEnabled(false);
                this.f2133.m1171();
            } else {
                this.f2133.setText(str);
                this.f2133.setTypeface(this.f2137);
                this.f2133.setEnabled(true);
                this.f2133.m1170();
            }
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2135;
        if (zeroTopPaddingTextView != null) {
            if (i <= 0) {
                zeroTopPaddingTextView.setText("-");
                this.f2135.setEnabled(false);
            } else {
                zeroTopPaddingTextView.setText(Integer.toString(i));
                this.f2135.setEnabled(true);
            }
            this.f2135.m1171();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2138;
        if (zeroTopPaddingTextView2 != null) {
            if (i2 <= 0) {
                zeroTopPaddingTextView2.setText("----");
                this.f2138.setEnabled(false);
            } else {
                String num = Integer.toString(i2);
                while (num.length() < 4) {
                    num = C2098.m4205("-", num);
                }
                this.f2138.setText(num);
                this.f2138.setEnabled(true);
            }
            this.f2138.m1171();
        }
    }

    public void setOnClick(View.OnClickListener onClickListener) {
        this.f2135.setOnClickListener(onClickListener);
        this.f2133.setOnClickListener(onClickListener);
        this.f2138.setOnClickListener(onClickListener);
    }

    public void setTheme(int i) {
        if (i != -1) {
            this.f2132 = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment).getColorStateList(C2679.BetterPickersDialogFragment_bpTitleColor);
        }
        m1138();
    }

    public void setUnderlinePage(UnderlinePageIndicatorPicker underlinePageIndicatorPicker) {
        this.f2134 = underlinePageIndicatorPicker;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1138() {
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2133;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f2132);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2135;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f2132);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2138;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f2132);
        }
    }

    @Override // com.codetroopers.betterpickers.widget.PickerLinearLayout
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public View mo1139(int i) {
        return getChildAt(i);
    }
}
