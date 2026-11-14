package dev.epro.r0;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class A5974074087348958348 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        String F = d13396727227989475489.F();
        if (F.length() == 1) {
            return Character.valueOf(F.charAt(0));
        }
        StringBuilder g = X2485016533998461232.g("Expecting character, got: ", F, "; at ");
        g.append(d13396727227989475489.o(true));
        throw new X13554947934760653097(g.toString());
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        Character ch = (Character) obj;
        y14132333989764804283.D(ch == null ? null : String.valueOf(ch));
    }
}
