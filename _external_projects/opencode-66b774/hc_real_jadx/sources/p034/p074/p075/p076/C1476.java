package p034.p074.p075.p076;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p034.p035.p038.C1010;
import p034.p035.p043.p044.C1056;
import p034.p095.C1687;
import p237.p238.p239.p241.p242.C2786;

/* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.くし〴〺ぅ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public class C1476 {

    /* renamed from: づざかべべ.ごづごきえ.げつ〴ぬぐ.げつ〴ぬぐ.くし〴〺ぅ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1477 implements TypeEvaluator<C1010[]> {

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public C1010[] f6835;

        @Override // android.animation.TypeEvaluator
        public C1010[] evaluate(float f, C1010[] c1010Arr, C1010[] c1010Arr2) {
            C1010[] c1010Arr3 = c1010Arr;
            C1010[] c1010Arr4 = c1010Arr2;
            if (!C2786.m4768(c1010Arr3, c1010Arr4)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!C2786.m4768(this.f6835, c1010Arr3)) {
                this.f6835 = C2786.m4767(c1010Arr3);
            }
            for (int i = 0; i < c1010Arr3.length; i++) {
                C1010 c1010 = this.f6835[i];
                C1010 c10102 = c1010Arr3[i];
                C1010 c10103 = c1010Arr4[i];
                c1010.getClass();
                c1010.f5386 = c10102.f5386;
                int i2 = 0;
                while (true) {
                    float[] fArr = c10102.f5385;
                    if (i2 < fArr.length) {
                        c1010.f5385[i2] = (c10103.f5385[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
            return this.f6835;
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static Keyframe m3209(Keyframe keyframe, float f) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f) : Keyframe.ofObject(f);
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static PropertyValuesHolder m3210(TypedArray typedArray, int i, int i2, int i3, String str) {
        PropertyValuesHolder ofInt;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i4 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i5 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && m3213(i4)) || (z2 && m3213(i5))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            C1481 c1481 = i == 3 ? C1481.f6851 : null;
            if (z3) {
                if (z) {
                    float dimension = i4 == 5 ? typedArray.getDimension(i2, 0.0f) : typedArray.getFloat(i2, 0.0f);
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                    } else {
                        ofInt = PropertyValuesHolder.ofFloat(str, dimension);
                    }
                } else {
                    ofInt = PropertyValuesHolder.ofFloat(str, i5 == 5 ? typedArray.getDimension(i3, 0.0f) : typedArray.getFloat(i3, 0.0f));
                }
            } else {
                if (!z) {
                    if (z2) {
                        ofInt = PropertyValuesHolder.ofInt(str, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m3213(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                    }
                    if (propertyValuesHolder == null && c1481 != null) {
                        propertyValuesHolder.setEvaluator(c1481);
                        return propertyValuesHolder;
                    }
                }
                int dimension2 = i4 == 5 ? (int) typedArray.getDimension(i2, 0.0f) : m3213(i4) ? typedArray.getColor(i2, 0) : typedArray.getInt(i2, 0);
                if (z2) {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2, i5 == 5 ? (int) typedArray.getDimension(i3, 0.0f) : m3213(i5) ? typedArray.getColor(i3, 0) : typedArray.getInt(i3, 0));
                } else {
                    ofInt = PropertyValuesHolder.ofInt(str, dimension2);
                }
            }
            propertyValuesHolder = ofInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        C1010[] m4813 = C2786.m4813(string);
        C1010[] m48132 = C2786.m4813(string2);
        if (m4813 == null && m48132 == null) {
            return null;
        }
        if (m4813 == null) {
            if (m48132 != null) {
                return PropertyValuesHolder.ofObject(str, new C1477(), m48132);
            }
            return null;
        }
        C1477 c1477 = new C1477();
        if (m48132 == null) {
            ofObject = PropertyValuesHolder.ofObject(str, c1477, m4813);
        } else {
            if (!C2786.m4768(m4813, m48132)) {
                throw new InflateException(" Can't morph from " + string + " to " + string2);
            }
            ofObject = PropertyValuesHolder.ofObject(str, c1477, m4813, m48132);
        }
        return ofObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x035d, code lost:
    
        if (r2.hasNext() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x035f, code lost:
    
        r1[r3] = (android.animation.Animator) r2.next();
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x036b, code lost:
    
        if (r27 != 0) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x036d, code lost:
    
        r26.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0371, code lost:
    
        r26.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0374, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x034a, code lost:
    
        if (r26 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x034c, code lost:
    
        if (r13 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x034e, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
        r3 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.animation.Animator m3211(android.content.Context r21, android.content.res.Resources r22, android.content.res.Resources.Theme r23, org.xmlpull.v1.XmlPullParser r24, android.util.AttributeSet r25, android.animation.AnimatorSet r26, int r27, float r28) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p074.p075.p076.C1476.m3211(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static ValueAnimator m3212(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        ValueAnimator valueAnimator2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        TypedArray m2396 = C1056.m2396(resources, theme, attributeSet, C1478.f6838);
        TypedArray m23962 = C1056.m2396(resources, theme, attributeSet, C1478.f6847);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        long j = C1056.m2390(xmlPullParser, "duration") ? m2396.getInt(1, 300) : 300;
        int i = 0;
        long j2 = !C1056.m2390(xmlPullParser, "startOffset") ? 0 : m2396.getInt(2, 0);
        int i2 = !C1056.m2390(xmlPullParser, "valueType") ? 4 : m2396.getInt(7, 4);
        if (C1056.m2390(xmlPullParser, "valueFrom") && C1056.m2390(xmlPullParser, "valueTo")) {
            if (i2 == 4) {
                TypedValue peekValue = m2396.peekValue(5);
                boolean z = peekValue != null;
                int i3 = z ? peekValue.type : 0;
                TypedValue peekValue2 = m2396.peekValue(6);
                boolean z2 = peekValue2 != null;
                i2 = ((z && m3213(i3)) || (z2 && m3213(z2 ? peekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder m3210 = m3210(m2396, i2, 5, 6, "");
            if (m3210 != null) {
                valueAnimator4.setValues(m3210);
            }
        }
        valueAnimator4.setDuration(j);
        valueAnimator4.setStartDelay(j2);
        valueAnimator4.setRepeatCount(!C1056.m2390(xmlPullParser, "repeatCount") ? 0 : m2396.getInt(3, 0));
        valueAnimator4.setRepeatMode(!C1056.m2390(xmlPullParser, "repeatMode") ? 1 : m2396.getInt(4, 1));
        if (m23962 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator4;
            String m2394 = C1056.m2394(m23962, xmlPullParser, "pathData", 1);
            if (m2394 != null) {
                String m23942 = C1056.m2394(m23962, xmlPullParser, "propertyXName", 2);
                String m23943 = C1056.m2394(m23962, xmlPullParser, "propertyYName", 3);
                if (m23942 == null && m23943 == null) {
                    throw new InflateException(m23962.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path m4830 = C2786.m4830(m2394);
                float f2 = 0.5f * f;
                PathMeasure pathMeasure = new PathMeasure(m4830, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f3 = 0.0f;
                do {
                    f3 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(m4830, false);
                int min = Math.min(100, ((int) (f3 / f2)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / (min - 1);
                valueAnimator2 = valueAnimator4;
                typedArray = m2396;
                int i4 = 0;
                float f5 = 0.0f;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int i5 = min;
                    pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i4)).floatValue(), fArr3, null);
                    fArr[i] = fArr3[0];
                    fArr2[i] = fArr3[1];
                    f5 += f4;
                    int i6 = i4 + 1;
                    if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i6;
                    }
                    i++;
                    min = i5;
                }
                PropertyValuesHolder ofFloat = m23942 != null ? PropertyValuesHolder.ofFloat(m23942, fArr) : null;
                PropertyValuesHolder ofFloat2 = m23943 != null ? PropertyValuesHolder.ofFloat(m23943, fArr2) : null;
                if (ofFloat == null) {
                    i = 0;
                    objectAnimator.setValues(ofFloat2);
                } else {
                    i = 0;
                    if (ofFloat2 == null) {
                        objectAnimator.setValues(ofFloat);
                    } else {
                        objectAnimator.setValues(ofFloat, ofFloat2);
                    }
                }
            } else {
                valueAnimator2 = valueAnimator4;
                typedArray = m2396;
                objectAnimator.setPropertyName(C1056.m2394(m23962, xmlPullParser, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator4;
            typedArray = m2396;
        }
        if (C1056.m2390(xmlPullParser, "interpolator")) {
            typedArray2 = typedArray;
            i = typedArray2.getResourceId(i, i);
        } else {
            typedArray2 = typedArray;
        }
        if (i > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(C1687.m3735(context, i));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (m23962 != null) {
            m23962.recycle();
        }
        return valueAnimator3;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static boolean m3213(int i) {
        return i >= 28 && i <= 31;
    }
}
