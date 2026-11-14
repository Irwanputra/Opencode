package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C3286149729114985901 {
    public final java.util.HashMap a;
    public final java.util.HashMap b;

    public C3286149729114985901(dev.epro.r0.A1960181136934585864 a1960181136934585864) {
        this.a = new java.util.HashMap(a1960181136934585864.a);
        this.b = new java.util.HashMap(a1960181136934585864.b);
    }

    public final java.lang.Object a(dev.epro.r0.Z1953481206310471956 z1953481206310471956, java.lang.Class cls) throws java.security.GeneralSecurityException {
        dev.epro.r0.C5577211331494591160 c5577211331494591160 = new dev.epro.r0.C5577211331494591160(z1953481206310471956.getClass(), cls);
        java.util.HashMap map = this.a;
        if (map.containsKey(c5577211331494591160)) {
            return ((dev.epro.r0.O2211401162397821294) map.get(c5577211331494591160)).c.d(z1953481206310471956);
        }
        throw new java.security.GeneralSecurityException(dev.epro.r0.G6547577305291411977.s("No PrimitiveConstructor for ", java.lang.String.valueOf(c5577211331494591160), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
