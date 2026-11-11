package com.google.android.gms.ads.mediation.customevent;

import com.google.ads.mediation.NetworkExtras;
import java.util.HashMap;

@Deprecated
/* loaded from: /tmp/opencode/hc_real.dex */
public final class CustomEventExtras implements NetworkExtras {

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final HashMap<String, Object> f2844 = new HashMap<>();

    public final Object getExtra(String str) {
        return this.f2844.get(str);
    }

    public final void setExtra(String str, Object obj) {
        this.f2844.put(str, obj);
    }
}
