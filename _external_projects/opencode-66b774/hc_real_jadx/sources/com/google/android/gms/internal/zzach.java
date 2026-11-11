package com.google.android.gms.internal;

import android.content.Context;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzach {
    private final Context mContext;
    private String zzcrt;
    private String zzcru;
    private final Object mLock = new Object();
    private zzalf<zzacn> zzcrv = new zzalf<>();
    private com.google.android.gms.ads.internal.gmsg.zzt<Object> zzcrw = new zzaci(this);
    private com.google.android.gms.ads.internal.gmsg.zzt<Object> zzcrx = new zzacj(this);
    private com.google.android.gms.ads.internal.gmsg.zzt<Object> zzcry = new zzack(this);

    public zzach(Context context, String str, String str2) {
        this.mContext = context;
        this.zzcru = str2;
        this.zzcrt = str;
    }
}
