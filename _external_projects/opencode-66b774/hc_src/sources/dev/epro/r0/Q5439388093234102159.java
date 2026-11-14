package dev.epro.r0;

import java.net.URL;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public class Q5439388093234102159 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        String F = d13396727227989475489.F();
        if (F.equals("null")) {
            return null;
        }
        return new URL(F);
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) {
        URL url = (URL) obj;
        y14132333989764804283.D(url == null ? null : url.toExternalForm());
    }
}
