package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.customview.view.AbsSavedState;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p043.C1067;
import p034.p035.p045.C1096;
import p034.p050.p051.C1158;
import p034.p050.p051.p052.C1164;
import p034.p050.p053.C1260;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2224;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p164.p165.C2112;
import p131.p161.p162.p163.p171.C2156;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p180.C2233;
import p131.p161.p162.p163.p180.C2234;
import p131.p161.p162.p163.p181.C2235;
import p131.p161.p162.p163.p185.C2255;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BottomNavigationView extends FrameLayout {

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static final int f3084 = C2350.Widget_Design_BottomNavigationView;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public InterfaceC0407 f3085;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C1164 f3086;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public InterfaceC0408 f3087;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final BottomNavigationMenuView f3088;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ColorStateList f3089;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public MenuInflater f3090;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final BottomNavigationPresenter f3091;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0406();

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public Bundle f3092;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$げつ〴ぬぐ, reason: contains not printable characters */
        public static class C0406 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f3092 = parcel.readBundle(classLoader == null ? SavedState.class.getClassLoader() : classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1099, i);
            parcel.writeBundle(this.f3092);
        }
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$〺つふすそ, reason: contains not printable characters */
    public interface InterfaceC0407 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m1336(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0408 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        boolean m1337(MenuItem menuItem);
    }

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0409 implements C1164.InterfaceC1166 {
        public C0409() {
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: 〺つふすそ */
        public void mo141(C1164 c1164) {
        }

        @Override // p034.p050.p051.p052.C1164.InterfaceC1166
        /* renamed from: げつ〴ぬぐ */
        public boolean mo142(C1164 c1164, MenuItem menuItem) {
            if (BottomNavigationView.this.f3085 == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                InterfaceC0408 interfaceC0408 = BottomNavigationView.this.f3087;
                return (interfaceC0408 == null || interfaceC0408.m1337(menuItem)) ? false : true;
            }
            BottomNavigationView.this.f3085.m1336(menuItem);
            return true;
        }
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(C2112.m4210(context, attributeSet, i, f3084), attributeSet, i);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.f3091 = bottomNavigationPresenter;
        Context context2 = getContext();
        C2234 c2234 = new C2234(context2);
        this.f3086 = c2234;
        BottomNavigationMenuView bottomNavigationMenuView = new BottomNavigationMenuView(context2);
        this.f3088 = bottomNavigationMenuView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        bottomNavigationMenuView.setLayoutParams(layoutParams);
        bottomNavigationPresenter.f3079 = bottomNavigationMenuView;
        bottomNavigationPresenter.f3080 = 1;
        bottomNavigationMenuView.setPresenter(bottomNavigationPresenter);
        c2234.m2610(bottomNavigationPresenter, c2234.f5774);
        getContext();
        bottomNavigationPresenter.f3078 = c2234;
        bottomNavigationPresenter.f3079.f3057 = c2234;
        int[] iArr = C2243.BottomNavigationView;
        int i2 = C2350.Widget_Design_BottomNavigationView;
        int i3 = C2243.BottomNavigationView_itemTextAppearanceInactive;
        int i4 = C2243.BottomNavigationView_itemTextAppearanceActive;
        C1260 m4407 = C2255.m4407(context2, attributeSet, iArr, i, i2, i3, i4);
        int i5 = C2243.BottomNavigationView_itemIconTint;
        bottomNavigationMenuView.setIconTintList(m4407.m2915(i5) ? m4407.m2917(i5) : bottomNavigationMenuView.m1333(R.attr.textColorSecondary));
        setItemIconSize(m4407.m2921(C2243.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(C2324.design_bottom_navigation_icon_size)));
        if (m4407.m2915(i3)) {
            setItemTextAppearanceInactive(m4407.m2922(i3, 0));
        }
        if (m4407.m2915(i4)) {
            setItemTextAppearanceActive(m4407.m2922(i4, 0));
        }
        int i6 = C2243.BottomNavigationView_itemTextColor;
        if (m4407.m2915(i6)) {
            setItemTextColor(m4407.m2917(i6));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C2163 c2163 = new C2163();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                c2163.m4252(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c2163.f9045.f9067 = new C2156(context2);
            c2163.m4269();
            AtomicInteger atomicInteger = C1096.f5578;
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(c2163);
            } else {
                setBackgroundDrawable(c2163);
            }
        }
        if (m4407.m2915(C2243.BottomNavigationView_elevation)) {
            C1096.m2509(this, m4407.m2921(r2, 0));
        }
        C2786.m4788(getBackground().mutate(), C1687.m3677(context2, m4407, C2243.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(m4407.m2926(C2243.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(m4407.m2918(C2243.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int m2922 = m4407.m2922(C2243.BottomNavigationView_itemBackground, 0);
        if (m2922 != 0) {
            bottomNavigationMenuView.setItemBackgroundRes(m2922);
        } else {
            setItemRippleColor(C1687.m3677(context2, m4407, C2243.BottomNavigationView_itemRippleColor));
        }
        int i7 = C2243.BottomNavigationView_menu;
        if (m4407.m2915(i7)) {
            int m29222 = m4407.m2922(i7, 0);
            bottomNavigationPresenter.f3081 = true;
            getMenuInflater().inflate(m29222, c2234);
            bottomNavigationPresenter.f3081 = false;
            bottomNavigationPresenter.mo119(true);
        }
        m4407.f6162.recycle();
        addView(bottomNavigationMenuView, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            View view = new View(context2);
            view.setBackgroundColor(C1067.m2405(context2, C2224.design_bottom_navigation_shadow_color));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(C2324.design_bottom_navigation_shadow_height)));
            addView(view);
        }
        c2234.mo2614(new C0409());
        C1687.m3682(this, new C2233(this));
    }

    private MenuInflater getMenuInflater() {
        if (this.f3090 == null) {
            this.f3090 = new C1158(getContext());
        }
        return this.f3090;
    }

    public Drawable getItemBackground() {
        return this.f3088.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f3088.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f3088.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f3088.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f3089;
    }

    public int getItemTextAppearanceActive() {
        return this.f3088.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f3088.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f3088.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f3088.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f3086;
    }

    public int getSelectedItemId() {
        return this.f3088.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2163) {
            C1687.m3669(this, (C2163) background);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1099);
        this.f3086.m2634(savedState.f3092);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f3092 = bundle;
        this.f3086.m2616(bundle);
        return savedState;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C1687.m3731(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f3088.setItemBackground(drawable);
        this.f3089 = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f3088.setItemBackgroundRes(i);
        this.f3089 = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = this.f3088;
        if (bottomNavigationMenuView.f3056 != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            this.f3091.mo119(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f3088.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f3088.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f3089 == colorStateList) {
            if (colorStateList != null || this.f3088.getItemBackground() == null) {
                return;
            }
            this.f3088.setItemBackground(null);
            return;
        }
        this.f3089 = colorStateList;
        if (colorStateList == null) {
            this.f3088.setItemBackground(null);
            return;
        }
        ColorStateList m4346 = C2235.m4346(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3088.setItemBackground(new RippleDrawable(m4346, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable m4758 = C2786.m4758(gradientDrawable);
        C2786.m4788(m4758, m4346);
        this.f3088.setItemBackground(m4758);
    }

    public void setItemTextAppearanceActive(int i) {
        this.f3088.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f3088.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f3088.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f3088.getLabelVisibilityMode() != i) {
            this.f3088.setLabelVisibilityMode(i);
            this.f3091.mo119(false);
        }
    }

    public void setOnNavigationItemReselectedListener(InterfaceC0407 interfaceC0407) {
        this.f3085 = interfaceC0407;
    }

    public void setOnNavigationItemSelectedListener(InterfaceC0408 interfaceC0408) {
        this.f3087 = interfaceC0408;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f3086.findItem(i);
        if (findItem == null || this.f3086.m2631(findItem, this.f3091, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
