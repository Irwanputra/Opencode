package com.google.android.gms.internal;

import android.content.Context;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaew implements zzafc {
    private zzafd zzcwo;

    public zzaew(zzafd zzafdVar) {
        this.zzcwo = zzafdVar;
    }

    @Override // com.google.android.gms.internal.zzafc
    public final zzafb zza(Context context, zzakd zzakdVar, zzaax zzaaxVar) {
        zzaey zzaeyVar = zzaaxVar.zzcpr;
        if (zzaeyVar == null) {
            return null;
        }
        return new zzaes(context, zzakdVar, zzaeyVar, zzaaxVar.zzcja, this.zzcwo);
    }
}
