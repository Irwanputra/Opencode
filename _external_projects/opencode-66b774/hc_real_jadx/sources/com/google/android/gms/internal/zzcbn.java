package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p131.p161.p162.p193.p205.p208.InterfaceC2491;
import p131.p161.p162.p193.p205.p208.InterfaceC2496;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzcbn implements InterfaceC2491, InterfaceC2496 {
    private final String packageName;
    private zzcbo zzibm;
    private final String zzibn;
    private final LinkedBlockingQueue<zzaz> zzibo;
    private final HandlerThread zzibp;

    public zzcbn(Context context, String str, String str2) {
        this.packageName = str;
        this.zzibn = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zzibp = handlerThread;
        handlerThread.start();
        this.zzibm = new zzcbo(context, handlerThread.getLooper(), this, this);
        this.zzibo = new LinkedBlockingQueue<>();
        this.zzibm.zzakj();
    }

    private final zzcbt zzauo() {
        try {
            return this.zzibm.zzauq();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    private static zzaz zzaup() {
        zzaz zzazVar = new zzaz();
        zzazVar.zzdt = 32768L;
        return zzazVar;
    }

    private final void zznk() {
        zzcbo zzcboVar = this.zzibm;
        if (zzcboVar != null) {
            if (zzcboVar.isConnected() || this.zzibm.isConnecting()) {
                this.zzibm.disconnect();
            }
        }
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2491
    public final void onConnected(Bundle bundle) {
        zzcbt zzauo = zzauo();
        if (zzauo != null) {
            try {
                try {
                    this.zzibo.put(zzauo.zza(new zzcbp(this.packageName, this.zzibn)).zzaur());
                } catch (Throwable unused) {
                    this.zzibo.put(zzaup());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                zznk();
                this.zzibp.quit();
                throw th;
            }
            zznk();
            this.zzibp.quit();
        }
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2496
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzibo.put(zzaup());
        } catch (InterruptedException unused) {
        }
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2491
    public final void onConnectionSuspended(int i) {
        try {
            this.zzibo.put(zzaup());
        } catch (InterruptedException unused) {
        }
    }

    public final zzaz zzdo(int i) {
        zzaz zzazVar;
        try {
            zzazVar = this.zzibo.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzazVar = null;
        }
        return zzazVar == null ? zzaup() : zzazVar;
    }
}
