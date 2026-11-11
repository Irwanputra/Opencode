package com.codetroopers.betterpickers.recurrencepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: /tmp/opencode/hc_real.dex */
public class LinearLayoutWithMaxWidth extends LinearLayout {
    public LinearLayoutWithMaxWidth(Context context) {
        super(context);
    }

    public LinearLayoutWithMaxWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LinearLayoutWithMaxWidth(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        WeekButton.setSuggestedWidth(View.MeasureSpec.getSize(i) / 7);
        super.onMeasure(i, i2);
    }
}
