package com.google.android.gms.internal;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.common.ConnectionResult;
import p131.p161.p162.p193.p205.p208.InterfaceC2491;
import p131.p161.p162.p193.p205.p208.InterfaceC2496;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaar extends zzaan implements InterfaceC2491, InterfaceC2496 {
    private Context mContext;
    private final Object mLock;
    private zzakd zzapr;
    private zzalh<zzaat> zzcmw;
    private final zzaal zzcmx;
    private zzaas zzcna;

    public zzaar(Context context, zzakd zzakdVar, zzalh<zzaat> zzalhVar, zzaal zzaalVar) {
        super(zzalhVar, zzaalVar);
        this.mLock = new Object();
        this.mContext = context;
        this.zzapr = zzakdVar;
        this.zzcmw = zzalhVar;
        this.zzcmx = zzaalVar;
        zzaas zzaasVar = new zzaas(context, ((Boolean) zzkb.zzif().zzd(zznh.zzbjf)).booleanValue() ? zzbs.zzew().zzqs() : context.getMainLooper(), this, this, this.zzapr.zzdek);
        this.zzcna = zzaasVar;
        zzaasVar.zzakj();
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2491
    public final void onConnected(Bundle bundle) {
        zznd();
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2496
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzakb.zzbx("Cannot connect to remote service, fallback to local instance.");
        new zzaaq(this.mContext, this.zzcmw, this.zzcmx).zznd();
        Bundle bundle = new Bundle();
        bundle.putString("action", "gms_connection_failed_fallback_to_local");
        zzbs.zzei().zzb(this.mContext, this.zzapr.zzcv, "gmob-apps", bundle, true);
    }

    @Override // p131.p161.p162.p193.p205.p208.InterfaceC2491
    public final void onConnectionSuspended(int i) {
        zzakb.zzbx("Disconnected from remote ad request service.");
    }

    @Override // com.google.android.gms.internal.zzaan
    public final void zznk() {
        synchronized (this.mLock) {
            if (this.zzcna.isConnected() || this.zzcna.isConnecting()) {
                this.zzcna.disconnect();
            }
            Binder.flushPendingCommands();
        }
    }

    @Override // com.google.android.gms.internal.zzaan
    public final zzabb zznl() {
        zzabb zznm;
        synchronized (this.mLock) {
            try {
                try {
                    zznm = this.zzcna.zznm();
                } catch (DeadObjectException | IllegalStateException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zznm;
    }
}
