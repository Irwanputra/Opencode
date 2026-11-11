package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzgr extends BroadcastReceiver {
    private /* synthetic */ zzgp zzaxn;

    public zzgr(zzgp zzgpVar) {
        this.zzaxn = zzgpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzaxn.zzm(3);
    }
}
