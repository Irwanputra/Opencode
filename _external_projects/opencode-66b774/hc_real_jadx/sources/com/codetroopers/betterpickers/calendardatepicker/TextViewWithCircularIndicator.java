package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import p131.p221.p222.C2676;
import p131.p221.p222.C2680;
import p131.p221.p222.C2686;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TextViewWithCircularIndicator extends TextView {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public Paint f2076;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2077;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f2078;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final String f2079;

    public TextViewWithCircularIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2076 = new Paint();
        Resources resources = context.getResources();
        this.f2077 = resources.getColor(C2680.bpBlue);
        resources.getDimensionPixelOffset(C2686.month_select_circle_radius);
        this.f2079 = context.getResources().getString(C2676.item_is_selected);
        m1127();
    }

    @Override // android.view.View
    public CharSequence getContentDescription() {
        CharSequence text = getText();
        return this.f2078 ? String.format(this.f2079, text) : text;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f2078) {
            int width = getWidth();
            int height = getHeight();
            canvas.drawCircle(width / 2, height / 2, Math.min(width, height) / 2, this.f2076);
        }
    }

    public void setCircleColor(int i) {
        this.f2077 = i;
        m1127();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1127() {
        this.f2076.setFakeBoldText(true);
        this.f2076.setAntiAlias(true);
        this.f2076.setColor(this.f2077);
        this.f2076.setTextAlign(Paint.Align.CENTER);
        this.f2076.setStyle(Paint.Style.FILL);
        this.f2076.setAlpha(60);
    }
}
