package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class J4204243423487919855 {
    static {
        P5124777957357031757 p5124777957357031757 = P5124777957357031757.d;
        J3301701597851028733.u("\"\\");
        J3301701597851028733.u("\t ,=");
    }

    public static final boolean a(P10917817599008460069 p10917817599008460069) {
        if (S10823041268949770285.t(p10917817599008460069.a.b, "HEAD")) {
            return false;
        }
        int i = p10917817599008460069.d;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || C14766148968941961570.e(p10917817599008460069) != -1) {
            return true;
        }
        String strA = p10917817599008460069.f.a("Transfer-Encoding");
        if (strA == null) {
            strA = null;
        }
        return "chunked".equalsIgnoreCase(strA);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(dev.epro.r0.P2382941533350862833 r36, dev.epro.r0.P10208541982779414550 r37, dev.epro.r0.F12902864952249894497 r38) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.J4204243423487919855.b(dev.epro.r0.P2382941533350862833, dev.epro.r0.P10208541982779414550, dev.epro.r0.F12902864952249894497):void");
    }
}
