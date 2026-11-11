package com.codetroopers.betterpickers.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import p034.p084.p085.AbstractC1512;
import p131.p221.p222.C2676;
import p131.p221.p222.C2678;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2683;
import p131.p221.p222.C2685;

/* loaded from: /tmp/opencode/hc_real.dex */
public class DatePicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: おかぷせ〱, reason: contains not printable characters */
    public static int f2089 = -1;

    /* renamed from: けときぜと, reason: contains not printable characters */
    public static int f2090 = -1;

    /* renamed from: ぷぞてのほき, reason: contains not printable characters */
    public static int f2091 = -1;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2092;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2093;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public Button f2094;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2095;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Button[] f2096;

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public int f2097;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public View f2098;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public UnderlinePageIndicatorPicker f2099;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public boolean f2100;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public ViewPager f2101;

    /* renamed from: ぉひのべい, reason: contains not printable characters */
    public int f2102;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ImageButton f2103;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2104;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public DateView f2105;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public String[] f2106;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public C0339 f2107;

    /* renamed from: じぜこほぱ, reason: contains not printable characters */
    public int f2108;

    /* renamed from: せづっ〸ちね, reason: contains not printable characters */
    public int f2109;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int[] f2110;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public Button f2111;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public final Context f2112;

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public int f2113;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int[] f2114;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public int f2115;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public Button f2116;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public ImageButton f2117;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public ColorStateList f2118;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2119;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public char[] f2120;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Button f2121;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final Button[] f2122;

    /* renamed from: ぺづげぺが, reason: contains not printable characters */
    public int f2123;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final Button[] f2124;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0338();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2125;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int f2126;

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public int[] f2127;

        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public int f2128;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int[] f2129;

        /* renamed from: com.codetroopers.betterpickers.datepicker.DatePicker$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0338 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, C0340 c0340) {
            super(parcel);
            this.f2125 = parcel.readInt();
            this.f2126 = parcel.readInt();
            parcel.readIntArray(this.f2129);
            parcel.readIntArray(this.f2127);
            this.f2128 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2125);
            parcel.writeInt(this.f2126);
            parcel.writeIntArray(this.f2129);
            parcel.writeIntArray(this.f2127);
            parcel.writeInt(this.f2128);
        }
    }

    /* renamed from: com.codetroopers.betterpickers.datepicker.DatePicker$〺つふすそ, reason: contains not printable characters */
    public class C0339 extends AbstractC1512 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public LayoutInflater f2130;

        public C0339(LayoutInflater layoutInflater) {
            this.f2130 = layoutInflater;
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
        public boolean mo1134(View view, Object obj) {
            return view == obj;
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int mo1135() {
            return 3;
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public void mo1136(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
        public Object mo1137(ViewGroup viewGroup, int i) {
            View view;
            Resources resources = DatePicker.this.f2112.getResources();
            char[] cArr = DatePicker.this.f2120;
            if (cArr[i] == 'M') {
                DatePicker.f2091 = i;
                view = this.f2130.inflate(C2678.keyboard_text_with_header, viewGroup, false);
                View findViewById = view.findViewById(C2685.first);
                View findViewById2 = view.findViewById(C2685.second);
                View findViewById3 = view.findViewById(C2685.third);
                View findViewById4 = view.findViewById(C2685.fourth);
                ((TextView) view.findViewById(C2685.header)).setText(C2676.month_c);
                Button[] buttonArr = DatePicker.this.f2122;
                int i2 = C2685.key_left;
                buttonArr[0] = (Button) findViewById.findViewById(i2);
                Button[] buttonArr2 = DatePicker.this.f2122;
                int i3 = C2685.key_middle;
                buttonArr2[1] = (Button) findViewById.findViewById(i3);
                Button[] buttonArr3 = DatePicker.this.f2122;
                int i4 = C2685.key_right;
                buttonArr3[2] = (Button) findViewById.findViewById(i4);
                DatePicker.this.f2122[3] = (Button) findViewById2.findViewById(i2);
                DatePicker.this.f2122[4] = (Button) findViewById2.findViewById(i3);
                DatePicker.this.f2122[5] = (Button) findViewById2.findViewById(i4);
                DatePicker.this.f2122[6] = (Button) findViewById3.findViewById(i2);
                DatePicker.this.f2122[7] = (Button) findViewById3.findViewById(i3);
                DatePicker.this.f2122[8] = (Button) findViewById3.findViewById(i4);
                DatePicker.this.f2122[9] = (Button) findViewById4.findViewById(i2);
                DatePicker.this.f2122[10] = (Button) findViewById4.findViewById(i3);
                DatePicker.this.f2122[11] = (Button) findViewById4.findViewById(i4);
                for (int i5 = 0; i5 < 12; i5++) {
                    DatePicker datePicker = DatePicker.this;
                    datePicker.f2122[i5].setOnClickListener(datePicker);
                    DatePicker datePicker2 = DatePicker.this;
                    datePicker2.f2122[i5].setText(datePicker2.f2106[i5]);
                    DatePicker datePicker3 = DatePicker.this;
                    datePicker3.f2122[i5].setTextColor(datePicker3.f2118);
                    DatePicker datePicker4 = DatePicker.this;
                    datePicker4.f2122[i5].setBackgroundResource(datePicker4.f2115);
                    DatePicker.this.f2122[i5].setTag(C2685.date_keyboard, "month");
                    DatePicker.this.f2122[i5].setTag(C2685.date_month_int, Integer.valueOf(i5));
                }
            } else if (cArr[i] == 'd') {
                DatePicker.f2090 = i;
                View inflate = this.f2130.inflate(C2678.keyboard_right_drawable_with_header, viewGroup, false);
                View findViewById5 = inflate.findViewById(C2685.first);
                View findViewById6 = inflate.findViewById(C2685.second);
                View findViewById7 = inflate.findViewById(C2685.third);
                View findViewById8 = inflate.findViewById(C2685.fourth);
                ((TextView) inflate.findViewById(C2685.header)).setText(C2676.day_c);
                Button[] buttonArr4 = DatePicker.this.f2096;
                int i6 = C2685.key_left;
                buttonArr4[1] = (Button) findViewById5.findViewById(i6);
                Button[] buttonArr5 = DatePicker.this.f2096;
                int i7 = C2685.key_middle;
                buttonArr5[2] = (Button) findViewById5.findViewById(i7);
                Button[] buttonArr6 = DatePicker.this.f2096;
                int i8 = C2685.key_right;
                buttonArr6[3] = (Button) findViewById5.findViewById(i8);
                DatePicker.this.f2096[4] = (Button) findViewById6.findViewById(i6);
                DatePicker.this.f2096[5] = (Button) findViewById6.findViewById(i7);
                DatePicker.this.f2096[6] = (Button) findViewById6.findViewById(i8);
                DatePicker.this.f2096[7] = (Button) findViewById7.findViewById(i6);
                DatePicker.this.f2096[8] = (Button) findViewById7.findViewById(i7);
                DatePicker.this.f2096[9] = (Button) findViewById7.findViewById(i8);
                DatePicker.this.f2111 = (Button) findViewById8.findViewById(i6);
                DatePicker datePicker5 = DatePicker.this;
                datePicker5.f2111.setTextColor(datePicker5.f2118);
                DatePicker datePicker6 = DatePicker.this;
                datePicker6.f2111.setBackgroundResource(datePicker6.f2115);
                DatePicker.this.f2096[0] = (Button) findViewById8.findViewById(i7);
                DatePicker.this.f2103 = (ImageButton) findViewById8.findViewById(i8);
                for (int i9 = 0; i9 < 10; i9++) {
                    DatePicker datePicker7 = DatePicker.this;
                    datePicker7.f2096[i9].setOnClickListener(datePicker7);
                    DatePicker.this.f2096[i9].setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i9)));
                    DatePicker datePicker8 = DatePicker.this;
                    datePicker8.f2096[i9].setTextColor(datePicker8.f2118);
                    DatePicker datePicker9 = DatePicker.this;
                    datePicker9.f2096[i9].setBackgroundResource(datePicker9.f2115);
                    DatePicker.this.f2096[i9].setTag(C2685.date_keyboard, "date");
                    DatePicker.this.f2096[i9].setTag(C2685.numbers_key, Integer.valueOf(i9));
                }
                DatePicker datePicker10 = DatePicker.this;
                datePicker10.f2103.setImageDrawable(resources.getDrawable(datePicker10.f2123));
                DatePicker datePicker11 = DatePicker.this;
                datePicker11.f2103.setBackgroundResource(datePicker11.f2115);
                DatePicker datePicker12 = DatePicker.this;
                datePicker12.f2103.setOnClickListener(datePicker12);
                view = inflate;
            } else if (cArr[i] == 'y') {
                DatePicker.f2089 = i;
                view = this.f2130.inflate(C2678.keyboard_with_header, viewGroup, false);
                View findViewById9 = view.findViewById(C2685.first);
                View findViewById10 = view.findViewById(C2685.second);
                View findViewById11 = view.findViewById(C2685.third);
                View findViewById12 = view.findViewById(C2685.fourth);
                ((TextView) view.findViewById(C2685.header)).setText(C2676.year_c);
                Button[] buttonArr7 = DatePicker.this.f2124;
                int i10 = C2685.key_left;
                buttonArr7[1] = (Button) findViewById9.findViewById(i10);
                Button[] buttonArr8 = DatePicker.this.f2124;
                int i11 = C2685.key_middle;
                buttonArr8[2] = (Button) findViewById9.findViewById(i11);
                Button[] buttonArr9 = DatePicker.this.f2124;
                int i12 = C2685.key_right;
                buttonArr9[3] = (Button) findViewById9.findViewById(i12);
                DatePicker.this.f2124[4] = (Button) findViewById10.findViewById(i10);
                DatePicker.this.f2124[5] = (Button) findViewById10.findViewById(i11);
                DatePicker.this.f2124[6] = (Button) findViewById10.findViewById(i12);
                DatePicker.this.f2124[7] = (Button) findViewById11.findViewById(i10);
                DatePicker.this.f2124[8] = (Button) findViewById11.findViewById(i11);
                DatePicker.this.f2124[9] = (Button) findViewById11.findViewById(i12);
                DatePicker.this.f2116 = (Button) findViewById12.findViewById(i10);
                DatePicker datePicker13 = DatePicker.this;
                datePicker13.f2116.setTextColor(datePicker13.f2118);
                DatePicker datePicker14 = DatePicker.this;
                datePicker14.f2116.setBackgroundResource(datePicker14.f2115);
                DatePicker.this.f2124[0] = (Button) findViewById12.findViewById(i11);
                DatePicker.this.f2121 = (Button) findViewById12.findViewById(i12);
                DatePicker datePicker15 = DatePicker.this;
                datePicker15.f2121.setTextColor(datePicker15.f2118);
                DatePicker datePicker16 = DatePicker.this;
                datePicker16.f2121.setBackgroundResource(datePicker16.f2115);
                for (int i13 = 0; i13 < 10; i13++) {
                    DatePicker datePicker17 = DatePicker.this;
                    datePicker17.f2124[i13].setOnClickListener(datePicker17);
                    DatePicker.this.f2124[i13].setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i13)));
                    DatePicker datePicker18 = DatePicker.this;
                    datePicker18.f2124[i13].setTextColor(datePicker18.f2118);
                    DatePicker datePicker19 = DatePicker.this;
                    datePicker19.f2124[i13].setBackgroundResource(datePicker19.f2115);
                    DatePicker.this.f2124[i13].setTag(C2685.date_keyboard, "year");
                    DatePicker.this.f2124[i13].setTag(C2685.numbers_key, Integer.valueOf(i13));
                }
            } else {
                view = new View(DatePicker.this.f2112);
            }
            DatePicker.this.m1129();
            DatePicker.this.m1133();
            DatePicker.this.m1132();
            viewGroup.addView(view, 0);
            return view;
        }
    }

    public DatePicker(Context context) {
        this(context, null);
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2093 = 2;
        this.f2104 = 4;
        this.f2119 = -1;
        this.f2110 = new int[2];
        this.f2114 = new int[4];
        this.f2095 = -1;
        this.f2092 = -1;
        this.f2122 = new Button[12];
        this.f2096 = new Button[10];
        this.f2124 = new Button[10];
        this.f2100 = false;
        this.f2109 = -1;
        this.f2112 = context;
        this.f2120 = DateFormat.getDateFormatOrder(context);
        this.f2106 = m1128();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.f2118 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
        this.f2115 = C2683.key_background_dark;
        this.f2113 = C2683.button_background_dark;
        this.f2097 = getResources().getColor(C2680.default_divider_color_dark);
        this.f2108 = getResources().getColor(C2680.default_keyboard_indicator_color_dark);
        this.f2102 = C2683.ic_backspace_dark;
        this.f2123 = C2683.ic_check_dark;
    }

    private void setDateKeyRange(int i) {
        int i2 = 0;
        while (true) {
            Button[] buttonArr = this.f2096;
            if (i2 >= buttonArr.length) {
                return;
            }
            if (buttonArr[i2] != null) {
                buttonArr[i2].setEnabled(i2 <= i);
            }
            i2++;
        }
    }

    private void setDateMinKeyRange(int i) {
        int i2 = 0;
        while (true) {
            Button[] buttonArr = this.f2096;
            if (i2 >= buttonArr.length) {
                return;
            }
            if (buttonArr[i2] != null) {
                buttonArr[i2].setEnabled(i2 >= i);
            }
            i2++;
        }
    }

    private void setYearKeyRange(int i) {
        int i2 = 0;
        while (true) {
            Button[] buttonArr = this.f2124;
            if (i2 >= buttonArr.length) {
                return;
            }
            if (buttonArr[i2] != null) {
                buttonArr[i2].setEnabled(i2 <= i);
            }
            i2++;
        }
    }

    private void setYearMinKeyRange(int i) {
        int i2 = 0;
        while (true) {
            Button[] buttonArr = this.f2124;
            if (i2 >= buttonArr.length) {
                return;
            }
            if (buttonArr[i2] != null) {
                buttonArr[i2].setEnabled(i2 >= i);
            }
            i2++;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static String[] m1128() {
        Locale locale = Locale.getDefault();
        boolean z = locale != null;
        SimpleDateFormat simpleDateFormat = z ? new SimpleDateFormat("MMM", locale) : new SimpleDateFormat("MMM");
        GregorianCalendar gregorianCalendar = z ? new GregorianCalendar(locale) : new GregorianCalendar();
        gregorianCalendar.set(1, 0);
        gregorianCalendar.set(5, 1);
        gregorianCalendar.set(11, 0);
        gregorianCalendar.set(12, 0);
        gregorianCalendar.set(13, 0);
        gregorianCalendar.set(14, 0);
        String[] strArr = new String[12];
        for (int i = 0; i < 12; i++) {
            gregorianCalendar.set(2, i);
            strArr[i] = simpleDateFormat.format(gregorianCalendar.getTime()).toUpperCase();
        }
        return strArr;
    }

    public int getDayOfMonth() {
        int[] iArr = this.f2110;
        return (iArr[1] * 10) + iArr[0];
    }

    public int getLayoutId() {
        return C2678.date_picker_view;
    }

    public int getMonthOfYear() {
        return this.f2119;
    }

    public int getYear() {
        int[] iArr = this.f2114;
        return (iArr[1] * 10) + (iArr[2] * 100) + (iArr[3] * 1000) + iArr[0];
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r7.f2101.getCurrentItem() > 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r8 = r7.f2101;
        r1 = r8.getCurrentItem() - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r7.f2101.getCurrentItem() > 0) goto L30;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r8) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.datepicker.DatePicker.onClick(android.view.View):void");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2098 = findViewById(C2685.divider);
        int i = 0;
        while (true) {
            int[] iArr = this.f2110;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.f2114;
            if (i2 >= iArr2.length) {
                this.f2099 = (UnderlinePageIndicatorPicker) findViewById(C2685.keyboard_indicator);
                ViewPager viewPager = (ViewPager) findViewById(C2685.keyboard_pager);
                this.f2101 = viewPager;
                viewPager.setOffscreenPageLimit(2);
                C0339 c0339 = new C0339((LayoutInflater) this.f2112.getSystemService("layout_inflater"));
                this.f2107 = c0339;
                this.f2101.setAdapter(c0339);
                this.f2099.setViewPager(this.f2101);
                this.f2101.setCurrentItem(0);
                DateView dateView = (DateView) findViewById(C2685.date_text);
                this.f2105 = dateView;
                dateView.setTheme(this.f2109);
                this.f2105.setUnderlinePage(this.f2099);
                this.f2105.setOnClick(this);
                ImageButton imageButton = (ImageButton) findViewById(C2685.delete);
                this.f2117 = imageButton;
                imageButton.setOnClickListener(this);
                this.f2117.setOnLongClickListener(this);
                m1129();
                m1133();
                m1132();
                return;
            }
            iArr2[i2] = 0;
            i2++;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        ImageButton imageButton = this.f2117;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        for (int i = 0; i < this.f2093; i++) {
            this.f2110[i] = 0;
        }
        for (int i2 = 0; i2 < this.f2104; i2++) {
            this.f2114[i2] = 0;
        }
        this.f2095 = -1;
        this.f2092 = -1;
        this.f2119 = -1;
        this.f2101.setCurrentItem(0, true);
        m1133();
        m1132();
        return true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2095 = savedState.f2125;
        this.f2092 = savedState.f2126;
        int[] iArr = savedState.f2129;
        this.f2110 = iArr;
        int[] iArr2 = savedState.f2127;
        this.f2114 = iArr2;
        if (iArr == null) {
            this.f2110 = new int[this.f2093];
            this.f2095 = -1;
        }
        if (iArr2 == null) {
            this.f2114 = new int[this.f2104];
            this.f2092 = -1;
        }
        this.f2119 = savedState.f2128;
        m1132();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2128 = this.f2119;
        savedState.f2129 = this.f2110;
        savedState.f2125 = this.f2095;
        savedState.f2127 = this.f2114;
        savedState.f2126 = this.f2092;
        return savedState;
    }

    public void setDate(int i, int i2, int i3) {
        int i4;
        this.f2119 = i2;
        int[] iArr = this.f2114;
        iArr[3] = i / 1000;
        iArr[2] = (i % 1000) / 100;
        iArr[1] = (i % 100) / 10;
        iArr[0] = i % 10;
        if (i >= 1000) {
            this.f2092 = 3;
        } else if (i >= 100) {
            this.f2092 = 2;
        } else if (i >= 10) {
            this.f2092 = 1;
        } else if (i > 0) {
            this.f2092 = 0;
        }
        int[] iArr2 = this.f2110;
        iArr2[1] = i3 / 10;
        iArr2[0] = i3 % 10;
        if (i3 >= 10) {
            this.f2095 = 1;
        } else if (i3 > 0) {
            this.f2095 = 0;
        }
        while (true) {
            char[] cArr = this.f2120;
            if (i4 >= cArr.length) {
                break;
            }
            char c = cArr[i4];
            i4 = (!(c == 'M' && i2 == -1) && (c != 'd' || i3 > 0) && (c != 'y' || i > 0)) ? i4 + 1 : 0;
        }
        this.f2101.setCurrentItem(i4, true);
        m1132();
    }

    public void setSetButton(Button button) {
        this.f2094 = button;
        m1130();
    }

    public void setTheme(int i) {
        this.f2109 = i;
        if (i != -1) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment);
            this.f2118 = obtainStyledAttributes.getColorStateList(C2679.BetterPickersDialogFragment_bpTextColor);
            this.f2115 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpKeyBackground, this.f2115);
            this.f2113 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpButtonBackground, this.f2113);
            this.f2123 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpCheckIcon, this.f2123);
            this.f2097 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogFragment_bpTitleDividerColor, this.f2097);
            this.f2108 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogFragment_bpKeyboardIndicatorColor, this.f2108);
            this.f2102 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpDeleteIcon, this.f2102);
        }
        for (Button button : this.f2122) {
            if (button != null) {
                button.setTextColor(this.f2118);
                button.setBackgroundResource(this.f2115);
            }
        }
        for (Button button2 : this.f2096) {
            if (button2 != null) {
                button2.setTextColor(this.f2118);
                button2.setBackgroundResource(this.f2115);
            }
        }
        for (Button button3 : this.f2124) {
            if (button3 != null) {
                button3.setTextColor(this.f2118);
                button3.setBackgroundResource(this.f2115);
            }
        }
        UnderlinePageIndicatorPicker underlinePageIndicatorPicker = this.f2099;
        if (underlinePageIndicatorPicker != null) {
            underlinePageIndicatorPicker.setSelectedColor(this.f2108);
        }
        View view = this.f2098;
        if (view != null) {
            view.setBackgroundColor(this.f2097);
        }
        Button button4 = this.f2111;
        if (button4 != null) {
            button4.setTextColor(this.f2118);
            this.f2111.setBackgroundResource(this.f2115);
        }
        ImageButton imageButton = this.f2103;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.f2115);
            this.f2103.setImageDrawable(getResources().getDrawable(this.f2123));
        }
        ImageButton imageButton2 = this.f2117;
        if (imageButton2 != null) {
            imageButton2.setBackgroundResource(this.f2113);
            this.f2117.setImageDrawable(getResources().getDrawable(this.f2102));
        }
        Button button5 = this.f2116;
        if (button5 != null) {
            button5.setTextColor(this.f2118);
            this.f2116.setBackgroundResource(this.f2115);
        }
        Button button6 = this.f2121;
        if (button6 != null) {
            button6.setTextColor(this.f2118);
            this.f2121.setBackgroundResource(this.f2115);
        }
        DateView dateView = this.f2105;
        if (dateView != null) {
            dateView.setTheme(this.f2109);
        }
    }

    public void setYearOptional(boolean z) {
        this.f2100 = z;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m1129() {
        Button button = this.f2111;
        if (button != null) {
            button.setEnabled(false);
        }
        ImageButton imageButton = this.f2103;
        if (imageButton != null) {
            imageButton.setEnabled(getDayOfMonth() > 0);
        }
        Button button2 = this.f2116;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        Button button3 = this.f2121;
        if (button3 != null) {
            button3.setEnabled(false);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1130() {
        Button button = this.f2094;
        if (button == null) {
            return;
        }
        button.setEnabled(getDayOfMonth() > 0 && (this.f2100 || getYear() > 0) && getMonthOfYear() >= 0);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public void m1131() {
        boolean z = (this.f2119 == -1 && this.f2095 == -1 && this.f2092 == -1) ? false : true;
        ImageButton imageButton = this.f2117;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b1  */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1132() {
        /*
            r10 = this;
            android.widget.ImageButton r0 = r10.f2103
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L12
            int r3 = r10.getDayOfMonth()
            if (r3 <= 0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r0.setEnabled(r3)
        L12:
            r10.m1133()
            r10.m1130()
            r10.m1131()
            int r0 = r10.getDayOfMonth()
            r3 = 0
        L20:
            android.widget.Button[] r4 = r10.f2122
            int r5 = r4.length
            if (r3 >= r5) goto L31
            r5 = r4[r3]
            if (r5 == 0) goto L2e
            r4 = r4[r3]
            r4.setEnabled(r2)
        L2e:
            int r3 = r3 + 1
            goto L20
        L31:
            r3 = 29
            if (r0 <= r3) goto L3e
            r3 = r4[r2]
            if (r3 == 0) goto L3e
            r3 = r4[r2]
            r3.setEnabled(r1)
        L3e:
            r3 = 30
            r4 = 10
            r5 = 8
            r6 = 5
            r7 = 3
            if (r0 <= r3) goto L74
            android.widget.Button[] r0 = r10.f2122
            r3 = r0[r7]
            if (r3 == 0) goto L53
            r0 = r0[r7]
            r0.setEnabled(r1)
        L53:
            android.widget.Button[] r0 = r10.f2122
            r3 = r0[r6]
            if (r3 == 0) goto L5e
            r0 = r0[r6]
            r0.setEnabled(r1)
        L5e:
            android.widget.Button[] r0 = r10.f2122
            r3 = r0[r5]
            if (r3 == 0) goto L69
            r0 = r0[r5]
            r0.setEnabled(r1)
        L69:
            android.widget.Button[] r0 = r10.f2122
            r3 = r0[r4]
            if (r3 == 0) goto L74
            r0 = r0[r4]
            r0.setEnabled(r1)
        L74:
            int r0 = r10.getDayOfMonth()
            r3 = 4
            r8 = 9
            r9 = -1
            if (r0 < r3) goto L7f
            goto L85
        L7f:
            if (r0 < r7) goto L9a
            int r0 = r10.f2119
            if (r0 != r2) goto L89
        L85:
            r10.setDateKeyRange(r9)
            goto La7
        L89:
            if (r0 == r7) goto L96
            if (r0 == r6) goto L96
            if (r0 == r5) goto L96
            if (r0 != r4) goto L92
            goto L96
        L92:
            r10.setDateKeyRange(r2)
            goto La7
        L96:
            r10.setDateKeyRange(r1)
            goto La7
        L9a:
            r1 = 2
            if (r0 < r1) goto L9e
            goto La0
        L9e:
            if (r0 < r2) goto La4
        La0:
            r10.setDateKeyRange(r8)
            goto La7
        La4:
            r10.setDateMinKeyRange(r2)
        La7:
            int r0 = r10.getYear()
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 < r1) goto Lb1
            r8 = -1
            goto Lb3
        Lb1:
            if (r0 < r2) goto Lb7
        Lb3:
            r10.setYearKeyRange(r8)
            goto Lba
        Lb7:
            r10.setYearMinKeyRange(r2)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.datepicker.DatePicker.m1132():void");
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m1133() {
        int i = this.f2119;
        this.f2105.setDate(i < 0 ? "" : this.f2106[i], getDayOfMonth(), getYear());
    }
}
