package com.codetroopers.betterpickers.radialtimepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import p034.p035.p043.C1067;
import p131.p145.p149.C2073;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;

/* loaded from: /tmp/opencode/hc_real.dex */
public class RadialSelectorView extends View {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Paint f2279;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f2280;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f2281;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2282;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public double f2283;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2284;

    public RadialSelectorView(Context context) {
        super(context);
        this.f2279 = new Paint();
    }

    public C2073 getDisappearAnimator() {
        return null;
    }

    public C2073 getReappearAnimator() {
        return null;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        getWidth();
    }

    public void setAnimationRadiusMultiplier(float f) {
        this.f2281 = f;
    }

    public void setSelection(int i, boolean z, boolean z2) {
        this.f2282 = i;
        double d = i;
        Double.isNaN(d);
        this.f2283 = (d * 3.141592653589793d) / 180.0d;
        this.f2280 = z2;
    }

    public void setTheme(TypedArray typedArray) {
        this.f2279.setColor(typedArray.getColor(C2679.BetterPickersDialogs_bpRadialPointerColor, C1067.m2405(getContext(), C2680.bpBlue)));
        this.f2284 = typedArray.getInt(C2679.BetterPickersDialogs_bpRadialPointerAlpha, 35);
    }
}
