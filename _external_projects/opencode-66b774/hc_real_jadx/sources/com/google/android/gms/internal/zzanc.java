package com.google.android.gms.internal;

import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzanc implements Runnable {
    private /* synthetic */ String zzcml;
    private /* synthetic */ String zzdkb;
    private /* synthetic */ int zzdkd;
    private /* synthetic */ zzana zzdkf;

    public zzanc(zzana zzanaVar, String str, String str2, int i) {
        this.zzdkf = zzanaVar;
        this.zzcml = str;
        this.zzdkb = str2;
        this.zzdkd = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheComplete");
        hashMap.put("src", this.zzcml);
        hashMap.put("cachedSrc", this.zzdkb);
        hashMap.put("totalBytes", Integer.toString(this.zzdkd));
        this.zzdkf.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
