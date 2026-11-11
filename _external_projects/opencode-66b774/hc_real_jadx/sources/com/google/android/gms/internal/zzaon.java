package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaon implements DialogInterface.OnClickListener {
    private /* synthetic */ JsPromptResult zzdnp;

    public zzaon(JsPromptResult jsPromptResult) {
        this.zzdnp = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdnp.cancel();
    }
}
