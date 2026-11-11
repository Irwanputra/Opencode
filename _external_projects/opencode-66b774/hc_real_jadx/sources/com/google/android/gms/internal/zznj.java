package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.ads.internal.zzbs;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznj {
    private Context mContext;
    private String zzavn;
    private boolean zzbrz = ((Boolean) zzkb.zzif().zzd(zznh.zzbjl)).booleanValue();
    private String zzbsa = (String) zzkb.zzif().zzd(zznh.zzbjm);
    private Map<String, String> zzbsb;

    public zznj(Context context, String str) {
        this.mContext = null;
        this.zzavn = null;
        this.mContext = context;
        this.zzavn = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzbsb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.zzbsb.put("v", "3");
        this.zzbsb.put("os", Build.VERSION.RELEASE);
        this.zzbsb.put("sdk", Build.VERSION.SDK);
        Map<String, String> map = this.zzbsb;
        zzbs.zzei();
        map.put("device", zzahn.zzqc());
        this.zzbsb.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.zzbsb;
        zzbs.zzei();
        map2.put("is_lite_sdk", zzahn.zzau(context) ? "1" : "0");
        Future<zzaco> zzo = zzbs.zzes().zzo(this.mContext);
        try {
            zzo.get();
            this.zzbsb.put("network_coarse", Integer.toString(zzo.get().zzcty));
            this.zzbsb.put("network_fine", Integer.toString(zzo.get().zzctz));
        } catch (Exception e) {
            zzbs.zzem().zza(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final String zzfs() {
        return this.zzavn;
    }

    public final boolean zziy() {
        return this.zzbrz;
    }

    public final String zziz() {
        return this.zzbsa;
    }

    public final Map<String, String> zzja() {
        return this.zzbsb;
    }
}
