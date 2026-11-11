package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import p131.p161.p162.p193.p205.C2508;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzafm implements Runnable {
    private /* synthetic */ Context val$context;
    private /* synthetic */ zzalf zzcxi;

    public zzafm(zzafl zzaflVar, Context context, zzalf zzalfVar) {
        this.val$context = context;
        this.zzcxi = zzalfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzcxi.set(AdvertisingIdClient.getAdvertisingIdInfo(this.val$context));
        } catch (IOException | IllegalStateException | C2508 e) {
            this.zzcxi.setException(e);
            zzakb.zzb("Exception while getting advertising Id info", e);
        }
    }
}
