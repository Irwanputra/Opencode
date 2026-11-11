package p131.p161.p162.p163.p166;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import p131.p161.p162.p163.p166.C2132;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.ごづごきえ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC2123 implements View.OnClickListener {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final /* synthetic */ int f8940;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final /* synthetic */ C2124 f8941;

    public ViewOnClickListenerC2123(C2124 c2124, int i) {
        this.f8941 = c2124;
        this.f8940 = i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = this.f8940;
        int i2 = this.f8941.f8942.f8965.f3254;
        Calendar m4222 = C2131.m4222();
        m4222.set(1, i);
        m4222.set(2, i2);
        Month month = new Month(m4222);
        CalendarConstraints calendarConstraints = this.f8941.f8942.f8961;
        if (month.compareTo(calendarConstraints.f3242) < 0) {
            month = calendarConstraints.f3242;
        } else if (month.compareTo(calendarConstraints.f3244) > 0) {
            month = calendarConstraints.f3244;
        }
        this.f8941.f8942.m4226(month);
        this.f8941.f8942.m4223(C2132.EnumC2136.DAY);
    }
}
