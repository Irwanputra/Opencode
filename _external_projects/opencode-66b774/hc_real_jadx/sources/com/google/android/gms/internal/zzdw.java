package com.google.android.gms.internal;

import android.app.Activity;
import android.view.View;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdw extends zzet {
    private final Activity zzaki;
    private final View zzakj;

    public zzdw(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2, View view, Activity activity) {
        super(zzdmVar, str, str2, zzazVar, i, 62);
        this.zzakj = view;
        this.zzaki = activity;
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        View view = this.zzakj;
        if (view == null) {
            return;
        }
        long[] jArr = (long[]) this.zzakw.invoke(null, view, this.zzaki);
        synchronized (this.zzako) {
            this.zzako.zzez = Long.valueOf(jArr[0]);
            this.zzako.zzfa = Long.valueOf(jArr[1]);
        }
    }
}
