package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdv extends BroadcastReceiver {
    private /* synthetic */ zzdt zzakh;

    public zzdv(zzdt zzdtVar) {
        this.zzakh = zzdtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzakh.zzax();
    }
}
