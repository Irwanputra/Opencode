package dev.epro.r0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class F12738319475220657879 extends H9330595680939527366 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient N7756202525712935399 b;

    public static int m(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max < 1073741824) {
            return 1073741824;
        }
        S10973172697741180971.j("collection too large");
        return 0;
    }

    public static F12738319475220657879 n(int i, Object... objArr) {
        if (i == 0) {
            return J9674324350959173737.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new B7579254048898546712(obj);
        }
        int m = m(i);
        Object[] objArr2 = new Object[m];
        int i2 = m - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                Z3383101362411723454.k(G6547577305291411977.n(i5, "at index "));
                return null;
            }
            int hashCode = obj2.hashCode();
            int Q = U16229988784104357932.Q(hashCode);
            while (true) {
                int i6 = Q & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += hashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                Q++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new B7579254048898546712(obj4);
        }
        if (m(i4) < m / 2) {
            return n(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new J9674324350959173737(i3, i2, i4, objArr, objArr2);
    }

    @Override // dev.epro.r0.H9330595680939527366
    public N7756202525712935399 a() {
        N7756202525712935399 n7756202525712935399 = this.b;
        if (n7756202525712935399 != null) {
            return n7756202525712935399;
        }
        N7756202525712935399 o2 = o();
        this.b = o2;
        return o2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof F12738319475220657879) && (this instanceof J9674324350959173737) && (((F12738319475220657879) obj) instanceof J9674324350959173737) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (this != obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                try {
                    if (size() == set.size()) {
                        if (containsAll(set)) {
                        }
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public N7756202525712935399 o() {
        Object[] array = toArray(H9330595680939527366.a);
        H13215157385046624211 h13215157385046624211 = N7756202525712935399.b;
        return N7756202525712935399.m(array.length, array);
    }
}
