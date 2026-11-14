package dev.epro.r0;

import ads_mobile_sdk.bm3;
import ads_mobile_sdk.cu0;
import ads_mobile_sdk.d62;
import ads_mobile_sdk.jb1;
import ads_mobile_sdk.op1;
import ads_mobile_sdk.sq;
import ads_mobile_sdk.sx2;
import ads_mobile_sdk.vn3;
import ads_mobile_sdk.yi1;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import java.util.ArrayList;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class M17147082063200071302 {
    static {
        izmyclvb.dpqpjfpoanwt1(1344);
    }

    public static int A(byte[] bArr, int i, D15735805680132151670 d15735805680132151670) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            d15735805680132151670.b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        d15735805680132151670.b = j2;
        return i3;
    }

    public static final native String B(String str);

    public static final native String C(String str);

    public static final float D(G8001132634698687269 g8001132634698687269) {
        R1924881055215602246 r1924881055215602246 = (R1924881055215602246) g8001132634698687269.get(T13350664027331345869.z);
        float fQ = r1924881055215602246 != null ? r1924881055215602246.q() : 1.0f;
        if (fQ >= 0.0f) {
            return fQ;
        }
        H18335142247802896069.b("negative scale factor");
        return fQ;
    }

    public static H8867200589542945034 E(Q6854864344654328121 q6854864344654328121) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new H8867200589542945034(C15025379344307230271.q(q6854864344654328121));
        }
        TextPaint textPaint = new TextPaint(q6854864344654328121.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = q6854864344654328121.getBreakStrategy();
        int hyphenationFrequency = q6854864344654328121.getHyphenationFrequency();
        if (q6854864344654328121.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (q6854864344654328121.getInputType() & 15) != 3) {
            boolean z = q6854864344654328121.getLayoutDirection() == 1;
            switch (q6854864344654328121.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(C15025379344307230271.f(DecimalFormatSymbols.getInstance(q6854864344654328121.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new H8867200589542945034(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static int F(byte[] bArr, int i, O6641393078261985068 o6641393078261985068, D15735805680132151670 d15735805680132151670) throws yi1 {
        jb1 jb1Var = (jb1) o6641393078261985068;
        int iD = d(i, bArr.length, d15735805680132151670, bArr);
        int i2 = d15735805680132151670.a + iD;
        while (iD < i2) {
            int i3 = iD + 1;
            byte b = bArr[iD];
            if (b >= 0) {
                d15735805680132151670.a = b;
                iD = i3;
            } else {
                iD = r(b, i3, d15735805680132151670, bArr);
            }
            jb1Var.b(d15735805680132151670.a);
        }
        if (iD == i2) {
            return iD;
        }
        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static final boolean G(V14120702150497747934 v14120702150497747934) {
        long j = v14120702150497747934.e;
        return (j >>> 32) == (4294967295L & j) && j == v14120702150497747934.f && j == v14120702150497747934.g && j == v14120702150497747934.h;
    }

    public static int H(int i, byte[] bArr, int i2, int i3, O6641393078261985068 o6641393078261985068, D15735805680132151670 d15735805680132151670) {
        jb1 jb1Var = (jb1) o6641393078261985068;
        int iY = y(bArr, i2, d15735805680132151670);
        jb1Var.b(d15735805680132151670.a);
        while (iY < i3) {
            int iR = iY + 1;
            byte b = bArr[iY];
            if (b >= 0) {
                d15735805680132151670.a = b;
            } else {
                iR = r(b, iR, d15735805680132151670, bArr);
            }
            if (i != d15735805680132151670.a) {
                break;
            }
            iY = iR + 1;
            byte b2 = bArr[iR];
            if (b2 >= 0) {
                d15735805680132151670.a = b2;
            } else {
                iY = r(b2, iY, d15735805680132151670, bArr);
            }
            jb1Var.b(d15735805680132151670.a);
        }
        return iY;
    }

    public static final H7281108764511748709 I(H7281108764511748709 h7281108764511748709, H7281108764511748709 h72811087645117487092, float f) {
        long jJ0 = J8045362843799184672.j0(h7281108764511748709.a, h72811087645117487092.a, f);
        long j = h7281108764511748709.b;
        long j2 = h72811087645117487092.b;
        float fX = V933048422416352811.x(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float fX2 = V933048422416352811.x(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new H7281108764511748709(jJ0, (((long) Float.floatToRawIntBits(fX)) << 32) | (((long) Float.floatToRawIntBits(fX2)) & 4294967295L), V933048422416352811.x(h7281108764511748709.c, h72811087645117487092.c, f));
    }

    public static void J(TextView textView, int i) {
        if (i < 0) {
            K2042933864045806308.h();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            C15025379344307230271.t(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void K(TextView textView, int i) {
        if (i < 0) {
            K2042933864045806308.h();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void L(TextView textView, int i) {
        if (i < 0) {
            K2042933864045806308.h();
            return;
        }
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final native C5017314262626373504 M(C5017314262626373504 c5017314262626373504);

    public static final N14790519616779385252 N(Z1975157152518754667 z1975157152518754667) {
        return new N14790519616779385252(z1975157152518754667.a, z1975157152518754667.b, z1975157152518754667.c, z1975157152518754667.d);
    }

    public static ActionMode.Callback O(ActionMode.Callback callback) {
        return (!(callback instanceof G3912952387100762864) || Build.VERSION.SDK_INT < 26) ? callback : ((G3912952387100762864) callback).a;
    }

    public static final void P(A15735943669660071470 a15735943669660071470, Q17276063867044657934 q17276063867044657934) {
        q17276063867044657934.b.setValue(a15735943669660071470.e.getValue());
        Z13251062865217617579 z13251062865217617579 = q17276063867044657934.c;
        Z13251062865217617579 z132510628652176175792 = a15735943669660071470.f;
        int iB = z13251062865217617579.b();
        for (int i = 0; i < iB; i++) {
            z13251062865217617579.e(i, z132510628652176175792.a(i));
        }
        q17276063867044657934.e = a15735943669660071470.h;
        q17276063867044657934.d = a15735943669660071470.g;
        q17276063867044657934.f = ((Boolean) a15735943669660071470.i.getValue()).booleanValue();
    }

    public static final native C5017314262626373504 Q(C5017314262626373504 c5017314262626373504, S4895883000340653437 s4895883000340653437);

    public static ActionMode.Callback R(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof G3912952387100762864) || callback == null) ? callback : new G3912952387100762864(callback, textView);
    }

    public static final native void a(E17523205116624666034 e17523205116624666034, W5797197595347441198 w5797197595347441198, I1722681268793429505 i1722681268793429505, boolean z, M3727281027331139839 m3727281027331139839, int i, int i2);

    public static final native void b(boolean z, Z7022156542152740569 z7022156542152740569, int i, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final void c(M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505) {
        D4887919054349991205 d4887919054349991205 = D4887919054349991205.j;
        int iHashCode = Long.hashCode(m3727281027331139839.T);
        I1722681268793429505 i1722681268793429505N = V12319504402545346730.N(m3727281027331139839, i1722681268793429505);
        P3648740535677465818 p3648740535677465818L = m3727281027331139839.l();
        X4572652335386916693.Po.getClass();
        m3727281027331139839.d0();
        if (m3727281027331139839.S) {
            m3727281027331139839.k(H11725168162114556860.S);
        } else {
            m3727281027331139839.n0();
        }
        W7808703833045379622.J(P2382941533350862833.i, m3727281027331139839, d4887919054349991205);
        W7808703833045379622.J(P2382941533350862833.h, m3727281027331139839, p3648740535677465818L);
        W7808703833045379622.H(m3727281027331139839);
        W7808703833045379622.J(P2382941533350862833.g, m3727281027331139839, i1722681268793429505N);
        W7808703833045379622.J(P2382941533350862833.j, m3727281027331139839, Integer.valueOf(iHashCode));
        m3727281027331139839.q(true);
    }

    public static int d(int i, int i2, D15735805680132151670 d15735805680132151670, byte[] bArr) throws yi1 {
        int iY = y(bArr, i, d15735805680132151670);
        int i3 = d15735805680132151670.a;
        if (i3 < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        if (i3 <= i2 - iY) {
            return iY;
        }
        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return 0;
    }

    public static int e(int i, byte[] bArr, int i2, int i3, bm3 bm3Var, D15735805680132151670 d15735805680132151670) throws yi1 {
        if ((i >>> 3) == 0) {
            Z3383101362411723454.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iA = A(bArr, i2, d15735805680132151670);
            bm3Var.a(i, Long.valueOf(d15735805680132151670.b));
            return iA;
        }
        if (i4 == 1) {
            bm3Var.a(i, Long.valueOf(w(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iD = d(i2, bArr.length, d15735805680132151670, bArr);
            int i5 = d15735805680132151670.a;
            if (i5 == 0) {
                bm3Var.a(i, sq.b);
            } else {
                bm3Var.a(i, sq.a(iD, bArr, i5));
            }
            return iD + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                bm3Var.a(i, Integer.valueOf(s(i2, bArr)));
                return i2 + 4;
            }
            Z3383101362411723454.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        bm3 bm3VarB = bm3.b();
        int i6 = (i & (-8)) | 4;
        int i7 = d15735805680132151670.d + 1;
        d15735805680132151670.d = i7;
        if (i7 >= 100) {
            Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i8 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iY = y(bArr, i2, d15735805680132151670);
            int i9 = d15735805680132151670.a;
            if (i9 == i6) {
                i8 = i9;
                i2 = iY;
                break;
            }
            i2 = e(i9, bArr, iY, i3, bm3VarB, d15735805680132151670);
            i8 = i9;
        }
        d15735805680132151670.d--;
        if (i2 > i3 || i8 != i6) {
            Z3383101362411723454.o("Failed to parse the message.");
            return 0;
        }
        bm3Var.a(i, bm3VarB);
        return i2;
    }

    public static int f(int i, byte[] bArr, int i2, int i3, D15735805680132151670 d15735805680132151670) throws yi1 {
        if ((i >>> 3) == 0) {
            Z3383101362411723454.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return A(bArr, i2, d15735805680132151670);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return d(i2, bArr.length, d15735805680132151670, bArr) + d15735805680132151670.a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            Z3383101362411723454.o("Protocol message contained an invalid tag (zero).");
            return 0;
        }
        int i5 = (i & (-8)) | 4;
        int i6 = d15735805680132151670.d + 1;
        d15735805680132151670.d = i6;
        if (i6 >= 100) {
            Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i7 = 0;
        while (i2 < i3) {
            i2 = y(bArr, i2, d15735805680132151670);
            i7 = d15735805680132151670.a;
            if (i7 == i5) {
                break;
            }
            i2 = f(i7, bArr, i2, i3, d15735805680132151670);
        }
        d15735805680132151670.d--;
        if (i2 <= i3 && i7 == i5) {
            return i2;
        }
        Z3383101362411723454.o("Failed to parse the message.");
        return 0;
    }

    public static int g(Object obj, G18207276409179303092 g18207276409179303092, byte[] bArr, int i, int i2, int i3, D15735805680132151670 d15735805680132151670) throws yi1 {
        op1 op1Var = (op1) g18207276409179303092;
        int i4 = d15735805680132151670.d + 1;
        d15735805680132151670.d = i4;
        if (i4 >= 100) {
            Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int iA = op1Var.a(obj, bArr, i, i2, i3, d15735805680132151670);
        d15735805680132151670.d--;
        d15735805680132151670.c = obj;
        return iA;
    }

    public static int h(Object obj, G18207276409179303092 g18207276409179303092, byte[] bArr, int i, int i2, D15735805680132151670 d15735805680132151670) throws yi1 {
        int iD = d(i, i2, d15735805680132151670, bArr);
        int i3 = d15735805680132151670.a;
        int i4 = d15735805680132151670.d + 1;
        d15735805680132151670.d = i4;
        if (i4 >= 100) {
            Z3383101362411723454.o("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return 0;
        }
        int i5 = i3 + iD;
        g18207276409179303092.a(obj, bArr, iD, i5, d15735805680132151670);
        d15735805680132151670.d--;
        d15735805680132151670.c = obj;
        return i5;
    }

    public static int i(byte[] bArr, int i, D15735805680132151670 d15735805680132151670) throws yi1 {
        int iD = d(i, bArr.length, d15735805680132151670, bArr);
        int i2 = d15735805680132151670.a;
        if (i2 == 0) {
            d15735805680132151670.c = sq.b;
            return iD;
        }
        d15735805680132151670.c = sq.a(iD, bArr, i2);
        return iD + i2;
    }

    public static final sx2 j(K15572083692188606544 k15572083692188606544) {
        if (!(k15572083692188606544 instanceof P16422848101170923038)) {
            return null;
        }
        ArrayList arrayList = k15572083692188606544.k().a;
        if (arrayList.isEmpty()) {
            return null;
        }
        K15572083692188606544 k155720836921886065442 = (K15572083692188606544) arrayList.get(0);
        k155720836921886065442.getClass();
        if (!(k155720836921886065442 instanceof I16631908410500040363)) {
            return null;
        }
        I16631908410500040363 i16631908410500040363L = k155720836921886065442.l();
        return new sx2(d62.a(i16631908410500040363L, "rb_type", ""), d62.a(i16631908410500040363L, "rb_amount", 1));
    }

    public static final Object k(float f, float f2, float f3, M15459437176959963354 m15459437176959963354, final L12639328004344855510 l12639328004344855510, R14062301455140331524 r14062301455140331524) {
        O3410298526443296213 o3410298526443296213 = D15913187640519482289.h;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        F4096073349764486348 f4096073349764486348 = o3410298526443296213.a;
        Z13251062865217617579 z13251062865217617579C = (Z13251062865217617579) f4096073349764486348.invoke(f6);
        if (z13251062865217617579C == null) {
            z13251062865217617579C = ((Z13251062865217617579) f4096073349764486348.invoke(f4)).c();
        }
        Z13251062865217617579 z13251062865217617579 = z13251062865217617579C;
        W543543915243615877 w543543915243615877 = new W543543915243615877(m15459437176959963354, o3410298526443296213, f4, f5, z13251062865217617579);
        final byte b = 6;
        Object objL = l(new Q17276063867044657934(o3410298526443296213, f4, z13251062865217617579, 56), w543543915243615877, Long.MIN_VALUE, new F4096073349764486348(l12639328004344855510, b) { // from class: dev.epro.r0.N1560097300338813322
            public final /* synthetic */ byte a;
            public final /* synthetic */ L12639328004344855510 b;

            static {
                izmyclvb.dpqpjfpoanwt1(1531);
            }

            private native void krczmktvqwnm(L12639328004344855510 l126393280043448555102, byte b2);

            @Override // dev.epro.r0.F4096073349764486348
            public final native Object invoke(Object obj);

            {
                this.a = b;
                this.b = l12639328004344855510;
                krczmktvqwnm(l12639328004344855510, b);
            }
        }, r14062301455140331524);
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        if (objL != z3437138737604933638) {
            objL = o9245300239821758723;
        }
        return objL == z3437138737604933638 ? objL : o9245300239821758723;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(dev.epro.r0.Q17276063867044657934 r25, dev.epro.r0.E1725159089660790042 r26, long r27, final dev.epro.r0.F4096073349764486348 r29, dev.epro.r0.K14749510448791472029 r30) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M17147082063200071302.l(dev.epro.r0.Q17276063867044657934, dev.epro.r0.E1725159089660790042, long, dev.epro.r0.F4096073349764486348, dev.epro.r0.K14749510448791472029):java.lang.Object");
    }

    public static /* synthetic */ Object m(float f, float f2, M15459437176959963354 m15459437176959963354, L12639328004344855510 l12639328004344855510, R14062301455140331524 r14062301455140331524, int i) {
        if ((i & 8) != 0) {
            m15459437176959963354 = O4077903568229246.Q(0.0f, 0.0f, null, 7);
        }
        return k(f, f2, 0.0f, m15459437176959963354, l12639328004344855510, r14062301455140331524);
    }

    public static final Object n(Q17276063867044657934 q17276063867044657934, X14364139104409853146 x14364139104409853146, boolean z, F4096073349764486348 f4096073349764486348, K14749510448791472029 k14749510448791472029) {
        Object objL = l(q17276063867044657934, new G6335814235041277479(x14364139104409853146, q17276063867044657934.a, q17276063867044657934.b.getValue(), q17276063867044657934.c), z ? q17276063867044657934.d : Long.MIN_VALUE, f4096073349764486348, k14749510448791472029);
        return objL == Z3437138737604933638.a ? objL : O9245300239821758723.a;
    }

    public static final Object o(Q17276063867044657934 q17276063867044657934, Float f, M15459437176959963354 m15459437176959963354, boolean z, F4096073349764486348 f4096073349764486348, K14749510448791472029 k14749510448791472029) {
        Object objL = l(q17276063867044657934, new W543543915243615877(m15459437176959963354, q17276063867044657934.a, q17276063867044657934.b.getValue(), f, q17276063867044657934.c), z ? q17276063867044657934.d : Long.MIN_VALUE, f4096073349764486348, k14749510448791472029);
        return objL == Z3437138737604933638.a ? objL : O9245300239821758723.a;
    }

    public static /* synthetic */ Object p(Q17276063867044657934 q17276063867044657934, Float f, M7102034154292440921 m7102034154292440921, boolean z, F4096073349764486348 f4096073349764486348, K14749510448791472029 k14749510448791472029, int i) {
        if ((i & 2) != 0) {
            m7102034154292440921 = O4077903568229246.Q(0.0f, 0.0f, null, 7);
        }
        M7102034154292440921 m71020341542924409212 = m7102034154292440921;
        if ((i & 8) != 0) {
            f4096073349764486348 = new Y13361005827119333637((byte) 20);
        }
        return o(q17276063867044657934, f, m71020341542924409212, z, f4096073349764486348, k14749510448791472029);
    }

    public static final native Q7430090668634766253 q(Q7430090668634766253 q7430090668634766253, P15545122913475421999 p15545122913475421999, String str);

    public static int r(int i, int i2, D15735805680132151670 d15735805680132151670, byte[] bArr) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            d15735805680132151670.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            d15735805680132151670.a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            d15735805680132151670.a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            d15735805680132151670.a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                d15735805680132151670.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int s(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int t(G18207276409179303092 g18207276409179303092, int i, byte[] bArr, int i2, int i3, O6641393078261985068 o6641393078261985068, D15735805680132151670 d15735805680132151670) throws yi1 {
        cu0 cu0VarA = g18207276409179303092.a();
        G18207276409179303092 g182072764091793030922 = g18207276409179303092;
        byte[] bArr2 = bArr;
        int i4 = i3;
        D15735805680132151670 d157358056801321516702 = d15735805680132151670;
        int iH = h(cu0VarA, g182072764091793030922, bArr2, i2, i4, d157358056801321516702);
        g182072764091793030922.c(cu0VarA);
        d157358056801321516702.c = cu0VarA;
        o6641393078261985068.add(cu0VarA);
        while (iH < i4) {
            int iR = iH + 1;
            byte b = bArr2[iH];
            if (b >= 0) {
                d157358056801321516702.a = b;
            } else {
                iR = r(b, iR, d157358056801321516702, bArr2);
            }
            if (i != d157358056801321516702.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            G18207276409179303092 g182072764091793030923 = g182072764091793030922;
            cu0 cu0VarA2 = g182072764091793030923.a();
            D15735805680132151670 d157358056801321516703 = d157358056801321516702;
            int i5 = i4;
            iH = h(cu0VarA2, g182072764091793030923, bArr3, iR, i5, d157358056801321516703);
            g182072764091793030922 = g182072764091793030923;
            bArr2 = bArr3;
            i4 = i5;
            d157358056801321516702 = d157358056801321516703;
            g182072764091793030922.c(cu0VarA2);
            d157358056801321516702.c = cu0VarA2;
            o6641393078261985068.add(cu0VarA2);
        }
        return iH;
    }

    public static String u(P5124777957357031757 p5124777957357031757, P5124777957357031757[] p5124777957357031757Arr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int iB = p5124777957357031757.b();
        int i5 = 0;
        while (i5 < iB) {
            int i6 = (i5 + iB) / 2;
            while (i6 > -1 && p5124777957357031757.e(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (p5124777957357031757.e(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bE = p5124777957357031757Arr[i10].e(i11);
                    byte[] bArr = L14928198200995638215.a;
                    int i13 = bE & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bE2 = p5124777957357031757.e(i7 + i12);
                byte[] bArr2 = L14928198200995638215.a;
                i4 = i3 - (bE2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (p5124777957357031757Arr[i10].b() != i11) {
                    z2 = z;
                } else {
                    if (i10 == p5124777957357031757Arr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iB2 = p5124777957357031757Arr[i10].b() - i11;
                    int length = p5124777957357031757Arr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iB2 += p5124777957357031757Arr[i15].b();
                    }
                    if (iB2 >= i14) {
                        if (iB2 <= i14) {
                            return p5124777957357031757.i(i7, i9 + i7).h(F16059529287866721367.a);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iB = i6;
        }
        return null;
    }

    public static int v(byte[] bArr, int i, D15735805680132151670 d15735805680132151670) throws yi1 {
        int iD = d(i, bArr.length, d15735805680132151670, bArr);
        int i2 = d15735805680132151670.a;
        String strA = "";
        if (i2 == 0) {
            d15735805680132151670.c = "";
            return iD;
        }
        if (i2 == 0) {
            O17574792317020433029 o17574792317020433029 = vn3.a;
        } else {
            strA = vn3.a.a(iD, bArr, i2);
        }
        d15735805680132151670.c = strA;
        return iD + i2;
    }

    public static long w(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static final native Integer x(C5017314262626373504 c5017314262626373504, Y15427935686644244568 y15427935686644244568);

    public static int y(byte[] bArr, int i, D15735805680132151670 d15735805680132151670) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return r(b, i2, d15735805680132151670, bArr);
        }
        d15735805680132151670.a = b;
        return i2;
    }

    public static final void z(A15735943669660071470 a15735943669660071470, long j, float f, E1725159089660790042 e1725159089660790042, Q17276063867044657934 q17276063867044657934, F4096073349764486348 f4096073349764486348) {
        long jC = f == 0.0f ? e1725159089660790042.c() : (long) ((j - a15735943669660071470.c) / f);
        a15735943669660071470.g = j;
        a15735943669660071470.e.setValue(e1725159089660790042.b(jC));
        a15735943669660071470.f = e1725159089660790042.f(jC);
        if (e1725159089660790042.g(jC)) {
            a15735943669660071470.h = a15735943669660071470.g;
            a15735943669660071470.i.setValue(Boolean.FALSE);
        }
        P(a15735943669660071470, q17276063867044657934);
        f4096073349764486348.invoke(a15735943669660071470);
    }
}
