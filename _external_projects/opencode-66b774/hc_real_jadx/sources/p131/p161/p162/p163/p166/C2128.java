package p131.p161.p162.p163.p166;

import android.widget.BaseAdapter;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.てぜきぽく, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2128 extends BaseAdapter {

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static final int f8950 = C2131.m4222().getMaximum(4);

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Month f8951;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final DateSelector<?> f8952;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final CalendarConstraints f8953;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public C2114 f8954;

    public C2128(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f8951 = month;
        this.f8952 = dateSelector;
        this.f8953 = calendarConstraints;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return m4217() + this.f8951.f3250;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f8951.f3253;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011b  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p131.p161.p162.p163.p166.C2128.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.Adapter
    /* renamed from: 〺つふすそ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.f8951.m1407() || i > m4216()) {
            return null;
        }
        Month month = this.f8951;
        int m1407 = (i - month.m1407()) + 1;
        Calendar m4220 = C2131.m4220(month.f3249);
        m4220.set(5, m1407);
        return Long.valueOf(m4220.getTimeInMillis());
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int m4216() {
        return (this.f8951.m1407() + this.f8951.f3250) - 1;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public int m4217() {
        return this.f8951.m1407();
    }
}
