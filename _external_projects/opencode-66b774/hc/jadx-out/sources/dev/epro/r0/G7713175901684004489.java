package dev.epro.r0;

import ads_mobile_sdk.du0;
import ads_mobile_sdk.dv0;
import ads_mobile_sdk.em2;
import ads_mobile_sdk.iu0;
import ads_mobile_sdk.ji3;
import ads_mobile_sdk.kz2;
import ads_mobile_sdk.lw0;
import ads_mobile_sdk.mi3;
import ads_mobile_sdk.th3;
import ads_mobile_sdk.vv1;
import ads_mobile_sdk.wv0;
import ads_mobile_sdk.zv1;
import android.content.Context;
import android.text.Spanned;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o.bwmna.gdrqkg.izmyclvb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G7713175901684004489 {
    public static Z7022156542152740569 a;
    public static Z7022156542152740569 b;
    public static Thread c;

    static {
        izmyclvb.dpqpjfpoanwt1(183);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r26, dev.epro.r0.B13729205492206812220 r27, dev.epro.r0.I1722681268793429505 r28, boolean r29, dev.epro.r0.M17320125320876195115 r30, dev.epro.r0.M3727281027331139839 r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G7713175901684004489.a(boolean, dev.epro.r0.B13729205492206812220, dev.epro.r0.I1722681268793429505, boolean, dev.epro.r0.M17320125320876195115, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void b(int i, M3727281027331139839 m3727281027331139839, Q7430090668634766253 q7430090668634766253, T12100831175298321930 t12100831175298321930);

    public static vv1 c(kz2 kz2Var, mi3 mi3Var, zv1 zv1Var, FrameLayout frameLayout, Map map, ImageView.ScaleType scaleType) throws IOException {
        kz2Var.getClass();
        mi3Var.getClass();
        zv1Var.getClass();
        scaleType.getClass();
        wv0 wv0Var = wv0.CUI_NAME_NATIVE_AD_SIGNAL;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (ji3.b().a == null) {
            em2 em2VarA = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                vv1 vv1Var = new vv1(zv1Var.a(frameLayout, scaleType, map), zv1Var.c(frameLayout), zv1Var.b(frameLayout), zv1Var.a(frameLayout), zv1Var.a());
                em2VarA.close();
                return vv1Var;
            } catch (Throwable th) {
                try {
                    em2VarA.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        em2VarA.a(th);
                    }
                    if (th instanceof P2480554073835519965) {
                        throw new lw0(th);
                    }
                    if (th instanceof CancellationException) {
                        throw new du0(th);
                    }
                    if (th instanceof dv0) {
                        throw th;
                    }
                    throw new iu0(th);
                } finally {
                }
            }
        } else {
            th3 th3VarA = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                vv1 vv1Var2 = new vv1(zv1Var.a(frameLayout, scaleType, map), zv1Var.c(frameLayout), zv1Var.b(frameLayout), zv1Var.a(frameLayout), zv1Var.a());
                th3VarA.close();
                return vv1Var2;
            } catch (Throwable th2) {
                try {
                    th3VarA.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        th3VarA.a(th2);
                    }
                    if (th2 instanceof P2480554073835519965) {
                        throw new lw0(th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new du0(th2);
                    }
                    if (th2 instanceof dv0) {
                        throw th2;
                    }
                    throw new iu0(th2);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair d(java.io.RandomAccessFile r10, int r11) {
        /*
            r0 = 0
            if (r11 < 0) goto L8e
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r11 > r1) goto L8e
            long r2 = r10.length()
            r4 = 22
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L13
            goto L70
        L13:
            long r6 = (long) r11
            long r4 = r2 - r4
            long r4 = java.lang.Math.min(r6, r4)
            int r11 = (int) r4
            r4 = 22
            int r11 = r11 + r4
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocate(r11)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            r11.order(r5)
            int r6 = r11.capacity()
            long r6 = (long) r6
            long r2 = r2 - r6
            r10.seek(r2)
            byte[] r6 = r11.array()
            int r7 = r11.arrayOffset()
            int r8 = r11.capacity()
            r10.readFully(r6, r7, r8)
            java.nio.ByteOrder r10 = r11.order()
            if (r10 != r5) goto L88
            int r10 = r11.capacity()
            r5 = -1
            if (r10 >= r4) goto L4d
            goto L6d
        L4d:
            int r10 = r10 - r4
            int r4 = java.lang.Math.min(r10, r1)
            r6 = 0
        L53:
            if (r6 >= r4) goto L6d
            int r7 = r10 - r6
            int r8 = r11.getInt(r7)
            r9 = 101010256(0x6054b50, float:2.506985E-35)
            if (r8 != r9) goto L6a
            int r8 = r7 + 20
            short r8 = r11.getShort(r8)
            r8 = r8 & r1
            if (r8 != r6) goto L6a
            goto L6e
        L6a:
            int r6 = r6 + 1
            goto L53
        L6d:
            r7 = r5
        L6e:
            if (r7 != r5) goto L71
        L70:
            return r0
        L71:
            r11.position(r7)
            java.nio.ByteBuffer r10 = r11.slice()
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            r10.order(r11)
            long r0 = (long) r7
            long r2 = r2 + r0
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            android.util.Pair r10 = android.util.Pair.create(r10, r11)
            return r10
        L88:
            java.lang.String r10 = "ByteBuffer byte order must be little endian"
            dev.epro.r0.S10973172697741180971.j(r10)
            return r0
        L8e:
            java.lang.String r10 = "maxCommentSize: "
            java.lang.String r10 = dev.epro.r0.C468629748621011703.e(r11, r10)
            dev.epro.r0.S10973172697741180971.j(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G7713175901684004489.d(java.io.RandomAccessFile, int):android.util.Pair");
    }

    public static final native P16080705924044660797 e(String str);

    public static final Z7022156542152740569 f() {
        Z7022156542152740569 z7022156542152740569 = b;
        if (z7022156542152740569 != null) {
            return z7022156542152740569;
        }
        Q17593287602150918564 q17593287602150918564 = new Q17593287602150918564("Outlined.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = A5540824790408504619.a;
        H10765568533039107979 h10765568533039107979 = new H10765568533039107979(U10174709222559481877.b);
        V14323974914327418545 v14323974914327418545D = G11450220448113054352.d(18.0f, 16.08f);
        v14323974914327418545D.e(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        v14323974914327418545D.h(8.91f, 12.7f);
        v14323974914327418545D.e(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        v14323974914327418545D.o(-0.04f, -0.47f, -0.09f, -0.7f);
        v14323974914327418545D.i(7.05f, -4.11f);
        v14323974914327418545D.e(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        v14323974914327418545D.e(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        v14323974914327418545D.o(-1.34f, -3.0f, -3.0f, -3.0f);
        v14323974914327418545D.o(-3.0f, 1.34f, -3.0f, 3.0f);
        v14323974914327418545D.e(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        v14323974914327418545D.h(8.04f, 9.81f);
        v14323974914327418545D.d(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        v14323974914327418545D.e(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        v14323974914327418545D.o(1.34f, 3.0f, 3.0f, 3.0f);
        v14323974914327418545D.e(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        v14323974914327418545D.i(7.12f, 4.16f);
        v14323974914327418545D.e(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        v14323974914327418545D.e(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        v14323974914327418545D.o(2.92f, -1.31f, 2.92f, -2.92f);
        v14323974914327418545D.e(0.0f, -1.61f, -1.31f, -2.92f, -2.92f, -2.92f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(18.0f, 4.0f);
        v14323974914327418545D.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        v14323974914327418545D.o(-0.45f, 1.0f, -1.0f, 1.0f);
        v14323974914327418545D.o(-1.0f, -0.45f, -1.0f, -1.0f);
        v14323974914327418545D.o(0.45f, -1.0f, 1.0f, -1.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(6.0f, 13.0f);
        v14323974914327418545D.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v14323974914327418545D.o(0.45f, -1.0f, 1.0f, -1.0f);
        v14323974914327418545D.o(1.0f, 0.45f, 1.0f, 1.0f);
        v14323974914327418545D.o(-0.45f, 1.0f, -1.0f, 1.0f);
        v14323974914327418545D.c();
        v14323974914327418545D.j(18.0f, 20.02f);
        v14323974914327418545D.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v14323974914327418545D.o(0.45f, -1.0f, 1.0f, -1.0f);
        v14323974914327418545D.o(1.0f, 0.45f, 1.0f, 1.0f);
        v14323974914327418545D.o(-0.45f, 1.0f, -1.0f, 1.0f);
        v14323974914327418545D.c();
        Q17593287602150918564.a(q17593287602150918564, v14323974914327418545D.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 z7022156542152740569B = q17593287602150918564.b();
        b = z7022156542152740569B;
        return z7022156542152740569B;
    }

    public static final boolean g(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final void h(Context context) {
        Map mapSingletonMap;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            B14824868959299866349 b14824868959299866349N = B14824868959299866349.n();
            String[] strArr = B11188054920131162254.a;
            b14824868959299866349N.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr2 = B11188054920131162254.a;
            int iU0 = E4951175994894594588.u0(strArr2.length);
            if (iU0 < 16) {
                iU0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iU0);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                mapSingletonMap = Collections.singletonMap(databasePath2, noBackupFilesDir);
                mapSingletonMap.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                mapSingletonMap = linkedHashMap2;
            }
            for (Map.Entry entry : mapSingletonMap.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        B14824868959299866349 b14824868959299866349N2 = B14824868959299866349.n();
                        String[] strArr3 = B11188054920131162254.a;
                        file2.toString();
                        b14824868959299866349N2.getClass();
                    }
                    if (file.renameTo(file2)) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    B14824868959299866349 b14824868959299866349N3 = B14824868959299866349.n();
                    String[] strArr4 = B11188054920131162254.a;
                    b14824868959299866349N3.getClass();
                }
            }
        }
    }

    public static final P10917817599008460069 i(P10917817599008460069 p10917817599008460069) {
        p10917817599008460069.getClass();
        O6225539295864356213 o6225539295864356213B = p10917817599008460069.b();
        W7378377772343420238 w7378377772343420238 = p10917817599008460069.g;
        o6225539295864356213B.g = new C3791006194363318448(w7378377772343420238.d(), w7378377772343420238.c());
        return o6225539295864356213B.a();
    }

    public static final long j(String str, long j, long j2, long j3) {
        String property;
        int i = M9967499841304440286.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lI = Z13168519540281190457.I(10, property);
        if (lI == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lI.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        StringBuilder sbH = X2485016533998461232.h("System property '", str, "' should be in range ", j2);
        sbH.append("..");
        sbH.append(j3);
        sbH.append(", but is '");
        sbH.append(jLongValue);
        sbH.append('\'');
        throw new IllegalStateException(sbH.toString().toString());
    }

    public static int k(int i, int i2, String str) {
        return (int) j(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final native String l(P16080705924044660797 p16080705924044660797);
}
