package dev.epro.r0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class W8058067029478696854 implements W17944177835232834043 {
    public static final S4151718649406395753 a = new S4151718649406395753();
    public static final boolean b;

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, C12265524002282074474.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        b = z;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final void c(SSLSocket sSLSocket, String str, List list, P5124777957357031757 p5124777957357031757) {
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
            parameters.setApplicationProtocols((String[]) J3301701597851028733.q(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean d() {
        return b;
    }
}
