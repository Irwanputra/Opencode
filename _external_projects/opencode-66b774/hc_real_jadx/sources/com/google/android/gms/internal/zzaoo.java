package com.google.android.gms.internal;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaoo implements DialogInterface.OnClickListener {
    private /* synthetic */ JsPromptResult zzdnp;
    private /* synthetic */ EditText zzdnq;

    public zzaoo(JsPromptResult jsPromptResult, EditText editText) {
        this.zzdnp = jsPromptResult;
        this.zzdnq = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zzdnp.confirm(this.zzdnq.getText().toString());
    }
}
