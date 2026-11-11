package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2350;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public ColorStateList f3363;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public boolean f3364;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static final int f3362 = C2350.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public static final int[][] f3361 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialRadioButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.radiobutton.MaterialRadioButton.f3362
            android.content.Context r8 = p131.p161.p162.p163.p164.p165.C2112.m4210(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p131.p161.p162.p163.C2243.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = p131.p161.p162.p163.p185.C2255.m4408(r0, r1, r2, r3, r4, r5)
            int r10 = p131.p161.p162.p163.C2243.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p034.p095.C1687.m3662(r8, r9, r10)
            p237.p238.p239.p241.p242.C2786.m4760(r7, r8)
        L28:
            int r8 = p131.p161.p162.p163.C2243.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f3364 = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3363 == null) {
            int m3728 = C1687.m3728(this, C2111.colorControlActivated);
            int m37282 = C1687.m3728(this, C2111.colorOnSurface);
            int m37283 = C1687.m3728(this, C2111.colorSurface);
            int[][] iArr = f3361;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C1687.m3695(m37283, m3728, 1.0f);
            iArr2[1] = C1687.m3695(m37283, m37282, 0.54f);
            iArr2[2] = C1687.m3695(m37283, m37282, 0.38f);
            iArr2[3] = C1687.m3695(m37283, m37282, 0.38f);
            this.f3363 = new ColorStateList(iArr, iArr2);
        }
        return this.f3363;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3364 && C2786.m4838(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3364 = z;
        C2786.m4760(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
