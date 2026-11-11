package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbs;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaik implements Runnable {
    private /* synthetic */ zzaig zzdbo;

    public zzaik(zzaig zzaigVar) {
        this.zzdbo = zzaigVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        String str;
        String str2;
        zzaim zzer = zzbs.zzer();
        context = this.zzdbo.mContext;
        str = this.zzdbo.zzapq;
        str2 = this.zzdbo.zzavn;
        zzer.zzg(context, str, str2);
    }
}
