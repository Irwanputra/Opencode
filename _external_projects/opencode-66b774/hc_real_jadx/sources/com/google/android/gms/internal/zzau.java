package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

/* loaded from: /tmp/opencode/hc_real.dex */
public class zzau extends zzr<String> {
    private final zzy<String> zzcj;

    public zzau(int i, String str, zzy<String> zzyVar, zzx zzxVar) {
        super(i, str, zzxVar);
        this.zzcj = zzyVar;
    }

    @Override // com.google.android.gms.internal.zzr
    public final zzw<String> zza(zzp zzpVar) {
        String str;
        try {
            str = new String(zzpVar.data, zzao.zzb(zzpVar.zzac));
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzpVar.data);
        }
        return zzw.zza(str, zzao.zzb(zzpVar));
    }

    @Override // com.google.android.gms.internal.zzr
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public void zza(String str) {
        zzy<String> zzyVar = this.zzcj;
        if (zzyVar != null) {
            zzyVar.zzb(str);
        }
    }
}
