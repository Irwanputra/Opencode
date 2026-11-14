package dev.epro.r0;

import java.io.IOException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public class A9458650138667563085 extends IOException {
    public boolean a;

    public static A9458650138667563085 a() {
        return new A9458650138667563085("Protocol message had invalid UTF-8.");
    }

    public static O941307146068593422 b() {
        return new O941307146068593422("Protocol message tag had invalid wire type.");
    }

    public static A9458650138667563085 c() {
        return new A9458650138667563085("CodedInputStream encountered a malformed varint.");
    }

    public static A9458650138667563085 d() {
        return new A9458650138667563085("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static A9458650138667563085 e() {
        return new A9458650138667563085("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
