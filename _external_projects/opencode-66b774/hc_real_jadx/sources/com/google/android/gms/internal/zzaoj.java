package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaoj implements DialogInterface.OnCancelListener {
    private /* synthetic */ JsResult zzdno;

    public zzaoj(JsResult jsResult) {
        this.zzdno = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.zzdno.cancel();
    }
}
