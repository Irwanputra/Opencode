package dev.epro.r0;

import java.util.Comparator;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class X16708831732427990575 implements Comparator {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ X16708831732427990575(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                K13841493441907392258 k13841493441907392258 = (K13841493441907392258) obj3;
                return ((Comparable) k13841493441907392258.invoke(obj)).compareTo((Comparable) k13841493441907392258.invoke(obj2));
            case 1:
                N2892298408695128503 n2892298408695128503 = (N2892298408695128503) obj3;
                return Integer.valueOf(n2892298408695128503.c(((Number) obj).longValue())).compareTo(Integer.valueOf(n2892298408695128503.c(((Number) obj2).longValue())));
            case 2:
                int compare = ((Comparator) obj3).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                H11725168162114556860 h11725168162114556860 = ((R6653624393204003746) obj).c;
                H11725168162114556860 h117251681621145568602 = ((R6653624393204003746) obj2).c;
                return h11725168162114556860.x() == h117251681621145568602.x() ? S10823041268949770285.z(h11725168162114556860.v(), h117251681621145568602.v()) : Float.compare(h11725168162114556860.x(), h117251681621145568602.x());
            default:
                int compare2 = ((X16708831732427990575) obj3).compare(obj, obj2);
                return compare2 != 0 ? compare2 : Integer.valueOf(((R6653624393204003746) obj).f).compareTo(Integer.valueOf(((R6653624393204003746) obj2).f));
        }
    }
}
