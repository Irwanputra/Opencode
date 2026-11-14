package dev.epro.r0;

import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public abstract class L12240044716294895599 {
    static {
        izmyclvb.dpqpjfpoanwt1(591);
    }

    public static final native void a(R6894569913291645384 r6894569913291645384, M3727281027331139839 m3727281027331139839, int i);

    public static final R6653624393204003746 b(H11725168162114556860 h11725168162114556860, boolean z) {
        R15896830329318850690 r15896830329318850690 = (R15896830329318850690) h11725168162114556860.F.g;
        R16749699847173633337 r16749699847173633337 = null;
        if ((r15896830329318850690.d & 8) != 0) {
            loop0: while (true) {
                if (r15896830329318850690 == null) {
                    break;
                }
                if ((r15896830329318850690.c & 8) != 0) {
                    R15896830329318850690 r158968303293188506902 = r15896830329318850690;
                    D389890677992184566 d389890677992184566 = null;
                    while (r158968303293188506902 != null) {
                        if (r158968303293188506902 instanceof T11401768751197276141) {
                            r16749699847173633337 = r158968303293188506902;
                            break loop0;
                        }
                        if ((r158968303293188506902.c & 8) != 0 && (r158968303293188506902 instanceof J2215566372910931965)) {
                            int i = 0;
                            for (R15896830329318850690 r158968303293188506903 = ((J2215566372910931965) r158968303293188506902).p; r158968303293188506903 != null; r158968303293188506903 = r158968303293188506903.f) {
                                if ((r158968303293188506903.c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        r158968303293188506902 = r158968303293188506903;
                                    } else {
                                        if (d389890677992184566 == null) {
                                            d389890677992184566 = new D389890677992184566(0, new R15896830329318850690[16]);
                                        }
                                        if (r158968303293188506902 != null) {
                                            d389890677992184566.b(r158968303293188506902);
                                            r158968303293188506902 = null;
                                        }
                                        d389890677992184566.b(r158968303293188506903);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        r158968303293188506902 = R7033599853981556291.M(d389890677992184566);
                    }
                }
                if ((r15896830329318850690.d & 8) == 0) {
                    break;
                }
                r15896830329318850690 = r15896830329318850690.f;
            }
        }
        r16749699847173633337.getClass();
        R15896830329318850690 r158968303293188506904 = ((R15896830329318850690) ((T11401768751197276141) r16749699847173633337)).a;
        E10198359844879945462 w = h11725168162114556860.w();
        if (w == null) {
            w = new E10198359844879945462();
        }
        return new R6653624393204003746(r158968303293188506904, z, h11725168162114556860, w);
    }

    public static final long c(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = N13757329872968394114.c;
        return floatToRawIntBits;
    }

    public static File d(File file, String str, String str2) {
        File file2 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            file2 = new File(file, str);
            f(file2, false);
        }
        return new File(file2, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0025, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(ads_mobile_sdk.qi r3, java.lang.String r4, java.lang.String r5) {
        /*
            r4.getClass()
            r5.getClass()
            java.util.Map r3 = r3.r()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r0)
            r5.getClass()
            java.lang.Object r3 = r3.get(r5)
            ads_mobile_sdk.d9 r3 = (ads_mobile_sdk.d9) r3
            if (r3 != 0) goto L1d
            goto Lba
        L1d:
            dev.epro.r0.O6641393078261985068 r3 = r3.o()
            java.util.Iterator r3 = r3.iterator()
        L25:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lba
            java.lang.Object r5 = r3.next()
            ads_mobile_sdk.z8 r5 = (ads_mobile_sdk.z8) r5
            java.util.List r0 = r5.q()
            r0.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3f
            goto L25
        L3f:
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r4.toLowerCase(r2)
            r2.getClass()
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L43
            dev.epro.r0.O6641393078261985068 r0 = r5.p$1()
            r0.getClass()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L7a
            goto La9
        L7a:
            java.util.Iterator r0 = r0.iterator()
        L7e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La9
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            r1.getClass()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r4.toLowerCase(r2)
            r2.getClass()
            java.util.regex.Matcher r1 = r1.matcher(r2)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L7e
            goto L25
        La9:
            java.lang.String r3 = r5.o()
            r3.getClass()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            return r3
        Lba:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12240044716294895599.e(ads_mobile_sdk.qi, java.lang.String, java.lang.String):java.lang.String");
    }

    public static void f(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static boolean g(File file) {
        boolean z;
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                z = true;
                for (int i = 0; i < length; i++) {
                    File file2 = listFiles[i];
                    z = file2 != null && g(file2) && z;
                }
            } else {
                z = true;
            }
            if (!file.delete() || !z) {
                return false;
            }
        }
        return true;
    }

    public static boolean h(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                if (Build.VERSION.SDK_INT >= 34) {
                    file.setReadOnly();
                }
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                K5751602218013079365.z(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                K5751602218013079365.z(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                K5751602218013079365.z(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final native String i(String str);

    public static final S6349823729575121924 j(Y2066038017114788875 y2066038017114788875, int i, W12973714701299903186 w12973714701299903186, Q17957571128037780363 q17957571128037780363, boolean z, int i2) {
        S6349823729575121924 c = q17957571128037780363 != null ? q17957571128037780363.c(w12973714701299903186.b.s(i)) : S6349823729575121924.e;
        int g0 = y2066038017114788875.g0(2.0f);
        float f = c.a;
        return S6349823729575121924.b(c, z ? (i2 - f) - g0 : f, z ? i2 - f : g0 + f, 0.0f, 10);
    }

    public static final native boolean k(String str);

    public static PorterDuff.Mode l(int i) {
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i != 5) {
            if (i == 9) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            switch (i) {
                case 14:
                    return PorterDuff.Mode.MULTIPLY;
                case 15:
                    return PorterDuff.Mode.SCREEN;
                case 16:
                    return PorterDuff.Mode.ADD;
            }
        }
        return mode;
    }

    public static final native M16373572285252105429 m(boolean z, Set set, O11426817556915576293 o11426817556915576293, M16373572285252105429 m16373572285252105429, String str);

    public static final Object n(R3192876217964974737 r3192876217964974737, Q14196755420833223976 q14196755420833223976, L12639328004344855510 l12639328004344855510, R14062301455140331524 r14062301455140331524) {
        Object B;
        if (q14196755420833223976 != Q14196755420833223976.b) {
            return (((I1283052979100930176) r3192876217964974737).h != Q14196755420833223976.a && (B = O8620973563946607355.B(new O12152244488187446230(r3192876217964974737, q14196755420833223976, l12639328004344855510, null, (byte) 15), r14062301455140331524)) == Z3437138737604933638.a) ? B : O9245300239821758723.a;
        }
        S10973172697741180971.j("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final native Object o(O10781065997450475496 o10781065997450475496, int i, String str, W6885733510616988743 w6885733510616988743, E14344471265738280886 e14344471265738280886, F8480331572055172979 f8480331572055172979, A6815709613450786002 a6815709613450786002, F800668492203229591 f800668492203229591, J6984139493051942524 j6984139493051942524, G16186271555881050319 g16186271555881050319, K14749510448791472029 k14749510448791472029);

    public static final native int p(T13614432975881747224 t13614432975881747224);

    public static String q(A10473301933203002473 a10473301933203002473) {
        StringBuilder sb = new StringBuilder(a10473301933203002473.i());
        for (int i = 0; i < a10473301933203002473.i(); i++) {
            byte b = a10473301933203002473.b(i);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
