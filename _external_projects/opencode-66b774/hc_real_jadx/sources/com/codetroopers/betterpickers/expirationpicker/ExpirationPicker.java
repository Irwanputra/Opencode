package com.codetroopers.betterpickers.expirationpicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
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
import androidx.viewpager.widget.ViewPager;
import com.codetroopers.betterpickers.datepicker.DatePicker;
import com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker;
import java.util.Calendar;
import p034.p084.p085.AbstractC1512;
import p131.p155.p156.p157.C2098;
import p131.p221.p222.C2678;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2683;
import p131.p221.p222.C2685;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ExpirationPicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: どぇぞほだ, reason: contains not printable characters */
    public static int f2139 = -1;

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static int f2140 = -1;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Button[] f2141;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2142;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public int f2143;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Button[] f2144;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public Button f2145;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public int f2146;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final Context f2147;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public int f2148;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public char[] f2149;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ExpirationView f2150;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2151;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public ColorStateList f2152;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f2153;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public Button f2154;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2155;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public ViewPager f2156;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f2157;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f2158;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public C0342 f2159;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public View f2160;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public int f2161;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int[] f2162;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f2163;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public ImageButton f2164;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public Button f2165;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public UnderlinePageIndicatorPicker f2166;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0341();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2167;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int[] f2168;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f2169;

        /* renamed from: com.codetroopers.betterpickers.expirationpicker.ExpirationPicker$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0341 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, C0343 c0343) {
            super(parcel);
            this.f2167 = parcel.readInt();
            parcel.readIntArray(this.f2168);
            this.f2169 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2167);
            parcel.writeIntArray(this.f2168);
            parcel.writeInt(this.f2169);
        }
    }

    /* renamed from: com.codetroopers.betterpickers.expirationpicker.ExpirationPicker$〺つふすそ, reason: contains not printable characters */
    public class C0342 extends AbstractC1512 {

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public LayoutInflater f2170;

        public C0342(LayoutInflater layoutInflater) {
            this.f2170 = layoutInflater;
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: ぁごぐすすぃ */
        public boolean mo1134(View view, Object obj) {
            return view == obj;
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: くし〴〺ぅ */
        public int mo1135() {
            return 2;
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: げつ〴ぬぐ */
        public void mo1136(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p034.p084.p085.AbstractC1512
        /* renamed from: なぎぱいぢぎ */
        public Object mo1137(ViewGroup viewGroup, int i) {
            View view;
            ExpirationPicker.this.f2147.getResources();
            if (i == 0) {
                ExpirationPicker.f2140 = i;
                view = this.f2170.inflate(C2678.keyboard_text, viewGroup, false);
                View findViewById = view.findViewById(C2685.first);
                View findViewById2 = view.findViewById(C2685.second);
                View findViewById3 = view.findViewById(C2685.third);
                View findViewById4 = view.findViewById(C2685.fourth);
                Button[] buttonArr = ExpirationPicker.this.f2144;
                int i2 = C2685.key_left;
                buttonArr[0] = (Button) findViewById.findViewById(i2);
                Button[] buttonArr2 = ExpirationPicker.this.f2144;
                int i3 = C2685.key_middle;
                buttonArr2[1] = (Button) findViewById.findViewById(i3);
                Button[] buttonArr3 = ExpirationPicker.this.f2144;
                int i4 = C2685.key_right;
                buttonArr3[2] = (Button) findViewById.findViewById(i4);
                ExpirationPicker.this.f2144[3] = (Button) findViewById2.findViewById(i2);
                ExpirationPicker.this.f2144[4] = (Button) findViewById2.findViewById(i3);
                ExpirationPicker.this.f2144[5] = (Button) findViewById2.findViewById(i4);
                ExpirationPicker.this.f2144[6] = (Button) findViewById3.findViewById(i2);
                ExpirationPicker.this.f2144[7] = (Button) findViewById3.findViewById(i3);
                ExpirationPicker.this.f2144[8] = (Button) findViewById3.findViewById(i4);
                ExpirationPicker.this.f2144[9] = (Button) findViewById4.findViewById(i2);
                ExpirationPicker.this.f2144[10] = (Button) findViewById4.findViewById(i3);
                ExpirationPicker.this.f2144[11] = (Button) findViewById4.findViewById(i4);
                int i5 = 0;
                while (i5 < 12) {
                    ExpirationPicker expirationPicker = ExpirationPicker.this;
                    expirationPicker.f2144[i5].setOnClickListener(expirationPicker);
                    int i6 = i5 + 1;
                    ExpirationPicker.this.f2144[i5].setText(String.format("%02d", Integer.valueOf(i6)));
                    ExpirationPicker expirationPicker2 = ExpirationPicker.this;
                    expirationPicker2.f2144[i5].setTextColor(expirationPicker2.f2152);
                    ExpirationPicker expirationPicker3 = ExpirationPicker.this;
                    expirationPicker3.f2144[i5].setBackgroundResource(expirationPicker3.f2153);
                    ExpirationPicker.this.f2144[i5].setTag(C2685.date_keyboard, "month");
                    ExpirationPicker.this.f2144[i5].setTag(C2685.date_month_int, Integer.valueOf(i6));
                    i5 = i6;
                }
            } else if (i == 1) {
                ExpirationPicker.f2139 = i;
                view = this.f2170.inflate(C2678.keyboard, viewGroup, false);
                View findViewById5 = view.findViewById(C2685.first);
                View findViewById6 = view.findViewById(C2685.second);
                View findViewById7 = view.findViewById(C2685.third);
                View findViewById8 = view.findViewById(C2685.fourth);
                Button[] buttonArr4 = ExpirationPicker.this.f2141;
                int i7 = C2685.key_left;
                buttonArr4[1] = (Button) findViewById5.findViewById(i7);
                Button[] buttonArr5 = ExpirationPicker.this.f2141;
                int i8 = C2685.key_middle;
                buttonArr5[2] = (Button) findViewById5.findViewById(i8);
                Button[] buttonArr6 = ExpirationPicker.this.f2141;
                int i9 = C2685.key_right;
                buttonArr6[3] = (Button) findViewById5.findViewById(i9);
                ExpirationPicker.this.f2141[4] = (Button) findViewById6.findViewById(i7);
                ExpirationPicker.this.f2141[5] = (Button) findViewById6.findViewById(i8);
                ExpirationPicker.this.f2141[6] = (Button) findViewById6.findViewById(i9);
                ExpirationPicker.this.f2141[7] = (Button) findViewById7.findViewById(i7);
                ExpirationPicker.this.f2141[8] = (Button) findViewById7.findViewById(i8);
                ExpirationPicker.this.f2141[9] = (Button) findViewById7.findViewById(i9);
                ExpirationPicker.this.f2165 = (Button) findViewById8.findViewById(i7);
                ExpirationPicker expirationPicker4 = ExpirationPicker.this;
                expirationPicker4.f2165.setTextColor(expirationPicker4.f2152);
                ExpirationPicker expirationPicker5 = ExpirationPicker.this;
                expirationPicker5.f2165.setBackgroundResource(expirationPicker5.f2153);
                ExpirationPicker.this.f2141[0] = (Button) findViewById8.findViewById(i8);
                ExpirationPicker.this.f2145 = (Button) findViewById8.findViewById(i9);
                ExpirationPicker expirationPicker6 = ExpirationPicker.this;
                expirationPicker6.f2145.setTextColor(expirationPicker6.f2152);
                ExpirationPicker expirationPicker7 = ExpirationPicker.this;
                expirationPicker7.f2145.setBackgroundResource(expirationPicker7.f2153);
                for (int i10 = 0; i10 < 10; i10++) {
                    ExpirationPicker expirationPicker8 = ExpirationPicker.this;
                    expirationPicker8.f2141[i10].setOnClickListener(expirationPicker8);
                    ExpirationPicker.this.f2141[i10].setText(String.format("%d", Integer.valueOf(i10)));
                    ExpirationPicker expirationPicker9 = ExpirationPicker.this;
                    expirationPicker9.f2141[i10].setTextColor(expirationPicker9.f2152);
                    ExpirationPicker expirationPicker10 = ExpirationPicker.this;
                    expirationPicker10.f2141[i10].setBackgroundResource(expirationPicker10.f2153);
                    ExpirationPicker.this.f2141[i10].setTag(C2685.date_keyboard, "year");
                    ExpirationPicker.this.f2141[i10].setTag(C2685.numbers_key, Integer.valueOf(i10));
                }
            } else {
                view = new View(ExpirationPicker.this.f2147);
            }
            ExpirationPicker expirationPicker11 = ExpirationPicker.this;
            Button button = expirationPicker11.f2165;
            if (button != null) {
                button.setEnabled(false);
            }
            Button button2 = expirationPicker11.f2145;
            if (button2 != null) {
                button2.setEnabled(false);
            }
            ExpirationPicker.this.m1144();
            ExpirationPicker.this.m1143();
            viewGroup.addView(view, 0);
            return view;
        }
    }

    public ExpirationPicker(Context context) {
        this(context, null);
    }

    public ExpirationPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2142 = 4;
        this.f2151 = -1;
        this.f2162 = new int[4];
        this.f2155 = -1;
        this.f2144 = new Button[12];
        this.f2141 = new Button[10];
        this.f2161 = -1;
        this.f2147 = context;
        this.f2149 = DateFormat.getDateFormatOrder(context);
        DatePicker.m1128();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.f2152 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
        this.f2153 = C2683.key_background_dark;
        this.f2157 = C2683.button_background_dark;
        this.f2163 = getResources().getColor(C2680.default_divider_color_dark);
        this.f2143 = getResources().getColor(C2680.default_keyboard_indicator_color_dark);
        this.f2146 = C2683.ic_backspace_dark;
        this.f2148 = C2683.ic_check_dark;
        this.f2158 = Calendar.getInstance().get(1);
    }

    private void setYearKeyRange(int i) {
        int i2 = 0;
        while (true) {
            Button[] buttonArr = this.f2141;
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
            Button[] buttonArr = this.f2141;
            if (i2 >= buttonArr.length) {
                return;
            }
            if (buttonArr[i2] != null) {
                buttonArr[i2].setEnabled(i2 >= i);
            }
            i2++;
        }
    }

    public int getLayoutId() {
        return C2678.expiration_picker_view;
    }

    public int getMonthOfYear() {
        return this.f2151;
    }

    public int getYear() {
        int[] iArr = this.f2162;
        return (iArr[1] * 10) + (iArr[2] * 100) + (iArr[3] * 1000) + iArr[0];
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ViewPager viewPager;
        int currentItem;
        ViewPager viewPager2;
        int i;
        int i2;
        view.performHapticFeedback(1);
        if (view == this.f2164) {
            int currentItem2 = this.f2156.getCurrentItem();
            if (currentItem2 != 0) {
                if (currentItem2 == 1) {
                    if (this.f2155 >= 2) {
                        int i3 = 0;
                        while (true) {
                            i2 = this.f2155;
                            if (i3 >= i2) {
                                break;
                            }
                            int[] iArr = this.f2162;
                            int i4 = i3 + 1;
                            iArr[i3] = iArr[i4];
                            i3 = i4;
                        }
                        this.f2162[i2] = 0;
                        this.f2155 = i2 - 1;
                    } else if (this.f2156.getCurrentItem() > 0) {
                        viewPager = this.f2156;
                        currentItem = viewPager.getCurrentItem() - 1;
                        viewPager.setCurrentItem(currentItem, true);
                    }
                }
            } else if (this.f2151 != -1) {
                this.f2151 = -1;
            }
        } else {
            if (view == this.f2150.getMonth()) {
                viewPager2 = this.f2156;
                i = f2140;
            } else if (view == this.f2150.getYear()) {
                viewPager2 = this.f2156;
                i = f2139;
            } else {
                int i5 = C2685.date_keyboard;
                if (view.getTag(i5).equals("month")) {
                    this.f2151 = ((Integer) view.getTag(C2685.date_month_int)).intValue();
                    if (this.f2156.getCurrentItem() < 2) {
                        viewPager = this.f2156;
                        currentItem = viewPager.getCurrentItem() + 1;
                        viewPager.setCurrentItem(currentItem, true);
                    }
                } else if (view.getTag(i5).equals("year")) {
                    m1142(((Integer) view.getTag(C2685.numbers_key)).intValue());
                }
            }
            viewPager2.setCurrentItem(i);
        }
        m1143();
        m1141();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2160 = findViewById(C2685.divider);
        int i = 0;
        while (true) {
            int[] iArr = this.f2162;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = 0;
            i++;
        }
        this.f2166 = (UnderlinePageIndicatorPicker) findViewById(C2685.keyboard_indicator);
        ViewPager viewPager = (ViewPager) findViewById(C2685.keyboard_pager);
        this.f2156 = viewPager;
        viewPager.setOffscreenPageLimit(2);
        C0342 c0342 = new C0342((LayoutInflater) this.f2147.getSystemService("layout_inflater"));
        this.f2159 = c0342;
        this.f2156.setAdapter(c0342);
        this.f2166.setViewPager(this.f2156);
        this.f2156.setCurrentItem(0);
        ExpirationView expirationView = (ExpirationView) findViewById(C2685.date_text);
        this.f2150 = expirationView;
        expirationView.setTheme(this.f2161);
        this.f2150.setUnderlinePage(this.f2166);
        this.f2150.setOnClick(this);
        ImageButton imageButton = (ImageButton) findViewById(C2685.delete);
        this.f2164 = imageButton;
        imageButton.setOnClickListener(this);
        this.f2164.setOnLongClickListener(this);
        m1142(this.f2158 / 1000);
        m1142((this.f2158 % 1000) / 100);
        ViewPager viewPager2 = this.f2156;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
        Button button = this.f2165;
        if (button != null) {
            button.setEnabled(false);
        }
        Button button2 = this.f2145;
        if (button2 != null) {
            button2.setEnabled(false);
        }
        m1144();
        m1143();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        ImageButton imageButton = this.f2164;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        for (int i = 0; i < this.f2142; i++) {
            this.f2162[i] = 0;
        }
        this.f2155 = -1;
        this.f2151 = -1;
        this.f2156.setCurrentItem(0, true);
        m1144();
        m1143();
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
        this.f2155 = savedState.f2167;
        int[] iArr = savedState.f2168;
        this.f2162 = iArr;
        if (iArr == null) {
            this.f2162 = new int[this.f2142];
            this.f2155 = -1;
        }
        this.f2151 = savedState.f2169;
        m1143();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2169 = this.f2151;
        savedState.f2168 = this.f2162;
        savedState.f2167 = this.f2155;
        return savedState;
    }

    public void setExpiration(int i, int i2) {
        int i3;
        if (i != 0 && i < this.f2158) {
            StringBuilder m4207 = C2098.m4207("Years past the minimum set year are not allowed. Specify ");
            m4207.append(this.f2158);
            m4207.append(" or above.");
            throw new IllegalArgumentException(m4207.toString());
        }
        this.f2151 = i2;
        int[] iArr = this.f2162;
        iArr[3] = i / 1000;
        iArr[2] = (i % 1000) / 100;
        iArr[1] = (i % 100) / 10;
        iArr[0] = i % 10;
        if (i >= 1000) {
            this.f2155 = 3;
        } else if (i >= 100) {
            this.f2155 = 2;
        } else if (i >= 10) {
            this.f2155 = 1;
        } else if (i > 0) {
            this.f2155 = 0;
        }
        while (true) {
            char[] cArr = this.f2149;
            if (i3 >= cArr.length) {
                break;
            }
            char c = cArr[i3];
            i3 = (!(c == 'M' && i2 == -1) && (c != 'y' || i > 0)) ? i3 + 1 : 0;
        }
        this.f2156.setCurrentItem(i3, true);
        m1143();
    }

    public void setMinYear(int i) {
        this.f2158 = i;
    }

    public void setSetButton(Button button) {
        this.f2154 = button;
        m1140();
    }

    public void setTheme(int i) {
        this.f2161 = i;
        if (i != -1) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment);
            this.f2152 = obtainStyledAttributes.getColorStateList(C2679.BetterPickersDialogFragment_bpTextColor);
            this.f2153 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpKeyBackground, this.f2153);
            this.f2157 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpButtonBackground, this.f2157);
            this.f2148 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpCheckIcon, this.f2148);
            this.f2163 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogFragment_bpTitleDividerColor, this.f2163);
            this.f2143 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogFragment_bpKeyboardIndicatorColor, this.f2143);
            this.f2146 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpDeleteIcon, this.f2146);
        }
        for (Button button : this.f2144) {
            if (button != null) {
                button.setTextColor(this.f2152);
                button.setBackgroundResource(this.f2153);
            }
        }
        for (Button button2 : this.f2141) {
            if (button2 != null) {
                button2.setTextColor(this.f2152);
                button2.setBackgroundResource(this.f2153);
            }
        }
        UnderlinePageIndicatorPicker underlinePageIndicatorPicker = this.f2166;
        if (underlinePageIndicatorPicker != null) {
            underlinePageIndicatorPicker.setSelectedColor(this.f2143);
        }
        View view = this.f2160;
        if (view != null) {
            view.setBackgroundColor(this.f2163);
        }
        ImageButton imageButton = this.f2164;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.f2157);
            this.f2164.setImageDrawable(getResources().getDrawable(this.f2146));
        }
        Button button3 = this.f2165;
        if (button3 != null) {
            button3.setTextColor(this.f2152);
            this.f2165.setBackgroundResource(this.f2153);
        }
        Button button4 = this.f2145;
        if (button4 != null) {
            button4.setTextColor(this.f2152);
            this.f2145.setBackgroundResource(this.f2153);
        }
        ExpirationView expirationView = this.f2150;
        if (expirationView != null) {
            expirationView.setTheme(this.f2161);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1140() {
        Button button = this.f2154;
        if (button == null) {
            return;
        }
        button.setEnabled(getYear() >= this.f2158 && getMonthOfYear() > 0);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m1141() {
        boolean z = (this.f2151 == -1 && this.f2155 == -1) ? false : true;
        ImageButton imageButton = this.f2164;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1142(int i) {
        int i2 = this.f2155;
        if (i2 < this.f2142 - 1) {
            while (i2 >= 0) {
                int[] iArr = this.f2162;
                iArr[i2 + 1] = iArr[i2];
                i2--;
            }
            this.f2155++;
            this.f2162[0] = i;
        }
        if (this.f2156.getCurrentItem() < 2) {
            ViewPager viewPager = this.f2156;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1143() {
        int max;
        m1144();
        m1140();
        m1141();
        int i = 0;
        while (true) {
            Button[] buttonArr = this.f2144;
            if (i >= buttonArr.length) {
                break;
            }
            if (buttonArr[i] != null) {
                buttonArr[i].setEnabled(true);
            }
            i++;
        }
        int i2 = this.f2155;
        if (i2 == 1) {
            max = (this.f2158 % 100) / 10;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    setYearKeyRange(-1);
                    return;
                }
                return;
            }
            max = Math.max(0, (this.f2158 % 100) - (this.f2162[0] * 10));
        }
        setYearMinKeyRange(max);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: びぐびあび, reason: contains not printable characters */
    public void m1144() {
        int i = this.f2151;
        this.f2150.setExpiration(i < 0 ? "" : String.format("%02d", Integer.valueOf(i)), getYear());
    }
}
