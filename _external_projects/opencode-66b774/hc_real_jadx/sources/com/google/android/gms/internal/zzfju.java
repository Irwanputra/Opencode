package com.google.android.gms.internal;

import java.util.Arrays;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfju {
    public final int tag;
    public final byte[] zzjng;

    public zzfju(int i, byte[] bArr) {
        this.tag = i;
        this.zzjng = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzfju)) {
            return false;
        }
        zzfju zzfjuVar = (zzfju) obj;
        return this.tag == zzfjuVar.tag && Arrays.equals(this.zzjng, zzfjuVar.zzjng);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzjng) + ((this.tag + 527) * 31);
    }
}
