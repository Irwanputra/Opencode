package com.codetroopers.betterpickers.timepicker;

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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DateFormatSymbols;
import p131.p221.p222.C2676;
import p131.p221.p222.C2678;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;
import p131.p221.p222.C2683;
import p131.p221.p222.C2685;

/* loaded from: /tmp/opencode/hc_real.dex */
public class TimePicker extends LinearLayout implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public ImageButton f2288;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2289;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Button f2290;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final Context f2291;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public boolean f2292;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public View f2293;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public Button f2294;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Button[] f2295;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f2296;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public int f2297;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public ColorStateList f2298;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2299;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public String[] f2300;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f2301;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public Button f2302;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final String f2303;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f2304;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int[] f2305;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int f2306;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f2307;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public TimerView f2308;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public TextView f2309;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0350();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2310;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public int[] f2311;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public int f2312;

        /* renamed from: com.codetroopers.betterpickers.timepicker.TimePicker$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0350 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, C0351 c0351) {
            super(parcel);
            this.f2310 = parcel.readInt();
            parcel.readIntArray(this.f2311);
            this.f2312 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2310);
            parcel.writeIntArray(this.f2311);
            parcel.writeInt(this.f2312);
        }
    }

    public TimePicker(Context context) {
        this(context, null);
    }

    public TimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2289 = 4;
        this.f2295 = new Button[10];
        this.f2305 = new int[4];
        this.f2299 = -1;
        this.f2292 = false;
        this.f2306 = -1;
        this.f2291 = context;
        this.f2292 = DateFormat.is24HourFormat(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(getLayoutId(), this);
        this.f2303 = context.getResources().getString(C2676.time_picker_ampm_label);
        this.f2298 = getResources().getColorStateList(C2680.dialog_text_color_holo_dark);
        this.f2304 = C2683.key_background_dark;
        this.f2296 = C2683.button_background_dark;
        this.f2297 = getResources().getColor(C2680.default_divider_color_dark);
        this.f2301 = C2683.ic_backspace_dark;
    }

    private int getEnteredTime() {
        int[] iArr = this.f2305;
        return (iArr[1] * 10) + (iArr[2] * 100) + (iArr[3] * 1000) + iArr[0];
    }

    private void setKeyRange(int i) {
        int i2 = 0;
        while (true) {
            Button[] buttonArr = this.f2295;
            if (i2 >= buttonArr.length) {
                return;
            }
            buttonArr[i2].setEnabled(i2 <= i);
            i2++;
        }
    }

    public int getHours() {
        int[] iArr = this.f2305;
        int i = (iArr[3] * 10) + iArr[2];
        if (i == 12) {
            int i2 = this.f2307;
            if (i2 == 1) {
                return 12;
            }
            if (i2 == 2) {
                return 0;
            }
            if (i2 == 3) {
                return i;
            }
        }
        return i + (this.f2307 == 1 ? 12 : 0);
    }

    public int getLayoutId() {
        return C2678.time_picker_view;
    }

    public int getMinutes() {
        int[] iArr = this.f2305;
        return (iArr[1] * 10) + iArr[0];
    }

    public int getTime() {
        int[] iArr = this.f2305;
        return (iArr[1] * 10) + (iArr[2] * 60) + (iArr[3] * 600) + (iArr[4] * 3600) + iArr[0];
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i;
        view.performHapticFeedback(1);
        Integer num = (Integer) view.getTag(C2685.numbers_key);
        if (num != null) {
            m1166(num.intValue());
        } else if (view == this.f2288) {
            if (!this.f2292 && this.f2307 != 0) {
                this.f2307 = 0;
            } else if (this.f2299 >= 0) {
                int i2 = 0;
                while (true) {
                    i = this.f2299;
                    if (i2 >= i) {
                        break;
                    }
                    int[] iArr = this.f2305;
                    int i3 = i2 + 1;
                    iArr[i2] = iArr[i3];
                    i2 = i3;
                }
                this.f2305[i] = 0;
                this.f2299 = i - 1;
            }
        } else if (view == this.f2302) {
            getEnteredTime();
            if (!this.f2292) {
                if (m1164()) {
                    m1166(0);
                    m1166(0);
                }
                this.f2307 = 2;
            } else if (m1164()) {
                m1166(0);
                m1166(0);
            }
        } else if (view == this.f2290) {
            getEnteredTime();
            if (!this.f2292) {
                if (m1164()) {
                    m1166(0);
                    m1166(0);
                }
                this.f2307 = 1;
            } else if (m1164()) {
                m1166(3);
                m1166(0);
            }
        }
        m1167();
        boolean z = this.f2299 != -1;
        ImageButton imageButton = this.f2288;
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
        this.f2308 = (TimerView) findViewById(C2685.timer_time_text);
        ImageButton imageButton = (ImageButton) findViewById(C2685.delete);
        this.f2288 = imageButton;
        imageButton.setOnClickListener(this);
        this.f2288.setOnLongClickListener(this);
        Button[] buttonArr = this.f2295;
        int i = C2685.key_left;
        buttonArr[1] = (Button) findViewById.findViewById(i);
        Button[] buttonArr2 = this.f2295;
        int i2 = C2685.key_middle;
        buttonArr2[2] = (Button) findViewById.findViewById(i2);
        Button[] buttonArr3 = this.f2295;
        int i3 = C2685.key_right;
        buttonArr3[3] = (Button) findViewById.findViewById(i3);
        this.f2295[4] = (Button) findViewById2.findViewById(i);
        this.f2295[5] = (Button) findViewById2.findViewById(i2);
        this.f2295[6] = (Button) findViewById2.findViewById(i3);
        this.f2295[7] = (Button) findViewById3.findViewById(i);
        this.f2295[8] = (Button) findViewById3.findViewById(i2);
        this.f2295[9] = (Button) findViewById3.findViewById(i3);
        this.f2302 = (Button) findViewById4.findViewById(i);
        this.f2295[0] = (Button) findViewById4.findViewById(i2);
        this.f2290 = (Button) findViewById4.findViewById(i3);
        setLeftRightEnabled(false);
        for (int i4 = 0; i4 < 10; i4++) {
            this.f2295[i4].setOnClickListener(this);
            this.f2295[i4].setText(String.format("%d", Integer.valueOf(i4)));
            this.f2295[i4].setTag(C2685.numbers_key, new Integer(i4));
        }
        m1168();
        Resources resources = this.f2291.getResources();
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.f2300 = amPmStrings;
        if (this.f2292) {
            this.f2302.setText(resources.getString(C2676.time_picker_00_label));
            this.f2290.setText(resources.getString(C2676.time_picker_30_label));
        } else {
            this.f2302.setText(amPmStrings[0]);
            this.f2290.setText(this.f2300[1]);
        }
        this.f2302.setOnClickListener(this);
        this.f2290.setOnClickListener(this);
        this.f2309 = (TextView) findViewById(C2685.ampm_label);
        this.f2307 = 0;
        this.f2293 = findViewById(C2685.divider);
        m1169();
        m1167();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        view.performHapticFeedback(0);
        ImageButton imageButton = this.f2288;
        if (view != imageButton) {
            return false;
        }
        imageButton.setPressed(false);
        this.f2307 = 0;
        for (int i = 0; i < this.f2289; i++) {
            this.f2305[i] = 0;
        }
        this.f2299 = -1;
        m1168();
        m1167();
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
        this.f2299 = savedState.f2310;
        int[] iArr = savedState.f2311;
        this.f2305 = iArr;
        if (iArr == null) {
            this.f2305 = new int[this.f2289];
            this.f2299 = -1;
        }
        this.f2307 = savedState.f2312;
        m1167();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2311 = this.f2305;
        savedState.f2312 = this.f2307;
        savedState.f2310 = this.f2299;
        return savedState;
    }

    public void setLeftRightEnabled(boolean z) {
        this.f2302.setEnabled(z);
        this.f2290.setEnabled(z);
        if (z) {
            return;
        }
        this.f2302.setContentDescription(null);
        this.f2290.setContentDescription(null);
    }

    public void setSetButton(Button button) {
        this.f2294 = button;
        m1165();
    }

    public void setTheme(int i) {
        this.f2306 = i;
        if (i != -1) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, C2679.BetterPickersDialogFragment);
            this.f2298 = obtainStyledAttributes.getColorStateList(C2679.BetterPickersDialogFragment_bpTextColor);
            this.f2304 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpKeyBackground, this.f2304);
            this.f2296 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpButtonBackground, this.f2296);
            this.f2297 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogFragment_bpDividerColor, this.f2297);
            this.f2301 = obtainStyledAttributes.getResourceId(C2679.BetterPickersDialogFragment_bpDeleteIcon, this.f2301);
        }
        m1169();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final boolean m1164() {
        int i;
        int enteredTime = getEnteredTime();
        return !this.f2292 ? enteredTime >= 1 && enteredTime <= 12 : enteredTime >= 0 && enteredTime <= 23 && (i = this.f2299) > -1 && i < 2;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1165() {
        Button button = this.f2294;
        if (button == null) {
            return;
        }
        if (this.f2299 == -1) {
            button.setEnabled(false);
            return;
        }
        if (!this.f2292) {
            button.setEnabled(this.f2307 != 0);
            return;
        }
        int enteredTime = getEnteredTime();
        Button button2 = this.f2294;
        if (this.f2299 >= 2 && (enteredTime < 60 || enteredTime > 95)) {
            r3 = true;
        }
        button2.setEnabled(r3);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1166(int i) {
        int i2 = this.f2299;
        if (i2 < this.f2289 - 1) {
            while (i2 >= 0) {
                int[] iArr = this.f2305;
                iArr[i2 + 1] = iArr[i2];
                i2--;
            }
            this.f2299++;
            this.f2305[0] = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x023c, code lost:
    
        if (r1 >= 236) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        if (r6 == 1) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0285, code lost:
    
        if (r1 >= 126) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009c, code lost:
    
        if (r6 == 1) goto L64;
     */
    /* renamed from: づざかべべ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1167() {
        /*
            Method dump skipped, instructions count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.timepicker.TimePicker.m1167():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r7 <= 25) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0049, code lost:
    
        if (r7 <= 15) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0043  */
    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1168() {
        /*
            r9 = this;
            r9.getEnteredTime()
            int r0 = r9.f2299
            r1 = 2
            r2 = -1
            if (r0 <= r2) goto L54
            r3 = -2
            r4 = 3
            if (r0 < 0) goto L23
            int[] r5 = r9.f2305
            r5 = r5[r0]
            boolean r6 = r9.f2292
            r7 = 9
            if (r6 == 0) goto L1b
            if (r5 < r4) goto L1b
            if (r5 <= r7) goto L21
        L1b:
            if (r6 != 0) goto L23
            if (r5 < r1) goto L23
            if (r5 > r7) goto L23
        L21:
            r5 = -2
            goto L24
        L23:
            r5 = -1
        L24:
            if (r0 <= 0) goto L4c
            if (r0 >= r4) goto L4c
            if (r5 == r3) goto L4c
            int[] r6 = r9.f2305
            r7 = r6[r0]
            int r7 = r7 * 10
            int r8 = r0 + (-1)
            r6 = r6[r8]
            int r7 = r7 + r6
            boolean r6 = r9.f2292
            if (r6 == 0) goto L41
            r8 = 24
            if (r7 < r8) goto L41
            r8 = 25
            if (r7 <= r8) goto L4d
        L41:
            if (r6 != 0) goto L4c
            r6 = 13
            if (r7 < r6) goto L4c
            r6 = 15
            if (r7 > r6) goto L4c
            goto L4d
        L4c:
            r3 = r5
        L4d:
            if (r0 != r4) goto L55
            int[] r3 = r9.f2305
            r3 = r3[r4]
            goto L55
        L54:
            r3 = -1
        L55:
            if (r0 >= r1) goto L59
            r1 = -1
            goto L5d
        L59:
            int[] r4 = r9.f2305
            r1 = r4[r1]
        L5d:
            r4 = 1
            if (r0 >= r4) goto L62
            r4 = -1
            goto L66
        L62:
            int[] r5 = r9.f2305
            r4 = r5[r4]
        L66:
            if (r0 >= 0) goto L69
            goto L6e
        L69:
            int[] r0 = r9.f2305
            r2 = 0
            r2 = r0[r2]
        L6e:
            com.codetroopers.betterpickers.timepicker.TimerView r0 = r9.f2308
            r0.setTime(r3, r1, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.timepicker.TimePicker.m1168():void");
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final void m1169() {
        for (Button button : this.f2295) {
            if (button != null) {
                button.setTextColor(this.f2298);
                button.setBackgroundResource(this.f2304);
            }
        }
        View view = this.f2293;
        if (view != null) {
            view.setBackgroundColor(this.f2297);
        }
        Button button2 = this.f2302;
        if (button2 != null) {
            button2.setTextColor(this.f2298);
            this.f2302.setBackgroundResource(this.f2304);
        }
        TextView textView = this.f2309;
        if (textView != null) {
            textView.setTextColor(this.f2298);
            this.f2309.setBackgroundResource(this.f2304);
        }
        Button button3 = this.f2290;
        if (button3 != null) {
            button3.setTextColor(this.f2298);
            this.f2290.setBackgroundResource(this.f2304);
        }
        ImageButton imageButton = this.f2288;
        if (imageButton != null) {
            imageButton.setBackgroundResource(this.f2296);
            this.f2288.setImageDrawable(getResources().getDrawable(this.f2301));
        }
        TimerView timerView = this.f2308;
        if (timerView != null) {
            timerView.setTheme(this.f2306);
        }
    }
}
