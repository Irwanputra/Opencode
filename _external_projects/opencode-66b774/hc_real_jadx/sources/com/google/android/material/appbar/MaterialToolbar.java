package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.widget.Toolbar;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p164.p165.C2112;
import p131.p161.p162.p163.p171.C2156;
import p131.p161.p162.p163.p173.C2163;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public static final int f2953 = C2350.Widget_MaterialComponents_Toolbar;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.toolbarStyle);
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(C2112.m4210(context, attributeSet, i, f2953), attributeSet, i);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            C2163 c2163 = new C2163();
            c2163.m4252(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            c2163.f9045.f9067 = new C2156(context2);
            c2163.m4269();
            c2163.m4263(C1096.m2522(this));
            if (Build.VERSION.SDK_INT >= 16) {
                setBackground(c2163);
            } else {
                setBackgroundDrawable(c2163);
            }
        }
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
    public void setElevation(float f) {
        super.setElevation(f);
        C1687.m3731(this, f);
    }
}
