package dev.epro.r0;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import android.view.inputmethod.EditorInfo;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes3.dex */
public abstract class S2941385686793915703 implements Z8888095354249304160 {
    public static final Y4261039727803185691 A;
    public static final Y4261039727803185691 B;
    public static final Y4261039727803185691 C;
    public static final Y4261039727803185691 D;
    public static final Y4261039727803185691 E;
    public static final Y4261039727803185691 F;
    public static final Y4261039727803185691 G;
    public static final Y4261039727803185691 H;
    public static final Y4261039727803185691 I;
    public static final Y4261039727803185691 J;
    public static final Y4261039727803185691 K;
    public static final Y4261039727803185691 L;
    public static final Y4261039727803185691 M;
    public static final Y4261039727803185691 N;
    public static final O12545633033254628644 O;
    public static final Z14997871575210439922 P;
    public static final J18325703078859211263 Q;
    public static final J18325703078859211263[] R;
    public static final int S = 9;
    public static final int T = 10;
    public static final int U = 12;
    public static Z7022156542152740569 V;
    public static Context a;
    public static Boolean b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final double[][] g;
    public static final double[] h;
    public static final String[] i;
    public static final Object j;
    public static final Y4261039727803185691 k;
    public static final V10933700885381486763 l;
    public static final Y4261039727803185691 m;
    public static final Y4261039727803185691 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Y4261039727803185691 f484o;
    public static final Y4261039727803185691 p;
    public static final Y4261039727803185691 q;
    public static final Y4261039727803185691 r;
    public static final Y4261039727803185691 s;
    public static final Y4261039727803185691 t;
    public static final Y4261039727803185691 u;
    public static final Y4261039727803185691 v;
    public static final Y4261039727803185691 w;
    public static final Y4261039727803185691 x;
    public static final Y4261039727803185691 y;
    public static final Y4261039727803185691 z;

