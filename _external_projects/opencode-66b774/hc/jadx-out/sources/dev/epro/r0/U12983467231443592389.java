package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class U12983467231443592389 extends G7076977976257453122 {
    public static final U12983467231443592389 c = new U12983467231443592389("Undefined intrinsics block and it is required", 0);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U12983467231443592389(String str, byte b) {
        super(str);
        this.b = b;
    }

    @Override // dev.epro.r0.A10838822263452390785
    public final H11646813293457574213 c(I5164649337253478959 i5164649337253478959, List list, long j) {
        switch (this.b) {
            case 0:
                int size = list.size();
                X9852054718446117252 x9852054718446117252 = X9852054718446117252.a;
                if (size == 0) {
                    return i5164649337253478959.m(I16980768508151520658.k(j), I16980768508151520658.j(j), x9852054718446117252, new V3436737973405206042((byte) 8));
                }
                if (size == 1) {
                    Z17471428274427141949 z17471428274427141949D = ((G17613326942144185441) list.get(0)).d(j);
                    return i5164649337253478959.m(O15160157444238005800.g(z17471428274427141949D.a, j), O15160157444238005800.f(z17471428274427141949D.b, j), x9852054718446117252, new Y17164194448930251553(z17471428274427141949D, (byte) 12));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    Z17471428274427141949 z17471428274427141949D2 = ((G17613326942144185441) list.get(i)).d(j);
                    iMax = Math.max(z17471428274427141949D2.a, iMax);
                    iMax2 = Math.max(z17471428274427141949D2.b, iMax2);
                    arrayList.add(z17471428274427141949D2);
                }
                return i5164649337253478959.m(O15160157444238005800.g(iMax, j), O15160157444238005800.f(iMax2, j), x9852054718446117252, new F13955903607202506287(arrayList, (byte) 6));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
