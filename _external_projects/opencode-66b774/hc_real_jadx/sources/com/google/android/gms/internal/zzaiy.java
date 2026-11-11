package com.google.android.gms.internal;

import java.io.ByteArrayInputStream;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaiy<T> implements zzakh<zzp, T> {
    private /* synthetic */ zzajb zzdcm;

    public zzaiy(zzaiv zzaivVar, zzajb zzajbVar) {
        this.zzdcm = zzajbVar;
    }

    @Override // com.google.android.gms.internal.zzakh
    public final /* synthetic */ Object apply(zzp zzpVar) {
        return this.zzdcm.zze(new ByteArrayInputStream(zzpVar.data));
    }
}
