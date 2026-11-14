package ads_mobile_sdk;

import dev.epro.r0.D15735805680132151670;
import dev.epro.r0.E12098517352909843120;
import dev.epro.r0.E17564419012940707302;
import dev.epro.r0.E2581631045160024594;
import dev.epro.r0.G18207276409179303092;
import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.K2042933864045806308;
import dev.epro.r0.M17147082063200071302;
import dev.epro.r0.N4718165958758773250;
import dev.epro.r0.O6641393078261985068;
import dev.epro.r0.Q11088980322693754445;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.U11450443558875589191;
import dev.epro.r0.Z3383101362411723454;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class op1 implements G18207276409179303092 {
    public static final int[] n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f87o = pm3.a();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final g e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;

    public op1(int[] iArr, Object[] objArr, int i, int i2, g gVar, int[] iArr2, int i3, int i4) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = gVar instanceof cu0;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.e = gVar;
    }

    public static void e(Object obj) {
        if (g(obj)) {
            return;
        }
        S10973172697741180971.j("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean g(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof cu0) {
            return ((cu0) obj).j();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0dbe, code lost:
    
        if (r8 == 1048575) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0dc0, code lost:
    
        r15.putInt(r2, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0dc4, code lost:
    
        r4 = r37.h;
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0dcb, code lost:
    
        if (r4 >= r37.i) goto L594;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0dcd, code lost:
    
        r11 = (ads_mobile_sdk.bm3) a(r2, r37.g[r4], r11, r2);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0ddb, code lost:
    
        if (r11 == null) goto L551;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0ddd, code lost:
    
        ((ads_mobile_sdk.cu0) r2).b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0de1, code lost:
    
        if (r0 != 0) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0de3, code lost:
    
        if (r1 != r5) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0de6, code lost:
    
        dev.epro.r0.Z3383101362411723454.o(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0dee, code lost:
    
        if (r1 > r5) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0df0, code lost:
    
        if (r14 != r0) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0df3, code lost:
    
        dev.epro.r0.Z3383101362411723454.o(r28);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0996 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x099c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0d81 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0d66 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0d78 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0d95  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x0738 -> B:281:0x06f7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r38, byte[] r39, int r40, int r41, int r42, dev.epro.r0.D15735805680132151670 r43) {
        /*
            Method dump skipped, instructions count: 3724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.a(java.lang.Object, byte[], int, int, int, dev.epro.r0.D15735805680132151670):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0a64 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0a7b A[LOOP:2: B:36:0x0a79->B:37:0x0a7b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0a58 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a$1(java.lang.Object r19, dev.epro.r0.E17564419012940707302 r20, ads_mobile_sdk.nl0 r21) {
        /*
            Method dump skipped, instructions count: 2844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.a$1(java.lang.Object, dev.epro.r0.E17564419012940707302, ads_mobile_sdk.nl0):void");
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final int b(cu0 cu0Var) {
        int i;
        int h;
        int h2;
        int h3;
        int a;
        int h4;
        int a2;
        int h5;
        int h6;
        int a3;
        int i2;
        int size;
        int h7;
        int h8;
        int size2;
        int j;
        int h9;
        int h10;
        int a4;
        int i3;
        int size3;
        int h11;
        int i4;
        int i5;
        int h12;
        int h13;
        int h14;
        int a5;
        int h15;
        int a6;
        int h16;
        int a7;
        int i6;
        op1 op1Var = this;
        cu0 cu0Var2 = cu0Var;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = op1Var.a;
            if (i9 >= iArr.length) {
                return cu0Var2.b.a() + i11;
            }
            int i12 = iArr[i9 + 1];
            int i13 = (267386880 & i12) >>> 20;
            int i14 = iArr[i9];
            int i15 = iArr[i9 + 2];
            int i16 = i15 & i7;
            Unsafe unsafe = f87o;
            if (i13 <= 17) {
                if (i16 != i8) {
                    i10 = i16 == i7 ? 0 : unsafe.getInt(cu0Var2, i16);
                    i8 = i16;
                }
                i = 1 << (i15 >>> 20);
            } else {
                i = 0;
            }
            long j2 = i12 & i7;
            if (i13 >= am0.b.a) {
                byte b = am0.c.a;
            }
            switch (i13) {
                case 0:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        h = yu.h(i14) + 8;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        h2 = yu.h(i14);
                        h = h2 + 4;
                        cu0Var2 = cu0Var;
                        i11 += h;
                        break;
                    }
                    cu0Var2 = cu0Var;
                    break;
                case 2:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        long j3 = unsafe.getLong(cu0Var2, j2);
                        h3 = yu.h(i14);
                        a = yu.a(j3);
                        h = a + h3;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        long j4 = unsafe.getLong(cu0Var2, j2);
                        h3 = yu.h(i14);
                        a = yu.a(j4);
                        h = a + h3;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        int i17 = unsafe.getInt(cu0Var2, j2);
                        h4 = yu.h(i14);
                        a2 = yu.a(i17);
                        h = h4 + a2;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        h5 = yu.h(i14);
                        h = h5 + 8;
                        cu0Var2 = cu0Var;
                        i11 += h;
                        break;
                    }
                    cu0Var2 = cu0Var;
                    break;
                case 6:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        h2 = yu.h(i14);
                        h = h2 + 4;
                        cu0Var2 = cu0Var;
                        i11 += h;
                        break;
                    }
                    cu0Var2 = cu0Var;
                    break;
                case 7:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        h = yu.h(i14) + 1;
                        cu0Var2 = cu0Var;
                        i11 += h;
                        break;
                    }
                    cu0Var2 = cu0Var;
                    break;
                case 8:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        Object object = unsafe.getObject(cu0Var2, j2);
                        if (object instanceof sq) {
                            h6 = yu.h(i14);
                            a3 = ((sq) object).size();
                            i2 = yu.i(a3);
                        } else {
                            h6 = yu.h(i14);
                            a3 = vn3.a.a((String) object);
                            i2 = yu.i(a3);
                        }
                        h = h6 + i2 + a3;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        Object object2 = unsafe.getObject(cu0Var2, j2);
                        G18207276409179303092 c = op1Var.c(i9);
                        int h17 = yu.h(i14);
                        int a8 = ((g) object2).a(c);
                        h = yu.i(a8) + a8 + h17;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        sq sqVar = (sq) unsafe.getObject(cu0Var2, j2);
                        h6 = yu.h(i14);
                        a3 = sqVar.size();
                        i2 = yu.i(a3);
                        h = h6 + i2 + a3;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        int i18 = unsafe.getInt(cu0Var2, j2);
                        h4 = yu.h(i14);
                        a2 = yu.i(i18);
                        h = h4 + a2;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        int i19 = unsafe.getInt(cu0Var2, j2);
                        h4 = yu.h(i14);
                        a2 = yu.a(i19);
                        h = h4 + a2;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        h2 = yu.h(i14);
                        h = h2 + 4;
                        cu0Var2 = cu0Var;
                        i11 += h;
                        break;
                    }
                    cu0Var2 = cu0Var;
                    break;
                case 14:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        h5 = yu.h(i14);
                        h = h5 + 8;
                        cu0Var2 = cu0Var;
                        i11 += h;
                        break;
                    }
                    cu0Var2 = cu0Var;
                    break;
                case 15:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        int i20 = unsafe.getInt(cu0Var2, j2);
                        h4 = yu.h(i14);
                        a2 = yu.i(yu.j(i20));
                        h = h4 + a2;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        long j5 = unsafe.getLong(cu0Var2, j2);
                        h3 = yu.h(i14);
                        a = yu.a(yu.b(j5));
                        h = a + h3;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (op1Var.a(cu0Var2, i9, i8, i10, i)) {
                        h = ((g) unsafe.getObject(cu0Var2, j2)).a(op1Var.c(i9)) + (yu.h(i14) * 2);
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h = xv.e(i14, (List) unsafe.getObject(cu0Var2, j2));
                    i11 += h;
                    break;
                case 19:
                    size = ((List) unsafe.getObject(cu0Var2, j2)).size();
                    if (size != 0) {
                        h7 = yu.h(i14);
                        h10 = h7 + 4;
                        h = h10 * size;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 20:
                    List list = (List) unsafe.getObject(cu0Var2, j2);
                    if (list.size() != 0) {
                        h8 = (yu.h(i14) * list.size()) + xv.f(list);
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 21:
                    List list2 = (List) unsafe.getObject(cu0Var2, j2);
                    size2 = list2.size();
                    if (size2 != 0) {
                        j = xv.j(list2);
                        h9 = yu.h(i14);
                        h8 = (h9 * size2) + j;
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 22:
                    List list3 = (List) unsafe.getObject(cu0Var2, j2);
                    size2 = list3.size();
                    if (size2 != 0) {
                        j = xv.e(list3);
                        h9 = yu.h(i14);
                        h8 = (h9 * size2) + j;
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 23:
                    h = xv.e(i14, (List) unsafe.getObject(cu0Var2, j2));
                    i11 += h;
                    break;
                case 24:
                    size = ((List) unsafe.getObject(cu0Var2, j2)).size();
                    if (size != 0) {
                        h7 = yu.h(i14);
                        h10 = h7 + 4;
                        h = h10 * size;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 25:
                    size = ((List) unsafe.getObject(cu0Var2, j2)).size();
                    if (size != 0) {
                        h10 = yu.h(i14) + 1;
                        h = h10 * size;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 26:
                    List list4 = (List) unsafe.getObject(cu0Var2, j2);
                    int size4 = list4.size();
                    if (size4 != 0) {
                        h8 = yu.h(i14) * size4;
                        for (int i21 = 0; i21 < size4; i21++) {
                            Object obj = list4.get(i21);
                            if (obj instanceof sq) {
                                a4 = ((sq) obj).size();
                                i3 = yu.i(a4);
                            } else {
                                a4 = vn3.a.a((String) obj);
                                i3 = yu.i(a4);
                            }
                            h8 = i3 + a4 + h8;
                        }
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 27:
                    List list5 = (List) unsafe.getObject(cu0Var2, j2);
                    G18207276409179303092 c2 = op1Var.c(i9);
                    int size5 = list5.size();
                    if (size5 != 0) {
                        int h18 = yu.h(i14) * size5;
                        for (int i22 = 0; i22 < size5; i22++) {
                            int a9 = ((g) list5.get(i22)).a(c2);
                            h18 += yu.i(a9) + a9;
                        }
                        h = h18;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 28:
                    List list6 = (List) unsafe.getObject(cu0Var2, j2);
                    int size6 = list6.size();
                    if (size6 != 0) {
                        h8 = yu.h(i14) * size6;
                        for (int i23 = 0; i23 < list6.size(); i23++) {
                            int size7 = ((sq) list6.get(i23)).size();
                            h8 += yu.i(size7) + size7;
                        }
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 29:
                    List list7 = (List) unsafe.getObject(cu0Var2, j2);
                    size2 = list7.size();
                    if (size2 != 0) {
                        j = xv.i(list7);
                        h9 = yu.h(i14);
                        h8 = (h9 * size2) + j;
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 30:
                    List list8 = (List) unsafe.getObject(cu0Var2, j2);
                    size2 = list8.size();
                    if (size2 != 0) {
                        j = xv.b(list8);
                        h9 = yu.h(i14);
                        h8 = (h9 * size2) + j;
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 31:
                    size = ((List) unsafe.getObject(cu0Var2, j2)).size();
                    if (size != 0) {
                        h7 = yu.h(i14);
                        h10 = h7 + 4;
                        h = h10 * size;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 32:
                    h = xv.e(i14, (List) unsafe.getObject(cu0Var2, j2));
                    i11 += h;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(cu0Var2, j2);
                    size2 = list9.size();
                    if (size2 != 0) {
                        j = xv.g(list9);
                        h9 = yu.h(i14);
                        h8 = (h9 * size2) + j;
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 34:
                    List list10 = (List) unsafe.getObject(cu0Var2, j2);
                    size2 = list10.size();
                    if (size2 != 0) {
                        j = xv.h(list10);
                        h9 = yu.h(i14);
                        h8 = (h9 * size2) + j;
                        h = h8;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 35:
                    size3 = ((List) unsafe.getObject(cu0Var2, j2)).size() * 8;
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    size3 = ((List) unsafe.getObject(cu0Var2, j2)).size() * 4;
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size3 = xv.f((List) unsafe.getObject(cu0Var2, j2));
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size3 = xv.j((List) unsafe.getObject(cu0Var2, j2));
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size3 = xv.e((List) unsafe.getObject(cu0Var2, j2));
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    size3 = ((List) unsafe.getObject(cu0Var2, j2)).size() * 8;
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    size3 = ((List) unsafe.getObject(cu0Var2, j2)).size() * 4;
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    size3 = ((List) unsafe.getObject(cu0Var2, j2)).size();
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size3 = xv.i((List) unsafe.getObject(cu0Var2, j2));
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size3 = xv.b((List) unsafe.getObject(cu0Var2, j2));
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    size3 = ((List) unsafe.getObject(cu0Var2, j2)).size() * 4;
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    size3 = ((List) unsafe.getObject(cu0Var2, j2)).size() * 8;
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size3 = xv.g((List) unsafe.getObject(cu0Var2, j2));
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size3 = xv.h((List) unsafe.getObject(cu0Var2, j2));
                    if (size3 > 0) {
                        h11 = yu.h(i14);
                        i4 = yu.i(size3);
                        h = size3 + i4 + h11;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list11 = (List) unsafe.getObject(cu0Var2, j2);
                    G18207276409179303092 c3 = op1Var.c(i9);
                    int size8 = list11.size();
                    if (size8 != 0) {
                        i5 = 0;
                        for (int i24 = 0; i24 < size8; i24++) {
                            i5 += ((g) list11.get(i24)).a(c3) + (yu.h(i14) * 2);
                        }
                        h = i5;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 50:
                    gn1 gn1Var = (gn1) unsafe.getObject(cu0Var2, j2);
                    dn1 dn1Var = (dn1) op1Var.b(i9);
                    if (!gn1Var.isEmpty()) {
                        i5 = 0;
                        for (Map.Entry entry : gn1Var.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            dn1Var.getClass();
                            int h19 = yu.h(i14);
                            r6 r6Var = dn1Var.a;
                            int a10 = zl0.a((ft3) r6Var.b, 2, value) + zl0.a((E2581631045160024594) r6Var.a, 1, key);
                            i5 += yu.i(a10) + a10 + h19;
                        }
                        h = i5;
                        i11 += h;
                        break;
                    }
                    h = 0;
                    i11 += h;
                case 51:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        h12 = yu.h(i14);
                        h = h12 + 8;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        h13 = yu.h(i14);
                        h = h13 + 4;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        long b2 = b(j2, cu0Var2);
                        h14 = yu.h(i14);
                        a5 = yu.a(b2);
                        h = h14 + a5;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        long b3 = b(j2, cu0Var2);
                        h14 = yu.h(i14);
                        a5 = yu.a(b3);
                        h = h14 + a5;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        int a11 = a(j2, cu0Var2);
                        h15 = yu.h(i14);
                        a6 = yu.a(a11);
                        h = a6 + h15;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        h12 = yu.h(i14);
                        h = h12 + 8;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        h13 = yu.h(i14);
                        h = h13 + 4;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        h = yu.h(i14) + 1;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        Object object3 = unsafe.getObject(cu0Var2, j2);
                        if (object3 instanceof sq) {
                            h16 = yu.h(i14);
                            a7 = ((sq) object3).size();
                            i6 = yu.i(a7);
                        } else {
                            h16 = yu.h(i14);
                            a7 = vn3.a.a((String) object3);
                            i6 = yu.i(a7);
                        }
                        h = i6 + a7 + h16;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        Object object4 = unsafe.getObject(cu0Var2, j2);
                        G18207276409179303092 c4 = op1Var.c(i9);
                        int h20 = yu.h(i14);
                        int a12 = ((g) object4).a(c4);
                        h = yu.i(a12) + a12 + h20;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        sq sqVar2 = (sq) unsafe.getObject(cu0Var2, j2);
                        h16 = yu.h(i14);
                        a7 = sqVar2.size();
                        i6 = yu.i(a7);
                        h = i6 + a7 + h16;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        int a13 = a(j2, cu0Var2);
                        h15 = yu.h(i14);
                        a6 = yu.i(a13);
                        h = a6 + h15;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        int a14 = a(j2, cu0Var2);
                        h15 = yu.h(i14);
                        a6 = yu.a(a14);
                        h = a6 + h15;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        h13 = yu.h(i14);
                        h = h13 + 4;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        h12 = yu.h(i14);
                        h = h12 + 8;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        int a15 = a(j2, cu0Var2);
                        h15 = yu.h(i14);
                        a6 = yu.i(yu.j(a15));
                        h = a6 + h15;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        long b4 = b(j2, cu0Var2);
                        h14 = yu.h(i14);
                        a5 = yu.a(yu.b(b4));
                        h = h14 + a5;
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (op1Var.a(i14, i9, cu0Var2)) {
                        h = ((g) unsafe.getObject(cu0Var2, j2)).a(op1Var.c(i9)) + (yu.h(i14) * 2);
                        i11 += h;
                        break;
                    } else {
                        break;
                    }
            }
            i9 += 3;
            i7 = 1048575;
            op1Var = this;
        }
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void c(Object obj) {
        if (g(obj)) {
            if (obj instanceof cu0) {
                cu0 cu0Var = (cu0) obj;
                cu0Var.a(Integer.MAX_VALUE);
                cu0Var.a = 0;
                cu0Var.l();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int i2 = iArr[i + 1];
                long j = 1048575 & i2;
                int i3 = (i2 & 267386880) >>> 20;
                Unsafe unsafe = f87o;
                if (i3 != 9) {
                    if (i3 != 60 && i3 != 68) {
                        switch (i3) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                j jVar = (j) ((O6641393078261985068) ((Unsafe) pm3.c.a).getObject(obj, j));
                                if (jVar.a) {
                                    jVar.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    ((gn1) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (a(iArr[i], i, obj)) {
                        c(i).c(unsafe.getObject(obj, j));
                    }
                }
                if (a(i, obj)) {
                    c(i).c(unsafe.getObject(obj, j));
                }
            }
            bm3 bm3Var = ((cu0) obj).b;
            if (bm3Var.e) {
                bm3Var.e = false;
            }
        }
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final int d(cu0 cu0Var) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int i5 = iArr[i4 + 1];
            int i6 = (267386880 & i5) >>> 20;
            if (i6 <= 50 || i6 >= 69) {
                long j = 1048575 & i5;
                int i7 = 37;
                switch (i6) {
                    case 0:
                        i = i3 * 53;
                        doubleToLongBits = Double.doubleToLongBits(pm3.c.b(j, cu0Var));
                        byte[] bArr = rb1.a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i2 = i3 * 53;
                        floatToIntBits = Float.floatToIntBits(pm3.c.c(j, cu0Var));
                        i3 = i2 + floatToIntBits;
                        break;
                    case 2:
                        i = i3 * 53;
                        doubleToLongBits = ((Unsafe) pm3.c.a).getLong(cu0Var, j);
                        byte[] bArr2 = rb1.a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i = i3 * 53;
                        doubleToLongBits = ((Unsafe) pm3.c.a).getLong(cu0Var, j);
                        byte[] bArr3 = rb1.a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getInt(cu0Var, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    case 5:
                        i = i3 * 53;
                        doubleToLongBits = ((Unsafe) pm3.c.a).getLong(cu0Var, j);
                        byte[] bArr4 = rb1.a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getInt(cu0Var, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    case 7:
                        i2 = i3 * 53;
                        boolean a = pm3.c.a(j, cu0Var);
                        byte[] bArr5 = rb1.a;
                        floatToIntBits = a ? 1231 : 1237;
                        i3 = i2 + floatToIntBits;
                        break;
                    case 8:
                        i2 = i3 * 53;
                        floatToIntBits = ((String) ((Unsafe) pm3.c.a).getObject(cu0Var, j)).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    case 9:
                        Object object = ((Unsafe) pm3.c.a).getObject(cu0Var, j);
                        if (object != null) {
                            i7 = object.hashCode();
                        }
                        i3 = (i3 * 53) + i7;
                        break;
                    case 10:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getObject(cu0Var, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    case 11:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getInt(cu0Var, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    case 12:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getInt(cu0Var, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    case 13:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getInt(cu0Var, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    case 14:
                        i = i3 * 53;
                        doubleToLongBits = ((Unsafe) pm3.c.a).getLong(cu0Var, j);
                        byte[] bArr6 = rb1.a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getInt(cu0Var, j);
                        i3 = i2 + floatToIntBits;
                        break;
                    case 16:
                        i = i3 * 53;
                        doubleToLongBits = ((Unsafe) pm3.c.a).getLong(cu0Var, j);
                        byte[] bArr7 = rb1.a;
                        i3 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    case 17:
                        Object object2 = ((Unsafe) pm3.c.a).getObject(cu0Var, j);
                        if (object2 != null) {
                            i7 = object2.hashCode();
                        }
                        i3 = (i3 * 53) + i7;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getObject(cu0Var, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                    case 50:
                        i2 = i3 * 53;
                        floatToIntBits = ((Unsafe) pm3.c.a).getObject(cu0Var, j).hashCode();
                        i3 = i2 + floatToIntBits;
                        break;
                }
            }
        }
        int i8 = this.i;
        while (true) {
            int[] iArr2 = this.g;
            if (i8 >= iArr2.length) {
                return cu0Var.b.hashCode() + (i3 * 53);
            }
            if (!a(0, iArr2[i8], cu0Var)) {
                i3 = ((Unsafe) pm3.c.a).getObject(cu0Var, iArr[r3 + 1] & 1048575).hashCode() + (i3 * 53);
            }
            i8++;
        }
    }

    public final G18207276409179303092 c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        G18207276409179303092 g18207276409179303092 = (G18207276409179303092) objArr[i2];
        if (g18207276409179303092 != null) {
            return g18207276409179303092;
        }
        G18207276409179303092 a = hn2.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final void c(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (a(i2, i, obj2)) {
            long j = iArr[i + 1] & 1048575;
            Unsafe unsafe = f87o;
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                G18207276409179303092 c = c(i);
                if (!a(i2, i, obj)) {
                    if (!g(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        cu0 a = c.a();
                        c.a(a, object);
                        unsafe.putObject(obj, j, a);
                    }
                    c(i2, i, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!g(object2)) {
                    cu0 a2 = c.a();
                    c.a(a2, object2);
                    unsafe.putObject(obj, j, a2);
                    object2 = a2;
                }
                c.a(object2, object);
                return;
            }
            Z3383101362411723454.i(iArr[i], obj2);
        }
    }

    public final void c(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        yu yuVar = pm3.c;
        yuVar.a((1 << (i2 >>> 20)) | ((Unsafe) yuVar.a).getInt(obj, j), j, obj);
    }

    public final void c(int i, int i2, Object obj) {
        pm3.c.a(i, this.a[i2 + 2] & 1048575, obj);
    }

    public static long d(int i) {
        return i & 1048575;
    }

    public final void d(int i, Object obj, Object obj2) {
        f87o.putObject(obj, this.a[i + 1] & 1048575, obj2);
        c(i, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0282, code lost:
    
        continue;
     */
    @Override // dev.epro.r0.G18207276409179303092
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(ads_mobile_sdk.cu0 r11, ads_mobile_sdk.cu0 r12) {
        /*
            Method dump skipped, instructions count: 864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.b(ads_mobile_sdk.cu0, ads_mobile_sdk.cu0):boolean");
    }

    public final Object b(int i) {
        return this.b[(i / 3) * 2];
    }

    public static void b(int i, E17564419012940707302 e17564419012940707302, Object obj) {
        if ((536870912 & i) != 0) {
            long j = i & 1048575;
            yu yuVar = pm3.c;
            O6641393078261985068 o6641393078261985068 = (O6641393078261985068) ((Unsafe) yuVar.a).getObject(obj, j);
            if (!((j) o6641393078261985068).a) {
                int size = o6641393078261985068.size();
                o6641393078261985068 = o6641393078261985068.a(size != 0 ? size * 2 : 10);
                yuVar.a(j, obj, o6641393078261985068);
            }
            e17564419012940707302.a(o6641393078261985068, true);
            return;
        }
        long j2 = i & 1048575;
        yu yuVar2 = pm3.c;
        O6641393078261985068 o66413930782619850682 = (O6641393078261985068) ((Unsafe) yuVar2.a).getObject(obj, j2);
        if (!((j) o66413930782619850682).a) {
            int size2 = o66413930782619850682.size();
            o66413930782619850682 = o66413930782619850682.a(size2 != 0 ? size2 * 2 : 10);
            yuVar2.a(j2, obj, o66413930782619850682);
        }
        e17564419012940707302.a(o66413930782619850682, false);
    }

    public final void b(int i, Object obj, Object obj2) {
        if (a(i, obj2)) {
            int[] iArr = this.a;
            long j = iArr[i + 1] & 1048575;
            Unsafe unsafe = f87o;
            Object object = unsafe.getObject(obj2, j);
            if (object != null) {
                G18207276409179303092 c = c(i);
                if (!a(i, obj)) {
                    if (!g(object)) {
                        unsafe.putObject(obj, j, object);
                    } else {
                        cu0 a = c.a();
                        c.a(a, object);
                        unsafe.putObject(obj, j, a);
                    }
                    c(i, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, j);
                if (!g(object2)) {
                    cu0 a2 = c.a();
                    c.a(a2, object2);
                    unsafe.putObject(obj, j, a2);
                    object2 = a2;
                }
                c.a(object2, object);
                return;
            }
            Z3383101362411723454.i(iArr[i], obj2);
        }
    }

    public final Object b(int i, Object obj) {
        G18207276409179303092 c = c(i);
        long j = this.a[i + 1] & 1048575;
        if (!a(i, obj)) {
            return c.a();
        }
        Object object = f87o.getObject(obj, j);
        if (g(object)) {
            return object;
        }
        cu0 a = c.a();
        if (object != null) {
            c.a(a, object);
        }
        return a;
    }

    public final Object b(int i, int i2, Object obj) {
        G18207276409179303092 c = c(i2);
        if (!a(i, i2, obj)) {
            return c.a();
        }
        Object object = f87o.getObject(obj, this.a[i2 + 1] & 1048575);
        if (g(object)) {
            return object;
        }
        cu0 a = c.a();
        if (object != null) {
            c.a(a, object);
        }
        return a;
    }

    public static long b(long j, Object obj) {
        return ((Long) ((Unsafe) pm3.c.a).getObject(obj, j)).longValue();
    }

    public static void a(Object obj, long j, E17564419012940707302 e17564419012940707302, G18207276409179303092 g18207276409179303092, nl0 nl0Var) {
        int t;
        yu yuVar = pm3.c;
        O6641393078261985068 o6641393078261985068 = (O6641393078261985068) ((Unsafe) yuVar.a).getObject(obj, j);
        if (!((j) o6641393078261985068).a) {
            int size = o6641393078261985068.size();
            o6641393078261985068 = o6641393078261985068.a(size == 0 ? 10 : size * 2);
            yuVar.a(j, obj, o6641393078261985068);
        }
        int i = e17564419012940707302.b;
        tu tuVar = (tu) e17564419012940707302.e;
        if ((i & 7) == 3) {
            do {
                cu0 a = g18207276409179303092.a();
                e17564419012940707302.a(a, g18207276409179303092, nl0Var);
                g18207276409179303092.c(a);
                o6641393078261985068.add(a);
                if (tuVar.c() || e17564419012940707302.d != 0) {
                    return;
                } else {
                    t = tuVar.t();
                }
            } while (t == i);
            e17564419012940707302.d = t;
            return;
        }
        Z3383101362411723454.v();
    }

    public final boolean a(int i, cu0 cu0Var, cu0 cu0Var2) {
        return a(i, (Object) cu0Var) == a(i, (Object) cu0Var2);
    }

    public static int a(byte[] bArr, int i, int i2, ft3 ft3Var, Class cls, D15735805680132151670 d15735805680132151670) {
        switch (ft3Var.ordinal()) {
            case 0:
                d15735805680132151670.c = Double.valueOf(Double.longBitsToDouble(M17147082063200071302.w(i, bArr)));
                return i + 8;
            case 1:
                d15735805680132151670.c = Float.valueOf(Float.intBitsToFloat(M17147082063200071302.s(i, bArr)));
                return i + 4;
            case 2:
            case 3:
                int A = M17147082063200071302.A(bArr, i, d15735805680132151670);
                d15735805680132151670.c = Long.valueOf(d15735805680132151670.b);
                return A;
            case 4:
            case 12:
            case 13:
                int y = M17147082063200071302.y(bArr, i, d15735805680132151670);
                d15735805680132151670.c = Integer.valueOf(d15735805680132151670.a);
                return y;
            case 5:
            case 15:
                d15735805680132151670.c = Long.valueOf(M17147082063200071302.w(i, bArr));
                return i + 8;
            case 6:
            case 14:
                d15735805680132151670.c = Integer.valueOf(M17147082063200071302.s(i, bArr));
                return i + 4;
            case 7:
                int A2 = M17147082063200071302.A(bArr, i, d15735805680132151670);
                d15735805680132151670.c = Boolean.valueOf(d15735805680132151670.b != 0);
                return A2;
            case 8:
                return M17147082063200071302.v(bArr, i, d15735805680132151670);
            case 9:
            default:
                K2042933864045806308.i("unsupported field type.");
                return 0;
            case 10:
                G18207276409179303092 a = hn2.c.a(cls);
                cu0 a2 = a.a();
                int h = M17147082063200071302.h(a2, a, bArr, i, i2, d15735805680132151670);
                a.c(a2);
                d15735805680132151670.c = a2;
                return h;
            case 11:
                return M17147082063200071302.i(bArr, i, d15735805680132151670);
            case 16:
                int y2 = M17147082063200071302.y(bArr, i, d15735805680132151670);
                d15735805680132151670.c = Integer.valueOf(tu.b(d15735805680132151670.a));
                return y2;
            case 17:
                int A3 = M17147082063200071302.A(bArr, i, d15735805680132151670);
                d15735805680132151670.c = Long.valueOf(tu.a(d15735805680132151670.b));
                return A3;
        }
    }

    public final Object a(Object obj, int i, Object obj2, Object obj3) {
        N4718165958758773250 a;
        int i2 = this.a[i];
        Object object = ((Unsafe) pm3.c.a).getObject(obj, r0[i + 1] & 1048575);
        if (object == null || (a = a(i)) == null) {
            return obj2;
        }
        r6 r6Var = ((dn1) b(i)).a;
        ft3 ft3Var = (ft3) r6Var.b;
        E2581631045160024594 e2581631045160024594 = (E2581631045160024594) r6Var.a;
        Iterator it = ((gn1) object).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!a.a(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    obj2 = U11450443558875589191.d(obj3);
                }
                int a2 = zl0.a(ft3Var, 2, entry.getValue()) + zl0.a(e2581631045160024594, 1, entry.getKey());
                byte[] bArr = new byte[a2];
                vu vuVar = new vu(bArr, a2);
                try {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    zl0.a(vuVar, e2581631045160024594, 1, key);
                    zl0.a(vuVar, ft3Var, 2, value);
                    if (vuVar.b() <= 0) {
                        if (vuVar.b() >= 0) {
                            ((bm3) obj2).a((i2 << 3) | 2, new qq(bArr));
                            it.remove();
                        } else {
                            S10973172697741180971.m("Wrote more data than expected.");
                            return null;
                        }
                    } else {
                        S10973172697741180971.m("Did not write as much data as expected.");
                        return null;
                    }
                } catch (IOException e) {
                    Q11088980322693754445.k(e);
                    return null;
                }
            }
        }
        return obj2;
    }

    public final N4718165958758773250 a(int i) {
        return (N4718165958758773250) this.b[E12098517352909843120.f(i, 3, 2, 1)];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0150 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.a(int, java.lang.Object):boolean");
    }

    public final boolean a(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return a(i, obj);
        }
        return (i3 & i4) != 0;
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final boolean a(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.h) {
            int i6 = this.g[i4];
            int[] iArr = this.a;
            int i7 = iArr[i6 + 1];
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i5 = f87o.getInt(obj, i9);
                }
                i2 = i5;
                i = i9;
            } else {
                i = i3;
                i2 = i5;
            }
            op1 op1Var = this;
            Object obj2 = obj;
            if ((268435456 & i7) == 0 || op1Var.a(obj2, i6, i, i2, i10)) {
                int i11 = (267386880 & i7) >>> 20;
                if (i11 != 9 && i11 != 17) {
                    if (i11 != 27) {
                        if (i11 == 60 || i11 == 68) {
                            if (op1Var.a(iArr[i6], i6, obj2)) {
                                if (!op1Var.c(i6).a(((Unsafe) pm3.c.a).getObject(obj2, i7 & 1048575))) {
                                }
                            } else {
                                continue;
                            }
                            i4++;
                            this = op1Var;
                            obj = obj2;
                            i3 = i;
                            i5 = i2;
                        } else if (i11 != 49) {
                            if (i11 != 50) {
                                continue;
                            } else {
                                gn1 gn1Var = (gn1) ((Unsafe) pm3.c.a).getObject(obj2, i7 & 1048575);
                                if (!gn1Var.isEmpty() && ((ft3) ((dn1) op1Var.b(i6)).a.b).a == gt3.j) {
                                    G18207276409179303092 g18207276409179303092 = null;
                                    for (Object obj3 : gn1Var.values()) {
                                        if (g18207276409179303092 == null) {
                                            g18207276409179303092 = hn2.c.a(((cu0) obj3).getClass());
                                        }
                                        if (!g18207276409179303092.a(obj3)) {
                                        }
                                    }
                                }
                            }
                            i4++;
                            this = op1Var;
                            obj = obj2;
                            i3 = i;
                            i5 = i2;
                        }
                    }
                    List list = (List) ((Unsafe) pm3.c.a).getObject(obj2, i7 & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        G18207276409179303092 c = op1Var.c(i6);
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            if (c.a(list.get(i12))) {
                            }
                        }
                    }
                    i4++;
                    this = op1Var;
                    obj = obj2;
                    i3 = i;
                    i5 = i2;
                } else {
                    if (op1Var.a(obj2, i6, i, i2, i10)) {
                        if (!op1Var.c(i6).a(((Unsafe) pm3.c.a).getObject(obj2, i7 & 1048575))) {
                        }
                    } else {
                        continue;
                    }
                    i4++;
                    this = op1Var;
                    obj = obj2;
                    i3 = i;
                    i5 = i2;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean a(int i, int i2, Object obj) {
        return ((Unsafe) pm3.c.a).getInt(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void a(Object obj, E17564419012940707302 e17564419012940707302, nl0 nl0Var) {
        byte[] bArr = rb1.a;
        nl0Var.getClass();
        e(obj);
        a$1(obj, e17564419012940707302, nl0Var);
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void a(Object obj, Object obj2) {
        Object obj3;
        e(obj);
        byte[] bArr = rb1.a;
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long j = 1048575 & i2;
                int i3 = iArr[i];
                switch ((i2 & 267386880) >>> 20) {
                    case 0:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar = pm3.c;
                            yuVar.a(obj3, j, yuVar.b(j, obj2));
                            c(i, obj3);
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 1:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar2 = pm3.c;
                            yuVar2.a(obj3, j, yuVar2.c(j, obj2));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 2:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar3 = pm3.c;
                            yuVar3.a(obj3, j, ((Unsafe) yuVar3.a).getLong(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 3:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar4 = pm3.c;
                            yuVar4.a(obj3, j, ((Unsafe) yuVar4.a).getLong(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 4:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar5 = pm3.c;
                            yuVar5.a(((Unsafe) yuVar5.a).getInt(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 5:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar6 = pm3.c;
                            yuVar6.a(obj3, j, ((Unsafe) yuVar6.a).getLong(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 6:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar7 = pm3.c;
                            yuVar7.a(((Unsafe) yuVar7.a).getInt(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 7:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar8 = pm3.c;
                            yuVar8.a(obj3, j, yuVar8.a(j, obj2));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 8:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar9 = pm3.c;
                            yuVar9.a(j, obj3, ((Unsafe) yuVar9.a).getObject(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 9:
                        obj3 = obj;
                        b(i, obj3, obj2);
                        continue;
                        i += 3;
                        obj = obj3;
                    case 10:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar10 = pm3.c;
                            yuVar10.a(j, obj3, ((Unsafe) yuVar10.a).getObject(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 11:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar11 = pm3.c;
                            yuVar11.a(((Unsafe) yuVar11.a).getInt(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 12:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar12 = pm3.c;
                            yuVar12.a(((Unsafe) yuVar12.a).getInt(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 13:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar13 = pm3.c;
                            yuVar13.a(((Unsafe) yuVar13.a).getInt(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 14:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar14 = pm3.c;
                            yuVar14.a(obj3, j, ((Unsafe) yuVar14.a).getLong(obj2, j));
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 15:
                        obj3 = obj;
                        if (a(i, obj2)) {
                            yu yuVar15 = pm3.c;
                            yuVar15.a(((Unsafe) yuVar15.a).getInt(obj2, j), j, obj3);
                            c(i, obj3);
                        } else {
                            continue;
                        }
                        i += 3;
                        obj = obj3;
                    case 16:
                        if (a(i, obj2)) {
                            yu yuVar16 = pm3.c;
                            obj3 = obj;
                            yuVar16.a(obj3, j, ((Unsafe) yuVar16.a).getLong(obj2, j));
                            c(i, obj3);
                            i += 3;
                            obj = obj3;
                        }
                        break;
                    case 17:
                        b(i, obj, obj2);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        yu yuVar17 = pm3.c;
                        O6641393078261985068 o6641393078261985068 = (O6641393078261985068) ((Unsafe) yuVar17.a).getObject(obj, j);
                        O6641393078261985068 o66413930782619850682 = (O6641393078261985068) ((Unsafe) yuVar17.a).getObject(obj2, j);
                        int size = o6641393078261985068.size();
                        int size2 = o66413930782619850682.size();
                        if (size > 0 && size2 > 0) {
                            if (!((j) o6641393078261985068).a) {
                                o6641393078261985068 = o6641393078261985068.a(size2 + size);
                            }
                            o6641393078261985068.addAll(o66413930782619850682);
                        }
                        if (size > 0) {
                            o66413930782619850682 = o6641393078261985068;
                        }
                        yuVar17.a(j, obj, o66413930782619850682);
                        break;
                    case 50:
                        yu yuVar18 = pm3.c;
                        gn1 gn1Var = (gn1) ((Unsafe) yuVar18.a).getObject(obj, j);
                        gn1 gn1Var2 = (gn1) ((Unsafe) yuVar18.a).getObject(obj2, j);
                        if (!gn1Var2.isEmpty()) {
                            if (!gn1Var.a) {
                                gn1Var = gn1Var.b();
                            }
                            if (gn1Var.a) {
                                if (!gn1Var2.isEmpty()) {
                                    gn1Var.putAll(gn1Var2);
                                }
                            } else {
                                Z3383101362411723454.t();
                                return;
                            }
                        }
                        yuVar18.a(j, obj, gn1Var);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (a(i3, i, obj2)) {
                            yu yuVar19 = pm3.c;
                            yuVar19.a(j, obj, ((Unsafe) yuVar19.a).getObject(obj2, j));
                            c(i3, i, obj);
                            break;
                        }
                        break;
                    case 60:
                        c(i, obj, obj2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (a(i3, i, obj2)) {
                            yu yuVar20 = pm3.c;
                            yuVar20.a(j, obj, ((Unsafe) yuVar20.a).getObject(obj2, j));
                            c(i3, i, obj);
                            break;
                        }
                        break;
                    case 68:
                        c(i, obj, obj2);
                        break;
                }
                obj3 = obj;
                i += 3;
                obj = obj3;
            } else {
                xv.a(obj, obj2);
                return;
            }
        }
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final void a(Object obj, byte[] bArr, int i, int i2, D15735805680132151670 d15735805680132151670) {
        a(obj, bArr, i, i2, 0, d15735805680132151670);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, int r12, java.lang.Object r13, ads_mobile_sdk.nl0 r14, dev.epro.r0.E17564419012940707302 r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.op1.a(java.lang.Object, int, java.lang.Object, ads_mobile_sdk.nl0, dev.epro.r0.E17564419012940707302):void");
    }

    @Override // dev.epro.r0.G18207276409179303092
    public final cu0 a() {
        return (cu0) ((cu0) this.e).a(4, (cu0) null);
    }

    public static void a(Object obj, int i, E17564419012940707302 e17564419012940707302, G18207276409179303092 g18207276409179303092, nl0 nl0Var) {
        int t;
        long j = i & 1048575;
        yu yuVar = pm3.c;
        O6641393078261985068 o6641393078261985068 = (O6641393078261985068) ((Unsafe) yuVar.a).getObject(obj, j);
        if (!((j) o6641393078261985068).a) {
            int size = o6641393078261985068.size();
            o6641393078261985068 = o6641393078261985068.a(size == 0 ? 10 : size * 2);
            yuVar.a(j, obj, o6641393078261985068);
        }
        int i2 = e17564419012940707302.b;
        tu tuVar = (tu) e17564419012940707302.e;
        if ((i2 & 7) == 2) {
            do {
                cu0 a = g18207276409179303092.a();
                e17564419012940707302.b(a, g18207276409179303092, nl0Var);
                g18207276409179303092.c(a);
                o6641393078261985068.add(a);
                if (tuVar.c() || e17564419012940707302.d != 0) {
                    return;
                } else {
                    t = tuVar.t();
                }
            } while (t == i2);
            e17564419012940707302.d = t;
            return;
        }
        Z3383101362411723454.v();
    }

    public final void a(int i, E17564419012940707302 e17564419012940707302, Object obj) {
        tu tuVar = (tu) e17564419012940707302.e;
        if ((536870912 & i) != 0) {
            e17564419012940707302.b(2);
            pm3.c.a(i & 1048575, obj, tuVar.s());
            return;
        }
        if (this.f) {
            e17564419012940707302.b(2);
            pm3.c.a(i & 1048575, obj, tuVar.r());
            return;
        }
        e17564419012940707302.b(2);
        pm3.c.a(i & 1048575, obj, tuVar.e());
    }

    public static Field a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder y = G6547577305291411977.y("Field ", str, " for ", name, " not found. Known fields are ");
            y.append(arrays);
            throw new RuntimeException(y.toString(), e);
        }
    }

    public final int a(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void a(int i, int i2, Object obj, Object obj2) {
        f87o.putObject(obj, this.a[i2 + 1] & 1048575, obj2);
        c(i, i2, obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // dev.epro.r0.G18207276409179303092
    public final void a(Object obj, w8 w8Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        op1 op1Var = this;
        yu yuVar = (yu) w8Var.a;
        int[] iArr = op1Var.a;
        int length = iArr.length;
        int i7 = 1048575;
        int i8 = 1048575;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int i11 = iArr[i9 + 1];
            int i12 = iArr[i9];
            int i13 = (267386880 & i11) >>> 20;
            Unsafe unsafe = f87o;
            if (i13 <= 17) {
                int i14 = iArr[i9 + 2];
                z = true;
                int i15 = i14 & i7;
                if (i15 != i8) {
                    i10 = i15 == i7 ? 0 : unsafe.getInt(obj, i15);
                    i8 = i15;
                }
                int i16 = 1 << (i14 >>> 20);
                i = i11;
                i2 = i16;
            } else {
                z = true;
                i = i11;
                i2 = 0;
            }
            long j = i & i7;
            switch (i13) {
                case 0:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.d(i12, Double.doubleToRawLongBits(pm3.c.b(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.e(i12, Float.floatToRawIntBits(pm3.c.c(j, obj)));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.e(i12, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.e(i12, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.f(i12, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.d(i12, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.e(i12, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.a(i12, pm3.c.a(j, obj));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            yuVar.b(i12, (String) object);
                            break;
                        } else {
                            yuVar.b(i12, (sq) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        w8Var.b(i12, op1Var.c(i9), unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.b(i12, (sq) unsafe.getObject(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.h(i12, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.f(i12, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.e(i12, unsafe.getInt(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.d(i12, unsafe.getLong(obj, j));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.h(i12, yu.j(unsafe.getInt(obj, j)));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        yuVar.e(i12, yu.b(unsafe.getLong(obj, j)));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (op1Var.a(obj, i9, i8, i10, i2)) {
                        Object object2 = unsafe.getObject(obj, j);
                        yuVar.g(i12, 3);
                        op1Var.c(i9).a(object2, w8Var);
                        yuVar.g(i12, 4);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i3 = i8;
                    i4 = i10;
                    xv.b(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 19:
                    i3 = i8;
                    i4 = i10;
                    xv.f(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 20:
                    i3 = i8;
                    i4 = i10;
                    xv.h(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 21:
                    i3 = i8;
                    i4 = i10;
                    xv.n(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 22:
                    i3 = i8;
                    i4 = i10;
                    xv.g(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 23:
                    i3 = i8;
                    i4 = i10;
                    xv.e(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 24:
                    i3 = i8;
                    i4 = i10;
                    xv.d(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 25:
                    i3 = i8;
                    i4 = i10;
                    xv.a(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 26:
                    i5 = i8;
                    i6 = i10;
                    int i17 = iArr[i9];
                    List list = (List) unsafe.getObject(obj, j);
                    if (list != null && !list.isEmpty()) {
                        for (int i18 = 0; i18 < list.size(); i18++) {
                            yuVar.b(i17, (String) list.get(i18));
                        }
                    }
                    i8 = i5;
                    i10 = i6;
                    break;
                case 27:
                    i5 = i8;
                    i6 = i10;
                    int i19 = iArr[i9];
                    List list2 = (List) unsafe.getObject(obj, j);
                    G18207276409179303092 c = op1Var.c(i9);
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i20 = 0; i20 < list2.size(); i20++) {
                            w8Var.b(i19, c, list2.get(i20));
                        }
                    }
                    i8 = i5;
                    i10 = i6;
                    break;
                case 28:
                    i5 = i8;
                    i6 = i10;
                    int i21 = iArr[i9];
                    List list3 = (List) unsafe.getObject(obj, j);
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i22 = 0; i22 < list3.size(); i22++) {
                            yuVar.b(i21, (sq) list3.get(i22));
                        }
                    }
                    i8 = i5;
                    i10 = i6;
                    break;
                case 29:
                    i3 = i8;
                    i4 = i10;
                    z2 = false;
                    xv.m(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 30:
                    i3 = i8;
                    i4 = i10;
                    z2 = false;
                    xv.c(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 31:
                    i3 = i8;
                    i4 = i10;
                    z2 = false;
                    xv.i(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 32:
                    i3 = i8;
                    i4 = i10;
                    z2 = false;
                    xv.j(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 33:
                    i3 = i8;
                    i4 = i10;
                    z2 = false;
                    xv.k(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 34:
                    i3 = i8;
                    i4 = i10;
                    z2 = false;
                    xv.l(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, false);
                    i8 = i3;
                    i10 = i4;
                    break;
                case 35:
                    i5 = i8;
                    i6 = i10;
                    xv.b(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 36:
                    i5 = i8;
                    i6 = i10;
                    xv.f(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 37:
                    i5 = i8;
                    i6 = i10;
                    xv.h(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 38:
                    i5 = i8;
                    i6 = i10;
                    xv.n(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 39:
                    i5 = i8;
                    i6 = i10;
                    xv.g(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 40:
                    i5 = i8;
                    i6 = i10;
                    xv.e(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 41:
                    i5 = i8;
                    i6 = i10;
                    xv.d(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 42:
                    i5 = i8;
                    i6 = i10;
                    xv.a(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 43:
                    i5 = i8;
                    i6 = i10;
                    xv.m(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 44:
                    i5 = i8;
                    i6 = i10;
                    xv.c(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 45:
                    i5 = i8;
                    i6 = i10;
                    xv.i(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 46:
                    i5 = i8;
                    i6 = i10;
                    xv.j(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 47:
                    i5 = i8;
                    i6 = i10;
                    xv.k(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, z);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 48:
                    i5 = i8;
                    i6 = i10;
                    xv.l(iArr[i9], (List) unsafe.getObject(obj, j), w8Var, true);
                    i8 = i5;
                    i10 = i6;
                    break;
                case 49:
                    i5 = i8;
                    i6 = i10;
                    int i23 = iArr[i9];
                    List list4 = (List) unsafe.getObject(obj, j);
                    G18207276409179303092 c2 = op1Var.c(i9);
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i24 = 0; i24 < list4.size(); i24++) {
                            g gVar = (g) list4.get(i24);
                            yuVar.g(i23, 3);
                            c2.a((Object) gVar, w8Var);
                            yuVar.g(i23, 4);
                        }
                    }
                    i8 = i5;
                    i10 = i6;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(obj, j);
                    if (object3 != null) {
                        r6 r6Var = ((dn1) op1Var.b(i9)).a;
                        ft3 ft3Var = (ft3) r6Var.b;
                        E2581631045160024594 e2581631045160024594 = (E2581631045160024594) r6Var.a;
                        for (Map.Entry entry : ((gn1) object3).entrySet()) {
                            yuVar.g(i12, 2);
                            int i25 = i8;
                            int i26 = i10;
                            boolean z3 = z;
                            yuVar.m(zl0.a(ft3Var, 2, entry.getValue()) + zl0.a(e2581631045160024594, z3 ? 1 : 0, entry.getKey()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            zl0.a(yuVar, e2581631045160024594, z3 ? 1 : 0, key);
                            zl0.a(yuVar, ft3Var, 2, value);
                            i8 = i25;
                            i10 = i26;
                            z = true;
                        }
                    }
                    break;
                case 51:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.d(i12, Double.doubleToRawLongBits(((Double) ((Unsafe) pm3.c.a).getObject(obj, j)).doubleValue()));
                    }
                    break;
                case 52:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.e(i12, Float.floatToRawIntBits(((Float) ((Unsafe) pm3.c.a).getObject(obj, j)).floatValue()));
                    }
                    break;
                case 53:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.e(i12, b(j, obj));
                    }
                    break;
                case 54:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.e(i12, b(j, obj));
                    }
                    break;
                case 55:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.f(i12, a(j, obj));
                    }
                    break;
                case 56:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.d(i12, b(j, obj));
                    }
                    break;
                case 57:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.e(i12, a(j, obj));
                    }
                    break;
                case 58:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.a(i12, ((Boolean) ((Unsafe) pm3.c.a).getObject(obj, j)).booleanValue());
                    }
                    break;
                case 59:
                    if (op1Var.a(i12, i9, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        if (object4 instanceof String) {
                            yuVar.b(i12, (String) object4);
                        } else {
                            yuVar.b(i12, (sq) object4);
                        }
                    }
                    break;
                case 60:
                    if (op1Var.a(i12, i9, obj)) {
                        w8Var.b(i12, op1Var.c(i9), unsafe.getObject(obj, j));
                    }
                    break;
                case 61:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.b(i12, (sq) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.h(i12, a(j, obj));
                    }
                    break;
                case 63:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.f(i12, a(j, obj));
                    }
                    break;
                case 64:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.e(i12, a(j, obj));
                    }
                    break;
                case 65:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.d(i12, b(j, obj));
                    }
                    break;
                case 66:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.h(i12, yu.j(a(j, obj)));
                    }
                    break;
                case 67:
                    if (op1Var.a(i12, i9, obj)) {
                        yuVar.e(i12, yu.b(b(j, obj)));
                    }
                    break;
                case 68:
                    if (op1Var.a(i12, i9, obj)) {
                        Object object5 = unsafe.getObject(obj, j);
                        yuVar.g(i12, 3);
                        op1Var.c(i9).a(object5, w8Var);
                        yuVar.g(i12, 4);
                    }
                    break;
            }
            i9 += 3;
            i7 = 1048575;
            op1Var = this;
        }
        ((cu0) obj).b.a(w8Var);
    }

    public static int a(long j, Object obj) {
        return ((Integer) ((Unsafe) pm3.c.a).getObject(obj, j)).intValue();
    }
}
