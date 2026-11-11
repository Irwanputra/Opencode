package com.google.android.gms.internal;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzand implements Runnable {
    private /* synthetic */ String val$message;
    private /* synthetic */ String zzcml;
    private /* synthetic */ String zzdkb;
    private /* synthetic */ zzana zzdkf;
    private /* synthetic */ String zzdkg;

    public zzand(zzana zzanaVar, String str, String str2, String str3, String str4) {
        this.zzdkf = zzanaVar;
        this.zzcml = str;
        this.zzdkb = str2;
        this.zzdkg = str3;
        this.val$message = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String zzcy;
        HashMap hashMap = new HashMap();
        hashMap.put(NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.zzcml);
        if (!TextUtils.isEmpty(this.zzdkb)) {
            hashMap.put("cachedSrc", this.zzdkb);
        }
        zzana zzanaVar = this.zzdkf;
        zzcy = zzana.zzcy(this.zzdkg);
        hashMap.put("type", zzcy);
        hashMap.put("reason", this.zzdkg);
        if (!TextUtils.isEmpty(this.val$message)) {
            hashMap.put("message", this.val$message);
        }
        this.zzdkf.zza("onPrecacheEvent", (Map<String, String>) hashMap);
    }
}
