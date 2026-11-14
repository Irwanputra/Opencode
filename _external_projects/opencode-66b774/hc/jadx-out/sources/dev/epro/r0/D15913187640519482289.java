package dev.epro.r0;

import android.R;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.provider.Settings;
import android.view.MotionEvent;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.concurrent.Executor;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes.dex */
public abstract class D15913187640519482289 {
    public static String a;
    public static final D9734197463427655843 b;
    public static final D9734197463427655843 c;
    public static final Y4261039727803185691 d;
    public static final Y4261039727803185691 e;
    public static final D14731132657808549702 f;
    public static final D14731132657808549702 g;
    public static final O3410298526443296213 h;
    public static final O3410298526443296213 i;
    public static final O3410298526443296213 j;
    public static final O3410298526443296213 k;
    public static final O3410298526443296213 l;
    public static final O3410298526443296213 m;
    public static final O3410298526443296213 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final O3410298526443296213 f199o;
    public static final O3410298526443296213 p;
    public static final Z14997871575210439922 q;
    public static Z7022156542152740569 r;
    public static Z7022156542152740569 s;
    public static Z7022156542152740569 t;

    public static final I1722681268793429505 A(I1722681268793429505 i1722681268793429505, I2828680009210448000 i2828680009210448000) {
        return i1722681268793429505.Q0(new N5095249537541890520(i2828680009210448000));
    }

    public static final native Integer B(Exception exc);

    public static final native Integer C(String str);

    public static final native String D(boolean z, M3727281027331139839 m3727281027331139839);

    public static final native long E(M3727281027331139839 m3727281027331139839);

    public static final J8834912944986221470 F(int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, boolean z) {
        D9497773141868343380 d9497773141868343380 = (D9497773141868343380) m3727281027331139839.j(C12851948089043223300.a);
        F10342546226345611902 f10342546226345611902 = (F10342546226345611902) m3727281027331139839.j(Y238707362170117896.n);
        boolean zD = ((((i2 & 896) ^ 384) > 256 && m3727281027331139839.f(b13729205492206812220)) || (i2 & 384) == 256) | ((((i2 & 14) ^ 6) > 4 && m3727281027331139839.g(false)) || (i2 & 6) == 4) | m3727281027331139839.d(f10342546226345611902.ordinal()) | m3727281027331139839.f(d9497773141868343380) | ((((i2 & 112) ^ 48) > 32 && m3727281027331139839.g(z)) || (i2 & 48) == 32);
        Object objM = m3727281027331139839.M();
        if (zD || objM == O9023047933786425027.a) {
            objM = new J8834912944986221470(b13729205492206812220, f10342546226345611902, z, d9497773141868343380);
            m3727281027331139839.k0(objM);
        }
        return (J8834912944986221470) objM;
    }

