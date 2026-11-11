package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjp extends zzky {
    private final AppEventListener zzamt;

    public zzjp(AppEventListener appEventListener) {
        this.zzamt = appEventListener;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzamt;
    }

    @Override // com.google.android.gms.internal.zzkx
    public final void onAppEvent(String str, String str2) {
        this.zzamt.onAppEvent(str, str2);
    }
}
