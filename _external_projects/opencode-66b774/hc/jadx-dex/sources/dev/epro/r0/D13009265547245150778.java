package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public abstract class D13009265547245150778 {
    public static final java.util.concurrent.CopyOnWriteArrayList a = new java.util.concurrent.CopyOnWriteArrayList();

    public static void a(java.lang.String str) throws java.security.GeneralSecurityException {
        java.util.Iterator it = a.iterator();
        if (!it.hasNext()) {
            throw new java.security.GeneralSecurityException(dev.epro.r0.G6547577305291411977.C("No KMS client does support: ", str));
        }
        it.next().getClass();
        throw new java.lang.ClassCastException();
    }
}
