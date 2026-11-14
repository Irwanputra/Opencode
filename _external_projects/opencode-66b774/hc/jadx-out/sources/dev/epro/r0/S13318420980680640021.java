package dev.epro.r0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S13318420980680640021 {
    public static final E1092155023341394263 a(E1092155023341394263 e1092155023341394263) {
        if (!(e1092155023341394263 instanceof E1092155023341394263)) {
            e1092155023341394263 = null;
        }
        if (e1092155023341394263 != null) {
            return e1092155023341394263;
        }
        N2332913310205178802.b("Inconsistent composition");
        Z3383101362411723454.n();
        return null;
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iC = c(arrayList, i, i2);
        return iC >= 0 ? iC : -(iC + 1);
    }

    public static final int c(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((M7798980774515057476) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iZ = S10823041268949770285.z(i5, i);
            if (iZ < 0) {
                i3 = i4 + 1;
            } else {
                if (iZ <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int d(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }

    public static final void f(int i, int i2, int[] iArr) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }
}
