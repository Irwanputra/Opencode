package com.google.android.gms.internal;

import java.util.Map;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaja extends zzau {
    private /* synthetic */ byte[] zzdco;
    private /* synthetic */ Map zzdcp;
    private /* synthetic */ zzajv zzdcq;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaja(zzaiv zzaivVar, int i, String str, zzy zzyVar, zzx zzxVar, byte[] bArr, Map map, zzajv zzajvVar) {
        super(i, str, zzyVar, zzxVar);
        this.zzdco = bArr;
        this.zzdcp = map;
        this.zzdcq = zzajvVar;
    }

    @Override // com.google.android.gms.internal.zzr
    public final Map<String, String> getHeaders() {
        Map<String, String> map = this.zzdcp;
        return map == null ? super.getHeaders() : map;
    }

    @Override // com.google.android.gms.internal.zzr
    public final byte[] zzf() {
        byte[] bArr = this.zzdco;
        return bArr == null ? super.zzf() : bArr;
    }

    @Override // com.google.android.gms.internal.zzau, com.google.android.gms.internal.zzr
    /* renamed from: zzh */
    public final void zza(String str) {
        this.zzdcq.zzcr(str);
        super.zza(str);
    }
}
