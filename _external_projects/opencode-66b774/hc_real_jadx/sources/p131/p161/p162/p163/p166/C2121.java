package p131.p161.p162.p163.p166;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p131.p161.p162.p163.C2110;
import p131.p161.p162.p163.C2144;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2121 extends BaseAdapter {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static final int f8930;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Calendar f8931;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f8932;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f8933;

    static {
        f8930 = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C2121() {
        Calendar m4222 = C2131.m4222();
        this.f8931 = m4222;
        this.f8932 = m4222.getMaximum(7);
        this.f8933 = m4222.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f8932;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        int i2 = this.f8932;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f8933;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2110.mtrl_calendar_day_of_week, viewGroup, false);
        }
        Calendar calendar = this.f8931;
        int i2 = i + this.f8933;
        int i3 = this.f8932;
        if (i2 > i3) {
            i2 -= i3;
        }
        calendar.set(7, i2);
        textView.setText(this.f8931.getDisplayName(7, f8930, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C2144.mtrl_picker_day_of_week_column_header), this.f8931.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
