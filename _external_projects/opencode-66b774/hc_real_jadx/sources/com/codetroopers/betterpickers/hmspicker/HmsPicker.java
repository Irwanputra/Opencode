package com.codetroopers.betterpickers.hmspicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import p131.p221.p222.C2676;
import p131.p221.p222.C2678;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2683;
import p131.p221.p222.C2685;

/* loaded from: /tmp/opencode/hc_real.dex */
public class HmsPicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public Button f2178;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2179;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Button f2180;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Context f2181;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public ColorStateList f2182;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public int f2183;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public View f2184;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Button[] f2185;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f2186;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f2187;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public int f2188;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2189;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public TextView f2190;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f2191;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public ImageButton f2192;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public TextView f2193;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f2194;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int[] f2195;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Button f2196;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public HmsView f2197;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public TextView f2198;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0344();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2199;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int[] f2200;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f2201;

        /* renamed from: com.codetroopers.betterpickers.hmspicker.HmsPicker$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0344 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, C0345 c0345) {
            super(parcel);
            this.f2199 = parcel.readInt();
            this.f2200 = parcel.createIntArray();
            this.f2201 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2199);
            parcel.writeIntArray(this.f2200);
            parcel.writeInt(this.f2201);
        }
    }

    public HmsPicker(Context context) {
        this(context, null);
    }

    public HmsPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2179 = 5;
        this.f2185 = new Button[10];
        this.f2195 = new int[5];
        this.f2189 = -1;
        this.f2187 = -1;
        this.f2181 = context;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.f2182 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
        this.f2183 = C2683.key_background_dark;
        this.f2188 = C2683.button_background_dark;
        this.f2194 = getResources().getColor(C2680.default_divider_color_dark);
        this.f2186 = C2683.ic_backspace_dark;
    }

    public int getHours() {
        return this.f2195[4];
    }

    public int getLayoutId() {
        return C2678.hms_picker_view;
    }

    public int getMinutes() {
        int[] iArr = this.f2195;
        return (iArr[3] * 10) + iArr[2];
    }

    public int getSeconds() {
        int[] iArr = this.f2195;
        return (iArr[1] * 10) + iArr[0];
    }

    public int getTime() {
        int[] iArr = this.f2195;
        return (iArr[1] * 10) + (iArr[2] * 60) + (iArr[3] * 600) + (iArr[4] * 3600) + iArr[0];
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        view.performHapticFeedback(1);
        Integer num = (Integer) view.getTag(C2685.numbers_key);
        if (num != null) {
            int intValue = num.intValue();
            int i2 = this.f2189;
            if (i2 < this.f2179 - 1 && (i2 != -1 || intValue != 0)) {
                while (i2 >= 0) {
                    int[] iArr = this.f2195;
                    iArr[i2 + 1] = iArr[i2];
                    i2--;
                }
                this.f2189++;
                this.f2195[0] = intValue;
            }
        } else if (view == this.f2192) {
            if (this.f2189 >= 0) {
                int i3 = 0;
                while (true) {
                    i = this.f2189;
                    if (i3 >= i) {
                        break;
                    }
                    int[] iArr2 = this.f2195;
                    int i4 = i3 + 1;
                    iArr2[i3] = iArr2[i4];
                    i3 = i4;
                }
                this.f2195[i] = 0;
                this.f2189 = i - 1;
            }
        } else if (view == this.f2180) {
            if (this.f2191 == 1) {
                this.f2191 = 0;
            } else {
                this.f2191 = 1;
            }
        }
        m1149();
        boolean z = this.f2189 != -1;
        ImageButton imageButton = this.f2192;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(C2685.first);
        View findViewById2 = findViewById(C2685.second);
        View findViewById3 = findViewById(C2685.third);
        View findViewById4 = findViewById(C2685.fourth);
        this.f2197 = (HmsView) findViewById(C2685.hms_text);
        ImageButton imageButton = (ImageButton) findViewById(C2685.delete);
        this.f2192 = imageButton;
        imageButton.setOnClickListener(this);
        this.f2192.setOnLongClickListener(this);
        Button[] buttonArr = this.f2185;
        int i = C2685.key_left;
        buttonArr[1] = (Button) findViewById.findViewById(i);
        Button[] buttonArr2 = this.f2185;
        int i2 = C2685.key_middle;
        buttonArr2[2] = (Button) findViewById.findViewById(i2);
        Button[] buttonArr3 = this.f2185;
        int i3 = C2685.key_right;
        buttonArr3[3] = (Button) findViewById.findViewById(i3);
        this.f2185[4] = (Button) findViewById2.findViewById(i);
        this.f2185[5] = (Button) findViewById2.findViewById(i2);
        this.f2185[6] = (Button) findViewById2.findViewById(i3);
        this.f2185[7] = (Button) findViewById3.findViewById(i);
        this.f2185[8] = (Button) findViewById3.findViewById(i2);
        this.f2185[9] = (Button) findViewById3.findViewById(i3);
        this.f2180 = (Button) findViewById4.findViewById(i);
        this.f2185[0] = (Button) findViewById4.findViewById(i2);
        this.f2178 = (Button) findViewById4.findViewById(i3);
        setRightEnabled(false);
        for (int i4 = 0; i4 < 10; i4++) {
            this.f2185[i4].setOnClickListener(this);
            this.f2185[i4].setText(String.format("%d", Integer.valueOf(i4)));
            this.f2185[i4].setTag(C2685.numbers_key, new Integer(i4));
        }
        m1147();
        this.f2180.setText(this.f2181.getResources().getString(C2676.number_picker_plus_minus));
        this.f2180.setOnClickListener(this);
        this.f2198 = (TextView) findViewById(C2685.hours_label);
        this.f2190 = (TextView) findViewById(C2685.minutes_label);
        this.f2193 = (TextView) findViewById(C2685.seconds_label);
        this.f2184 = findViewById(C2685.divider);
        m1146();
        m1149();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        ImageButton imageButton = this.f2192;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        for (int i = 0; i < this.f2179; i++) {
            this.f2195[i] = 0;
        }
        this.f2189 = -1;
        m1147();
        m1149();
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
        this.f2189 = savedState.f2199;
        int[] iArr = savedState.f2200;
        this.f2195 = iArr;
        if (iArr == null) {
            this.f2195 = new int[this.f2179];
            this.f2189 = -1;
        }
        m1149();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2200 = this.f2195;
        savedState.f2199 = this.f2189;
        return savedState;
    }

    public void setPlusMinusVisibility(int i) {
        Button button = this.f2180;
        if (button != null) {
            button.setVisibility(i);
        }
    }

    public void setRightEnabled(boolean z) {
        this.f2178.setEnabled(z);
        if (z) {
            return;
        }
        this.f2178.setContentDescription(null);
    }

    public void setSetButton(Button button) {
        this.f2196 = button;
        m1148();
    }

    public void setTheme(int i) {
        this.f2187 = i;
        if (i != -1) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment);
            this.f2182 = obtainStyledAttributes.getColorStateList(C2679.BetterPickersDialogFragment_bpTextColor);
            this.f2183 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpKeyBackground, this.f2183);
            this.f2188 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpButtonBackground, this.f2188);
            this.f2194 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogFragment_bpDividerColor, this.f2194);
            this.f2186 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpDeleteIcon, this.f2186);
        }
        m1146();
    }

    public void setTime(int i, int i2, int i3) {
        int[] iArr = this.f2195;
        int i4 = 4;
        iArr[4] = i;
        iArr[3] = i2 / 10;
        iArr[2] = i2 % 10;
        iArr[1] = i3 / 10;
        iArr[0] = i3 % 10;
        while (true) {
            if (i4 < 0) {
                break;
            }
            if (this.f2195[i4] > 0) {
                this.f2189 = i4;
                break;
            }
            i4--;
        }
        m1149();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1146() {
        for (Button button : this.f2185) {
            if (button != null) {
                button.setTextColor(this.f2182);
                button.setBackgroundResource(this.f2183);
            }
        }
        View view = this.f2184;
        if (view != null) {
            view.setBackgroundColor(this.f2194);
        }
        TextView textView = this.f2198;
        if (textView != null) {
            textView.setTextColor(this.f2182);
            this.f2198.setBackgroundResource(this.f2183);
        }
        TextView textView2 = this.f2190;
        if (textView2 != null) {
            textView2.setTextColor(this.f2182);
            this.f2190.setBackgroundResource(this.f2183);
        }
        TextView textView3 = this.f2193;
        if (textView3 != null) {
            textView3.setTextColor(this.f2182);
            this.f2193.setBackgroundResource(this.f2183);
        }
        ImageButton imageButton = this.f2192;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.f2188);
            this.f2192.setImageDrawable(getResources().getDrawable(this.f2186));
        }
        HmsView hmsView = this.f2197;
        if (hmsView != null) {
            hmsView.setTheme(this.f2187);
        }
        Button button2 = this.f2180;
        if (button2 != null) {
            button2.setTextColor(this.f2182);
            this.f2180.setBackgroundResource(this.f2183);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public void m1147() {
        HmsView hmsView = this.f2197;
        boolean z = this.f2191 == 1;
        int[] iArr = this.f2195;
        hmsView.setTime(z, iArr[4], iArr[3], iArr[2], iArr[1], iArr[0]);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1148() {
        Button button = this.f2196;
        if (button == null) {
            return;
        }
        int i = this.f2189;
        if (i == -1) {
            button.setEnabled(false);
        } else {
            button.setEnabled(i >= 0);
        }
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m1149() {
        m1147();
        m1148();
        boolean z = this.f2189 != -1;
        ImageButton imageButton = this.f2192;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
    }
}
