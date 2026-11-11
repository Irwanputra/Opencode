package p034.p074.p075.p076;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;
import p034.p035.p043.p044.C1056;
import p131.p155.p156.p157.C2098;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.づざかべべ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class InterpolatorC1479 implements Interpolator {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public float[] f6848;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public float[] f6849;

    public InterpolatorC1479(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray m2396 = C1056.m2396(context.getResources(), context.getTheme(), attributeSet, C1478.f6843);
        if (C1056.m2390(xmlPullParser, "pathData")) {
            String m2394 = C1056.m2394(m2396, xmlPullParser, "pathData", 4);
            Path m4830 = C2786.m4830(m2394);
            if (m4830 == null) {
                throw new InflateException(C2098.m4205("The path is null, which is created from ", m2394));
            }
            m3214(m4830);
        } else {
            if (!C1056.m2390(xmlPullParser, "controlX1")) {
                throw new InflateException("pathInterpolator requires the controlX1 attribute");
            }
            if (!C1056.m2390(xmlPullParser, "controlY1")) {
                throw new InflateException("pathInterpolator requires the controlY1 attribute");
            }
            float f = !C1056.m2390(xmlPullParser, "controlX1") ? 0.0f : m2396.getFloat(0, 0.0f);
            float f2 = !C1056.m2390(xmlPullParser, "controlY1") ? 0.0f : m2396.getFloat(1, 0.0f);
            boolean m2390 = C1056.m2390(xmlPullParser, "controlX2");
            if (m2390 != C1056.m2390(xmlPullParser, "controlY2")) {
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            if (m2390) {
                float f3 = !C1056.m2390(xmlPullParser, "controlX2") ? 0.0f : m2396.getFloat(2, 0.0f);
                float f4 = !C1056.m2390(xmlPullParser, "controlY2") ? 0.0f : m2396.getFloat(3, 0.0f);
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
                m3214(path);
            } else {
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.quadTo(f, f2, 1.0f, 1.0f);
                m3214(path2);
            }
        }
        m2396.recycle();
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f6849.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f < this.f6849[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f6849;
        float f2 = fArr[length] - fArr[i];
        if (f2 == 0.0f) {
            return this.f6848[i];
        }
        float f3 = (f - fArr[i]) / f2;
        float[] fArr2 = this.f6848;
        float f4 = fArr2[i];
        return C2098.m4188(fArr2[length], f4, f3, f4);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final void m3214(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int min = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (min <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f6849 = new float[min];
        this.f6848 = new float[min];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < min; i2++) {
            pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
            this.f6849[i2] = fArr[0];
            this.f6848[i2] = fArr[1];
        }
        if (Math.abs(this.f6849[0]) <= 1.0E-5d && Math.abs(this.f6848[0]) <= 1.0E-5d) {
            int i3 = min - 1;
            if (Math.abs(this.f6849[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f6848[i3] - 1.0f) <= 1.0E-5d) {
                float f = 0.0f;
                int i4 = 0;
                while (i < min) {
                    float[] fArr2 = this.f6849;
                    int i5 = i4 + 1;
                    float f2 = fArr2[i4];
                    if (f2 < f) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                    }
                    fArr2[i] = f2;
                    i++;
                    f = f2;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder m4207 = C2098.m4207("The Path must start at (0,0) and end at (1,1) start: ");
        m4207.append(this.f6849[0]);
        m4207.append(",");
        m4207.append(this.f6848[0]);
        m4207.append(" end:");
        int i6 = min - 1;
        m4207.append(this.f6849[i6]);
        m4207.append(",");
        m4207.append(this.f6848[i6]);
        throw new IllegalArgumentException(m4207.toString());
    }
}
