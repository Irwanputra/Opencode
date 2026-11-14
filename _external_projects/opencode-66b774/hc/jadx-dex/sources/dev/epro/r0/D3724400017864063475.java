package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D3724400017864063475 implements dev.epro.r0.W17944177835232834043 {
    public final dev.epro.r0.X6360402257588588862 a;
    public dev.epro.r0.W17944177835232834043 b;

    public D3724400017864063475(dev.epro.r0.X6360402257588588862 x6360402257588588862) {
        this.a = x6360402257588588862;
    }

    public final java.lang.String a(javax.net.ssl.SSLSocket sSLSocket) {
        dev.epro.r0.W17944177835232834043 w17944177835232834043E = e(sSLSocket);
        if (w17944177835232834043E != null) {
            return w17944177835232834043E.a(sSLSocket);
        }
        return null;
    }

    public final boolean b(javax.net.ssl.SSLSocket sSLSocket) {
        return this.a.b(sSLSocket);
    }

    public final void c(javax.net.ssl.SSLSocket sSLSocket, java.lang.String str, java.util.List list, dev.epro.r0.P5124777957357031757 p5124777957357031757) {
        dev.epro.r0.W17944177835232834043 w17944177835232834043E = e(sSLSocket);
        if (w17944177835232834043E != null) {
            w17944177835232834043E.c(sSLSocket, str, list, p5124777957357031757);
        }
    }

    public final boolean d() {
        return true;
    }

    public final synchronized dev.epro.r0.W17944177835232834043 e(javax.net.ssl.SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.b(sSLSocket)) {
                this.b = this.a.g(sSLSocket);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.b;
    }
}
