package com.google.android.gms.internal;

import android.content.DialogInterface;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzwq implements DialogInterface.OnClickListener {
    private /* synthetic */ zzwo zzcgj;

    public zzwq(zzwo zzwoVar) {
        this.zzcgj = zzwoVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzcgj.zzbm("Operation denied by user.");
    }
}
