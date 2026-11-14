package dev.epro.mobile;

import dev.epro.go.Seq;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ClientSession implements Seq.Proxy {
    private final int refnum;

    static {
        Mobile.touch();
    }

    public ClientSession() {
        int __NewClientSession = __NewClientSession();
        this.refnum = __NewClientSession;
        Seq.trackGoRef(__NewClientSession, this);
    }

    private static native int __NewClientSession();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ClientSession)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[0]);
    }

    @Override // dev.epro.go.Seq.GoObject
    public final int incRefnum() {
        Seq.incGoRef(this.refnum, this);
        return this.refnum;
    }

    public native String lastRetryError();

    public native long reconnectRecoveredVersion();

    public native long reconnectVersion();

    public native void setDestinationObserver(DestinationObserver destinationObserver);

    public native void setRetryHandler(RetryHandler retryHandler);

    public native void startConfig(String str);

    public native void stop();

    public String toString() {
        return "ClientSession{}";
    }

    public ClientSession(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
