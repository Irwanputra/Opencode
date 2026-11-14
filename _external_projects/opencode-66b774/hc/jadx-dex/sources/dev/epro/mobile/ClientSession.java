package dev.epro.mobile;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class ClientSession implements dev.epro.go.Seq.Proxy {
    private final int refnum;

    static {
        dev.epro.mobile.Mobile.touch();
    }

    public ClientSession() {
        int i__NewClientSession = __NewClientSession();
        this.refnum = i__NewClientSession;
        dev.epro.go.Seq.trackGoRef(i__NewClientSession, this);
    }

    private static native int __NewClientSession();

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof dev.epro.mobile.ClientSession)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[0]);
    }

    @Override // dev.epro.go.Seq.GoObject
    public final int incRefnum() {
        dev.epro.go.Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native java.lang.String lastRetryError();

    public native long reconnectRecoveredVersion();

    public native long reconnectVersion();

    public native void setDestinationObserver(dev.epro.mobile.DestinationObserver destinationObserver);

    public native void setRetryHandler(dev.epro.mobile.RetryHandler retryHandler);

    public native void startConfig(java.lang.String str);

    public native void stop();

    public java.lang.String toString() {
        return "ClientSession{}";
    }

    public ClientSession(int i) {
        this.refnum = i;
        dev.epro.go.Seq.trackGoRef(i, this);
    }
}