    public static final G17854281415623469737 G(M3727281027331139839 m3727281027331139839) {
        Object[] objArr = new Object[0];
        boolean zD = m3727281027331139839.d(0);
        Object objM = m3727281027331139839.M();
        if (zD || objM == O9023047933786425027.a) {
            objM = new H475444086652660118((byte) 20);
            m3727281027331139839.k0(objM);
        }
        return (G17854281415623469737) C468629748621011703.m(objArr, G17854281415623469737.k, (B13729205492206812220) objM, m3727281027331139839, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0204, code lost:
    
        if (r42 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0208, code lost:
    
        if (r44 > 100.01d) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020c, code lost:
    
        if (r12 <= 100.01d) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020f, code lost:
    
        r0 = ((((dev.epro.r0.K5751602218013079365.G(r42) & 255) << 16) | (-16777216)) | ((dev.epro.r0.K5751602218013079365.G(r44) & 255) << 8)) | (dev.epro.r0.K5751602218013079365.G(r12) & 255);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long H(float r50, long r51) {
        /*
            Method dump skipped, instruction units count: 1421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.D15913187640519482289.H(float, long):long");
    }

    public static final void I(Y1086209215650239921 y1086209215650239921, long j2, F4096073349764486348 f4096073349764486348, boolean z) {
        MotionEvent motionEventA = y1086209215650239921.a();
        if (motionEventA == null) {
            S10973172697741180971.j("The PointerEvent receiver cannot have a null MotionEvent.");
            return;
        }
        int action = motionEventA.getAction();
        if (z) {
            motionEventA.setAction(3);
        }
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        motionEventA.offsetLocation(-Float.intBitsToFloat(i2), -Float.intBitsToFloat(i3));
        f4096073349764486348.invoke(motionEventA);
        motionEventA.offsetLocation(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
        motionEventA.setAction(action);
    }

    public static String J(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final String K(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final native R18035714589640987170 L(NetworkCapabilities networkCapabilities);

    public static final native boolean M(String str);

    public static I1722681268793429505 N(I1722681268793429505 i1722681268793429505, G17854281415623469737 g17854281415623469737, int i2) {
        return i1722681268793429505.Q0(R7033599853981556291.p(V10993962107938880611.a, V4328928460681270358.c)).Q0(new J16220234084695226806(null, null, null, g17854281415623469737.e, R7000310675073492254.a, g17854281415623469737, true, true)).Q0(new O10025701552426213584(g17854281415623469737));
    }

    public static synchronized String O(Context context) {
        String str;
        String str2;
        try {
            str = a;
            if (str == null) {
                ContentResolver contentResolver = context.getContentResolver();
                String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                if (string == null || Y2666402291564931474.n()) {
                    string = "emulator";
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                        messageDigest.update(string.getBytes());
                        str2 = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                        break;
                    } catch (ArithmeticException unused) {
                        str2 = "";
                    } catch (NoSuchAlgorithmException unused2) {
                    }
                }
                str2 = "";
                str = str2;
                a = str;
            }
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    public static final native void a(Activity activity, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void b(float f2, List list, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, boolean z, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void c(F4096073349764486348 f4096073349764486348, W1972671267364756056 w1972671267364756056, long j2);

    public static final native void d(String str, String str2, boolean z, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, W17015830374102496917 w17015830374102496917, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void e(String str, boolean z, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void f(String str, boolean z, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void g(M15533668272320886254 m15533668272320886254, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, L12639328004344855510 l12639328004344855510, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, B13729205492206812220 b137292054922068122202, B13729205492206812220 b137292054922068122203, F4096073349764486348 f40960733497644863482, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void h(M15533668272320886254 m15533668272320886254, boolean z, boolean z2, boolean z3, I1722681268793429505 i1722681268793429505, L12639328004344855510 l12639328004344855510, B13729205492206812220 b13729205492206812220, F4096073349764486348 f4096073349764486348, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void i(int i2, boolean z, B13729205492206812220 b13729205492206812220, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i3);

    public static final native void j(long j2, String str, boolean z, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void k(X16042184966849612101 x16042184966849612101, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final native void l(int i2, B13729205492206812220 b13729205492206812220, M3727281027331139839 m3727281027331139839, I1722681268793429505 i1722681268793429505, boolean z);

    public static final native void m(String str, long j2, S10843832955279611263 s10843832955279611263, X16972678375567016829 x16972678375567016829, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void n(float f2, float f3, float f4, long j2, L12639328004344855510 l12639328004344855510, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void o(float f2, long j2, L12639328004344855510 l12639328004344855510);

    public static final native void p(Activity activity, M3727281027331139839 m3727281027331139839, int i2);

    public static final native void q(String str, float f2, List list, F4096073349764486348 f4096073349764486348, I1722681268793429505 i1722681268793429505, boolean z, M3727281027331139839 m3727281027331139839, int i2, int i3);

    public static final S17255966974483065294 r(Object obj) {
        if (obj == null) {
            obj = V12319504402545346730.g;
        }
        return new S17255966974483065294(obj);
    }

    public static final native T13328233054345968915 s(T13328233054345968915 t13328233054345968915, boolean z);

    public static final L11401906518982755057 t(Context context) {
        O5354877807466160604.Q(context, R.color.system_neutral1_0);
        O5354877807466160604.Q(context, R.color.system_neutral1_10);
        H(98.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        H(96.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        O5354877807466160604.Q(context, R.color.system_neutral1_50);
        H(94.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        H(92.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        O5354877807466160604.Q(context, R.color.system_neutral1_100);
        H(87.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        O5354877807466160604.Q(context, R.color.system_neutral1_200);
        O5354877807466160604.Q(context, R.color.system_neutral1_300);
        O5354877807466160604.Q(context, R.color.system_neutral1_400);
        O5354877807466160604.Q(context, R.color.system_neutral1_500);
        O5354877807466160604.Q(context, R.color.system_neutral1_600);
        O5354877807466160604.Q(context, R.color.system_neutral1_700);
        H(24.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        H(22.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        O5354877807466160604.Q(context, R.color.system_neutral1_800);
        H(17.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        H(12.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        O5354877807466160604.Q(context, R.color.system_neutral1_900);
        H(6.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        H(4.0f, O5354877807466160604.Q(context, R.color.system_neutral1_600));
        O5354877807466160604.Q(context, R.color.system_neutral1_1000);
        long jQ = O5354877807466160604.Q(context, R.color.system_neutral2_0);
        O5354877807466160604.Q(context, R.color.system_neutral2_10);
        long jH = H(98.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jH2 = H(96.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jQ2 = O5354877807466160604.Q(context, R.color.system_neutral2_50);
        long jH3 = H(94.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jH4 = H(92.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jQ3 = O5354877807466160604.Q(context, R.color.system_neutral2_100);
        long jH5 = H(87.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jQ4 = O5354877807466160604.Q(context, R.color.system_neutral2_200);
        O5354877807466160604.Q(context, R.color.system_neutral2_300);
        long jQ5 = O5354877807466160604.Q(context, R.color.system_neutral2_400);
        long jQ6 = O5354877807466160604.Q(context, R.color.system_neutral2_500);
        O5354877807466160604.Q(context, R.color.system_neutral2_600);
        long jQ7 = O5354877807466160604.Q(context, R.color.system_neutral2_700);
        long jH6 = H(24.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jH7 = H(22.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jQ8 = O5354877807466160604.Q(context, R.color.system_neutral2_800);
        long jH8 = H(17.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jH9 = H(12.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jQ9 = O5354877807466160604.Q(context, R.color.system_neutral2_900);
        long jH10 = H(6.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jH11 = H(4.0f, O5354877807466160604.Q(context, R.color.system_neutral2_600));
        long jQ10 = O5354877807466160604.Q(context, R.color.system_neutral2_1000);
        long jQ11 = O5354877807466160604.Q(context, R.color.system_accent1_0);
        O5354877807466160604.Q(context, R.color.system_accent1_10);
        O5354877807466160604.Q(context, R.color.system_accent1_50);
        long jQ12 = O5354877807466160604.Q(context, R.color.system_accent1_100);
        long jQ13 = O5354877807466160604.Q(context, R.color.system_accent1_200);
        O5354877807466160604.Q(context, R.color.system_accent1_300);
        O5354877807466160604.Q(context, R.color.system_accent1_400);
        O5354877807466160604.Q(context, R.color.system_accent1_500);
        long jQ14 = O5354877807466160604.Q(context, R.color.system_accent1_600);
        long jQ15 = O5354877807466160604.Q(context, R.color.system_accent1_700);
        long jQ16 = O5354877807466160604.Q(context, R.color.system_accent1_800);
        long jQ17 = O5354877807466160604.Q(context, R.color.system_accent1_900);
        O5354877807466160604.Q(context, R.color.system_accent1_1000);
        long jQ18 = O5354877807466160604.Q(context, R.color.system_accent2_0);
        O5354877807466160604.Q(context, R.color.system_accent2_10);
        O5354877807466160604.Q(context, R.color.system_accent2_50);
        long jQ19 = O5354877807466160604.Q(context, R.color.system_accent2_100);
        long jQ20 = O5354877807466160604.Q(context, R.color.system_accent2_200);
        O5354877807466160604.Q(context, R.color.system_accent2_300);
        O5354877807466160604.Q(context, R.color.system_accent2_400);
        O5354877807466160604.Q(context, R.color.system_accent2_500);
        long jQ21 = O5354877807466160604.Q(context, R.color.system_accent2_600);
        long jQ22 = O5354877807466160604.Q(context, R.color.system_accent2_700);
        long jQ23 = O5354877807466160604.Q(context, R.color.system_accent2_800);
        long jQ24 = O5354877807466160604.Q(context, R.color.system_accent2_900);
        O5354877807466160604.Q(context, R.color.system_accent2_1000);
        long jQ25 = O5354877807466160604.Q(context, R.color.system_accent3_0);
        O5354877807466160604.Q(context, R.color.system_accent3_10);
        O5354877807466160604.Q(context, R.color.system_accent3_50);
        long jQ26 = O5354877807466160604.Q(context, R.color.system_accent3_100);
        long jQ27 = O5354877807466160604.Q(context, R.color.system_accent3_200);
        O5354877807466160604.Q(context, R.color.system_accent3_300);
        O5354877807466160604.Q(context, R.color.system_accent3_400);
        O5354877807466160604.Q(context, R.color.system_accent3_500);
        long jQ28 = O5354877807466160604.Q(context, R.color.system_accent3_600);
        long jQ29 = O5354877807466160604.Q(context, R.color.system_accent3_700);
        long jQ30 = O5354877807466160604.Q(context, R.color.system_accent3_800);
        long jQ31 = O5354877807466160604.Q(context, R.color.system_accent3_900);
        O5354877807466160604.Q(context, R.color.system_accent3_1000);
        return new L11401906518982755057(jQ, jH, jH2, jQ2, jH3, jH4, jQ3, jH5, jQ4, jQ5, jQ6, jQ7, jH6, jH7, jQ8, jH8, jH9, jQ9, jH10, jH11, jQ10, jQ11, jQ12, jQ13, jQ14, jQ15, jQ16, jQ17, jQ18, jQ19, jQ20, jQ21, jQ22, jQ23, jQ24, jQ25, jQ26, jQ27, jQ28, jQ29, jQ30, jQ31);
    }

    public static final native Object u(B18437066071346442440 b18437066071346442440, T13328233054345968915 t13328233054345968915, R4833348786910499294 r4833348786910499294);

    public static final native String v(List list);

    public static final I1722681268793429505 w(I1722681268793429505 i1722681268793429505, H10681976249452161517 h10681976249452161517) {
        return i1722681268793429505.Q0(new N14197335738847091403(h10681976249452161517));
    }

    public static final Z7022156542152740569 x() {
        Z7022156542152740569 z7022156542152740569 = r;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545D = G11450220448113054352.d(12.0f, 2.0f);
        v14323974914327418545D.d(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        v14323974914327418545D.o(4.48f, 10.0f, 10.0f, 10.0f);
        v14323974914327418545D.o(10.0f, -4.48f, 10.0f, -10.0f);
        v14323974914327418545D.n(17.52f, 2.0f, 12.0f, 2.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(12.0f, 20.0f);
        v14323974914327418545D.e(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        v14323974914327418545D.o(3.59f, -8.0f, 8.0f, -8.0f);
        v14323974914327418545D.o(8.0f, 3.59f, 8.0f, 8.0f);
        v14323974914327418545D.o(-3.59f, 8.0f, -8.0f, 8.0f);
        G11450220448113054352.w(v14323974914327418545D, 16.59f, 7.58f, 10.0f, 14.17f);
        v14323974914327418545D.i(-2.59f, -2.58f);
        v14323974914327418545D.h(6.0f, 13.0f);
        v14323974914327418545D.i(4.0f, 4.0f);
        v14323974914327418545D.i(8.0f, -8.0f);
        v14323974914327418545D.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        r = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final Z7022156542152740569 y() {
        Z7022156542152740569 z7022156542152740569 = s;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.CloudUpload", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545D = G11450220448113054352.d(19.35f, 10.04f);
        v14323974914327418545D.d(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        v14323974914327418545D.d(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        v14323974914327418545D.d(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
        v14323974914327418545D.e(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        v14323974914327418545D.g(13.0f);
        v14323974914327418545D.e(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        v14323974914327418545D.e(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(19.0f, 18.0f);
        v14323974914327418545D.f(6.0f);
        v14323974914327418545D.e(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        v14323974914327418545D.e(0.0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f);
        v14323974914327418545D.i(1.07f, -0.11f);
        v14323974914327418545D.i(0.5f, -0.95f);
        v14323974914327418545D.d(8.08f, 7.14f, 9.94f, 6.0f, 12.0f, 6.0f);
        v14323974914327418545D.e(2.62f, 0.0f, 4.88f, 1.86f, 5.39f, 4.43f);
        v14323974914327418545D.i(0.3f, 1.5f);
        v14323974914327418545D.i(1.53f, 0.11f);
        v14323974914327418545D.e(1.56f, 0.1f, 2.78f, 1.41f, 2.78f, 2.96f);
        v14323974914327418545D.e(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(8.0f, 13.0f);
        v14323974914327418545D.g(2.55f);
        v14323974914327418545D.s(3.0f);
        v14323974914327418545D.g(2.9f);
        v14323974914327418545D.s(-3.0f);
        v14323974914327418545D.f(16.0f);
        v14323974914327418545D.i(-4.0f, -4.0f);
        v14323974914327418545D.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        s = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final A6532439337653820803 z(M10846389789027735899 m10846389789027735899, String str, Executor executor, B13729205492206812220 b13729205492206812220) {
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        executor.getClass();
        I1378617920849948703 i1378617920849948703 = new I1378617920849948703(0);
        X627358512999327803 x627358512999327803 = new X627358512999327803();
        x627358512999327803.c = new W8823188230031025271();
        G5920303990939058292 g5920303990939058292 = new G5920303990939058292(x627358512999327803);
        x627358512999327803.b = g5920303990939058292;
        x627358512999327803.a = L11610354117192841236.class;
        try {
            executor.execute(new C6304971381494908806(m10846389789027735899, str, b13729205492206812220, i1378617920849948703, x627358512999327803));
            x627358512999327803.a = o9245300239821758723;
        } catch (Exception e2) {
            g5920303990939058292.b.h(e2);
        }
        return new A6532439337653820803();
    }

    static {
        izmyclvb.oeynnivvrnts0(76);
        b = new D9734197463427655843(null, (byte) 0);
        c = new D9734197463427655843(null, (byte) 1);
        d = Y4261039727803185691.m;
        e = Y4261039727803185691.q;
        byte b2 = 25;
        f = new D14731132657808549702("NONE", b2);
        g = new D14731132657808549702("PENDING", b2);
        h = new O3410298526443296213(new L905776418423859032((byte) 5), new L905776418423859032((byte) 22));
        i = new O3410298526443296213(new L905776418423859032((byte) 6), new L905776418423859032((byte) 7));
        j = new O3410298526443296213(new L905776418423859032((byte) 8), new L905776418423859032((byte) 9));
        k = new O3410298526443296213(new L905776418423859032((byte) 10), new L905776418423859032((byte) 11));
        l = new O3410298526443296213(new L905776418423859032((byte) 12), new L905776418423859032((byte) 13));
        m = new O3410298526443296213(new L905776418423859032((byte) 14), new L905776418423859032((byte) 15));
        n = new O3410298526443296213(new L905776418423859032((byte) 16), new L905776418423859032((byte) 17));
        f199o = new O3410298526443296213(new L905776418423859032((byte) 18), new L905776418423859032((byte) 19));
        p = new O3410298526443296213(new L905776418423859032((byte) 20), new L905776418423859032((byte) 21));
        q = new Z14997871575210439922((byte) 29);
    }
}
