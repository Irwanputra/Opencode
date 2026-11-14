package dev.epro.r0;

import ads_mobile_sdk.ha;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C7508661312750798838 extends R4239627874707364917 implements K3615309688696506893 {
    @Override // dev.epro.r0.K3615309688696506893
    public final O9245300239821758723 a(R12517428114166698439 r12517428114166698439, R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            R12517428114166698439 r125174281141666984392 = r12517428114166698439;
            H4546125934900659656 h4546125934900659656 = new H4546125934900659656(str, value, (R4833348786910499294) null, r125174281141666984392, (byte) 5);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(h4546125934900659656, null, (byte) 1), 2);
            r12517428114166698439 = r125174281141666984392;
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.K3615309688696506893
    public final Object f(R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            ha haVar = new ha(str, value, null, (byte) 2);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, null, (byte) 1), 2);
        }
        return O9245300239821758723.a;
    }

    @Override // dev.epro.r0.K3615309688696506893
    public final Object k(R4833348786910499294 r4833348786910499294) {
        for (Map.Entry entry : ((Map) this.b).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            W5797197595347441198 w5797197595347441198 = (W5797197595347441198) this.a;
            ha haVar = new ha(str, value, null, (byte) 5);
            w5797197595347441198.getClass();
            R7033599853981556291.E(w5797197595347441198, I3826119971291161142.a, null, new P7598478828797568949(haVar, null, (byte) 1), 2);
        }
        return O9245300239821758723.a;
    }
}
