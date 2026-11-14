package dev.epro.r0;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class Z11559475901243732519 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        if (d13396727227989475489.H() == 9) {
            d13396727227989475489.D();
            return null;
        }
        try {
            String strF = d13396727227989475489.F();
            if (strF.equals("null")) {
                return null;
            }
            return new URI(strF);
        } catch (URISyntaxException e) {
            throw new O6142514240279757215(e);
        }
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        URI uri = (URI) obj;
        y14132333989764804283.D(uri == null ? null : uri.toASCIIString());
    }
}
