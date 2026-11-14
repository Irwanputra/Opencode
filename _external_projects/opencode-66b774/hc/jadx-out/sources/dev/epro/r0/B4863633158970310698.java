package dev.epro.r0;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class B4863633158970310698 implements X6360402257588588862 {
    @Override // dev.epro.r0.X6360402257588588862
    public final boolean b(SSLSocket sSLSocket) {
        return T3734674749879861389.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // dev.epro.r0.X6360402257588588862
    public final W17944177835232834043 g(SSLSocket sSLSocket) {
        return new T3734674749879861389();
    }
}
