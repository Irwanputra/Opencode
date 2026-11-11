package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public enum zzdsq implements zzfga {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA224(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    private static final zzfgb<zzdsq> zzbcl = new zzfgb<zzdsq>() { // from class: com.google.android.gms.internal.zzdsr
    };
    private final int value;

    zzdsq(int i) {
        this.value = i;
    }

    public static zzdsq zzfr(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA224;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i != 4) {
            return null;
        }
        return SHA512;
    }

    @Override // com.google.android.gms.internal.zzfga
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
