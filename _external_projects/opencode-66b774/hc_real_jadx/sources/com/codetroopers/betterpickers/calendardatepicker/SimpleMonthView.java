package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SimpleMonthView extends MonthView {
    public SimpleMonthView(Context context) {
        super(context);
    }

    @Override // com.codetroopers.betterpickers.calendardatepicker.MonthView
    /* renamed from: げつ〴ぬぐ */
    public void mo1118(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z) {
        Paint paint;
        int i10;
        if (this.f2048 == i3) {
            canvas.drawCircle(i4, i5 - (MonthView.f2037 / 3), MonthView.f2038, this.f2042);
        }
        if (this.f2046 && this.f2064 == i3) {
            paint = this.f2066;
            i10 = this.f2049;
        } else {
            paint = this.f2066;
            i10 = z ? this.f2055 : this.f2071;
        }
        paint.setColor(i10);
        canvas.drawText(String.format("%d", Integer.valueOf(i3)), i4, i5, this.f2066);
    }
}
