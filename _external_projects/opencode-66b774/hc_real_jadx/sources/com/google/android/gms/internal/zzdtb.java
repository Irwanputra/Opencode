package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public enum zzdtb implements zzfga {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private static final zzfgb<zzdtb> zzbcl = new zzfgb<zzdtb>() { // from class: com.google.android.gms.internal.zzdtc
    };
    private final int value;

    zzdtb(int i) {
        this.value = i;
    }

    public static zzdtb zzfu(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // com.google.android.gms.internal.zzfga
    public final int zzhq() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
