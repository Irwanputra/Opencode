package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import p034.p035.p045.C1096;
import p034.p035.p045.C1102;
import p034.p035.p045.p046.C1084;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p173.C2178;
import p131.p161.p162.p163.p173.C2180;
import p131.p161.p162.p163.p173.InterfaceC2177;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public static final String f3167 = MaterialButtonToggleGroup.class.getSimpleName();

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public static final int f3168 = C2350.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public boolean f3169;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final List<C0424> f3170;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public Integer[] f3171;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f3172;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C0420 f3173;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final LinkedHashSet<InterfaceC0422> f3174;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final Comparator<MaterialButton> f3175;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C0423 f3176;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public boolean f3177;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public int f3178;

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$〺つふすそ, reason: contains not printable characters */
    public class C0419 extends C1102 {
        public C0419() {
        }

        @Override // p034.p035.p045.C1102
        /* renamed from: びぐびあび */
        public void mo431(View view, C1084 c1084) {
            this.f5594.onInitializeAccessibilityNodeInfo(view, c1084.f5550);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            String str = MaterialButtonToggleGroup.f3167;
            materialButtonToggleGroup.getClass();
            int i = -1;
            if (view instanceof MaterialButton) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    }
                    if (materialButtonToggleGroup.getChildAt(i2) == view) {
                        i = i3;
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.m1370(i2)) {
                        i3++;
                    }
                    i2++;
                }
            }
            c1084.m2457(C1084.C1086.m2470(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$くし〴〺ぅ, reason: contains not printable characters */
    public class C0420 implements MaterialButton.InterfaceC0418 {
        public C0420(C0421 c0421) {
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC0418
        /* renamed from: げつ〴ぬぐ */
        public void mo1363(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (materialButtonToggleGroup.f3169) {
                return;
            }
            if (materialButtonToggleGroup.f3177) {
                materialButtonToggleGroup.f3178 = z ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.m1369(materialButton.getId(), z)) {
                MaterialButtonToggleGroup.this.m1364(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0421 implements Comparator<MaterialButton> {
        public C0421() {
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$づざかべべ, reason: contains not printable characters */
    public interface InterfaceC0422 {
        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        void m1371(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$なぎぱいぢぎ, reason: contains not printable characters */
    public class C0423 implements MaterialButton.InterfaceC0417 {
        public C0423(C0421 c0421) {
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$びぐびあび, reason: contains not printable characters */
    public static class C0424 {

        /* renamed from: づざかべべ, reason: contains not printable characters */
        public static final InterfaceC2177 f3183 = new C2178(0.0f);

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public InterfaceC2177 f3184;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public InterfaceC2177 f3185;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public InterfaceC2177 f3186;

        /* renamed from: びぐびあび, reason: contains not printable characters */
        public InterfaceC2177 f3187;

        public C0424(InterfaceC2177 interfaceC2177, InterfaceC2177 interfaceC21772, InterfaceC2177 interfaceC21773, InterfaceC2177 interfaceC21774) {
            this.f3186 = interfaceC2177;
            this.f3184 = interfaceC21773;
            this.f3185 = interfaceC21774;
            this.f3187 = interfaceC21772;
        }
    }

    public MaterialButtonToggleGroup(Context context) {
        this(context, null);
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f3168
            android.content.Context r7 = p131.p161.p162.p163.p164.p165.C2112.m4210(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f3170 = r7
            com.google.android.material.button.MaterialButtonToggleGroup$くし〴〺ぅ r7 = new com.google.android.material.button.MaterialButtonToggleGroup$くし〴〺ぅ
            r0 = 0
            r7.<init>(r0)
            r6.f3173 = r7
            com.google.android.material.button.MaterialButtonToggleGroup$なぎぱいぢぎ r7 = new com.google.android.material.button.MaterialButtonToggleGroup$なぎぱいぢぎ
            r7.<init>(r0)
            r6.f3176 = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f3174 = r7
            com.google.android.material.button.MaterialButtonToggleGroup$げつ〴ぬぐ r7 = new com.google.android.material.button.MaterialButtonToggleGroup$げつ〴ぬぐ
            r7.<init>()
            r6.f3175 = r7
            r7 = 0
            r6.f3169 = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = p131.p161.p162.p163.C2243.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = p131.p161.p162.p163.p185.C2255.m4408(r0, r1, r2, r3, r4, r5)
            int r9 = p131.p161.p162.p163.C2243.MaterialButtonToggleGroup_singleSelection
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = p131.p161.p162.p163.C2243.MaterialButtonToggleGroup_checkedButton
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f3178 = r9
            int r9 = p131.p161.p162.p163.C2243.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f3172 = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            p034.p035.p045.C1096.m2505(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m1370(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m1370(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m1370(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.f3178 = i;
        m1364(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C1096.m2510());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.f3158.add(this.f3173);
        materialButton.setOnPressedChangeListenerInternal(this.f3176);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            if (materialButton.isChecked()) {
                m1369(materialButton.getId(), true);
                setCheckedId(materialButton.getId());
            }
            C2180 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f3170.add(new C0424(shapeAppearanceModel.f9124, shapeAppearanceModel.f9118, shapeAppearanceModel.f9126, shapeAppearanceModel.f9120));
            C1096.m2490(materialButton, new C0419());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3175);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m1366(i), Integer.valueOf(i));
        }
        this.f3171 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.f3177) {
            return this.f3178;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton m1366 = m1366(i);
            if (m1366.isChecked()) {
                arrayList.add(Integer.valueOf(m1366.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f3171;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3178;
        if (i != -1) {
            m1368(i, true);
            m1369(i, true);
            setCheckedId(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1084.C1085 m2469 = C1084.C1085.m2469(1, getVisibleButtonCount(), false, this.f3177 ? 1 : 2);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) m2469.f5551);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        m1365();
        m1367();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.f3158.remove(this.f3173);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3170.remove(indexOfChild);
        }
        m1365();
        m1367();
    }

    public void setSelectionRequired(boolean z) {
        this.f3172 = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.f3177 != z) {
            this.f3177 = z;
            this.f3169 = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton m1366 = m1366(i);
                m1366.setChecked(false);
                m1364(m1366.getId(), false);
            }
            this.f3169 = false;
            setCheckedId(-1);
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1364(int i, boolean z) {
        Iterator<InterfaceC0422> it = this.f3174.iterator();
        while (it.hasNext()) {
            it.next().m1371(this, i, z);
        }
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public void m1365() {
        C0424 c0424;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m1366 = m1366(i);
            if (m1366.getVisibility() != 8) {
                C2180 shapeAppearanceModel = m1366.getShapeAppearanceModel();
                shapeAppearanceModel.getClass();
                C2180.C2181 c2181 = new C2180.C2181(shapeAppearanceModel);
                C0424 c04242 = this.f3170.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            InterfaceC2177 interfaceC2177 = c04242.f3186;
                            InterfaceC2177 interfaceC21772 = C0424.f3183;
                            c0424 = new C0424(interfaceC2177, interfaceC21772, c04242.f3184, interfaceC21772);
                        } else if (C1687.m3675(this)) {
                            InterfaceC2177 interfaceC21773 = C0424.f3183;
                            c0424 = new C0424(interfaceC21773, interfaceC21773, c04242.f3184, c04242.f3185);
                        } else {
                            InterfaceC2177 interfaceC21774 = c04242.f3186;
                            InterfaceC2177 interfaceC21775 = c04242.f3187;
                            InterfaceC2177 interfaceC21776 = C0424.f3183;
                            c0424 = new C0424(interfaceC21774, interfaceC21775, interfaceC21776, interfaceC21776);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        c04242 = null;
                    } else if (!z) {
                        InterfaceC2177 interfaceC21777 = C0424.f3183;
                        c0424 = new C0424(interfaceC21777, c04242.f3187, interfaceC21777, c04242.f3185);
                    } else if (C1687.m3675(this)) {
                        InterfaceC2177 interfaceC21778 = c04242.f3186;
                        InterfaceC2177 interfaceC21779 = c04242.f3187;
                        InterfaceC2177 interfaceC217710 = C0424.f3183;
                        c0424 = new C0424(interfaceC21778, interfaceC21779, interfaceC217710, interfaceC217710);
                    } else {
                        InterfaceC2177 interfaceC217711 = C0424.f3183;
                        c0424 = new C0424(interfaceC217711, interfaceC217711, c04242.f3184, c04242.f3185);
                    }
                    c04242 = c0424;
                }
                if (c04242 == null) {
                    c2181.m4290(0.0f);
                } else {
                    c2181.f9136 = c04242.f3186;
                    c2181.f9130 = c04242.f3187;
                    c2181.f9138 = c04242.f3184;
                    c2181.f9132 = c04242.f3185;
                }
                m1366.setShapeAppearanceModel(c2181.m4291());
            }
        }
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final MaterialButton m1366(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m1367() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m1366 = m1366(i);
            int min = Math.min(m1366.getStrokeWidth(), m1366(i - 1).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = m1366.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                C2786.m4803(layoutParams2, 0);
                C2786.m4835(layoutParams2, -min);
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
            }
            m1366.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            C2786.m4803(layoutParams3, 0);
            C2786.m4835(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final void m1368(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f3169 = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f3169 = false;
        }
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final boolean m1369(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (this.f3172 && checkedButtonIds.isEmpty()) {
            m1368(i, true);
            this.f3178 = i;
            return false;
        }
        if (z && this.f3177) {
            checkedButtonIds.remove(Integer.valueOf(i));
            Iterator<Integer> it = checkedButtonIds.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                m1368(intValue, false);
                m1364(intValue, false);
            }
        }
        return true;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final boolean m1370(int i) {
        return getChildAt(i).getVisibility() != 8;
    }
}
