package p034.p035.p043.p044;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ, reason: contains not printable characters */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class C1056 {

    /* renamed from: づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.〳ぜぞぜべっ$げつ〴ぬぐ, reason: contains not printable characters */
    public static class C1057 {

        /* renamed from: 〺つふすそ, reason: contains not printable characters */
        public static Method f5505;

        /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
        public static boolean f5506;

        /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
        public static final Object f5507 = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r17.m2399(-3, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r17 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r17 != null) goto L28;
     */
    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface m2388(android.content.Context r13, int r14, android.util.TypedValue r15, int r16, p034.p035.p043.p044.AbstractC1059 r17, android.os.Handler r18, boolean r19) {
        /*
            r8 = r14
            r0 = r15
            r4 = r16
            r9 = r17
            r10 = r18
            android.content.res.Resources r2 = r13.getResources()
            r1 = 1
            r2.getValue(r14, r15, r1)
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L9f
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r0.startsWith(r1)
            r11 = 0
            r12 = -3
            if (r1 != 0) goto L25
            if (r9 == 0) goto L7d
            goto L7a
        L25:
            づざかべべ.づざかべべ.なぎぱいぢぎ<java.lang.String, android.graphics.Typeface> r1 = p034.p035.p038.C1019.f5408
            java.lang.String r3 = p034.p035.p038.C1019.m2363(r2, r14, r4)
            java.lang.Object r1 = r1.m3286(r3)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L3a
            if (r9 == 0) goto L38
            r9.m2397(r1, r10)
        L38:
            r11 = r1
            goto L7d
        L3a:
            java.lang.String r1 = r0.toLowerCase()     // Catch: java.lang.Throwable -> L77
            java.lang.String r3 = ".xml"
            boolean r1 = r1.endsWith(r3)     // Catch: java.lang.Throwable -> L77
            if (r1 == 0) goto L65
            android.content.res.XmlResourceParser r0 = r2.getXml(r14)     // Catch: java.lang.Throwable -> L77
            づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.〺つふすそ r1 = p237.p238.p239.p241.p242.C2786.m4787(r0, r2)     // Catch: java.lang.Throwable -> L77
            if (r1 != 0) goto L56
            if (r9 == 0) goto L7d
            r9.m2399(r12, r10)     // Catch: java.lang.Throwable -> L77
            goto L7d
        L56:
            r0 = r13
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            android.graphics.Typeface r11 = p034.p035.p038.C1019.m2364(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L77
            goto L7d
        L65:
            r1 = r13
            android.graphics.Typeface r0 = p034.p035.p038.C1019.m2362(r13, r2, r14, r0, r4)     // Catch: java.lang.Throwable -> L77
            if (r9 == 0) goto L75
            if (r0 == 0) goto L72
            r9.m2397(r0, r10)     // Catch: java.lang.Throwable -> L77
            goto L75
        L72:
            r9.m2399(r12, r10)     // Catch: java.lang.Throwable -> L77
        L75:
            r11 = r0
            goto L7d
        L77:
            if (r9 == 0) goto L7d
        L7a:
            r9.m2399(r12, r10)
        L7d:
            if (r11 != 0) goto L9e
            if (r9 == 0) goto L82
            goto L9e
        L82:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = p131.p155.p156.p157.C2098.m4207(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r14)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9e:
            return r11
        L9f:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r3 = "Resource \""
            java.lang.StringBuilder r3 = p131.p155.p156.p157.C2098.m4207(r3)
            java.lang.String r2 = r2.getResourceName(r14)
            r3.append(r2)
            java.lang.String r2 = "\" ("
            r3.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r14)
            r3.append(r2)
            java.lang.String r2 = ") is not a Font: "
            r3.append(r2)
            r3.append(r15)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034.p035.p043.p044.C1056.m2388(android.content.Context, int, android.util.TypedValue, int, づざかべべ.〳ぜぞぜべっ.なぎぱいぢぎ.〺つふすそ.ぁごぐすすぃ, android.os.Handler, boolean):android.graphics.Typeface");
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static C1063 m2389(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        C1063 c1063;
        if (m2390(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new C1063(null, null, typedValue.data);
            }
            try {
                c1063 = C1063.m2401(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                c1063 = null;
            }
            if (c1063 != null) {
                return c1063;
            }
        }
        return new C1063(null, null, i2);
    }

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public static boolean m2390(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static float m2391(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !m2390(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public static boolean m2392(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !m2390(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public static int m2393(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2390(xmlPullParser, str) ? i2 : typedArray.getResourceId(i, i2);
    }

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public static String m2394(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (m2390(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public static int m2395(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !m2390(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public static TypedArray m2396(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
