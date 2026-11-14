package dev.epro.r0;

import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X4173267666364425010 extends H677490115963445910 {
    public final ArrayList h;

    public X4173267666364425010(Q3622318280241842965 q3622318280241842965, boolean z, ArrayList arrayList, F16470721565862751885 f16470721565862751885, M11321907364395208344 m11321907364395208344) {
        super(q3622318280241842965, f16470721565862751885, null);
        this.h = arrayList;
        this.g = z;
    }

    @Override // dev.epro.r0.J9761478802862050991
    public final Q2936994053173258289 a() {
        return Q2936994053173258289.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            J9761478802862050991 j9761478802862050991 = (J9761478802862050991) obj;
            if (j9761478802862050991 instanceof H677490115963445910) {
                sb.append(System.identityHashCode(j9761478802862050991));
            } else {
                sb.append(j9761478802862050991.toString());
            }
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return "<" + X4173267666364425010.class.getName() + " (tag=" + this.a + ", value=[" + ((Object) sb) + "])>";
    }
}
