package com.google.android.material.sidesheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import dev.epro.r0.A11042752882447342413;
import dev.epro.r0.D15445857918358799638;
import dev.epro.r0.G8524789311406442313;
import dev.epro.r0.I11571046933844109529;
import dev.epro.r0.K1968397570448307835;
import dev.epro.r0.M9197813449740923653;
import dev.epro.r0.Q9005017131391967988;
import dev.epro.r0.T18016951143603335921;
import java.util.LinkedHashSet;
import net.zetetic.database.R;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends D15445857918358799638 {
    public final I11571046933844109529 p;
    public final ColorStateList q;
    public final A11042752882447342413 r;
    public byte s;

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        new M9197813449740923653(this);
        this.s = (byte) 5;
        new LinkedHashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q9005017131391967988.p);
        if (obtainStyledAttributes.hasValue(3)) {
            this.q = T18016951143603335921.G(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.r = A11042752882447342413.e(context, attributeSet, 0, R.style.Widget_Material3_SideSheet).a();
        }
        if (obtainStyledAttributes.hasValue(5)) {
            obtainStyledAttributes.getResourceId(5, -1);
        }
        A11042752882447342413 a11042752882447342413 = this.r;
        if (a11042752882447342413 != null) {
            I11571046933844109529 i11571046933844109529 = new I11571046933844109529(a11042752882447342413);
            this.p = i11571046933844109529;
            i11571046933844109529.b.b = new K1968397570448307835(context);
            i11571046933844109529.o();
            ColorStateList colorStateList = this.q;
            if (colorStateList != null) {
                I11571046933844109529 i115710469338441095292 = this.p;
                G8524789311406442313 g8524789311406442313 = i115710469338441095292.b;
                if (g8524789311406442313.c != colorStateList) {
                    g8524789311406442313.c = colorStateList;
                    i115710469338441095292.onStateChange(i115710469338441095292.getState());
                }
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
                this.p.setTint(typedValue.data);
            }
        }
        obtainStyledAttributes.getDimension(2, -1.0f);
        obtainStyledAttributes.getBoolean(4, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public SideSheetBehavior() {
        new M9197813449740923653(this);
        this.s = (byte) 5;
        new LinkedHashSet();
    }
}
