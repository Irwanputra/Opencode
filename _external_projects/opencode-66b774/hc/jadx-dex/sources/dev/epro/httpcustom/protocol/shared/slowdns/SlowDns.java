package dev.epro.httpcustom.protocol.shared.slowdns;

/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class SlowDns {
    public static final int $stable = 0;
    public static final dev.epro.httpcustom.protocol.shared.slowdns.SlowDns INSTANCE;

    static {
        int iQwsojjcusaoq;
        o.bwmna.gdrqkg.izmyclvb.oeynnivvrnts0(59);
        java.lang.Object[] objArr = new java.lang.Object[3];
        while (true) {
            try {
                iQwsojjcusaoq = qwsojjcusaoq(objArr);
            } finally {
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            if (iQwsojjcusaoq != 0) {
                switch (iQwsojjcusaoq) {
                    case 1:
                        INSTANCE = (dev.epro.httpcustom.protocol.shared.slowdns.SlowDns) objArr[1];
                        break;
                    default:
                        throw null;
                }
                java.util.Arrays.fill(objArr, (java.lang.Object) null);
            }
            return;
        }
    }

    public static final native boolean isReady(java.lang.String str);

    private static native int qwsojjcusaoq(java.lang.Object[] objArr);

    public static final native int start(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, java.lang.String str6);

    public static native /* synthetic */ int startConfiguredObserved$app$default(dev.epro.httpcustom.protocol.shared.slowdns.SlowDns slowDns, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, java.lang.String str6, dev.epro.slowdns.DestinationObserver destinationObserver, java.lang.String str7, java.lang.String str8, int i3, boolean z, int i4, int i5, boolean z2, int i6, java.lang.Object obj);

    public static final native void stop();

    public static final native void stopByListen(java.lang.String str);

    private native void tqjezjqzsidg();

    public final native boolean isCalibrationPending$app(java.lang.String str);

    public final native int startConfiguredObserved$app(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, java.lang.String str6, dev.epro.slowdns.DestinationObserver destinationObserver, java.lang.String str7, java.lang.String str8, int i3, boolean z, int i4, int i5, boolean z2);

    public final native int startObserved$app(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, java.lang.String str6, dev.epro.slowdns.DestinationObserver destinationObserver);

    private SlowDns() {
        tqjezjqzsidg();
    }
}
