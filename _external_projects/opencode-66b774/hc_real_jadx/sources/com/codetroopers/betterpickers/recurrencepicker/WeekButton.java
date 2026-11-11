package com.codetroopers.betterpickers.recurrencepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ToggleButton;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;

/* loaded from: /tmp/opencode/hc_real.dex */
public class WeekButton extends ToggleButton {
    public WeekButton(Context context) {
        super(context);
    }

    public WeekButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WeekButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public static void setSuggestedWidth(int i) {
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        if (measuredHeight > 0 && measuredWidth > 0) {
            if (measuredWidth < measuredHeight) {
                AtomicInteger atomicInteger = C1096.f5578;
                if (View.MeasureSpec.getMode(getMeasuredHeightAndState()) != 1073741824) {
                    measuredHeight = measuredWidth;
                }
            } else if (measuredHeight < measuredWidth) {
                AtomicInteger atomicInteger2 = C1096.f5578;
                if (View.MeasureSpec.getMode(getMeasuredWidthAndState()) != 1073741824) {
                    measuredWidth = measuredHeight;
                }
            }
            setMeasuredDimension(measuredHeight, measuredWidth);
        }
        measuredWidth = measuredHeight;
        measuredHeight = measuredWidth;
        setMeasuredDimension(measuredHeight, measuredWidth);
    }
}
