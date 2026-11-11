package p131.p161.p162.p163.p166;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p131.p161.p162.p163.C2110;
import p131.p161.p162.p163.C2144;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.ざっざへづ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C2124 extends RecyclerView.AbstractC0228<C2125> {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2132<?> f8942;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.ざっざへづ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C2125 extends RecyclerView.AbstractC0207 {

        /* renamed from: ごづごきえ, reason: contains not printable characters */
        public final TextView f8943;

        public C2125(TextView textView) {
            super(textView);
            this.f8943 = textView;
        }
    }

    public C2124(C2132<?> c2132) {
        this.f8942 = c2132;
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int m4214(int i) {
        return i - this.f8942.f8961.f3242.f3252;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: げつ〴ぬぐ */
    public int mo888() {
        return this.f8942.f8961.f3246;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: づざかべべ */
    public C2125 mo889(ViewGroup viewGroup, int i) {
        return new C2125((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C2110.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0228
    /* renamed from: びぐびあび */
    public void mo891(C2125 c2125, int i) {
        C2125 c21252 = c2125;
        int i2 = this.f8942.f8961.f3242.f3252 + i;
        String string = c21252.f8943.getContext().getString(C2144.mtrl_picker_navigate_to_year_description);
        c21252.f8943.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        c21252.f8943.setContentDescription(String.format(string, Integer.valueOf(i2)));
        C2114 c2114 = this.f8942.f8963;
        Calendar m4219 = C2131.m4219();
        C2122 c2122 = m4219.get(1) == i2 ? c2114.f8922 : c2114.f8923;
        Iterator<Long> it = this.f8942.f8966.m1401().iterator();
        while (it.hasNext()) {
            m4219.setTimeInMillis(it.next().longValue());
            if (m4219.get(1) == i2) {
                c2122 = c2114.f8921;
            }
        }
        c2122.m4213(c21252.f8943);
        c21252.f8943.setOnClickListener(new ViewOnClickListenerC2123(this, i2));
    }
}
