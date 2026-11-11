package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.zzbs;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p034.p080.C1502;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaoa extends zzlm {
    private boolean zzbgy;
    private boolean zzbgz;
    private zzlo zzcfl;
    private final zzamp zzdhj;
    private final boolean zzdmy;
    private final boolean zzdmz;
    private final float zzdna;
    private int zzdnb;
    private boolean zzdnc;
    private float zzdne;
    private float zzdnf;
    private final Object lock = new Object();
    private boolean zzdnd = true;
    private boolean zzbgx = true;

    public zzaoa(zzamp zzampVar, float f, boolean z, boolean z2) {
        this.zzdhj = zzampVar;
        this.zzdna = f;
        this.zzdmy = z;
        this.zzdmz = z2;
    }

    private final void zzc(String str, Map<String, String> map) {
        HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzbs.zzei();
        zzahn.runOnUiThread(new zzaob(this, hashMap));
    }

    @Override // com.google.android.gms.internal.zzll
    public final float getAspectRatio() {
        float f;
        synchronized (this.lock) {
            f = this.zzdnf;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.zzll
    public final int getPlaybackState() {
        int i;
        synchronized (this.lock) {
            i = this.zzdnb;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isClickToExpandEnabled() {
        boolean z;
        boolean isCustomControlsEnabled = isCustomControlsEnabled();
        synchronized (this.lock) {
            if (!isCustomControlsEnabled) {
                try {
                    z = this.zzbgz && this.zzdmz;
                } finally {
                }
            }
        }
        return z;
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isCustomControlsEnabled() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdmy && this.zzbgy;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.zzll
    public final boolean isMuted() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdnd;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.zzll
    public final void mute(boolean z) {
        zzc(z ? "mute" : "unmute", null);
    }

    @Override // com.google.android.gms.internal.zzll
    public final void pause() {
        zzc("pause", null);
    }

    @Override // com.google.android.gms.internal.zzll
    public final void play() {
        zzc("play", null);
    }

    public final void zza(float f, int i, boolean z, float f2) {
        boolean z2;
        int i2;
        synchronized (this.lock) {
            this.zzdne = f;
            z2 = this.zzdnd;
            this.zzdnd = z;
            i2 = this.zzdnb;
            this.zzdnb = i;
            float f3 = this.zzdnf;
            this.zzdnf = f2;
            if (Math.abs(f2 - f3) > 1.0E-4f) {
                Object obj = this.zzdhj;
                obj.getClass();
                ((View) obj).invalidate();
            }
        }
        zzbs.zzei();
        zzahn.runOnUiThread(new zzaoc(this, i2, i, z2, z));
    }

    @Override // com.google.android.gms.internal.zzll
    public final void zza(zzlo zzloVar) {
        synchronized (this.lock) {
            this.zzcfl = zzloVar;
        }
    }

    public final void zzb(zzmr zzmrVar) {
        boolean z;
        boolean z2;
        boolean z3;
        synchronized (this.lock) {
            z = zzmrVar.zzbgx;
            this.zzbgx = z;
            z2 = zzmrVar.zzbgy;
            this.zzbgy = z2;
            z3 = zzmrVar.zzbgz;
            this.zzbgz = z3;
        }
        String str = z ? "1" : "0";
        String str2 = z2 ? "1" : "0";
        String str3 = z3 ? "1" : "0";
        C1502 c1502 = new C1502(3);
        c1502.put("muteStart", str);
        c1502.put("customControlsRequested", str2);
        c1502.put("clickToExpandRequested", str3);
        zzc("initialState", Collections.unmodifiableMap(c1502));
    }

    @Override // com.google.android.gms.internal.zzll
    public final float zzih() {
        return this.zzdna;
    }

    @Override // com.google.android.gms.internal.zzll
    public final float zzii() {
        float f;
        synchronized (this.lock) {
            f = this.zzdne;
        }
        return f;
    }

    @Override // com.google.android.gms.internal.zzll
    public final zzlo zzij() {
        zzlo zzloVar;
        synchronized (this.lock) {
            zzloVar = this.zzcfl;
        }
        return zzloVar;
    }
}
