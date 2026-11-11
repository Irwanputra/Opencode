package p131.p161.p162.p163.p166;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.Month;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p065.p066.C1376;
import p131.p161.p162.p163.C2110;
import p131.p161.p162.p163.C2143;
import p131.p161.p162.p163.C2248;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.びぐびあび, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2132<S> extends AbstractC2117<S> {

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public static final /* synthetic */ int f8959 = 0;

    /* renamed from: 〱かけばぜぐ, reason: contains not printable characters */
    public View f8960;

    /* renamed from: 〱こか〺ぃせ, reason: contains not printable characters */
    public CalendarConstraints f8961;

    /* renamed from: 〴ねぷぐくぼ, reason: contains not printable characters */
    public RecyclerView f8962;

    /* renamed from: かづげぃぁ〺, reason: contains not printable characters */
    public C2114 f8963;

    /* renamed from: ぎきぁ〱ぢ, reason: contains not printable characters */
    public View f8964;

    /* renamed from: くぎぶ〼のそ, reason: contains not printable characters */
    public Month f8965;

    /* renamed from: くねねぱす〻, reason: contains not printable characters */
    public DateSelector<S> f8966;

    /* renamed from: ずまげせび〳, reason: contains not printable characters */
    public EnumC2136 f8967;

    /* renamed from: のね〱ばぁぢ, reason: contains not printable characters */
    public int f8968;

    /* renamed from: はつきどっ, reason: contains not printable characters */
    public RecyclerView f8969;

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.びぐびあび$〺つふすそ, reason: contains not printable characters */
    public class C2133 extends C1102 {
        public C2133(C2132 c2132) {
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            c1084.m2456(null);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.びぐびあび$くし〴〺ぅ, reason: contains not printable characters */
    public class C2134 extends C2118 {

        /* renamed from: ぉひのべい, reason: contains not printable characters */
        public final /* synthetic */ int f8970;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2134(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f8970 = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: 〻だくけはく */
        public void mo634(RecyclerView.C0224 c0224, int[] iArr) {
            if (this.f8970 == 0) {
                iArr[0] = C2132.this.f8969.getWidth();
                iArr[1] = C2132.this.f8969.getWidth();
            } else {
                iArr[0] = C2132.this.f8969.getHeight();
                iArr[1] = C2132.this.f8969.getHeight();
            }
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.びぐびあび$げつ〴ぬぐ, reason: contains not printable characters */
    public class RunnableC2135 implements Runnable {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public final /* synthetic */ int f8972;

        public RunnableC2135(int i) {
            this.f8972 = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2132.this.f8969.m745(this.f8972);
        }
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.びぐびあび$づざかべべ, reason: contains not printable characters */
    public enum EnumC2136 {
        DAY,
        YEAR
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.びぐびあび$なぎぱいぢぎ, reason: contains not printable characters */
    public interface InterfaceC2137 {
    }

    /* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.びぐびあび$びぐびあび, reason: contains not printable characters */
    public class C2138 implements InterfaceC2137 {
        public C2138() {
        }
    }

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public void m4223(EnumC2136 enumC2136) {
        this.f8967 = enumC2136;
        if (enumC2136 == EnumC2136.YEAR) {
            this.f8962.getLayoutManager().mo672(((C2124) this.f8962.getAdapter()).m4214(this.f8965.f3252));
            this.f8960.setVisibility(0);
            this.f8964.setVisibility(8);
        } else if (enumC2136 == EnumC2136.DAY) {
            this.f8960.setVisibility(8);
            this.f8964.setVisibility(0);
            m4226(this.f8965);
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: えがぐせほち */
    public void mo489(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f8968);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f8966);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f8961);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f8965);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: けときぜと */
    public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m484(), this.f8968);
        this.f8963 = new C2114(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f8961.f3242;
        if (C2142.m4229(contextThemeWrapper)) {
            i = C2110.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C2110.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C2248.mtrl_calendar_days_of_week);
        C1096.m2490(gridView, new C2133(this));
        gridView.setAdapter((ListAdapter) new C2121());
        gridView.setNumColumns(month.f3253);
        gridView.setEnabled(false);
        this.f8969 = (RecyclerView) inflate.findViewById(C2248.mtrl_calendar_months);
        this.f8969.setLayoutManager(new C2134(m484(), i2, false, i2));
        this.f8969.setTag("MONTHS_VIEW_GROUP_TAG");
        C2139 c2139 = new C2139(contextThemeWrapper, this.f8966, this.f8961, new C2138());
        this.f8969.setAdapter(c2139);
        int integer = contextThemeWrapper.getResources().getInteger(C2143.mtrl_calendar_year_selector_span);
        int i3 = C2248.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(i3);
        this.f8962 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f8962.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f8962.setAdapter(new C2124(this));
            this.f8962.m697(new C2127(this));
        }
        int i4 = C2248.month_navigation_fragment_toggle;
        if (inflate.findViewById(i4) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i4);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C1096.m2490(materialButton, new C2129(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(C2248.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(C2248.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f8960 = inflate.findViewById(i3);
            this.f8964 = inflate.findViewById(C2248.mtrl_calendar_day_selector_frame);
            m4223(EnumC2136.DAY);
            materialButton.setText(this.f8965.f3251);
            this.f8969.m693(new C2115(this, c2139, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC2113(this));
            materialButton3.setOnClickListener(new ViewOnClickListenerC2141(this, c2139));
            materialButton2.setOnClickListener(new ViewOnClickListenerC2116(this, c2139));
        }
        if (!C2142.m4229(contextThemeWrapper)) {
            new C1376().m3099(this.f8969);
        }
        this.f8969.m713(c2139.m4227(this.f8965));
        return inflate;
    }

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public final void m4224(int i) {
        this.f8969.post(new RunnableC2135(i));
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: せづっ〸ちね */
    public void mo510(Bundle bundle) {
        super.mo510(bundle);
        if (bundle == null) {
            bundle = this.f1176;
        }
        this.f8968 = bundle.getInt("THEME_RES_ID_KEY");
        this.f8966 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f8961 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f8965 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public LinearLayoutManager m4225() {
        return (LinearLayoutManager) this.f8969.getLayoutManager();
    }

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public void m4226(Month month) {
        RecyclerView recyclerView;
        int i;
        C2139 c2139 = (C2139) this.f8969.getAdapter();
        int m1409 = c2139.f8978.f3242.m1409(month);
        int m4227 = m1409 - c2139.m4227(this.f8965);
        boolean z = Math.abs(m4227) > 3;
        boolean z2 = m4227 > 0;
        this.f8965 = month;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.f8969;
                i = m1409 + 3;
            }
            m4224(m1409);
        }
        recyclerView = this.f8969;
        i = m1409 - 3;
        recyclerView.m713(i);
        m4224(m1409);
    }
}
