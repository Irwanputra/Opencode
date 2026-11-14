package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class E13336915040001677500 extends dev.epro.r0.S15286651319405213936 {
    public final dev.epro.r0.M10701816181309613444 e;
    public final android.view.accessibility.AccessibilityManager f;
    public final int[] g;
    public final int h;
    public final float i;
    public android.content.res.ColorStateList j;
    public int k;
    public android.content.res.ColorStateList l;

    /* JADX WARN: Multi-variable type inference failed */
    public E13336915040001677500(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(dev.epro.r0.Q3181834110876746778.V(context, attributeSet, 2130968645, 0, new int[0]), attributeSet);
        this.g = new int[]{android.R.attr.state_selected};
        new android.graphics.Rect();
        android.content.Context context2 = getContext();
        dev.epro.r0.Q13169198992966610970.M(context2, attributeSet, 2130968645, 2131887118);
        int[] iArr = dev.epro.r0.Q9005017131391967988.f;
        dev.epro.r0.Q13169198992966610970.N(context2, attributeSet, iArr, 2130968645, 2131887118, new int[0]);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 2130968645, 2131887118);
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getInt(0, 0) == 0) {
            setKeyListener((android.text.method.KeyListener) null);
        }
        this.h = typedArrayObtainStyledAttributes.getResourceId(3, 2131492945);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 2131166179);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.j = android.content.res.ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(2, 0));
        }
        this.k = typedArrayObtainStyledAttributes.getColor(4, 0);
        this.l = dev.epro.r0.T18016951143603335921.G(context2, typedArrayObtainStyledAttributes, 5);
        this.f = (android.view.accessibility.AccessibilityManager) context2.getSystemService("accessibility");
        dev.epro.r0.M10701816181309613444 m10701816181309613444 = new dev.epro.r0.M10701816181309613444(context2, (android.util.AttributeSet) null, 2130969419, 0);
        this.e = m10701816181309613444;
        m10701816181309613444.y = true;
        dev.epro.r0.F6594473573882211675 f6594473573882211675 = m10701816181309613444.z;
        f6594473573882211675.setFocusable(true);
        m10701816181309613444.o = this;
        f6594473573882211675.setInputMethodMode(2);
        m10701816181309613444.p(getAdapter());
        m10701816181309613444.p = new dev.epro.r0.O5554340795038408562(this, (byte) 1);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(6, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        for (android.view.ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
    }

    public final boolean c() {
        java.util.List<android.accessibilityservice.AccessibilityServiceInfo> enabledAccessibilityServiceList;
        android.view.accessibility.AccessibilityManager accessibilityManager = this.f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (android.accessibilityservice.AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dismissDropDown() {
        if (c()) {
            this.e.dismiss();
        } else {
            super/*android.widget.AutoCompleteTextView*/.dismissDropDown();
        }
    }

    public android.content.res.ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public java.lang.CharSequence getHint() {
        b();
        return super/*android.widget.TextView*/.getHint();
    }

    public float getPopupElevation() {
        return this.i;
    }

    public int getSimpleItemSelectedColor() {
        return this.k;
    }

    public android.content.res.ColorStateList getSimpleItemSelectedRippleColor() {
        return this.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPopupShowing() {
        dev.epro.r0.M10701816181309613444 m10701816181309613444 = this.e;
        if (m10701816181309613444 == null || !m10701816181309613444.z.isShowing()) {
            return super/*android.widget.AutoCompleteTextView*/.isPopupShowing();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        this.e.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onKeyDown(int i, android.view.KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super/*android.view.View*/.onKeyDown(i, keyEvent);
        }
        boolean z = i == 66 || i == 23;
        boolean z2 = i == 62;
        if (getKeyListener() == null ? !(z || z2) : !(z && getMaxLines() == 1)) {
            return super/*android.view.View*/.onKeyDown(i, keyEvent);
        }
        b();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        if (android.view.View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            getAdapter();
            b();
            setMeasuredDimension(java.lang.Math.min(java.lang.Math.max(measuredWidth, 0), android.view.View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onWindowFocusChanged(boolean z) {
        if (c()) {
            return;
        }
        super/*android.view.View*/.onWindowFocusChanged(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T t) {
        super/*android.widget.AutoCompleteTextView*/.setAdapter(t);
        this.e.p(getAdapter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDropDownBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super/*android.widget.AutoCompleteTextView*/.setDropDownBackgroundDrawable(drawable);
        dev.epro.r0.M10701816181309613444 m10701816181309613444 = this.e;
        if (m10701816181309613444 != null) {
            m10701816181309613444.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(android.content.res.ColorStateList.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setDropDownBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        this.j = colorStateList;
        dev.epro.r0.I11571046933844109529 dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof dev.epro.r0.I11571046933844109529) {
            dev.epro.r0.I11571046933844109529 i11571046933844109529 = dropDownBackground;
            android.content.res.ColorStateList colorStateList2 = this.j;
            dev.epro.r0.G8524789311406442313 g8524789311406442313 = i11571046933844109529.b;
            if (g8524789311406442313.c != colorStateList2) {
                g8524789311406442313.c = colorStateList2;
                i11571046933844109529.onStateChange(i11571046933844109529.getState());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super/*android.widget.AutoCompleteTextView*/.setOnItemSelectedListener(onItemSelectedListener);
        this.e.q = getOnItemSelectedListener();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setRawInputType(int i) {
        super/*android.widget.TextView*/.setRawInputType(i);
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSimpleItemSelectedColor(int i) {
        this.k = i;
        if (getAdapter() instanceof dev.epro.r0.Q5645684334746806099) {
            getAdapter().a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSimpleItemSelectedRippleColor(android.content.res.ColorStateList colorStateList) {
        this.l = colorStateList;
        if (getAdapter() instanceof dev.epro.r0.Q5645684334746806099) {
            getAdapter().a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSimpleItems(java.lang.String[] strArr) {
        setAdapter(new dev.epro.r0.Q5645684334746806099(this, getContext(), this.h, strArr));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void showDropDown() {
        if (c()) {
            this.e.e();
        } else {
            super/*android.widget.AutoCompleteTextView*/.showDropDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
