package com.google.android.gms.ads.mediation.admob;

import android.os.Bundle;
import com.google.ads.mediation.NetworkExtras;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public final class AdMobExtras implements NetworkExtras {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final Bundle f2832;

    public AdMobExtras(Bundle bundle) {
        this.f2832 = bundle != null ? new Bundle(bundle) : null;
    }

    public final Bundle getExtras() {
        return this.f2832;
    }
}
