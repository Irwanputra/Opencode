package com.google.android.material.sidesheet;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class SideSheetBehavior<V extends android.view.View> extends dev.epro.r0.D15445857918358799638 {
    public final dev.epro.r0.I11571046933844109529 p;
    public final android.content.res.ColorStateList q;
    public final dev.epro.r0.A11042752882447342413 r;
    public byte s;

    public SideSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        new dev.epro.r0.M9197813449740923653(this);
        this.s = (byte) 5;
        new java.util.LinkedHashSet();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dev.epro.r0.Q9005017131391967988.p);
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.q = dev.epro.r0.T18016951143603335921.G(context, typedArrayObtainStyledAttributes, 3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            this.r = dev.epro.r0.A11042752882447342413.e(context, attributeSet, 0, 2131887384).a();
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            typedArrayObtainStyledAttributes.getResourceId(5, -1);
        }
        dev.epro.r0.A11042752882447342413 a11042752882447342413 = this.r;
        if (a11042752882447342413 != null) {
            dev.epro.r0.I11571046933844109529 i11571046933844109529 = new dev.epro.r0.I11571046933844109529(a11042752882447342413);
            this.p = i11571046933844109529;
            i11571046933844109529.b.b = new dev.epro.r0.K1968397570448307835(context);
            i11571046933844109529.o();
            android.content.res.ColorStateList colorStateList = this.q;
            if (colorStateList != null) {
                dev.epro.r0.I11571046933844109529 i115710469338441095292 = this.p;
                dev.epro.r0.G8524789311406442313 g8524789311406442313 = i115710469338441095292.b;
                if (g8524789311406442313.c != colorStateList) {
                    g8524789311406442313.c = colorStateList;
                    i115710469338441095292.onStateChange(i115710469338441095292.getState());
                }
            } else {
                android.util.TypedValue typedValue = new android.util.TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.p.setTint(typedValue.data);
            }
        }
        typedArrayObtainStyledAttributes.getDimension(2, -1.0f);
        typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new dev.epro.r0.M9197813449740923653(this);
        this.s = (byte) 5;
        new java.util.LinkedHashSet();
    }
}
