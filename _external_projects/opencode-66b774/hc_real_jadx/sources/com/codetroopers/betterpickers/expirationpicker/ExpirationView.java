package com.codetroopers.betterpickers.expirationpicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Typeface;
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
public class ExpirationView extends PickerLinearLayout {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2172;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public ColorStateList f2173;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2174;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public UnderlinePageIndicatorPicker f2175;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ZeroTopPaddingTextView f2176;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Typeface f2177;

    public ExpirationView(Context context) {
        this(context, null);
    }

    public ExpirationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2177 = Typeface.createFromAsset(context.getAssets(), "fonts/AndroidClockMono-Thin.ttf");
        Typeface.createFromAsset(context.getAssets(), "fonts/Roboto-Bold.ttf");
        this.f2173 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
        setWillNotDraw(false);
    }

    public ZeroTopPaddingTextView getMonth() {
        return this.f2172;
    }

    public ZeroTopPaddingTextView getYear() {
        return this.f2174;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f2175.setTitleView(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2172 = (ZeroTopPaddingTextView) findViewById(C2685.month);
        this.f2174 = (ZeroTopPaddingTextView) findViewById(C2685.year_label);
        this.f2176 = (ZeroTopPaddingTextView) findViewById(C2685.expiration_seperator);
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2172;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTypeface(this.f2177);
            this.f2172.m1171();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2174;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTypeface(this.f2177);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2176;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTypeface(this.f2177);
        }
        m1145();
    }

    public void setExpiration(String str, int i) {
        if (this.f2172 != null) {
            if (str.equals("")) {
                this.f2172.setText("--");
                this.f2172.setEnabled(false);
            } else {
                this.f2172.setText(str);
                this.f2172.setEnabled(true);
            }
            this.f2172.m1171();
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2174;
        if (zeroTopPaddingTextView != null) {
            if (i <= 0) {
                zeroTopPaddingTextView.setText("----");
                this.f2174.setEnabled(false);
            } else {
                String num = Integer.toString(i);
                while (num.length() < 4) {
                    num = C2098.m4205(num, "-");
                }
                this.f2174.setText(num);
                this.f2174.setEnabled(true);
            }
            this.f2174.m1171();
        }
    }

    public void setOnClick(View.OnClickListener onClickListener) {
        this.f2172.setOnClickListener(onClickListener);
        this.f2174.setOnClickListener(onClickListener);
    }

    public void setTheme(int i) {
        if (i != -1) {
            this.f2173 = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment).getColorStateList(C2679.BetterPickersDialogFragment_bpTitleColor);
        }
        m1145();
    }

    public void setUnderlinePage(UnderlinePageIndicatorPicker underlinePageIndicatorPicker) {
        this.f2175 = underlinePageIndicatorPicker;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1145() {
        ZeroTopPaddingTextView zeroTopPaddingTextView = this.f2172;
        if (zeroTopPaddingTextView != null) {
            zeroTopPaddingTextView.setTextColor(this.f2173);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView2 = this.f2174;
        if (zeroTopPaddingTextView2 != null) {
            zeroTopPaddingTextView2.setTextColor(this.f2173);
        }
        ZeroTopPaddingTextView zeroTopPaddingTextView3 = this.f2176;
        if (zeroTopPaddingTextView3 != null) {
            zeroTopPaddingTextView3.setTextColor(this.f2173);
        }
    }

    @Override // com.codetroopers.betterpickers.widget.PickerLinearLayout
    /* renamed from: げつ〴ぬぐ */
    public View mo1139(int i) {
        int[] iArr = {0, 2};
        if (i > 2) {
            return null;
        }
        return getChildAt(iArr[i]);
    }
}
