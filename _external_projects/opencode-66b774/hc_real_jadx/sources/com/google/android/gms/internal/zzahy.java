package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.net.http.SslError;
import android.webkit.WebChromeClient;

@TargetApi(14)
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzahy extends zzahw {
    @Override // com.google.android.gms.internal.zzaht
    public final String zza(SslError sslError) {
        return sslError.getUrl();
    }

    @Override // com.google.android.gms.internal.zzahw, com.google.android.gms.internal.zzaht
    public final WebChromeClient zzk(zzanh zzanhVar) {
        return new zzaor(zzanhVar);
    }

    @Override // com.google.android.gms.internal.zzaht
    public int zzqk() {
        return 1;
    }
}
