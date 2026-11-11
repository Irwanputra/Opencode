package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2350;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ColorStateList f3199;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f3200;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final int f3198 = C2350.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final int[][] f3197 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.checkboxStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.f3198
            android.content.Context r8 = p131.p161.p162.p163.p164.p165.C2112.m4210(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p131.p161.p162.p163.C2243.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = p131.p161.p162.p163.p185.C2255.m4408(r0, r1, r2, r3, r4, r5)
            int r10 = p131.p161.p162.p163.C2243.MaterialCheckBox_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p034.p095.C1687.m3662(r8, r9, r10)
            p237.p238.p239.p241.p242.C2786.m4760(r7, r8)
        L28:
            int r8 = p131.p161.p162.p163.C2243.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f3200 = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3199 == null) {
            int[][] iArr = f3197;
            int[] iArr2 = new int[iArr.length];
            int m3728 = C1687.m3728(this, C2111.colorControlActivated);
            int m37282 = C1687.m3728(this, C2111.colorSurface);
            int m37283 = C1687.m3728(this, C2111.colorOnSurface);
            iArr2[0] = C1687.m3695(m37282, m3728, 1.0f);
            iArr2[1] = C1687.m3695(m37282, m37283, 0.54f);
            iArr2[2] = C1687.m3695(m37282, m37283, 0.38f);
            iArr2[3] = C1687.m3695(m37282, m37283, 0.38f);
            this.f3199 = new ColorStateList(iArr, iArr2);
        }
        return this.f3199;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3200 && C2786.m4838(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3200 = z;
        C2786.m4760(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
