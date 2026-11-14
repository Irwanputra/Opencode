package dev.epro.relay;

import dev.epro.go.Seq;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class ClientSession implements Seq.Proxy {
    private final int refnum;

    static {
        Relay.touch();
    }

    public ClientSession(RuntimeHost runtimeHost) {
        int __NewClientSession = __NewClientSession(runtimeHost);
        this.refnum = __NewClientSession;
        Seq.trackGoRef(__NewClientSession, this);
    }

    private static native int __NewClientSession(RuntimeHost runtimeHost);

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

    public native int localPort();

    public native void setDestinationObserver(DestinationObserver destinationObserver);

    public native void setServerAddressResolver(ServerAddressResolver serverAddressResolver);

    public native void startConfig(String str);

    public native void stop();

    public String toString() {
        return "ClientSession{}";
    }

    public native void updatePolicy(int i, int i2);

    public ClientSession(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
