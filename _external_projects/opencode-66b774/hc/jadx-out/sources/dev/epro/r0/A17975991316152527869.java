package dev.epro.r0;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class A17975991316152527869 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final O15869581661108952313 e;
    public final F10342546226345611902 f;
    public final boolean g = false;
    public final int h;
    public final int[] i;
    public int j;
    public int k;

    public A17975991316152527869(int i, int i2, List list, long j, Object obj, O15869581661108952313 o15869581661108952313, F10342546226345611902 f10342546226345611902) {
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = o15869581661108952313;
        this.f = f10342546226345611902;
        int size = list.size();
        int iMax = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Z17471428274427141949 z17471428274427141949 = (Z17471428274427141949) list.get(i3);
            iMax = Math.max(iMax, !this.g ? z17471428274427141949.b : z17471428274427141949.a);
        }
        this.h = iMax;
        this.i = new int[this.b.size() * 2];
        this.k = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.j += i;
        int[] iArr = this.i;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.g;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        this.j = i;
        boolean z = this.g;
        this.k = z ? i3 : i2;
        List list = this.b;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Z17471428274427141949 z17471428274427141949 = (Z17471428274427141949) list.get(i5);
            int i6 = i5 * 2;
            int[] iArr = this.i;
            if (z) {
                iArr[i6] = Math.round((1.0f + (this.f != F10342546226345611902.a ? 0.0f * (-1.0f) : 0.0f)) * ((i2 - z17471428274427141949.a) / 2.0f));
                iArr[i6 + 1] = i;
                i4 = z17471428274427141949.b;
            } else {
                iArr[i6] = i;
                iArr[i6 + 1] = this.e.a(z17471428274427141949.b, i3);
                i4 = z17471428274427141949.a;
            }
            i += i4;
        }
    }
}
