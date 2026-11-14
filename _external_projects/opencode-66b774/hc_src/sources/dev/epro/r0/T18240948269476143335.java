package dev.epro.r0;

import java.io.IOException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes3.dex */
public final class T18240948269476143335 extends IOException {
    public static final String[] c = {"Succeeded", "General SOCKS server failure", "Connection not allowed by ruleset", "Network unreachable", "Host unreachable", "Connection refused", "TTL expired", "Command not supported", "Address type not supported"};
    public static final String[] d = {"SOCKS server not specified", "Unable to contact SOCKS server", "IO error", "None of Authentication methods are supported", "Authentication failed", "General SOCKS fault"};
    public final String a;
    public final int b;

    public T18240948269476143335(int i) {
        this.b = i;
        int i2 = i >> 16;
        if (i2 == 0) {
            this.a = i <= 9 ? c[i] : "Unknown error message";
        } else {
            int i3 = i2 - 1;
            this.a = i3 <= 6 ? d[i3] : "Unknown error message";
        }
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return this.a;
    }
}
