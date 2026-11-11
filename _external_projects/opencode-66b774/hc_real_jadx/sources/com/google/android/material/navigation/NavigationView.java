package com.google.android.material.navigation;

import android.R;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import p034.p035.p043.C1067;
import p034.p035.p045.C1072;
import p034.p035.p045.C1096;
import p034.p050.C1264;
import p034.p050.p051.C1158;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p055.p056.C1266;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p185.C2259;
import p131.p161.p162.p163.p185.C2272;
import team.dev.epro.apkcustom.MainActivity;

/* loaded from: /tmp/opencode/hc_real.dex */
public class NavigationView extends ScrimInsetsFrameLayout {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final C2272 f3352;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C2259 f3353;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final int f3354;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public MenuInflater f3355;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public ViewTreeObserver.OnGlobalLayoutListener f3356;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public InterfaceC0454 f3357;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final int[] f3358;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public static final int[] f3351 = {R.attr.state_checked};

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final int[] f3350 = {-16842910};

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public static final int f3349 = C2350.Widget_Design_NavigationView;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0453();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Bundle f3359;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0453 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f3359 = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeBundle(this.f3359);
        }
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0454 {
    }

    /* renamed from: com.google.android.material.navigation.NavigationView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0455 implements C1164.InterfaceC1166 {
        public C0455() {
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: 〺つふすそ */
        public void mo141(C1164 c1164) {
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: げつ〴ぬぐ */
        public boolean mo142(C1164 c1164, MenuItem menuItem) {
            InterfaceC0454 interfaceC0454 = NavigationView.this.f3357;
            if (interfaceC0454 == null) {
                return false;
            }
            MainActivity mainActivity = (MainActivity) interfaceC0454;
            mainActivity.getClass();
            mainActivity.f3785 = menuItem.getItemId();
            ProgressDialog progressDialog = new ProgressDialog(mainActivity, 2131886321);
            mainActivity.f3803 = progressDialog;
            progressDialog.setMessage("Loading...");
            mainActivity.f3803.show();
            mainActivity.f3793.m435(8388611);
            return true;
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f3355 == null) {
            this.f3355 = new C1158(getContext());
        }
        return this.f3355;
    }

    public MenuItem getCheckedItem() {
        return this.f3352.f9480.f9493;
    }

    public int getHeaderCount() {
        return this.f3352.f9473.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.f3352.f9478;
    }

    public int getItemHorizontalPadding() {
        return this.f3352.f9481;
    }

    public int getItemIconPadding() {
        return this.f3352.f9484;
    }

    public ColorStateList getItemIconTintList() {
        return this.f3352.f9486;
    }

    public int getItemMaxLines() {
        return this.f3352.f9476;
    }

    public ColorStateList getItemTextColor() {
        return this.f3352.f9469;
    }

    public Menu getMenu() {
        return this.f3353;
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2163) {
            C1687.m3669(this, (C2163) background);
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.f3356);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f3356);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int min;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                min = this.f3354;
            }
            super.onMeasure(i, i2);
        }
        min = Math.min(View.MeasureSpec.getSize(i), this.f3354);
        i = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        this.f3353.m2634(savedState.f3359);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f3359 = bundle;
        this.f3353.m2616(bundle);
        return savedState;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f3353.findItem(i);
        if (findItem != null) {
            this.f3352.f9480.m4444((C1197) findItem);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        C1687.m3731(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        C2272 c2272 = this.f3352;
        c2272.f9478 = drawable;
        c2272.mo119(false);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C1067.m2406(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        C2272 c2272 = this.f3352;
        c2272.f9481 = i;
        c2272.mo119(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f3352.m4440(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        C2272 c2272 = this.f3352;
        c2272.f9484 = i;
        c2272.mo119(false);
    }

    public void setItemIconPaddingResource(int i) {
        this.f3352.m4441(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        C2272 c2272 = this.f3352;
        if (c2272.f9472 != i) {
            c2272.f9472 = i;
            c2272.f9470 = true;
            c2272.mo119(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C2272 c2272 = this.f3352;
        c2272.f9486 = colorStateList;
        c2272.mo119(false);
    }

    public void setItemMaxLines(int i) {
        C2272 c2272 = this.f3352;
        c2272.f9476 = i;
        c2272.mo119(false);
    }

    public void setItemTextAppearance(int i) {
        C2272 c2272 = this.f3352;
        c2272.f9466 = i;
        c2272.f9485 = true;
        c2272.mo119(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C2272 c2272 = this.f3352;
        c2272.f9469 = colorStateList;
        c2272.mo119(false);
    }

    public void setNavigationItemSelectedListener(InterfaceC0454 interfaceC0454) {
        this.f3357 = interfaceC0454;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C2272 c2272 = this.f3352;
        if (c2272 != null) {
            c2272.f9475 = i;
            NavigationMenuView navigationMenuView = c2272.f9467;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ColorStateList m1446(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList m2929 = C1266.m2929(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(C1264.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = m2929.getDefaultColor();
        int[] iArr = f3350;
        return new ColorStateList(new int[][]{iArr, f3351, FrameLayout.EMPTY_STATE_SET}, new int[]{m2929.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public View m1447(int i) {
        return this.f3352.f9473.getChildAt(i);
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    /* renamed from: げつ〴ぬぐ */
    public void mo1444(C1072 c1072) {
        C2272 c2272 = this.f3352;
        c2272.getClass();
        int m2424 = c1072.m2424();
        if (c2272.f9482 != m2424) {
            c2272.f9482 = m2424;
            c2272.m4443();
        }
        NavigationMenuView navigationMenuView = c2272.f9467;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, c1072.m2420());
        C1096.m2516(c2272.f9473, c1072);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f3353.findItem(menuItem.getItemId());
        if (findItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.f3352.f9480.m4444((C1197) findItem);
    }
}
