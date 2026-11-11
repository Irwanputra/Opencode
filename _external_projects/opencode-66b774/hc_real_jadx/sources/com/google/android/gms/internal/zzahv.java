package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.app.DownloadManager;

@TargetApi(9)
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzahv extends zzaht {
    public zzahv() {
        super();
    }

    @Override // com.google.android.gms.internal.zzaht
    public boolean zza(DownloadManager.Request request) {
        request.setShowRunningNotification(true);
        return true;
    }

    @Override // com.google.android.gms.internal.zzaht
    public final int zzqf() {
        return 6;
    }

    @Override // com.google.android.gms.internal.zzaht
    public final int zzqg() {
        return 7;
    }
}
