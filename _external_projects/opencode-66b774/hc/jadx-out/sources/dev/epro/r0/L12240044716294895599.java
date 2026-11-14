package dev.epro.r0;

import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L12240044716294895599 {
    static {
        izmyclvb.dpqpjfpoanwt1(591);
    }

    public static final native void a(R6894569913291645384 r6894569913291645384, M3727281027331139839 m3727281027331139839, int i);

    /* JADX WARN: Removed duplicated region for block: B:35:0x0064 A[LOOP:0: B:4:0x000d->B:35:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0067 A[EDGE_INSN: B:43:0x0067->B:36:0x0067 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0064], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.R6653624393204003746 b(dev.epro.r0.H11725168162114556860 r9, boolean r10) {
        /*
            dev.epro.r0.X9608137461199640409 r0 = r9.F
            java.lang.Object r0 = r0.g
            dev.epro.r0.R15896830329318850690 r0 = (dev.epro.r0.R15896830329318850690) r0
            int r1 = r0.d
            r1 = r1 & 8
            r2 = 0
            if (r1 == 0) goto L67
        Ld:
            if (r0 == 0) goto L67
            int r1 = r0.c
            r1 = r1 & 8
            if (r1 == 0) goto L5e
            r1 = r0
            r3 = r2
        L17:
            if (r1 == 0) goto L5e
            boolean r4 = r1 instanceof dev.epro.r0.T11401768751197276141
            if (r4 == 0) goto L1f
            r2 = r1
            goto L67
        L1f:
            int r4 = r1.c
            r4 = r4 & 8
            if (r4 == 0) goto L59
            boolean r4 = r1 instanceof dev.epro.r0.J2215566372910931965
            if (r4 == 0) goto L59
            r4 = r1
            dev.epro.r0.J2215566372910931965 r4 = (dev.epro.r0.J2215566372910931965) r4
            dev.epro.r0.R15896830329318850690 r4 = r4.p
            r5 = 0
            r6 = r5
        L30:
            r7 = 1
            if (r4 == 0) goto L56
            int r8 = r4.c
            r8 = r8 & 8
            if (r8 == 0) goto L53
            int r6 = r6 + 1
            if (r6 != r7) goto L3f
            r1 = r4
            goto L53
        L3f:
            if (r3 != 0) goto L4a
            dev.epro.r0.D389890677992184566 r3 = new dev.epro.r0.D389890677992184566
            r7 = 16
            dev.epro.r0.R15896830329318850690[] r7 = new dev.epro.r0.R15896830329318850690[r7]
            r3.<init>(r5, r7)
        L4a:
            if (r1 == 0) goto L50
            r3.b(r1)
            r1 = r2
        L50:
            r3.b(r4)
        L53:
            dev.epro.r0.R15896830329318850690 r4 = r4.f
            goto L30
        L56:
            if (r6 != r7) goto L59
            goto L17
        L59:
            dev.epro.r0.R15896830329318850690 r1 = dev.epro.r0.R7033599853981556291.M(r3)
            goto L17
        L5e:
            int r1 = r0.d
            r1 = r1 & 8
            if (r1 == 0) goto L67
            dev.epro.r0.R15896830329318850690 r0 = r0.f
            goto Ld
        L67:
            r2.getClass()
            dev.epro.r0.T11401768751197276141 r2 = (dev.epro.r0.T11401768751197276141) r2
            dev.epro.r0.R15896830329318850690 r2 = (dev.epro.r0.R15896830329318850690) r2
            dev.epro.r0.R15896830329318850690 r0 = r2.a
            dev.epro.r0.E10198359844879945462 r1 = r9.w()
            if (r1 != 0) goto L7b
            dev.epro.r0.E10198359844879945462 r1 = new dev.epro.r0.E10198359844879945462
            r1.<init>()
        L7b:
            dev.epro.r0.R6653624393204003746 r2 = new dev.epro.r0.R6653624393204003746
            r2.<init>(r0, r10, r9, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12240044716294895599.b(dev.epro.r0.H11725168162114556860, boolean):dev.epro.r0.R6653624393204003746");
    }

    public static final long c(float f, float f2) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        int i = N13757329872968394114.c;
        return jFloatToRawIntBits;
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

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0025, code lost:
    
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
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                z = true;
                for (int i = 0; i < length; i++) {
                    File file2 = fileArrListFiles[i];
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

    public static boolean h(File file, byte[] bArr) throws Throwable {
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
        S6349823729575121924 s6349823729575121924C = q17957571128037780363 != null ? q17957571128037780363.c(w12973714701299903186.b.s(i)) : S6349823729575121924.e;
        int iG0 = y2066038017114788875.g0(2.0f);
        float f = s6349823729575121924C.a;
        return S6349823729575121924.b(s6349823729575121924C, z ? (i2 - f) - iG0 : f, z ? i2 - f : iG0 + f, 0.0f, 10);
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
        Object objB;
        if (q14196755420833223976 != Q14196755420833223976.b) {
            return (((I1283052979100930176) r3192876217964974737).h != Q14196755420833223976.a && (objB = O8620973563946607355.B(new O12152244488187446230(r3192876217964974737, q14196755420833223976, l12639328004344855510, null, (byte) 15), r14062301455140331524)) == Z3437138737604933638.a) ? objB : O9245300239821758723.a;
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
                        } else {
                            sb.append((char) b);
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
