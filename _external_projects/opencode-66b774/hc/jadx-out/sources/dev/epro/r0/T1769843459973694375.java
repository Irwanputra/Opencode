package dev.epro.r0;

import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T1769843459973694375 implements B13729205492206812220 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ E3889562084885881810 b;

    public /* synthetic */ T1769843459973694375(E3889562084885881810 e3889562084885881810, byte b) {
        this.a = b;
        this.b = e3889562084885881810;
    }

    @Override // dev.epro.r0.B13729205492206812220
    public final Object invoke() {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        E3889562084885881810 e3889562084885881810 = this.b;
        switch (b) {
            case 0:
                N5230833122018532994.m(e3889562084885881810);
                break;
            case 1:
                e3889562084885881810.z.C();
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                e3889562084885881810.B.saveHierarchyState(sparseArray);
                break;
            case 3:
                E3889562084885881810.n(e3889562084885881810);
                break;
            case 4:
                e3889562084885881810.F.invoke(e3889562084885881810.B);
                break;
            default:
                e3889562084885881810.E.invoke(e3889562084885881810.B);
                break;
        }
        return o9245300239821758723;
    }
}
