package p131.p161.p162.p163.p166;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import p034.p035.p045.C1096;
import p034.p095.C1687;
import p131.p161.p162.p163.C2243;
import p131.p161.p162.p163.p173.C2163;
import p131.p161.p162.p163.p173.C2178;
import p131.p161.p162.p163.p173.C2180;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.〺つふすそ.〻ぞまぎな〻.げつ〴ぬぐ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C2122 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final ColorStateList f8934;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final ColorStateList f8935;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Rect f8936;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final int f8937;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C2180 f8938;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final ColorStateList f8939;

    public C2122(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C2180 c2180, Rect rect) {
        C2786.m4762(rect.left);
        C2786.m4762(rect.top);
        C2786.m4762(rect.right);
        C2786.m4762(rect.bottom);
        this.f8936 = rect;
        this.f8934 = colorStateList2;
        this.f8935 = colorStateList;
        this.f8939 = colorStateList3;
        this.f8937 = i;
        this.f8938 = c2180;
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static C2122 m4212(Context context, int i) {
        if (!(i != 0)) {
            throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C2243.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C2243.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(C2243.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(C2243.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(C2243.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList m3662 = C1687.m3662(context, obtainStyledAttributes, C2243.MaterialCalendarItem_itemFillColor);
        ColorStateList m36622 = C1687.m3662(context, obtainStyledAttributes, C2243.MaterialCalendarItem_itemTextColor);
        ColorStateList m36623 = C1687.m3662(context, obtainStyledAttributes, C2243.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C2243.MaterialCalendarItem_itemStrokeWidth, 0);
        C2180 m4291 = C2180.m4285(context, obtainStyledAttributes.getResourceId(C2243.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(C2243.MaterialCalendarItem_itemShapeAppearanceOverlay, 0), new C2178(0)).m4291();
        obtainStyledAttributes.recycle();
        return new C2122(m3662, m36622, m36623, dimensionPixelSize, m4291, rect);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m4213(TextView textView) {
        C2163 c2163 = new C2163();
        C2163 c21632 = new C2163();
        c2163.setShapeAppearanceModel(this.f8938);
        c21632.setShapeAppearanceModel(this.f8938);
        c2163.m4252(this.f8935);
        c2163.m4264(this.f8937, this.f8939);
        textView.setTextColor(this.f8934);
        int i = Build.VERSION.SDK_INT;
        Drawable rippleDrawable = i >= 21 ? new RippleDrawable(this.f8934.withAlpha(30), c2163, c21632) : c2163;
        Rect rect = this.f8936;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        AtomicInteger atomicInteger = C1096.f5578;
        if (i >= 16) {
            textView.setBackground(insetDrawable);
        } else {
            textView.setBackgroundDrawable(insetDrawable);
        }
    }
}
