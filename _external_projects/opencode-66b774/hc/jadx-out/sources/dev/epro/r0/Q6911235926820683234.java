package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class Q6911235926820683234 implements A10838822263452390785 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public Q6911235926820683234(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void f(ArrayList arrayList, A8284336046188466534 a8284336046188466534, I5164649337253478959 i5164649337253478959, float f, ArrayList arrayList2, ArrayList arrayList3, A8284336046188466534 a82843360461884665342, ArrayList arrayList4, A8284336046188466534 a82843360461884665343, A8284336046188466534 a82843360461884665344) {
        if (!arrayList.isEmpty()) {
            a8284336046188466534.a = i5164649337253478959.g0(f) + a8284336046188466534.a;
        }
        arrayList.add(0, R9411874267597469228.d1(arrayList2));
        arrayList3.add(Integer.valueOf(a82843360461884665342.a));
        arrayList4.add(Integer.valueOf(a8284336046188466534.a));
        a8284336046188466534.a += a82843360461884665342.a;
        a82843360461884665343.a = Math.max(a82843360461884665343.a, a82843360461884665344.a);
        arrayList2.clear();
        a82843360461884665344.a = 0;
        a82843360461884665342.a = 0;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(final I5164649337253478959 i5164649337253478959, List list, long j) {
        int i;
        Z17471428274427141949 z17471428274427141949;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        A8284336046188466534 a8284336046188466534 = new A8284336046188466534();
        A8284336046188466534 a82843360461884665342 = new A8284336046188466534();
        ArrayList arrayList4 = new ArrayList();
        A8284336046188466534 a82843360461884665343 = new A8284336046188466534();
        A8284336046188466534 a82843360461884665344 = new A8284336046188466534();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Z17471428274427141949 z17471428274427141949D = ((G17613326942144185441) list.get(i2)).d(j);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i3 = size;
            float f = this.a;
            if (zIsEmpty) {
                i = i2;
                z17471428274427141949 = z17471428274427141949D;
            } else {
                ArrayList arrayList5 = arrayList;
                A8284336046188466534 a82843360461884665345 = a82843360461884665342;
                if (i5164649337253478959.g0(f) + a82843360461884665343.a + z17471428274427141949D.a <= I16980768508151520658.i(j)) {
                    arrayList = arrayList5;
                    a82843360461884665342 = a82843360461884665345;
                    i = i2;
                    z17471428274427141949 = z17471428274427141949D;
                } else {
                    i = i2;
                    a82843360461884665342 = a82843360461884665345;
                    z17471428274427141949 = z17471428274427141949D;
                    arrayList = arrayList5;
                    f(arrayList, a82843360461884665342, i5164649337253478959, this.b, arrayList4, arrayList2, a82843360461884665344, arrayList3, a8284336046188466534, a82843360461884665343);
                }
            }
            if (!arrayList4.isEmpty()) {
                a82843360461884665343.a = i5164649337253478959.g0(f) + a82843360461884665343.a;
            }
            arrayList4.add(z17471428274427141949);
            a82843360461884665343.a += z17471428274427141949.a;
            a82843360461884665344.a = Math.max(a82843360461884665344.a, z17471428274427141949.b);
            i2 = i + 1;
            size = i3;
        }
        if (!arrayList4.isEmpty()) {
            f(arrayList, a82843360461884665342, i5164649337253478959, this.b, arrayList4, arrayList2, a82843360461884665344, arrayList3, a8284336046188466534, a82843360461884665343);
        }
        final int iMax = Math.max(a8284336046188466534.a, I16980768508151520658.k(j));
        int iMax2 = Math.max(a82843360461884665342.a, I16980768508151520658.j(j));
        final float f2 = this.a;
        return i5164649337253478959.m(iMax, iMax2, X9852054718446117252.a, new F4096073349764486348() { // from class: dev.epro.r0.J7398561734545154932
            @Override // dev.epro.r0.F4096073349764486348
            public final Object invoke(Object obj) {
                I5164649337253478959 i51646493372534789592;
                Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
                ArrayList arrayList6 = arrayList;
                int size2 = arrayList6.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    List list2 = (List) arrayList6.get(i4);
                    int size3 = list2.size();
                    int[] iArr = new int[size3];
                    int i5 = 0;
                    while (true) {
                        i51646493372534789592 = i5164649337253478959;
                        if (i5 >= size3) {
                            break;
                        }
                        iArr[i5] = ((Z17471428274427141949) list2.get(i5)).a + (i5 < list2.size() + (-1) ? i51646493372534789592.g0(f2) : 0);
                        i5++;
                    }
                    int[] iArr2 = new int[size3];
                    if (i51646493372534789592.getLayoutDirection() == F10342546226345611902.a) {
                        int i6 = 0;
                        for (int i7 = 0; i7 < size3; i7++) {
                            i6 += iArr[i7];
                        }
                        int i8 = iMax - i6;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < size3) {
                            int i11 = iArr[i9];
                            iArr2[i10] = i8;
                            i8 += i11;
                            i9++;
                            i10++;
                        }
                    } else {
                        int i12 = 0;
                        for (int i13 = size3 - 1; -1 < i13; i13--) {
                            int i14 = iArr[i13];
                            iArr2[i13] = i12;
                            i12 += i14;
                        }
                    }
                    int size4 = list2.size();
                    for (int i15 = 0; i15 < size4; i15++) {
                        y2066038017114788875.g((Z17471428274427141949) list2.get(i15), iArr2[i15], ((Number) arrayList3.get(i4)).intValue(), 0.0f);
                    }
                }
                return O9245300239821758723.a;
            }
        });
    }
}
