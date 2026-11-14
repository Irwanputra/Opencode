package dev.epro.r0;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class X7514233964374052440 implements L16757957611328596921 {
    public static final int[] g = new int[0];
    public static final Unsafe h;
    public final int[] a;
    public final Object[] b;
    public final L17990604304028499756 c;
    public final int[] d;
    public final int e;
    public final Y2677586711477821327 f;

    static {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new F2522870689781627311((byte) 5));
        } catch (Throwable unused) {
            unsafe = null;
        }
        h = unsafe;
    }

    public X7514233964374052440(int[] iArr, Object[] objArr, L17990604304028499756 l17990604304028499756, int[] iArr2, int i, Y2677586711477821327 y2677586711477821327, U11450443558875589191 u11450443558875589191) {
        this.a = iArr;
        this.b = objArr;
        this.d = iArr2;
        this.e = i;
        this.f = y2677586711477821327;
        this.c = l17990604304028499756;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof I10827619964430248728) {
            return ((I10827619964430248728) obj).e();
        }
        return true;
    }

    public static int k(long j, Object obj) {
        return ((Integer) Q4627374422374928592.g(j, obj)).intValue();
    }

    public static int l(int i) {
        return (i >>> 20) & 255;
    }

    public static long n(long j, Object obj) {
        return ((Long) Q4627374422374928592.g(j, obj)).longValue();
    }

    public static Field p(Class cls, String str) {
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
            String string = Arrays.toString(declaredFields);
            StringBuilder sbY = G6547577305291411977.y("Field ", str, " for ", name, " not found. Known fields are ");
            sbY.append(string);
            throw new RuntimeException(sbY.toString(), e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0323 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // dev.epro.r0.L16757957611328596921
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r27, dev.epro.r0.M204440408817344908 r28) {
        /*
            Method dump skipped, instruction units count: 2452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X7514233964374052440.a(java.lang.Object, dev.epro.r0.M204440408817344908):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    @Override // dev.epro.r0.L16757957611328596921
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X7514233964374052440.b(java.lang.Object):void");
    }

    @Override // dev.epro.r0.L16757957611328596921
    public final boolean c(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.e) {
            int i7 = this.d[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int iM = m(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = h.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & iM) == 0 || v(obj, i2, i, i3, i11)) {
                int iL = l(iM);
                if (iL != 9 && iL != 17) {
                    if (iL != 27) {
                        if (iL == 60 || iL == 68) {
                            if (!j(i8, i2, obj) || o(i2).c(Q4627374422374928592.g(iM & 1048575, obj))) {
                                i5++;
                                i6 = i;
                                i4 = i3;
                            }
                        } else if (iL != 49) {
                            if (iL != 50) {
                                continue;
                            } else {
                                J16368085059296921505 j16368085059296921505 = (J16368085059296921505) Q4627374422374928592.g(iM & 1048575, obj);
                                if (j16368085059296921505.isEmpty()) {
                                    continue;
                                } else {
                                    int i13 = i2 / 3;
                                    if (((I11511442489993941339) ((Y13857857809569647564) this.b[i13 + i13]).a.c).a == X12005299008365699314.i) {
                                        L16757957611328596921 l16757957611328596921A = null;
                                        for (Object obj2 : j16368085059296921505.values()) {
                                            if (l16757957611328596921A == null) {
                                                l16757957611328596921A = F13787414490045888232.c.a(obj2.getClass());
                                            }
                                            if (!l16757957611328596921A.c(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        }
                    }
                    List list = (List) Q4627374422374928592.g(iM & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        L16757957611328596921 l16757957611328596921O = o(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (l16757957611328596921O.c(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else if (!v(obj, i2, i, i3, i11) || o(i2).c(Q4627374422374928592.g(iM & 1048575, obj))) {
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    @Override // dev.epro.r0.L16757957611328596921
    public final void d(Object obj, Object obj2) {
        Object obj3;
        if (!i(obj)) {
            S10973172697741180971.j("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                D3437838952681165115.o(obj, obj2);
                return;
            }
            int iM = m(i);
            int i2 = iM & 1048575;
            int iL = l(iM);
            int i3 = iArr[i];
            long j = i2;
            switch (iL) {
                case 0:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        M2335452796812725357 m2335452796812725357 = Q4627374422374928592.c;
                        m2335452796812725357.o(obj3, j, m2335452796812725357.k(j, obj2));
                        s(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        M2335452796812725357 m23354527968127253572 = Q4627374422374928592.c;
                        m23354527968127253572.p(obj3, j, m23354527968127253572.l(j, obj2));
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.c.b.putLong(obj3, j, Q4627374422374928592.f(j, obj2));
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.c.b.putLong(obj3, j, Q4627374422374928592.f(j, obj2));
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.h(Q4627374422374928592.e(j, obj2), j, obj3);
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.c.b.putLong(obj3, j, Q4627374422374928592.f(j, obj2));
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.h(Q4627374422374928592.e(j, obj2), j, obj3);
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        M2335452796812725357 m23354527968127253573 = Q4627374422374928592.c;
                        m23354527968127253573.m(obj3, j, m23354527968127253573.q(j, obj2));
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.i(j, obj3, Q4627374422374928592.g(j, obj2));
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    q(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.i(j, obj3, Q4627374422374928592.g(j, obj2));
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 11:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.h(Q4627374422374928592.e(j, obj2), j, obj3);
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 12:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.h(Q4627374422374928592.e(j, obj2), j, obj3);
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.h(Q4627374422374928592.e(j, obj2), j, obj3);
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.c.b.putLong(obj3, j, Q4627374422374928592.f(j, obj2));
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (u(i, obj2)) {
                        Q4627374422374928592.h(Q4627374422374928592.e(j, obj2), j, obj3);
                        s(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (u(i, obj2)) {
                        obj3 = obj;
                        Q4627374422374928592.c.b.putLong(obj3, j, Q4627374422374928592.f(j, obj2));
                        s(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    q(i, obj, obj2);
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
                    K5888984147544128677 k5888984147544128677G = (K5888984147544128677) Q4627374422374928592.g(j, obj);
                    K5888984147544128677 k5888984147544128677 = (K5888984147544128677) Q4627374422374928592.g(j, obj2);
                    int size = k5888984147544128677G.size();
                    int size2 = k5888984147544128677.size();
                    if (size > 0 && size2 > 0) {
                        if (!((H10977569097456317418) k5888984147544128677G).a) {
                            k5888984147544128677G = k5888984147544128677G.g(size2 + size);
                        }
                        k5888984147544128677G.addAll(k5888984147544128677);
                    }
                    if (size > 0) {
                        k5888984147544128677 = k5888984147544128677G;
                    }
                    Q4627374422374928592.i(j, obj, k5888984147544128677);
                    break;
                case 50:
                    Y2677586711477821327 y2677586711477821327 = D3437838952681165115.a;
                    J16368085059296921505 j16368085059296921505 = (J16368085059296921505) Q4627374422374928592.g(j, obj);
                    J16368085059296921505 j163680850592969215052 = (J16368085059296921505) Q4627374422374928592.g(j, obj2);
                    if (!j163680850592969215052.isEmpty()) {
                        if (!j16368085059296921505.a) {
                            if (j16368085059296921505.isEmpty()) {
                                j16368085059296921505 = new J16368085059296921505();
                            } else {
                                J16368085059296921505 j163680850592969215053 = new J16368085059296921505(j16368085059296921505);
                                j163680850592969215053.a = true;
                                j16368085059296921505 = j163680850592969215053;
                            }
                        }
                        j16368085059296921505.a();
                        if (!j163680850592969215052.isEmpty()) {
                            j16368085059296921505.putAll(j163680850592969215052);
                        }
                    }
                    Q4627374422374928592.i(j, obj, j16368085059296921505);
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
                    if (j(i3, i, obj2)) {
                        Q4627374422374928592.i(j, obj, Q4627374422374928592.g(j, obj2));
                        Q4627374422374928592.h(i3, iArr[i + 2] & 1048575, obj);
                    }
                    break;
                case 60:
                    r(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (j(i3, i, obj2)) {
                        Q4627374422374928592.i(j, obj, Q4627374422374928592.g(j, obj2));
                        Q4627374422374928592.h(i3, iArr[i + 2] & 1048575, obj);
                    }
                    break;
                case 68:
                    r(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // dev.epro.r0.L16757957611328596921
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(dev.epro.r0.I10827619964430248728 r11) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X7514233964374052440.e(dev.epro.r0.I10827619964430248728):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0627 A[PHI: r17 r23 r24
      0x0627: PHI (r17v37 int) = (r17v23 int), (r17v24 int), (r17v29 int), (r17v31 int), (r17v32 int), (r17v33 int), (r17v36 int), (r17v38 int) binds: [B:267:0x07ed, B:263:0x07cb, B:246:0x0743, B:232:0x06d3, B:228:0x06b1, B:224:0x0691, B:217:0x064b, B:211:0x0625] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r23v21 int) = (r23v3 int), (r23v4 int), (r23v10 int), (r23v12 int), (r23v13 int), (r23v14 int), (r23v18 int), (r23v22 int) binds: [B:267:0x07ed, B:263:0x07cb, B:246:0x0743, B:232:0x06d3, B:228:0x06b1, B:224:0x0691, B:217:0x064b, B:211:0x0625] A[DONT_GENERATE, DONT_INLINE]
      0x0627: PHI (r24v20 int) = (r24v3 int), (r24v4 int), (r24v10 int), (r24v12 int), (r24v13 int), (r24v14 int), (r24v17 int), (r24v21 int) binds: [B:267:0x07ed, B:263:0x07cb, B:246:0x0743, B:232:0x06d3, B:228:0x06b1, B:224:0x0691, B:217:0x064b, B:211:0x0625] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0786 A[PHI: r17 r23 r24
      0x0786: PHI (r17v27 int) = (r17v22 int), (r17v28 int) binds: [B:271:0x080f, B:256:0x0784] A[DONT_GENERATE, DONT_INLINE]
      0x0786: PHI (r23v8 int) = (r23v2 int), (r23v9 int) binds: [B:271:0x080f, B:256:0x0784] A[DONT_GENERATE, DONT_INLINE]
      0x0786: PHI (r24v8 int) = (r24v2 int), (r24v9 int) binds: [B:271:0x080f, B:256:0x0784] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x035a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1068)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:390)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:23)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:370)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:85)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:33)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:70)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:23)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    @Override // dev.epro.r0.L16757957611328596921
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(dev.epro.r0.L17990604304028499756 r28) {
        /*
            Method dump skipped, instruction units count: 2788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.X7514233964374052440.f(dev.epro.r0.L17990604304028499756):int");
    }

    @Override // dev.epro.r0.L16757957611328596921
    public final boolean g(I10827619964430248728 i10827619964430248728, I10827619964430248728 i108276199644302487282) {
        boolean zE;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iM = m(i);
                long j = iM & 1048575;
                switch (l(iM)) {
                    case 0:
                        if (t(i10827619964430248728, i108276199644302487282, i)) {
                            M2335452796812725357 m2335452796812725357 = Q4627374422374928592.c;
                            if (Double.doubleToLongBits(m2335452796812725357.k(j, i10827619964430248728)) == Double.doubleToLongBits(m2335452796812725357.k(j, i108276199644302487282))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (t(i10827619964430248728, i108276199644302487282, i)) {
                            M2335452796812725357 m23354527968127253572 = Q4627374422374928592.c;
                            if (Float.floatToIntBits(m23354527968127253572.l(j, i10827619964430248728)) == Float.floatToIntBits(m23354527968127253572.l(j, i108276199644302487282))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.f(j, i10827619964430248728) == Q4627374422374928592.f(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.f(j, i10827619964430248728) == Q4627374422374928592.f(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.e(j, i10827619964430248728) == Q4627374422374928592.e(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.f(j, i10827619964430248728) == Q4627374422374928592.f(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.e(j, i10827619964430248728) == Q4627374422374928592.e(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (t(i10827619964430248728, i108276199644302487282, i)) {
                            M2335452796812725357 m23354527968127253573 = Q4627374422374928592.c;
                            if (m23354527968127253573.q(j, i10827619964430248728) == m23354527968127253573.q(j, i108276199644302487282)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (t(i10827619964430248728, i108276199644302487282, i) && D3437838952681165115.e(Q4627374422374928592.g(j, i10827619964430248728), Q4627374422374928592.g(j, i108276199644302487282))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (t(i10827619964430248728, i108276199644302487282, i) && D3437838952681165115.e(Q4627374422374928592.g(j, i10827619964430248728), Q4627374422374928592.g(j, i108276199644302487282))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (t(i10827619964430248728, i108276199644302487282, i) && D3437838952681165115.e(Q4627374422374928592.g(j, i10827619964430248728), Q4627374422374928592.g(j, i108276199644302487282))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.e(j, i10827619964430248728) == Q4627374422374928592.e(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.e(j, i10827619964430248728) == Q4627374422374928592.e(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.e(j, i10827619964430248728) == Q4627374422374928592.e(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.f(j, i10827619964430248728) == Q4627374422374928592.f(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.e(j, i10827619964430248728) == Q4627374422374928592.e(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (t(i10827619964430248728, i108276199644302487282, i) && Q4627374422374928592.f(j, i10827619964430248728) == Q4627374422374928592.f(j, i108276199644302487282)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (t(i10827619964430248728, i108276199644302487282, i) && D3437838952681165115.e(Q4627374422374928592.g(j, i10827619964430248728), Q4627374422374928592.g(j, i108276199644302487282))) {
                            continue;
                            i += 3;
                        }
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
                        zE = D3437838952681165115.e(Q4627374422374928592.g(j, i10827619964430248728), Q4627374422374928592.g(j, i108276199644302487282));
                        break;
                    case 50:
                        zE = D3437838952681165115.e(Q4627374422374928592.g(j, i10827619964430248728), Q4627374422374928592.g(j, i108276199644302487282));
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
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (Q4627374422374928592.e(j2, i10827619964430248728) == Q4627374422374928592.e(j2, i108276199644302487282) && D3437838952681165115.e(Q4627374422374928592.g(j, i10827619964430248728), Q4627374422374928592.g(j, i108276199644302487282))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                        break;
                }
                if (zE) {
                    i += 3;
                }
            } else if (i10827619964430248728.zzc.equals(i108276199644302487282.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // dev.epro.r0.L16757957611328596921
    public final I10827619964430248728 h() {
        return (I10827619964430248728) ((I10827619964430248728) this.c).f(4);
    }

    public final boolean j(int i, int i2, Object obj) {
        return Q4627374422374928592.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final int m(int i) {
        return this.a[i + 1];
    }

    public final L16757957611328596921 o(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        L16757957611328596921 l16757957611328596921 = (L16757957611328596921) objArr[i3];
        if (l16757957611328596921 != null) {
            return l16757957611328596921;
        }
        L16757957611328596921 l16757957611328596921A = F13787414490045888232.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = l16757957611328596921A;
        return l16757957611328596921A;
    }

    public final void q(int i, Object obj, Object obj2) {
        if (u(i, obj2)) {
            long jM = m(i) & 1048575;
            Unsafe unsafe = h;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.a[i] + " is present but null: " + obj2.toString());
            }
            L16757957611328596921 l16757957611328596921O = o(i);
            if (!u(i, obj)) {
                if (i(object)) {
                    I10827619964430248728 i10827619964430248728H = l16757957611328596921O.h();
                    l16757957611328596921O.d(i10827619964430248728H, object);
                    unsafe.putObject(obj, jM, i10827619964430248728H);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                s(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!i(object2)) {
                I10827619964430248728 i10827619964430248728H2 = l16757957611328596921O.h();
                l16757957611328596921O.d(i10827619964430248728H2, object2);
                unsafe.putObject(obj, jM, i10827619964430248728H2);
                object2 = i10827619964430248728H2;
            }
            l16757957611328596921O.d(object2, object);
        }
    }

    public final void r(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (j(i2, i, obj2)) {
            long jM = m(i) & 1048575;
            Unsafe unsafe = h;
            Object object = unsafe.getObject(obj2, jM);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            L16757957611328596921 l16757957611328596921O = o(i);
            if (!j(i2, i, obj)) {
                if (i(object)) {
                    I10827619964430248728 i10827619964430248728H = l16757957611328596921O.h();
                    l16757957611328596921O.d(i10827619964430248728H, object);
                    unsafe.putObject(obj, jM, i10827619964430248728H);
                } else {
                    unsafe.putObject(obj, jM, object);
                }
                Q4627374422374928592.h(i2, iArr[i + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM);
            if (!i(object2)) {
                I10827619964430248728 i10827619964430248728H2 = l16757957611328596921O.h();
                l16757957611328596921O.d(i10827619964430248728H2, object2);
                unsafe.putObject(obj, jM, i10827619964430248728H2);
                object2 = i10827619964430248728H2;
            }
            l16757957611328596921O.d(object2, object);
        }
    }

    public final void s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        Q4627374422374928592.h((1 << (i2 >>> 20)) | Q4627374422374928592.e(j, obj), j, obj);
    }

    public final boolean t(I10827619964430248728 i10827619964430248728, I10827619964430248728 i108276199644302487282, int i) {
        return u(i, i10827619964430248728) == u(i, i108276199644302487282);
    }

    public final boolean u(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & Q4627374422374928592.e(j, obj)) != 0;
        }
        int iM = m(i);
        long j2 = iM & 1048575;
        switch (l(iM)) {
            case 0:
                if (Double.doubleToRawLongBits(Q4627374422374928592.c.k(j2, obj)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(Q4627374422374928592.c.l(j2, obj)) != 0) {
                }
                break;
            case 2:
                if (Q4627374422374928592.f(j2, obj) != 0) {
                }
                break;
            case 3:
                if (Q4627374422374928592.f(j2, obj) != 0) {
                }
                break;
            case 4:
                if (Q4627374422374928592.e(j2, obj) != 0) {
                }
                break;
            case 5:
                if (Q4627374422374928592.f(j2, obj) != 0) {
                }
                break;
            case 6:
                if (Q4627374422374928592.e(j2, obj) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object objG = Q4627374422374928592.g(j2, obj);
                if (!(objG instanceof String)) {
                    if (!(objG instanceof A10473301933203002473)) {
                        K2042933864045806308.h();
                        break;
                    } else if (!A10473301933203002473.c.equals(objG)) {
                    }
                } else if (!((String) objG).isEmpty()) {
                }
                break;
            case 9:
                if (Q4627374422374928592.g(j2, obj) != null) {
                }
                break;
            case 10:
                if (!A10473301933203002473.c.equals(Q4627374422374928592.g(j2, obj))) {
                }
                break;
            case 11:
                if (Q4627374422374928592.e(j2, obj) != 0) {
                }
                break;
            case 12:
                if (Q4627374422374928592.e(j2, obj) != 0) {
                }
                break;
            case 13:
                if (Q4627374422374928592.e(j2, obj) != 0) {
                }
                break;
            case 14:
                if (Q4627374422374928592.f(j2, obj) != 0) {
                }
                break;
            case 15:
                if (Q4627374422374928592.e(j2, obj) != 0) {
                }
                break;
            case 16:
                if (Q4627374422374928592.f(j2, obj) != 0) {
                }
                break;
            case 17:
                if (Q4627374422374928592.g(j2, obj) != null) {
                }
                break;
            default:
                K2042933864045806308.h();
                break;
        }
        return false;
    }

    public final boolean v(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? u(i, obj) : (i3 & i4) != 0;
    }
}
