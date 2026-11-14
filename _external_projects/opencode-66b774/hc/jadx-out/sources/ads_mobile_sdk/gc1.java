package ads_mobile_sdk;

import dev.epro.r0.I9096980162579903974;
import dev.epro.r0.J12043550928838212009;
import dev.epro.r0.O9245300239821758723;
import dev.epro.r0.R4833348786910499294;
import dev.epro.r0.S7864201625552763331;
import dev.epro.r0.Z3437138737604933638;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class gc1 implements J12043550928838212009 {
    public final /* synthetic */ J12043550928838212009 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ byte c;

    public /* synthetic */ gc1(J12043550928838212009 j12043550928838212009, Object obj, byte b) {
        this.c = b;
        this.a = j12043550928838212009;
        this.b = obj;
    }

    @Override // dev.epro.r0.J12043550928838212009
    public final Object collect(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294) {
        byte b = this.c;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        Object obj = this.b;
        J12043550928838212009 j12043550928838212009 = this.a;
        switch (b) {
            case 0:
                Object objCollect = j12043550928838212009.collect(new fc1(s7864201625552763331, (jc1) obj, (byte) 0), r4833348786910499294);
                return objCollect == z3437138737604933638 ? objCollect : o9245300239821758723;
            case 1:
                Object objCollect2 = j12043550928838212009.collect(new go2(s7864201625552763331, (wo2) obj), r4833348786910499294);
                return objCollect2 == z3437138737604933638 ? objCollect2 : o9245300239821758723;
            default:
                Object objCollect3 = j12043550928838212009.collect(new fc1(s7864201625552763331, (I9096980162579903974) obj, (byte) 1), r4833348786910499294);
                return objCollect3 == z3437138737604933638 ? objCollect3 : o9245300239821758723;
        }
    }
}
