package com.google.android.gms.internal;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyi extends zzagb {
    private final Object mLock;
    private final zzyb zzcjj;
    private final zzafp zzcjk;
    private final zzaax zzcjl;
    private final zzym zzcka;
    private Future<zzafo> zzckb;

    public zzyi(Context context, com.google.android.gms.ads.internal.zzba zzbaVar, zzafp zzafpVar, zzcv zzcvVar, zzyb zzybVar, zznu zznuVar) {
        this(zzafpVar, zzybVar, new zzym(context, zzbaVar, new zzaiv(context), zzcvVar, zzafpVar, zznuVar));
    }

    private zzyi(zzafp zzafpVar, zzyb zzybVar, zzym zzymVar) {
        this.mLock = new Object();
        this.zzcjk = zzafpVar;
        this.zzcjl = zzafpVar.zzcxy;
        this.zzcjj = zzybVar;
        this.zzcka = zzymVar;
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void onStop() {
        synchronized (this.mLock) {
            Future<zzafo> future = this.zzckb;
            if (future != null) {
                future.cancel(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.zzagb
    public final void zzdm() {
        int i;
        zzakv zza;
        zzafo zzafoVar = null;
        try {
            try {
                synchronized (this.mLock) {
                    zza = zzahh.zza(zzahh.zzdar, this.zzcka);
                    this.zzckb = zza;
                }
                zzafoVar = (zzafo) zza.get(60000L, TimeUnit.MILLISECONDS);
                i = -2;
            } catch (InterruptedException | CancellationException | ExecutionException unused) {
                i = 0;
            }
        } catch (TimeoutException unused2) {
            zzakb.zzcu("Timed out waiting for native ad.");
            this.zzckb.cancel(true);
            i = 2;
        }
        if (zzafoVar == null) {
            zzafp zzafpVar = this.zzcjk;
            zzaat zzaatVar = zzafpVar.zzcqv;
            zzjj zzjjVar = zzaatVar.zzcnd;
            zzaax zzaaxVar = this.zzcjl;
            int i2 = zzaaxVar.orientation;
            long j = zzaaxVar.zzcdq;
            String str = zzaatVar.zzcng;
            long j2 = zzaaxVar.zzcox;
            zzjn zzjnVar = zzafpVar.zzauc;
            long j3 = zzaaxVar.zzcov;
            long j4 = zzafpVar.zzcxp;
            long j5 = zzaaxVar.zzcpa;
            String str2 = zzaaxVar.zzcpb;
            JSONObject jSONObject = zzafpVar.zzcxj;
            zzaax zzaaxVar2 = zzafpVar.zzcxy;
            zzafoVar = new zzafo(zzjjVar, null, null, i, null, null, i2, j, str, false, null, null, null, null, null, j2, zzjnVar, j3, j4, j5, str2, jSONObject, null, null, null, null, zzaaxVar2.zzcpo, zzaaxVar2.zzcpp, null, null, zzaaxVar.zzcps, zzafpVar.zzcxw, zzaaxVar2.zzaqv, false);
        }
        zzahn.zzdaw.post(new zzyj(this, zzafoVar));
    }
}
