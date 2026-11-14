package dev.epro.r0;

import ads_mobile_sdk.d33;
import ads_mobile_sdk.pu0;
import ads_mobile_sdk.z1;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class J4979391682597780614 extends R4239627874707364917 implements I12024973293062010767 {
    @Override // dev.epro.r0.I12024973293062010767
    public final Object a(d33 d33Var, z1 z1Var, F11004654978627682545 f11004654978627682545, R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            d33 d33Var2 = d33Var;
            z1 z1Var2 = z1Var;
            F11004654978627682545 f110046549786276825452 = f11004654978627682545;
            G6169168210557100605 g6169168210557100605 = new G6169168210557100605(str, value, (R4833348786910499294) null, d33Var2, z1Var2, f110046549786276825452);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(g6169168210557100605, null, (byte) 1), 2);
            d33Var = d33Var2;
            z1Var = z1Var2;
            f11004654978627682545 = f110046549786276825452;
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.I12024973293062010767
    public final Object a(pu0 pu0Var, F11004654978627682545 f11004654978627682545, R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            pu0 pu0Var2 = pu0Var;
            F11004654978627682545 f110046549786276825452 = f11004654978627682545;
            O12152244488187446230 o12152244488187446230 = new O12152244488187446230(str, value, (R4833348786910499294) null, (Object) pu0Var2, (Object) f110046549786276825452, (byte) 4);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(o12152244488187446230, null, (byte) 1), 2);
            pu0Var = pu0Var2;
            f11004654978627682545 = f110046549786276825452;
        }
        return O9245300239821758723.a;
    }
}
