package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p034.p035.p043.p044.C1056;
import p034.p095.C1712;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public class ArcMotion extends PathMotion {

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static final float f1704 = (float) Math.tan(Math.toRadians(35.0d));

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float f1705;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public float f1706;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float f1707;

    public ArcMotion() {
        this.f1707 = 0.0f;
        this.f1705 = 0.0f;
        this.f1706 = f1704;
    }

    @SuppressLint({"RestrictedApi"})
    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1707 = 0.0f;
        this.f1705 = 0.0f;
        this.f1706 = f1704;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7867);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f1705 = m983(C1056.m2391(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.f1707 = m983(C1056.m2391(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        this.f1706 = m983(C1056.m2391(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static float m983(float f) {
        if (f < 0.0f || f > 90.0f) {
            throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
        }
        return (float) Math.tan(Math.toRadians(f / 2.0f));
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public Path mo984(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        float f7;
        Path path = new Path();
        path.moveTo(f, f2);
        float f8 = f3 - f;
        float f9 = f4 - f2;
        float f10 = (f9 * f9) + (f8 * f8);
        float f11 = (f + f3) / 2.0f;
        float f12 = (f2 + f4) / 2.0f;
        float f13 = 0.25f * f10;
        boolean z = f2 > f4;
        if (Math.abs(f8) < Math.abs(f9)) {
            float abs = Math.abs(f10 / (f9 * 2.0f));
            if (z) {
                f6 = abs + f4;
                f5 = f3;
            } else {
                f6 = abs + f2;
                f5 = f;
            }
            f7 = this.f1705;
        } else {
            float f14 = f10 / (f8 * 2.0f);
            if (z) {
                f6 = f2;
                f5 = f14 + f;
            } else {
                f5 = f3 - f14;
                f6 = f4;
            }
            f7 = this.f1707;
        }
        float f15 = f13 * f7 * f7;
        float f16 = f11 - f5;
        float f17 = f12 - f6;
        float f18 = (f17 * f17) + (f16 * f16);
        float f19 = this.f1706;
        float f20 = f13 * f19 * f19;
        if (f18 >= f15) {
            f15 = f18 > f20 ? f20 : 0.0f;
        }
        if (f15 != 0.0f) {
            float sqrt = (float) Math.sqrt(f15 / f18);
            f5 = C2098.m4188(f5, f11, sqrt, f11);
            f6 = C2098.m4188(f6, f12, sqrt, f12);
        }
        path.cubicTo((f + f5) / 2.0f, (f2 + f6) / 2.0f, (f5 + f3) / 2.0f, (f6 + f4) / 2.0f, f3, f4);
        return path;
    }
}
