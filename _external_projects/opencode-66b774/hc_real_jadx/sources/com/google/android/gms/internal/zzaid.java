package com.google.android.gms.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzbs;

@TargetApi(21)
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaid extends zzaic {
    @Override // com.google.android.gms.internal.zzaht
    public final CookieManager zzay(Context context) {
        if (zzaht.zzqj()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzakb.zzb("Failed to obtain CookieManager.", th);
            zzbs.zzem().zza(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.zzahw, com.google.android.gms.internal.zzaht
    public final zzani zzb(zzanh zzanhVar, boolean z) {
        return new zzaot(zzanhVar, z);
    }

    @Override // com.google.android.gms.internal.zzahy, com.google.android.gms.internal.zzaht
    public final int zzqk() {
        return R.style.Theme.Material.Dialog.Alert;
    }
}
