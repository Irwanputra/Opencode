package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzhg {
    private final Object zzayr = new Object();
    private zzhh zzays = null;
    private boolean zzayt = false;

    public final Activity getActivity() {
        synchronized (this.zzayr) {
            zzhh zzhhVar = this.zzays;
            if (zzhhVar == null) {
                return null;
            }
            return zzhhVar.getActivity();
        }
    }

    public final Context getContext() {
        synchronized (this.zzayr) {
            zzhh zzhhVar = this.zzays;
            if (zzhhVar == null) {
                return null;
            }
            return zzhhVar.getContext();
        }
    }

    public final void initialize(Context context) {
        synchronized (this.zzayr) {
            if (!this.zzayt) {
                if (!((Boolean) zzkb.zzif().zzd(zznh.zzble)).booleanValue()) {
                    return;
                }
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzakb.zzcu("Can not cast Context to Application");
                    return;
                }
                if (this.zzays == null) {
                    this.zzays = new zzhh();
                }
                this.zzays.zza(application, context);
                this.zzayt = true;
            }
        }
    }

    public final void zza(zzhj zzhjVar) {
        synchronized (this.zzayr) {
            if (((Boolean) zzkb.zzif().zzd(zznh.zzble)).booleanValue()) {
                if (this.zzays == null) {
                    this.zzays = new zzhh();
                }
                this.zzays.zza(zzhjVar);
            }
        }
    }
}
