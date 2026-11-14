package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C1934509054487712083 implements dev.epro.r0.X9690969695403731552 {
    public final dev.epro.r0.V6940622119999241486 a(dev.epro.r0.N968209583691202713 n968209583691202713) {
        dev.epro.r0.X4422675003582389573 x4422675003582389573 = dev.epro.r0.X4422675003582389573.a;
        dev.epro.r0.X4422675003582389573.a.getClass();
        return new dev.epro.r0.V6940622119999241486(dev.epro.r0.M10634075818626712574.k, dev.epro.r0.A16863878083888774454.b, n968209583691202713);
    }

    public final java.util.List lookup(java.lang.String str) throws java.net.UnknownHostException {
        str.getClass();
        dev.epro.r0.X4422675003582389573 x4422675003582389573 = dev.epro.r0.X4422675003582389573.a;
        dev.epro.r0.X4422675003582389573.a.getClass();
        try {
            java.net.InetAddress[] allByName = java.net.InetAddress.getAllByName(str);
            allByName.getClass();
            return dev.epro.r0.O5378677881740157249.U0(allByName);
        } catch (java.lang.NullPointerException e) {
            java.net.UnknownHostException unknownHostException = new java.net.UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    public final java.lang.String toString() {
        return "Dns.SYSTEM";
    }
}
