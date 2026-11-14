package dev.epro.r0;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class C1934509054487712083 implements X9690969695403731552 {
    @Override // dev.epro.r0.X9690969695403731552
    public final V6940622119999241486 a(N968209583691202713 n968209583691202713) {
        X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
        X4422675003582389573.a.getClass();
        return new V6940622119999241486(M10634075818626712574.k, A16863878083888774454.b, n968209583691202713);
    }

    @Override // dev.epro.r0.X9690969695403731552
    public final List lookup(String str) throws UnknownHostException {
        str.getClass();
        X4422675003582389573 x4422675003582389573 = X4422675003582389573.a;
        X4422675003582389573.a.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            return O5378677881740157249.U0(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    public final String toString() {
        return "Dns.SYSTEM";
    }
}
