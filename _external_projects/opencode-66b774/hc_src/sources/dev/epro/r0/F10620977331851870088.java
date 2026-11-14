package dev.epro.r0;

import java.io.IOException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class F10620977331851870088 extends IOException {
    public boolean a;

    public static F10620977331851870088 a() {
        return new F10620977331851870088("Protocol message had invalid UTF-8.");
    }

    public static Q13606351353383574666 b() {
        return new Q13606351353383574666("Protocol message tag had invalid wire type.");
    }

    public static F10620977331851870088 c() {
        return new F10620977331851870088("CodedInputStream encountered a malformed varint.");
    }

    public static F10620977331851870088 d() {
        return new F10620977331851870088("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static F10620977331851870088 e() {
        return new F10620977331851870088("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
