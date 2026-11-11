package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfu extends BroadcastReceiver {
    private /* synthetic */ zzft zzawn;

    public zzfu(zzft zzftVar) {
        this.zzawn = zzftVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzawn.zzl(3);
    }
}
