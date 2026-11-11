package com.google.android.gms.internal;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.jasypt.digest.StandardStringDigester;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzoz implements com.google.android.gms.ads.internal.gmsg.zzt<Object> {
    public final /* synthetic */ zzzb zzbva;
    public final /* synthetic */ zzoy zzbvb;

    public zzoz(zzoy zzoyVar, zzzb zzzbVar) {
        this.zzbvb = zzoyVar;
        this.zzbva = zzzbVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final void zza(Object obj, Map<String, String> map) {
        WeakReference weakReference;
        weakReference = this.zzbvb.zzbuy;
        zzanh zzanhVar = (zzanh) weakReference.get();
        if (zzanhVar == null) {
            this.zzbva.zzb("/loadHtml", this);
            return;
        }
        zzanhVar.zzsz().zza(new zzpa(this, map));
        String str = map.get("overlayHtml");
        String str2 = map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzanhVar.loadData(str, "text/html", StandardStringDigester.MESSAGE_CHARSET);
        } else {
            zzanhVar.loadDataWithBaseURL(str2, str, "text/html", StandardStringDigester.MESSAGE_CHARSET, null);
        }
    }
}
