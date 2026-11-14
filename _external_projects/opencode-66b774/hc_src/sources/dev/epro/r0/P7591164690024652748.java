package dev.epro.r0;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class P7591164690024652748 implements N10092264544134359582 {
    public static final int[] n = new int[0];

    /* renamed from: o, reason: collision with root package name */
    public static final Unsafe f437o;
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final K17275736824900228431 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final P6556295605237910640 j;
    public final J9391192653199620777 k;
    public final Q17537606732352760497 l;
    public final E13260110309995934400 m;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new F2522870689781627311((byte) 2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        f437o = unsafe;
    }

    public P7591164690024652748(int[] iArr, Object[] objArr, int i, int i2, K17275736824900228431 k17275736824900228431, boolean z, int[] iArr2, int i3, int i4, P6556295605237910640 p6556295605237910640, J9391192653199620777 j9391192653199620777, Q17537606732352760497 q17537606732352760497, Z14573996342726291806 z14573996342726291806, E13260110309995934400 e13260110309995934400) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = k17275736824900228431 instanceof K17275736824900228431;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = p6556295605237910640;
        this.k = j9391192653199620777;
        this.l = q17537606732352760497;
        this.e = k17275736824900228431;
        this.m = e13260110309995934400;
    }

    public static Field C(Class cls, String str) {
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

    public static int F(int i) {
        return (i & 267386880) >>> 20;
    }

    public static boolean n(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof K17275736824900228431) {
            return ((K17275736824900228431) obj).e();
        }
        return true;
    }

    public static P7591164690024652748 u(T14602662695158654172 t14602662695158654172, P6556295605237910640 p6556295605237910640, J9391192653199620777 j9391192653199620777, Q17537606732352760497 q17537606732352760497, Z14573996342726291806 z14573996342726291806, E13260110309995934400 e13260110309995934400) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        char charAt4;
        int i6;
        char charAt5;
        int i7;
        char charAt6;
        int i8;
        char charAt7;
        int i9;
        char charAt8;
        int i10;
        char charAt9;
        int i11;
        char charAt10;
        int i12;
        char charAt11;
        int i13;
        int i14;
        Object[] objArr;
        boolean z;
        int[] iArr2;
        int objectFieldOffset;
        int i15;
        int i16;
        int i17;
        int i18;
        Field C;
        int i19;
        char charAt12;
        int i20;
        Field C2;
        Field C3;
        int i21;
        char charAt13;
        int i22;
        int i23;
        char charAt14;
        int i24;
        int i25;
        char charAt15;
        int i26;
        int i27;
        char charAt16;
        if (!(t14602662695158654172 instanceof T14602662695158654172)) {
            Z3383101362411723454.s();
            return null;
        }
        int i28 = 0;
        boolean z2 = (t14602662695158654172.d & 1) != 1;
        String str = t14602662695158654172.b;
        int length = str.length();
        if (str.charAt(0) >= 55296) {
            int i29 = 1;
            while (true) {
                i = i29 + 1;
                if (str.charAt(i29) < 55296) {
                    break;
                }
                i29 = i;
            }
        } else {
            i = 1;
        }
        int i30 = i + 1;
        int charAt17 = str.charAt(i);
        if (charAt17 >= 55296) {
            int i31 = charAt17 & 8191;
            int i32 = 13;
            while (true) {
                i27 = i30 + 1;
                charAt16 = str.charAt(i30);
                if (charAt16 < 55296) {
                    break;
                }
                i31 |= (charAt16 & 8191) << i32;
                i32 += 13;
                i30 = i27;
            }
            charAt17 = i31 | (charAt16 << i32);
            i30 = i27;
        }
        if (charAt17 == 0) {
            i4 = 0;
            charAt = 0;
            charAt2 = 0;
            i2 = 0;
            charAt3 = 0;
            iArr = n;
            i3 = 0;
        } else {
            int i33 = i30 + 1;
            int charAt18 = str.charAt(i30);
            if (charAt18 >= 55296) {
                int i34 = charAt18 & 8191;
                int i35 = 13;
                while (true) {
                    i12 = i33 + 1;
                    charAt11 = str.charAt(i33);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i34 |= (charAt11 & 8191) << i35;
                    i35 += 13;
                    i33 = i12;
                }
                charAt18 = i34 | (charAt11 << i35);
                i33 = i12;
            }
            int i36 = i33 + 1;
            int charAt19 = str.charAt(i33);
            if (charAt19 >= 55296) {
                int i37 = charAt19 & 8191;
                int i38 = 13;
                while (true) {
                    i11 = i36 + 1;
                    charAt10 = str.charAt(i36);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i37 |= (charAt10 & 8191) << i38;
                    i38 += 13;
                    i36 = i11;
                }
                charAt19 = i37 | (charAt10 << i38);
                i36 = i11;
            }
            int i39 = i36 + 1;
            int charAt20 = str.charAt(i36);
            if (charAt20 >= 55296) {
                int i40 = charAt20 & 8191;
                int i41 = 13;
                while (true) {
                    i10 = i39 + 1;
                    charAt9 = str.charAt(i39);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i40 |= (charAt9 & 8191) << i41;
                    i41 += 13;
                    i39 = i10;
                }
                charAt20 = i40 | (charAt9 << i41);
                i39 = i10;
            }
            int i42 = i39 + 1;
            int charAt21 = str.charAt(i39);
            if (charAt21 >= 55296) {
                int i43 = charAt21 & 8191;
                int i44 = 13;
                while (true) {
                    i9 = i42 + 1;
                    charAt8 = str.charAt(i42);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i43 |= (charAt8 & 8191) << i44;
                    i44 += 13;
                    i42 = i9;
                }
                charAt21 = i43 | (charAt8 << i44);
                i42 = i9;
            }
            int i45 = i42 + 1;
            charAt = str.charAt(i42);
            if (charAt >= 55296) {
                int i46 = charAt & 8191;
                int i47 = 13;
                while (true) {
                    i8 = i45 + 1;
                    charAt7 = str.charAt(i45);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i46 |= (charAt7 & 8191) << i47;
                    i47 += 13;
                    i45 = i8;
                }
                charAt = i46 | (charAt7 << i47);
                i45 = i8;
            }
            int i48 = i45 + 1;
            charAt2 = str.charAt(i45);
            if (charAt2 >= 55296) {
                int i49 = charAt2 & 8191;
                int i50 = 13;
                while (true) {
                    i7 = i48 + 1;
                    charAt6 = str.charAt(i48);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i49 |= (charAt6 & 8191) << i50;
                    i50 += 13;
                    i48 = i7;
                }
                charAt2 = i49 | (charAt6 << i50);
                i48 = i7;
            }
            int i51 = i48 + 1;
            int charAt22 = str.charAt(i48);
            if (charAt22 >= 55296) {
                int i52 = charAt22 & 8191;
                int i53 = 13;
                while (true) {
                    i6 = i51 + 1;
                    charAt5 = str.charAt(i51);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i52 |= (charAt5 & 8191) << i53;
                    i53 += 13;
                    i51 = i6;
                }
                charAt22 = i52 | (charAt5 << i53);
                i51 = i6;
            }
            int i54 = i51 + 1;
            charAt3 = str.charAt(i51);
            if (charAt3 >= 55296) {
                int i55 = charAt3 & 8191;
                int i56 = i54;
                int i57 = 13;
                while (true) {
                    i5 = i56 + 1;
                    charAt4 = str.charAt(i56);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i55 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i56 = i5;
                }
                charAt3 = i55 | (charAt4 << i57);
                i54 = i5;
            }
            int[] iArr3 = new int[charAt3 + charAt2 + charAt22];
            i2 = (charAt18 * 2) + charAt19;
            i3 = charAt20;
            i4 = charAt21;
            iArr = iArr3;
            i28 = charAt18;
            i30 = i54;
        }
        Object[] objArr2 = t14602662695158654172.c;
        Class<?> cls = t14602662695158654172.a.getClass();
        int[] iArr4 = new int[charAt * 3];
        int i58 = i28;
        Object[] objArr3 = new Object[charAt * 2];
        int i59 = charAt2 + charAt3;
        int i60 = i59;
        int i61 = charAt3;
        int i62 = 0;
        int i63 = 0;
        while (i30 < length) {
            int i64 = i30 + 1;
            int charAt23 = str.charAt(i30);
            int i65 = length;
            if (charAt23 >= 55296) {
                int i66 = charAt23 & 8191;
                int i67 = i64;
                int i68 = 13;
                while (true) {
                    i25 = i67 + 1;
                    charAt15 = str.charAt(i67);
                    i26 = i66;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i66 = i26 | ((charAt15 & 8191) << i68);
                    i68 += 13;
                    i67 = i25;
                }
                charAt23 = i26 | (charAt15 << i68);
                i13 = i25;
            } else {
                i13 = i64;
            }
            int i69 = i13 + 1;
            int charAt24 = str.charAt(i13);
            int i70 = charAt23;
            if (charAt24 >= 55296) {
                int i71 = charAt24 & 8191;
                int i72 = i69;
                int i73 = 13;
                while (true) {
                    i23 = i72 + 1;
                    charAt14 = str.charAt(i72);
                    i24 = i71;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i71 = i24 | ((charAt14 & 8191) << i73);
                    i73 += 13;
                    i72 = i23;
                }
                charAt24 = i24 | (charAt14 << i73);
                i14 = i23;
            } else {
                i14 = i69;
            }
            int[] iArr5 = iArr4;
            int i74 = charAt24 & 255;
            int i75 = i3;
            if ((charAt24 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            Unsafe unsafe = f437o;
            int i76 = i4;
            if (i74 >= 51) {
                int i77 = i14 + 1;
                int charAt25 = str.charAt(i14);
                if (charAt25 >= 55296) {
                    int i78 = charAt25 & 8191;
                    int i79 = i77;
                    int i80 = 13;
                    while (true) {
                        i21 = i79 + 1;
                        charAt13 = str.charAt(i79);
                        i22 = i78;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i78 = i22 | ((charAt13 & 8191) << i80);
                        i80 += 13;
                        i79 = i21;
                    }
                    charAt25 = i22 | (charAt13 << i80);
                    i20 = i21;
                } else {
                    i20 = i77;
                }
                int i81 = charAt25;
                int i82 = i74 - 51;
                int i83 = i20;
                if (i82 == 9 || i82 == 17) {
                    objArr = objArr2;
                    objArr3[E12098517352909843120.f(i62, 3, 2, 1)] = objArr[i2];
                    i2++;
                } else if (i82 != 12 || z2) {
                    objArr = objArr2;
                } else {
                    objArr = objArr2;
                    objArr3[E12098517352909843120.f(i62, 3, 2, 1)] = objArr[i2];
                    i2++;
                }
                int i84 = i81 * 2;
                Object obj = objArr[i84];
                if (obj instanceof Field) {
                    C2 = (Field) obj;
                } else {
                    C2 = C(cls, (String) obj);
                    objArr[i84] = C2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(C2);
                int i85 = i84 + 1;
                Object obj2 = objArr[i85];
                if (obj2 instanceof Field) {
                    C3 = (Field) obj2;
                } else {
                    C3 = C(cls, (String) obj2);
                    objArr[i85] = C3;
                }
                i15 = (int) unsafe.objectFieldOffset(C3);
                i18 = objectFieldOffset2;
                z = z2;
                iArr2 = iArr;
                i16 = i83;
                i17 = 0;
            } else {
                objArr = objArr2;
                int i86 = i2 + 1;
                Field C4 = C(cls, (String) objArr[i2]);
                if (i74 == 9 || i74 == 17) {
                    z = z2;
                    iArr2 = iArr;
                    objArr3[E12098517352909843120.f(i62, 3, 2, 1)] = C4.getType();
                } else {
                    if (i74 == 27 || i74 == 49) {
                        z = z2;
                        iArr2 = iArr;
                        i2 += 2;
                        objArr3[E12098517352909843120.f(i62, 3, 2, 1)] = objArr[i86];
                    } else if (i74 == 12 || i74 == 30 || i74 == 44) {
                        if (!z2) {
                            z = z2;
                            iArr2 = iArr;
                            i2 += 2;
                            objArr3[E12098517352909843120.f(i62, 3, 2, 1)] = objArr[i86];
                        }
                        z = z2;
                        iArr2 = iArr;
                    } else {
                        if (i74 == 50) {
                            int i87 = i61 + 1;
                            iArr[i61] = i62;
                            int i88 = (i62 / 3) * 2;
                            int i89 = i2 + 2;
                            objArr3[i88] = objArr[i86];
                            if ((charAt24 & 2048) != 0) {
                                objArr3[i88 + 1] = objArr[i89];
                                i2 += 3;
                                z = z2;
                                iArr2 = iArr;
                                i61 = i87;
                            } else {
                                z = z2;
                                i2 = i89;
                                i61 = i87;
                                iArr2 = iArr;
                            }
                        }
                        z = z2;
                        iArr2 = iArr;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                    if ((charAt24 & 4096) == 4096 || i74 > 17) {
                        i15 = 1048575;
                        i16 = i14;
                        i17 = 0;
                    } else {
                        i16 = i14 + 1;
                        int charAt26 = str.charAt(i14);
                        if (charAt26 >= 55296) {
                            int i90 = charAt26 & 8191;
                            int i91 = 13;
                            while (true) {
                                i19 = i16 + 1;
                                charAt12 = str.charAt(i16);
                                if (charAt12 < 55296) {
                                    break;
                                }
                                i90 |= (charAt12 & 8191) << i91;
                                i91 += 13;
                                i16 = i19;
                            }
                            charAt26 = i90 | (charAt12 << i91);
                            i16 = i19;
                        }
                        int i92 = (charAt26 / 32) + (i58 * 2);
                        Object obj3 = objArr[i92];
                        if (obj3 instanceof Field) {
                            C = (Field) obj3;
                        } else {
                            C = C(cls, (String) obj3);
                            objArr[i92] = C;
                        }
                        i15 = (int) unsafe.objectFieldOffset(C);
                        i17 = charAt26 % 32;
                    }
                    if (i74 >= 18 && i74 <= 49) {
                        iArr2[i60] = objectFieldOffset;
                        i60++;
                    }
                    i18 = objectFieldOffset;
                }
                i2 = i86;
                objectFieldOffset = (int) unsafe.objectFieldOffset(C4);
                if ((charAt24 & 4096) == 4096) {
                }
                i15 = 1048575;
                i16 = i14;
                i17 = 0;
                if (i74 >= 18) {
                    iArr2[i60] = objectFieldOffset;
                    i60++;
                }
                i18 = objectFieldOffset;
            }
            int i93 = i62 + 1;
            iArr5[i62] = i70;
            int i94 = i62 + 2;
            String str2 = str;
            iArr5[i93] = ((charAt24 & 512) != 0 ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 0) | ((charAt24 & 256) != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0) | (i74 << 20) | i18;
            i62 += 3;
            iArr5[i94] = (i17 << 20) | i15;
            i30 = i16;
            z2 = z;
            iArr4 = iArr5;
            length = i65;
            str = str2;
            i3 = i75;
            iArr = iArr2;
            i4 = i76;
            objArr2 = objArr;
        }
        return new P7591164690024652748(iArr4, objArr3, i3, i4, t14602662695158654172.a, z2, iArr, charAt3, i59, p6556295605237910640, j9391192653199620777, q17537606732352760497, z14573996342726291806, e13260110309995934400);
    }

    public static long v(int i) {
        return i & 1048575;
    }

    public static int w(long j, Object obj) {
        return ((Integer) J3288146055636008296.j(j, obj)).intValue();
    }

    public static long x(long j, Object obj) {
        return ((Long) J3288146055636008296.j(j, obj)).longValue();
    }

    public final void A(int i, E17564419012940707302 e17564419012940707302, Object obj) {
        String str = "";
        if ((536870912 & i) != 0) {
            long j = i & 1048575;
            e17564419012940707302.x0(2);
            X4929887216837100213 x4929887216837100213 = (X4929887216837100213) e17564419012940707302.e;
            byte[] bArr = x4929887216837100213.d;
            int K = x4929887216837100213.K();
            int i2 = x4929887216837100213.g;
            int i3 = x4929887216837100213.e;
            if (K > i3 - i2 || K <= 0) {
                if (K != 0) {
                    i2 = 0;
                    if (K <= i3) {
                        x4929887216837100213.O(K);
                        x4929887216837100213.g = K;
                    } else {
                        bArr = x4929887216837100213.F(K);
                    }
                }
                J3288146055636008296.p(j, obj, str);
                return;
            }
            x4929887216837100213.g = i2 + K;
            str = F2424644667972238580.a.k(i2, bArr, K);
            J3288146055636008296.p(j, obj, str);
            return;
        }
        if (!this.f) {
            J3288146055636008296.p(i & 1048575, obj, e17564419012940707302.x());
            return;
        }
        long j2 = i & 1048575;
        e17564419012940707302.x0(2);
        X4929887216837100213 x49298872168371002132 = (X4929887216837100213) e17564419012940707302.e;
        byte[] bArr2 = x49298872168371002132.d;
        int K2 = x49298872168371002132.K();
        if (K2 > 0) {
            int i4 = x49298872168371002132.e;
            int i5 = x49298872168371002132.g;
            if (K2 <= i4 - i5) {
                str = new String(bArr2, i5, K2, X10245771154555039797.a);
                x49298872168371002132.g += K2;
                J3288146055636008296.p(j2, obj, str);
            }
        }
        if (K2 != 0) {
            if (K2 <= x49298872168371002132.e) {
                x49298872168371002132.O(K2);
                str = new String(bArr2, x49298872168371002132.g, K2, X10245771154555039797.a);
                x49298872168371002132.g += K2;
            } else {
                str = new String(x49298872168371002132.F(K2), X10245771154555039797.a);
            }
        }
        J3288146055636008296.p(j2, obj, str);
    }

    public final void B(int i, E17564419012940707302 e17564419012940707302, Object obj) {
        boolean z = (536870912 & i) != 0;
        J9391192653199620777 j9391192653199620777 = this.k;
        if (z) {
            e17564419012940707302.o0(j9391192653199620777.c(i & 1048575, obj), true);
        } else {
            e17564419012940707302.o0(j9391192653199620777.c(i & 1048575, obj), false);
        }
    }

    public final void D(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        J3288146055636008296.n((1 << (i2 >>> 20)) | J3288146055636008296.h(j, obj), j, obj);
    }

    public final void E(int i, int i2, Object obj) {
        J3288146055636008296.n(i, this.a[i2 + 2] & 1048575, obj);
    }

    public final int G(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // dev.epro.r0.N10092264544134359582
    public final void a(Object obj, Object obj2) {
        Object obj3;
        if (!n(obj)) {
            Q11088980322693754445.l("Mutating immutable message: ", obj);
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                E17474224322732239687.b(this.l, obj, obj2);
                return;
            }
            int G = G(i);
            long j = 1048575 & G;
            int i2 = iArr[i];
            switch (F(G)) {
                case 0:
                    if (m(i, obj2)) {
                        M2335452796812725357 m2335452796812725357 = J3288146055636008296.c;
                        obj3 = obj;
                        m2335452796812725357.g(obj3, j, m2335452796812725357.c(j, obj2));
                        D(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (m(i, obj2)) {
                        M2335452796812725357 m23354527968127253572 = J3288146055636008296.c;
                        m23354527968127253572.h(obj, j, m23354527968127253572.d(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (m(i, obj2)) {
                        J3288146055636008296.o(obj, j, J3288146055636008296.i(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (m(i, obj2)) {
                        J3288146055636008296.o(obj, j, J3288146055636008296.i(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (m(i, obj2)) {
                        J3288146055636008296.n(J3288146055636008296.h(j, obj2), j, obj);
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (m(i, obj2)) {
                        J3288146055636008296.o(obj, j, J3288146055636008296.i(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (m(i, obj2)) {
                        J3288146055636008296.n(J3288146055636008296.h(j, obj2), j, obj);
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (m(i, obj2)) {
                        M2335452796812725357 m23354527968127253573 = J3288146055636008296.c;
                        m23354527968127253573.e(obj, j, m23354527968127253573.a(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (m(i, obj2)) {
                        J3288146055636008296.p(j, obj, J3288146055636008296.j(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    q(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (m(i, obj2)) {
                        J3288146055636008296.p(j, obj, J3288146055636008296.j(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (m(i, obj2)) {
                        J3288146055636008296.n(J3288146055636008296.h(j, obj2), j, obj);
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (m(i, obj2)) {
                        J3288146055636008296.n(J3288146055636008296.h(j, obj2), j, obj);
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (m(i, obj2)) {
                        J3288146055636008296.n(J3288146055636008296.h(j, obj2), j, obj);
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (m(i, obj2)) {
                        J3288146055636008296.o(obj, j, J3288146055636008296.i(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (m(i, obj2)) {
                        J3288146055636008296.n(J3288146055636008296.h(j, obj2), j, obj);
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (m(i, obj2)) {
                        J3288146055636008296.o(obj, j, J3288146055636008296.i(j, obj2));
                        D(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    q(i, obj, obj2);
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
                    this.k.b(j, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = E17474224322732239687.a;
                    Object j2 = J3288146055636008296.j(j, obj);
                    Object j3 = J3288146055636008296.j(j, obj2);
                    this.m.getClass();
                    J3288146055636008296.p(j, obj, E13260110309995934400.a(j2, j3));
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
                    if (o(i2, i, obj2)) {
                        J3288146055636008296.p(j, obj, J3288146055636008296.j(j, obj2));
                        E(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    r(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (o(i2, i, obj2)) {
                        J3288146055636008296.p(j, obj, J3288146055636008296.j(j, obj2));
                        E(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    r(i, obj, obj2);
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

    @Override // dev.epro.r0.N10092264544134359582
    public final void b(Object obj) {
        if (n(obj)) {
            if (obj instanceof K17275736824900228431) {
                K17275736824900228431 k17275736824900228431 = (K17275736824900228431) obj;
                k17275736824900228431.b = (k17275736824900228431.b & Integer.MIN_VALUE) | (Integer.MAX_VALUE & Integer.MAX_VALUE);
                k17275736824900228431.a = 0;
                k17275736824900228431.b &= Integer.MAX_VALUE;
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int G = G(i);
                long j = 1048575 & G;
                int F = F(G);
                Unsafe unsafe = f437o;
                if (F != 9) {
                    if (F != 60 && F != 68) {
                        switch (F) {
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
                                this.k.a(j, obj);
                                break;
                            case 50:
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.m.getClass();
                                    ((C12163932668652713734) object).a = false;
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (o(iArr[i], i, obj)) {
                        l(i).b(unsafe.getObject(obj, j));
                    }
                }
                if (m(i, obj)) {
                    l(i).b(unsafe.getObject(obj, j));
                }
            }
            this.l.getClass();
            ((K17275736824900228431) obj).c.d = false;
        }
    }

    @Override // dev.epro.r0.N10092264544134359582
    public final boolean c(Object obj) {
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i2 >= this.h) {
                return true;
            }
            int i4 = this.g[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int G = G(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = f437o.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & G) != 0) {
                if (!(i == 1048575 ? m(i4, obj) : (i3 & i8) != 0)) {
                    break;
                }
            }
            int F = F(G);
            if (F == 9 || F == 17) {
                if (i == 1048575) {
                    z = m(i4, obj);
                } else if ((i8 & i3) == 0) {
                    z = false;
                }
                if (z && !l(i4).c(J3288146055636008296.j(G & 1048575, obj))) {
                    break;
                }
                i2++;
            } else {
                if (F != 27) {
                    if (F == 60 || F == 68) {
                        if (o(i5, i4, obj) && !l(i4).c(J3288146055636008296.j(G & 1048575, obj))) {
                            break;
                        }
                        i2++;
                    } else if (F != 49) {
                        if (F == 50) {
                            Object j = J3288146055636008296.j(G & 1048575, obj);
                            this.m.getClass();
                            C12163932668652713734 c12163932668652713734 = (C12163932668652713734) j;
                            if (!c12163932668652713734.isEmpty() && ((T18086906245708496780) ((A13843307759923533495) k(i4)).a.c).a == R570558775946343528.i) {
                                N10092264544134359582 n10092264544134359582 = null;
                                for (Object obj2 : c12163932668652713734.values()) {
                                    if (n10092264544134359582 == null) {
                                        n10092264544134359582 = X1177226880161088161.c.a(obj2.getClass());
                                    }
                                    if (!n10092264544134359582.c(obj2)) {
                                        break loop0;
                                    }
                                }
                            }
                        } else {
                            continue;
                        }
                        i2++;
                    }
                }
                List list = (List) J3288146055636008296.j(G & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    N10092264544134359582 l = l(i4);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        if (!l.c(list.get(i9))) {
                            break loop0;
                        }
                    }
                }
                i2++;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.N10092264544134359582
    public final K17275736824900228431 d() {
        this.j.getClass();
        return this.e.f();
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
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(dev.epro.r0.K17275736824900228431 r12) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.e(dev.epro.r0.K17275736824900228431):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006c, code lost:
    
        if (dev.epro.r0.E17474224322732239687.c(dev.epro.r0.J3288146055636008296.j(r7, r12), dev.epro.r0.J3288146055636008296.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
    
        if (dev.epro.r0.J3288146055636008296.i(r7, r12) == dev.epro.r0.J3288146055636008296.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (dev.epro.r0.J3288146055636008296.h(r7, r12) == dev.epro.r0.J3288146055636008296.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        if (dev.epro.r0.J3288146055636008296.i(r7, r12) == dev.epro.r0.J3288146055636008296.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:
    
        if (dev.epro.r0.J3288146055636008296.h(r7, r12) == dev.epro.r0.J3288146055636008296.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (dev.epro.r0.J3288146055636008296.h(r7, r12) == dev.epro.r0.J3288146055636008296.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (dev.epro.r0.J3288146055636008296.h(r7, r12) == dev.epro.r0.J3288146055636008296.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
    
        if (dev.epro.r0.E17474224322732239687.c(dev.epro.r0.J3288146055636008296.j(r7, r12), dev.epro.r0.J3288146055636008296.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (dev.epro.r0.E17474224322732239687.c(dev.epro.r0.J3288146055636008296.j(r7, r12), dev.epro.r0.J3288146055636008296.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (dev.epro.r0.E17474224322732239687.c(dev.epro.r0.J3288146055636008296.j(r7, r12), dev.epro.r0.J3288146055636008296.j(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0132, code lost:
    
        if (r5.a(r7, r12) == r5.a(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (dev.epro.r0.J3288146055636008296.h(r7, r12) == dev.epro.r0.J3288146055636008296.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0158, code lost:
    
        if (dev.epro.r0.J3288146055636008296.i(r7, r12) == dev.epro.r0.J3288146055636008296.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016a, code lost:
    
        if (dev.epro.r0.J3288146055636008296.h(r7, r12) == dev.epro.r0.J3288146055636008296.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
    
        if (dev.epro.r0.J3288146055636008296.i(r7, r12) == dev.epro.r0.J3288146055636008296.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0190, code lost:
    
        if (dev.epro.r0.J3288146055636008296.i(r7, r12) == dev.epro.r0.J3288146055636008296.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.d(r7, r12)) == java.lang.Float.floatToIntBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.c(r7, r12)) == java.lang.Double.doubleToLongBits(r5.c(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (dev.epro.r0.E17474224322732239687.c(dev.epro.r0.J3288146055636008296.j(r7, r12), dev.epro.r0.J3288146055636008296.j(r7, r13)) != false) goto L105;
     */
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(dev.epro.r0.K17275736824900228431 r12, dev.epro.r0.K17275736824900228431 r13) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.f(dev.epro.r0.K17275736824900228431, dev.epro.r0.K17275736824900228431):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x069a A[Catch: all -> 0x04a1, TryCatch #2 {all -> 0x04a1, blocks: (B:71:0x0695, B:73:0x069a, B:74:0x069f, B:129:0x03f5, B:132:0x03fc, B:133:0x040c, B:134:0x041c, B:135:0x042c, B:136:0x043c, B:137:0x044c, B:138:0x045c, B:139:0x046d, B:140:0x047e, B:141:0x04a4, B:142:0x04c1, B:143:0x04de, B:144:0x04fb, B:145:0x0518, B:146:0x0538, B:147:0x0555, B:148:0x056a, B:149:0x058e, B:150:0x059b, B:151:0x05ba, B:152:0x05d7, B:153:0x05f4, B:154:0x0611, B:155:0x062e, B:156:0x064b, B:157:0x066a, B:159:0x067f, B:165:0x068a), top: B:70:0x0695 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x06a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06bf A[LOOP:4: B:86:0x06bd->B:87:0x06bf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06c9  */
    @Override // dev.epro.r0.N10092264544134359582
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(java.lang.Object r20, dev.epro.r0.E17564419012940707302 r21, dev.epro.r0.X8134396307090105871 r22) {
        /*
            Method dump skipped, instructions count: 1894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.g(java.lang.Object, dev.epro.r0.E17564419012940707302, dev.epro.r0.X8134396307090105871):void");
    }

    public final boolean h(K17275736824900228431 k17275736824900228431, K17275736824900228431 k172757368249002284312, int i) {
        return m(i, k17275736824900228431) == m(i, k172757368249002284312);
    }

    public final void i(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (J3288146055636008296.j(G(i) & 1048575, obj) == null) {
            return;
        }
        j(i);
    }

    public final void j(int i) {
        if (this.b[E12098517352909843120.f(i, 3, 2, 1)] == null) {
            return;
        }
        Z3383101362411723454.s();
    }

    public final Object k(int i) {
        return this.b[(i / 3) * 2];
    }

    public final N10092264544134359582 l(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        N10092264544134359582 n10092264544134359582 = (N10092264544134359582) objArr[i2];
        if (n10092264544134359582 != null) {
            return n10092264544134359582;
        }
        N10092264544134359582 a = X1177226880161088161.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00f0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(int r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.m(int, java.lang.Object):boolean");
    }

    public final boolean o(int i, int i2, Object obj) {
        return J3288146055636008296.h((long) (this.a[i2 + 2] & 1048575), obj) == i;
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
    public final void p(java.lang.Object r8, int r9, java.lang.Object r10, dev.epro.r0.X8134396307090105871 r11, dev.epro.r0.E17564419012940707302 r12) {
        /*
            r7 = this;
            int r9 = r7.G(r9)
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r0
            long r0 = (long) r9
            java.lang.Object r9 = dev.epro.r0.J3288146055636008296.j(r0, r8)
            dev.epro.r0.E13260110309995934400 r7 = r7.m
            if (r9 != 0) goto L1e
            r7.getClass()
            dev.epro.r0.C12163932668652713734 r9 = dev.epro.r0.C12163932668652713734.b
            dev.epro.r0.C12163932668652713734 r9 = r9.b()
            dev.epro.r0.J3288146055636008296.p(r0, r8, r9)
            goto L35
        L1e:
            r7.getClass()
            r2 = r9
            dev.epro.r0.C12163932668652713734 r2 = (dev.epro.r0.C12163932668652713734) r2
            boolean r2 = r2.a
            if (r2 != 0) goto L35
            dev.epro.r0.C12163932668652713734 r2 = dev.epro.r0.C12163932668652713734.b
            dev.epro.r0.C12163932668652713734 r2 = r2.b()
            dev.epro.r0.E13260110309995934400.a(r2, r9)
            dev.epro.r0.J3288146055636008296.p(r0, r8, r2)
            r9 = r2
        L35:
            r7.getClass()
            dev.epro.r0.C12163932668652713734 r9 = (dev.epro.r0.C12163932668652713734) r9
            dev.epro.r0.A13843307759923533495 r10 = (dev.epro.r0.A13843307759923533495) r10
            dev.epro.r0.Q7316561721656982910 r7 = r10.a
            r8 = 2
            r12.x0(r8)
            java.lang.Object r10 = r12.e
            dev.epro.r0.X4929887216837100213 r10 = (dev.epro.r0.X4929887216837100213) r10
            int r0 = r10.K()
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
            boolean r4 = r12.y0()     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            if (r4 == 0) goto L71
            goto L53
        L71:
            dev.epro.r0.F10620977331851870088 r4 = new dev.epro.r0.F10620977331851870088     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            throw r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
        L77:
            r7 = move-exception
            goto La4
        L79:
            java.lang.Object r4 = r7.c     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            dev.epro.r0.T18086906245708496780 r4 = (dev.epro.r0.T18086906245708496780) r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            java.lang.Class r5 = r1.getClass()     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            java.lang.Object r3 = r12.I(r4, r5, r11)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            goto L53
        L86:
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            dev.epro.r0.T18086906245708496780 r4 = (dev.epro.r0.T18086906245708496780) r4     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            r5 = 0
            java.lang.Object r2 = r12.I(r4, r5, r5)     // Catch: java.lang.Throwable -> L77 dev.epro.r0.Q13606351353383574666 -> L90
            goto L53
        L90:
            boolean r4 = r12.y0()     // Catch: java.lang.Throwable -> L77
            if (r4 == 0) goto L97
            goto L53
        L97:
            dev.epro.r0.F10620977331851870088 r7 = new dev.epro.r0.F10620977331851870088     // Catch: java.lang.Throwable -> L77
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
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.P7591164690024652748.p(java.lang.Object, int, java.lang.Object, dev.epro.r0.X8134396307090105871, dev.epro.r0.E17564419012940707302):void");
    }

    public final void q(int i, Object obj, Object obj2) {
        if (m(i, obj2)) {
            long G = G(i) & 1048575;
            Unsafe unsafe = f437o;
            Object object = unsafe.getObject(obj2, G);
            if (object == null) {
                D11988991656201568495.g(this.a[i], obj2);
                return;
            }
            N10092264544134359582 l = l(i);
            if (!m(i, obj)) {
                if (n(object)) {
                    K17275736824900228431 d = l.d();
                    l.a(d, object);
                    unsafe.putObject(obj, G, d);
                } else {
                    unsafe.putObject(obj, G, object);
                }
                D(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, G);
            if (!n(object2)) {
                K17275736824900228431 d2 = l.d();
                l.a(d2, object2);
                unsafe.putObject(obj, G, d2);
                object2 = d2;
            }
            l.a(object2, object);
        }
    }

    public final void r(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (o(i2, i, obj2)) {
            long G = G(i) & 1048575;
            Unsafe unsafe = f437o;
            Object object = unsafe.getObject(obj2, G);
            if (object == null) {
                D11988991656201568495.g(iArr[i], obj2);
                return;
            }
            N10092264544134359582 l = l(i);
            if (!o(i2, i, obj)) {
                if (n(object)) {
                    K17275736824900228431 d = l.d();
                    l.a(d, object);
                    unsafe.putObject(obj, G, d);
                } else {
                    unsafe.putObject(obj, G, object);
                }
                E(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, G);
            if (!n(object2)) {
                K17275736824900228431 d2 = l.d();
                l.a(d2, object2);
                unsafe.putObject(obj, G, d2);
                object2 = d2;
            }
            l.a(object2, object);
        }
    }

    public final Object s(int i, Object obj) {
        N10092264544134359582 l = l(i);
        long G = G(i) & 1048575;
        if (!m(i, obj)) {
            return l.d();
        }
        Object object = f437o.getObject(obj, G);
        if (n(object)) {
            return object;
        }
        K17275736824900228431 d = l.d();
        if (object != null) {
            l.a(d, object);
        }
        return d;
    }

    public final Object t(int i, int i2, Object obj) {
        N10092264544134359582 l = l(i2);
        if (!o(i, i2, obj)) {
            return l.d();
        }
        Object object = f437o.getObject(obj, G(i2) & 1048575);
        if (n(object)) {
            return object;
        }
        K17275736824900228431 d = l.d();
        if (object != null) {
            l.a(d, object);
        }
        return d;
    }

    public final void y(Object obj, long j, E17564419012940707302 e17564419012940707302, N10092264544134359582 n10092264544134359582, X8134396307090105871 x8134396307090105871) {
        int A;
        List c = this.k.c(j, obj);
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) e17564419012940707302.e;
        int i = e17564419012940707302.b;
        if ((i & 7) != 3) {
            throw F10620977331851870088.b();
        }
        do {
            K17275736824900228431 d = n10092264544134359582.d();
            e17564419012940707302.o(d, n10092264544134359582, x8134396307090105871);
            n10092264544134359582.b(d);
            c.add(d);
            if (x4929887216837100213.c() || e17564419012940707302.d != 0) {
                return;
            } else {
                A = x4929887216837100213.A();
            }
        } while (A == i);
        e17564419012940707302.d = A;
    }

    public final void z(Object obj, int i, E17564419012940707302 e17564419012940707302, N10092264544134359582 n10092264544134359582, X8134396307090105871 x8134396307090105871) {
        int A;
        List c = this.k.c(i & 1048575, obj);
        X4929887216837100213 x4929887216837100213 = (X4929887216837100213) e17564419012940707302.e;
        int i2 = e17564419012940707302.b;
        if ((i2 & 7) != 2) {
            throw F10620977331851870088.b();
        }
        do {
            K17275736824900228431 d = n10092264544134359582.d();
            e17564419012940707302.r(d, n10092264544134359582, x8134396307090105871);
            n10092264544134359582.b(d);
            c.add(d);
            if (x4929887216837100213.c() || e17564419012940707302.d != 0) {
                return;
            } else {
                A = x4929887216837100213.A();
            }
        } while (A == i2);
        e17564419012940707302.d = A;
    }
}
