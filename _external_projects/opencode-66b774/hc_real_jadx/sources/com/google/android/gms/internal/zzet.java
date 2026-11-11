package com.google.android.gms.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzet implements Callable {
    private String TAG = getClass().getSimpleName();
    private String className;
    public final zzdm zzagr;
    public final zzaz zzako;
    private String zzaku;
    public Method zzakw;
    private int zzala;
    private int zzalb;

    public zzet(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2) {
        this.zzagr = zzdmVar;
        this.className = str;
        this.zzaku = str2;
        this.zzako = zzazVar;
        this.zzala = i;
        this.zzalb = i2;
    }

    public abstract void zzay();

    @Override // java.util.concurrent.Callable
    /* renamed from: zzba, reason: merged with bridge method [inline-methods] */
    public Void call() {
        long nanoTime;
        Method zza;
        int i;
        try {
            nanoTime = System.nanoTime();
            zza = this.zzagr.zza(this.className, this.zzaku);
            this.zzakw = zza;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zza == null) {
            return null;
        }
        zzay();
        zzcp zzal = this.zzagr.zzal();
        if (zzal != null && (i = this.zzala) != Integer.MIN_VALUE) {
            zzal.zza(this.zzalb, i, (System.nanoTime() - nanoTime) / 1000);
        }
        return null;
    }
}
