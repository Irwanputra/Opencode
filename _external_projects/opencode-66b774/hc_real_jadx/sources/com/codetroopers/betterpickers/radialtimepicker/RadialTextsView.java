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
public class RadialTextsView extends View {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Paint f2285;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f2286;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public float f2287;

    public RadialTextsView(Context context) {
        super(context);
        this.f2285 = new Paint();
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
        this.f2287 = f;
        this.f2286 = true;
    }

    public void setTheme(TypedArray typedArray) {
        this.f2285.setColor(typedArray.getColor(C2679.BetterPickersDialogs_bpRadialTextColor, C1067.m2405(getContext(), C2680.bpBlue)));
    }
}
