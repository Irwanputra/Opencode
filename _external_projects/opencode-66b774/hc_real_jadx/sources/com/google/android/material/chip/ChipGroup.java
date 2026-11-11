package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import p034.p035.p045.p046.C1084;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2350;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public static final int f3223 = C2350.Widget_MaterialComponents_ChipGroup;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f3224;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f3225;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public InterfaceC0429 f3226;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public ViewGroupOnHierarchyChangeListenerC0431 f3227;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f3228;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public int f3229;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public boolean f3230;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f3231;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final C0428 f3232;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$〺つふすそ, reason: contains not printable characters */
    public class C0428 implements CompoundButton.OnCheckedChangeListener {
        public C0428(C0430 c0430) {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (chipGroup.f3230) {
                return;
            }
            if (chipGroup.getCheckedChipIds().isEmpty()) {
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f3231) {
                    chipGroup2.m1393(compoundButton.getId(), true);
                    ChipGroup chipGroup3 = ChipGroup.this;
                    chipGroup3.f3229 = compoundButton.getId();
                    InterfaceC0429 interfaceC0429 = chipGroup3.f3226;
                    return;
                }
            }
            int id = compoundButton.getId();
            if (!z) {
                ChipGroup chipGroup4 = ChipGroup.this;
                if (chipGroup4.f3229 == id) {
                    chipGroup4.setCheckedId(-1);
                    return;
                }
                return;
            }
            ChipGroup chipGroup5 = ChipGroup.this;
            int i = chipGroup5.f3229;
            if (i != -1 && i != id && chipGroup5.f3224) {
                chipGroup5.m1393(i, false);
            }
            ChipGroup.this.setCheckedId(id);
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$くし〴〺ぅ, reason: contains not printable characters */
    public interface InterfaceC0429 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m1395(ChipGroup chipGroup, int i);
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$びぐびあび, reason: contains not printable characters */
    public class ViewGroupOnHierarchyChangeListenerC0431 implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public ViewGroup.OnHierarchyChangeListener f3234;

        public ViewGroupOnHierarchyChangeListenerC0431(C0430 c0430) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : view2.hashCode());
                }
                ((Chip) view2).setOnCheckedChangeListenerInternal(ChipGroup.this.f3232);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3234;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f3234;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.chipGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f3223
            android.content.Context r8 = p131.p161.p162.p163.p164.p165.C2112.m4210(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$〺つふすそ r8 = new com.google.android.material.chip.ChipGroup$〺つふすそ
            r0 = 0
            r8.<init>(r0)
            r7.f3232 = r8
            com.google.android.material.chip.ChipGroup$びぐびあび r8 = new com.google.android.material.chip.ChipGroup$びぐびあび
            r8.<init>(r0)
            r7.f3227 = r8
            r8 = -1
            r7.f3229 = r8
            r6 = 0
            r7.f3230 = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = p131.p161.p162.p163.C2243.ChipGroup
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = p131.p161.p162.p163.p185.C2255.m4408(r0, r1, r2, r3, r4, r5)
            int r10 = p131.p161.p162.p163.C2243.ChipGroup_chipSpacing
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = p131.p161.p162.p163.C2243.ChipGroup_chipSpacingHorizontal
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingHorizontal(r0)
            int r0 = p131.p161.p162.p163.C2243.ChipGroup_chipSpacingVertical
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.setChipSpacingVertical(r10)
            int r10 = p131.p161.p162.p163.C2243.ChipGroup_singleLine
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleLine(r10)
            int r10 = p131.p161.p162.p163.C2243.ChipGroup_singleSelection
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSingleSelection(r10)
            int r10 = p131.p161.p162.p163.C2243.ChipGroup_selectionRequired
            boolean r10 = r9.getBoolean(r10, r6)
            r7.setSelectionRequired(r10)
            int r10 = p131.p161.p162.p163.C2243.ChipGroup_checkedChip
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L69
            r7.f3229 = r10
        L69:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$びぐびあび r8 = r7.f3227
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            p034.p035.p045.C1096.m2505(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f3229 = i;
        InterfaceC0429 interfaceC0429 = this.f3226;
        if (interfaceC0429 == null || !this.f3224) {
            return;
        }
        interfaceC0429.m1395(this, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f3229;
                if (i2 != -1 && this.f3224) {
                    m1393(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.f3224) {
            return this.f3229;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f3224) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.f3228;
    }

    public int getChipSpacingVertical() {
        return this.f3225;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3229;
        if (i != -1) {
            m1393(i, true);
            setCheckedId(this.f3229);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1084.C1085 m2469 = C1084.C1085.m2469(getRowCount(), this.f3323 ? getChipCount() : -1, false, this.f3224 ? 1 : 2);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) m2469.f5551);
        }
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f3228 != i) {
            this.f3228 = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f3225 != i) {
            this.f3225 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(InterfaceC0429 interfaceC0429) {
        this.f3226 = interfaceC0429;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3227.f3234 = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f3231 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f3224 != z) {
            this.f3224 = z;
            this.f3230 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.f3230 = false;
            setCheckedId(-1);
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final void m1393(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.f3230 = true;
            ((Chip) findViewById).setChecked(z);
            this.f3230 = false;
        }
    }

    @Override // com.google.android.material.internal.FlowLayout
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public boolean mo1394() {
        return this.f3323;
    }
}
