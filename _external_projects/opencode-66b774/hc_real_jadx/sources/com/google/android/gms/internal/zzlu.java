package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlu {
    private String zzbea;
    private String zzbec;
    private String zzbeg;
    private boolean zzbei;
    private Date zzhh;
    private Location zzhl;
    private final HashSet<String> zzbfx = new HashSet<>();
    private final Bundle zzbfs = new Bundle();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzbfy = new HashMap<>();
    private final HashSet<String> zzbfz = new HashSet<>();
    private final Bundle zzbee = new Bundle();
    private final HashSet<String> zzbga = new HashSet<>();
    private int zzbdw = -1;
    private boolean zzamr = false;
    private int zzbdz = -1;

    public final void setManualImpressionsEnabled(boolean z) {
        this.zzamr = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void zza(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zza(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzbfy.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zza(Class<? extends MediationAdapter> cls, Bundle bundle) {
        this.zzbfs.putBundle(cls.getName(), bundle);
    }

    public final void zza(Date date) {
        this.zzhh = date;
    }

    public final void zzad(String str) {
        this.zzbfx.add(str);
    }

    public final void zzae(String str) {
        this.zzbfz.add(str);
    }

    public final void zzaf(String str) {
        this.zzbfz.remove(str);
    }

    public final void zzag(String str) {
        this.zzbec = str;
    }

    public final void zzah(String str) {
        this.zzbea = str;
    }

    public final void zzai(String str) {
        this.zzbeg = str;
    }

    public final void zzaj(String str) {
        this.zzbga.add(str);
    }

    public final void zzb(Location location) {
        this.zzhl = location;
    }

    public final void zzb(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzbfs.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzbfs.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        this.zzbfs.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(cls.getName(), bundle);
    }

    public final void zzd(String str, String str2) {
        this.zzbee.putString(str, str2);
    }

    public final void zzi(boolean z) {
        this.zzbdz = z ? 1 : 0;
    }

    public final void zzj(boolean z) {
        this.zzbei = z;
    }

    public final void zzr(int i) {
        this.zzbdw = i;
    }
}
