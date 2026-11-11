package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfgt implements zzfhd {
    private zzfhd[] zzpii;

    public zzfgt(zzfhd... zzfhdVarArr) {
        this.zzpii = zzfhdVarArr;
    }

    @Override // com.google.android.gms.internal.zzfhd
    public final boolean zzi(Class<?> cls) {
        for (zzfhd zzfhdVar : this.zzpii) {
            if (zzfhdVar.zzi(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.zzfhd
    public final zzfhc zzj(Class<?> cls) {
        for (zzfhd zzfhdVar : this.zzpii) {
            if (zzfhdVar.zzi(cls)) {
                return zzfhdVar.zzj(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}
