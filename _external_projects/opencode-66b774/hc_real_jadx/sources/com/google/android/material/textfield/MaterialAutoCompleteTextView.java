package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import java.util.Locale;
import p034.p050.C1264;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p164.p165.C2112;
import p131.p161.p162.p163.p185.C2255;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final Rect f3531;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final ListPopupWindow f3532;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final AccessibilityManager f3533;

    /* renamed from: com.google.android.material.textfield.MaterialAutoCompleteTextView$げつ〴ぬぐ, reason: contains not printable characters */
    public class C0474 implements AdapterView.OnItemClickListener {
        public C0474() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object item;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            if (i < 0) {
                ListPopupWindow listPopupWindow = materialAutoCompleteTextView.f3532;
                item = !listPopupWindow.mo176() ? null : listPopupWindow.f449.getSelectedItem();
            } else {
                item = materialAutoCompleteTextView.getAdapter().getItem(i);
            }
            MaterialAutoCompleteTextView.m1508(MaterialAutoCompleteTextView.this, item);
            AdapterView.OnItemClickListener onItemClickListener = MaterialAutoCompleteTextView.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    ListPopupWindow listPopupWindow2 = MaterialAutoCompleteTextView.this.f3532;
                    view = !listPopupWindow2.mo176() ? null : listPopupWindow2.f449.getSelectedView();
                    ListPopupWindow listPopupWindow3 = MaterialAutoCompleteTextView.this.f3532;
                    i = !listPopupWindow3.mo176() ? -1 : listPopupWindow3.f449.getSelectedItemPosition();
                    ListPopupWindow listPopupWindow4 = MaterialAutoCompleteTextView.this.f3532;
                    j = !listPopupWindow4.mo176() ? Long.MIN_VALUE : listPopupWindow4.f449.getSelectedItemId();
                }
                onItemClickListener.onItemClick(MaterialAutoCompleteTextView.this.f3532.f449, view, i, j);
            }
            MaterialAutoCompleteTextView.this.f3532.dismiss();
        }
    }

    public MaterialAutoCompleteTextView(Context context) {
        this(context, null);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.autoCompleteTextViewStyle);
    }

    public MaterialAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C2112.m4210(context, attributeSet, i, 0), attributeSet, i);
        this.f3531 = new Rect();
        Context context2 = getContext();
        TypedArray m4408 = C2255.m4408(context2, attributeSet, C2243.MaterialAutoCompleteTextView, i, C2350.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i2 = C2243.MaterialAutoCompleteTextView_android_inputType;
        if (m4408.hasValue(i2) && m4408.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f3533 = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2, null, C1264.listPopupWindowStyle);
        this.f3532 = listPopupWindow;
        listPopupWindow.m180(true);
        listPopupWindow.f436 = this;
        listPopupWindow.f448.setInputMethodMode(2);
        listPopupWindow.mo155(getAdapter());
        listPopupWindow.f441 = new C0474();
        m4408.recycle();
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static void m1508(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        if (Build.VERSION.SDK_INT >= 17) {
            materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
            return;
        }
        ListAdapter adapter = materialAutoCompleteTextView.getAdapter();
        materialAutoCompleteTextView.setAdapter(null);
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj));
        materialAutoCompleteTextView.setAdapter(adapter);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m1509 = m1509();
        return (m1509 == null || !m1509.f3598) ? super.getHint() : m1509.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m1509 = m1509();
        if (m1509 != null && m1509.f3598 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m1509 = m1509();
            int i3 = 0;
            if (adapter != null && m1509 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f3532;
                int min = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.mo176() ? -1 : listPopupWindow.f449.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, m1509);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable m181 = this.f3532.m181();
                if (m181 != null) {
                    m181.getPadding(this.f3531);
                    Rect rect = this.f3531;
                    i4 += rect.left + rect.right;
                }
                i3 = m1509.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f3532.mo155(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() == 0 && (accessibilityManager = this.f3533) != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f3532.show();
        } else {
            super.showDropDown();
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final TextInputLayout m1509() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }
}
