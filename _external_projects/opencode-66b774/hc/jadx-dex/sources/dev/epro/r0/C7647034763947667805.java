package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class C7647034763947667805 implements dev.epro.r0.A8947685337014270457 {
    public final dev.epro.r0.A3690406679562215731 a;

    public C7647034763947667805(dev.epro.r0.A3690406679562215731 a3690406679562215731) {
        this.a = a3690406679562215731;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Iterable] */
    @Override // dev.epro.r0.A8947685337014270457
    public final void a(byte[] bArr, byte[] bArr2) {
        java.util.List list;
        java.util.HashMap map = this.a.a;
        ?? e1113567452991644141 = (java.util.List) map.get(dev.epro.r0.A3690406679562215731.b);
        if (bArr.length >= 5) {
            list = (java.util.List) map.get(new dev.epro.r0.J4250663911053539605(bArr, 5 > bArr.length ? bArr.length : 5));
        } else {
            list = null;
        }
        if (e1113567452991644141 == 0 && list == null) {
            e1113567452991644141 = new java.util.ArrayList();
        } else if (e1113567452991644141 == 0) {
            e1113567452991644141 = list;
        } else if (list != null) {
            e1113567452991644141 = new dev.epro.r0.E1113567452991644141(list, e1113567452991644141);
        }
        java.util.Iterator it = e1113567452991644141.iterator();
        while (it.hasNext()) {
            try {
                ((dev.epro.r0.H4081320665893287884) it.next()).a.a(bArr, bArr2);
                return;
            } catch (java.security.GeneralSecurityException unused) {
            }
        }
        dev.epro.r0.W4415201450379021245.c("invalid signature");
    }
}
