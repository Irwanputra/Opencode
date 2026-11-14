package dev.epro.r0;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class D3724400017864063475 implements W17944177835232834043 {
    public final X6360402257588588862 a;
    public W17944177835232834043 b;

    public D3724400017864063475(X6360402257588588862 x6360402257588588862) {
        this.a = x6360402257588588862;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final String a(SSLSocket sSLSocket) {
        W17944177835232834043 w17944177835232834043E = e(sSLSocket);
        if (w17944177835232834043E != null) {
            return w17944177835232834043E.a(sSLSocket);
        }
        return null;
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean b(SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final void c(SSLSocket sSLSocket, String str, List list, P5124777957357031757 p5124777957357031757) {
        W17944177835232834043 w17944177835232834043E = e(sSLSocket);
        if (w17944177835232834043E != null) {
            w17944177835232834043E.c(sSLSocket, str, list, p5124777957357031757);
        }
    }

    @Override // dev.epro.r0.W17944177835232834043
    public final boolean d() {
        return true;
    }

    public final synchronized W17944177835232834043 e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.g(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
