package com.codetroopers.betterpickers.calendardatepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.Time;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import com.codetroopers.betterpickers.calendardatepicker.MonthView;
import java.util.Calendar;
import java.util.HashMap;
import p131.p221.p222.p224.InterfaceC2694;
import p131.p221.p222.p224.ViewOnClickListenerC2688;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class MonthAdapter extends BaseAdapter implements MonthView.InterfaceC0335 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Context f2023;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final InterfaceC2694 f2024;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public TypedArray f2025;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public CalendarDay f2026;

    public static class CalendarDay implements Comparable<CalendarDay>, Parcelable {
        public static final Parcelable.Creator<CalendarDay> CREATOR = new C0334();

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public int f2027;

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public Calendar f2028;

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public int f2029;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public long f2030;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public long f2031;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f2032;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Time f2033;

        /* renamed from: com.codetroopers.betterpickers.calendardatepicker.MonthAdapter$CalendarDay$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0334 implements Parcelable.Creator<CalendarDay> {
            @Override // android.os.Parcelable.Creator
            public CalendarDay createFromParcel(Parcel parcel) {
                return new CalendarDay(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CalendarDay[] newArray(int i) {
                return new CalendarDay[i];
            }
        }

        public CalendarDay() {
            m1113(System.currentTimeMillis());
        }

        public CalendarDay(int i, int i2, int i3) {
            Calendar calendar = Calendar.getInstance();
            this.f2028 = calendar;
            calendar.set(i, i2, i3, 0, 0, 0);
            this.f2028.set(14, 0);
            this.f2032 = this.f2028.get(1);
            this.f2029 = this.f2028.get(2);
            this.f2027 = this.f2028.get(5);
        }

        public CalendarDay(long j) {
            m1113(j);
        }

        public CalendarDay(Parcel parcel) {
            this.f2030 = parcel.readLong();
            Calendar calendar = Calendar.getInstance();
            this.f2028 = calendar;
            calendar.setTimeInMillis(this.f2030);
            this.f2031 = parcel.readLong();
            Time time = new Time();
            this.f2033 = time;
            time.set(this.f2031);
            this.f2032 = parcel.readInt();
            this.f2029 = parcel.readInt();
            this.f2027 = parcel.readInt();
        }

        public CalendarDay(Calendar calendar) {
            this.f2032 = calendar.get(1);
            this.f2029 = calendar.get(2);
            this.f2027 = calendar.get(5);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Calendar calendar = this.f2028;
            if (calendar != null) {
                this.f2030 = calendar.getTimeInMillis();
            }
            parcel.writeLong(this.f2030);
            Time time = this.f2033;
            if (time != null) {
                this.f2031 = time.toMillis(false);
            }
            parcel.writeInt(this.f2032);
            parcel.writeInt(this.f2029);
            parcel.writeInt(this.f2027);
        }

        /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
        public final void m1113(long j) {
            if (this.f2028 == null) {
                this.f2028 = Calendar.getInstance();
            }
            this.f2028.setTimeInMillis(j);
            this.f2029 = this.f2028.get(2);
            this.f2032 = this.f2028.get(1);
            this.f2027 = this.f2028.get(5);
        }

        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public long m1114() {
            if (this.f2028 == null) {
                Calendar calendar = Calendar.getInstance();
                this.f2028 = calendar;
                calendar.set(this.f2032, this.f2029, this.f2027, 0, 0, 0);
                this.f2028.set(14, 0);
            }
            return this.f2028.getTimeInMillis();
        }

        @Override // java.lang.Comparable
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public int compareTo(CalendarDay calendarDay) {
            int i = this.f2032;
            int i2 = calendarDay.f2032;
            if (i < i2) {
                return -1;
            }
            if (i == i2 && this.f2029 < calendarDay.f2029) {
                return -1;
            }
            if (i == i2 && this.f2029 == calendarDay.f2029 && this.f2027 < calendarDay.f2027) {
                return -1;
            }
            return (i == i2 && this.f2029 == calendarDay.f2029 && this.f2027 == calendarDay.f2027) ? 0 : 1;
        }
    }

    public MonthAdapter(Context context, InterfaceC2694 interfaceC2694) {
        this.f2023 = context;
        this.f2024 = interfaceC2694;
        CalendarDay calendarDay = new CalendarDay(System.currentTimeMillis());
        this.f2026 = calendarDay;
        ViewOnClickListenerC2688 viewOnClickListenerC2688 = (ViewOnClickListenerC2688) interfaceC2694;
        if (calendarDay.compareTo(viewOnClickListenerC2688.f10179) > 0) {
            this.f2026 = viewOnClickListenerC2688.f10179;
        }
        if (this.f2026.compareTo(viewOnClickListenerC2688.f10160) < 0) {
            this.f2026 = viewOnClickListenerC2688.f10160;
        }
        this.f2026 = viewOnClickListenerC2688.m4655();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        InterfaceC2694 interfaceC2694 = this.f2024;
        return ((((((ViewOnClickListenerC2688) interfaceC2694).f10179.f2032 - ((ViewOnClickListenerC2688) interfaceC2694).f10160.f2032) + 1) * 12) - (11 - ((ViewOnClickListenerC2688) interfaceC2694).f10179.f2029)) - ((ViewOnClickListenerC2688) interfaceC2694).f10160.f2029;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"NewApi"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        HashMap<String, Integer> hashMap;
        MonthView monthView;
        if (view != null) {
            monthView = (MonthView) view;
            hashMap = (HashMap) monthView.getTag();
        } else {
            SimpleMonthView simpleMonthView = new SimpleMonthView(this.f2023);
            simpleMonthView.setTheme(this.f2025);
            simpleMonthView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
            simpleMonthView.setClickable(true);
            simpleMonthView.setOnDayClickListener(this);
            hashMap = null;
            monthView = simpleMonthView;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        hashMap.clear();
        InterfaceC2694 interfaceC2694 = this.f2024;
        int i2 = (((ViewOnClickListenerC2688) interfaceC2694).f10160.f2029 + i) % 12;
        int i3 = ((i + ((ViewOnClickListenerC2688) interfaceC2694).f10160.f2029) / 12) + ((ViewOnClickListenerC2688) interfaceC2694).f10160.f2032;
        CalendarDay calendarDay = this.f2026;
        int i4 = calendarDay.f2032 == i3 && calendarDay.f2029 == i2 ? calendarDay.f2027 : -1;
        CalendarDay calendarDay2 = ((ViewOnClickListenerC2688) interfaceC2694).f10160;
        int i5 = calendarDay2.f2032 == i3 && calendarDay2.f2029 == i2 ? ((ViewOnClickListenerC2688) interfaceC2694).f10160.f2027 : -1;
        CalendarDay calendarDay3 = ((ViewOnClickListenerC2688) interfaceC2694).f10179;
        int i6 = calendarDay3.f2032 == i3 && calendarDay3.f2029 == i2 ? ((ViewOnClickListenerC2688) interfaceC2694).f10179.f2027 : -1;
        monthView.f2062 = 6;
        monthView.requestLayout();
        InterfaceC2694 interfaceC26942 = this.f2024;
        if (((ViewOnClickListenerC2688) interfaceC26942).f10174 != null) {
            monthView.setDisabledDays(((ViewOnClickListenerC2688) interfaceC26942).f10174);
        }
        hashMap.put("selected_day", Integer.valueOf(i4));
        hashMap.put("year", Integer.valueOf(i3));
        hashMap.put("month", Integer.valueOf(i2));
        hashMap.put("week_start", Integer.valueOf(((ViewOnClickListenerC2688) this.f2024).f10171));
        hashMap.put("range_min", Integer.valueOf(i5));
        hashMap.put("range_max", Integer.valueOf(i6));
        monthView.setMonthParams(hashMap);
        monthView.invalidate();
        return monthView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
