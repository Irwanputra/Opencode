package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzbs;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzrx implements zzm {
    private final Context mContext;
    private final Object mLock = new Object();
    private zzrq zzbys;
    private boolean zzbyt;

    public zzrx(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.mLock) {
            zzrq zzrqVar = this.zzbys;
            if (zzrqVar == null) {
                return;
            }
            zzrqVar.disconnect();
            this.zzbys = null;
            Binder.flushPendingCommands();
        }
    }

    public static /* synthetic */ boolean zza(zzrx zzrxVar, boolean z) {
        zzrxVar.zzbyt = true;
        return true;
    }

    private final Future<ParcelFileDescriptor> zzb(zzrr zzrrVar) {
        zzry zzryVar = new zzry(this);
        zzrz zzrzVar = new zzrz(this, zzryVar, zzrrVar);
        zzsc zzscVar = new zzsc(this, zzryVar);
        synchronized (this.mLock) {
            zzrq zzrqVar = new zzrq(this.mContext, zzbs.zzew().zzqs(), zzrzVar, zzscVar);
            this.zzbys = zzrqVar;
            zzrqVar.zzakj();
        }
        return zzryVar;
    }

    @Override // com.google.android.gms.internal.zzm
    public final zzp zzc(zzr<?> zzrVar) {
        zzp zzpVar;
        zzrr zzg = zzrr.zzg(zzrVar);
        long intValue = ((Integer) zzkb.zzif().zzd(zznh.zzbqq)).intValue();
        ((C2510) zzbs.zzeo()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            try {
                zzrt zzrtVar = (zzrt) new zzabj(zzb(zzg).get(intValue, TimeUnit.MILLISECONDS)).zza(zzrt.CREATOR);
                if (zzrtVar.zzbyq) {
                    throw new zzad(zzrtVar.zzbyr);
                }
                if (zzrtVar.zzbyo.length != zzrtVar.zzbyp.length) {
                    zzpVar = null;
                } else {
                    HashMap hashMap = new HashMap();
                    int i = 0;
                    while (true) {
                        String[] strArr = zzrtVar.zzbyo;
                        if (i >= strArr.length) {
                            break;
                        }
                        hashMap.put(strArr[i], zzrtVar.zzbyp[i]);
                        i++;
                    }
                    zzpVar = new zzp(zzrtVar.statusCode, zzrtVar.data, hashMap, zzrtVar.zzad, zzrtVar.zzae);
                }
                return zzpVar;
            } finally {
                ((C2510) zzbs.zzeo()).getClass();
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                StringBuilder sb = new StringBuilder(52);
                sb.append("Http assets remote cache took ");
                sb.append(elapsedRealtime2);
                sb.append("ms");
                zzagf.v(sb.toString());
            }
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((C2510) zzbs.zzeo()).getClass();
            long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb2 = new StringBuilder(52);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            zzagf.v(sb2.toString());
            return null;
        }
    }
}
