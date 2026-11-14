package dev.epro.r0;

import java.util.Currency;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public class N7838366054307588692 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        String F = d13396727227989475489.F();
        try {
            return Currency.getInstance(F);
        } catch (IllegalArgumentException e) {
            StringBuilder g = X2485016533998461232.g("Failed parsing '", F, "' as Currency; at path ");
            g.append(d13396727227989475489.o(true));
            throw new X13554947934760653097(g.toString(), e);
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        y14132333989764804283.D(((Currency) obj).getCurrencyCode());
    }
}
