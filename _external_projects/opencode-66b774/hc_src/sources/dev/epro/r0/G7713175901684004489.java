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
import android.util.Pair;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes2.dex */
public abstract class G7713175901684004489 {
    public static Z7022156542152740569 a;
    public static Z7022156542152740569 b;
    public static Thread c;

    static {
        izmyclvb.dpqpjfpoanwt1(183);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(boolean r26, dev.epro.r0.B13729205492206812220 r27, dev.epro.r0.I1722681268793429505 r28, boolean r29, dev.epro.r0.M17320125320876195115 r30, dev.epro.r0.M3727281027331139839 r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.G7713175901684004489.a(boolean, dev.epro.r0.B13729205492206812220, dev.epro.r0.I1722681268793429505, boolean, dev.epro.r0.M17320125320876195115, dev.epro.r0.M3727281027331139839, int, int):void");
    }

    public static final native void b(int i, M3727281027331139839 m3727281027331139839, Q7430090668634766253 q7430090668634766253, T12100831175298321930 t12100831175298321930);

    public static vv1 c(kz2 kz2Var, mi3 mi3Var, zv1 zv1Var, FrameLayout frameLayout, Map map, ImageView.ScaleType scaleType) {
        kz2Var.getClass();
        mi3Var.getClass();
        zv1Var.getClass();
        scaleType.getClass();
        wv0 wv0Var = wv0.CUI_NAME_NATIVE_AD_SIGNAL;
        O2161699089510411363 o2161699089510411363 = O2161699089510411363.a;
        if (ji3.b().a == null) {
            em2 a2 = kz2.a(kz2Var, wv0Var, o2161699089510411363, mi3Var);
            try {
                vv1 vv1Var = new vv1(zv1Var.a(frameLayout, scaleType, map), zv1Var.c(frameLayout), zv1Var.b(frameLayout), zv1Var.a(frameLayout), zv1Var.a());
                a2.close();
                return vv1Var;
            } catch (Throwable th) {
                try {
                    a2.b(th);
                    if (th instanceof N340633841638932414) {
                        throw th;
                    }
                    if (!(th instanceof P2480554073835519965) && !(th instanceof CancellationException)) {
                        a2.a(th);
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
            th3 a3 = ji3.a(wv0Var, o2161699089510411363, true);
            try {
                vv1 vv1Var2 = new vv1(zv1Var.a(frameLayout, scaleType, map), zv1Var.c(frameLayout), zv1Var.b(frameLayout), zv1Var.a(frameLayout), zv1Var.a());
                a3.close();
                return vv1Var2;
            } catch (Throwable th2) {
                try {
                    a3.b(th2);
                    if (th2 instanceof N340633841638932414) {
                        throw th2;
                    }
                    if (!(th2 instanceof P2480554073835519965) && !(th2 instanceof CancellationException)) {
                        a3.a(th2);
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

    public static Pair d(RandomAccessFile randomAccessFile, int i) {
        int i2;
        if (i < 0 || i > 65535) {
            S10973172697741180971.j(C468629748621011703.e(i, "maxCommentSize: "));
            return null;
        }
        long length = randomAccessFile.length();
        if (length >= 22) {
            ByteBuffer allocate = ByteBuffer.allocate(((int) Math.min(i, length - 22)) + 22);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            allocate.order(byteOrder);
            long capacity = length - allocate.capacity();
            randomAccessFile.seek(capacity);
            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
            if (allocate.order() != byteOrder) {
                S10973172697741180971.j("ByteBuffer byte order must be little endian");
                return null;
            }
            int capacity2 = allocate.capacity();
            if (capacity2 >= 22) {
                int i3 = capacity2 - 22;
                int min = Math.min(i3, 65535);
                for (int i4 = 0; i4 < min; i4++) {
                    i2 = i3 - i4;
                    if (allocate.getInt(i2) == 101010256 && (allocate.getShort(i2 + 20) & 65535) == i4) {
                        break;
                    }
                }
            }
            i2 = -1;
            if (i2 != -1) {
                allocate.position(i2);
                ByteBuffer slice = allocate.slice();
                slice.order(ByteOrder.LITTLE_ENDIAN);
                return Pair.create(slice, Long.valueOf(capacity + i2));
            }
        }
        return null;
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
        V14323974914327418545 d = G11450220448113054352.d(18.0f, 16.08f);
        d.e(-0.76f, 0.0f, -1.44f, 0.3f, -1.96f, 0.77f);
        d.h(8.91f, 12.7f);
        d.e(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        d.o(-0.04f, -0.47f, -0.09f, -0.7f);
        d.i(7.05f, -4.11f);
        d.e(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        d.e(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        d.o(-1.34f, -3.0f, -3.0f, -3.0f);
        d.o(-3.0f, 1.34f, -3.0f, 3.0f);
        d.e(0.0f, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        d.h(8.04f, 9.81f);
        d.d(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        d.e(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        d.o(1.34f, 3.0f, 3.0f, 3.0f);
        d.e(0.79f, 0.0f, 1.5f, -0.31f, 2.04f, -0.81f);
        d.i(7.12f, 4.16f);
        d.e(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        d.e(0.0f, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        d.o(2.92f, -1.31f, 2.92f, -2.92f);
        d.e(0.0f, -1.61f, -1.31f, -2.92f, -2.92f, -2.92f);
        d.c();
        d.j(18.0f, 4.0f);
        d.e(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.o(-0.45f, 1.0f, -1.0f, 1.0f);
        d.o(-1.0f, -0.45f, -1.0f, -1.0f);
        d.o(0.45f, -1.0f, 1.0f, -1.0f);
        d.c();
        d.j(6.0f, 13.0f);
        d.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.o(0.45f, -1.0f, 1.0f, -1.0f);
        d.o(1.0f, 0.45f, 1.0f, 1.0f);
        d.o(-0.45f, 1.0f, -1.0f, 1.0f);
        d.c();
        d.j(18.0f, 20.02f);
        d.e(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.o(0.45f, -1.0f, 1.0f, -1.0f);
        d.o(1.0f, 0.45f, 1.0f, 1.0f);
        d.o(-0.45f, 1.0f, -1.0f, 1.0f);
        d.c();
        Q17593287602150918564.a(q17593287602150918564, d.a, h10765568533039107979, null, 1.0f, 14336);
        Z7022156542152740569 b2 = q17593287602150918564.b();
        b = b2;
        return b2;
    }

    public static final boolean g(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final void h(Context context) {
        Map map;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            B14824868959299866349 n = B14824868959299866349.n();
            String[] strArr = B11188054920131162254.a;
            n.getClass();
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr2 = B11188054920131162254.a;
            int u0 = E4951175994894594588.u0(strArr2.length);
            if (u0 < 16) {
                u0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(u0);
            for (String str : strArr2) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(noBackupFilesDir.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                map = Collections.singletonMap(databasePath2, noBackupFilesDir);
                map.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        B14824868959299866349 n2 = B14824868959299866349.n();
                        String[] strArr3 = B11188054920131162254.a;
                        file2.toString();
                        n2.getClass();
                    }
                    if (file.renameTo(file2)) {
                        file.toString();
                        file2.toString();
                    } else {
                        file.toString();
                        file2.toString();
                    }
                    B14824868959299866349 n3 = B14824868959299866349.n();
                    String[] strArr4 = B11188054920131162254.a;
                    n3.getClass();
                }
            }
        }
    }

    public static final P10917817599008460069 i(P10917817599008460069 p10917817599008460069) {
        p10917817599008460069.getClass();
        O6225539295864356213 b2 = p10917817599008460069.b();
        W7378377772343420238 w7378377772343420238 = p10917817599008460069.g;
        b2.g = new C3791006194363318448(w7378377772343420238.d(), w7378377772343420238.c());
        return b2.a();
    }

    public static final long j(String str, long j, long j2, long j3) {
        String str2;
        int i = M9967499841304440286.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long I = Z13168519540281190457.I(10, str2);
        if (I == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = I.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        StringBuilder h = X2485016533998461232.h("System property '", str, "' should be in range ", j2);
        h.append("..");
        h.append(j3);
        h.append(", but is '");
        h.append(longValue);
        h.append('\'');
        throw new IllegalStateException(h.toString().toString());
    }

    public static int k(int i, int i2, String str) {
        return (int) j(str, i, 1L, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final native String l(P16080705924044660797 p16080705924044660797);
}
