package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzlt {
    private final boolean zzamr;
    private final int zzbdw;
    private final int zzbdz;
    private final String zzbea;
    private final String zzbec;
    private final Bundle zzbee;
    private final String zzbeg;
    private final boolean zzbei;
    private final Bundle zzbfs;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzbft;
    private final SearchAdRequest zzbfu;
    private final Set<String> zzbfv;
    private final Set<String> zzbfw;
    private final Date zzhh;
    private final Set<String> zzhj;
    private final Location zzhl;

    public zzlt(zzlu zzluVar) {
        this(zzluVar, null);
    }

    public zzlt(zzlu zzluVar, SearchAdRequest searchAdRequest) {
        Date date;
        String str;
        int i;
        HashSet hashSet;
        Location location;
        boolean z;
        Bundle bundle;
        HashMap hashMap;
        String str2;
        String str3;
        int i2;
        HashSet hashSet2;
        Bundle bundle2;
        HashSet hashSet3;
        boolean z2;
        date = zzluVar.zzhh;
        this.zzhh = date;
        str = zzluVar.zzbec;
        this.zzbec = str;
        i = zzluVar.zzbdw;
        this.zzbdw = i;
        hashSet = zzluVar.zzbfx;
        this.zzhj = Collections.unmodifiableSet(hashSet);
        location = zzluVar.zzhl;
        this.zzhl = location;
        z = zzluVar.zzamr;
        this.zzamr = z;
        bundle = zzluVar.zzbfs;
        this.zzbfs = bundle;
        hashMap = zzluVar.zzbfy;
        this.zzbft = Collections.unmodifiableMap(hashMap);
        str2 = zzluVar.zzbea;
        this.zzbea = str2;
        str3 = zzluVar.zzbeg;
        this.zzbeg = str3;
        this.zzbfu = searchAdRequest;
        i2 = zzluVar.zzbdz;
        this.zzbdz = i2;
        hashSet2 = zzluVar.zzbfz;
        this.zzbfv = Collections.unmodifiableSet(hashSet2);
        bundle2 = zzluVar.zzbee;
        this.zzbee = bundle2;
        hashSet3 = zzluVar.zzbga;
        this.zzbfw = Collections.unmodifiableSet(hashSet3);
        z2 = zzluVar.zzbei;
        this.zzbei = z2;
    }

    public final Date getBirthday() {
        return this.zzhh;
    }

    public final String getContentUrl() {
        return this.zzbec;
    }

    public final Bundle getCustomEventExtrasBundle(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzbfs.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle getCustomTargeting() {
        return this.zzbee;
    }

    public final int getGender() {
        return this.zzbdw;
    }

    public final Set<String> getKeywords() {
        return this.zzhj;
    }

    public final Location getLocation() {
        return this.zzhl;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzamr;
    }

    @Deprecated
    public final <T extends NetworkExtras> T getNetworkExtras(Class<T> cls) {
        return (T) this.zzbft.get(cls);
    }

    public final Bundle getNetworkExtrasBundle(Class<? extends MediationAdapter> cls) {
        return this.zzbfs.getBundle(cls.getName());
    }

    public final String getPublisherProvidedId() {
        return this.zzbea;
    }

    public final boolean isDesignedForFamilies() {
        return this.zzbei;
    }

    public final boolean isTestDevice(Context context) {
        Set<String> set = this.zzbfv;
        zzkb.zzia();
        return set.contains(zzajr.zzbc(context));
    }

    public final String zzik() {
        return this.zzbeg;
    }

    public final SearchAdRequest zzil() {
        return this.zzbfu;
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> zzim() {
        return this.zzbft;
    }

    public final Bundle zzin() {
        return this.zzbfs;
    }

    public final int zzio() {
        return this.zzbdz;
    }

    public final Set<String> zzip() {
        return this.zzbfw;
    }
}
