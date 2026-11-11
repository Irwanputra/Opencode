package com.codetroopers.betterpickers.numberpicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import p131.p155.p156.p157.C2098;
import p131.p221.p222.C2676;
import p131.p221.p222.C2678;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2683;
import p131.p221.p222.C2685;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NumberPicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ImageButton f2210;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2211;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Button f2212;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Context f2213;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public View f2214;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public ColorStateList f2215;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Button f2216;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Button[] f2217;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f2218;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f2219;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f2220;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2221;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public NumberPickerErrorTextView f2222;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f2223;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Button f2224;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f2225;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f2226;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int[] f2227;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public String f2228;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public NumberView f2229;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public TextView f2230;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0346();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2231;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int[] f2232;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f2233;

        /* renamed from: com.codetroopers.betterpickers.numberpicker.NumberPicker$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0346 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, C0347 c0347) {
            super(parcel);
            this.f2231 = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2232 = iArr;
                parcel.readIntArray(iArr);
            }
            this.f2233 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2231);
            int[] iArr = this.f2232;
            if (iArr != null) {
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2232);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.f2233);
        }
    }

    public NumberPicker(Context context) {
        this(context, null);
    }

    public NumberPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2211 = 20;
        this.f2217 = new Button[10];
        this.f2227 = new int[20];
        this.f2221 = -1;
        this.f2228 = "";
        this.f2223 = -1;
        this.f2213 = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.f2215 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
        this.f2220 = C2683.key_background_dark;
        this.f2226 = C2683.button_background_dark;
        this.f2219 = C2683.ic_backspace_dark;
        this.f2218 = getResources().getColor(C2680.default_divider_color_dark);
    }

    private String getEnteredNumberString() {
        StringBuilder m4207;
        String str = "";
        for (int i = this.f2221; i >= 0; i--) {
            int[] iArr = this.f2227;
            if (iArr[i] != -1) {
                if (iArr[i] == 10) {
                    m4207 = C2098.m4179(str, ".");
                } else {
                    m4207 = C2098.m4207(str);
                    m4207.append(this.f2227[i]);
                }
                str = m4207.toString();
            }
        }
        return str;
    }

    public double getDecimal() {
        return getEnteredNumber().remainder(BigDecimal.ONE).doubleValue();
    }

    public BigDecimal getEnteredNumber() {
        StringBuilder m4207;
        String str = "0";
        for (int i = this.f2221; i >= 0; i--) {
            int[] iArr = this.f2227;
            if (iArr[i] == -1) {
                break;
            }
            if (iArr[i] == 10) {
                m4207 = C2098.m4179(str, ".");
            } else {
                m4207 = C2098.m4207(str);
                m4207.append(this.f2227[i]);
            }
            str = m4207.toString();
        }
        if (this.f2225 == 1) {
            str = C2098.m4205("-", str);
        }
        return new BigDecimal(str);
    }

    public NumberPickerErrorTextView getErrorView() {
        return this.f2222;
    }

    public boolean getIsNegative() {
        return this.f2225 == 1;
    }

    public int getLayoutId() {
        return C2678.number_picker_view;
    }

    public BigInteger getNumber() {
        return getEnteredNumber().setScale(0, 3).toBigIntegerExact();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        view.performHapticFeedback(1);
        NumberPickerErrorTextView numberPickerErrorTextView = this.f2222;
        numberPickerErrorTextView.f2235.removeCallbacks(numberPickerErrorTextView.f2234);
        numberPickerErrorTextView.setVisibility(4);
        Integer num = (Integer) view.getTag(C2685.numbers_key);
        if (num != null) {
            m1154(num.intValue());
        } else if (view == this.f2210) {
            if (this.f2221 >= 0) {
                int i2 = 0;
                while (true) {
                    i = this.f2221;
                    if (i2 >= i) {
                        break;
                    }
                    int[] iArr = this.f2227;
                    int i3 = i2 + 1;
                    iArr[i2] = iArr[i3];
                    i2 = i3;
                }
                this.f2227[i] = -1;
                this.f2221 = i - 1;
            }
        } else if (view == this.f2224) {
            this.f2225 = this.f2225 == 0 ? 1 : 0;
        } else if (view == this.f2212 && m1151()) {
            m1154(10);
        }
        m1152();
        boolean z = this.f2221 != -1;
        ImageButton imageButton = this.f2210;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2214 = findViewById(C2685.divider);
        this.f2222 = (NumberPickerErrorTextView) findViewById(C2685.error);
        int i = 0;
        while (true) {
            int[] iArr = this.f2227;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = -1;
            i++;
        }
        View findViewById = findViewById(C2685.first);
        View findViewById2 = findViewById(C2685.second);
        View findViewById3 = findViewById(C2685.third);
        View findViewById4 = findViewById(C2685.fourth);
        this.f2229 = (NumberView) findViewById(C2685.number_text);
        ImageButton imageButton = (ImageButton) findViewById(C2685.delete);
        this.f2210 = imageButton;
        imageButton.setOnClickListener(this);
        this.f2210.setOnLongClickListener(this);
        Button[] buttonArr = this.f2217;
        int i2 = C2685.key_left;
        buttonArr[1] = (Button) findViewById.findViewById(i2);
        Button[] buttonArr2 = this.f2217;
        int i3 = C2685.key_middle;
        buttonArr2[2] = (Button) findViewById.findViewById(i3);
        Button[] buttonArr3 = this.f2217;
        int i4 = C2685.key_right;
        buttonArr3[3] = (Button) findViewById.findViewById(i4);
        this.f2217[4] = (Button) findViewById2.findViewById(i2);
        this.f2217[5] = (Button) findViewById2.findViewById(i3);
        this.f2217[6] = (Button) findViewById2.findViewById(i4);
        this.f2217[7] = (Button) findViewById3.findViewById(i2);
        this.f2217[8] = (Button) findViewById3.findViewById(i3);
        this.f2217[9] = (Button) findViewById3.findViewById(i4);
        this.f2224 = (Button) findViewById4.findViewById(i2);
        this.f2217[0] = (Button) findViewById4.findViewById(i3);
        this.f2212 = (Button) findViewById4.findViewById(i4);
        this.f2224.setEnabled(true);
        this.f2212.setEnabled(m1151());
        if (!m1151()) {
            this.f2212.setContentDescription(null);
        }
        for (int i5 = 0; i5 < 10; i5++) {
            this.f2217[i5].setOnClickListener(this);
            this.f2217[i5].setText(String.format("%d", Integer.valueOf(i5)));
            this.f2217[i5].setTag(C2685.numbers_key, new Integer(i5));
        }
        m1150();
        Resources resources = this.f2213.getResources();
        this.f2224.setText(resources.getString(C2676.number_picker_plus_minus));
        this.f2212.setText(resources.getString(C2676.number_picker_seperator));
        this.f2224.setOnClickListener(this);
        this.f2212.setOnClickListener(this);
        TextView textView = (TextView) findViewById(C2685.label);
        this.f2230 = textView;
        this.f2225 = 0;
        if (textView != null) {
            textView.setText(this.f2228);
        }
        m1156();
        m1152();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        NumberPickerErrorTextView numberPickerErrorTextView = this.f2222;
        numberPickerErrorTextView.f2235.removeCallbacks(numberPickerErrorTextView.f2234);
        numberPickerErrorTextView.setVisibility(4);
        ImageButton imageButton = this.f2210;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        for (int i = 0; i < this.f2211; i++) {
            this.f2227[i] = -1;
        }
        this.f2221 = -1;
        m1150();
        m1152();
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
        this.f2221 = savedState.f2231;
        int[] iArr = savedState.f2232;
        this.f2227 = iArr;
        if (iArr == null) {
            this.f2227 = new int[this.f2211];
            this.f2221 = -1;
        }
        this.f2225 = savedState.f2233;
        m1152();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2232 = this.f2227;
        savedState.f2233 = this.f2225;
        savedState.f2231 = this.f2221;
        return savedState;
    }

    public void setDecimalVisibility(int i) {
        Button button = this.f2212;
        if (button != null) {
            button.setVisibility(i);
        }
    }

    public void setLabelText(String str) {
        this.f2228 = str;
        TextView textView = this.f2230;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setMax(BigDecimal bigDecimal) {
    }

    public void setMin(BigDecimal bigDecimal) {
    }

    public void setNumber(Integer num, Double d, Integer num2) {
        this.f2225 = num2 != null ? num2.intValue() : 0;
        if (d != null) {
            double doubleValue = d.doubleValue();
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            decimalFormat.setMaximumFractionDigits(Integer.MAX_VALUE);
            String format = decimalFormat.format(doubleValue);
            m1155(TextUtils.substring(format, 2, format.length()));
            int i = this.f2221 + 1;
            this.f2221 = i;
            this.f2227[i] = 10;
        }
        if (num != null) {
            m1155(String.valueOf(num));
        }
        m1152();
    }

    public void setPlusMinusVisibility(int i) {
        Button button = this.f2224;
        if (button != null) {
            button.setVisibility(i);
        }
    }

    public void setSetButton(Button button) {
        this.f2216 = button;
        m1157();
    }

    public void setTheme(int i) {
        this.f2223 = i;
        if (i != -1) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment);
            this.f2215 = obtainStyledAttributes.getColorStateList(C2679.BetterPickersDialogFragment_bpTextColor);
            this.f2220 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpKeyBackground, this.f2220);
            this.f2226 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpButtonBackground, this.f2226);
            this.f2218 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogFragment_bpDividerColor, this.f2218);
            this.f2219 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpDeleteIcon, this.f2219);
        }
        m1156();
    }

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public void m1150() {
        String replaceAll = getEnteredNumberString().replaceAll("\\-", "");
        String[] split = replaceAll.split("\\.");
        if (split.length >= 2) {
            if (split[0].equals("")) {
                this.f2229.setNumber("0", split[1], m1153(), this.f2225 == 1);
                return;
            } else {
                this.f2229.setNumber(split[0], split[1], m1153(), this.f2225 == 1);
                return;
            }
        }
        if (split.length == 1) {
            this.f2229.setNumber(split[0], "", m1153(), this.f2225 == 1);
        } else if (replaceAll.equals(".")) {
            this.f2229.setNumber("0", "", true, this.f2225 == 1);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m1151() {
        return !m1153();
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final void m1152() {
        this.f2212.setEnabled(m1151());
        m1150();
        m1157();
        boolean z = this.f2221 != -1;
        ImageButton imageButton = this.f2210;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final boolean m1153() {
        boolean z = false;
        for (int i : this.f2227) {
            if (i == 10) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1154(int i) {
        if (this.f2221 < this.f2211 - 1) {
            int[] iArr = this.f2227;
            if (iArr[0] == 0 && iArr[1] == -1 && !m1153() && i != 10) {
                this.f2227[0] = i;
                return;
            }
            for (int i2 = this.f2221; i2 >= 0; i2--) {
                int[] iArr2 = this.f2227;
                iArr2[i2 + 1] = iArr2[i2];
            }
            this.f2221++;
            this.f2227[0] = i;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1155(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            int i = this.f2221 + 1;
            this.f2221 = i;
            this.f2227[i] = str.charAt(length) - '0';
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final void m1156() {
        for (Button button : this.f2217) {
            if (button != null) {
                button.setTextColor(this.f2215);
                button.setBackgroundResource(this.f2220);
            }
        }
        View view = this.f2214;
        if (view != null) {
            view.setBackgroundColor(this.f2218);
        }
        Button button2 = this.f2224;
        if (button2 != null) {
            button2.setTextColor(this.f2215);
            this.f2224.setBackgroundResource(this.f2220);
        }
        Button button3 = this.f2212;
        if (button3 != null) {
            button3.setTextColor(this.f2215);
            this.f2212.setBackgroundResource(this.f2220);
        }
        ImageButton imageButton = this.f2210;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.f2226);
            this.f2210.setImageDrawable(getResources().getDrawable(this.f2219));
        }
        NumberView numberView = this.f2229;
        if (numberView != null) {
            numberView.setTheme(this.f2223);
        }
        TextView textView = this.f2230;
        if (textView != null) {
            textView.setTextColor(this.f2215);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m1157() {
        Button button = this.f2216;
        if (button == null) {
            return;
        }
        int i = this.f2221;
        if (i == -1) {
            button.setEnabled(false);
        } else {
            button.setEnabled(i >= 0);
        }
    }
}
