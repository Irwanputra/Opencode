package com.google.android.gms.ads.internal.gmsg;

import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzwo;
import com.google.android.gms.internal.zzwr;
import com.google.android.gms.internal.zzwt;
import com.google.android.gms.internal.zzwu;
import com.google.android.gms.internal.zzzv;
import java.util.Collections;
import java.util.Map;
import p034.p080.C1502;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaa implements zzt<zzanh> {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public static Map<String, Integer> f2597;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzwr f2598;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public final com.google.android.gms.ads.internal.zzw f2599;

    static {
        C1502 c1502 = new C1502(6);
        c1502.put("resize", 1);
        c1502.put("playVideo", 2);
        c1502.put("storePicture", 3);
        c1502.put("createCalendarEvent", 4);
        c1502.put("setOrientationProperties", 5);
        c1502.put("closeResizedAd", 6);
        f2597 = Collections.unmodifiableMap(c1502);
    }

    public zzaa(com.google.android.gms.ads.internal.zzw zzwVar, zzwr zzwrVar) {
        this.f2599 = zzwVar;
        this.f2598 = zzwrVar;
    }

    @Override // com.google.android.gms.ads.internal.gmsg.zzt
    public final /* synthetic */ void zza(zzanh zzanhVar, Map map) {
        com.google.android.gms.ads.internal.zzw zzwVar;
        zzanh zzanhVar2 = zzanhVar;
        int intValue = f2597.get((String) map.get("a")).intValue();
        if (intValue != 5 && (zzwVar = this.f2599) != null && !zzwVar.zzda()) {
            this.f2599.zzt(null);
            return;
        }
        if (intValue == 1) {
            this.f2598.execute(map);
            return;
        }
        if (intValue == 3) {
            new zzwu(zzanhVar2, map).execute();
            return;
        }
        if (intValue == 4) {
            new zzwo(zzanhVar2, map).execute();
            return;
        }
        if (intValue == 5) {
            new zzwt(zzanhVar2, map).execute();
        } else if (intValue != 6) {
            zzakb.zzct("Unknown MRAID command called.");
        } else {
            this.f2598.zzl(true);
        }
    }
}
