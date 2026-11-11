package com.google.android.gms.internal;

import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfjr extends IOException {
    public zzfjr(String str) {
        super(str);
    }

    public static zzfjr zzdai() {
        return new zzfjr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzfjr zzdaj() {
        return new zzfjr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzfjr zzdak() {
        return new zzfjr("CodedInputStream encountered a malformed varint.");
    }

    public static zzfjr zzdal() {
        return new zzfjr("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
}
