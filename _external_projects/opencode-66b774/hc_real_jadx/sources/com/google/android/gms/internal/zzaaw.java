package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaaw extends zzabf {
    private final WeakReference<zzaal> zzcou;

    public zzaaw(zzaal zzaalVar) {
        this.zzcou = new WeakReference<>(zzaalVar);
    }

    @Override // com.google.android.gms.internal.zzabe
    public final void zza(zzaax zzaaxVar) {
        zzaal zzaalVar = this.zzcou.get();
        if (zzaalVar != null) {
            zzaalVar.zza(zzaaxVar);
        }
    }
}
