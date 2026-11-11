package com.google.android.gms.internal;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzng<T> implements Callable<T> {
    private /* synthetic */ zzmx zzbhj;
    private /* synthetic */ zznf zzbhk;

    public zzng(zznf zznfVar, zzmx zzmxVar) {
        this.zzbhk = zznfVar;
        this.zzbhj = zzmxVar;
    }

    @Override // java.util.concurrent.Callable
    public final T call() {
        SharedPreferences sharedPreferences;
        zzmx zzmxVar = this.zzbhj;
        sharedPreferences = this.zzbhk.zzbhh;
        return (T) zzmxVar.zza(sharedPreferences);
    }
}
