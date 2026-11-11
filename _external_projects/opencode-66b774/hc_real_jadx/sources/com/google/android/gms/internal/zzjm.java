package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzjm {
    public static final zzjm zzbej = new zzjm();

    public static zzjj zza(Context context, zzlt zzltVar) {
        Context context2;
        List list;
        String str;
        Date birthday = zzltVar.getBirthday();
        long time = birthday != null ? birthday.getTime() : -1L;
        String contentUrl = zzltVar.getContentUrl();
        int gender = zzltVar.getGender();
        Set<String> keywords = zzltVar.getKeywords();
        if (keywords.isEmpty()) {
            context2 = context;
            list = null;
        } else {
            list = Collections.unmodifiableList(new ArrayList(keywords));
            context2 = context;
        }
        boolean isTestDevice = zzltVar.isTestDevice(context2);
        int zzio = zzltVar.zzio();
        Location location = zzltVar.getLocation();
        Bundle networkExtrasBundle = zzltVar.getNetworkExtrasBundle(AdMobAdapter.class);
        boolean manualImpressionsEnabled = zzltVar.getManualImpressionsEnabled();
        String publisherProvidedId = zzltVar.getPublisherProvidedId();
        SearchAdRequest zzil = zzltVar.zzil();
        zzmn zzmnVar = zzil != null ? new zzmn(zzil) : null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzkb.zzia();
            str = zzajr.zza(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        return new zzjj(7, time, networkExtrasBundle, gender, list, isTestDevice, zzio, manualImpressionsEnabled, publisherProvidedId, zzmnVar, location, contentUrl, zzltVar.zzin(), zzltVar.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzltVar.zzip())), zzltVar.zzik(), str, zzltVar.isDesignedForFamilies());
    }
}