    public static long A(ByteBuffer byteBuffer) {
        long j2 = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j2 > 72057594037927935L) {
                throw new K6445406877359976829("Base-128 number too large");
            }
            byte b2 = byteBuffer.get();
            j2 = (j2 << 7) | ((long) (b2 & 127));
            if ((b2 & 128) == 0) {
                return j2;
            }
        }
        throw new K6445406877359976829("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    public static int B(double d2) {
        double d3 = d2 / 100.0d;
        int iRound = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (iRound < 0) {
            return 0;
        }
        if (iRound > 255) {
            return 255;
        }
        return iRound;
    }

    public static final boolean C(long j2, long j3) {
        return j2 == j3;
    }

    public static ArrayList D(Class cls) throws K6445406877359976829 {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            J16229365650376721338 j16229365650376721338 = (J16229365650376721338) field.getDeclaredAnnotation(J16229365650376721338.class);
            if (j16229365650376721338 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new K6445406877359976829(J16229365650376721338.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new N6991946250244024627(field, j16229365650376721338));
                } catch (K6445406877359976829 e2) {
                    throw new K6445406877359976829("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e2);
                }
            }
        }
        return arrayList;
    }

    public static DateTimeFormatter E(String str, Locale locale, LinkedHashMap linkedHashMap) {
        String str2 = "P:" + str + locale.toLanguageTag();
        Object objWithDecimalStyle = linkedHashMap.get(str2);
        if (objWithDecimalStyle == null) {
            objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            linkedHashMap.put(str2, objWithDecimalStyle);
        }
        objWithDecimalStyle.getClass();
        return D1067171241640027219.p(objWithDecimalStyle);
    }

    public static final Rect F(TextPaint textPaint, CharSequence charSequence, int i2, int i3) {
        int i4 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i4 - 1, i3, MetricAffectingSpan.class) != i3) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i4 < i3) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i4, i3, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i4, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i4, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i4, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i4 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i4, i3, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i4, i3, rect3);
        return rect3;
    }

    public static Class G(Field field) throws K6445406877359976829 {
        String typeName = field.getGenericType().getTypeName();
        int iIndexOf = typeName.indexOf(60);
        if (iIndexOf == -1) {
            throw new K6445406877359976829("Not a container type: " + field.getGenericType());
        }
        int i2 = iIndexOf + 1;
        int iIndexOf2 = typeName.indexOf(62, i2);
        if (iIndexOf2 != -1) {
            return Class.forName(typeName.substring(i2, iIndexOf2));
        }
        throw new K6445406877359976829("Not a container type: " + field.getGenericType());
    }

    public static final float H(Layout layout, int i2, Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i2);
        ThreadLocal threadLocal = Y3398285834625198673.a;
        if (layout.getEllipsisCount(i2) <= 0 || layout.getParagraphDirection(i2) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment == null ? -1 : I3997687310355757538.a[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - fMeasureText;
        }
        return width + fAbs;
    }

    public static final float I(Layout layout, int i2, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = Y3398285834625198673.a;
        if (layout.getEllipsisCount(i2) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i2) != -1 || layout.getWidth() >= layout.getLineRight(i2)) {
            return 0.0f;
        }
        float fMeasureText = paint.measureText("…") + (layout.getLineRight(i2) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i2) + layout.getLineStart(i2)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i2);
        if ((paragraphAlignment != null ? I3997687310355757538.a[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = (layout.getWidth() - fMeasureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i2);
            width2 = layout.getWidth() - fMeasureText;
        }
        return width - width2;
    }

    public static final Z7022156542152740569 J() {
        Z7022156542152740569 z7022156542152740569 = V;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.ManageAccounts", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        long j2 = U10174709222559481877.b;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(j2);
        V14323974914327418545 v14323974914327418545 = new V14323974914327418545((byte) 3);
        v14323974914327418545.j(4.0f, 18.0f);
        v14323974914327418545.s(-0.65f);
        v14323974914327418545.e(0.0f, -0.34f, 0.16f, -0.66f, 0.41f, -0.81f);
        v14323974914327418545.d(6.1f, 15.53f, 8.03f, 15.0f, 10.0f, 15.0f);
        v14323974914327418545.e(0.03f, 0.0f, 0.05f, 0.0f, 0.08f, 0.01f);
        v14323974914327418545.e(0.1f, -0.7f, 0.3f, -1.37f, 0.59f, -1.98f);
        v14323974914327418545.d(10.45f, 13.01f, 10.23f, 13.0f, 10.0f, 13.0f);
        v14323974914327418545.e(-2.42f, 0.0f, -4.68f, 0.67f, -6.61f, 1.82f);
        v14323974914327418545.d(2.51f, 15.34f, 2.0f, 16.32f, 2.0f, 17.35f);
        v14323974914327418545.r(20.0f);
        v14323974914327418545.g(9.26f);
        v14323974914327418545.e(-0.42f, -0.6f, -0.75f, -1.28f, -0.97f, -2.0f);
        v14323974914327418545.f(4.0f);
        v14323974914327418545.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545.a, h10765568533039107979, null, 1.0f, 14336);
        H10765568533039107979 h107655685330391079792 = new H10765568533039107979(j2);
        V14323974914327418545 v14323974914327418545D = G11450220448113054352.d(10.0f, 12.0f);
        v14323974914327418545D.e(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        v14323974914327418545D.o(-1.79f, -4.0f, -4.0f, -4.0f);
        v14323974914327418545D.d(7.79f, 4.0f, 6.0f, 5.79f, 6.0f, 8.0f);
        v14323974914327418545D.n(7.79f, 12.0f, 10.0f, 12.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(10.0f, 6.0f);
        v14323974914327418545D.e(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        v14323974914327418545D.o(-0.9f, 2.0f, -2.0f, 2.0f);
        v14323974914327418545D.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        v14323974914327418545D.n(8.9f, 6.0f, 10.0f, 6.0f);
        v14323974914327418545D.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h107655685330391079792, null, 1.0f, 14336);
        H10765568533039107979 h107655685330391079793 = new H10765568533039107979(j2);
        V14323974914327418545 v14323974914327418545D2 = G11450220448113054352.d(20.75f, 16.0f);
        v14323974914327418545D2.e(0.0f, -0.22f, -0.03f, -0.42f, -0.06f, -0.63f);
        v14323974914327418545D2.i(1.14f, -1.01f);
        v14323974914327418545D2.i(-1.0f, -1.73f);
        v14323974914327418545D2.i(-1.45f, 0.49f);
        v14323974914327418545D2.e(-0.32f, -0.27f, -0.68f, -0.48f, -1.08f, -0.63f);
        v14323974914327418545D2.h(18.0f, 11.0f);
        v14323974914327418545D2.g(-2.0f);
        v14323974914327418545D2.i(-0.3f, 1.49f);
        v14323974914327418545D2.e(-0.4f, 0.15f, -0.76f, 0.36f, -1.08f, 0.63f);
        v14323974914327418545D2.i(-1.45f, -0.49f);
        v14323974914327418545D2.i(-1.0f, 1.73f);
        v14323974914327418545D2.i(1.14f, 1.01f);
        v14323974914327418545D2.e(-0.03f, 0.21f, -0.06f, 0.41f, -0.06f, 0.63f);
        v14323974914327418545D2.o(0.03f, 0.42f, 0.06f, 0.63f);
        v14323974914327418545D2.i(-1.14f, 1.01f);
        v14323974914327418545D2.i(1.0f, 1.73f);
        v14323974914327418545D2.i(1.45f, -0.49f);
        v14323974914327418545D2.e(0.32f, 0.27f, 0.68f, 0.48f, 1.08f, 0.63f);
        v14323974914327418545D2.h(16.0f, 21.0f);
        v14323974914327418545D2.g(2.0f);
        v14323974914327418545D2.i(0.3f, -1.49f);
        v14323974914327418545D2.e(0.4f, -0.15f, 0.76f, -0.36f, 1.08f, -0.63f);
        v14323974914327418545D2.i(1.45f, 0.49f);
        v14323974914327418545D2.i(1.0f, -1.73f);
        v14323974914327418545D2.i(-1.14f, -1.01f);
        v14323974914327418545D2.d(20.72f, 16.42f, 20.75f, 16.22f, 20.75f, 16.0f);
        v14323974914327418545D2.c();
        v14323974914327418545D2.j(17.0f, 18.0f);
        v14323974914327418545D2.e(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        v14323974914327418545D2.o(0.9f, -2.0f, 2.0f, -2.0f);
        v14323974914327418545D2.o(2.0f, 0.9f, 2.0f, 2.0f);
        v14323974914327418545D2.n(18.1f, 18.0f, 17.0f, 18.0f);
        v14323974914327418545D2.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D2.a, h107655685330391079793, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        V = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static I1722681268793429505 K(I1722681268793429505 i1722681268793429505, S9385204271696540760 s9385204271696540760) {
        return i1722681268793429505.Q0(new V6577111084936217624(s9385204271696540760));
    }

    public static BigInteger M(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return BigInteger.ZERO;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new BigInteger(bArr);
    }

    public static double N(double d2) {
        return d2 > 0.008856451679035631d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double O(int i2) {
        double d2 = ((double) i2) / 255.0d;
        return (d2 <= 0.040449936d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static Object P(I15162792415829416729 i15162792415829416729, Class cls) throws K6445406877359976829 {
        int i2 = i15162792415829416729.c;
        int i3 = i15162792415829416729.b;
        L13834037291440535306 l13834037291440535306 = (L13834037291440535306) cls.getDeclaredAnnotation(L13834037291440535306.class);
        if (l13834037291440535306 == null) {
            throw new K6445406877359976829(cls.getName() + " is not annotated with " + L13834037291440535306.class.getName());
        }
        int iOrdinal = l13834037291440535306.type().ordinal();
        if (iOrdinal != 1 && iOrdinal != 5 && iOrdinal != 12) {
            throw new K6445406877359976829("Unsupported ASN.1 container annotation type: " + l13834037291440535306.type());
        }
        Q9140341247415722307 q9140341247415722307Type = l13834037291440535306.type();
        int iOrdinal2 = q9140341247415722307Type.ordinal();
        if (iOrdinal2 == 1) {
            return R(i15162792415829416729, cls);
        }
        if (iOrdinal2 != 5) {
            if (iOrdinal2 == 12) {
                return S(i15162792415829416729, cls, true);
            }
            throw new K6445406877359976829("Parsing container " + q9140341247415722307Type + " not supported");
        }
        int iP = C775827382551829194.P(q9140341247415722307Type);
        if (i3 == 0 && i2 == iP) {
            return S(i15162792415829416729, cls, false);
        }
        throw new U3857775939438126659("Unexpected data value read as " + cls.getName() + ". Expected " + C775827382551829194.X(0, iP) + ", but read: " + C775827382551829194.X(i3, i2));
    }

    public static Object Q(ByteBuffer byteBuffer, Class cls) throws K6445406877359976829 {
        try {
            I15162792415829416729 i15162792415829416729A = new Q13138685904306860250(byteBuffer, (byte) 0).a();
            if (i15162792415829416729A != null) {
                return P(i15162792415829416729A, cls);
            }
            throw new K6445406877359976829("Empty input");
        } catch (I6359084623320895730 e2) {
            throw new K6445406877359976829("Failed to decode top-level data value", e2);
        }
    }

    public static Object R(I15162792415829416729 i15162792415829416729, Class cls) throws K6445406877359976829 {
        ArrayList arrayListD = D(cls);
        if (arrayListD.isEmpty()) {
            throw new K6445406877359976829("No fields annotated with " + J16229365650376721338.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i2 = 0;
        int i3 = 0;
        while (i3 < arrayListD.size() - 1) {
            N6991946250244024627 n6991946250244024627 = (N6991946250244024627) arrayListD.get(i3);
            int i4 = n6991946250244024627.e;
            int i5 = n6991946250244024627.d;
            i3++;
            for (int i6 = i3; i6 < arrayListD.size(); i6++) {
                N6991946250244024627 n69919462502440246272 = (N6991946250244024627) arrayListD.get(i6);
                int i7 = n69919462502440246272.e;
                int i8 = n69919462502440246272.d;
                if (i4 == i7 && i5 == i8) {
                    throw new K6445406877359976829("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + n6991946250244024627.a.getName() + " and ." + n69919462502440246272.a.getName());
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            int size = arrayListD.size();
            while (i2 < size) {
                Object obj = arrayListD.get(i2);
                i2++;
                try {
                    ((N6991946250244024627) obj).a(i15162792415829416729, objNewInstance);
                    return objNewInstance;
                } catch (U3857775939438126659 unused) {
                }
            }
            throw new K6445406877359976829("No options of CHOICE " + cls.getName() + " matched");
        } catch (IllegalArgumentException | ReflectiveOperationException e2) {
            throw new K6445406877359976829("Failed to instantiate ".concat(cls.getName()), e2);
        }
    }

    public static Object S(I15162792415829416729 i15162792415829416729, Class cls, boolean z2) throws K6445406877359976829 {
        I15162792415829416729 i15162792415829416729A;
        ArrayList arrayListD = D(cls);
        Collections.sort(arrayListD, new M5459415309190684092((byte) 2));
        int i2 = 0;
        if (arrayListD.size() > 1) {
            int size = arrayListD.size();
            int i3 = 0;
            N6991946250244024627 n6991946250244024627 = null;
            while (i3 < size) {
                Object obj = arrayListD.get(i3);
                i3++;
                N6991946250244024627 n69919462502440246272 = (N6991946250244024627) obj;
                if (n6991946250244024627 != null && n6991946250244024627.b.index() == n69919462502440246272.b.index()) {
                    throw new K6445406877359976829("Fields have the same index: " + cls.getName() + "." + n6991946250244024627.a.getName() + " and ." + n69919462502440246272.a.getName());
                }
                n6991946250244024627 = n69919462502440246272;
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            Q13138685904306860250 q13138685904306860250 = new Q13138685904306860250(((ByteBuffer) i15162792415829416729.e).slice(), (byte) 0);
            while (i2 < arrayListD.size()) {
                if (z2 && i2 == 0) {
                    i15162792415829416729A = i15162792415829416729;
                } else {
                    try {
                        i15162792415829416729A = q13138685904306860250.a();
                    } catch (I6359084623320895730 e2) {
                        throw new K6445406877359976829("Malformed data value", e2);
                    }
                }
                if (i15162792415829416729A == null) {
                    break;
                }
                for (int i4 = i2; i4 < arrayListD.size(); i4++) {
                    N6991946250244024627 n69919462502440246273 = (N6991946250244024627) arrayListD.get(i4);
                    try {
                        if (n69919462502440246273.g) {
                            try {
                                n69919462502440246273.a(i15162792415829416729A, objNewInstance);
                            } catch (U3857775939438126659 unused) {
                            }
                        } else {
                            n69919462502440246273.a(i15162792415829416729A, objNewInstance);
                        }
                        i2 = i4 + 1;
                        break;
                    } catch (K6445406877359976829 e3) {
                        throw new K6445406877359976829("Failed to parse " + cls.getName() + "." + n69919462502440246273.a.getName(), e3);
                    }
                }
            }
            return objNewInstance;
        } catch (IllegalArgumentException | ReflectiveOperationException e4) {
            throw new K6445406877359976829("Failed to instantiate ".concat(cls.getName()), e4);
        }
    }

    public static ArrayList T(I15162792415829416729 i15162792415829416729, Class cls) throws K6445406877359976829 {
        ArrayList arrayList = new ArrayList();
        Q13138685904306860250 q13138685904306860250 = new Q13138685904306860250(((ByteBuffer) i15162792415829416729.e).slice(), (byte) 0);
        while (true) {
            try {
                I15162792415829416729 i15162792415829416729A = q13138685904306860250.a();
                if (i15162792415829416729A == null) {
                    return arrayList;
                }
                arrayList.add(ByteBuffer.class.equals(cls) ? ((ByteBuffer) i15162792415829416729A.e).slice() : V12599130403671467129.class.equals(cls) ? new V12599130403671467129(((ByteBuffer) i15162792415829416729A.d).slice()) : P(i15162792415829416729A, cls));
            } catch (I6359084623320895730 e2) {
                throw new K6445406877359976829("Malformed data value", e2);
            }
        }
    }

    public static final native void U(int i2, Object... objArr);

    public static final native N5407556009060208754 V(N5407556009060208754 n5407556009060208754, I17469115366493754886 i17469115366493754886, E13046209274714950185 e13046209274714950185, B13729205492206812220 b13729205492206812220, Object obj);

    public static final native Object W(O5208825566722149055 o5208825566722149055, O5208825566722149055 o52088255667221490552, P15312501481679979882 p15312501481679979882, K14749510448791472029 k14749510448791472029);

    public static V10300877997588547986 X(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        N6128695298966473235 n6128695298966473235 = obj2 != null ? (N6128695298966473235) N6128695298966473235.i.f(obj2) : null;
        obj3.getClass();
        return new V10300877997588547986(n6128695298966473235, (C13398002342190360892) O.f(obj3));
    }

    public static List Y(E13808449687169887804 e13808449687169887804, V10300877997588547986 v10300877997588547986) {
        List listV;
        N6128695298966473235 n6128695298966473235 = (N6128695298966473235) ((V697849047308847220) v10300877997588547986.c).getValue();
        if (n6128695298966473235 != null) {
            Integer numValueOf = Integer.valueOf(n6128695298966473235.a);
            String str = n6128695298966473235.b;
            String str2 = n6128695298966473235.c;
            long j2 = n6128695298966473235.d;
            int i2 = F12478849263529740365.c;
            Integer numValueOf2 = Integer.valueOf((int) (j2 >> 32));
            Integer numValueOf3 = Integer.valueOf((int) (j2 & 4294967295L));
            long j3 = n6128695298966473235.e;
            listV = K5751602218013079365.V(numValueOf, str, str2, numValueOf2, numValueOf3, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (4294967295L & j3)), Long.valueOf(n6128695298966473235.f));
        } else {
            listV = null;
        }
        return K5751602218013079365.V(listV, O.k(e13808449687169887804, (C13398002342190360892) v10300877997588547986.b));
    }

    public static void Z(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            bundle = new Bundle();
            editorInfo.extras = bundle;
        }
        bundle.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static final native void a(String str, M3727281027331139839 m3727281027331139839, int i2);

    public static void a0(EditorInfo editorInfo, CharSequence charSequence) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            G4756000168812988315.h(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i2 >= 30) {
            G4756000168812988315.h(editorInfo, charSequence);
            return;
        }
        int i3 = editorInfo.initialSelStart;
        int i4 = editorInfo.initialSelEnd;
        int i5 = i3 > i4 ? i4 : i3;
        if (i3 <= i4) {
            i3 = i4;
        }
        int length = charSequence.length();
        if (i5 < 0 || i3 > length) {
            b0(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            b0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            b0(editorInfo, charSequence, i5, i3);
            return;
        }
        int i7 = i3 - i5;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(charSequence.length() - i3, i9 - Math.min(i5, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i5, i9 - iMin);
        int i10 = i5 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + iMin) - 1))) {
            iMin--;
        }
        int i11 = iMin2 + i8;
        b0(editorInfo, i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + iMin2), charSequence.subSequence(i3, iMin + i3)) : charSequence.subSequence(i10, i11 + iMin + i10), iMin2, i11);
    }

    public static final A18119328133183277592 b(Object obj) {
        A18119328133183277592 a18119328133183277592 = new A18119328133183277592();
        a18119328133183277592.S(obj);
        return a18119328133183277592;
    }

    public static void b0(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static final void c(S11892176994350381461 s11892176994350381461, M3727281027331139839 m3727281027331139839, int i2) {
        R5670552972627103399 r5670552972627103399;
        S11892176994350381461 s118921769943503814612 = s11892176994350381461;
        m3727281027331139839.b0(294589392);
        int i3 = (m3727281027331139839.h(s118921769943503814612) ? 4 : 2) | i2;
        byte b2 = 0;
        if (m3727281027331139839.R(i3 & 1, (i3 & 3) != 2)) {
            U12915095113365621352 u12915095113365621352R = Y14426093132713118191.r(m3727281027331139839);
            S14249227312368728278 s14249227312368728278 = s118921769943503814612.b().e;
            W1972671267364756056 w1972671267364756056G = J10256772239794345968.g(s14249227312368728278, s14249227312368728278.a.getValue(), m3727281027331139839, 0, 0);
            List list = (List) w1972671267364756056G.getValue();
            boolean zBooleanValue = ((Boolean) m3727281027331139839.j(S146220729136318558.a)).booleanValue();
            boolean zF = m3727281027331139839.f(list);
            Object objM = m3727281027331139839.M();
            Object obj = O9023047933786425027.a;
            Object obj2 = objM;
            if (zF || objM == obj) {
                R5670552972627103399 r56705529726271033992 = new R5670552972627103399();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    R14289894334981469490 r14289894334981469490 = (R14289894334981469490) obj3;
                    if (zBooleanValue || r14289894334981469490.k.h.compareTo(Q14196755420833223976.d) >= 0) {
                        arrayList.add(obj3);
                    }
                }
                r56705529726271033992.addAll(arrayList);
                m3727281027331139839.k0(r56705529726271033992);
                obj2 = r56705529726271033992;
            }
            R5670552972627103399 r56705529726271033993 = (R5670552972627103399) obj2;
            j(r56705529726271033993, (List) w1972671267364756056G.getValue(), m3727281027331139839, 0);
            S14249227312368728278 s142492273123687282782 = s118921769943503814612.b().f;
            W1972671267364756056 w1972671267364756056G2 = J10256772239794345968.g(s142492273123687282782, s142492273123687282782.a.getValue(), m3727281027331139839, 0, 0);
            Object objM2 = m3727281027331139839.M();
            if (objM2 == obj) {
                objM2 = new R5670552972627103399();
                m3727281027331139839.k0(objM2);
            }
            R5670552972627103399 r56705529726271033994 = (R5670552972627103399) objM2;
            m3727281027331139839.a0(-367419233);
            ListIterator listIterator = r56705529726271033993.listIterator();
            while (true) {
                E12552353581788229419 e12552353581788229419 = (E12552353581788229419) listIterator;
                if (!e12552353581788229419.hasNext()) {
                    break;
                }
                R14289894334981469490 r142898943349814694902 = (R14289894334981469490) e12552353581788229419.next();
                V7801742040189616406 v7801742040189616406 = r142898943349814694902.b;
                v7801742040189616406.getClass();
                W2571868844412990642 w2571868844412990642 = (W2571868844412990642) v7801742040189616406;
                boolean zH = m3727281027331139839.h(s118921769943503814612) | m3727281027331139839.h(r142898943349814694902);
                Object objM3 = m3727281027331139839.M();
                if (zH || objM3 == obj) {
                    objM3 = new O9814524300768724052(s118921769943503814612, r142898943349814694902, b2);
                    m3727281027331139839.k0(objM3);
                }
                D15445857918358799638.b((B13729205492206812220) objM3, w2571868844412990642.f, S10823041268949770285.T(1129586364, new G989519692541748422(r142898943349814694902, s118921769943503814612, u12915095113365621352R, r56705529726271033994, w2571868844412990642, (byte) 2), m3727281027331139839), m3727281027331139839, 384, 0);
                s118921769943503814612 = s118921769943503814612;
                u12915095113365621352R = u12915095113365621352R;
                r56705529726271033994 = r56705529726271033994;
            }
            S11892176994350381461 s118921769943503814613 = s118921769943503814612;
            R5670552972627103399 r56705529726271033995 = r56705529726271033994;
            m3727281027331139839.q(false);
            Set set = (Set) w1972671267364756056G2.getValue();
            boolean zF2 = m3727281027331139839.f(w1972671267364756056G2) | m3727281027331139839.h(s118921769943503814613);
            Object objM4 = m3727281027331139839.M();
            if (zF2 || objM4 == obj) {
                s118921769943503814612 = s118921769943503814613;
                r5670552972627103399 = r56705529726271033995;
                Object b5703672629416386538 = new B5703672629416386538((Object) w1972671267364756056G2, (Object) s118921769943503814612, (Object) r5670552972627103399, (R4833348786910499294) null, (byte) 0);
                m3727281027331139839.k0(b5703672629416386538);
                objM4 = b5703672629416386538;
            } else {
                s118921769943503814612 = s118921769943503814613;
                r5670552972627103399 = r56705529726271033995;
            }
            Q13169198992966610970.m(set, r5670552972627103399, (L12639328004344855510) objM4, m3727281027331139839);
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new K5271540294206541871(s118921769943503814612, i2, (byte) 17);
        }
    }

    public static final S14249227312368728278 c0(J12043550928838212009 j12043550928838212009, W5797197595347441198 w5797197595347441198, N123190348026444920 n123190348026444920, Object obj) {
        O3228356295430981133 o3228356295430981133Y = y(j12043550928838212009, 1);
        S17255966974483065294 s17255966974483065294R = D15913187640519482289.r(obj);
        R7033599853981556291.D(w5797197595347441198, (G8001132634698687269) o3228356295430981133Y.d, n123190348026444920.equals(M441866190422865924.a) ? L856869997670741194.a : L856869997670741194.d, new J13979756969328643311(n123190348026444920, (J12043550928838212009) o3228356295430981133Y.b, s17255966974483065294R, obj, (R4833348786910499294) null));
        return new S14249227312368728278(s17255966974483065294R);
    }

    public static final native void d(J15344204527961023255 j15344204527961023255, P6926063660503721986 p6926063660503721986, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final Bitmap.Config d0(int i2) {
        if (i2 == 0) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i2 == 1) {
            return Bitmap.Config.ALPHA_8;
        }
        if (i2 == 2) {
            return Bitmap.Config.RGB_565;
        }
        int i3 = Build.VERSION.SDK_INT;
        return (i3 < 26 || i2 != 3) ? (i3 < 26 || i2 != 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final native void e(List list, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native Y1511631201141824769 e0(Exception exc, boolean z2);

    public static String f0(long j2) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return Float.intBitsToFloat(i2) == Float.intBitsToFloat(i3) ? G6547577305291411977.s("CornerRadius.circular(", D15913187640519482289.K(Float.intBitsToFloat(i2)), ")") : E12098517352909843120.m("CornerRadius.elliptical(", D15913187640519482289.K(Float.intBitsToFloat(i2)), ", ", D15913187640519482289.K(Float.intBitsToFloat(i3)), ")");
    }

    public static final native void g(O3815282298294382053 o3815282298294382053, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static double g0(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((d3 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d4 * 100.0d;
    }

    public static final native void h(J15344204527961023255 j15344204527961023255, V2742685563339280480 v2742685563339280480, boolean z2, H12676546736423743030 h12676546736423743030, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(J15344204527961023255 j15344204527961023255, H12676546736423743030 h12676546736423743030, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, M3727281027331139839 m3727281027331139839, int i2);

    public static final void j(List list, Collection collection, M3727281027331139839 m3727281027331139839, int i2) {
        m3727281027331139839.b0(1537894851);
        int i3 = (m3727281027331139839.h(list) ? 4 : 2) | i2 | (m3727281027331139839.h(collection) ? 32 : 16);
        if (m3727281027331139839.R(i3 & 1, (i3 & 19) != 18)) {
            boolean zBooleanValue = ((Boolean) m3727281027331139839.j(S146220729136318558.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                R14289894334981469490 r14289894334981469490 = (R14289894334981469490) it.next();
                I1283052979100930176 i1283052979100930176 = r14289894334981469490.k;
                boolean zG = m3727281027331139839.g(zBooleanValue) | m3727281027331139839.h(list) | m3727281027331139839.h(r14289894334981469490);
                Object objM = m3727281027331139839.M();
                if (zG || objM == O9023047933786425027.a) {
                    objM = new Q14899337567914334549(r14289894334981469490, zBooleanValue, list, (byte) 0);
                    m3727281027331139839.k0(objM);
                }
                Q13169198992966610970.c(i1283052979100930176, (F4096073349764486348) objM, m3727281027331139839);
            }
        } else {
            m3727281027331139839.U();
        }
        V4878375136513573151 v4878375136513573151T = m3727281027331139839.t();
        if (v4878375136513573151T != null) {
            v4878375136513573151T.d = new T14793413619962821194(list, collection, i2, (byte) 20);
        }
    }

    public static final native void l(I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void m(boolean z2, boolean z3, boolean z4, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void n(J15344204527961023255 j15344204527961023255, H12676546736423743030 h12676546736423743030, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(boolean z2, String str, List list, F4096073349764486348 f4096073349764486348, F4096073349764486348 f40960733497644863482, F4096073349764486348 f40960733497644863483, L12639328004344855510 l12639328004344855510, F4096073349764486348 f40960733497644863484, F4096073349764486348 f40960733497644863485, L12639328004344855510 l126393280043448555102, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void p(F16705069398168805061 f16705069398168805061, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(int i2, M3727281027331139839 m3727281027331139839);

    public static final native void r(List list, F4096073349764486348 f4096073349764486348, L12639328004344855510 l12639328004344855510, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void s(U1451576456533617578 u1451576456533617578, B13729205492206812220 b13729205492206812220, B13729205492206812220 b137292054922068122202, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void t(List list, B13729205492206812220 b13729205492206812220, L12639328004344855510 l12639328004344855510, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final Bitmap u(F2238012860950049442 f2238012860950049442) {
        if (f2238012860950049442 instanceof F2238012860950049442) {
            return f2238012860950049442.a;
        }
        D11988991656201568495.j("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    public static final void v(J14024120050125738337 j14024120050125738337, V10300877997588547986 v10300877997588547986, R3192876217964974737 r3192876217964974737) {
        v10300877997588547986.getClass();
        r3192876217964974737.getClass();
        S4320905983517725173 s4320905983517725173 = (S4320905983517725173) j14024120050125738337.c("androidx.lifecycle.savedstate.vm.tag");
        if (s4320905983517725173 == null || s4320905983517725173.c) {
            return;
        }
        s4320905983517725173.g(v10300877997588547986, r3192876217964974737);
        Q14196755420833223976 q14196755420833223976 = ((I1283052979100930176) r3192876217964974737).h;
        if (q14196755420833223976 == Q14196755420833223976.b || q14196755420833223976.compareTo(Q14196755420833223976.d) >= 0) {
            v10300877997588547986.A();
        } else {
            r3192876217964974737.a(new F15441078260174406238((Object) r3192876217964974737, (Object) v10300877997588547986, (byte) 1));
        }
    }

    public static void x(Y1644299864327434647 y1644299864327434647, String str, T15443218846549482730 t15443218846549482730) {
        G1840519957725232630 g1840519957725232630 = y1644299864327434647.f;
        g1840519957725232630.getClass();
        y1644299864327434647.h.add(new N3339328848755760537((E405169748098369564) g1840519957725232630.b(B11964701839924937722.y(E405169748098369564.class)), str, t15443218846549482730).a());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.O3228356295430981133 y(dev.epro.r0.J12043550928838212009 r7, int r8) {
        /*
            dev.epro.r0.S14925445853137674304 r0 = dev.epro.r0.E5386183571211952538.Oo
            r0.getClass()
            int r0 = dev.epro.r0.S14925445853137674304.b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof dev.epro.r0.M8065676928355175142
            dev.epro.r0.T1542296375665870064 r2 = dev.epro.r0.T1542296375665870064.a
            if (r1 == 0) goto L3b
            r1 = r7
            dev.epro.r0.M8065676928355175142 r1 = (dev.epro.r0.M8065676928355175142) r1
            dev.epro.r0.T1542296375665870064 r3 = r1.c
            dev.epro.r0.J12043550928838212009 r4 = r1.e()
            if (r4 == 0) goto L3b
            dev.epro.r0.O3228356295430981133 r7 = new dev.epro.r0.O3228356295430981133
            int r5 = r1.b
            r6 = -3
            if (r5 == r6) goto L2b
            r6 = -2
            if (r5 == r6) goto L2b
            if (r5 == 0) goto L2b
            r0 = r5
            goto L35
        L2b:
            r6 = 0
            if (r3 != r2) goto L32
            if (r5 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            dev.epro.r0.G8001132634698687269 r8 = r1.a
            r7.<init>(r0, r3, r8, r4)
            return r7
        L3b:
            dev.epro.r0.O3228356295430981133 r8 = new dev.epro.r0.O3228356295430981133
            dev.epro.r0.I3826119971291161142 r1 = dev.epro.r0.I3826119971291161142.a
            r8.<init>(r0, r2, r1, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.S2941385686793915703.y(dev.epro.r0.J12043550928838212009, int):dev.epro.r0.O3228356295430981133");
    }

    public void L(SQLiteConnection sQLiteConnection, Object obj) {
        sQLiteConnection.getClass();
        if (obj == null) {
            return;
        }
        SQLiteStatement sQLiteStatementPrepare = sQLiteConnection.prepare(z());
        try {
            w(sQLiteStatementPrepare, obj);
            sQLiteStatementPrepare.step();
            T18016951143603335921.y(sQLiteStatementPrepare, null);
        } finally {
        }
    }

    public native void w(SQLiteStatement sQLiteStatement, Object obj);

    public native String z();

    static {
        izmyclvb.qgayjvbiagej2(308);
        c = new int[]{R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
        d = new int[]{R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
        e = new int[]{R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
        f = new int[]{R.attr.name, R.attr.pathData};
        g = new double[][]{new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
        h = new double[]{95.047d, 100.0d, 108.883d};
        i = new String[0];
        j = new Object();
        Y4261039727803185691 y4261039727803185691 = Y4261039727803185691.m;
        k = y4261039727803185691;
        l = V10933700885381486763.c;
        Y4261039727803185691 y42610397278031856912 = Y4261039727803185691.h;
        m = y42610397278031856912;
        n = y42610397278031856912;
        f484o = y42610397278031856912;
        p = y42610397278031856912;
        q = y42610397278031856912;
        r = y42610397278031856912;
        Y4261039727803185691 y42610397278031856913 = Y4261039727803185691.a;
        s = y42610397278031856913;
        t = y42610397278031856912;
        u = y42610397278031856913;
        Y4261039727803185691 y42610397278031856914 = Y4261039727803185691.i;
        v = y42610397278031856914;
        w = y42610397278031856913;
        x = y42610397278031856913;
        y = y42610397278031856913;
        z = y42610397278031856912;
        A = y4261039727803185691;
        B = y42610397278031856914;
        C = y4261039727803185691;
        D = y42610397278031856914;
        E = y42610397278031856914;
        F = y42610397278031856912;
        G = y42610397278031856914;
        H = y42610397278031856914;
        I = y42610397278031856914;
        J = y42610397278031856914;
        K = y42610397278031856914;
        L = Y4261039727803185691.k;
        M = y42610397278031856914;
        N = y42610397278031856914;
        O = new O12545633033254628644((byte) 3);
        P = new Z14997871575210439922((byte) 9);
        J18325703078859211263 j18325703078859211263 = new J18325703078859211263("app_set_id");
        Q = j18325703078859211263;
        R = new J18325703078859211263[]{j18325703078859211263};
    }
}
