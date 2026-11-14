package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class Y6280176989120443622 implements S7864201625552763331 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ W1972671267364756056 c;

    public /* synthetic */ Y6280176989120443622(ArrayList arrayList, W1972671267364756056 w1972671267364756056, byte b) {
        this.a = b;
        this.b = arrayList;
        this.c = w1972671267364756056;
    }

    @Override // dev.epro.r0.S7864201625552763331
    public final Object emit(Object obj, R4833348786910499294 r4833348786910499294) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        W1972671267364756056 w1972671267364756056 = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                C3125267566254703773 c3125267566254703773 = (C3125267566254703773) obj;
                if (c3125267566254703773 instanceof G14063045981989969453) {
                    arrayList.add(c3125267566254703773);
                } else if (c3125267566254703773 instanceof T5663127441908862287) {
                    arrayList.remove(((T5663127441908862287) c3125267566254703773).a);
                }
                w1972671267364756056.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                C3125267566254703773 c31252675662547037732 = (C3125267566254703773) obj;
                if (c31252675662547037732 instanceof K10659578529083296487) {
                    arrayList.add(c31252675662547037732);
                } else if (c31252675662547037732 instanceof I128112093680520688) {
                    arrayList.remove(((I128112093680520688) c31252675662547037732).a);
                }
                w1972671267364756056.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return o9245300239821758723;
    }
}
