package dev.epro.r0;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U1644378183406225904 extends Z7808710623398649085 {
    public static final W17049324151557986874 q = new W17049324151557986874();
    public static final HashMap r;
    public static final int[][] s;
    public static final Pattern t;
    public static final Pattern u;
    public final F6942723054099263096 p;

    static {
        HashMap map = new HashMap();
        r = map;
        Boolean bool = Boolean.TRUE;
        map.put("yes", bool);
        Boolean bool2 = Boolean.FALSE;
        map.put("no", bool2);
        map.put("true", bool);
        map.put("false", bool2);
        map.put("on", bool);
        map.put("off", bool2);
        s = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 17, 2);
        int[] iArr = {2, 8, 10, 16};
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            s[i2] = new int[]{Integer.toString(Integer.MAX_VALUE, i2).length(), Long.toString(Long.MAX_VALUE, i2).length()};
        }
        t = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)(?:(?:[Tt]|[ \t]+)([0-9][0-9]?):([0-9][0-9]):([0-9][0-9])(?:\\.([0-9]*))?(?:[ \t]*(?:Z|([-+][0-9][0-9]?)(?::([0-9][0-9])?)?))?)?$");
        u = Pattern.compile("^([0-9][0-9][0-9][0-9])-([0-9][0-9]?)-([0-9][0-9]?)$");
    }

    public U1644378183406225904(J7183379813836568005 j7183379813836568005) {
        super(j7183379813836568005);
        this.p = new F6942723054099263096(U1644378183406225904.class.getName());
        this.b.put(Q3622318280241842965.m, new W17049324151557986874(this, (byte) 5));
        byte b = 2;
        this.b.put(Q3622318280241842965.l, new W17049324151557986874(this, b));
        this.b.put(Q3622318280241842965.i, new W17049324151557986874(this, (byte) 4));
        this.b.put(Q3622318280241842965.j, new W17049324151557986874(this, (byte) 3));
        byte b2 = 1;
        this.b.put(Q3622318280241842965.h, new W17049324151557986874(this, b2));
        this.b.put(Q3622318280241842965.k, new B3581176855676906576());
        byte b3 = 0;
        this.b.put(Q3622318280241842965.g, new B3581176855676906576(this, b3));
        this.b.put(Q3622318280241842965.f, new B3581176855676906576(this, b2));
        this.b.put(Q3622318280241842965.e, new N13861526141363693557(this, b));
        this.b.put(Q3622318280241842965.n, new W17049324151557986874(this, (byte) 6));
        this.b.put(Q3622318280241842965.f452o, new N13861526141363693557(this, b2));
        this.b.put(Q3622318280241842965.p, new N13861526141363693557(this, b3));
        HashMap map = this.b;
        W17049324151557986874 w17049324151557986874 = q;
        map.put(null, w17049324151557986874);
        this.a.put(Q2936994053173258289.a, w17049324151557986874);
        this.a.put(Q2936994053173258289.b, w17049324151557986874);
        this.a.put(Q2936994053173258289.c, w17049324151557986874);
    }

    public static Number f(int i, int i2, String str) {
        int length = str != null ? str.length() : 0;
        if (i < 0) {
            str = G6547577305291411977.C("-", str);
        }
        int[][] iArr = s;
        int[] iArr2 = i2 < iArr.length ? iArr[i2] : null;
        if (iArr2 == null || length <= iArr2[0]) {
            try {
                try {
                    return Integer.valueOf(str, i2);
                } catch (NumberFormatException unused) {
                    return new BigInteger(str, i2);
                }
            } catch (NumberFormatException unused2) {
                return Long.valueOf(str, i2);
            }
        }
        if (length > iArr2[1]) {
            return new BigInteger(str, i2);
        }
        try {
            return Long.valueOf(str, i2);
        } catch (NumberFormatException unused3) {
            return new BigInteger(str, i2);
        }
    }

    public final void d(A12478465957355731346 a12478465957355731346, Map map) {
        g(a12478465957355731346);
        for (S16582019754975640369 s16582019754975640369 : a12478465957355731346.h) {
            J9761478802862050991 j9761478802862050991 = s16582019754975640369.a;
            J9761478802862050991 j97614788028620509912 = s16582019754975640369.b;
            Object objA = a(j9761478802862050991);
            if (objA != null) {
                try {
                    objA.hashCode();
                } catch (Exception e) {
                    throw new P13193549499509261669("while constructing a mapping", a12478465957355731346.b, "found unacceptable key " + objA, j9761478802862050991.b, e, 0);
                } catch (StackOverflowError e2) {
                    throw new P13193549499509261669("while constructing a mapping", a12478465957355731346.b, "found recursive key that is not allowed", j9761478802862050991.b, e2, 0);
                }
            }
            Object objA2 = a(j97614788028620509912);
            if (j9761478802862050991.e) {
                throw new M8821877208104636290("Recursive key for mapping is detected but it is not configured to be allowed.");
            }
            map.put(objA, objA2);
        }
    }

    public final void e(A12478465957355731346 a12478465957355731346, Set set) {
        g(a12478465957355731346);
        Iterator it = a12478465957355731346.h.iterator();
        while (it.hasNext()) {
            J9761478802862050991 j9761478802862050991 = ((S16582019754975640369) it.next()).a;
            Object objA = a(j9761478802862050991);
            if (objA != null) {
                try {
                    objA.hashCode();
                } catch (Exception e) {
                    throw new P13193549499509261669("while constructing a Set", a12478465957355731346.b, "found unacceptable key " + objA, j9761478802862050991.b, e, 0);
                } catch (StackOverflowError e2) {
                    throw new P13193549499509261669("while constructing a Set", a12478465957355731346.b, "found recursive key that is not allowed", j9761478802862050991.b, e2, 0);
                }
            }
            if (j9761478802862050991.e) {
                this.h.add(0, new Q9019895912264550339(set, objA));
            } else {
                set.add(objA);
            }
        }
    }

    public final void g(A12478465957355731346 a12478465957355731346) {
        List<S16582019754975640369> list = a12478465957355731346.h;
        HashMap map = new HashMap(list.size());
        TreeSet treeSet = new TreeSet();
        int i = 0;
        for (S16582019754975640369 s16582019754975640369 : list) {
            J9761478802862050991 j9761478802862050991 = s16582019754975640369.a;
            if (!j9761478802862050991.a.equals(Q3622318280241842965.d)) {
                Object objA = a(j9761478802862050991);
                if (objA != null && j9761478802862050991.e) {
                    throw new M8821877208104636290("Recursive key for mapping is detected but it is not configured to be allowed.");
                }
                Integer num = (Integer) map.put(objA, Integer.valueOf(i));
                if (num == null) {
                    continue;
                } else {
                    if (!this.k) {
                        throw new G4732557466703466162("while constructing a mapping", a12478465957355731346.b, "found duplicate key " + objA, s16582019754975640369.a.b);
                    }
                    if (this.l) {
                        Z9049209052836541437 z9049209052836541437 = Z9049209052836541437.WARNING;
                        this.p.getClass();
                        Level level = z9049209052836541437.a;
                    }
                    treeSet.add(num);
                }
            }
            i++;
        }
        Iterator itDescendingIterator = treeSet.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            list.remove(((Integer) itDescendingIterator.next()).intValue());
        }
        if (a12478465957355731346.i) {
            HashMap map2 = new HashMap();
            ArrayList arrayList = new ArrayList();
            h(a12478465957355731346, true, map2, arrayList);
            a12478465957355731346.h = arrayList;
        }
    }

    public final void h(A12478465957355731346 a12478465957355731346, boolean z, HashMap map, ArrayList arrayList) {
        List list = a12478465957355731346.h;
        F16470721565862751885 f16470721565862751885 = a12478465957355731346.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S16582019754975640369 s16582019754975640369 = (S16582019754975640369) it.next();
            J9761478802862050991 j9761478802862050991 = s16582019754975640369.a;
            J9761478802862050991 j97614788028620509912 = s16582019754975640369.b;
            if (j9761478802862050991.a.equals(Q3622318280241842965.d)) {
                it.remove();
                int iOrdinal = j97614788028620509912.a().ordinal();
                if (iOrdinal == 1) {
                    ArrayList arrayList2 = ((X4173267666364425010) j97614788028620509912).h;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        J9761478802862050991 j97614788028620509913 = (J9761478802862050991) obj;
                        if (!(j97614788028620509913 instanceof A12478465957355731346)) {
                            throw new P13193549499509261669("while constructing a mapping", f16470721565862751885, "expected a mapping for merging, but found " + j97614788028620509913.a(), j97614788028620509913.b);
                        }
                        h((A12478465957355731346) j97614788028620509913, false, map, arrayList);
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw new P13193549499509261669("while constructing a mapping", f16470721565862751885, "expected a mapping or list of mappings for merging, but found " + j97614788028620509912.a(), j97614788028620509912.b);
                    }
                    h((A12478465957355731346) j97614788028620509912, false, map, arrayList);
                }
            } else {
                Object objA = a(j9761478802862050991);
                if (!map.containsKey(objA)) {
                    arrayList.add(s16582019754975640369);
                    map.put(objA, Integer.valueOf(arrayList.size() - 1));
                } else if (z) {
                    arrayList.set(((Integer) map.get(objA)).intValue(), s16582019754975640369);
                }
            }
        }
    }
}
