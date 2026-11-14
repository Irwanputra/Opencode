package dev.epro.r0;

import java.io.IOException;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class V18102646326417959683 extends K10678596132709730734 {
    @Override // dev.epro.r0.K10678596132709730734
    public final Object b(D13396727227989475489 d13396727227989475489) throws IOException {
        if (d13396727227989475489.H() != 9) {
            return InetAddress.getByName(d13396727227989475489.F());
        }
        d13396727227989475489.D();
        return null;
    }

    @Override // dev.epro.r0.K10678596132709730734
    public final void c(Y14132333989764804283 y14132333989764804283, Object obj) throws IOException {
        InetAddress inetAddress = (InetAddress) obj;
        y14132333989764804283.D(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
