package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhy {
    public final long value;
    public final String zzbai;
    public final int zzbaj;

    public zzhy(long j, String str, int i) {
        this.value = j;
        this.zzbai = str;
        this.zzbaj = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzhy)) {
            zzhy zzhyVar = (zzhy) obj;
            if (zzhyVar.value == this.value && zzhyVar.zzbaj == this.zzbaj) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.value;
    }
}
