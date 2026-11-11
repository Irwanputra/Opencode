package com.codetroopers.betterpickers.calendardatepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.app.NotificationCompat;
import com.codetroopers.betterpickers.calendardatepicker.MonthAdapter;
import com.codetroopers.betterpickers.calendardatepicker.MonthView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import p034.p095.C1687;
import p131.p221.p222.p224.InterfaceC2694;
import p131.p221.p222.p224.RunnableC2693;
import p131.p221.p222.p224.ViewOnClickListenerC2688;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class DayPickerView extends ListView implements AbsListView.OnScrollListener, ViewOnClickListenerC2688.InterfaceC2690 {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final SimpleDateFormat f2010 = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2011;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f2012;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2013;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f2014;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public Handler f2015;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public MonthAdapter f2016;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public MonthAdapter.CalendarDay f2017;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public MonthAdapter.CalendarDay f2018;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public InterfaceC2694 f2019;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public RunnableC0333 f2020;

    /* renamed from: com.codetroopers.betterpickers.calendardatepicker.DayPickerView$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC0333 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2021;

        public RunnableC0333() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DayPickerView dayPickerView;
            int i;
            DayPickerView.this.f2011 = this.f2021;
            if (Log.isLoggable("MonthFragment", 3)) {
                int i2 = DayPickerView.this.f2013;
            }
            int i3 = this.f2021;
            if (i3 == 0 && (i = (dayPickerView = DayPickerView.this).f2013) != 0) {
                if (i != 1) {
                    dayPickerView.f2013 = i3;
                    View childAt = dayPickerView.getChildAt(0);
                    int i4 = 0;
                    while (childAt != null && childAt.getBottom() <= 0) {
                        i4++;
                        childAt = DayPickerView.this.getChildAt(i4);
                    }
                    if (childAt == null) {
                        return;
                    }
                    boolean z = (DayPickerView.this.getFirstVisiblePosition() == 0 || DayPickerView.this.getLastVisiblePosition() == DayPickerView.this.getCount() - 1) ? false : true;
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int height = DayPickerView.this.getHeight() / 2;
                    if (!z || top >= -1) {
                        return;
                    }
                    if (bottom > height) {
                        DayPickerView.this.smoothScrollBy(top, 250);
                        return;
                    } else {
                        DayPickerView.this.smoothScrollBy(bottom, 250);
                        return;
                    }
                }
            }
            DayPickerView.this.f2013 = i3;
        }
    }

    public DayPickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2012 = 1.0f;
        this.f2018 = new MonthAdapter.CalendarDay();
        this.f2017 = new MonthAdapter.CalendarDay();
        this.f2013 = 0;
        this.f2011 = 0;
        this.f2020 = new RunnableC0333();
        m1112(context);
    }

    public DayPickerView(Context context, InterfaceC2694 interfaceC2694) {
        super(context);
        this.f2012 = 1.0f;
        this.f2018 = new MonthAdapter.CalendarDay();
        this.f2017 = new MonthAdapter.CalendarDay();
        this.f2013 = 0;
        this.f2011 = 0;
        this.f2020 = new RunnableC0333();
        m1112(context);
        setController(interfaceC2694);
    }

    public int getMostVisiblePosition() {
        int firstVisiblePosition = getFirstVisiblePosition();
        int height = getHeight();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < height) {
            View childAt = getChildAt(i2);
            if (childAt == null) {
                break;
            }
            int bottom = childAt.getBottom();
            int min = Math.min(bottom, height) - Math.max(0, childAt.getTop());
            if (min > i3) {
                i4 = i2;
                i3 = min;
            }
            i2++;
            i = bottom;
        }
        return firstVisiblePosition + i4;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        MonthAdapter.CalendarDay calendarDay;
        boolean z;
        int i;
        MonthView monthView;
        MonthView.C0336 c0336;
        int i2;
        int childCount = getChildCount();
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                calendarDay = null;
                break;
            }
            View childAt = getChildAt(i3);
            if (!(childAt instanceof MonthView) || (calendarDay = (monthView = (MonthView) childAt).getAccessibilityFocus()) == null) {
                i3++;
            } else if (Build.VERSION.SDK_INT == 17 && (i2 = (c0336 = monthView.f2065).f6473) != Integer.MIN_VALUE) {
                c0336.mo2529(MonthView.this).mo2473(i2, NotificationCompat.FLAG_HIGH_PRIORITY, null);
            }
        }
        super.layoutChildren();
        if (this.f2014) {
            this.f2014 = false;
            return;
        }
        if (calendarDay == null) {
            return;
        }
        int childCount2 = getChildCount();
        for (int i4 = 0; i4 < childCount2; i4++) {
            View childAt2 = getChildAt(i4);
            if (childAt2 instanceof MonthView) {
                MonthView monthView2 = (MonthView) childAt2;
                monthView2.getClass();
                if (calendarDay.f2032 == monthView2.f2063 && calendarDay.f2029 == monthView2.f2058 && (i = calendarDay.f2027) <= monthView2.f2059) {
                    MonthView.C0336 c03362 = monthView2.f2065;
                    c03362.mo2529(MonthView.this).mo2473(i, 64, null);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setItemCount(-1);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(NotificationCompat.FLAG_BUBBLE);
        accessibilityNodeInfo.addAction(8192);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        MonthView monthView = (MonthView) absListView.getChildAt(0);
        if (monthView == null) {
            return;
        }
        absListView.getFirstVisiblePosition();
        monthView.getHeight();
        monthView.getBottom();
        this.f2013 = this.f2011;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
        RunnableC0333 runnableC0333 = this.f2020;
        DayPickerView.this.f2015.removeCallbacks(runnableC0333);
        runnableC0333.f2021 = i;
        DayPickerView.this.f2015.postDelayed(runnableC0333, 40L);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        View childAt;
        int i2;
        if (i != 4096 && i != 8192) {
            return super.performAccessibilityAction(i, bundle);
        }
        int firstVisiblePosition = getFirstVisiblePosition();
        MonthAdapter.CalendarDay calendarDay = new MonthAdapter.CalendarDay((firstVisiblePosition / 12) + ((ViewOnClickListenerC2688) this.f2019).f10160.f2032, firstVisiblePosition % 12, 1);
        if (i == 4096) {
            int i3 = calendarDay.f2029 + 1;
            calendarDay.f2029 = i3;
            if (i3 == 12) {
                calendarDay.f2029 = 0;
                i2 = calendarDay.f2032 + 1;
                calendarDay.f2032 = i2;
            }
            Calendar calendar = Calendar.getInstance();
            calendar.set(calendarDay.f2032, calendarDay.f2029, calendarDay.f2027);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(calendar.getDisplayName(2, 2, Locale.getDefault()));
            stringBuffer.append(" ");
            stringBuffer.append(f2010.format(calendar.getTime()));
            C1687.m3657(this, stringBuffer.toString());
            m1110(calendarDay, true, false, true);
            this.f2014 = true;
            return true;
        }
        if (i == 8192 && (childAt = getChildAt(0)) != null && childAt.getTop() >= -1) {
            int i4 = calendarDay.f2029 - 1;
            calendarDay.f2029 = i4;
            if (i4 == -1) {
                calendarDay.f2029 = 11;
                i2 = calendarDay.f2032 - 1;
                calendarDay.f2032 = i2;
            }
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendarDay.f2032, calendarDay.f2029, calendarDay.f2027);
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(calendar2.getDisplayName(2, 2, Locale.getDefault()));
        stringBuffer2.append(" ");
        stringBuffer2.append(f2010.format(calendar2.getTime()));
        C1687.m3657(this, stringBuffer2.toString());
        m1110(calendarDay, true, false, true);
        this.f2014 = true;
        return true;
    }

    public void setController(InterfaceC2694 interfaceC2694) {
        this.f2019 = interfaceC2694;
        ((ViewOnClickListenerC2688) interfaceC2694).f10166.add(this);
        MonthAdapter monthAdapter = this.f2016;
        if (monthAdapter == null) {
            this.f2016 = mo1109(getContext(), this.f2019);
        } else {
            monthAdapter.f2026 = this.f2018;
            monthAdapter.notifyDataSetChanged();
        }
        setAdapter((ListAdapter) this.f2016);
        mo1111();
    }

    public void setMonthDisplayed(MonthAdapter.CalendarDay calendarDay) {
        int i = calendarDay.f2029;
        invalidateViews();
    }

    public void setTheme(TypedArray typedArray) {
        MonthAdapter monthAdapter = this.f2016;
        if (monthAdapter != null) {
            monthAdapter.f2025 = typedArray;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public abstract MonthAdapter mo1109(Context context, InterfaceC2694 interfaceC2694);

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean m1110(MonthAdapter.CalendarDay calendarDay, boolean z, boolean z2, boolean z3) {
        int i;
        View childAt;
        if (z2) {
            MonthAdapter.CalendarDay calendarDay2 = this.f2018;
            calendarDay2.getClass();
            calendarDay2.f2032 = calendarDay.f2032;
            calendarDay2.f2029 = calendarDay.f2029;
            calendarDay2.f2027 = calendarDay.f2027;
        }
        MonthAdapter.CalendarDay calendarDay3 = this.f2017;
        calendarDay3.getClass();
        calendarDay3.f2032 = calendarDay.f2032;
        calendarDay3.f2029 = calendarDay.f2029;
        calendarDay3.f2027 = calendarDay.f2027;
        int i2 = calendarDay.f2032;
        MonthAdapter.CalendarDay calendarDay4 = ((ViewOnClickListenerC2688) this.f2019).f10160;
        int i3 = (calendarDay.f2029 - calendarDay4.f2029) + ((i2 - calendarDay4.f2032) * 12);
        while (true) {
            int i4 = i + 1;
            childAt = getChildAt(i);
            i = (childAt != null && childAt.getTop() < 0) ? i4 : 0;
        }
        int positionForView = childAt != null ? getPositionForView(childAt) : 0;
        if (z2) {
            MonthAdapter monthAdapter = this.f2016;
            monthAdapter.f2026 = this.f2018;
            monthAdapter.notifyDataSetChanged();
        }
        if (i3 != positionForView || z3) {
            setMonthDisplayed(this.f2017);
            this.f2013 = 2;
            if (z) {
                smoothScrollToPositionFromTop(i3, -1, 250);
                return true;
            }
            clearFocus();
            post(new RunnableC2693(this, i3));
            onScrollStateChanged(this, 0);
        } else if (z2) {
            setMonthDisplayed(this.f2018);
        }
        return false;
    }

    @Override // p131.p221.p222.p224.ViewOnClickListenerC2688.InterfaceC2690
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void mo1111() {
        m1110(((ViewOnClickListenerC2688) this.f2019).m4655(), false, true, true);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m1112(Context context) {
        this.f2015 = new Handler();
        setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        setDrawSelectorOnTop(false);
        setCacheColorHint(0);
        setDivider(null);
        setItemsCanFocus(true);
        setFastScrollEnabled(false);
        setVerticalScrollBarEnabled(false);
        setOnScrollListener(this);
        setFadingEdgeLength(0);
        setFriction(ViewConfiguration.getScrollFriction() * this.f2012);
    }
}
