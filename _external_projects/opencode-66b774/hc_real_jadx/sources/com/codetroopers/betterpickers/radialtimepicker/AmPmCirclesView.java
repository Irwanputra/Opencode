package com.codetroopers.betterpickers.radialtimepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import p034.p035.p043.C1067;
import p131.p221.p222.C2679;
import p131.p221.p222.C2680;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AmPmCirclesView extends View {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public int f2244;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Paint f2245;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public int f2246;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public int f2247;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public int f2248;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public int f2249;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public int f2250;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public int f2251;

    public AmPmCirclesView(Context context) {
        super(context);
        this.f2245 = new Paint();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        getWidth();
    }

    public void setAmOrPm(int i) {
        this.f2244 = i;
    }

    public void setAmOrPmPressed(int i) {
        this.f2251 = i;
    }

    public void setTheme(TypedArray typedArray) {
        int i = C2679.BetterPickersDialogs_bpAmPmCircleColor;
        Context context = getContext();
        int i2 = C2680.bpBlue;
        this.f2248 = typedArray.getColor(i, C1067.m2405(context, i2));
        this.f2246 = typedArray.getColor(i, C1067.m2405(getContext(), i2));
        this.f2249 = typedArray.getColor(C2679.BetterPickersDialogs_bpAmPmTextColor, C1067.m2405(getContext(), C2680.bpWhite));
        this.f2247 = 200;
        this.f2250 = 50;
    }
}
