package dev.epro.xray;

import dev.epro.go.Seq;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class Controller implements Seq.Proxy {
    private final int refnum;

    static {
        Xray.touch();
    }

    public Controller(RuntimeCallback runtimeCallback) {
        int __NewController = __NewController(runtimeCallback);
        this.refnum = __NewController;
        Seq.trackGoRef(__NewController, this);
    }

    private static native int __NewController(RuntimeCallback runtimeCallback);

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Controller)) {
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

    public native String queryAllOutboundTrafficStats();

    public native long queryStats(String str, String str2);

    public native long runtimeOutboundFailureVersion();

    public native void setConnectionDestinationListener(ConnectionDestinationListener connectionDestinationListener);

    public native void setServerAddressResolver(ServerAddressResolver serverAddressResolver);

    public native void start(String str);

    public native void stop();

    public String toString() {
        return "Controller{}";
    }

    public Controller(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }
}
