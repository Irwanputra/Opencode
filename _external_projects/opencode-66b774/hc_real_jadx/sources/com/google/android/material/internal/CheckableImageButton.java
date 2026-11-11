package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.customview.view.AbsSavedState;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p050.C1264;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final int[] f3314 = {R.attr.state_checked};

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public boolean f3315;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f3316;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f3317;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0448();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public boolean f3318;

        /* renamed from: com.google.android.material.internal.CheckableImageButton$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0448 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3318 = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeInt(this.f3318 ? 1 : 0);
        }
    }

    /* renamed from: com.google.android.material.internal.CheckableImageButton$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0449 extends C1102 {
        public C0449() {
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: くし〴〺ぅ */
        public void mo430(View view, AccessibilityEvent accessibilityEvent) {
            this.f5594.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            c1084.f5550.setCheckable(CheckableImageButton.this.f3315);
            c1084.f5550.setChecked(CheckableImageButton.this.isChecked());
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1264.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3315 = true;
        this.f3316 = true;
        C1096.m2490(this, new C0449());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f3317;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f3317) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = f3314;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        setChecked(savedState.f3318);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3318 = this.f3317;
        return savedState;
    }

    public void setCheckable(boolean z) {
        if (this.f3315 != z) {
            this.f3315 = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f3315 || this.f3317 == z) {
            return;
        }
        this.f3317 = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f3316 = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f3316) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f3317);
    }
}
