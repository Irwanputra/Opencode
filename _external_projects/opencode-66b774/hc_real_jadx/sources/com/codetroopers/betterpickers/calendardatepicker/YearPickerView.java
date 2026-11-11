package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import p034.p035.p043.C1067;
import p034.p095.C1687;
import p131.p221.p222.C2678;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2686;
import p131.p221.p222.p224.InterfaceC2694;
import p131.p221.p222.p224.RunnableC2695;
import p131.p221.p222.p224.ViewOnClickListenerC2688;

/* loaded from: /tmp/opencode/hc_real.dex */
public class YearPickerView extends ListView implements AdapterView.OnItemClickListener, ViewOnClickListenerC2688.InterfaceC2690 {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final /* synthetic */ int f2080 = 0;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2081;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final InterfaceC2694 f2082;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2083;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public C0337 f2084;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2085;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public TextViewWithCircularIndicator f2086;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2087;

    /* renamed from: com.codetroopers.betterpickers.calendardatepicker.YearPickerView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0337 extends ArrayAdapter<String> {
        public C0337(Context context, int i, List<String> list) {
            super(context, i, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) super.getView(i, view, viewGroup);
            textViewWithCircularIndicator.requestLayout();
            YearPickerView yearPickerView = YearPickerView.this;
            int i2 = YearPickerView.f2080;
            yearPickerView.getClass();
            int intValue = Integer.valueOf(textViewWithCircularIndicator.getText().toString()).intValue();
            textViewWithCircularIndicator.setCircleColor(YearPickerView.this.f2081);
            textViewWithCircularIndicator.setTextColor(YearPickerView.this.f2083);
            boolean z = ((ViewOnClickListenerC2688) YearPickerView.this.f2082).m4655().f2032 == intValue;
            textViewWithCircularIndicator.f2078 = z;
            if (z) {
                YearPickerView.this.f2086 = textViewWithCircularIndicator;
            }
            return textViewWithCircularIndicator;
        }
    }

    public YearPickerView(Context context, InterfaceC2694 interfaceC2694) {
        super(context);
        this.f2082 = interfaceC2694;
        ViewOnClickListenerC2688 viewOnClickListenerC2688 = (ViewOnClickListenerC2688) interfaceC2694;
        viewOnClickListenerC2688.f10166.add(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources resources = context.getResources();
        this.f2087 = resources.getDimensionPixelOffset(C2686.date_picker_view_animator_height);
        this.f2085 = resources.getDimensionPixelOffset(C2686.year_label_height);
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(this.f2085 / 3);
        ArrayList arrayList = new ArrayList();
        for (int i = viewOnClickListenerC2688.f10160.f2032; i <= ((ViewOnClickListenerC2688) this.f2082).f10179.f2032; i++) {
            arrayList.add(String.format("%d", Integer.valueOf(i)));
        }
        C0337 c0337 = new C0337(context, C2678.calendar_year_label_text_view, arrayList);
        this.f2084 = c0337;
        setAdapter((ListAdapter) c0337);
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        mo1111();
        this.f2081 = C2680.bpBlue;
        this.f2083 = C2680.ampm_text_color;
    }

    public int getFirstPositionOffset() {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return 0;
        }
        return childAt.getTop();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4096) {
            accessibilityEvent.setFromIndex(0);
            accessibilityEvent.setToIndex(0);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ((ViewOnClickListenerC2688) this.f2082).f10182.m4651();
        TextViewWithCircularIndicator textViewWithCircularIndicator = (TextViewWithCircularIndicator) view;
        if (textViewWithCircularIndicator != null) {
            TextViewWithCircularIndicator textViewWithCircularIndicator2 = this.f2086;
            if (textViewWithCircularIndicator != textViewWithCircularIndicator2) {
                if (textViewWithCircularIndicator2 != null) {
                    textViewWithCircularIndicator2.f2078 = false;
                    textViewWithCircularIndicator2.requestLayout();
                }
                textViewWithCircularIndicator.f2078 = true;
                textViewWithCircularIndicator.requestLayout();
                this.f2086 = textViewWithCircularIndicator;
            }
            InterfaceC2694 interfaceC2694 = this.f2082;
            int intValue = Integer.valueOf(textViewWithCircularIndicator.getText().toString()).intValue();
            ViewOnClickListenerC2688 viewOnClickListenerC2688 = (ViewOnClickListenerC2688) interfaceC2694;
            int i2 = viewOnClickListenerC2688.f10175.get(2);
            int i3 = viewOnClickListenerC2688.f10175.get(5);
            int m3710 = C1687.m3710(i2, intValue);
            if (i3 > m3710) {
                viewOnClickListenerC2688.f10175.set(5, m3710);
            }
            viewOnClickListenerC2688.f10175.set(1, intValue);
            viewOnClickListenerC2688.m4653();
            viewOnClickListenerC2688.m4652(0);
            viewOnClickListenerC2688.m4654(true);
            this.f2084.notifyDataSetChanged();
        }
    }

    public void setTheme(TypedArray typedArray) {
        this.f2081 = typedArray.getColor(C2679.BetterPickersDialogs_bpRadialPointerColor, C1067.m2405(getContext(), C2680.bpBlue));
        this.f2083 = typedArray.getColor(C2679.BetterPickersDialogs_bpBodyUnselectedTextColor, C1067.m2405(getContext(), C2680.ampm_text_color));
    }

    @Override // p131.p221.p222.p224.ViewOnClickListenerC2688.InterfaceC2690
    /* renamed from: げつ〴ぬぐ */
    public void mo1111() {
        this.f2084.notifyDataSetChanged();
        post(new RunnableC2695(this, ((ViewOnClickListenerC2688) this.f2082).m4655().f2032 - ((ViewOnClickListenerC2688) this.f2082).f10160.f2032, (this.f2087 / 2) - (this.f2085 / 2)));
    }
}
