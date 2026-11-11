package p131.p161.p162.p163.p166;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p034.p095.C1687;
import p131.p161.p162.p163.C2111;
import p131.p161.p162.p163.C2243;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.〺つふすそ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2114 {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final Paint f8916;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final C2122 f8917;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final C2122 f8918;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final C2122 f8919;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final C2122 f8920;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final C2122 f8921;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C2122 f8922;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final C2122 f8923;

    public C2114(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C1687.m3699(context, C2111.materialCalendarStyle, C2132.class.getCanonicalName()), C2243.MaterialCalendar);
        this.f8920 = C2122.m4212(context, obtainStyledAttributes.getResourceId(C2243.MaterialCalendar_dayStyle, 0));
        this.f8918 = C2122.m4212(context, obtainStyledAttributes.getResourceId(C2243.MaterialCalendar_dayInvalidStyle, 0));
        this.f8917 = C2122.m4212(context, obtainStyledAttributes.getResourceId(C2243.MaterialCalendar_daySelectedStyle, 0));
        this.f8919 = C2122.m4212(context, obtainStyledAttributes.getResourceId(C2243.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList m3662 = C1687.m3662(context, obtainStyledAttributes, C2243.MaterialCalendar_rangeFillColor);
        this.f8923 = C2122.m4212(context, obtainStyledAttributes.getResourceId(C2243.MaterialCalendar_yearStyle, 0));
        this.f8921 = C2122.m4212(context, obtainStyledAttributes.getResourceId(C2243.MaterialCalendar_yearSelectedStyle, 0));
        this.f8922 = C2122.m4212(context, obtainStyledAttributes.getResourceId(C2243.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f8916 = paint;
        paint.setColor(m3662.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
