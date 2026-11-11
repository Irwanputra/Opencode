package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzajo extends BroadcastReceiver {
    private /* synthetic */ zzajn zzddi;

    public zzajo(zzajn zzajnVar) {
        this.zzddi = zzajnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzddi.zzc(context, intent);
    }
}
