package com.google.android.gms.internal;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaeu implements Runnable {
    private /* synthetic */ zzaes zzcwm;
    private /* synthetic */ zzakv zzcwn;

    public zzaeu(zzaes zzaesVar, zzakv zzakvVar) {
        this.zzcwm = zzaesVar;
        this.zzcwn = zzakvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        zzfjw zzfjwVar;
        try {
            this.zzcwm.zzp((Map) this.zzcwn.get());
            zzaes zzaesVar = this.zzcwm;
            if (zzaesVar.zzcwh) {
                obj = zzaesVar.mLock;
                synchronized (obj) {
                    zzfjwVar = this.zzcwm.zzcwe;
                    zzfjwVar.zzpnw = 9;
                }
            }
            this.zzcwm.send();
        } catch (InterruptedException | ExecutionException | JSONException e) {
            if (((Boolean) zzkb.zzif().zzd(zznh.zzbqb)).booleanValue()) {
                zzakb.zza("Failed to get SafeBrowsing metadata", e);
            }
        }
    }
}
