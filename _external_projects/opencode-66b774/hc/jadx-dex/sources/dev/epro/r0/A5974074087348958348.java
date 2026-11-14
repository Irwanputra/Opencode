package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class A5974074087348958348 extends dev.epro.r0.K10678596132709730734 {
    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.H5369259335675503737 */
    /* JADX INFO: Thrown type has an unknown type hierarchy: dev.epro.r0.X13554947934760653097 */
    public final java.lang.Object b(dev.epro.r0.D13396727227989475489 d13396727227989475489) throws dev.epro.r0.H5369259335675503737, java.io.IOException, dev.epro.r0.X13554947934760653097 {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        java.lang.String strF = d13396727227989475489.F();
        if (strF.length() == 1) {
            return java.lang.Character.valueOf(strF.charAt(0));
        }
        java.lang.StringBuilder sbG = dev.epro.r0.X2485016533998461232.g("Expecting character, got: ", strF, "; at ");
        sbG.append(d13396727227989475489.o(true));
        throw new dev.epro.r0.X13554947934760653097(sbG.toString());
    }

    public final void c(dev.epro.r0.Y14132333989764804283 y14132333989764804283, java.lang.Object obj) {
        java.lang.Character ch = (java.lang.Character) obj;
        y14132333989764804283.D(ch == null ? null : java.lang.String.valueOf(ch));
    }
}
