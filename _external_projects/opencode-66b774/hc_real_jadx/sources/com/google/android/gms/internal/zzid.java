package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbs;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzid {
    private Context mContext;
    private zzik zzbau;
    private zzio zzbav;
    private final Runnable zzbat = new zzie(this);
    private final Object mLock = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public final void connect() {
        synchronized (this.mLock) {
            if (this.mContext != null && this.zzbau == null) {
                zzik zzikVar = new zzik(this.mContext, zzbs.zzew().zzqs(), new zzig(this), new zzih(this));
                this.zzbau = zzikVar;
                zzikVar.zzakj();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void disconnect() {
        synchronized (this.mLock) {
            zzik zzikVar = this.zzbau;
            if (zzikVar == null) {
                return;
            }
            if (zzikVar.isConnected() || this.zzbau.isConnecting()) {
                this.zzbau.disconnect();
            }
            this.zzbau = null;
            this.zzbav = null;
            Binder.flushPendingCommands();
        }
    }

    public static /* synthetic */ zzik zza(zzid zzidVar, zzik zzikVar) {
        zzidVar.zzbau = null;
        return null;
    }

    public final void initialize(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.mLock) {
            if (this.mContext != null) {
                return;
            }
            this.mContext = context.getApplicationContext();
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbqh)).booleanValue()) {
                connect();
            } else {
                if (((Boolean) zzkb.zzif().zzd(zznh.zzbqg)).booleanValue()) {
                    zzbs.zzel().zza(new zzif(this));
                }
            }
        }
    }

    public final zzii zza(zzil zzilVar) {
        synchronized (this.mLock) {
            zzio zzioVar = this.zzbav;
            if (zzioVar == null) {
                return new zzii();
            }
            try {
                return zzioVar.zza(zzilVar);
            } catch (RemoteException e) {
                zzakb.zzb("Unable to call into cache service.", e);
                return new zzii();
            }
        }
    }

    public final void zzhe() {
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbqi)).booleanValue()) {
            synchronized (this.mLock) {
                connect();
                zzbs.zzei();
                Handler handler = zzahn.zzdaw;
                handler.removeCallbacks(this.zzbat);
                zzbs.zzei();
                handler.postDelayed(this.zzbat, ((Long) zzkb.zzif().zzd(zznh.zzbqj)).longValue());
            }
        }
    }
}
