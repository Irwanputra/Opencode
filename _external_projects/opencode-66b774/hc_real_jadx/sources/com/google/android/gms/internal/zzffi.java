package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzffi implements zzfji {
    private final zzffg zzpfl;

    private zzffi(zzffg zzffgVar) {
        zzffg zzffgVar2 = (zzffg) zzffz.zzc(zzffgVar, "output");
        this.zzpfl = zzffgVar2;
        zzffgVar2.zzpga = this;
    }

    public static zzffi zzb(zzffg zzffgVar) {
        zzffi zzffiVar = zzffgVar.zzpga;
        return zzffiVar != null ? zzffiVar : new zzffi(zzffgVar);
    }

    @Override // com.google.android.gms.internal.zzfji
    public final void zzb(int i, Object obj) {
        try {
            if (obj instanceof zzfes) {
                this.zzpfl.zzb(i, (zzfes) obj);
            } else {
                this.zzpfl.zzb(i, (zzfhe) obj);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.google.android.gms.internal.zzfji
    public final int zzcwv() {
        return zzffu.zzg.zzphn;
    }
}
