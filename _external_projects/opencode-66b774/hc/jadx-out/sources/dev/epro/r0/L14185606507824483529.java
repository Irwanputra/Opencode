package dev.epro.r0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class L14185606507824483529 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ W1972671267364756056 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ L14185606507824483529(W1972671267364756056 w1972671267364756056, ArrayList arrayList, List list, boolean z, byte b) {
        this.a = b;
        this.b = w1972671267364756056;
        this.c = arrayList;
        this.d = list;
        this.e = z;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = this.e;
        List list = this.d;
        ArrayList arrayList = this.c;
        W1972671267364756056 w1972671267364756056 = this.b;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Y2066038017114788875 y2066038017114788875 = (Y2066038017114788875) obj;
        switch (b) {
            case 0:
                y2066038017114788875.a = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((V2435767323669307206) arrayList.get(i)).m(y2066038017114788875, z);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((V2435767323669307206) list.get(i2)).m(y2066038017114788875, z);
                }
                y2066038017114788875.a = false;
                w1972671267364756056.getValue();
                break;
            default:
                y2066038017114788875.a = true;
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((H3043063065558747866) arrayList.get(i3)).n(y2066038017114788875, z);
                }
                int size4 = list.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((H3043063065558747866) list.get(i4)).n(y2066038017114788875, z);
                }
                y2066038017114788875.a = false;
                w1972671267364756056.getValue();
                break;
        }
        return o9245300239821758723;
    }
}
