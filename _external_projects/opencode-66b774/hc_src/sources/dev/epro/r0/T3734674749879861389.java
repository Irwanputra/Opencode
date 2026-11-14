package dev.epro.r0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T3734674749879861389 implements W17944177835232834043 {
    public static final B4863633158970310698 a = new B4863633158970310698();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, E7907796020778430434.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (E7907796020778430434.a()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        b = z;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final String a(SSLSocket sSLSocket) {
        if (b(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean b(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final void c(SSLSocket sSLSocket, String str, List list, P5124777957357031757 p5124777957357031757) {
        if (b(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) J3301701597851028733.q(list).toArray(new String[0]));
        }
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean d() {
        return b;
    }
}
