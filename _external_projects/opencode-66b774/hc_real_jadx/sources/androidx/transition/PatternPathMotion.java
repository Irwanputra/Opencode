package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p034.p035.p043.p044.C1056;
import p034.p095.C1712;
import p237.p238.p239.p241.p242.C2786;

/* loaded from: /tmp/opencode/hc_real.dex */
public class PatternPathMotion extends PathMotion {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Matrix f1771;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Path f1772;

    public PatternPathMotion() {
        Path path = new Path();
        this.f1772 = path;
        this.f1771 = new Matrix();
        path.lineTo(1.0f, 0.0f);
    }

    @SuppressLint({"RestrictedApi"})
    public PatternPathMotion(Context context, AttributeSet attributeSet) {
        this.f1772 = new Path();
        this.f1771 = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1712.f7875);
        try {
            String m2394 = C1056.m2394(obtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (m2394 == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            m1008(C2786.m4830(m2394));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public void m1008(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        this.f1771.setTranslate(-f3, -f4);
        float f5 = f2 - f4;
        float sqrt = 1.0f / ((float) Math.sqrt((f5 * f5) + (r2 * r2)));
        this.f1771.postScale(sqrt, sqrt);
        this.f1771.postRotate((float) Math.toDegrees(-Math.atan2(f5, f - f3)));
        path.transform(this.f1771, this.f1772);
    }

    @Override // androidx.transition.PathMotion
    /* renamed from: げつ〴ぬぐ */
    public Path mo984(float f, float f2, float f3, float f4) {
        float f5 = f4 - f2;
        float sqrt = (float) Math.sqrt((f5 * f5) + (r6 * r6));
        double atan2 = Math.atan2(f5, f3 - f);
        this.f1771.setScale(sqrt, sqrt);
        this.f1771.postRotate((float) Math.toDegrees(atan2));
        this.f1771.postTranslate(f, f2);
        Path path = new Path();
        this.f1772.transform(this.f1771, path);
        return path;
    }
}
