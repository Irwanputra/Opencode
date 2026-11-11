package p131.p161.p162.p163.p166;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.C1037;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.C1109;
import p131.p161.p162.p163.C2110;
import p131.p161.p162.p163.C2248;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.p166.C2132;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.へぬ〴づぞ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2139 extends RecyclerView.AbstractC0228<C2140> {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final CalendarConstraints f8978;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C2132.InterfaceC2137 f8979;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f8980;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final DateSelector<?> f8981;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.へぬ〴づぞ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2140 extends RecyclerView.AbstractC0207 {

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public final TextView f8982;

        /* renamed from: ざっざへづ, reason: contains not printable characters */
        public final MaterialCalendarGridView f8983;

        public C2140(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C2248.month_title);
            this.f8982 = textView;
            AtomicInteger atomicInteger = C1096.f5578;
            C1109 c1109 = new C1109(C1037.tag_accessibility_heading, Boolean.class, 28);
            Boolean bool = Boolean.TRUE;
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                c1109.m2543(textView, bool);
            } else {
                if ((i >= 19) && c1109.m2542(c1109.m2523(textView), bool)) {
                    C1102 m2479 = C1096.m2479(textView);
                    C1096.m2490(textView, m2479 == null ? new C1102() : m2479);
                    textView.setTag(c1109.f5585, bool);
                    C1096.m2487(textView, 0);
                }
            }
            this.f8983 = (MaterialCalendarGridView) linearLayout.findViewById(C2248.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public C2139(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C2132.InterfaceC2137 interfaceC2137) {
        Month month = calendarConstraints.f3242;
        Month month2 = calendarConstraints.f3244;
        Month month3 = calendarConstraints.f3247;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i = C2128.f8950;
        int i2 = C2132.f8959;
        Resources resources = context.getResources();
        int i3 = C2324.mtrl_calendar_day_height;
        this.f8980 = (i * resources.getDimensionPixelSize(i3)) + (C2142.m4229(context) ? context.getResources().getDimensionPixelSize(i3) : 0);
        this.f8978 = calendarConstraints;
        this.f8981 = dateSelector;
        this.f8979 = interfaceC2137;
        if (this.f1556.m811()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f1555 = true;
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int m4227(Month month) {
        return this.f8978.f3242.m1409(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: 〺つふすそ */
    public long mo886(int i) {
        return this.f8978.f3242.m1406(i).f3249.getTimeInMillis();
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Month m4228(int i) {
        return this.f8978.f3242.m1406(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: げつ〴ぬぐ */
    public int mo888() {
        return this.f8978.f3243;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: づざかべべ */
    public C2140 mo889(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C2110.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C2142.m4229(viewGroup.getContext())) {
            return new C2140(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.f8980));
        return new C2140(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: びぐびあび */
    public void mo891(C2140 c2140, int i) {
        C2140 c21402 = c2140;
        Month m1406 = this.f8978.f3242.m1406(i);
        c21402.f8982.setText(m1406.f3251);
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c21402.f8983.findViewById(C2248.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !m1406.equals(materialCalendarGridView.getAdapter().f8951)) {
            C2128 c2128 = new C2128(m1406, this.f8981, this.f8978);
            materialCalendarGridView.setNumColumns(m1406.f3253);
            materialCalendarGridView.setAdapter((ListAdapter) c2128);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C2130(this, materialCalendarGridView));
    }
}
