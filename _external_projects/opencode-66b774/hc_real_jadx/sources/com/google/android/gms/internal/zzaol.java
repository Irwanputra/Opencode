package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaol implements DialogInterface.OnClickListener {
    private /* synthetic */ JsResult zzdno;

    public zzaol(JsResult jsResult) {
        this.zzdno = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdno.confirm();
    }
}
