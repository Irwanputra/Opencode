package dev.epro.r0;

import android.net.ssl.EchConfigList;
import android.net.ssl.InvalidEchDataException;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class V15403875886700419536 implements W17944177835232834043 {
    public final /* synthetic */ byte a;

    public /* synthetic */ V15403875886700419536(byte b) {
        this.a = b;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final String a(SSLSocket sSLSocket) {
        String applicationProtocol;
        String applicationProtocol2;
        switch (this.a) {
            case 0:
                try {
                    applicationProtocol = sSLSocket.getApplicationProtocol();
                    if (applicationProtocol == null) {
                        return null;
                    }
                    if (applicationProtocol.equals("")) {
                        return null;
                    }
                    return applicationProtocol;
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            default:
                applicationProtocol2 = sSLSocket.getApplicationProtocol();
                if (applicationProtocol2 == null || applicationProtocol2.equals("")) {
                    return null;
                }
                return applicationProtocol2;
        }
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean b(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        boolean isSupportedSocket2;
        switch (this.a) {
            case 0:
                isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
                return isSupportedSocket;
            default:
                isSupportedSocket2 = SSLSockets.isSupportedSocket(sSLSocket);
                return isSupportedSocket2;
        }
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final void c(SSLSocket sSLSocket, String str, List list, P5124777957357031757 p5124777957357031757) {
        EchConfigList echConfigList;
        switch (this.a) {
            case 0:
                try {
                    SSLSockets.setUseSessionTickets(sSLSocket, true);
                    SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                    X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
                    sSLParameters.setApplicationProtocols((String[]) J3301701597851028733.q(list).toArray(new String[0]));
                    sSLSocket.setSSLParameters(sSLParameters);
                    break;
                } catch (IllegalArgumentException e) {
                    Z3383101362411723454.q("Android internal error", e);
                    return;
                }
            default:
                SSLSockets.setUseSessionTickets(sSLSocket, true);
                try {
                    SSLParameters sSLParameters2 = sSLSocket.getSSLParameters();
                    X4422675003582389573 x44226750035823895732 = X4422675003582389573.a;
                    sSLParameters2.setApplicationProtocols((String[]) J3301701597851028733.q(list).toArray(new String[0]));
                    sSLSocket.setSSLParameters(sSLParameters2);
                    if (str != null && p5124777957357031757 != null) {
                        try {
                            echConfigList = EchConfigList.fromBytes(p5124777957357031757.k());
                        } catch (InvalidEchDataException unused) {
                            echConfigList = null;
                        }
                        if (echConfigList != null) {
                            SSLSockets.setEchConfigList(sSLSocket, echConfigList);
                            break;
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    Z3383101362411723454.q("Android internal error", e2);
                }
                break;
        }
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean d() {
        switch (this.a) {
            case 0:
                X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
                if (Build.VERSION.SDK_INT >= 29) {
                    break;
                }
                break;
            default:
                X4422675003582389573 x44226750035823895732 = X4422675003582389573.a;
                if (Build.VERSION.SDK_INT >= 37) {
                    break;
                }
                break;
        }
        return true;
    }
}
