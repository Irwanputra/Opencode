package dev.epro.r0;

import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class B1840890509256802301 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        String strF = d13396727227989475489.F();
        try {
            B5998207562248239613.k(strF);
            return new BigInteger(strF);
        } catch (NumberFormatException e) {
            StringBuilder sbG = X2485016533998461232.g("Failed parsing '", strF, "' as BigInteger; at path ");
            sbG.append(d13396727227989475489.o(true));
            throw new X13554947934760653097(sbG.toString(), e);
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        y14132333989764804283.C((BigInteger) obj);
    }
}
