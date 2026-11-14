package dev.epro.r0;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L12427379894931272439 implements B8838962141159673445 {
    public static final int[] n = new int[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Unsafe f341o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final E10304945778167701561 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final L10938498148143445092 j;
    public final B2789568257983442151 k;
    public final B4833153077418241720 l;
    public final C9482087664294706787 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new F2522870689781627311((byte) 3));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f341o = unsafe;
    }

    public L12427379894931272439(int[] iArr, Object[] objArr, int i, int i2, E10304945778167701561 e10304945778167701561, int[] iArr2, int i3, int i4, L10938498148143445092 l10938498148143445092, B2789568257983442151 b2789568257983442151, B4833153077418241720 b4833153077418241720, U12348740181602283822 u12348740181602283822, C9482087664294706787 c9482087664294706787) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = e10304945778167701561 instanceof T3817383632789307090;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = l10938498148143445092;
        this.k = b2789568257983442151;
        this.l = b4833153077418241720;
        this.e = e10304945778167701561;
        this.m = c9482087664294706787;
    }

    public static Field F(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder sbG = X2485016533998461232.g("Field ", str, " for ");
            sbG.append(cls.getName());
            sbG.append(" not found. Known fields are ");
            sbG.append(Arrays.toString(declaredFields));
            throw new RuntimeException(sbG.toString());
        }
    }

    public static int I(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof T3817383632789307090) {
            return ((T3817383632789307090) obj).g();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.L12427379894931272439 w(dev.epro.r0.J12688447796732847593 r34, dev.epro.r0.L10938498148143445092 r35, dev.epro.r0.B2789568257983442151 r36, dev.epro.r0.B4833153077418241720 r37, dev.epro.r0.U12348740181602283822 r38, dev.epro.r0.C9482087664294706787 r39) {
        /*
            Method dump skipped, instruction units count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.w(dev.epro.r0.J12688447796732847593, dev.epro.r0.L10938498148143445092, dev.epro.r0.B2789568257983442151, dev.epro.r0.B4833153077418241720, dev.epro.r0.U12348740181602283822, dev.epro.r0.C9482087664294706787):dev.epro.r0.L12427379894931272439");
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) P4046997492550522548.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) P4046997492550522548.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void B(Object obj, long j, E17564419012940707302 e17564419012940707302, B8838962141159673445 b8838962141159673445, R12171924199823312678 r12171924199823312678) throws O941307146068593422 {
        int iA;
        this.k.getClass();
        D11116981298317247998 d11116981298317247998A = B2789568257983442151.a(j, obj);
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) e17564419012940707302.e;
        int i = e17564419012940707302.b;
        if ((i & 7) != 3) {
            throw A9458650138667563085.b();
        }
        do {
            T3817383632789307090 t3817383632789307090D = b8838962141159673445.d();
            e17564419012940707302.p(t3817383632789307090D, b8838962141159673445, r12171924199823312678);
            b8838962141159673445.b(t3817383632789307090D);
            ((H7410314698464292688) d11116981298317247998A).add(t3817383632789307090D);
            if (f3160751278268780235.c() || e17564419012940707302.d != 0) {
                return;
            } else {
                iA = f3160751278268780235.A();
            }
        } while (iA == i);
        e17564419012940707302.d = iA;
    }

    public final void C(Object obj, int i, E17564419012940707302 e17564419012940707302, B8838962141159673445 b8838962141159673445, R12171924199823312678 r12171924199823312678) throws A9458650138667563085 {
        int iA;
        this.k.getClass();
        D11116981298317247998 d11116981298317247998A = B2789568257983442151.a(i & 1048575, obj);
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) e17564419012940707302.e;
        int i2 = e17564419012940707302.b;
        if ((i2 & 7) != 2) {
            throw A9458650138667563085.b();
        }
        do {
            T3817383632789307090 t3817383632789307090D = b8838962141159673445.d();
            e17564419012940707302.s(t3817383632789307090D, b8838962141159673445, r12171924199823312678);
            b8838962141159673445.b(t3817383632789307090D);
            ((H7410314698464292688) d11116981298317247998A).add(t3817383632789307090D);
            if (f3160751278268780235.c() || e17564419012940707302.d != 0) {
                return;
            } else {
                iA = f3160751278268780235.A();
            }
        } while (iA == i2);
        e17564419012940707302.d = iA;
    }

    public final void D(int i, E17564419012940707302 e17564419012940707302, Object obj) throws O941307146068593422, J12068242864160501074, Q13606351353383574666 {
        if ((536870912 & i) != 0) {
            e17564419012940707302.x0(2);
            P4046997492550522548.o(i & 1048575, obj, ((F3160751278268780235) e17564419012940707302.e).z());
        } else if (!this.f) {
            P4046997492550522548.o(i & 1048575, obj, e17564419012940707302.y());
        } else {
            e17564419012940707302.x0(2);
            P4046997492550522548.o(i & 1048575, obj, ((F3160751278268780235) e17564419012940707302.e).y());
        }
    }

    public final void E(int i, E17564419012940707302 e17564419012940707302, Object obj) throws O941307146068593422, J12068242864160501074, Q13606351353383574666 {
        boolean z = (536870912 & i) != 0;
        B2789568257983442151 b2789568257983442151 = this.k;
        if (z) {
            b2789568257983442151.getClass();
            e17564419012940707302.n0(B2789568257983442151.a(i & 1048575, obj), true);
        } else {
            b2789568257983442151.getClass();
            e17564419012940707302.n0(B2789568257983442151.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        P4046997492550522548.m((1 << (i2 >>> 20)) | P4046997492550522548.f(j, obj), j, obj);
    }

    public final void H(int i, int i2, Object obj) {
        P4046997492550522548.m(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int J(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.a(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.b(java.lang.Object):void");
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.h) {
            int i7 = this.g[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int iJ = J(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f341o.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iJ) == 0 || o(obj, i2, i, i3, i11)) {
                int I = I(iJ);
                if (I != 9 && I != 17) {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (!q(i8, i2, obj) || m(i2).c(P4046997492550522548.h(iJ & 1048575, obj))) {
                                i6++;
                                i4 = i;
                                i5 = i3;
                            }
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object objH = P4046997492550522548.h(iJ & 1048575, obj);
                                this.m.getClass();
                                C17595962009821566633 c17595962009821566633 = (C17595962009821566633) objH;
                                if (c17595962009821566633.isEmpty()) {
                                    continue;
                                } else {
                                    if (((V14641450762532118893) ((R7984749867467708788) this.b[(i2 / 3) * 2]).a.c).a != Z10175809439715163211.i) {
                                        continue;
                                    } else {
                                        B8838962141159673445 b8838962141159673445A = null;
                                        for (Object obj2 : c17595962009821566633.values()) {
                                            if (b8838962141159673445A == null) {
                                                b8838962141159673445A = X8293765978123339002.c.a(obj2.getClass());
                                            }
                                            if (!b8838962141159673445A.c(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) P4046997492550522548.h(iJ & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        B8838962141159673445 b8838962141159673445M = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (b8838962141159673445M.c(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else if (!o(obj, i2, i, i3, i11) || m(i2).c(P4046997492550522548.h(iJ & 1048575, obj))) {
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final T3817383632789307090 d() {
        this.j.getClass();
        return ((T3817383632789307090) this.e).i();
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x082a A[Catch: all -> 0x0500, TryCatch #1 {all -> 0x0500, blocks: (B:158:0x0825, B:160:0x082a, B:161:0x082f, B:114:0x04fb, B:117:0x0503, B:118:0x051b, B:119:0x0533, B:120:0x054b, B:121:0x0563, B:122:0x057b, B:123:0x0593, B:124:0x05ab, B:125:0x05c3, B:126:0x05eb, B:127:0x060b, B:128:0x062b, B:129:0x064c, B:130:0x066d, B:131:0x0690, B:132:0x06b0, B:133:0x06c9, B:134:0x06f1, B:135:0x0702, B:136:0x0724, B:137:0x0745, B:138:0x0766, B:139:0x0786, B:140:0x07a6, B:141:0x07c5, B:142:0x07e7, B:148:0x0809), top: B:181:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0850 A[LOOP:3: B:170:0x084e->B:171:0x0850, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0835 A[SYNTHETIC] */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r21, dev.epro.r0.E17564419012940707302 r22, dev.epro.r0.R12171924199823312678 r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.e(java.lang.Object, dev.epro.r0.E17564419012940707302, dev.epro.r0.R12171924199823312678):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(dev.epro.r0.T3817383632789307090 r12, dev.epro.r0.T3817383632789307090 r13) {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.f(dev.epro.r0.T3817383632789307090, dev.epro.r0.T3817383632789307090):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x01ce  */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(dev.epro.r0.T3817383632789307090 r17) {
        /*
            Method dump skipped, instruction units count: 1856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.g(dev.epro.r0.T3817383632789307090):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // dev.epro.r0.B8838962141159673445
    public final void h(Object obj, H12843822278061842084 h12843822278061842084) throws IOException {
        int i;
        int i2;
        int i3;
        boolean z;
        L12427379894931272439 l12427379894931272439 = this;
        h12843822278061842084.getClass();
        W12822723367527402820 w12822723367527402820 = (W12822723367527402820) h12843822278061842084.b;
        int[] iArr = l12427379894931272439.a;
        int length = iArr.length;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < length) {
            int iJ = l12427379894931272439.J(i6);
            int i8 = iArr[i6];
            int I = I(iJ);
            Unsafe unsafe = f341o;
            if (I <= 17) {
                int i9 = iArr[i6 + 2];
                i = 1;
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                int i11 = 1 << (i9 >>> 20);
                i2 = iJ;
                i3 = i11;
            } else {
                i = 1;
                i2 = iJ;
                i3 = 0;
            }
            long j = i2 & i4;
            switch (I) {
                case 0:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.t(i8, Double.doubleToRawLongBits(P4046997492550522548.c.c(j, obj)));
                    }
                    break;
                case 1:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.r(i8, Float.floatToRawIntBits(P4046997492550522548.c.d(j, obj)));
                    }
                    l12427379894931272439 = this;
                    break;
                case 2:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.E(i8, unsafe.getLong(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 3:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.E(i8, unsafe.getLong(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 4:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.v(i8, unsafe.getInt(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 5:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.t(i8, unsafe.getLong(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 6:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.r(i8, unsafe.getInt(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 7:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.o(i8, P4046997492550522548.c.a(j, obj));
                    }
                    l12427379894931272439 = this;
                    break;
                case 8:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            w12822723367527402820.z(i8, (String) object);
                        } else {
                            w12822723367527402820.p(i8, (D8243293650800641817) object);
                        }
                    }
                    l12427379894931272439 = this;
                    break;
                case 9:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.y(i8, (E10304945778167701561) unsafe.getObject(obj, j), l12427379894931272439.m(i6));
                    }
                    break;
                case 10:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.p(i8, (D8243293650800641817) unsafe.getObject(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 11:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.C(i8, unsafe.getInt(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 12:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.v(i8, unsafe.getInt(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 13:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.r(i8, unsafe.getInt(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 14:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.t(i8, unsafe.getLong(obj, j));
                    }
                    l12427379894931272439 = this;
                    break;
                case 15:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j);
                        w12822723367527402820.C(i8, (i12 >> 31) ^ (i12 << 1));
                    }
                    l12427379894931272439 = this;
                    break;
                case 16:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        long j2 = unsafe.getLong(obj, j);
                        w12822723367527402820.E(i8, (j2 >> 63) ^ (j2 << 1));
                    }
                    l12427379894931272439 = this;
                    break;
                case 17:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        h12843822278061842084.K(i8, unsafe.getObject(obj, j), l12427379894931272439.m(i6));
                    }
                    break;
                case 18:
                    K2393395423856546155.n(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 19:
                    K2393395423856546155.r(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 20:
                    K2393395423856546155.t(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 21:
                    K2393395423856546155.z(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 22:
                    K2393395423856546155.s(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 23:
                    K2393395423856546155.q(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 24:
                    K2393395423856546155.p(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 25:
                    K2393395423856546155.m(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 26:
                    int i13 = iArr[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = K2393395423856546155.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            w12822723367527402820.z(i13, (String) list.get(i14));
                        }
                    }
                    break;
                case 27:
                    int i15 = iArr[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    B8838962141159673445 b8838962141159673445M = l12427379894931272439.m(i6);
                    Class cls2 = K2393395423856546155.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            w12822723367527402820.y(i15, (E10304945778167701561) list2.get(i16), b8838962141159673445M);
                        }
                    }
                    break;
                case 28:
                    int i17 = iArr[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = K2393395423856546155.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            w12822723367527402820.p(i17, (D8243293650800641817) list3.get(i18));
                        }
                    }
                    break;
                case 29:
                    z = false;
                    K2393395423856546155.y(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 30:
                    z = false;
                    K2393395423856546155.o(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 31:
                    z = false;
                    K2393395423856546155.u(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 32:
                    z = false;
                    K2393395423856546155.v(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 33:
                    z = false;
                    K2393395423856546155.w(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 34:
                    z = false;
                    K2393395423856546155.x(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    break;
                case 35:
                    K2393395423856546155.n(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 36:
                    K2393395423856546155.r(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 37:
                    K2393395423856546155.t(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 38:
                    K2393395423856546155.z(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 39:
                    K2393395423856546155.s(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 40:
                    K2393395423856546155.q(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 41:
                    K2393395423856546155.p(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 42:
                    K2393395423856546155.m(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 43:
                    K2393395423856546155.y(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 44:
                    K2393395423856546155.o(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 45:
                    K2393395423856546155.u(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 46:
                    K2393395423856546155.v(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 47:
                    K2393395423856546155.w(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i);
                    break;
                case 48:
                    K2393395423856546155.x(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, true);
                    break;
                case 49:
                    int i19 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    B8838962141159673445 b8838962141159673445M2 = l12427379894931272439.m(i6);
                    Class cls4 = K2393395423856546155.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            h12843822278061842084.K(i19, list4.get(i20), b8838962141159673445M2);
                        }
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i21 = 2;
                        Object obj2 = l12427379894931272439.b[(i6 / 3) * 2];
                        l12427379894931272439.m.getClass();
                        Q7316561721656982910 q7316561721656982910 = ((R7984749867467708788) obj2).a;
                        for (Map.Entry entry : ((C17595962009821566633) object2).entrySet()) {
                            w12822723367527402820.B(i8, i21);
                            w12822723367527402820.D(R7984749867467708788.a(q7316561721656982910, entry.getKey(), entry.getValue()));
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            U2064221978935652540.b(w12822723367527402820, (V14641450762532118893) q7316561721656982910.b, i, key);
                            i21 = 2;
                            U2064221978935652540.b(w12822723367527402820, (V14641450762532118893) q7316561721656982910.c, 2, value);
                            i = 1;
                        }
                    }
                    break;
                case 51:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.t(i8, Double.doubleToRawLongBits(((Double) P4046997492550522548.h(j, obj)).doubleValue()));
                    }
                    break;
                case 52:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.r(i8, Float.floatToRawIntBits(((Float) P4046997492550522548.h(j, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.E(i8, z(j, obj));
                    }
                    break;
                case 54:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.E(i8, z(j, obj));
                    }
                    break;
                case 55:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.v(i8, y(j, obj));
                    }
                    break;
                case 56:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.t(i8, z(j, obj));
                    }
                    break;
                case 57:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.r(i8, y(j, obj));
                    }
                    break;
                case 58:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.o(i8, ((Boolean) P4046997492550522548.h(j, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            w12822723367527402820.z(i8, (String) object3);
                        } else {
                            w12822723367527402820.p(i8, (D8243293650800641817) object3);
                        }
                    }
                    break;
                case 60:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.y(i8, (E10304945778167701561) unsafe.getObject(obj, j), l12427379894931272439.m(i6));
                    }
                    break;
                case 61:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.p(i8, (D8243293650800641817) unsafe.getObject(obj, j));
                    }
                    break;
                case 62:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.C(i8, y(j, obj));
                    }
                    break;
                case 63:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.v(i8, y(j, obj));
                    }
                    break;
                case 64:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.r(i8, y(j, obj));
                    }
                    break;
                case 65:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        w12822723367527402820.t(i8, z(j, obj));
                    }
                    break;
                case 66:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        int iY = y(j, obj);
                        w12822723367527402820.C(i8, (iY >> 31) ^ (iY << 1));
                    }
                    break;
                case 67:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        long jZ = z(j, obj);
                        w12822723367527402820.E(i8, (jZ << i) ^ (jZ >> 63));
                    }
                    break;
                case 68:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        h12843822278061842084.K(i8, unsafe.getObject(obj, j), l12427379894931272439.m(i6));
                    }
                    break;
            }
            i6 += 3;
            i4 = 1048575;
        }
        l12427379894931272439.l.getClass();
        ((T3817383632789307090) obj).unknownFields.d(h12843822278061842084);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7 A[PHI: r3
      0x00d7: PHI (r3v32 int) = (r3v10 int), (r3v33 int) binds: [B:83:0x01f0, B:41:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(dev.epro.r0.T3817383632789307090 r12) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.i(dev.epro.r0.T3817383632789307090):int");
    }

    public final boolean j(T3817383632789307090 t3817383632789307090, T3817383632789307090 t38173836327893070902, int i) {
        return n(i, t3817383632789307090) == n(i, t38173836327893070902);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (P4046997492550522548.h(J(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[E12098517352909843120.f(i, 3, 2, 1)] == null) {
            return;
        }
        Z3383101362411723454.s();
    }

    public final B8838962141159673445 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        B8838962141159673445 b8838962141159673445 = (B8838962141159673445) objArr[i2];
        if (b8838962141159673445 != null) {
            return b8838962141159673445;
        }
        B8838962141159673445 b8838962141159673445A = X8293765978123339002.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = b8838962141159673445A;
        return b8838962141159673445A;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.n(int, java.lang.Object):boolean");
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? n(i, obj) : (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return P4046997492550522548.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r10.i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.Object r8, int r9, java.lang.Object r10, dev.epro.r0.R12171924199823312678 r11, dev.epro.r0.E17564419012940707302 r12) throws dev.epro.r0.O941307146068593422, dev.epro.r0.J12068242864160501074, dev.epro.r0.Q13606351353383574666 {
        /*
            r7 = this;
            int r9 = r7.J(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            java.lang.Object r9 = dev.epro.r0.P4046997492550522548.h(r0, r8)
            dev.epro.r0.C9482087664294706787 r7 = r7.m
            if (r9 != 0) goto L1e
            r7.getClass()
            dev.epro.r0.C17595962009821566633 r9 = dev.epro.r0.C17595962009821566633.b
            dev.epro.r0.C17595962009821566633 r9 = r9.b()
            dev.epro.r0.P4046997492550522548.o(r0, r8, r9)
            goto L35
        L1e:
            r7.getClass()
            r2 = r9
            dev.epro.r0.C17595962009821566633 r2 = (dev.epro.r0.C17595962009821566633) r2
            boolean r2 = r2.a
            if (r2 != 0) goto L35
            dev.epro.r0.C17595962009821566633 r2 = dev.epro.r0.C17595962009821566633.b
            dev.epro.r0.C17595962009821566633 r2 = r2.b()
            dev.epro.r0.C9482087664294706787.a(r2, r9)
            dev.epro.r0.P4046997492550522548.o(r0, r8, r2)
            r9 = r2
        L35:
            r7.getClass()
            dev.epro.r0.C17595962009821566633 r9 = (dev.epro.r0.C17595962009821566633) r9
            dev.epro.r0.R7984749867467708788 r10 = (dev.epro.r0.R7984749867467708788) r10
            dev.epro.r0.Q7316561721656982910 r7 = r10.a
            r8 = 2
            r12.x0(r8)
            java.lang.Object r10 = r12.e
            dev.epro.r0.F3160751278268780235 r10 = (dev.epro.r0.F3160751278268780235) r10
            int r0 = r10.B()
            int r0 = r10.j(r0)
            java.lang.Object r1 = r7.d
            java.lang.String r2 = ""
            r3 = r1
        L53:
            int r4 = r12.h()     // Catch: java.lang.Throwable -> L77
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L9d
            boolean r5 = r10.c()     // Catch: java.lang.Throwable -> L77
            if (r5 == 0) goto L63
            goto L9d
        L63:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L86
            if (r4 == r8) goto L79
            boolean r4 = r12.y0()     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            if (r4 == 0) goto L71
            goto L53
        L71:
            dev.epro.r0.A9458650138667563085 r4 = new dev.epro.r0.A9458650138667563085     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            throw r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
        L77:
            r7 = move-exception
            goto La4
        L79:
            java.lang.Object r4 = r7.c     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            dev.epro.r0.V14641450762532118893 r4 = (dev.epro.r0.V14641450762532118893) r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            java.lang.Object r3 = r12.J(r4, r5, r11)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            goto L53
        L86:
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            dev.epro.r0.V14641450762532118893 r4 = (dev.epro.r0.V14641450762532118893) r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            r5 = 0
            java.lang.Object r2 = r12.J(r4, r5, r5)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.O941307146068593422 -> L90
            goto L53
        L90:
            boolean r4 = r12.y0()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L97
            goto L53
        L97:
            dev.epro.r0.A9458650138667563085 r7 = new dev.epro.r0.A9458650138667563085     // Catch: java.lang.Throwable -> L77
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L77
            throw r7     // Catch: java.lang.Throwable -> L77
        L9d:
            r9.put(r2, r3)     // Catch: java.lang.Throwable -> L77
            r10.i(r0)
            return
        La4:
            r10.i(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.r(java.lang.Object, int, java.lang.Object, dev.epro.r0.R12171924199823312678, dev.epro.r0.E17564419012940707302):void");
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = f341o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                D11988991656201568495.g(this.a[i], obj2);
                return;
            }
            B8838962141159673445 b8838962141159673445M = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    T3817383632789307090 t3817383632789307090D = b8838962141159673445M.d();
                    b8838962141159673445M.a(t3817383632789307090D, object);
                    unsafe.putObject(obj, J, t3817383632789307090D);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                T3817383632789307090 t3817383632789307090D2 = b8838962141159673445M.d();
                b8838962141159673445M.a(t3817383632789307090D2, object2);
                unsafe.putObject(obj, J, t3817383632789307090D2);
                object2 = t3817383632789307090D2;
            }
            b8838962141159673445M.a(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long J = J(i) & 1048575;
            Unsafe unsafe = f341o;
            Object object = unsafe.getObject(obj2, J);
            if (object == null) {
                D11988991656201568495.g(iArr[i], obj2);
                return;
            }
            B8838962141159673445 b8838962141159673445M = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    T3817383632789307090 t3817383632789307090D = b8838962141159673445M.d();
                    b8838962141159673445M.a(t3817383632789307090D, object);
                    unsafe.putObject(obj, J, t3817383632789307090D);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                T3817383632789307090 t3817383632789307090D2 = b8838962141159673445M.d();
                b8838962141159673445M.a(t3817383632789307090D2, object2);
                unsafe.putObject(obj, J, t3817383632789307090D2);
                object2 = t3817383632789307090D2;
            }
            b8838962141159673445M.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        B8838962141159673445 b8838962141159673445M = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return b8838962141159673445M.d();
        }
        Object object = f341o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        T3817383632789307090 t3817383632789307090D = b8838962141159673445M.d();
        if (object != null) {
            b8838962141159673445M.a(t3817383632789307090D, object);
        }
        return t3817383632789307090D;
    }

    public final Object v(int i, int i2, Object obj) {
        B8838962141159673445 b8838962141159673445M = m(i2);
        if (!q(i, i2, obj)) {
            return b8838962141159673445M.d();
        }
        Object object = f341o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        T3817383632789307090 t3817383632789307090D = b8838962141159673445M.d();
        if (object != null) {
            b8838962141159673445M.a(t3817383632789307090D, object);
        }
        return t3817383632789307090D;
    }
}
