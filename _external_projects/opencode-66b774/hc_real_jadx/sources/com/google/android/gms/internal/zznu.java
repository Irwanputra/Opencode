package com.google.android.gms.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbs;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zznu {
    private final Object mLock;
    private boolean zzbrz;
    private final List<zzns> zzbsq = new LinkedList();
    private final Map<String, String> zzbsr;
    private String zzbss;
    private zznu zzbst;

    public zznu(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzbsr = linkedHashMap;
        this.mLock = new Object();
        this.zzbrz = z;
        linkedHashMap.put("action", str);
        linkedHashMap.put("ad_format", str2);
    }

    public final boolean zza(zzns zznsVar, long j, String... strArr) {
        synchronized (this.mLock) {
            for (String str : strArr) {
                this.zzbsq.add(new zzns(j, str, zznsVar));
            }
        }
        return true;
    }

    public final boolean zza(zzns zznsVar, String... strArr) {
        if (!this.zzbrz || zznsVar == null) {
            return false;
        }
        ((C2510) zzbs.zzeo()).getClass();
        return zza(zznsVar, SystemClock.elapsedRealtime(), strArr);
    }

    public final void zzao(String str) {
        if (this.zzbrz) {
            synchronized (this.mLock) {
                this.zzbss = str;
            }
        }
    }

    public final void zzc(zznu zznuVar) {
        synchronized (this.mLock) {
            this.zzbst = zznuVar;
        }
    }

    public final zzns zzd(long j) {
        if (this.zzbrz) {
            return new zzns(j, null, null);
        }
        return null;
    }

    public final void zzf(String str, String str2) {
        zznk zzpc;
        if (!this.zzbrz || TextUtils.isEmpty(str2) || (zzpc = zzbs.zzem().zzpc()) == null) {
            return;
        }
        synchronized (this.mLock) {
            zzno zzam = zzpc.zzam(str);
            Map<String, String> map = this.zzbsr;
            map.put(str, zzam.zze(map.get(str), str2));
        }
    }

    public final zzns zzjf() {
        ((C2510) zzbs.zzeo()).getClass();
        return zzd(SystemClock.elapsedRealtime());
    }

    public final String zzjg() {
        String sb;
        StringBuilder sb2 = new StringBuilder();
        synchronized (this.mLock) {
            for (zzns zznsVar : this.zzbsq) {
                long time = zznsVar.getTime();
                String zzjc = zznsVar.zzjc();
                zzns zzjd = zznsVar.zzjd();
                if (zzjd != null && time > 0) {
                    long time2 = time - zzjd.getTime();
                    sb2.append(zzjc);
                    sb2.append('.');
                    sb2.append(time2);
                    sb2.append(',');
                }
            }
            this.zzbsq.clear();
            if (!TextUtils.isEmpty(this.zzbss)) {
                sb2.append(this.zzbss);
            } else if (sb2.length() > 0) {
                sb2.setLength(sb2.length() - 1);
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final Map<String, String> zzjh() {
        zznu zznuVar;
        synchronized (this.mLock) {
            zznk zzpc = zzbs.zzem().zzpc();
            if (zzpc != null && (zznuVar = this.zzbst) != null) {
                return zzpc.zza(this.zzbsr, zznuVar.zzjh());
            }
            return this.zzbsr;
        }
    }

    public final zzns zzji() {
        synchronized (this.mLock) {
        }
        return null;
    }
}
