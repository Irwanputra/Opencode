package com.google.android.material.bottomsheet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends dev.epro.r0.D15445857918358799638 {
    public int A;
    public final boolean p;
    public int q;
    public boolean r;
    public final dev.epro.r0.I11571046933844109529 s;
    public final android.content.res.ColorStateList t;
    public final boolean u;
    public final dev.epro.r0.A11042752882447342413 v;
    public boolean w;
    public final android.animation.ValueAnimator x;
    public final int y;
    public final boolean z;

    public BottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        int i;
        int i2;
        this.p = true;
        new dev.epro.r0.H12843822278061842084(this);
        this.A = 4;
        new java.util.ArrayList();
        new java.util.ArrayList();
        new android.util.SparseIntArray();
        new android.util.SparseIntArray();
        new android.util.SparseIntArray();
        new android.graphics.Rect();
        context.getResources().getDimensionPixelSize(2131166213);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Q9005017131391967988.a);
        int i3 = 3;
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.t = dev.epro.r0.T18016951143603335921.G(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(24)) {
            this.v = dev.epro.r0.A11042752882447342413.e(context, attributeSet, 2130968712, 2131887185).a();
        }
        dev.epro.r0.A11042752882447342413 a11042752882447342413 = this.v;
        if (a11042752882447342413 != null) {
            dev.epro.r0.I11571046933844109529 i11571046933844109529 = new dev.epro.r0.I11571046933844109529(a11042752882447342413);
            this.s = i11571046933844109529;
            i11571046933844109529.b.b = new dev.epro.r0.K1968397570448307835(context);
            i11571046933844109529.o();
            android.content.res.ColorStateList colorStateList = this.t;
            if (colorStateList != null) {
                dev.epro.r0.I11571046933844109529 i115710469338441095292 = this.s;
                dev.epro.r0.G8524789311406442313 g8524789311406442313 = i115710469338441095292.b;
                if (g8524789311406442313.c != colorStateList) {
                    g8524789311406442313.c = colorStateList;
                    i115710469338441095292.onStateChange(i115710469338441095292.getState());
                }
            } else {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.s.setTint(typedValue.data);
            }
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.x.addUpdateListener(new dev.epro.r0.R6158379668147516647(this));
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            typedArrayObtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        android.util.TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(12);
        if (typedValuePeekValue == null || (i2 = typedValuePeekValue.data) != -1) {
            m0(typedArrayObtainStyledAttributes.getDimensionPixelSize(12, -1));
        } else {
            m0(i2);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(10, false);
        if (this.z != z) {
            this.z = z;
            if (!z && this.A == 5 && this.A != 4) {
                this.A = 4;
            }
        }
        typedArrayObtainStyledAttributes.getBoolean(16, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        if (this.p != z2) {
            this.p = z2;
            if (!z2 || (i = this.A) != 6) {
                i3 = this.A;
                i = i3;
            }
            if (i == i3) {
                i3 = i;
            } else {
                this.A = i3;
            }
            n0(i3);
        }
        typedArrayObtainStyledAttributes.getBoolean(15, false);
        typedArrayObtainStyledAttributes.getBoolean(5, true);
        typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getInt(13, 0);
        float f = typedArrayObtainStyledAttributes.getFloat(9, 0.5f);
        if (f <= 0.0f || f >= 1.0f) {
            dev.epro.r0.S10973172697741180971.j("ratio must be a float value between 0 and 1");
            throw null;
        }
        android.util.TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(7);
        if (typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) {
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0);
            if (dimensionPixelOffset < 0) {
                dev.epro.r0.S10973172697741180971.j("offset must be greater than or equal to 0");
                throw null;
            }
            this.y = dimensionPixelOffset;
            n0(this.A);
        } else {
            int i4 = typedValuePeekValue2.data;
            if (i4 < 0) {
                dev.epro.r0.S10973172697741180971.j("offset must be greater than or equal to 0");
                throw null;
            }
            this.y = i4;
            n0(this.A);
        }
        typedArrayObtainStyledAttributes.getInt(14, 500);
        typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.getBoolean(20, false);
        typedArrayObtainStyledAttributes.getBoolean(21, false);
        typedArrayObtainStyledAttributes.getBoolean(22, false);
        typedArrayObtainStyledAttributes.getBoolean(23, true);
        typedArrayObtainStyledAttributes.getBoolean(17, false);
        typedArrayObtainStyledAttributes.getBoolean(18, false);
        typedArrayObtainStyledAttributes.getBoolean(19, false);
        this.u = typedArrayObtainStyledAttributes.getBoolean(26, true);
        typedArrayObtainStyledAttributes.recycle();
        android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void m0(int i) {
        boolean z = this.r;
        if (i == -1) {
            if (z) {
                return;
            }
            this.r = true;
        } else if (z || this.q != i) {
            this.r = false;
            this.q = java.lang.Math.max(0, i);
        }
    }

    public final void n0(int i) {
        dev.epro.r0.I11571046933844109529 i11571046933844109529;
        if (i == 2) {
            return;
        }
        boolean z = this.A == 3 && this.u;
        if (this.w == z || (i11571046933844109529 = this.s) == null) {
            return;
        }
        this.w = z;
        android.animation.ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.reverse();
                return;
            } else {
                valueAnimator.setFloatValues(i11571046933844109529.b.i, z ? 0.0f : 1.0f);
                valueAnimator.start();
                return;
            }
        }
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        float f = this.w ? 0.0f : 1.0f;
        dev.epro.r0.G8524789311406442313 g8524789311406442313 = i11571046933844109529.b;
        if (g8524789311406442313.i != f) {
            g8524789311406442313.i = f;
            i11571046933844109529.f = true;
            i11571046933844109529.g = true;
            i11571046933844109529.invalidateSelf();
        }
    }

    public BottomSheetBehavior() {
        this.p = true;
        new dev.epro.r0.H12843822278061842084(this);
        this.A = 4;
        new java.util.ArrayList();
        new java.util.ArrayList();
        new android.util.SparseIntArray();
        new android.util.SparseIntArray();
        new android.util.SparseIntArray();
        new android.graphics.Rect();
    }
}
