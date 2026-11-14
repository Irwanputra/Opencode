package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class B1840890509256802301 extends dev.epro.r0.K10678596132709730734 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.X13554947934760653097 */
    public final java.lang.Object b(dev.epro.r0.D13396727227989475489 d13396727227989475489) throws dev.epro.r0.H5369259335675503737, java.io.IOException, dev.epro.r0.X13554947934760653097 {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        java.lang.String strF = d13396727227989475489.F();
        try {
            dev.epro.r0.B5998207562248239613.k(strF);
            return new java.math.BigInteger(strF);
        } catch (java.lang.NumberFormatException e) {
            java.lang.StringBuilder sbG = dev.epro.r0.X2485016533998461232.g("Failed parsing '", strF, "' as BigInteger; at path ");
            sbG.append(d13396727227989475489.o(true));
            throw new dev.epro.r0.X13554947934760653097(sbG.toString(), e);
        }
    }

    public final void c(dev.epro.r0.Y14132333989764804283 y14132333989764804283, java.lang.Object obj) {
        y14132333989764804283.C((java.math.BigInteger) obj);
    }
}
