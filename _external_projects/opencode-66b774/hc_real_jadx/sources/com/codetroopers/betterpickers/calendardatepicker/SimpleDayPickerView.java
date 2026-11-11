package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.util.AttributeSet;
import p131.p221.p222.p224.C2696;
import p131.p221.p222.p224.InterfaceC2694;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SimpleDayPickerView extends DayPickerView {
    public SimpleDayPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SimpleDayPickerView(Context context, InterfaceC2694 interfaceC2694) {
        super(context, interfaceC2694);
    }

    @Override // com.codetroopers.betterpickers.calendardatepicker.DayPickerView
    /* renamed from: 〺つふすそ */
    public MonthAdapter mo1109(Context context, InterfaceC2694 interfaceC2694) {
        return new C2696(context, interfaceC2694);
    }
}
