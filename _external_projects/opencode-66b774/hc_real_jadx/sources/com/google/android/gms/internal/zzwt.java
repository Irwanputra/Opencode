package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;
import java.util.Map;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzwt {
    private final zzanh zzbyk;
    private final boolean zzcgz;
    private final String zzcha;

    public zzwt(zzanh zzanhVar, Map<String, String> map) {
        this.zzbyk = zzanhVar;
        this.zzcha = map.get("forceOrientation");
        this.zzcgz = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean(map.get("allowOrientationChange")) : true;
    }

    public final void execute() {
        if (this.zzbyk == null) {
            zzakb.zzcu("AdWebView is null");
        } else {
            this.zzbyk.setRequestedOrientation("portrait".equalsIgnoreCase(this.zzcha) ? zzbs.zzek().zzqg() : "landscape".equalsIgnoreCase(this.zzcha) ? zzbs.zzek().zzqf() : this.zzcgz ? -1 : zzbs.zzek().zzqh());
        }
    }
}
