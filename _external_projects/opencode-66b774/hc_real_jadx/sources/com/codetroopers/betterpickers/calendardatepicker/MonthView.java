package com.codetroopers.betterpickers.calendardatepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.text.format.Time;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.codetroopers.betterpickers.calendardatepicker.MonthAdapter;
import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p034.p035.p043.C1067;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p063.p064.AbstractC1353;
import p034.p095.C1687;
import p131.p221.p222.C2676;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2686;
import p131.p221.p222.p224.InterfaceC2694;
import p131.p221.p222.p224.ViewOnClickListenerC2688;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class MonthView extends View {

    /* renamed from: 〺でおいここ, reason: contains not printable characters */
    public static int f2034;

    /* renamed from: ぇとしたべど, reason: contains not printable characters */
    public static int f2035;

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static int f2036;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static int f2037;

    /* renamed from: げがぴうあだ, reason: contains not printable characters */
    public static int f2038;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Paint f2039;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public String f2040;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f2041;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Paint f2042;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Formatter f2043;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public boolean f2044;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final Calendar f2045;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f2046;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public final Calendar f2047;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f2048;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public int f2049;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public int f2050;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public String f2051;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f2052;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f2053;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public SparseArray<MonthAdapter.CalendarDay> f2054;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int f2055;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public int f2056;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public Paint f2057;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public int f2058;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f2059;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public InterfaceC0335 f2060;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Paint f2061;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f2062;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f2063;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f2064;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public final C0336 f2065;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public Paint f2066;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f2067;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public int f2068;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f2069;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Paint f2070;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int f2071;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final StringBuilder f2072;

    /* renamed from: com.codetroopers.betterpickers.calendardatepicker.MonthView$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0335 {
    }

    /* renamed from: com.codetroopers.betterpickers.calendardatepicker.MonthView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0336 extends AbstractC1353 {

        /* renamed from: ぉざぅち〻, reason: contains not printable characters */
        public final Rect f2073;

        /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
        public final Calendar f2074;

        public C0336(View view) {
            super(view);
            this.f2073 = new Rect();
            this.f2074 = Calendar.getInstance();
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
        public void mo1121(List<Integer> list) {
            for (int i = 1; i <= MonthView.this.f2059; i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
        public int mo1122(float f, float f2) {
            int m1117 = MonthView.this.m1117(f, f2);
            if (m1117 >= 0) {
                return m1117;
            }
            return Integer.MIN_VALUE;
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public boolean mo1123(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            MonthView monthView = MonthView.this;
            int i3 = MonthView.f2037;
            monthView.m1119(i);
            return true;
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public void mo1124(int i, AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setContentDescription(m1125(i));
        }

        /* renamed from: なぶひせが, reason: contains not printable characters */
        public final CharSequence m1125(int i) {
            Calendar calendar = this.f2074;
            MonthView monthView = MonthView.this;
            calendar.set(monthView.f2063, monthView.f2058, i);
            CharSequence format = DateFormat.format("dd MMMM yyyy", this.f2074.getTimeInMillis());
            MonthView monthView2 = MonthView.this;
            return i == monthView2.f2048 ? monthView2.getContext().getString(C2676.item_is_selected, format) : format;
        }

        @Override // p034.p063.p064.AbstractC1353
        /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
        public void mo1126(int i, C1084 c1084) {
            Rect rect = this.f2073;
            MonthView.this.getClass();
            int i2 = MonthView.f2035;
            MonthView monthView = MonthView.this;
            int i3 = monthView.f2050;
            int i4 = (monthView.f2069 + 0) / monthView.f2053;
            int m1116 = monthView.m1116() + (i - 1);
            int i5 = MonthView.this.f2053;
            int i6 = m1116 / i5;
            int i7 = ((m1116 % i5) * i4) + 0;
            int i8 = (i6 * i3) + i2;
            rect.set(i7, i8, i4 + i7, i3 + i8);
            c1084.f5550.setContentDescription(m1125(i));
            c1084.f5550.setBoundsInParent(this.f2073);
            c1084.f5550.addAction(16);
            if (i == MonthView.this.f2048) {
                c1084.f5550.setSelected(true);
            }
        }
    }

    public MonthView(Context context) {
        super(context);
        this.f2050 = 32;
        this.f2046 = false;
        this.f2048 = -1;
        this.f2064 = -1;
        this.f2052 = 1;
        this.f2053 = 7;
        this.f2059 = 7;
        this.f2067 = -1;
        this.f2041 = -1;
        this.f2062 = 6;
        this.f2068 = 0;
        Resources resources = context.getResources();
        this.f2045 = Calendar.getInstance();
        this.f2047 = Calendar.getInstance();
        this.f2040 = resources.getString(C2676.day_of_week_label_typeface);
        this.f2051 = resources.getString(C2676.sans_serif);
        int i = C2680.date_picker_text_normal;
        this.f2055 = resources.getColor(i);
        this.f2071 = resources.getColor(C2680.date_picker_text_disabled);
        this.f2049 = resources.getColor(C2680.bpBlue);
        this.f2056 = resources.getColor(C2680.bpDarker_red);
        resources.getColor(i);
        StringBuilder sb = new StringBuilder(50);
        this.f2072 = sb;
        this.f2043 = new Formatter(sb, Locale.getDefault());
        f2037 = resources.getDimensionPixelSize(C2686.day_number_size);
        f2036 = resources.getDimensionPixelSize(C2686.month_label_size);
        f2034 = resources.getDimensionPixelSize(C2686.month_day_label_text_size);
        f2035 = resources.getDimensionPixelOffset(C2686.month_list_item_header_height);
        f2038 = resources.getDimensionPixelSize(C2686.day_number_select_circle_radius);
        this.f2050 = (resources.getDimensionPixelOffset(C2686.date_picker_view_animator_height) - f2035) / 6;
        C0336 c0336 = new C0336(this);
        this.f2065 = c0336;
        C1096.m2490(this, c0336);
        C1096.m2505(this, 1);
        this.f2044 = true;
        m1120();
    }

    private String getMonthAndYearString() {
        this.f2072.setLength(0);
        long timeInMillis = this.f2047.getTimeInMillis();
        String formatter = DateUtils.formatDateRange(getContext(), this.f2043, timeInMillis, timeInMillis, 52, Time.getCurrentTimezone()).toString();
        return formatter.substring(0, 1).toUpperCase() + formatter.substring(1).toLowerCase();
    }

    public MonthAdapter.CalendarDay getAccessibilityFocus() {
        int i = this.f2065.f6473;
        if (i >= 0) {
            return new MonthAdapter.CalendarDay(this.f2063, this.f2058, i);
        }
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        canvas.drawText(getMonthAndYearString(), (this.f2069 + 0) / 2, (f2036 / 3) + ((f2035 - f2034) / 2), this.f2057);
        int i3 = f2035 - (f2034 / 2);
        int i4 = (this.f2069 - 0) / (this.f2053 * 2);
        int i5 = 0;
        while (true) {
            i = this.f2053;
            if (i5 >= i) {
                break;
            }
            this.f2045.set(7, (this.f2052 + i5) % i);
            canvas.drawText(this.f2045.getDisplayName(7, 1, Locale.getDefault()).toUpperCase(Locale.getDefault()), (((i5 * 2) + 1) * i4) + 0, i3, this.f2070);
            i5++;
        }
        int i6 = (((this.f2050 + f2037) / 2) - 1) + f2035;
        int i7 = (this.f2069 - 0) / (i * 2);
        int i8 = i6;
        int m1116 = m1116();
        int i9 = 1;
        while (i9 <= this.f2059) {
            int i10 = (((m1116 * 2) + 1) * i7) + 0;
            int i11 = this.f2050;
            int i12 = i10 - i7;
            int i13 = i10 + i7;
            int i14 = i8 - (((f2037 + i11) / 2) - 1);
            int i15 = i14 + i11;
            int i16 = (this.f2058 * 100) + (this.f2063 * 10000) + i9;
            int i17 = this.f2041;
            boolean z = (i17 < 0 || i9 <= i17) && ((i2 = this.f2067) < 0 || i9 >= i2);
            SparseArray<MonthAdapter.CalendarDay> sparseArray = this.f2054;
            int i18 = i9;
            mo1118(canvas, this.f2063, this.f2058, i9, i10, i8, i12, i13, i14, i15, sparseArray != null ? z && sparseArray.indexOfKey(i16) < 0 : z);
            int i19 = m1116 + 1;
            if (i19 == this.f2053) {
                i8 += this.f2050;
                m1116 = 0;
            } else {
                m1116 = i19;
            }
            i9 = i18 + 1;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.f2050 * this.f2062) + f2035);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        this.f2069 = i;
        this.f2065.m3040(-1, 1);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int m1117;
        if (motionEvent.getAction() == 1 && (m1117 = m1117(motionEvent.getX(), motionEvent.getY())) >= 0) {
            m1119(m1117);
        }
        return true;
    }

    @Override // android.view.View
    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        if (this.f2044) {
            return;
        }
        super.setAccessibilityDelegate(accessibilityDelegate);
    }

    public void setDisabledDays(SparseArray<MonthAdapter.CalendarDay> sparseArray) {
        this.f2054 = sparseArray;
    }

    public void setMonthParams(HashMap<String, Integer> hashMap) {
        if (!hashMap.containsKey("month") && !hashMap.containsKey("year")) {
            throw new InvalidParameterException("You must specify month and year for this view");
        }
        setTag(hashMap);
        if (hashMap.containsKey("height")) {
            int intValue = hashMap.get("height").intValue();
            this.f2050 = intValue;
            if (intValue < 10) {
                this.f2050 = 10;
            }
        }
        if (hashMap.containsKey("selected_day")) {
            this.f2048 = hashMap.get("selected_day").intValue();
        }
        if (hashMap.containsKey("range_min")) {
            this.f2067 = hashMap.get("range_min").intValue();
        }
        if (hashMap.containsKey("range_max")) {
            this.f2041 = hashMap.get("range_max").intValue();
        }
        this.f2058 = hashMap.get("month").intValue();
        this.f2063 = hashMap.get("year").intValue();
        Time time = new Time(Time.getCurrentTimezone());
        time.setToNow();
        this.f2046 = false;
        this.f2064 = -1;
        this.f2047.set(2, this.f2058);
        this.f2047.set(1, this.f2063);
        this.f2047.set(5, 1);
        this.f2068 = this.f2047.get(7);
        this.f2052 = hashMap.containsKey("week_start") ? hashMap.get("week_start").intValue() : this.f2047.getFirstDayOfWeek();
        this.f2059 = C1687.m3710(this.f2058, this.f2063);
        int i = 0;
        while (i < this.f2059) {
            i++;
            if (this.f2063 == time.year && this.f2058 == time.month && i == time.monthDay) {
                this.f2046 = true;
                this.f2064 = i;
            }
        }
        int m1116 = m1116() + this.f2059;
        int i2 = this.f2053;
        this.f2062 = (m1116 / i2) + (m1116 % i2 > 0 ? 1 : 0);
        this.f2065.m3040(-1, 1);
    }

    public void setOnDayClickListener(InterfaceC0335 interfaceC0335) {
        this.f2060 = interfaceC0335;
    }

    public void setTheme(TypedArray typedArray) {
        typedArray.getColor(C2679.BetterPickersDialogs_bpAmPmTextColor, C1067.m2405(getContext(), C2680.ampm_text_color));
        this.f2049 = typedArray.getColor(C2679.BetterPickersDialogs_bpBodySelectedTextColor, C1067.m2405(getContext(), C2680.bpBlue));
        int i = C2679.BetterPickersDialogs_bpBodyUnselectedTextColor;
        Context context = getContext();
        int i2 = C2680.date_picker_text_disabled;
        this.f2055 = typedArray.getColor(i, C1067.m2405(context, i2));
        this.f2071 = typedArray.getColor(C2679.BetterPickersDialogs_bpDisabledDayTextColor, C1067.m2405(getContext(), i2));
        this.f2056 = typedArray.getColor(C2679.BetterPickersDialogs_bpDisabledDayBackgroundColor, C1067.m2405(getContext(), C2680.bpDarker_red));
        m1120();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final int m1116() {
        int i = this.f2068;
        int i2 = this.f2052;
        if (i < i2) {
            i += this.f2053;
        }
        return i - i2;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int m1117(float f, float f2) {
        float f3 = 0;
        if (f >= f3) {
            int i = this.f2069;
            if (f <= i + 0) {
                int m1116 = ((((int) (f2 - f2035)) / this.f2050) * this.f2053) + (((int) (((f - f3) * this.f2053) / ((i - 0) - 0))) - m1116()) + 1;
                if (m1116 >= 1 && m1116 <= this.f2059) {
                    return m1116;
                }
            }
        }
        return -1;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public abstract void mo1118(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z);

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1119(int i) {
        InterfaceC0335 interfaceC0335 = this.f2060;
        if (interfaceC0335 != null) {
            MonthAdapter.CalendarDay calendarDay = new MonthAdapter.CalendarDay(this.f2063, this.f2058, i);
            MonthAdapter monthAdapter = (MonthAdapter) interfaceC0335;
            monthAdapter.getClass();
            boolean z = false;
            if (calendarDay.compareTo(((ViewOnClickListenerC2688) monthAdapter.f2024).f10160) >= 0 && calendarDay.compareTo(((ViewOnClickListenerC2688) monthAdapter.f2024).f10179) <= 0) {
                SparseArray<MonthAdapter.CalendarDay> sparseArray = ((ViewOnClickListenerC2688) monthAdapter.f2024).f10174;
                if (sparseArray != null) {
                    if (sparseArray.indexOfKey((calendarDay.f2029 * 100) + (calendarDay.f2032 * 10000) + calendarDay.f2027) >= 0) {
                        z = true;
                    }
                }
                if (!z) {
                    ((ViewOnClickListenerC2688) monthAdapter.f2024).f10182.m4651();
                    InterfaceC2694 interfaceC2694 = monthAdapter.f2024;
                    int i2 = calendarDay.f2032;
                    int i3 = calendarDay.f2029;
                    int i4 = calendarDay.f2027;
                    ViewOnClickListenerC2688 viewOnClickListenerC2688 = (ViewOnClickListenerC2688) interfaceC2694;
                    viewOnClickListenerC2688.f10175.set(1, i2);
                    viewOnClickListenerC2688.f10175.set(2, i3);
                    viewOnClickListenerC2688.f10175.set(5, i4);
                    viewOnClickListenerC2688.m4653();
                    viewOnClickListenerC2688.m4654(true);
                    monthAdapter.f2026 = calendarDay;
                    monthAdapter.notifyDataSetChanged();
                }
            }
        }
        this.f2065.m3038(i, 1);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m1120() {
        Paint paint = new Paint();
        this.f2057 = paint;
        paint.setFakeBoldText(true);
        this.f2057.setAntiAlias(true);
        this.f2057.setTextSize(f2036);
        this.f2057.setTypeface(Typeface.create(this.f2051, 1));
        this.f2057.setColor(this.f2055);
        this.f2057.setTextAlign(Paint.Align.CENTER);
        this.f2057.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f2061 = paint2;
        paint2.setFakeBoldText(true);
        this.f2061.setAntiAlias(true);
        this.f2061.setTextAlign(Paint.Align.CENTER);
        this.f2061.setStyle(Paint.Style.FILL);
        Paint paint3 = new Paint();
        this.f2042 = paint3;
        paint3.setFakeBoldText(true);
        this.f2042.setAntiAlias(true);
        this.f2042.setColor(this.f2049);
        this.f2042.setTextAlign(Paint.Align.CENTER);
        this.f2042.setStyle(Paint.Style.FILL);
        this.f2042.setAlpha(60);
        Paint paint4 = new Paint();
        this.f2039 = paint4;
        paint4.setFakeBoldText(true);
        this.f2039.setAntiAlias(true);
        this.f2039.setColor(this.f2056);
        this.f2039.setTextAlign(Paint.Align.CENTER);
        this.f2039.setStyle(Paint.Style.FILL);
        this.f2039.setAlpha(60);
        Paint paint5 = new Paint();
        this.f2070 = paint5;
        paint5.setAntiAlias(true);
        this.f2070.setTextSize(f2034);
        this.f2070.setColor(this.f2055);
        this.f2070.setTypeface(Typeface.create(this.f2040, 0));
        this.f2070.setStyle(Paint.Style.FILL);
        this.f2070.setTextAlign(Paint.Align.CENTER);
        this.f2070.setFakeBoldText(true);
        Paint paint6 = new Paint();
        this.f2066 = paint6;
        paint6.setAntiAlias(true);
        this.f2066.setTextSize(f2037);
        this.f2066.setStyle(Paint.Style.FILL);
        this.f2066.setTextAlign(Paint.Align.CENTER);
        this.f2066.setFakeBoldText(false);
    }
}
