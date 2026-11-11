package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.webkit.WebChromeClient;

@zzzv
@TargetApi(14)
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaor extends zzaoi {
    public zzaor(zzanh zzanhVar) {
        super(zzanhVar);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zza(view, i, customViewCallback);
    }
}
