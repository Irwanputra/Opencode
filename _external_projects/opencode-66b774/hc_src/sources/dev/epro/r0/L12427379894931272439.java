package dev.epro.r0;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class L12427379894931272439 implements B8838962141159673445 {
    public static final int[] n = new int[0];

    /* renamed from: o, reason: collision with root package name */
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
            StringBuilder g = X2485016533998461232.g("Field ", str, " for ");
            g.append(cls.getName());
            g.append(" not found. Known fields are ");
            g.append(Arrays.toString(declaredFields));
            throw new RuntimeException(g.toString());
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

    /* JADX WARN: Removed duplicated region for block: B:114:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.L12427379894931272439 w(dev.epro.r0.J12688447796732847593 r34, dev.epro.r0.L10938498148143445092 r35, dev.epro.r0.B2789568257983442151 r36, dev.epro.r0.B4833153077418241720 r37, dev.epro.r0.U12348740181602283822 r38, dev.epro.r0.C9482087664294706787 r39) {
        /*
            Method dump skipped, instructions count: 1070
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

    public final void B(Object obj, long j, E17564419012940707302 e17564419012940707302, B8838962141159673445 b8838962141159673445, R12171924199823312678 r12171924199823312678) {
        int A;
        this.k.getClass();
        D11116981298317247998 a = B2789568257983442151.a(j, obj);
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) e17564419012940707302.e;
        int i = e17564419012940707302.b;
        if ((i & 7) != 3) {
            throw A9458650138667563085.b();
        }
        do {
            T3817383632789307090 d = b8838962141159673445.d();
            e17564419012940707302.p(d, b8838962141159673445, r12171924199823312678);
            b8838962141159673445.b(d);
            ((H7410314698464292688) a).add(d);
            if (f3160751278268780235.c() || e17564419012940707302.d != 0) {
                return;
            } else {
                A = f3160751278268780235.A();
            }
        } while (A == i);
        e17564419012940707302.d = A;
    }

    public final void C(Object obj, int i, E17564419012940707302 e17564419012940707302, B8838962141159673445 b8838962141159673445, R12171924199823312678 r12171924199823312678) {
        int A;
        this.k.getClass();
        D11116981298317247998 a = B2789568257983442151.a(i & 1048575, obj);
        F3160751278268780235 f3160751278268780235 = (F3160751278268780235) e17564419012940707302.e;
        int i2 = e17564419012940707302.b;
        if ((i2 & 7) != 2) {
            throw A9458650138667563085.b();
        }
        do {
            T3817383632789307090 d = b8838962141159673445.d();
            e17564419012940707302.s(d, b8838962141159673445, r12171924199823312678);
            b8838962141159673445.b(d);
            ((H7410314698464292688) a).add(d);
            if (f3160751278268780235.c() || e17564419012940707302.d != 0) {
                return;
            } else {
                A = f3160751278268780235.A();
            }
        } while (A == i2);
        e17564419012940707302.d = A;
    }

    public final void D(int i, E17564419012940707302 e17564419012940707302, Object obj) {
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

    public final void E(int i, E17564419012940707302 e17564419012940707302, Object obj) {
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
    @Override // dev.epro.r0.B8838962141159673445
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            Q11088980322693754445.l("Mutating immutable message: ", obj);
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                K2393395423856546155.k(this.l, obj, obj2);
                return;
            }
            int J = J(i);
            long j = 1048575 & J;
            int i2 = iArr[i];
            switch (I(J)) {
                case 0:
                    if (n(i, obj2)) {
                        M2335452796812725357 m2335452796812725357 = P4046997492550522548.c;
                        obj3 = obj;
                        m2335452796812725357.g(obj3, j, m2335452796812725357.c(j, obj2));
                        G(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i, obj2)) {
                        M2335452796812725357 m23354527968127253572 = P4046997492550522548.c;
                        m23354527968127253572.h(obj, j, m23354527968127253572.d(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        P4046997492550522548.n(obj, j, P4046997492550522548.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        P4046997492550522548.n(obj, j, P4046997492550522548.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        P4046997492550522548.m(P4046997492550522548.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        P4046997492550522548.n(obj, j, P4046997492550522548.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        P4046997492550522548.m(P4046997492550522548.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        M2335452796812725357 m23354527968127253573 = P4046997492550522548.c;
                        m23354527968127253573.e(obj, j, m23354527968127253573.a(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        P4046997492550522548.o(j, obj, P4046997492550522548.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        P4046997492550522548.o(j, obj, P4046997492550522548.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        P4046997492550522548.m(P4046997492550522548.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        P4046997492550522548.m(P4046997492550522548.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        P4046997492550522548.m(P4046997492550522548.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        P4046997492550522548.n(obj, j, P4046997492550522548.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        P4046997492550522548.m(P4046997492550522548.f(j, obj2), j, obj);
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        P4046997492550522548.n(obj, j, P4046997492550522548.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
                    obj3 = obj;
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
                    this.k.getClass();
                    D11116981298317247998 d11116981298317247998 = (D11116981298317247998) P4046997492550522548.h(j, obj);
                    D11116981298317247998 d111169812983172479982 = (D11116981298317247998) P4046997492550522548.h(j, obj2);
                    int i3 = ((H7410314698464292688) d11116981298317247998).c;
                    int i4 = ((H7410314698464292688) d111169812983172479982).c;
                    if (i3 > 0 && i4 > 0) {
                        if (!((H7410314698464292688) d11116981298317247998).a) {
                            d11116981298317247998 = ((H7410314698464292688) d11116981298317247998).i(i4 + i3);
                        }
                        ((H7410314698464292688) d11116981298317247998).addAll(d111169812983172479982);
                    }
                    if (i3 > 0) {
                        d111169812983172479982 = d11116981298317247998;
                    }
                    P4046997492550522548.o(j, obj, d111169812983172479982);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = K2393395423856546155.a;
                    Object h = P4046997492550522548.h(j, obj);
                    Object h2 = P4046997492550522548.h(j, obj2);
                    this.m.getClass();
                    P4046997492550522548.o(j, obj, C9482087664294706787.a(h, h2));
                    obj3 = obj;
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
                    if (q(i2, i, obj2)) {
                        P4046997492550522548.o(j, obj, P4046997492550522548.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        P4046997492550522548.o(j, obj, P4046997492550522548.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final void b(Object obj) {
        if (p(obj)) {
            if (obj instanceof T3817383632789307090) {
                T3817383632789307090 t3817383632789307090 = (T3817383632789307090) obj;
                t3817383632789307090.k(Integer.MAX_VALUE);
                t3817383632789307090.memoizedHashCode = 0;
                t3817383632789307090.h();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int J = J(i);
                long j = 1048575 & J;
                int I = I(J);
                Unsafe unsafe = f341o;
                if (I != 9) {
                    if (I != 60 && I != 68) {
                        switch (I) {
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
                                this.k.getClass();
                                H7410314698464292688 h7410314698464292688 = (H7410314698464292688) ((D11116981298317247998) P4046997492550522548.h(j, obj));
                                if (h7410314698464292688.a) {
                                    h7410314698464292688.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((C17595962009821566633) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).b(unsafe.getObject(obj, j));
                    }
                }
                if (n(i, obj)) {
                    m(i).b(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            Q11287569198401486162 q11287569198401486162 = ((T3817383632789307090) obj).unknownFields;
            if (q11287569198401486162.e) {
                q11287569198401486162.e = false;
            }
        }
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
            int J = J(i7);
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
            if ((268435456 & J) == 0 || o(obj, i2, i, i3, i11)) {
                int I = I(J);
                if (I == 9 || I == 17) {
                    if (o(obj, i2, i, i3, i11) && !m(i2).c(P4046997492550522548.h(J & 1048575, obj))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (I != 27) {
                        if (I == 60 || I == 68) {
                            if (q(i8, i2, obj) && !m(i2).c(P4046997492550522548.h(J & 1048575, obj))) {
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (I != 49) {
                            if (I != 50) {
                                continue;
                            } else {
                                Object h = P4046997492550522548.h(J & 1048575, obj);
                                this.m.getClass();
                                C17595962009821566633 c17595962009821566633 = (C17595962009821566633) h;
                                if (c17595962009821566633.isEmpty()) {
                                    continue;
                                } else {
                                    if (((V14641450762532118893) ((R7984749867467708788) this.b[(i2 / 3) * 2]).a.c).a != Z10175809439715163211.i) {
                                        continue;
                                    } else {
                                        B8838962141159673445 b8838962141159673445 = null;
                                        for (Object obj2 : c17595962009821566633.values()) {
                                            if (b8838962141159673445 == null) {
                                                b8838962141159673445 = X8293765978123339002.c.a(obj2.getClass());
                                            }
                                            if (!b8838962141159673445.c(obj2)) {
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
                    List list = (List) P4046997492550522548.h(J & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        B8838962141159673445 m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.c(list.get(i13))) {
                            }
                        }
                    }
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

    /* JADX WARN: Removed duplicated region for block: B:60:0x082a A[Catch: all -> 0x0500, TryCatch #1 {all -> 0x0500, blocks: (B:58:0x0825, B:60:0x082a, B:61:0x082f, B:126:0x04fb, B:129:0x0503, B:130:0x051b, B:131:0x0533, B:132:0x054b, B:133:0x0563, B:134:0x057b, B:135:0x0593, B:136:0x05ab, B:137:0x05c3, B:138:0x05eb, B:139:0x060b, B:140:0x062b, B:141:0x064c, B:142:0x066d, B:143:0x0690, B:144:0x06b0, B:145:0x06c9, B:146:0x06f1, B:147:0x0702, B:148:0x0724, B:149:0x0745, B:150:0x0766, B:151:0x0786, B:152:0x07a6, B:153:0x07c5, B:154:0x07e7, B:162:0x0809), top: B:57:0x0825 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0835 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0850 A[LOOP:3: B:75:0x084e->B:76:0x0850, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x085a  */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r21, dev.epro.r0.E17564419012940707302 r22, dev.epro.r0.R12171924199823312678 r23) {
        /*
            Method dump skipped, instructions count: 2296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.e(java.lang.Object, dev.epro.r0.E17564419012940707302, dev.epro.r0.R12171924199823312678):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (dev.epro.r0.K2393395423856546155.l(dev.epro.r0.P4046997492550522548.h(r7, r12), dev.epro.r0.P4046997492550522548.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (dev.epro.r0.P4046997492550522548.g(r7, r12) == dev.epro.r0.P4046997492550522548.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (dev.epro.r0.P4046997492550522548.f(r7, r12) == dev.epro.r0.P4046997492550522548.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (dev.epro.r0.P4046997492550522548.g(r7, r12) == dev.epro.r0.P4046997492550522548.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (dev.epro.r0.P4046997492550522548.f(r7, r12) == dev.epro.r0.P4046997492550522548.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (dev.epro.r0.P4046997492550522548.f(r7, r12) == dev.epro.r0.P4046997492550522548.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (dev.epro.r0.P4046997492550522548.f(r7, r12) == dev.epro.r0.P4046997492550522548.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (dev.epro.r0.K2393395423856546155.l(dev.epro.r0.P4046997492550522548.h(r7, r12), dev.epro.r0.P4046997492550522548.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (dev.epro.r0.K2393395423856546155.l(dev.epro.r0.P4046997492550522548.h(r7, r12), dev.epro.r0.P4046997492550522548.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (dev.epro.r0.K2393395423856546155.l(dev.epro.r0.P4046997492550522548.h(r7, r12), dev.epro.r0.P4046997492550522548.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.a(r7, r12) == r5.a(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (dev.epro.r0.P4046997492550522548.f(r7, r12) == dev.epro.r0.P4046997492550522548.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (dev.epro.r0.P4046997492550522548.g(r7, r12) == dev.epro.r0.P4046997492550522548.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (dev.epro.r0.P4046997492550522548.f(r7, r12) == dev.epro.r0.P4046997492550522548.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (dev.epro.r0.P4046997492550522548.g(r7, r12) == dev.epro.r0.P4046997492550522548.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (dev.epro.r0.P4046997492550522548.g(r7, r12) == dev.epro.r0.P4046997492550522548.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.d(r7, r12)) == java.lang.Float.floatToIntBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.c(r7, r12)) == java.lang.Double.doubleToLongBits(r5.c(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (dev.epro.r0.K2393395423856546155.l(dev.epro.r0.P4046997492550522548.h(r7, r12), dev.epro.r0.P4046997492550522548.h(r7, r13)) != false) goto L105;
     */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(dev.epro.r0.T3817383632789307090 r12, dev.epro.r0.T3817383632789307090 r13) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.L12427379894931272439.f(dev.epro.r0.T3817383632789307090, dev.epro.r0.T3817383632789307090):boolean");
    }

    @Override // dev.epro.r0.B8838962141159673445
    public final int g(T3817383632789307090 t3817383632789307090) {
        int i;
        int h;
        int h2;
        int h3;
        int j;
        int h4;
        int j2;
        int h5;
        int h6;
        int h7;
        int a;
        int i2;
        int f;
        int h8;
        int a2;
        int c;
        int h9;
        int size;
        int i3;
        int h10;
        int h11;
        int size2;
        int h12;
        int i4;
        int i5;
        int h13;
        int h14;
        int j3;
        int h15;
        int j4;
        int i6;
        L12427379894931272439 l12427379894931272439 = this;
        T3817383632789307090 t38173836327893070902 = t3817383632789307090;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (true) {
            int[] iArr = l12427379894931272439.a;
            if (i7 >= iArr.length) {
                l12427379894931272439.l.getClass();
                return t38173836327893070902.unknownFields.b() + i9;
            }
            int J = l12427379894931272439.J(i7);
            int I = I(J);
            int i11 = iArr[i7];
            int i12 = iArr[i7 + 2];
            int i13 = i12 & 1048575;
            Unsafe unsafe = f341o;
            if (I <= 17) {
                if (i13 != i10) {
                    i8 = i13 == 1048575 ? 0 : unsafe.getInt(t38173836327893070902, i13);
                    i10 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            long j5 = J & 1048575;
            if (I >= U4902596580422031513.b.a) {
                byte b = U4902596580422031513.c.a;
            }
            switch (I) {
                case 0:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        h = W12822723367527402820.h(i11);
                        c = h + 8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        h2 = W12822723367527402820.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    l12427379894931272439 = this;
                    t38173836327893070902 = t3817383632789307090;
                    break;
                case 2:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        long j6 = unsafe.getLong(t38173836327893070902, j5);
                        h3 = W12822723367527402820.h(i11);
                        j = W12822723367527402820.j(j6);
                        i9 += j + h3;
                    }
                    l12427379894931272439 = this;
                    break;
                case 3:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        long j7 = unsafe.getLong(t38173836327893070902, j5);
                        h3 = W12822723367527402820.h(i11);
                        j = W12822723367527402820.j(j7);
                        i9 += j + h3;
                    }
                    l12427379894931272439 = this;
                    break;
                case 4:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        int i14 = unsafe.getInt(t38173836327893070902, j5);
                        h4 = W12822723367527402820.h(i11);
                        j2 = W12822723367527402820.j(i14);
                        f = j2 + h4;
                        i9 += f;
                    }
                    l12427379894931272439 = this;
                    break;
                case 5:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        h5 = W12822723367527402820.h(i11);
                        h6 = h5 + 8;
                        i9 += h6;
                    }
                    l12427379894931272439 = this;
                    t38173836327893070902 = t3817383632789307090;
                    break;
                case 6:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        h2 = W12822723367527402820.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    l12427379894931272439 = this;
                    t38173836327893070902 = t3817383632789307090;
                    break;
                case 7:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        h6 = W12822723367527402820.h(i11) + 1;
                        i9 += h6;
                    }
                    l12427379894931272439 = this;
                    t38173836327893070902 = t3817383632789307090;
                    break;
                case 8:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        Object object = unsafe.getObject(t38173836327893070902, j5);
                        i9 = (object instanceof D8243293650800641817 ? W12822723367527402820.f(i11, (D8243293650800641817) object) : W12822723367527402820.g((String) object) + W12822723367527402820.h(i11)) + i9;
                    }
                    l12427379894931272439 = this;
                    break;
                case 9:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        Object object2 = unsafe.getObject(t38173836327893070902, j5);
                        B8838962141159673445 m = l12427379894931272439.m(i7);
                        Class cls = K2393395423856546155.a;
                        h7 = W12822723367527402820.h(i11);
                        a = ((E10304945778167701561) object2).a(m);
                        i2 = W12822723367527402820.i(a);
                        i6 = i2 + a + h7;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        f = W12822723367527402820.f(i11, (D8243293650800641817) unsafe.getObject(t38173836327893070902, j5));
                        i9 += f;
                    }
                    l12427379894931272439 = this;
                    break;
                case 11:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        int i15 = unsafe.getInt(t38173836327893070902, j5);
                        h4 = W12822723367527402820.h(i11);
                        j2 = W12822723367527402820.i(i15);
                        f = j2 + h4;
                        i9 += f;
                    }
                    l12427379894931272439 = this;
                    break;
                case 12:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        int i16 = unsafe.getInt(t38173836327893070902, j5);
                        h4 = W12822723367527402820.h(i11);
                        j2 = W12822723367527402820.j(i16);
                        f = j2 + h4;
                        i9 += f;
                    }
                    l12427379894931272439 = this;
                    break;
                case 13:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        h2 = W12822723367527402820.h(i11);
                        h6 = h2 + 4;
                        i9 += h6;
                    }
                    l12427379894931272439 = this;
                    t38173836327893070902 = t3817383632789307090;
                    break;
                case 14:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        h5 = W12822723367527402820.h(i11);
                        h6 = h5 + 8;
                        i9 += h6;
                    }
                    l12427379894931272439 = this;
                    t38173836327893070902 = t3817383632789307090;
                    break;
                case 15:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        int i17 = unsafe.getInt(t38173836327893070902, j5);
                        h4 = W12822723367527402820.h(i11);
                        j2 = W12822723367527402820.i((i17 >> 31) ^ (i17 << 1));
                        f = j2 + h4;
                        i9 += f;
                    }
                    l12427379894931272439 = this;
                    break;
                case 16:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        long j8 = unsafe.getLong(t38173836327893070902, j5);
                        h3 = W12822723367527402820.h(i11);
                        j = W12822723367527402820.j((j8 << 1) ^ (j8 >> 63));
                        i9 += j + h3;
                    }
                    l12427379894931272439 = this;
                    break;
                case 17:
                    if (l12427379894931272439.o(t38173836327893070902, i7, i10, i8, i)) {
                        E10304945778167701561 e10304945778167701561 = (E10304945778167701561) unsafe.getObject(t38173836327893070902, j5);
                        B8838962141159673445 m2 = l12427379894931272439.m(i7);
                        h8 = W12822723367527402820.h(i11) * 2;
                        a2 = e10304945778167701561.a(m2);
                        c = a2 + h8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c = K2393395423856546155.c(i11, (List) unsafe.getObject(t38173836327893070902, j5));
                    i9 += c;
                    break;
                case 19:
                    c = K2393395423856546155.b(i11, (List) unsafe.getObject(t38173836327893070902, j5));
                    i9 += c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls2 = K2393395423856546155.a;
                    if (list.size() != 0) {
                        h9 = (W12822723367527402820.h(i11) * list.size()) + K2393395423856546155.e(list);
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 21:
                    List list2 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls3 = K2393395423856546155.a;
                    size = list2.size();
                    if (size != 0) {
                        i3 = K2393395423856546155.i(list2);
                        h10 = W12822723367527402820.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 22:
                    List list3 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls4 = K2393395423856546155.a;
                    size = list3.size();
                    if (size != 0) {
                        i3 = K2393395423856546155.d(list3);
                        h10 = W12822723367527402820.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 23:
                    c = K2393395423856546155.c(i11, (List) unsafe.getObject(t38173836327893070902, j5));
                    i9 += c;
                    break;
                case 24:
                    c = K2393395423856546155.b(i11, (List) unsafe.getObject(t38173836327893070902, j5));
                    i9 += c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls5 = K2393395423856546155.a;
                    int size3 = list4.size();
                    i9 += size3 == 0 ? 0 : (W12822723367527402820.h(i11) + 1) * size3;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls6 = K2393395423856546155.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        h9 = W12822723367527402820.h(i11) * size4;
                        for (int i18 = 0; i18 < size4; i18++) {
                            Object obj = list5.get(i18);
                            if (obj instanceof D8243293650800641817) {
                                int size5 = ((D8243293650800641817) obj).size();
                                h9 = W12822723367527402820.i(size5) + size5 + h9;
                            } else {
                                h9 = W12822723367527402820.g((String) obj) + h9;
                            }
                        }
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 27:
                    List list6 = (List) unsafe.getObject(t38173836327893070902, j5);
                    B8838962141159673445 m3 = l12427379894931272439.m(i7);
                    Class cls7 = K2393395423856546155.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        h11 = 0;
                    } else {
                        h11 = W12822723367527402820.h(i11) * size6;
                        for (int i19 = 0; i19 < size6; i19++) {
                            int a3 = ((E10304945778167701561) list6.get(i19)).a(m3);
                            h11 += W12822723367527402820.i(a3) + a3;
                        }
                    }
                    i9 += h11;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls8 = K2393395423856546155.a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        h9 = W12822723367527402820.h(i11) * size7;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int size8 = ((D8243293650800641817) list7.get(i20)).size();
                            h9 += W12822723367527402820.i(size8) + size8;
                        }
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 29:
                    List list8 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls9 = K2393395423856546155.a;
                    size = list8.size();
                    if (size != 0) {
                        i3 = K2393395423856546155.h(list8);
                        h10 = W12822723367527402820.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 30:
                    List list9 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls10 = K2393395423856546155.a;
                    size = list9.size();
                    if (size != 0) {
                        i3 = K2393395423856546155.a(list9);
                        h10 = W12822723367527402820.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 31:
                    c = K2393395423856546155.b(i11, (List) unsafe.getObject(t38173836327893070902, j5));
                    i9 += c;
                    break;
                case 32:
                    c = K2393395423856546155.c(i11, (List) unsafe.getObject(t38173836327893070902, j5));
                    i9 += c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls11 = K2393395423856546155.a;
                    size = list10.size();
                    if (size != 0) {
                        i3 = K2393395423856546155.f(list10);
                        h10 = W12822723367527402820.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 34:
                    List list11 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls12 = K2393395423856546155.a;
                    size = list11.size();
                    if (size != 0) {
                        i3 = K2393395423856546155.g(list11);
                        h10 = W12822723367527402820.h(i11);
                        h9 = (h10 * size) + i3;
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 35:
                    List list12 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls13 = K2393395423856546155.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls14 = K2393395423856546155.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = K2393395423856546155.e((List) unsafe.getObject(t38173836327893070902, j5));
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = K2393395423856546155.i((List) unsafe.getObject(t38173836327893070902, j5));
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = K2393395423856546155.d((List) unsafe.getObject(t38173836327893070902, j5));
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls15 = K2393395423856546155.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls16 = K2393395423856546155.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls17 = K2393395423856546155.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = K2393395423856546155.h((List) unsafe.getObject(t38173836327893070902, j5));
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = K2393395423856546155.a((List) unsafe.getObject(t38173836327893070902, j5));
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls18 = K2393395423856546155.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(t38173836327893070902, j5);
                    Class cls19 = K2393395423856546155.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = K2393395423856546155.f((List) unsafe.getObject(t38173836327893070902, j5));
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = K2393395423856546155.g((List) unsafe.getObject(t38173836327893070902, j5));
                    if (size2 > 0) {
                        h12 = W12822723367527402820.h(i11);
                        i4 = W12822723367527402820.i(size2);
                        i9 += i4 + h12 + size2;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(t38173836327893070902, j5);
                    B8838962141159673445 m4 = l12427379894931272439.m(i7);
                    Class cls20 = K2393395423856546155.a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i21 = 0; i21 < size9; i21++) {
                            i5 += ((E10304945778167701561) list19.get(i21)).a(m4) + (W12822723367527402820.h(i11) * 2);
                        }
                    }
                    i9 += i5;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(t38173836327893070902, j5);
                    Object obj2 = l12427379894931272439.b[(i7 / 3) * 2];
                    l12427379894931272439.m.getClass();
                    C17595962009821566633 c17595962009821566633 = (C17595962009821566633) object3;
                    R7984749867467708788 r7984749867467708788 = (R7984749867467708788) obj2;
                    if (!c17595962009821566633.isEmpty()) {
                        h9 = 0;
                        for (Map.Entry entry : c17595962009821566633.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            r7984749867467708788.getClass();
                            int h16 = W12822723367527402820.h(i11);
                            int a4 = R7984749867467708788.a(r7984749867467708788.a, key, value);
                            h9 += W12822723367527402820.i(a4) + a4 + h16;
                        }
                        i9 += h9;
                        break;
                    }
                    h9 = 0;
                    i9 += h9;
                case 51:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        h = W12822723367527402820.h(i11);
                        c = h + 8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        h13 = W12822723367527402820.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        long z = z(j5, t38173836327893070902);
                        h14 = W12822723367527402820.h(i11);
                        j3 = W12822723367527402820.j(z);
                        i6 = j3 + h14;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        long z2 = z(j5, t38173836327893070902);
                        h14 = W12822723367527402820.h(i11);
                        j3 = W12822723367527402820.j(z2);
                        i6 = j3 + h14;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        int y = y(j5, t38173836327893070902);
                        h15 = W12822723367527402820.h(i11);
                        j4 = W12822723367527402820.j(y);
                        c = j4 + h15;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        h = W12822723367527402820.h(i11);
                        c = h + 8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        h13 = W12822723367527402820.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        c = W12822723367527402820.h(i11) + 1;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        Object object4 = unsafe.getObject(t38173836327893070902, j5);
                        i9 = (object4 instanceof D8243293650800641817 ? W12822723367527402820.f(i11, (D8243293650800641817) object4) : W12822723367527402820.g((String) object4) + W12822723367527402820.h(i11)) + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        Object object5 = unsafe.getObject(t38173836327893070902, j5);
                        B8838962141159673445 m5 = l12427379894931272439.m(i7);
                        Class cls21 = K2393395423856546155.a;
                        h7 = W12822723367527402820.h(i11);
                        a = ((E10304945778167701561) object5).a(m5);
                        i2 = W12822723367527402820.i(a);
                        i6 = i2 + a + h7;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        c = W12822723367527402820.f(i11, (D8243293650800641817) unsafe.getObject(t38173836327893070902, j5));
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        int y2 = y(j5, t38173836327893070902);
                        h15 = W12822723367527402820.h(i11);
                        j4 = W12822723367527402820.i(y2);
                        c = j4 + h15;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        int y3 = y(j5, t38173836327893070902);
                        h15 = W12822723367527402820.h(i11);
                        j4 = W12822723367527402820.j(y3);
                        c = j4 + h15;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        h13 = W12822723367527402820.h(i11);
                        c = h13 + 4;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        h = W12822723367527402820.h(i11);
                        c = h + 8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        int y4 = y(j5, t38173836327893070902);
                        h15 = W12822723367527402820.h(i11);
                        j4 = W12822723367527402820.i((y4 >> 31) ^ (y4 << 1));
                        c = j4 + h15;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        long z3 = z(j5, t38173836327893070902);
                        h14 = W12822723367527402820.h(i11);
                        j3 = W12822723367527402820.j((z3 << 1) ^ (z3 >> 63));
                        i6 = j3 + h14;
                        i9 += i6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (l12427379894931272439.q(i11, i7, t38173836327893070902)) {
                        E10304945778167701561 e103049457781677015612 = (E10304945778167701561) unsafe.getObject(t38173836327893070902, j5);
                        B8838962141159673445 m6 = l12427379894931272439.m(i7);
                        h8 = W12822723367527402820.h(i11) * 2;
                        a2 = e103049457781677015612.a(m6);
                        c = a2 + h8;
                        i9 += c;
                        break;
                    } else {
                        break;
                    }
            }
            i7 += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // dev.epro.r0.B8838962141159673445
    public final void h(Object obj, H12843822278061842084 h12843822278061842084) {
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
            int J = l12427379894931272439.J(i6);
            int i8 = iArr[i6];
            int I = I(J);
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
                i2 = J;
                i3 = i11;
            } else {
                i = 1;
                i2 = J;
                i3 = 0;
            }
            long j = i2 & i4;
            switch (I) {
                case 0:
                    if (l12427379894931272439.o(obj, i6, i5, i7, i3)) {
                        w12822723367527402820.t(i8, Double.doubleToRawLongBits(P4046997492550522548.c.c(j, obj)));
                        break;
                    } else {
                        break;
                    }
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
                        break;
                    } else {
                        break;
                    }
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
                        break;
                    } else {
                        break;
                    }
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
                    B8838962141159673445 m = l12427379894931272439.m(i6);
                    Class cls2 = K2393395423856546155.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            w12822723367527402820.y(i15, (E10304945778167701561) list2.get(i16), m);
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
                    K2393395423856546155.n(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 36:
                    K2393395423856546155.r(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 37:
                    K2393395423856546155.t(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 38:
                    K2393395423856546155.z(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 39:
                    K2393395423856546155.s(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 40:
                    K2393395423856546155.q(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 41:
                    K2393395423856546155.p(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 42:
                    K2393395423856546155.m(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 43:
                    K2393395423856546155.y(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 44:
                    K2393395423856546155.o(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 45:
                    K2393395423856546155.u(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 46:
                    K2393395423856546155.v(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 47:
                    K2393395423856546155.w(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, i == true ? 1 : 0);
                    break;
                case 48:
                    K2393395423856546155.x(iArr[i6], (List) unsafe.getObject(obj, j), h12843822278061842084, true);
                    break;
                case 49:
                    int i19 = iArr[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    B8838962141159673445 m2 = l12427379894931272439.m(i6);
                    Class cls4 = K2393395423856546155.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            h12843822278061842084.K(i19, list4.get(i20), m2);
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
                        int y = y(j, obj);
                        w12822723367527402820.C(i8, (y >> 31) ^ (y << 1));
                    }
                    break;
                case 67:
                    if (l12427379894931272439.q(i8, i6, obj)) {
                        long z2 = z(j, obj);
                        w12822723367527402820.E(i8, (z2 << (i == true ? 1L : 0L)) ^ (z2 >> 63));
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

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f0, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d8, code lost:
    
        r3 = r8 + r3;
     */
    @Override // dev.epro.r0.B8838962141159673445
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(dev.epro.r0.T3817383632789307090 r12) {
        /*
            Method dump skipped, instructions count: 746
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
        B8838962141159673445 a = X8293765978123339002.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 282
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

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a0, code lost:
    
        r10.i(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a3, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.lang.Object r8, int r9, java.lang.Object r10, dev.epro.r0.R12171924199823312678 r11, dev.epro.r0.E17564419012940707302 r12) {
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
            B8838962141159673445 m = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    T3817383632789307090 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, J, d);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                T3817383632789307090 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            m.a(object2, object);
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
            B8838962141159673445 m = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    T3817383632789307090 d = m.d();
                    m.a(d, object);
                    unsafe.putObject(obj, J, d);
                } else {
                    unsafe.putObject(obj, J, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, J);
            if (!p(object2)) {
                T3817383632789307090 d2 = m.d();
                m.a(d2, object2);
                unsafe.putObject(obj, J, d2);
                object2 = d2;
            }
            m.a(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        B8838962141159673445 m = m(i);
        long J = J(i) & 1048575;
        if (!n(i, obj)) {
            return m.d();
        }
        Object object = f341o.getObject(obj, J);
        if (p(object)) {
            return object;
        }
        T3817383632789307090 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }

    public final Object v(int i, int i2, Object obj) {
        B8838962141159673445 m = m(i2);
        if (!q(i, i2, obj)) {
            return m.d();
        }
        Object object = f341o.getObject(obj, J(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        T3817383632789307090 d = m.d();
        if (object != null) {
            m.a(d, object);
        }
        return d;
    }
}
