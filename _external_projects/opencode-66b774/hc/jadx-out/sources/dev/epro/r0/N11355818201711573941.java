package dev.epro.r0;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public class N11355818201711573941 extends IOException {
    public static N11355818201711573941 a() {
        return new N11355818201711573941("Protocol message had invalid UTF-8.");
    }

    public static J12068242864160501074 b() {
        return new J12068242864160501074("Protocol message tag had invalid wire type.");
    }

    public static N11355818201711573941 c() {
        return new N11355818201711573941("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static N11355818201711573941 d() {
        return new N11355818201711573941("Failed to parse the message.");
    }

    public static N11355818201711573941 e() {
        return new N11355818201711573941("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
