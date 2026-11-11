package com.google.android.gms.internal;

import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzsn extends zzky {
    private /* synthetic */ zzse zzbzd;

    public zzsn(zzse zzseVar) {
        this.zzbzd = zzseVar;
    }

    @Override // com.google.android.gms.internal.zzkx
    public final void onAppEvent(String str, String str2) {
        List list;
        list = this.zzbzd.zzapa;
        list.add(new zzso(this, str, str2));
    }
}
