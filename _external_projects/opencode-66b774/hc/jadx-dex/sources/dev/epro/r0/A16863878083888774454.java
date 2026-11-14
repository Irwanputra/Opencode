package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class A16863878083888774454 implements dev.epro.r0.X9690969695403731552 {
    public static final dev.epro.r0.A16863878083888774454 b = new dev.epro.r0.A16863878083888774454();

    public final java.util.List lookup(java.lang.String str) throws java.net.UnknownHostException {
        str.getClass();
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
}
