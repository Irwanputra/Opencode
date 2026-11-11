package com.google.android.gms.internal;

import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhl implements Runnable {
    private /* synthetic */ View zzazm;
    private /* synthetic */ zzhk zzazn;

    public zzhl(zzhk zzhkVar, View view) {
        this.zzazn = zzhkVar;
        this.zzazm = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzazn.zzj(this.zzazm);
    }
}
