package dev.epro.r0;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C3286149729114985901 {
    public final HashMap a;
    public final HashMap b;

    public C3286149729114985901(A1960181136934585864 a1960181136934585864) {
        this.a = new HashMap(a1960181136934585864.a);
        this.b = new HashMap(a1960181136934585864.b);
    }

    public final Object a(Z1953481206310471956 z1953481206310471956, Class cls) throws GeneralSecurityException {
        C5577211331494591160 c5577211331494591160 = new C5577211331494591160(z1953481206310471956.getClass(), cls);
        HashMap map = this.a;
        if (map.containsKey(c5577211331494591160)) {
            return ((O2211401162397821294) map.get(c5577211331494591160)).c.d(z1953481206310471956);
        }
        throw new GeneralSecurityException(G6547577305291411977.s("No PrimitiveConstructor for ", String.valueOf(c5577211331494591160), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
