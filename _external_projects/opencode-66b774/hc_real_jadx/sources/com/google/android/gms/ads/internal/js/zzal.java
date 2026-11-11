package com.google.android.gms.ads.internal.js;

import com.google.android.gms.ads.internal.gmsg.zzt;
import com.google.android.gms.internal.zzagf;
import com.google.android.gms.internal.zzzv;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzal implements zzak {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzaj f2622;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final HashSet<AbstractMap.SimpleEntry<String, zzt<? super zzaj>>> f2623 = new HashSet<>();

    public zzal(zzaj zzajVar) {
        this.f2622 = zzajVar;
    }

    @Override // com.google.android.gms.ads.internal.js.zzaj
    public final void zza(String str, zzt<? super zzaj> zztVar) {
        this.f2622.zza(str, zztVar);
        this.f2623.add(new AbstractMap.SimpleEntry<>(str, zztVar));
    }

    @Override // com.google.android.gms.ads.internal.js.zza
    public final void zza(String str, Map<String, ?> map) {
        this.f2622.zza(str, map);
    }

    @Override // com.google.android.gms.ads.internal.js.zza
    public final void zza(String str, JSONObject jSONObject) {
        this.f2622.zza(str, jSONObject);
    }

    @Override // com.google.android.gms.ads.internal.js.zzaj
    public final void zzb(String str, zzt<? super zzaj> zztVar) {
        this.f2622.zzb(str, zztVar);
        this.f2623.remove(new AbstractMap.SimpleEntry(str, zztVar));
    }

    @Override // com.google.android.gms.ads.internal.js.zzm
    public final void zzb(String str, JSONObject jSONObject) {
        this.f2622.zzb(str, jSONObject);
    }

    @Override // com.google.android.gms.ads.internal.js.zzak
    public final void zzlt() {
        Iterator<AbstractMap.SimpleEntry<String, zzt<? super zzaj>>> it = this.f2623.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry<String, zzt<? super zzaj>> next = it.next();
            String valueOf = String.valueOf(next.getValue().toString());
            zzagf.v(valueOf.length() != 0 ? "Unregistering eventhandler: ".concat(valueOf) : new String("Unregistering eventhandler: "));
            this.f2622.zzb(next.getKey(), next.getValue());
        }
        this.f2623.clear();
    }
}
