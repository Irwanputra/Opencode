package com.google.android.gms.internal;

import android.content.DialogInterface;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzww implements DialogInterface.OnClickListener {
    private /* synthetic */ zzwu zzchd;

    public zzww(zzwu zzwuVar) {
        this.zzchd = zzwuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzchd.zzbm("User canceled the download.");
    }
}
