package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class M8553275795008046201 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        try {
            int iZ = d13396727227989475489.z();
            if (iZ <= 65535 && iZ >= -32768) {
                return Short.valueOf((short) iZ);
            }
            StringBuilder sbQ = E12098517352909843120.q(iZ, "Lossy conversion from ", " to short; at path ");
            sbQ.append(d13396727227989475489.o(true));
            throw new X13554947934760653097(sbQ.toString());
        } catch (NumberFormatException e) {
            throw new X13554947934760653097(e);
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        if (((Number) obj) == null) {
            y14132333989764804283.p();
        } else {
            y14132333989764804283.A(r4.shortValue());
        }
    }
}
