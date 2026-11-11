package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public enum zzdsa implements zzfga {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    UNRECOGNIZED(-1);

    private static final zzfgb<zzdsa> zzbcl = new zzfgb<zzdsa>() { // from class: com.google.android.gms.internal.zzdsb
    };
    private final int value;

    zzdsa(int i) {
        this.value = i;
    }

    public static zzdsa zzfn(int i) {
        if (i == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i == 1) {
            return UNCOMPRESSED;
        }
        if (i != 2) {
            return null;
        }
        return COMPRESSED;
    }

    @Override // com.google.android.gms.internal.zzfga
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
