package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public enum zzdtt implements zzfga {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private static final zzfgb<zzdtt> zzbcl = new zzfgb<zzdtt>() { // from class: com.google.android.gms.internal.zzdtu
    };
    private final int value;

    zzdtt(int i) {
        this.value = i;
    }

    public static zzdtt zzgd(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.android.gms.internal.zzfga
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
