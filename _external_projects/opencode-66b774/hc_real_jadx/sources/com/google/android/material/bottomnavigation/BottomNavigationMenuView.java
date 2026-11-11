package com.google.android.material.bottomnavigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import com.google.android.material.badge.BadgeDrawable;
import java.util.HashSet;
import p034.p035.p042.C1053;
import p034.p035.p042.C1055;
import p034.p035.p045.C1096;
import p034.p035.p045.p046.C1084;
import p034.p050.C1264;
import p034.p050.p051.p052.C1164;
import p034.p050.p051.p052.C1197;
import p034.p050.p051.p052.InterfaceC1195;
import p034.p050.p055.p056.C1266;
import p034.p081.p082.p083.C1508;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.p175.C2223;
import p131.p161.p162.p163.p185.C2286;

/* loaded from: /tmp/opencode/hc_real.dex */
public class BottomNavigationMenuView extends ViewGroup implements InterfaceC1195 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final View.OnClickListener f3052;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final TransitionSet f3053;

    /* renamed from: 〻ぞまぎな〻, reason: contains not printable characters */
    public SparseArray<BadgeDrawable> f3054;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final int f3055;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f3056;

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public C1164 f3057;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public int f3058;

    /* renamed from: ぉ〲なぱぽた, reason: contains not printable characters */
    public BottomNavigationPresenter f3059;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public ColorStateList f3060;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public ColorStateList f3061;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final int f3062;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public int f3063;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public Drawable f3064;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public final ColorStateList f3065;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f3066;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public BottomNavigationItemView[] f3067;

    /* renamed from: でどあくず, reason: contains not printable characters */
    public int f3068;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final int f3069;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f3070;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public int f3071;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final int f3072;

    /* renamed from: ぶでにく〼〳, reason: contains not printable characters */
    public int[] f3073;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f3074;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final C1053<BottomNavigationItemView> f3075;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f3076;

    /* renamed from: びえぁぜい, reason: contains not printable characters */
    public static final int[] f3051 = {R.attr.state_checked};

    /* renamed from: なぶひせが, reason: contains not printable characters */
    public static final int[] f3050 = {-16842910};

    /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationMenuView$げつ〴ぬぐ, reason: contains not printable characters */
    public class ViewOnClickListenerC0404 implements View.OnClickListener {
        public ViewOnClickListenerC0404() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1197 itemData = ((BottomNavigationItemView) view).getItemData();
            BottomNavigationMenuView bottomNavigationMenuView = BottomNavigationMenuView.this;
            if (bottomNavigationMenuView.f3057.m2631(itemData, bottomNavigationMenuView.f3059, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public BottomNavigationMenuView(Context context) {
        this(context, null);
    }

    public BottomNavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3075 = new C1055(5);
        this.f3070 = 0;
        this.f3074 = 0;
        this.f3054 = new SparseArray<>(5);
        Resources resources = getResources();
        this.f3062 = resources.getDimensionPixelSize(C2324.design_bottom_navigation_item_max_width);
        this.f3072 = resources.getDimensionPixelSize(C2324.design_bottom_navigation_item_min_width);
        this.f3066 = resources.getDimensionPixelSize(C2324.design_bottom_navigation_active_item_max_width);
        this.f3069 = resources.getDimensionPixelSize(C2324.design_bottom_navigation_active_item_min_width);
        this.f3055 = resources.getDimensionPixelSize(C2324.design_bottom_navigation_height);
        this.f3065 = m1333(R.attr.textColorSecondary);
        AutoTransition autoTransition = new AutoTransition();
        this.f3053 = autoTransition;
        autoTransition.m1045(0);
        autoTransition.m1046(115L);
        autoTransition.m1044(new C1508());
        autoTransition.m1048(new C2286());
        this.f3052 = new ViewOnClickListenerC0404();
        this.f3073 = new int[5];
        C1096.m2505(this, 1);
    }

    private BottomNavigationItemView getNewItem() {
        BottomNavigationItemView mo2386 = this.f3075.mo2386();
        return mo2386 == null ? new BottomNavigationItemView(getContext()) : mo2386;
    }

    private void setBadgeIfNeeded(BottomNavigationItemView bottomNavigationItemView) {
        BadgeDrawable badgeDrawable;
        int id = bottomNavigationItemView.getId();
        if ((id != -1) && (badgeDrawable = this.f3054.get(id)) != null) {
            bottomNavigationItemView.setBadge(badgeDrawable);
        }
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.f3054;
    }

    public ColorStateList getIconTintList() {
        return this.f3061;
    }

    public Drawable getItemBackground() {
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        return (bottomNavigationItemViewArr == null || bottomNavigationItemViewArr.length <= 0) ? this.f3064 : bottomNavigationItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f3068;
    }

    public int getItemIconSize() {
        return this.f3058;
    }

    public int getItemTextAppearanceActive() {
        return this.f3063;
    }

    public int getItemTextAppearanceInactive() {
        return this.f3071;
    }

    public ColorStateList getItemTextColor() {
        return this.f3060;
    }

    public int getLabelVisibilityMode() {
        return this.f3076;
    }

    public int getSelectedItemId() {
        return this.f3070;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1084.C1085 m2469 = C1084.C1085.m2469(1, this.f3057.m2625().size(), false, 1);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) m2469.f5551);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C1096.m2491(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f3057.m2625().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f3055, 1073741824);
        if (m1335(this.f3076, size2) && this.f3056) {
            View childAt = getChildAt(this.f3074);
            int i3 = this.f3069;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f3066, Integer.MIN_VALUE), makeMeasureSpec);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f3072 * i4), Math.min(i3, this.f3066));
            int i5 = size - min;
            int min2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.f3062);
            int i6 = i5 - (i4 * min2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    int[] iArr = this.f3073;
                    iArr[i7] = i7 == this.f3074 ? min : min2;
                    if (i6 > 0) {
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.f3073[i7] = 0;
                }
                i7++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f3066);
            int i8 = size - (size2 * min3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.f3073;
                    iArr2[i9] = min3;
                    if (i8 > 0) {
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.f3073[i9] = 0;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f3073[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.f3055, makeMeasureSpec, 0));
    }

    public void setBadgeDrawables(SparseArray<BadgeDrawable> sparseArray) {
        this.f3054 = sparseArray;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setBadge(sparseArray.get(bottomNavigationItemView.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f3061 = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f3064 = drawable;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.f3068 = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.f3056 = z;
    }

    public void setItemIconSize(int i) {
        this.f3058 = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f3063 = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.f3060;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f3071 = i;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.f3060;
                if (colorStateList != null) {
                    bottomNavigationItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f3060 = colorStateList;
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                bottomNavigationItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.f3076 = i;
    }

    public void setPresenter(BottomNavigationPresenter bottomNavigationPresenter) {
        this.f3059 = bottomNavigationPresenter;
    }

    @Override // p034.p050.p051.p052.InterfaceC1195
    /* renamed from: 〺つふすそ */
    public void mo91(C1164 c1164) {
        this.f3057 = c1164;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public ColorStateList m1333(int i) {
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
        int[] iArr = f3050;
        return new ColorStateList(new int[][]{iArr, f3051, ViewGroup.EMPTY_STATE_SET}, new int[]{m2929.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public void m1334() {
        removeAllViews();
        BottomNavigationItemView[] bottomNavigationItemViewArr = this.f3067;
        if (bottomNavigationItemViewArr != null) {
            for (BottomNavigationItemView bottomNavigationItemView : bottomNavigationItemViewArr) {
                if (bottomNavigationItemView != null) {
                    this.f3075.mo2385(bottomNavigationItemView);
                    ImageView imageView = bottomNavigationItemView.f3034;
                    if (bottomNavigationItemView.m1329()) {
                        if (imageView != null) {
                            bottomNavigationItemView.setClipChildren(true);
                            bottomNavigationItemView.setClipToPadding(true);
                            C2223.m4322(bottomNavigationItemView.f3038, imageView, bottomNavigationItemView.m1328(imageView));
                        }
                        bottomNavigationItemView.f3038 = null;
                    }
                }
            }
        }
        if (this.f3057.size() == 0) {
            this.f3070 = 0;
            this.f3074 = 0;
            this.f3067 = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.f3057.size(); i++) {
            hashSet.add(Integer.valueOf(this.f3057.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.f3054.size(); i2++) {
            int keyAt = this.f3054.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f3054.delete(keyAt);
            }
        }
        this.f3067 = new BottomNavigationItemView[this.f3057.size()];
        boolean m1335 = m1335(this.f3076, this.f3057.m2625().size());
        for (int i3 = 0; i3 < this.f3057.size(); i3++) {
            this.f3059.f3081 = true;
            this.f3057.getItem(i3).setCheckable(true);
            this.f3059.f3081 = false;
            BottomNavigationItemView newItem = getNewItem();
            this.f3067[i3] = newItem;
            newItem.setIconTintList(this.f3061);
            newItem.setIconSize(this.f3058);
            newItem.setTextColor(this.f3065);
            newItem.setTextAppearanceInactive(this.f3071);
            newItem.setTextAppearanceActive(this.f3063);
            newItem.setTextColor(this.f3060);
            Drawable drawable = this.f3064;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f3068);
            }
            newItem.setShifting(m1335);
            newItem.setLabelVisibilityMode(this.f3076);
            newItem.mo88((C1197) this.f3057.getItem(i3), 0);
            newItem.setItemPosition(i3);
            newItem.setOnClickListener(this.f3052);
            if (this.f3070 != 0 && this.f3057.getItem(i3).getItemId() == this.f3070) {
                this.f3074 = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f3057.size() - 1, this.f3074);
        this.f3074 = min;
        this.f3057.getItem(min).setChecked(true);
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean m1335(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }
}
