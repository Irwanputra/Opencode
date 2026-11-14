package dev.epro.r0;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class O6762602046924520025 implements Y3341182438442346389 {
    public static final int[] n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f415o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final E890218321994133736 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final J11813598540494406709 j;
    public final J8782244783781293484 k;
    public final R1604357493379982192 l;
    public final H16705941102157523559 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new F2522870689781627311((byte) 1));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f415o = unsafe;
    }

    public O6762602046924520025(int[] iArr, Object[] objArr, int i, int i2, E890218321994133736 e890218321994133736, int[] iArr2, int i3, int i4, J11813598540494406709 j11813598540494406709, J8782244783781293484 j8782244783781293484, R1604357493379982192 r1604357493379982192, N11883436969612056524 n11883436969612056524, H16705941102157523559 h16705941102157523559) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = e890218321994133736 instanceof Z14368087615735085238;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = j11813598540494406709;
        this.k = j8782244783781293484;
        this.l = r1604357493379982192;
        this.e = e890218321994133736;
        this.m = h16705941102157523559;
    }

    public static long A(int i) {
        return i & 1048575;
    }

    public static int B(long j, Object obj) {
        return ((Integer) Z3287610729711297369.j(j, obj)).intValue();
    }

    public static long C(long j, Object obj) {
        return ((Long) Z3287610729711297369.j(j, obj)).longValue();
    }

    public static Field I(Class cls, String str) {
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

    public static int O(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void l(Object obj) {
        if (s(obj)) {
            return;
        }
        S10973172697741180971.j("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static boolean s(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Z14368087615735085238) {
            return ((Z14368087615735085238) obj).o();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static dev.epro.r0.O6762602046924520025 z(dev.epro.r0.J14415172299974100388 r34, dev.epro.r0.J11813598540494406709 r35, dev.epro.r0.J8782244783781293484 r36, dev.epro.r0.R1604357493379982192 r37, dev.epro.r0.N11883436969612056524 r38, dev.epro.r0.H16705941102157523559 r39) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O6762602046924520025.z(dev.epro.r0.J14415172299974100388, dev.epro.r0.J11813598540494406709, dev.epro.r0.J8782244783781293484, dev.epro.r0.R1604357493379982192, dev.epro.r0.N11883436969612056524, dev.epro.r0.H16705941102157523559):dev.epro.r0.O6762602046924520025");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int D(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, dev.epro.r0.D15735805680132151670 r37) {
        /*
            Method dump skipped, instructions count: 3392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O6762602046924520025.D(java.lang.Object, byte[], int, int, int, dev.epro.r0.D15735805680132151670):int");
    }

    public final void E(Object obj, long j, E17564419012940707302 e17564419012940707302, Y3341182438442346389 y3341182438442346389, R4931231174251890987 r4931231174251890987) {
        int l;
        this.k.getClass();
        A10696933611341011168 a = J8782244783781293484.a(j, obj);
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) e17564419012940707302.e;
        int i = e17564419012940707302.b;
        if ((i & 7) != 3) {
            throw N11355818201711573941.b();
        }
        do {
            Object d = y3341182438442346389.d();
            e17564419012940707302.n(d, y3341182438442346389, r4931231174251890987);
            y3341182438442346389.b(d);
            a.add(d);
            if (h17306840337920354701.d() || e17564419012940707302.d != 0) {
                return;
            } else {
                l = h17306840337920354701.l();
            }
        } while (l == i);
        e17564419012940707302.d = l;
    }

    public final void F(Object obj, int i, E17564419012940707302 e17564419012940707302, Y3341182438442346389 y3341182438442346389, R4931231174251890987 r4931231174251890987) {
        int l;
        this.k.getClass();
        A10696933611341011168 a = J8782244783781293484.a(i & 1048575, obj);
        H17306840337920354701 h17306840337920354701 = (H17306840337920354701) e17564419012940707302.e;
        int i2 = e17564419012940707302.b;
        if ((i2 & 7) != 2) {
            throw N11355818201711573941.b();
        }
        do {
            Object d = y3341182438442346389.d();
            e17564419012940707302.q(d, y3341182438442346389, r4931231174251890987);
            y3341182438442346389.b(d);
            a.add(d);
            if (h17306840337920354701.d() || e17564419012940707302.d != 0) {
                return;
            } else {
                l = h17306840337920354701.l();
            }
        } while (l == i2);
        e17564419012940707302.d = l;
    }

    public final void G(int i, E17564419012940707302 e17564419012940707302, Object obj) {
        if ((536870912 & i) != 0) {
            Z3287610729711297369.q(i & 1048575, obj, e17564419012940707302.p0());
        } else if (this.f) {
            Z3287610729711297369.q(i & 1048575, obj, e17564419012940707302.l0());
        } else {
            Z3287610729711297369.q(i & 1048575, obj, e17564419012940707302.w());
        }
    }

    public final void H(int i, E17564419012940707302 e17564419012940707302, Object obj) {
        boolean z = (536870912 & i) != 0;
        J8782244783781293484 j8782244783781293484 = this.k;
        if (z) {
            j8782244783781293484.getClass();
            e17564419012940707302.m0(J8782244783781293484.a(i & 1048575, obj), true);
        } else {
            j8782244783781293484.getClass();
            e17564419012940707302.m0(J8782244783781293484.a(i & 1048575, obj), false);
        }
    }

    public final void J(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        Z3287610729711297369.o((1 << (i2 >>> 20)) | Z3287610729711297369.h(j, obj), j, obj);
    }

    public final void K(int i, int i2, Object obj) {
        Z3287610729711297369.o(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int L(int i, int i2) {
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

    public final void M(int i, Object obj, Object obj2) {
        f415o.putObject(obj, P(i) & 1048575, obj2);
        J(i, obj);
    }

    public final void N(int i, int i2, Object obj, Object obj2) {
        f415o.putObject(obj, P(i2) & 1048575, obj2);
        K(i, i2, obj);
    }

    public final int P(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // dev.epro.r0.Y3341182438442346389
    public final void a(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                W3646014350333091735.k(this.l, obj, obj2);
                return;
            }
            int P = P(i);
            long j = 1048575 & P;
            int i2 = iArr[i];
            switch (O(P)) {
                case 0:
                    if (q(i, obj2)) {
                        M2335452796812725357 m2335452796812725357 = Z3287610729711297369.c;
                        obj3 = obj;
                        m2335452796812725357.g(obj3, j, m2335452796812725357.c(j, obj2));
                        J(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (q(i, obj2)) {
                        M2335452796812725357 m23354527968127253572 = Z3287610729711297369.c;
                        m23354527968127253572.h(obj, j, m23354527968127253572.d(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (q(i, obj2)) {
                        Z3287610729711297369.p(obj, j, Z3287610729711297369.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (q(i, obj2)) {
                        Z3287610729711297369.p(obj, j, Z3287610729711297369.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (q(i, obj2)) {
                        Z3287610729711297369.o(Z3287610729711297369.h(j, obj2), j, obj);
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (q(i, obj2)) {
                        Z3287610729711297369.p(obj, j, Z3287610729711297369.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (q(i, obj2)) {
                        Z3287610729711297369.o(Z3287610729711297369.h(j, obj2), j, obj);
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (q(i, obj2)) {
                        M2335452796812725357 m23354527968127253573 = Z3287610729711297369.c;
                        m23354527968127253573.e(obj, j, m23354527968127253573.a(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (q(i, obj2)) {
                        Z3287610729711297369.q(j, obj, Z3287610729711297369.j(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    v(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (q(i, obj2)) {
                        Z3287610729711297369.q(j, obj, Z3287610729711297369.j(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (q(i, obj2)) {
                        Z3287610729711297369.o(Z3287610729711297369.h(j, obj2), j, obj);
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (q(i, obj2)) {
                        Z3287610729711297369.o(Z3287610729711297369.h(j, obj2), j, obj);
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (q(i, obj2)) {
                        Z3287610729711297369.o(Z3287610729711297369.h(j, obj2), j, obj);
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (q(i, obj2)) {
                        Z3287610729711297369.p(obj, j, Z3287610729711297369.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (q(i, obj2)) {
                        Z3287610729711297369.o(Z3287610729711297369.h(j, obj2), j, obj);
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (q(i, obj2)) {
                        Z3287610729711297369.p(obj, j, Z3287610729711297369.i(j, obj2));
                        J(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    v(i, obj, obj2);
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
                    A10696933611341011168 a10696933611341011168 = (A10696933611341011168) Z3287610729711297369.j(j, obj);
                    A10696933611341011168 a106969336113410111682 = (A10696933611341011168) Z3287610729711297369.j(j, obj2);
                    int size = a10696933611341011168.size();
                    int size2 = a106969336113410111682.size();
                    if (size > 0 && size2 > 0) {
                        if (!((F4350745041554760175) a10696933611341011168).a) {
                            a10696933611341011168 = a10696933611341011168.h(size2 + size);
                        }
                        a10696933611341011168.addAll(a106969336113410111682);
                    }
                    if (size > 0) {
                        a106969336113410111682 = a10696933611341011168;
                    }
                    Z3287610729711297369.q(j, obj, a106969336113410111682);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = W3646014350333091735.a;
                    Object j2 = Z3287610729711297369.j(j, obj);
                    Object j3 = Z3287610729711297369.j(j, obj2);
                    this.m.getClass();
                    Z3287610729711297369.q(j, obj, H16705941102157523559.a(j2, j3));
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
                    if (t(i2, i, obj2)) {
                        Z3287610729711297369.q(j, obj, Z3287610729711297369.j(j, obj2));
                        K(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (t(i2, i, obj2)) {
                        Z3287610729711297369.q(j, obj, Z3287610729711297369.j(j, obj2));
                        K(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    w(i, obj, obj2);
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

    @Override // dev.epro.r0.Y3341182438442346389
    public final void b(Object obj) {
        if (s(obj)) {
            if (obj instanceof Z14368087615735085238) {
                Z14368087615735085238 z14368087615735085238 = (Z14368087615735085238) obj;
                z14368087615735085238.v(Integer.MAX_VALUE);
                z14368087615735085238.memoizedHashCode = 0;
                z14368087615735085238.p();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int P = P(i);
                long j = 1048575 & P;
                int O = O(P);
                Unsafe unsafe = f415o;
                if (O != 9) {
                    if (O != 60 && O != 68) {
                        switch (O) {
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
                                F4350745041554760175 f4350745041554760175 = (F4350745041554760175) ((A10696933611341011168) Z3287610729711297369.j(j, obj));
                                if (f4350745041554760175.a) {
                                    f4350745041554760175.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((F2939356130442922449) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (t(iArr[i], i, obj)) {
                        p(i).b(unsafe.getObject(obj, j));
                    }
                }
                if (q(i, obj)) {
                    p(i).b(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            C10101319439186475078 c10101319439186475078 = ((Z14368087615735085238) obj).unknownFields;
            if (c10101319439186475078.e) {
                c10101319439186475078.e = false;
            }
        }
    }

    @Override // dev.epro.r0.Y3341182438442346389
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
            int P = P(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = f415o.getInt(obj, i10);
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
            if ((268435456 & P) == 0 || r(obj, i2, i, i3, i11)) {
                int O = O(P);
                if (O == 9 || O == 17) {
                    if (r(obj, i2, i, i3, i11) && !p(i2).c(Z3287610729711297369.j(P & 1048575, obj))) {
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (O != 27) {
                        if (O == 60 || O == 68) {
                            if (t(i8, i2, obj) && !p(i2).c(Z3287610729711297369.j(P & 1048575, obj))) {
                            }
                        } else if (O != 49) {
                            if (O != 50) {
                                continue;
                            } else {
                                Object j = Z3287610729711297369.j(P & 1048575, obj);
                                this.m.getClass();
                                if (!((F2939356130442922449) j).isEmpty()) {
                                    L11610354117192841236.y(o(i2));
                                    throw null;
                                }
                            }
                        }
                        i6++;
                        i4 = i;
                        i5 = i3;
                    }
                    List list = (List) Z3287610729711297369.j(P & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        Y3341182438442346389 p = p(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (p.c(list.get(i13))) {
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

    @Override // dev.epro.r0.Y3341182438442346389
    public final Object d() {
        this.j.getClass();
        return ((Z14368087615735085238) this.e).r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (dev.epro.r0.W3646014350333091735.l(dev.epro.r0.Z3287610729711297369.j(r7, r12), dev.epro.r0.Z3287610729711297369.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.i(r7, r12) == dev.epro.r0.Z3287610729711297369.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.h(r7, r12) == dev.epro.r0.Z3287610729711297369.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.i(r7, r12) == dev.epro.r0.Z3287610729711297369.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.h(r7, r12) == dev.epro.r0.Z3287610729711297369.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.h(r7, r12) == dev.epro.r0.Z3287610729711297369.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.h(r7, r12) == dev.epro.r0.Z3287610729711297369.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (dev.epro.r0.W3646014350333091735.l(dev.epro.r0.Z3287610729711297369.j(r7, r12), dev.epro.r0.Z3287610729711297369.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (dev.epro.r0.W3646014350333091735.l(dev.epro.r0.Z3287610729711297369.j(r7, r12), dev.epro.r0.Z3287610729711297369.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (dev.epro.r0.W3646014350333091735.l(dev.epro.r0.Z3287610729711297369.j(r7, r12), dev.epro.r0.Z3287610729711297369.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.a(r7, r12) == r5.a(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.h(r7, r12) == dev.epro.r0.Z3287610729711297369.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.i(r7, r12) == dev.epro.r0.Z3287610729711297369.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.h(r7, r12) == dev.epro.r0.Z3287610729711297369.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.i(r7, r12) == dev.epro.r0.Z3287610729711297369.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (dev.epro.r0.Z3287610729711297369.i(r7, r12) == dev.epro.r0.Z3287610729711297369.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.d(r7, r12)) == java.lang.Float.floatToIntBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.c(r7, r12)) == java.lang.Double.doubleToLongBits(r5.c(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (dev.epro.r0.W3646014350333091735.l(dev.epro.r0.Z3287610729711297369.j(r7, r12), dev.epro.r0.Z3287610729711297369.j(r7, r13)) != false) goto L105;
     */
    @Override // dev.epro.r0.Y3341182438442346389
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(dev.epro.r0.Z14368087615735085238 r12, dev.epro.r0.Z14368087615735085238 r13) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O6762602046924520025.e(dev.epro.r0.Z14368087615735085238, dev.epro.r0.Z14368087615735085238):boolean");
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
    @Override // dev.epro.r0.Y3341182438442346389
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(dev.epro.r0.Z14368087615735085238 r12) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O6762602046924520025.f(dev.epro.r0.Z14368087615735085238):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0736 A[Catch: all -> 0x0473, TryCatch #9 {all -> 0x0473, blocks: (B:37:0x0731, B:39:0x0736, B:40:0x073b, B:138:0x046e, B:141:0x0476, B:142:0x048b, B:143:0x04a0, B:144:0x04b5, B:145:0x04ca, B:146:0x04df, B:147:0x04f4, B:148:0x0509, B:149:0x051e, B:150:0x0538, B:151:0x0558, B:152:0x0579, B:153:0x0596, B:154:0x05b3, B:155:0x05d3, B:156:0x05f0, B:157:0x0605, B:158:0x0620, B:159:0x062d, B:160:0x064c, B:161:0x0669, B:162:0x0686, B:163:0x06a3, B:164:0x06c0, B:165:0x06dd, B:166:0x06ff, B:171:0x0721), top: B:36:0x0731 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0742 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x075f A[LOOP:3: B:53:0x075d->B:54:0x075f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0769  */
    @Override // dev.epro.r0.Y3341182438442346389
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r21, dev.epro.r0.E17564419012940707302 r22, dev.epro.r0.R4931231174251890987 r23) {
        /*
            Method dump skipped, instructions count: 2048
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O6762602046924520025.g(java.lang.Object, dev.epro.r0.E17564419012940707302, dev.epro.r0.R4931231174251890987):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [long] */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // dev.epro.r0.Y3341182438442346389
    public final void h(Object obj, H12843822278061842084 h12843822278061842084) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        O6762602046924520025 o6762602046924520025 = this;
        A5011514514014580540 a5011514514014580540 = (A5011514514014580540) h12843822278061842084.b;
        int[] iArr = o6762602046924520025.a;
        int length = iArr.length;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int P = o6762602046924520025.P(i5);
            int i7 = iArr[i5];
            int O = O(P);
            Unsafe unsafe = f415o;
            if (O <= 17) {
                int i8 = iArr[i5 + 2];
                z = 1;
                int i9 = i8 & i3;
                if (i9 != i4) {
                    i6 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i4 = i9;
                }
                int i10 = 1 << (i8 >>> 20);
                i = P;
                i2 = i10;
            } else {
                z = 1;
                i = P;
                i2 = 0;
            }
            long j = i & i3;
            switch (O) {
                case 0:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.n(i7, Double.doubleToRawLongBits(Z3287610729711297369.c.c(j, obj)));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 1:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.l(i7, Float.floatToRawIntBits(Z3287610729711297369.c.d(j, obj)));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 2:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.w(i7, unsafe.getLong(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 3:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.w(i7, unsafe.getLong(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 4:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.p(i7, unsafe.getInt(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 5:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.n(i7, unsafe.getLong(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 6:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.l(i7, unsafe.getInt(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 7:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.j(i7, Z3287610729711297369.c.a(j, obj));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 8:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            a5011514514014580540.s(i7, (String) object);
                        } else {
                            a5011514514014580540.k(i7, (N17666688112968464504) object);
                        }
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 9:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        h12843822278061842084.L(i7, unsafe.getObject(obj, j), o6762602046924520025.p(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 10:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.k(i7, (N17666688112968464504) unsafe.getObject(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 11:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.u(i7, unsafe.getInt(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 12:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.p(i7, unsafe.getInt(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 13:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.l(i7, unsafe.getInt(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 14:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        a5011514514014580540.n(i7, unsafe.getLong(obj, j));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 15:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        int i11 = unsafe.getInt(obj, j);
                        a5011514514014580540.u(i7, (i11 >> 31) ^ (i11 << 1));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 16:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        long j2 = unsafe.getLong(obj, j);
                        a5011514514014580540.w(i7, (j2 >> 63) ^ (j2 << 1));
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                    i3 = 1048575;
                case 17:
                    if (o6762602046924520025.r(obj, i5, i4, i6, i2)) {
                        Object object2 = unsafe.getObject(obj, j);
                        a5011514514014580540.t(i7, 3);
                        o6762602046924520025.p(i5).h((E890218321994133736) object2, h12843822278061842084);
                        a5011514514014580540.t(i7, 4);
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 18:
                    W3646014350333091735.n(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 19:
                    W3646014350333091735.r(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 20:
                    W3646014350333091735.t(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 21:
                    W3646014350333091735.z(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 22:
                    W3646014350333091735.s(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 23:
                    W3646014350333091735.q(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 24:
                    W3646014350333091735.p(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 25:
                    W3646014350333091735.m(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 26:
                    int i12 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j);
                    Class cls = W3646014350333091735.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            a5011514514014580540.s(i12, (String) list.get(i13));
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    int i14 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j);
                    Y3341182438442346389 p = o6762602046924520025.p(i5);
                    Class cls2 = W3646014350333091735.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            h12843822278061842084.L(i14, list2.get(i15), p);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    int i16 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j);
                    Class cls3 = W3646014350333091735.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            a5011514514014580540.k(i16, (N17666688112968464504) list3.get(i17));
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    z2 = false;
                    W3646014350333091735.y(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 30:
                    z2 = false;
                    W3646014350333091735.o(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 31:
                    z2 = false;
                    W3646014350333091735.u(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 32:
                    z2 = false;
                    W3646014350333091735.v(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 33:
                    z2 = false;
                    W3646014350333091735.w(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 34:
                    z2 = false;
                    W3646014350333091735.x(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, false);
                    i5 += 3;
                    i3 = 1048575;
                case 35:
                    W3646014350333091735.n(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 36:
                    W3646014350333091735.r(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 37:
                    W3646014350333091735.t(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 38:
                    W3646014350333091735.z(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 39:
                    W3646014350333091735.s(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 40:
                    W3646014350333091735.q(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 41:
                    W3646014350333091735.p(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 42:
                    W3646014350333091735.m(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 43:
                    W3646014350333091735.y(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 44:
                    W3646014350333091735.o(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 45:
                    W3646014350333091735.u(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 46:
                    W3646014350333091735.v(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 47:
                    W3646014350333091735.w(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 48:
                    W3646014350333091735.x(iArr[i5], (List) unsafe.getObject(obj, j), h12843822278061842084, z);
                    i5 += 3;
                    i3 = 1048575;
                case 49:
                    int i18 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j);
                    Y3341182438442346389 p2 = o6762602046924520025.p(i5);
                    Class cls4 = W3646014350333091735.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            E890218321994133736 e890218321994133736 = (E890218321994133736) list4.get(i19);
                            a5011514514014580540.t(i18, 3);
                            p2.h(e890218321994133736, h12843822278061842084);
                            a5011514514014580540.t(i18, 4);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        Object o2 = o6762602046924520025.o(i5);
                        o6762602046924520025.m.getClass();
                        L11610354117192841236.y(o2);
                        throw null;
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 51:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.n(i7, Double.doubleToRawLongBits(((Double) Z3287610729711297369.j(j, obj)).doubleValue()));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 52:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.l(i7, Float.floatToRawIntBits(((Float) Z3287610729711297369.j(j, obj)).floatValue()));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 53:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.w(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 54:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.w(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 55:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.p(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 56:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.n(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 57:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.l(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 58:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.j(i7, ((Boolean) Z3287610729711297369.j(j, obj)).booleanValue());
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 59:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            a5011514514014580540.s(i7, (String) object3);
                        } else {
                            a5011514514014580540.k(i7, (N17666688112968464504) object3);
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 60:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        h12843822278061842084.L(i7, unsafe.getObject(obj, j), o6762602046924520025.p(i5));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 61:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.k(i7, (N17666688112968464504) unsafe.getObject(obj, j));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 62:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.u(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 63:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.p(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 64:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.l(i7, B(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 65:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        a5011514514014580540.n(i7, C(j, obj));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 66:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        int B = B(j, obj);
                        a5011514514014580540.u(i7, (B >> 31) ^ (B << 1));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 67:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        long C = C(j, obj);
                        a5011514514014580540.w(i7, (C >> 63) ^ (C << z));
                    }
                    i5 += 3;
                    i3 = 1048575;
                case 68:
                    if (o6762602046924520025.t(i7, i5, obj)) {
                        Object object4 = unsafe.getObject(obj, j);
                        a5011514514014580540.t(i7, 3);
                        o6762602046924520025.p(i5).h((E890218321994133736) object4, h12843822278061842084);
                        a5011514514014580540.t(i7, 4);
                    }
                    i5 += 3;
                    i3 = 1048575;
                default:
                    i5 += 3;
                    i3 = 1048575;
            }
        }
        o6762602046924520025.l.getClass();
        ((Z14368087615735085238) obj).unknownFields.e(h12843822278061842084);
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final int i(Z14368087615735085238 z14368087615735085238) {
        int i;
        int e;
        int e2;
        int e3;
        int g;
        int e4;
        int g2;
        int e5;
        int e6;
        int e7;
        int b;
        int f;
        int a;
        int e8;
        int b2;
        int c;
        int e9;
        int size;
        int i2;
        int e10;
        int e11;
        int size2;
        int e12;
        int f2;
        int i3;
        int e13;
        int e14;
        int g3;
        int e15;
        int g4;
        int i4;
        O6762602046924520025 o6762602046924520025 = this;
        Z14368087615735085238 z143680876157350852382 = z14368087615735085238;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = o6762602046924520025.a;
            if (i5 >= iArr.length) {
                o6762602046924520025.l.getClass();
                return z143680876157350852382.unknownFields.b() + i7;
            }
            int P = o6762602046924520025.P(i5);
            int O = O(P);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & 1048575;
            Unsafe unsafe = f415o;
            if (O <= 17) {
                if (i11 != i8) {
                    i6 = i11 == 1048575 ? 0 : unsafe.getInt(z143680876157350852382, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j = P & 1048575;
            if (O >= L15690290092493485481.b.a) {
                byte b3 = L15690290092493485481.c.a;
            }
            switch (O) {
                case 0:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        e = A5011514514014580540.e(i9);
                        c = e + 8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 1:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        e2 = A5011514514014580540.e(i9);
                        e6 = e2 + 4;
                        i7 += e6;
                    }
                    o6762602046924520025 = this;
                    z143680876157350852382 = z14368087615735085238;
                    i5 += 3;
                case 2:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        long j2 = unsafe.getLong(z143680876157350852382, j);
                        e3 = A5011514514014580540.e(i9);
                        g = A5011514514014580540.g(j2);
                        i7 += g + e3;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 3:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        long j3 = unsafe.getLong(z143680876157350852382, j);
                        e3 = A5011514514014580540.e(i9);
                        g = A5011514514014580540.g(j3);
                        i7 += g + e3;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 4:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        int i12 = unsafe.getInt(z143680876157350852382, j);
                        e4 = A5011514514014580540.e(i9);
                        g2 = A5011514514014580540.g(i12);
                        a = g2 + e4;
                        i7 += a;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 5:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        e5 = A5011514514014580540.e(i9);
                        e6 = e5 + 8;
                        i7 += e6;
                    }
                    o6762602046924520025 = this;
                    z143680876157350852382 = z14368087615735085238;
                    i5 += 3;
                case 6:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        e2 = A5011514514014580540.e(i9);
                        e6 = e2 + 4;
                        i7 += e6;
                    }
                    o6762602046924520025 = this;
                    z143680876157350852382 = z14368087615735085238;
                    i5 += 3;
                case 7:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        e6 = A5011514514014580540.e(i9) + 1;
                        i7 += e6;
                    }
                    o6762602046924520025 = this;
                    z143680876157350852382 = z14368087615735085238;
                    i5 += 3;
                case 8:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        Object object = unsafe.getObject(z143680876157350852382, j);
                        i7 = (object instanceof N17666688112968464504 ? A5011514514014580540.a(i9, (N17666688112968464504) object) : A5011514514014580540.d((String) object) + A5011514514014580540.e(i9)) + i7;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 9:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        Object object2 = unsafe.getObject(z143680876157350852382, j);
                        Y3341182438442346389 p = o6762602046924520025.p(i5);
                        Class cls = W3646014350333091735.a;
                        e7 = A5011514514014580540.e(i9);
                        b = ((E890218321994133736) object2).b(p);
                        f = A5011514514014580540.f(b);
                        i4 = f + b + e7;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 10:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        a = A5011514514014580540.a(i9, (N17666688112968464504) unsafe.getObject(z143680876157350852382, j));
                        i7 += a;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 11:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        int i13 = unsafe.getInt(z143680876157350852382, j);
                        e4 = A5011514514014580540.e(i9);
                        g2 = A5011514514014580540.f(i13);
                        a = g2 + e4;
                        i7 += a;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 12:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        int i14 = unsafe.getInt(z143680876157350852382, j);
                        e4 = A5011514514014580540.e(i9);
                        g2 = A5011514514014580540.g(i14);
                        a = g2 + e4;
                        i7 += a;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 13:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        e2 = A5011514514014580540.e(i9);
                        e6 = e2 + 4;
                        i7 += e6;
                    }
                    o6762602046924520025 = this;
                    z143680876157350852382 = z14368087615735085238;
                    i5 += 3;
                case 14:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        e5 = A5011514514014580540.e(i9);
                        e6 = e5 + 8;
                        i7 += e6;
                    }
                    o6762602046924520025 = this;
                    z143680876157350852382 = z14368087615735085238;
                    i5 += 3;
                case 15:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        int i15 = unsafe.getInt(z143680876157350852382, j);
                        e4 = A5011514514014580540.e(i9);
                        g2 = A5011514514014580540.b(i15);
                        a = g2 + e4;
                        i7 += a;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 16:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        long j4 = unsafe.getLong(z143680876157350852382, j);
                        e3 = A5011514514014580540.e(i9);
                        g = A5011514514014580540.c(j4);
                        i7 += g + e3;
                    }
                    o6762602046924520025 = this;
                    i5 += 3;
                case 17:
                    if (o6762602046924520025.r(z143680876157350852382, i5, i8, i6, i)) {
                        E890218321994133736 e890218321994133736 = (E890218321994133736) unsafe.getObject(z143680876157350852382, j);
                        Y3341182438442346389 p2 = o6762602046924520025.p(i5);
                        Class cls2 = W3646014350333091735.a;
                        e8 = A5011514514014580540.e(i9) * 2;
                        b2 = e890218321994133736.b(p2);
                        c = b2 + e8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 18:
                    c = W3646014350333091735.c(i9, (List) unsafe.getObject(z143680876157350852382, j));
                    i7 += c;
                    i5 += 3;
                case 19:
                    c = W3646014350333091735.b(i9, (List) unsafe.getObject(z143680876157350852382, j));
                    i7 += c;
                    i5 += 3;
                case 20:
                    List list = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls3 = W3646014350333091735.a;
                    if (list.size() != 0) {
                        e9 = (A5011514514014580540.e(i9) * list.size()) + W3646014350333091735.e(list);
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 21:
                    List list2 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls4 = W3646014350333091735.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = W3646014350333091735.i(list2);
                        e10 = A5011514514014580540.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 22:
                    List list3 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls5 = W3646014350333091735.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = W3646014350333091735.d(list3);
                        e10 = A5011514514014580540.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 23:
                    c = W3646014350333091735.c(i9, (List) unsafe.getObject(z143680876157350852382, j));
                    i7 += c;
                    i5 += 3;
                case 24:
                    c = W3646014350333091735.b(i9, (List) unsafe.getObject(z143680876157350852382, j));
                    i7 += c;
                    i5 += 3;
                case 25:
                    List list4 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls6 = W3646014350333091735.a;
                    int size3 = list4.size();
                    i7 += size3 == 0 ? 0 : (A5011514514014580540.e(i9) + 1) * size3;
                    i5 += 3;
                case 26:
                    List list5 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls7 = W3646014350333091735.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        e9 = A5011514514014580540.e(i9) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            Object obj = list5.get(i16);
                            if (obj instanceof N17666688112968464504) {
                                int size5 = ((N17666688112968464504) obj).size();
                                e9 = A5011514514014580540.f(size5) + size5 + e9;
                            } else {
                                e9 = A5011514514014580540.d((String) obj) + e9;
                            }
                        }
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 27:
                    List list6 = (List) unsafe.getObject(z143680876157350852382, j);
                    Y3341182438442346389 p3 = o6762602046924520025.p(i5);
                    Class cls8 = W3646014350333091735.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        e11 = 0;
                    } else {
                        e11 = A5011514514014580540.e(i9) * size6;
                        for (int i17 = 0; i17 < size6; i17++) {
                            int b4 = ((E890218321994133736) list6.get(i17)).b(p3);
                            e11 += A5011514514014580540.f(b4) + b4;
                        }
                    }
                    i7 += e11;
                    i5 += 3;
                case 28:
                    List list7 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls9 = W3646014350333091735.a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        e9 = A5011514514014580540.e(i9) * size7;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size8 = ((N17666688112968464504) list7.get(i18)).size();
                            e9 += A5011514514014580540.f(size8) + size8;
                        }
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 29:
                    List list8 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls10 = W3646014350333091735.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = W3646014350333091735.h(list8);
                        e10 = A5011514514014580540.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 30:
                    List list9 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls11 = W3646014350333091735.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = W3646014350333091735.a(list9);
                        e10 = A5011514514014580540.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 31:
                    c = W3646014350333091735.b(i9, (List) unsafe.getObject(z143680876157350852382, j));
                    i7 += c;
                    i5 += 3;
                case 32:
                    c = W3646014350333091735.c(i9, (List) unsafe.getObject(z143680876157350852382, j));
                    i7 += c;
                    i5 += 3;
                case 33:
                    List list10 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls12 = W3646014350333091735.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = W3646014350333091735.f(list10);
                        e10 = A5011514514014580540.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 34:
                    List list11 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls13 = W3646014350333091735.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = W3646014350333091735.g(list11);
                        e10 = A5011514514014580540.e(i9);
                        e9 = (e10 * size) + i2;
                        i7 += e9;
                        i5 += 3;
                    }
                    e9 = 0;
                    i7 += e9;
                    i5 += 3;
                case 35:
                    List list12 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls14 = W3646014350333091735.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls15 = W3646014350333091735.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 37:
                    size2 = W3646014350333091735.e((List) unsafe.getObject(z143680876157350852382, j));
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 38:
                    size2 = W3646014350333091735.i((List) unsafe.getObject(z143680876157350852382, j));
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 39:
                    size2 = W3646014350333091735.d((List) unsafe.getObject(z143680876157350852382, j));
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls16 = W3646014350333091735.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls17 = W3646014350333091735.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls18 = W3646014350333091735.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 43:
                    size2 = W3646014350333091735.h((List) unsafe.getObject(z143680876157350852382, j));
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 44:
                    size2 = W3646014350333091735.a((List) unsafe.getObject(z143680876157350852382, j));
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls19 = W3646014350333091735.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(z143680876157350852382, j);
                    Class cls20 = W3646014350333091735.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 47:
                    size2 = W3646014350333091735.f((List) unsafe.getObject(z143680876157350852382, j));
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 48:
                    size2 = W3646014350333091735.g((List) unsafe.getObject(z143680876157350852382, j));
                    if (size2 > 0) {
                        e12 = A5011514514014580540.e(i9);
                        f2 = A5011514514014580540.f(size2);
                        i7 += f2 + e12 + size2;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(z143680876157350852382, j);
                    Y3341182438442346389 p4 = o6762602046924520025.p(i5);
                    Class cls21 = W3646014350333091735.a;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i19 = 0; i19 < size9; i19++) {
                            i3 += ((E890218321994133736) list19.get(i19)).b(p4) + (A5011514514014580540.e(i9) * 2);
                        }
                    }
                    i7 += i3;
                    i5 += 3;
                case 50:
                    Object object3 = unsafe.getObject(z143680876157350852382, j);
                    Object o2 = o6762602046924520025.o(i5);
                    o6762602046924520025.m.getClass();
                    F2939356130442922449 f2939356130442922449 = (F2939356130442922449) object3;
                    if (o2 != null) {
                        Z3383101362411723454.s();
                        return 0;
                    }
                    if (f2939356130442922449.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = f2939356130442922449.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i5 += 3;
                case 51:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        e = A5011514514014580540.e(i9);
                        c = e + 8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 52:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        e13 = A5011514514014580540.e(i9);
                        c = e13 + 4;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 53:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        long C = C(j, z143680876157350852382);
                        e14 = A5011514514014580540.e(i9);
                        g3 = A5011514514014580540.g(C);
                        i4 = g3 + e14;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 54:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        long C2 = C(j, z143680876157350852382);
                        e14 = A5011514514014580540.e(i9);
                        g3 = A5011514514014580540.g(C2);
                        i4 = g3 + e14;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 55:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        int B = B(j, z143680876157350852382);
                        e15 = A5011514514014580540.e(i9);
                        g4 = A5011514514014580540.g(B);
                        c = g4 + e15;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 56:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        e = A5011514514014580540.e(i9);
                        c = e + 8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 57:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        e13 = A5011514514014580540.e(i9);
                        c = e13 + 4;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 58:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        c = A5011514514014580540.e(i9) + 1;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 59:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        Object object4 = unsafe.getObject(z143680876157350852382, j);
                        i7 = (object4 instanceof N17666688112968464504 ? A5011514514014580540.a(i9, (N17666688112968464504) object4) : A5011514514014580540.d((String) object4) + A5011514514014580540.e(i9)) + i7;
                    }
                    i5 += 3;
                case 60:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        Object object5 = unsafe.getObject(z143680876157350852382, j);
                        Y3341182438442346389 p5 = o6762602046924520025.p(i5);
                        Class cls22 = W3646014350333091735.a;
                        e7 = A5011514514014580540.e(i9);
                        b = ((E890218321994133736) object5).b(p5);
                        f = A5011514514014580540.f(b);
                        i4 = f + b + e7;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 61:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        c = A5011514514014580540.a(i9, (N17666688112968464504) unsafe.getObject(z143680876157350852382, j));
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 62:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        int B2 = B(j, z143680876157350852382);
                        e15 = A5011514514014580540.e(i9);
                        g4 = A5011514514014580540.f(B2);
                        c = g4 + e15;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 63:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        int B3 = B(j, z143680876157350852382);
                        e15 = A5011514514014580540.e(i9);
                        g4 = A5011514514014580540.g(B3);
                        c = g4 + e15;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 64:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        e13 = A5011514514014580540.e(i9);
                        c = e13 + 4;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 65:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        e = A5011514514014580540.e(i9);
                        c = e + 8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 66:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        int B4 = B(j, z143680876157350852382);
                        e15 = A5011514514014580540.e(i9);
                        g4 = A5011514514014580540.b(B4);
                        c = g4 + e15;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 67:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        long C3 = C(j, z143680876157350852382);
                        e14 = A5011514514014580540.e(i9);
                        g3 = A5011514514014580540.c(C3);
                        i4 = g3 + e14;
                        i7 += i4;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                case 68:
                    if (o6762602046924520025.t(i9, i5, z143680876157350852382)) {
                        E890218321994133736 e8902183219941337362 = (E890218321994133736) unsafe.getObject(z143680876157350852382, j);
                        Y3341182438442346389 p6 = o6762602046924520025.p(i5);
                        Class cls23 = W3646014350333091735.a;
                        e8 = A5011514514014580540.e(i9) * 2;
                        b2 = e8902183219941337362.b(p6);
                        c = b2 + e8;
                        i7 += c;
                        i5 += 3;
                    } else {
                        i5 += 3;
                    }
                default:
                    i5 += 3;
            }
        }
    }

    @Override // dev.epro.r0.Y3341182438442346389
    public final void j(Object obj, byte[] bArr, int i, int i2, D15735805680132151670 d15735805680132151670) {
        D(obj, bArr, i, i2, 0, d15735805680132151670);
    }

    public final boolean k(Z14368087615735085238 z14368087615735085238, Z14368087615735085238 z143680876157350852382, int i) {
        return q(i, z14368087615735085238) == q(i, z143680876157350852382);
    }

    public final void m(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (Z3287610729711297369.j(P(i) & 1048575, obj) == null) {
            return;
        }
        n(i);
    }

    public final void n(int i) {
        if (this.b[E12098517352909843120.f(i, 3, 2, 1)] == null) {
            return;
        }
        Z3383101362411723454.s();
    }

    public final Object o(int i) {
        return this.b[(i / 3) * 2];
    }

    public final Y3341182438442346389 p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        Y3341182438442346389 y3341182438442346389 = (Y3341182438442346389) objArr[i2];
        if (y3341182438442346389 != null) {
            return y3341182438442346389;
        }
        Y3341182438442346389 a = C2256474256246444038.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.O6762602046924520025.q(int, java.lang.Object):boolean");
    }

    public final boolean r(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? q(i, obj) : (i3 & i4) != 0;
    }

    public final boolean t(int i, int i2, Object obj) {
        return Z3287610729711297369.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void u(int i, Object obj, Object obj2) {
        long P = P(i) & 1048575;
        Object j = Z3287610729711297369.j(P, obj);
        H16705941102157523559 h16705941102157523559 = this.m;
        if (j != null) {
            h16705941102157523559.getClass();
            if (!((F2939356130442922449) j).a) {
                Object c = F2939356130442922449.b.c();
                H16705941102157523559.a(c, j);
                Z3287610729711297369.q(P, obj, c);
                j = c;
            }
        } else {
            h16705941102157523559.getClass();
            j = F2939356130442922449.b.c();
            Z3287610729711297369.q(P, obj, j);
        }
        h16705941102157523559.getClass();
        L11610354117192841236.y(obj2);
        throw null;
    }

    public final void v(int i, Object obj, Object obj2) {
        if (q(i, obj2)) {
            long P = P(i) & 1048575;
            Unsafe unsafe = f415o;
            Object object = unsafe.getObject(obj2, P);
            if (object == null) {
                Z3383101362411723454.i(this.a[i], obj2);
                return;
            }
            Y3341182438442346389 p = p(i);
            if (!q(i, obj)) {
                if (s(object)) {
                    Object d = p.d();
                    p.a(d, object);
                    unsafe.putObject(obj, P, d);
                } else {
                    unsafe.putObject(obj, P, object);
                }
                J(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, P);
            if (!s(object2)) {
                Object d2 = p.d();
                p.a(d2, object2);
                unsafe.putObject(obj, P, d2);
                object2 = d2;
            }
            p.a(object2, object);
        }
    }

    public final void w(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (t(i2, i, obj2)) {
            long P = P(i) & 1048575;
            Unsafe unsafe = f415o;
            Object object = unsafe.getObject(obj2, P);
            if (object == null) {
                Z3383101362411723454.i(iArr[i], obj2);
                return;
            }
            Y3341182438442346389 p = p(i);
            if (!t(i2, i, obj)) {
                if (s(object)) {
                    Object d = p.d();
                    p.a(d, object);
                    unsafe.putObject(obj, P, d);
                } else {
                    unsafe.putObject(obj, P, object);
                }
                K(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, P);
            if (!s(object2)) {
                Object d2 = p.d();
                p.a(d2, object2);
                unsafe.putObject(obj, P, d2);
                object2 = d2;
            }
            p.a(object2, object);
        }
    }

    public final Object x(int i, Object obj) {
        Y3341182438442346389 p = p(i);
        long P = P(i) & 1048575;
        if (!q(i, obj)) {
            return p.d();
        }
        Object object = f415o.getObject(obj, P);
        if (s(object)) {
            return object;
        }
        Object d = p.d();
        if (object != null) {
            p.a(d, object);
        }
        return d;
    }

    public final Object y(int i, int i2, Object obj) {
        Y3341182438442346389 p = p(i2);
        if (!t(i, i2, obj)) {
            return p.d();
        }
        Object object = f415o.getObject(obj, P(i2) & 1048575);
        if (s(object)) {
            return object;
        }
        Object d = p.d();
        if (object != null) {
            p.a(d, object);
        }
        return d;
    }
}
