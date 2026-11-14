package dev.epro.slowdns;

import dev.epro.go.Seq;
import java.util.Arrays;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes4.dex */
public final class DNSPacketConn implements Seq.Proxy {
    private final int refnum;

    static {
        Slowdns.touch();
    }

    public DNSPacketConn(int i) {
        this.refnum = i;
        Seq.trackGoRef(i, this);
    }

    public native void close();

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof DNSPacketConn)) {
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

    public String toString() {
        return "DNSPacketConn{}";
    }
}
