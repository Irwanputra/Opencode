package com.google.android.gms.internal;

import android.webkit.ValueCallback;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhn implements ValueCallback<String> {
    private /* synthetic */ zzhm zzazs;

    public zzhn(zzhm zzhmVar) {
        this.zzazs = zzhmVar;
    }

    @Override // android.webkit.ValueCallback
    public final /* synthetic */ void onReceiveValue(String str) {
        zzhm zzhmVar = this.zzazs;
        zzhmVar.zzazn.zza(zzhmVar.zzazp, zzhmVar.zzazq, str, zzhmVar.zzazr);
    }
}
