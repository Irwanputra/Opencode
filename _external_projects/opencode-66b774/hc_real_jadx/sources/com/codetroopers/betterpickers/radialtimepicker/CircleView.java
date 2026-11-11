package com.codetroopers.betterpickers.radialtimepicker;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import p034.p035.p043.C1067;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;

/* loaded from: /tmp/opencode/hc_real.dex */
public class CircleView extends View {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Paint f2252;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2253;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2254;

    public CircleView(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f2252 = paint;
        Resources resources = context.getResources();
        this.f2253 = resources.getColor(C2680.bpWhite);
        this.f2254 = resources.getColor(C2680.numbers_text_color);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        getWidth();
    }

    public void setTheme(TypedArray typedArray) {
        this.f2253 = typedArray.getColor(C2679.BetterPickersDialogs_bpRadialBackgroundColor, C1067.m2405(getContext(), C2680.radial_gray_light));
        this.f2254 = typedArray.getColor(C2679.BetterPickersDialogs_bpRadialTextColor, C1067.m2405(getContext(), C2680.bpBlue));
    }
}
