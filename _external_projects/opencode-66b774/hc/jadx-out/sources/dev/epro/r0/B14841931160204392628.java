package dev.epro.r0;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B14841931160204392628 implements J12043550928838212009 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ J12043550928838212009 b;

    public /* synthetic */ B14841931160204392628(J12043550928838212009 j12043550928838212009, byte b) {
        this.a = b;
        this.b = j12043550928838212009;
    }

    @Override // dev.epro.r0.J12043550928838212009
    public final Object collect(S7864201625552763331 s7864201625552763331, R4833348786910499294 r4833348786910499294) {
        byte b = this.a;
        O9245300239821758723 o9245300239821758723 = O9245300239821758723.a;
        Z3437138737604933638 z3437138737604933638 = Z3437138737604933638.a;
        J12043550928838212009 j12043550928838212009 = this.b;
        switch (b) {
            case 0:
                Object objCollect = j12043550928838212009.collect(new Z10733167746954993267((Serializable) new A8284336046188466534(), s7864201625552763331, (byte) 1), r4833348786910499294);
                return objCollect == z3437138737604933638 ? objCollect : o9245300239821758723;
            default:
                Object objCollect2 = j12043550928838212009.collect(new T3328134245249980208(s7864201625552763331, (byte) 2), r4833348786910499294);
                return objCollect2 == z3437138737604933638 ? objCollect2 : o9245300239821758723;
        }
    }
}
