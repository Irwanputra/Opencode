package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.zzadp;
import com.google.android.gms.internal.zzahh;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzcv;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkt;
import com.google.android.gms.internal.zzkx;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zzmr;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzxl;
import com.google.android.gms.internal.zzxr;
import com.google.android.gms.internal.zzzv;
import java.util.concurrent.Future;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.AsyncTaskC2390;
import p131.p161.p162.p193.p194.p199.C2430;
import p131.p161.p162.p193.p194.p199.C2444;
import p131.p161.p162.p193.p194.p199.CallableC2437;
import p131.p161.p162.p193.p194.p199.ViewOnTouchListenerC2440;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbm extends zzkt {

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public zzkh f2730;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final zzakd f2731;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public WebView f2732;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public AsyncTask<Void, Void, String> f2733;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public final zzjn f2734;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public final Context f2735;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public final C2430 f2736;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public final Future<zzcv> f2737 = zzahh.zza(zzahh.zzdar, new CallableC2437(this));

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public zzcv f2738;

    public zzbm(Context context, zzjn zzjnVar, String str, zzakd zzakdVar) {
        this.f2735 = context;
        this.f2731 = zzakdVar;
        this.f2734 = zzjnVar;
        this.f2732 = new WebView(context);
        this.f2736 = new C2430(str);
        m1235(0);
        this.f2732.setVerticalScrollBarEnabled(false);
        this.f2732.getSettings().setJavaScriptEnabled(true);
        this.f2732.setWebViewClient(new C2444(this));
        this.f2732.setOnTouchListener(new ViewOnTouchListenerC2440(this));
    }

    @Override // com.google.android.gms.internal.zzks
    public final void destroy() {
        C1687.m3716("destroy must be called on the main UI thread.");
        this.f2733.cancel(true);
        this.f2737.cancel(true);
        this.f2732.destroy();
        this.f2732 = null;
    }

    @Override // com.google.android.gms.internal.zzks
    public final String getAdUnitId() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.internal.zzks
    public final String getMediationAdapterClassName() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzll getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean isLoading() {
        return false;
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean isReady() {
        return false;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void pause() {
        C1687.m3716("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void resume() {
        C1687.m3716("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setImmersiveMode(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setManualImpressionsEnabled(boolean z) {
    }

    @Override // com.google.android.gms.internal.zzks
    public final void setUserId(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void showInterstitial() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void stopLoading() {
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzadp zzadpVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzjn zzjnVar) {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzke zzkeVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzkh zzkhVar) {
        this.f2730 = zzkhVar;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzkx zzkxVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzld zzldVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzlr zzlrVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzmr zzmrVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzoa zzoaVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzxl zzxlVar) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zza(zzxr zzxrVar, String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final boolean zzb(zzjj zzjjVar) {
        C1687.m3726(this.f2732, "This Search Ad has already been torn down");
        C2430 c2430 = this.f2736;
        zzakd zzakdVar = this.f2731;
        c2430.getClass();
        c2430.f9766 = zzjjVar.zzbdm.zzbgw;
        Bundle bundle = zzjjVar.zzbdp;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String str = (String) zzkb.zzif().zzd(zznh.zzbpt);
            for (String str2 : bundle2.keySet()) {
                if (str.equals(str2)) {
                    c2430.f9768 = bundle2.getString(str2);
                } else if (str2.startsWith("csa_")) {
                    c2430.f9765.put(str2.substring(4), bundle2.getString(str2));
                }
            }
            c2430.f9765.put("SDKVersion", zzakdVar.zzcv);
        }
        this.f2733 = new AsyncTaskC2390(this, null).execute(new Void[0]);
        return true;
    }

    @Override // com.google.android.gms.internal.zzks
    public final InterfaceC2455 zzbr() {
        C1687.m3716("getAdFrame must be called on the main UI thread.");
        return new BinderC2454(this.f2732);
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzjn zzbs() {
        return this.f2734;
    }

    @Override // com.google.android.gms.internal.zzks
    public final void zzbu() {
        throw new IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzkx zzcd() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.internal.zzks
    public final zzkh zzce() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.internal.zzks
    public final String zzcp() {
        return null;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final String m1234() {
        String str = this.f2736.f9768;
        if (TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String str2 = (String) zzkb.zzif().zzd(zznh.zzbps);
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + "https://".length());
        sb.append("https://");
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m1235(int i) {
        if (this.f2732 == null) {
            return;
        }
        this.f2732.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }
}
