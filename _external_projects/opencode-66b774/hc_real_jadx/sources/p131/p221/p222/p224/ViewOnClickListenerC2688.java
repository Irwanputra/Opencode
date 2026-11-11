package p131.p221.p222.p224;

import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.format.DateUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.codetroopers.betterpickers.calendardatepicker.AccessibleDateAnimator;
import com.codetroopers.betterpickers.calendardatepicker.DayPickerView;
import com.codetroopers.betterpickers.calendardatepicker.MonthAdapter;
import com.codetroopers.betterpickers.calendardatepicker.SimpleDayPickerView;
import com.codetroopers.betterpickers.calendardatepicker.YearPickerView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import p034.p035.p043.C1067;
import p034.p095.C1687;
import p034.p105.p106.DialogInterfaceOnCancelListenerC1781;
import p131.p145.p149.C2073;
import p131.p221.p222.C2676;
import p131.p221.p222.C2678;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2681;
import p131.p221.p222.C2685;
import p131.p221.p222.C2687;
import p131.p221.p222.InterfaceC2677;
import team.dev.epro.apkcustom.dialogs.RequestBlock;

/* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.ぺふねづ〺.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class ViewOnClickListenerC2688 extends DialogInterfaceOnCancelListenerC1781 implements View.OnClickListener, InterfaceC2694 {

    /* renamed from: 〱〴なぱへて, reason: contains not printable characters */
    public String f10158;

    /* renamed from: 〱〵つてう, reason: contains not printable characters */
    public boolean f10159;

    /* renamed from: 〺〲に〼へ〸, reason: contains not printable characters */
    public MonthAdapter.CalendarDay f10160;

    /* renamed from: 〺えなひあ, reason: contains not printable characters */
    public String f10161;

    /* renamed from: ぁないぼぎへ, reason: contains not printable characters */
    public TextView f10162;

    /* renamed from: ぁにあがあ, reason: contains not printable characters */
    public String f10163;

    /* renamed from: いたぷすいだ, reason: contains not printable characters */
    public String f10164;

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public DayPickerView f10165;

    /* renamed from: ぇいうげ〱〹, reason: contains not printable characters */
    public HashSet<InterfaceC2690> f10166;

    /* renamed from: えみにぃほす, reason: contains not printable characters */
    public int f10167;

    /* renamed from: ぉねぞはがぞ, reason: contains not printable characters */
    public LinearLayout f10168;

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public int f10169;

    /* renamed from: きぬどぼみ〸, reason: contains not printable characters */
    public InterfaceC2692 f10170;

    /* renamed from: しげにけぃ, reason: contains not printable characters */
    public int f10171;

    /* renamed from: しぷげへが, reason: contains not printable characters */
    public LinearLayout f10172;

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public YearPickerView f10173;

    /* renamed from: つしけおつ, reason: contains not printable characters */
    public SparseArray<MonthAdapter.CalendarDay> f10174;

    /* renamed from: な〱ちぉじ, reason: contains not printable characters */
    public final Calendar f10175;

    /* renamed from: にぢ〱ぁな, reason: contains not printable characters */
    public TextView f10176;

    /* renamed from: のかまじえ, reason: contains not printable characters */
    public int f10177;

    /* renamed from: のびぶけせ, reason: contains not printable characters */
    public InterfaceC2677 f10178;

    /* renamed from: ぱでかぁ〻〹, reason: contains not printable characters */
    public MonthAdapter.CalendarDay f10179;

    /* renamed from: ひぞ〴つき, reason: contains not printable characters */
    public int f10180;

    /* renamed from: びちづぼぬ, reason: contains not printable characters */
    public AccessibleDateAnimator f10181;

    /* renamed from: へ〱そかのず, reason: contains not printable characters */
    public C2681 f10182;

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public TextView f10183;

    /* renamed from: へぼ〳〻び, reason: contains not printable characters */
    public TextView f10184;

    /* renamed from: 〻しざ〹おま, reason: contains not printable characters */
    public static final MonthAdapter.CalendarDay f10154 = new MonthAdapter.CalendarDay(1900, 0, 1);

    /* renamed from: 〻はぎっぼ, reason: contains not printable characters */
    public static final MonthAdapter.CalendarDay f10155 = new MonthAdapter.CalendarDay(2100, 11, 31);

    /* renamed from: びがえ〱な, reason: contains not printable characters */
    public static final SimpleDateFormat f10157 = new SimpleDateFormat("yyyy", Locale.getDefault());

    /* renamed from: かちして〹づ, reason: contains not printable characters */
    public static final SimpleDateFormat f10156 = new SimpleDateFormat("dd", Locale.getDefault());

    /* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.ぺふねづ〺.〺つふすそ$〺つふすそ, reason: contains not printable characters */
    public class ViewOnClickListenerC2689 implements View.OnClickListener {
        public ViewOnClickListenerC2689() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewOnClickListenerC2688.this.f10182.m4651();
            ViewOnClickListenerC2688.this.m3827(false, false);
        }
    }

    /* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.ぺふねづ〺.〺つふすそ$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC2690 {
        /* renamed from: げつ〴ぬぐ */
        void mo1111();
    }

    /* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.ぺふねづ〺.〺つふすそ$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC2691 implements View.OnClickListener {
        public ViewOnClickListenerC2691() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewOnClickListenerC2688.this.f10182.m4651();
            ViewOnClickListenerC2688 viewOnClickListenerC2688 = ViewOnClickListenerC2688.this;
            InterfaceC2692 interfaceC2692 = viewOnClickListenerC2688.f10170;
            if (interfaceC2692 != null) {
                int i = viewOnClickListenerC2688.f10175.get(1);
                int i2 = ViewOnClickListenerC2688.this.f10175.get(2);
                int i3 = ViewOnClickListenerC2688.this.f10175.get(5);
                RequestBlock.C0543.C0545 c0545 = (RequestBlock.C0543.C0545) interfaceC2692;
                RequestBlock.this.f3989.setChecked(true);
                CheckBox checkBox = RequestBlock.this.f3989;
                StringBuilder sb = new StringBuilder();
                sb.append("Set Date Expired ");
                sb.append(i3);
                sb.append("/");
                int i4 = i2 + 1;
                sb.append(i4);
                sb.append("/");
                sb.append(i);
                checkBox.setText(sb.toString());
                RequestBlock.this.f3982 = i + "-" + i4 + "-" + i3;
                if (!RequestBlock.this.f3951.isChecked()) {
                    RequestBlock.this.f3959.setChecked(true);
                }
            }
            ViewOnClickListenerC2688.this.m3827(false, false);
        }
    }

    /* renamed from: なぎぱいぢぎ.びぐびあび.げつ〴ぬぐ.ぺふねづ〺.〺つふすそ$びぐびあび, reason: contains not printable characters */
    public interface InterfaceC2692 {
    }

    public ViewOnClickListenerC2688() {
        Calendar calendar = Calendar.getInstance();
        this.f10175 = calendar;
        this.f10166 = new HashSet<>();
        this.f10169 = -1;
        this.f10171 = calendar.getFirstDayOfWeek();
        this.f10160 = f10154;
        this.f10179 = f10155;
        this.f10159 = true;
        this.f10180 = C2687.BetterPickersRadialTimePickerDialog_PrimaryColor;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        this.f10182.m4651();
        if (view.getId() == C2685.date_picker_year) {
            i = 1;
        } else if (view.getId() != C2685.date_picker_month_and_day) {
            return;
        } else {
            i = 0;
        }
        m4652(i);
    }

    @Override // p034.p105.p106.DialogInterfaceOnCancelListenerC1781, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        InterfaceC2677 interfaceC2677 = this.f10178;
        if (interfaceC2677 != null) {
            RequestBlock.C0543.C0544 c0544 = (RequestBlock.C0543.C0544) interfaceC2677;
            if (RequestBlock.this.f3989.getText().toString().equals("Expired")) {
                RequestBlock.this.f3989.setChecked(false);
            }
        }
    }

    /* renamed from: ぅばづそほせ, reason: contains not printable characters */
    public final void m4652(int i) {
        AccessibleDateAnimator accessibleDateAnimator;
        String str;
        long timeInMillis = this.f10175.getTimeInMillis();
        if (i == 0) {
            C2073 m3690 = C1687.m3690(this.f10172, 0.9f, 1.05f);
            if (this.f10159) {
                m3690.f8847 = 500L;
                this.f10159 = false;
            }
            this.f10165.mo1111();
            if (this.f10169 != i) {
                this.f10172.setSelected(true);
                this.f10183.setSelected(false);
                this.f10162.setTextColor(this.f10177);
                this.f10184.setTextColor(this.f10177);
                this.f10183.setTextColor(this.f10167);
                this.f10181.setDisplayedChild(0);
                this.f10169 = i;
            }
            m3690.mo4135();
            String formatDateTime = DateUtils.formatDateTime(m525(), timeInMillis, 16);
            this.f10181.setContentDescription(this.f10163 + ": " + formatDateTime);
            accessibleDateAnimator = this.f10181;
            str = this.f10158;
        } else {
            if (i != 1) {
                return;
            }
            C2073 m36902 = C1687.m3690(this.f10183, 0.85f, 1.1f);
            if (this.f10159) {
                m36902.f8847 = 500L;
                this.f10159 = false;
            }
            this.f10173.mo1111();
            if (this.f10169 != i) {
                this.f10172.setSelected(false);
                this.f10183.setSelected(true);
                this.f10162.setTextColor(this.f10167);
                this.f10184.setTextColor(this.f10167);
                this.f10183.setTextColor(this.f10177);
                this.f10181.setDisplayedChild(1);
                this.f10169 = i;
            }
            m36902.mo4135();
            String format = f10157.format(Long.valueOf(timeInMillis));
            this.f10181.setContentDescription(this.f10164 + ": " + ((Object) format));
            accessibleDateAnimator = this.f10181;
            str = this.f10161;
        }
        C1687.m3657(accessibleDateAnimator, str);
    }

    @Override // p034.p105.p106.DialogInterfaceOnCancelListenerC1781, androidx.fragment.app.Fragment
    /* renamed from: えがぐせほち */
    public void mo489(Bundle bundle) {
        int i;
        super.mo489(bundle);
        bundle.putInt("year", this.f10175.get(1));
        bundle.putInt("month", this.f10175.get(2));
        bundle.putInt("day", this.f10175.get(5));
        bundle.putInt("week_start", this.f10171);
        bundle.putLong("date_start", this.f10160.m1114());
        bundle.putLong("date_end", this.f10179.m1114());
        bundle.putInt("current_view", this.f10169);
        bundle.putInt("theme", this.f10180);
        int i2 = this.f10169;
        if (i2 == 0) {
            i = this.f10165.getMostVisiblePosition();
        } else if (i2 == 1) {
            i = this.f10173.getFirstVisiblePosition();
            bundle.putInt("list_position_offset", this.f10173.getFirstPositionOffset());
        } else {
            i = -1;
        }
        bundle.putInt("list_position", i);
        bundle.putSparseParcelableArray("disabled_days", this.f10174);
    }

    /* renamed from: がぐくいおす, reason: contains not printable characters */
    public final void m4653() {
        Iterator<InterfaceC2690> it = this.f10166.iterator();
        while (it.hasNext()) {
            it.next().mo1111();
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: けときぜと */
    public View mo501(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        int i3;
        if (this.f8017) {
            this.f8012.getWindow().requestFeature(1);
        }
        View inflate = layoutInflater.inflate(C2678.calendar_date_picker_dialog, viewGroup, false);
        this.f10168 = (LinearLayout) inflate.findViewById(C2685.day_picker_selected_date_layout);
        this.f10176 = (TextView) inflate.findViewById(C2685.date_picker_header);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C2685.date_picker_month_and_day);
        this.f10172 = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f10184 = (TextView) inflate.findViewById(C2685.date_picker_month);
        this.f10162 = (TextView) inflate.findViewById(C2685.date_picker_day);
        TextView textView = (TextView) inflate.findViewById(C2685.date_picker_year);
        this.f10183 = textView;
        textView.setOnClickListener(this);
        if (bundle != null) {
            this.f10171 = bundle.getInt("week_start");
            this.f10160 = new MonthAdapter.CalendarDay(bundle.getLong("date_start"));
            this.f10179 = new MonthAdapter.CalendarDay(bundle.getLong("date_end"));
            i = bundle.getInt("current_view");
            i2 = bundle.getInt("list_position");
            i3 = bundle.getInt("list_position_offset");
            this.f10180 = bundle.getInt("theme");
            this.f10174 = bundle.getSparseParcelableArray("disabled_days");
        } else {
            i = 0;
            i2 = -1;
            i3 = 0;
        }
        FragmentActivity m525 = m525();
        this.f10165 = new SimpleDayPickerView(m525, this);
        this.f10173 = new YearPickerView(m525, this);
        Resources m504 = m504();
        TypedArray obtainStyledAttributes = m525().obtainStyledAttributes(this.f10180, C2679.BetterPickersDialogs);
        this.f10163 = m504.getString(C2676.day_picker_description);
        this.f10158 = m504.getString(C2676.select_day);
        this.f10164 = m504.getString(C2676.year_picker_description);
        this.f10161 = m504.getString(C2676.select_year);
        int i4 = C2679.BetterPickersDialogs_bpHeaderBackgroundColor;
        FragmentActivity m5252 = m525();
        int i5 = C2680.bpWhite;
        int color = obtainStyledAttributes.getColor(i4, C1067.m2405(m5252, i5));
        int color2 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogs_bpPreHeaderBackgroundColor, C1067.m2405(m525(), i5));
        int color3 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogs_bpBodyBackgroundColor, C1067.m2405(m525(), i5));
        int color4 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogs_bpButtonsBackgroundColor, C1067.m2405(m525(), i5));
        int color5 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogs_bpButtonsTextColor, C1067.m2405(m525(), C2680.bpBlue));
        this.f10177 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogs_bpHeaderSelectedTextColor, C1067.m2405(m525(), i5));
        this.f10167 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogs_bpHeaderUnselectedTextColor, C1067.m2405(m525(), C2680.radial_gray_light));
        AccessibleDateAnimator accessibleDateAnimator = (AccessibleDateAnimator) inflate.findViewById(C2685.animator);
        this.f10181 = accessibleDateAnimator;
        accessibleDateAnimator.addView(this.f10165);
        this.f10181.addView(this.f10173);
        this.f10181.setDateMillis(this.f10175.getTimeInMillis());
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        this.f10181.setInAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300L);
        this.f10181.setOutAnimation(alphaAnimation2);
        Button button = (Button) inflate.findViewById(C2685.done_button);
        button.setTextColor(color5);
        button.setOnClickListener(new ViewOnClickListenerC2691());
        Button button2 = (Button) inflate.findViewById(C2685.cancel_button);
        button2.setTextColor(color5);
        button2.setOnClickListener(new ViewOnClickListenerC2689());
        inflate.findViewById(C2685.ok_cancel_buttons_layout).setBackgroundColor(color4);
        m4654(false);
        m4652(i);
        if (i2 != -1) {
            if (i == 0) {
                DayPickerView dayPickerView = this.f10165;
                dayPickerView.clearFocus();
                dayPickerView.post(new RunnableC2693(dayPickerView, i2));
                dayPickerView.onScrollStateChanged(dayPickerView, 0);
            } else if (i == 1) {
                YearPickerView yearPickerView = this.f10173;
                yearPickerView.post(new RunnableC2695(yearPickerView, i2, i3));
            }
        }
        this.f10182 = new C2681(m525);
        this.f10165.setTheme(obtainStyledAttributes);
        this.f10173.setTheme(obtainStyledAttributes);
        this.f10168.setBackgroundColor(color);
        this.f10183.setBackgroundColor(color);
        this.f10172.setBackgroundColor(color);
        TextView textView2 = this.f10176;
        if (textView2 != null) {
            textView2.setBackgroundColor(color2);
        }
        inflate.setBackgroundColor(color3);
        this.f10173.setBackgroundColor(color3);
        this.f10165.setBackgroundColor(color3);
        return inflate;
    }

    /* renamed from: せだてはぺて, reason: contains not printable characters */
    public final void m4654(boolean z) {
        TextView textView = this.f10176;
        if (textView != null) {
            textView.setText(this.f10175.getDisplayName(7, 2, Locale.getDefault()).toUpperCase(Locale.getDefault()));
        }
        this.f10184.setText(this.f10175.getDisplayName(2, 1, Locale.getDefault()).toUpperCase(Locale.getDefault()));
        this.f10162.setText(f10156.format(this.f10175.getTime()));
        this.f10183.setText(f10157.format(this.f10175.getTime()));
        long timeInMillis = this.f10175.getTimeInMillis();
        this.f10181.setDateMillis(timeInMillis);
        this.f10172.setContentDescription(DateUtils.formatDateTime(m525(), timeInMillis, 24));
        if (z) {
            C1687.m3657(this.f10181, DateUtils.formatDateTime(m525(), timeInMillis, 20));
        }
    }

    @Override // p034.p105.p106.DialogInterfaceOnCancelListenerC1781, androidx.fragment.app.Fragment
    /* renamed from: せづっ〸ちね */
    public void mo510(Bundle bundle) {
        super.mo510(bundle);
        m525().getWindow().setSoftInputMode(3);
        if (bundle != null) {
            this.f10175.set(1, bundle.getInt("year"));
            this.f10175.set(2, bundle.getInt("month"));
            this.f10175.set(5, bundle.getInt("day"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ち〴みぎ〻び */
    public void mo511() {
        this.f1196 = true;
        C2681 c2681 = this.f10182;
        c2681.f10147 = (Vibrator) c2681.f10148.getSystemService("vibrator");
        c2681.f10151 = Settings.System.getInt(c2681.f10148.getContentResolver(), "haptic_feedback_enabled", 0) == 1;
        c2681.f10149 = c2681.f10148.checkCallingOrSelfPermission("android.permission.VIBRATE") == 0;
        c2681.f10148.getContentResolver().registerContentObserver(Settings.System.getUriFor("haptic_feedback_enabled"), false, c2681.f10146);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: ておぞぞはね */
    public void mo512() {
        this.f1196 = true;
        C2681 c2681 = this.f10182;
        c2681.f10147 = null;
        c2681.f10148.getContentResolver().unregisterContentObserver(c2681.f10146);
    }

    /* renamed from: へえどぜせ, reason: contains not printable characters */
    public MonthAdapter.CalendarDay m4655() {
        return new MonthAdapter.CalendarDay(this.f10175);
    }
}
