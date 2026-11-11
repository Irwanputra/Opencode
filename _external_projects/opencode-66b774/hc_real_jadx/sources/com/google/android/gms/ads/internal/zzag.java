package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkl;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzqq;
import com.google.android.gms.internal.zzqt;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zzrc;
import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzzv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import p034.p080.C1493;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.RunnableC2387;
import p131.p161.p162.p193.p194.p199.RunnableC2439;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzag extends zzkl {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public final zzrf f2666;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Context f2667;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public final zzqt f2668;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public final PublisherAdViewOptions f2669;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public final String f2670;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public final zzakd f2671;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final zzld f2672;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final zzkh f2673;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public WeakReference<zzd> f2675;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final zzqq f2676;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public final C1493<String, zzqw> f2677;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final zzrc f2678;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public final zzpe f2679;

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public final zzv f2680;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final zzux f2681;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public final zzjn f2683;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final C1493<String, zzqz> f2684;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public final Object f2674 = new Object();

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public final List<String> f2682 = m1223();

    public zzag(Context context, String str, zzux zzuxVar, zzakd zzakdVar, zzkh zzkhVar, zzqq zzqqVar, zzrc zzrcVar, zzqt zzqtVar, C1493<String, zzqz> c1493, C1493<String, zzqw> c14932, zzpe zzpeVar, zzld zzldVar, zzv zzvVar, zzrf zzrfVar, zzjn zzjnVar, PublisherAdViewOptions publisherAdViewOptions) {
        this.f2667 = context;
        this.f2670 = str;
        this.f2681 = zzuxVar;
        this.f2671 = zzakdVar;
        this.f2673 = zzkhVar;
        this.f2668 = zzqtVar;
        this.f2676 = zzqqVar;
        this.f2678 = zzrcVar;
        this.f2684 = c1493;
        this.f2677 = c14932;
        this.f2679 = zzpeVar;
        this.f2672 = zzldVar;
        this.f2680 = zzvVar;
        this.f2666 = zzrfVar;
        this.f2683 = zzjnVar;
        this.f2669 = publisherAdViewOptions;
        zznh.initialize(context);
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static void m1221(zzag zzagVar, zzjj zzjjVar) {
        zzq zzqVar = new zzq(zzagVar.f2667, zzagVar.f2680, zzagVar.f2683, zzagVar.f2670, zzagVar.f2681, zzagVar.f2671);
        zzagVar.f2675 = new WeakReference<>(zzqVar);
        zzrf zzrfVar = zzagVar.f2666;
        C1687.m3716("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
        zzqVar.zzano.f2776 = zzrfVar;
        PublisherAdViewOptions publisherAdViewOptions = zzagVar.f2669;
        if (publisherAdViewOptions != null) {
            if (publisherAdViewOptions.zzbn() != null) {
                zzqVar.zza(zzagVar.f2669.zzbn());
            }
            zzqVar.setManualImpressionsEnabled(zzagVar.f2669.getManualImpressionsEnabled());
        }
        zzqq zzqqVar = zzagVar.f2676;
        C1687.m3716("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzqVar.zzano.f2796 = zzqqVar;
        zzqt zzqtVar = zzagVar.f2668;
        C1687.m3716("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzqVar.zzano.f2774 = zzqtVar;
        C1493<String, zzqz> c1493 = zzagVar.f2684;
        C1687.m3716("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzqVar.zzano.f2785 = c1493;
        C1493<String, zzqw> c14932 = zzagVar.f2677;
        C1687.m3716("setOnCustomClickListener must be called on the main UI thread.");
        zzqVar.zzano.f2797 = c14932;
        zzpe zzpeVar = zzagVar.f2679;
        C1687.m3716("setNativeAdOptions must be called on the main UI thread.");
        zzqVar.zzano.f2790 = zzpeVar;
        zzqVar.zzd(zzagVar.m1223());
        zzqVar.zza(zzagVar.f2673);
        zzqVar.zza(zzagVar.f2672);
        ArrayList arrayList = new ArrayList();
        if (zzagVar.m1224()) {
            arrayList.add(1);
        }
        if (zzagVar.f2666 != null) {
            arrayList.add(2);
        }
        zzqVar.zze(arrayList);
        if (zzagVar.m1224()) {
            zzjjVar.extras.putBoolean("ina", true);
        }
        if (zzagVar.f2666 != null) {
            zzjjVar.extras.putBoolean("iba", true);
        }
        zzqVar.zzb(zzjjVar);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public static void m1222(zzag zzagVar, zzjj zzjjVar, int i) {
        Context context = zzagVar.f2667;
        zzba zzbaVar = new zzba(context, zzagVar.f2680, zzjn.zzf(context), zzagVar.f2670, zzagVar.f2681, zzagVar.f2671);
        zzagVar.f2675 = new WeakReference<>(zzbaVar);
        zzqq zzqqVar = zzagVar.f2676;
        C1687.m3716("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
        zzbaVar.zzano.f2796 = zzqqVar;
        zzqt zzqtVar = zzagVar.f2668;
        C1687.m3716("setOnContentAdLoadedListener must be called on the main UI thread.");
        zzbaVar.zzano.f2774 = zzqtVar;
        C1493<String, zzqz> c1493 = zzagVar.f2684;
        C1687.m3716("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
        zzbaVar.zzano.f2785 = c1493;
        zzbaVar.zza(zzagVar.f2673);
        C1493<String, zzqw> c14932 = zzagVar.f2677;
        C1687.m3716("setOnCustomClickListener must be called on the main UI thread.");
        zzbaVar.zzano.f2797 = c14932;
        zzbaVar.zzd(zzagVar.m1223());
        zzpe zzpeVar = zzagVar.f2679;
        C1687.m3716("setNativeAdOptions must be called on the main UI thread.");
        zzbaVar.zzano.f2790 = zzpeVar;
        zzbaVar.zza(zzagVar.f2672);
        zzbaVar.zzj(i);
        zzbaVar.zzb(zzjjVar);
    }

    @Override // com.google.android.gms.internal.zzkk
    public final String getMediationAdapterClassName() {
        synchronized (this.f2674) {
            WeakReference<zzd> weakReference = this.f2675;
            if (weakReference == null) {
                return null;
            }
            zzd zzdVar = weakReference.get();
            return zzdVar != null ? zzdVar.getMediationAdapterClassName() : null;
        }
    }

    @Override // com.google.android.gms.internal.zzkk
    public final boolean isLoading() {
        synchronized (this.f2674) {
            WeakReference<zzd> weakReference = this.f2675;
            if (weakReference == null) {
                return false;
            }
            zzd zzdVar = weakReference.get();
            return zzdVar != null ? zzdVar.isLoading() : false;
        }
    }

    @Override // com.google.android.gms.internal.zzkk
    public final void zza(zzjj zzjjVar, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Number of ads has to be more than 0");
        }
        zzahn.zzdaw.post(new RunnableC2387(this, zzjjVar, i));
    }

    @Override // com.google.android.gms.internal.zzkk
    public final String zzcp() {
        synchronized (this.f2674) {
            WeakReference<zzd> weakReference = this.f2675;
            if (weakReference == null) {
                return null;
            }
            zzd zzdVar = weakReference.get();
            return zzdVar != null ? zzdVar.zzcp() : null;
        }
    }

    @Override // com.google.android.gms.internal.zzkk
    public final void zzd(zzjj zzjjVar) {
        zzahn.zzdaw.post(new RunnableC2439(this, zzjjVar));
    }

    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    public final List<String> m1223() {
        ArrayList arrayList = new ArrayList();
        if (this.f2668 != null) {
            arrayList.add("1");
        }
        if (this.f2676 != null) {
            arrayList.add("2");
        }
        if (this.f2684.f6910 > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final boolean m1224() {
        if (this.f2676 != null || this.f2668 != null) {
            return true;
        }
        C1493<String, zzqz> c1493 = this.f2684;
        return c1493 != null && c1493.f6910 > 0;
    }
}
