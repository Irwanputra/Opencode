package com.codetroopers.betterpickers.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Method;
import p034.p035.p045.C1115;
import p131.p155.p156.p157.C2098;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;

/* loaded from: /tmp/opencode/hc_real.dex */
public class UnderlinePageIndicatorPicker extends View implements ViewPager.InterfaceC0308 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public float f2321;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public int f2322;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2323;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public float f2324;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final Paint f2325;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ViewPager.InterfaceC0308 f2326;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public boolean f2327;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f2328;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public PickerLinearLayout f2329;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public ViewPager f2330;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public Paint f2331;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f2332;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f2333;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0352();

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public int f2334;

        /* renamed from: com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0352 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcel parcel, C0353 c0353) {
            super(parcel);
            this.f2334 = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2334);
        }
    }

    public UnderlinePageIndicatorPicker(Context context) {
        this(context, null);
    }

    public UnderlinePageIndicatorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2325 = new Paint(1);
        this.f2324 = -1.0f;
        this.f2333 = -1;
        this.f2329 = null;
    }

    public UnderlinePageIndicatorPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2325 = new Paint(1);
        this.f2324 = -1.0f;
        this.f2333 = -1;
        this.f2329 = null;
        this.f2322 = getResources().getColor(C2680.dialog_text_color_holo_dark);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2679.BetterPickersDialogFragment, i, 0);
        this.f2322 = obtainStyledAttributes.getColor(C2679.BetterPickersDialogFragment_bpKeyboardIndicatorColor, this.f2322);
        Paint paint = new Paint();
        this.f2331 = paint;
        paint.setAntiAlias(true);
        this.f2331.setStyle(Paint.Style.FILL);
        obtainStyledAttributes.recycle();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Method method = C1115.f5613;
        this.f2332 = viewConfiguration.getScaledPagingTouchSlop();
    }

    public int getSelectedColor() {
        return this.f2325.getColor();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        PickerLinearLayout pickerLinearLayout;
        int i;
        super.onDraw(canvas);
        int mo1135 = this.f2330.getAdapter().mo1135();
        if (isInEditMode() || mo1135 == 0 || (pickerLinearLayout = this.f2329) == null) {
            return;
        }
        View mo1139 = pickerLinearLayout.mo1139(this.f2323);
        float left = mo1139.getLeft();
        float right = mo1139.getRight();
        if (this.f2321 > 0.0f && (i = this.f2323) < mo1135 - 1) {
            View mo11392 = this.f2329.mo1139(i + 1);
            float left2 = mo11392.getLeft();
            float right2 = mo11392.getRight();
            float f = this.f2321;
            left = C2098.m4188(1.0f, f, left, left2 * f);
            right = C2098.m4188(1.0f, f, right, right2 * f);
        }
        canvas.drawRect(left, getPaddingBottom(), right, getHeight() - getPaddingBottom(), this.f2325);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f2323 = savedState.f2334;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f2334 = this.f2323;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c5, code lost:
    
        if (r2 != 0) goto L47;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.codetroopers.betterpickers.widget.UnderlinePageIndicatorPicker.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCurrentItem(int i) {
        ViewPager viewPager = this.f2330;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(i);
        this.f2323 = i;
        invalidate();
    }

    public void setOnPageChangeListener(ViewPager.InterfaceC0308 interfaceC0308) {
        this.f2326 = interfaceC0308;
    }

    public void setSelectedColor(int i) {
        this.f2325.setColor(i);
        invalidate();
    }

    public void setTitleView(PickerLinearLayout pickerLinearLayout) {
        this.f2329 = pickerLinearLayout;
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f2330;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f2330 = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager, int i) {
        setViewPager(viewPager);
        setCurrentItem(i);
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
    /* renamed from: 〺つふすそ */
    public void mo1059(int i) {
        this.f2328 = i;
        ViewPager.InterfaceC0308 interfaceC0308 = this.f2326;
        if (interfaceC0308 != null) {
            interfaceC0308.mo1059(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
    /* renamed from: くし〴〺ぅ */
    public void mo1060(int i) {
        if (this.f2328 == 0) {
            this.f2323 = i;
            this.f2321 = 0.0f;
            invalidate();
        }
        ViewPager.InterfaceC0308 interfaceC0308 = this.f2326;
        if (interfaceC0308 != null) {
            interfaceC0308.mo1060(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0308
    /* renamed from: げつ〴ぬぐ */
    public void mo1061(int i, float f, int i2) {
        this.f2323 = i;
        this.f2321 = f;
        invalidate();
        ViewPager.InterfaceC0308 interfaceC0308 = this.f2326;
        if (interfaceC0308 != null) {
            interfaceC0308.mo1061(i, f, i2);
        }
    }
}
