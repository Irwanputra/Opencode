package dev.epro.r0;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class H6457936572911484476 implements Map, Serializable, Z39764727109350747 {
    public static final H6457936572911484476 n;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public X9660226676473241716 j;
    public S5911664163520104644 k;
    public X9660226676473241716 l;
    public boolean m;

    static {
        H6457936572911484476 h6457936572911484476 = new H6457936572911484476(0);
        h6457936572911484476.m = true;
        n = h6457936572911484476;
    }

    public H6457936572911484476(int i) {
        if (i < 0) {
            S10973172697741180971.j("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.d = new int[highestOneBit];
        this.e = 2;
        this.f = 0;
        this.g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.e * 2;
            int length = this.d.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.d;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.f;
                    Object[] objArr = this.a;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.f = i6;
                        objArr[i5] = obj;
                        this.c[i5] = i;
                        iArr[i] = i6;
                        this.i++;
                        this.h++;
                        if (i3 > this.e) {
                            this.e = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (S10823041268949770285.t(this.a[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.d.length * 2);
                        break;
                    }
                    i = i == 0 ? this.d.length - 1 : i - 1;
                }
            }
        }
    }

    public final H6457936572911484476 b() {
        c();
        this.m = true;
        if (this.i > 0) {
            return this;
        }
        H6457936572911484476 h6457936572911484476 = n;
        h6457936572911484476.getClass();
        return h6457936572911484476;
    }

    public final void c() {
        if (this.m) {
            Z3383101362411723454.t();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        C9869900372345142877.Q(this.a, 0, this.f);
        Object[] objArr = this.b;
        if (objArr != null) {
            C9869900372345142877.Q(objArr, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        this.h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        C9869900372345142877.Q(this.a, i3, i);
        if (objArr != null) {
            C9869900372345142877.Q(objArr, i3, this.f);
        }
        this.f = i3;
    }

    public final boolean e(Collection collection) {
        boolean t;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        t = false;
                    } else {
                        Object[] objArr = this.b;
                        objArr.getClass();
                        t = S10823041268949770285.t(objArr[g], entry.getValue());
                    }
                    if (!t) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        X9660226676473241716 x9660226676473241716 = this.l;
        if (x9660226676473241716 != null) {
            return x9660226676473241716;
        }
        X9660226676473241716 x96602266764732417162 = new X9660226676473241716(this, (byte) 0);
        this.l = x96602266764732417162;
        return x96602266764732417162;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.i == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.f;
        int i3 = length - i2;
        int i4 = i2 - this.i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.b;
            this.b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.c = Arrays.copyOf(this.c, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.d.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.e;
        while (true) {
            int i3 = this.d[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (S10823041268949770285.t(this.a[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.d.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                Object[] objArr = this.b;
                objArr.getClass();
                if (S10823041268949770285.t(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        R14031816171567756273 r14031816171567756273 = new R14031816171567756273(this, (byte) 0);
        int i = 0;
        while (r14031816171567756273.hasNext()) {
            int i2 = r14031816171567756273.a;
            H6457936572911484476 h6457936572911484476 = (H6457936572911484476) r14031816171567756273.d;
            if (i2 >= h6457936572911484476.f) {
                Z3383101362411723454.u();
                return 0;
            }
            r14031816171567756273.a = i2 + 1;
            r14031816171567756273.b = i2;
            Object obj = h6457936572911484476.a[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = h6457936572911484476.b;
            objArr.getClass();
            Object obj2 = objArr[r14031816171567756273.b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            r14031816171567756273.c();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.g;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.i == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.h
            int r0 = r0 + 1
            r5.h = r0
            int r0 = r5.f
            int r1 = r5.i
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.d = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.g = r6
        L1c:
            int r6 = r5.f
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.a
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.e
        L2c:
            int[] r3 = r5.d
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            dev.epro.r0.S10973172697741180971.m(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.H6457936572911484476.j(int):void");
    }

    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.a;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.b;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int i5 = this.c[i];
        loop0: while (true) {
            int i6 = i5;
            int i7 = 0;
            do {
                i5 = i5 == 0 ? this.d.length - 1 : i5 - 1;
                int[] iArr2 = this.d;
                i2 = iArr2[i5];
                i7++;
                if (i7 > this.e) {
                    iArr2[i6] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i6] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.a[i3]) - i5;
                    iArr = this.d;
                }
            } while ((i4 & (iArr.length - 1)) < i7);
            iArr[i6] = i2;
            this.c[i3] = i6;
        }
        this.c[i] = -1;
        this.i--;
        this.h++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        X9660226676473241716 x9660226676473241716 = this.j;
        if (x9660226676473241716 != null) {
            return x9660226676473241716;
        }
        X9660226676473241716 x96602266764732417162 = new X9660226676473241716(this, (byte) 1);
        this.j = x96602266764732417162;
        return x96602266764732417162;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                S10973172697741180971.j("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i = (-a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    S10973172697741180971.j("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.b = objArr;
                }
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i = (-a) - 1;
                if (!S10823041268949770285.t(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.b;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.i * 3) + 2);
        sb.append("{");
        int i = 0;
        R14031816171567756273 r14031816171567756273 = new R14031816171567756273(this, (byte) 0);
        while (r14031816171567756273.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = r14031816171567756273.a;
            H6457936572911484476 h6457936572911484476 = (H6457936572911484476) r14031816171567756273.d;
            if (i2 >= h6457936572911484476.f) {
                Z3383101362411723454.u();
                return null;
            }
            r14031816171567756273.a = i2 + 1;
            r14031816171567756273.b = i2;
            Object obj = h6457936572911484476.a[i2];
            if (obj == h6457936572911484476) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = h6457936572911484476.b;
            objArr.getClass();
            Object obj2 = objArr[r14031816171567756273.b];
            if (obj2 == h6457936572911484476) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            r14031816171567756273.c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        S5911664163520104644 s5911664163520104644 = this.k;
        if (s5911664163520104644 != null) {
            return s5911664163520104644;
        }
        S5911664163520104644 s59116641635201046442 = new S5911664163520104644(this, (byte) 0);
        this.k = s59116641635201046442;
        return s59116641635201046442;
    }

    public H6457936572911484476() {
        this(8);
    }
}
