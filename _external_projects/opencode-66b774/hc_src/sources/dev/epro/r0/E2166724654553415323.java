package dev.epro.r0;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes.dex */
public final class E2166724654553415323 {
    public static byte b = 2;
    public final /* synthetic */ byte a;

    static {
        izmyclvb.oeynnivvrnts0(701);
    }

    public /* synthetic */ E2166724654553415323(byte b2) {
        this.a = b2;
    }

    public static final S6349823729575121924 a(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new S6349823729575121924(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final native void b(D11565319094408363238 d11565319094408363238, G2190230421268324049 g2190230421268324049, M3727281027331139839 m3727281027331139839, int i);

    public static final native void c(H9594781759364688001 h9594781759364688001, Y15427935686644244568 y15427935686644244568, N13504813974193578250 n13504813974193578250, I1722681268793429505 i1722681268793429505, M3727281027331139839 m3727281027331139839, int i);

    public static void d(int i, int i2) {
        String e;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                e = Y2666402291564931474.e("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    S10973172697741180971.j(G6547577305291411977.n(i2, "negative size: "));
                    return;
                }
                e = Y2666402291564931474.e("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long e(int r2, int r3, int r4, long r5) {
        /*
            int r0 = dev.epro.r0.F12478849263529740365.g(r5)
            int r1 = dev.epro.r0.F12478849263529740365.f(r5)
            if (r1 >= r2) goto Lb
            return r5
        Lb:
            if (r0 > r2) goto L17
            if (r3 > r1) goto L17
            int r3 = r3 - r2
            int r4 = r4 - r3
            if (r0 != r1) goto L14
            goto L22
        L14:
            int r2 = r1 + r4
            goto L2c
        L17:
            if (r0 <= r2) goto L1e
            if (r1 >= r3) goto L1e
            int r2 = r2 + r4
            r0 = r2
            goto L2c
        L1e:
            if (r0 < r3) goto L24
            int r3 = r3 - r2
            int r4 = r4 - r3
        L22:
            int r0 = r0 + r4
            goto L14
        L24:
            if (r2 >= r0) goto L2c
            int r0 = r2 + r4
            int r3 = r3 - r2
            int r4 = r4 - r3
            int r2 = r4 + r1
        L2c:
            long r2 = dev.epro.r0.T1335862270807194835.d(r0, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E2166724654553415323.e(int, int, int, long):long");
    }

    public static final V5656221289452463152 f(Y15793652731717703673 y15793652731717703673, J4138103533341651975 j4138103533341651975) {
        boolean z = y15793652731717703673.l() == M16210313685714734865.a;
        return new V5656221289452463152(g(y15793652731717703673.g(), z, true, y15793652731717703673.h(), j4138103533341651975), g(y15793652731717703673.j(), z, false, y15793652731717703673.i(), j4138103533341651975), z);
    }

    public static final Z6884774333691094167 g(R3610722646682213723 r3610722646682213723, boolean z, boolean z2, int i, J4138103533341651975 j4138103533341651975) {
        long j;
        int i2 = z2 ? r3610722646682213723.c : r3610722646682213723.d;
        if (i != r3610722646682213723.b) {
            return r3610722646682213723.a(i2);
        }
        long b2 = j4138103533341651975.b(r3610722646682213723, i2);
        if (z ^ z2) {
            int i3 = F12478849263529740365.c;
            j = b2 >> 32;
        } else {
            int i4 = F12478849263529740365.c;
            j = 4294967295L & b2;
        }
        return r3610722646682213723.a((int) j);
    }

    public static void h(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? j(i, i3, "start index") : (i2 < 0 || i2 > i3) ? j(i2, i3, "end index") : Y2666402291564931474.e("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static final Z6884774333691094167 i(Z6884774333691094167 z6884774333691094167, R3610722646682213723 r3610722646682213723, int i) {
        return new Z6884774333691094167(r3610722646682213723.f.a(i), i, z6884774333691094167.c);
    }

    public static String j(int i, int i2, String str) {
        if (i < 0) {
            return Y2666402291564931474.e("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return Y2666402291564931474.e("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        S10973172697741180971.j(G6547577305291411977.n(i2, "negative size: "));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0016, code lost:
    
        if (r2.b == r5.b) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dev.epro.r0.V5656221289452463152 l(dev.epro.r0.V5656221289452463152 r8, dev.epro.r0.Y15793652731717703673 r9) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E2166724654553415323.l(dev.epro.r0.V5656221289452463152, dev.epro.r0.Y15793652731717703673):dev.epro.r0.V5656221289452463152");
    }

    public static Z6787503239643758223 m(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Z6787503239643758223(F18342544821595307642.d(view));
        }
        return null;
    }

    public static final long n(SQLiteConnection sQLiteConnection) {
        if (o(sQLiteConnection) == 0) {
            return -1L;
        }
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT last_insert_rowid()");
        try {
            prepare.step();
            long j = prepare.getLong(0);
            T18016951143603335921.y(prepare, null);
            return j;
        } finally {
        }
    }

    public static final int o(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT changes()");
        try {
            prepare.step();
            int i = (int) prepare.getLong(0);
            T18016951143603335921.y(prepare, null);
            return i;
        } finally {
        }
    }

    public static final void q(F13711604687869105489 f13711604687869105489, int i, int i2) {
        f13711604687869105489.g(T1335862270807194835.d(W7808703833045379622.q(i, 0, f13711604687869105489.b.length()), W7808703833045379622.q(i2, 0, f13711604687869105489.b.length())));
    }

    public static void r(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            F18342544821595307642.y(view, charSequence);
            return;
        }
        P14758315167087694539 p14758315167087694539 = P14758315167087694539.k;
        if (p14758315167087694539 != null && p14758315167087694539.a == view) {
            P14758315167087694539.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new P14758315167087694539(view, charSequence);
            return;
        }
        P14758315167087694539 p147583151670876945392 = P14758315167087694539.l;
        if (p147583151670876945392 != null && p147583151670876945392.a == view) {
            p147583151670876945392.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static int s(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            E2166724654553415323 e2166724654553415323 = F2424644667972238580.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return F2424644667972238580.a(i, J3288146055636008296.e(j, bArr));
        }
        if (i2 == 2) {
            return F2424644667972238580.b(i, J3288146055636008296.e(j, bArr), J3288146055636008296.e(j + 1, bArr));
        }
        throw new AssertionError();
    }

    public static final Z6884774333691094167 t(Y15793652731717703673 y15793652731717703673, R3610722646682213723 r3610722646682213723, Z6884774333691094167 z6884774333691094167) {
        int i = y15793652731717703673.a() ? r3610722646682213723.c : r3610722646682213723.d;
        int h = y15793652731717703673.a() ? y15793652731717703673.h() : y15793652731717703673.i();
        int i2 = r3610722646682213723.b;
        Q17957571128037780363 q17957571128037780363 = r3610722646682213723.f;
        int i3 = r3610722646682213723.e;
        if (h != i2) {
            return r3610722646682213723.a(i);
        }
        H15176749518301005726 h15176749518301005726 = new H15176749518301005726(r3610722646682213723, i, (byte) 1);
        G14718160286012243331 g14718160286012243331 = G14718160286012243331.c;
        K7493131619793429513 L = M9216324016624295870.L(g14718160286012243331, h15176749518301005726);
        K7493131619793429513 L2 = M9216324016624295870.L(g14718160286012243331, new A2718501846682183440(r3610722646682213723, i, y15793652731717703673.a() ? r3610722646682213723.d : r3610722646682213723.c, y15793652731717703673, L));
        if (r3610722646682213723.a != z6884774333691094167.c) {
            return (Z6884774333691094167) L2.getValue();
        }
        if (i == i3) {
            return z6884774333691094167;
        }
        if (((Number) L.getValue()).intValue() != q17957571128037780363.b.d(i3)) {
            return (Z6884774333691094167) L2.getValue();
        }
        int i4 = z6884774333691094167.b;
        long k = q17957571128037780363.k(i4);
        boolean a = y15793652731717703673.a();
        if (i3 != -1) {
            if (i != i3) {
                if (!(a ^ (r3610722646682213723.b() == M16210313685714734865.a))) {
                }
            }
            return r3610722646682213723.a(i);
        }
        int i5 = F12478849263529740365.c;
        return (i4 == ((int) (k >> 32)) || i4 == ((int) (k & 4294967295L))) ? (Z6884774333691094167) L2.getValue() : r3610722646682213723.a(i);
    }

    public static B18059876494342031474 u(Context context, String str) {
        String str2;
        String str3;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("/", -1);
        int length = split.length;
        if (length == 1) {
            String valueOf = String.valueOf(context.getPackageName());
            str3 = split[0];
            str2 = valueOf.concat("_preferences");
        } else {
            if (length != 2) {
                return null;
            }
            str2 = split[0];
            str3 = split[1];
        }
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return new B18059876494342031474(str2, str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String k(int r10, byte[] r11, int r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.E2166724654553415323.k(int, byte[], int):java.lang.String");
    }

    public final int p(int i, byte[] bArr, int i2) {
        long j;
        int i3;
        long j2;
        int i4 = i;
        switch (this.a) {
            case 0:
                break;
            default:
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                long j3 = i4;
                int i5 = (int) (i2 - j3);
                long j4 = 1;
                if (i5 < 16) {
                    j = j3;
                    j2 = 1;
                    i3 = 0;
                } else {
                    int i6 = 8 - (((int) j3) & 7);
                    j = j3;
                    i3 = 0;
                    long j5 = j;
                    while (true) {
                        if (i3 < i6) {
                            long j6 = j5 + 1;
                            if (J3288146055636008296.e(j5, bArr) < 0) {
                                j2 = 1;
                            } else {
                                i3++;
                                j5 = j6;
                            }
                        } else {
                            while (true) {
                                int i7 = i3 + 8;
                                if (i7 <= i5) {
                                    j2 = j4;
                                    if ((J3288146055636008296.i(J3288146055636008296.f + j5, bArr) & (-9187201950435737472L)) == 0) {
                                        j5 += 8;
                                        i3 = i7;
                                        j4 = j2;
                                    }
                                } else {
                                    j2 = j4;
                                }
                            }
                            while (true) {
                                if (i3 < i5) {
                                    long j7 = j5 + j2;
                                    if (J3288146055636008296.e(j5, bArr) >= 0) {
                                        i3++;
                                        j5 = j7;
                                    }
                                } else {
                                    i3 = i5;
                                }
                            }
                        }
                    }
                }
                int i8 = i5 - i3;
                long j8 = j + i3;
                while (true) {
                    byte b2 = 0;
                    while (true) {
                        if (i8 > 0) {
                            long j9 = j8 + j2;
                            byte e = J3288146055636008296.e(j8, bArr);
                            if (e >= 0) {
                                i8--;
                                j8 = j9;
                                b2 = e;
                            } else {
                                j8 = j9;
                                b2 = e;
                            }
                        }
                    }
                    if (i8 == 0) {
                        return 0;
                    }
                    int i9 = i8 - 1;
                    if (b2 < -32) {
                        if (i9 == 0) {
                            return b2;
                        }
                        i8 -= 2;
                        if (b2 < -62) {
                            return -1;
                        }
                        long j10 = j8 + j2;
                        if (J3288146055636008296.e(j8, bArr) > -65) {
                            return -1;
                        }
                        j8 = j10;
                    } else if (b2 < -16) {
                        if (i9 < 2) {
                            return s(j8, bArr, b2, i9);
                        }
                        i8 -= 3;
                        long j11 = j8 + j2;
                        byte e2 = J3288146055636008296.e(j8, bArr);
                        if (e2 > -65) {
                            return -1;
                        }
                        if (b2 == -32 && e2 < -96) {
                            return -1;
                        }
                        if (b2 == -19 && e2 >= -96) {
                            return -1;
                        }
                        j8 += 2;
                        if (J3288146055636008296.e(j11, bArr) > -65) {
                            return -1;
                        }
                    } else {
                        if (i9 < 3) {
                            return s(j8, bArr, b2, i9);
                        }
                        i8 -= 4;
                        long j12 = j8 + j2;
                        byte e3 = J3288146055636008296.e(j8, bArr);
                        if (e3 > -65) {
                            return -1;
                        }
                        if ((((e3 + 112) + (b2 << 28)) >> 30) != 0) {
                            return -1;
                        }
                        long j13 = j8 + 2;
                        if (J3288146055636008296.e(j12, bArr) > -65) {
                            return -1;
                        }
                        j8 += 3;
                        if (J3288146055636008296.e(j13, bArr) > -65) {
                            return -1;
                        }
                    }
                }
        }
        while (i4 < i2 && bArr[i4] >= 0) {
            i4++;
        }
        if (i4 < i2) {
            while (i4 < i2) {
                int i10 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    i4 = i10;
                } else if (b3 < -32) {
                    if (i10 >= i2) {
                        return b3;
                    }
                    if (b3 < -62) {
                        return -1;
                    }
                    i4 += 2;
                    if (bArr[i10] > -65) {
                        return -1;
                    }
                } else if (b3 < -16) {
                    if (i10 >= i2 - 1) {
                        return F2424644667972238580.c(i10, bArr, i2);
                    }
                    int i11 = i4 + 2;
                    byte b4 = bArr[i10];
                    if (b4 > -65) {
                        return -1;
                    }
                    if (b3 == -32 && b4 < -96) {
                        return -1;
                    }
                    if (b3 == -19 && b4 >= -96) {
                        return -1;
                    }
                    i4 += 3;
                    if (bArr[i11] > -65) {
                        return -1;
                    }
                } else {
                    if (i10 >= i2 - 2) {
                        return F2424644667972238580.c(i10, bArr, i2);
                    }
                    int i12 = i4 + 2;
                    byte b5 = bArr[i10];
                    if (b5 > -65) {
                        return -1;
                    }
                    if ((((b5 + 112) + (b3 << 28)) >> 30) != 0) {
                        return -1;
                    }
                    int i13 = i4 + 3;
                    if (bArr[i12] > -65) {
                        return -1;
                    }
                    i4 += 4;
                    if (bArr[i13] > -65) {
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
