package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public enum zzdso implements zzfga {
    UNKNOWN_CURVE(0),
    NIST_P224(1),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);

    private static final zzfgb<zzdso> zzbcl = new zzfgb<zzdso>() { // from class: com.google.android.gms.internal.zzdsp
    };
    private final int value;

    zzdso(int i) {
        this.value = i;
    }

    public static zzdso zzfq(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 1) {
            return NIST_P224;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i != 4) {
            return null;
        }
        return NIST_P521;
    }

    @Override // com.google.android.gms.internal.zzfga
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
