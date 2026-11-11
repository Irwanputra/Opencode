package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzbs;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaix<T> implements zzakg<Throwable, T> {
    private /* synthetic */ zzajb zzdcm;

    public zzaix(zzaiv zzaivVar, zzajb zzajbVar) {
        this.zzdcm = zzajbVar;
    }

    @Override // com.google.android.gms.internal.zzakg
    public final /* synthetic */ zzakv zzc(Throwable th) {
        Throwable th2 = th;
        zzakb.zzb("Error occurred while dispatching http response in getter.", th2);
        zzbs.zzem().zza(th2, "HttpGetter.deliverResponse.1");
        return zzakl.zzi(this.zzdcm.zzni());
    }
}
