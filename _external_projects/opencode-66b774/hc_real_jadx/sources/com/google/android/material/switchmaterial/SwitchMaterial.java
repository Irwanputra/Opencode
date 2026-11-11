package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2324;
import p131.p161.p162.p163.C2350;
import p131.p161.p162.p163.p171.C2156;

/* loaded from: /tmp/opencode/hc_real.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: えがぐせほち, reason: contains not printable characters */
    public ColorStateList f3438;

    /* renamed from: ち〴みぎ〻び, reason: contains not printable characters */
    public ColorStateList f3439;

    /* renamed from: ておぞぞはね, reason: contains not printable characters */
    public final C2156 f3440;

    /* renamed from: ばおぢでぎか, reason: contains not printable characters */
    public boolean f3441;

    /* renamed from: ごまけがぢは, reason: contains not printable characters */
    public static final int f3437 = C2350.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: こ〲しでおか, reason: contains not printable characters */
    public static final int[][] f3436 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2111.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.f3437
            android.content.Context r7 = p131.p161.p162.p163.p164.p165.C2112.m4210(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉ〲なぱぽた.げつ〴ぬぐ r7 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.ぉ〲なぱぽた.げつ〴ぬぐ
            r7.<init>(r0)
            r6.f3440 = r7
            int[] r2 = p131.p161.p162.p163.C2243.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = p131.p161.p162.p163.p185.C2255.m4408(r0, r1, r2, r3, r4, r5)
            int r9 = p131.p161.p162.p163.C2243.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f3441 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f3439 == null) {
            int m3728 = C1687.m3728(this, C2111.colorSurface);
            int m37282 = C1687.m3728(this, C2111.colorControlActivated);
            float dimension = getResources().getDimension(C2324.mtrl_switch_thumb_elevation);
            if (this.f3440.f9025) {
                dimension += C1687.m3729(this);
            }
            int m4237 = this.f3440.m4237(m3728, dimension);
            int[][] iArr = f3436;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C1687.m3695(m3728, m37282, 1.0f);
            iArr2[1] = m4237;
            iArr2[2] = C1687.m3695(m3728, m37282, 0.38f);
            iArr2[3] = m4237;
            this.f3439 = new ColorStateList(iArr, iArr2);
        }
        return this.f3439;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f3438 == null) {
            int[][] iArr = f3436;
            int[] iArr2 = new int[iArr.length];
            int m3728 = C1687.m3728(this, C2111.colorSurface);
            int m37282 = C1687.m3728(this, C2111.colorControlActivated);
            int m37283 = C1687.m3728(this, C2111.colorOnSurface);
            iArr2[0] = C1687.m3695(m3728, m37282, 0.54f);
            iArr2[1] = C1687.m3695(m3728, m37283, 0.32f);
            iArr2[2] = C1687.m3695(m3728, m37282, 0.12f);
            iArr2[3] = C1687.m3695(m3728, m37283, 0.12f);
            this.f3438 = new ColorStateList(iArr, iArr2);
        }
        return this.f3438;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3441 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f3441 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        ColorStateList colorStateList;
        this.f3441 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            colorStateList = getMaterialThemeColorsTrackTintList();
        } else {
            colorStateList = null;
            setThumbTintList(null);
        }
        setTrackTintList(colorStateList);
    }
}
