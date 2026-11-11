package com.google.android.gms.internal;

import android.os.Bundle;
import android.view.View;
import java.util.List;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzoj extends zzqf implements zzov {
    private Bundle mExtras;
    private Object mLock = new Object();
    private String zzbts;
    private List<zzoi> zzbtt;
    private String zzbtu;
    private zzpq zzbtv;
    private String zzbtw;
    private double zzbtx;
    private String zzbty;
    private String zzbtz;
    private zzog zzbua;
    private zzll zzbub;
    private View zzbuc;
    private InterfaceC2455 zzbud;
    private String zzbue;
    private zzos zzbuf;

    public zzoj(String str, List<zzoi> list, String str2, zzpq zzpqVar, String str3, double d, String str4, String str5, zzog zzogVar, Bundle bundle, zzll zzllVar, View view, InterfaceC2455 interfaceC2455, String str6) {
        this.zzbts = str;
        this.zzbtt = list;
        this.zzbtu = str2;
        this.zzbtv = zzpqVar;
        this.zzbtw = str3;
        this.zzbtx = d;
        this.zzbty = str4;
        this.zzbtz = str5;
        this.zzbua = zzogVar;
        this.mExtras = bundle;
        this.zzbub = zzllVar;
        this.zzbuc = view;
        this.zzbud = interfaceC2455;
        this.zzbue = str6;
    }

    public static /* synthetic */ zzos zza(zzoj zzojVar, zzos zzosVar) {
        zzojVar.zzbuf = null;
        return null;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final void destroy() {
        zzahn.zzdaw.post(new zzok(this));
        this.zzbts = null;
        this.zzbtt = null;
        this.zzbtu = null;
        this.zzbtv = null;
        this.zzbtw = null;
        this.zzbtx = 0.0d;
        this.zzbty = null;
        this.zzbtz = null;
        this.zzbua = null;
        this.mExtras = null;
        this.mLock = null;
        this.zzbub = null;
        this.zzbuc = null;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final String getBody() {
        return this.zzbtu;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final String getCallToAction() {
        return this.zzbtw;
    }

    @Override // com.google.android.gms.internal.zzou
    public final String getCustomTemplateId() {
        return "";
    }

    @Override // com.google.android.gms.internal.zzqe
    public final Bundle getExtras() {
        return this.mExtras;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final String getHeadline() {
        return this.zzbts;
    }

    @Override // com.google.android.gms.internal.zzqe, com.google.android.gms.internal.zzov
    public final List getImages() {
        return this.zzbtt;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final String getMediationAdapterClassName() {
        return this.zzbue;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final String getPrice() {
        return this.zzbtz;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final double getStarRating() {
        return this.zzbtx;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final String getStore() {
        return this.zzbty;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final zzll getVideoController() {
        return this.zzbub;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final void performClick(Bundle bundle) {
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbuf;
            if (zzosVar == null) {
                zzakb.e("Attempt to perform click before app install ad initialized.");
            } else {
                zzosVar.performClick(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzqe
    public final boolean recordImpression(Bundle bundle) {
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbuf;
            if (zzosVar == null) {
                zzakb.e("Attempt to record impression before app install ad initialized.");
                return false;
            }
            return zzosVar.recordImpression(bundle);
        }
    }

    @Override // com.google.android.gms.internal.zzqe
    public final void reportTouchEvent(Bundle bundle) {
        synchronized (this.mLock) {
            zzos zzosVar = this.zzbuf;
            if (zzosVar == null) {
                zzakb.e("Attempt to perform click before app install ad initialized.");
            } else {
                zzosVar.reportTouchEvent(bundle);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzou
    public final void zzb(zzos zzosVar) {
        synchronized (this.mLock) {
            this.zzbuf = zzosVar;
        }
    }

    @Override // com.google.android.gms.internal.zzqe
    public final zzpq zzjs() {
        return this.zzbtv;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final InterfaceC2455 zzjt() {
        return new BinderC2454(this.zzbuf);
    }

    @Override // com.google.android.gms.internal.zzou
    public final String zzju() {
        return "2";
    }

    @Override // com.google.android.gms.internal.zzou
    public final zzog zzjv() {
        return this.zzbua;
    }

    @Override // com.google.android.gms.internal.zzou
    public final View zzjw() {
        return this.zzbuc;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final InterfaceC2455 zzjx() {
        return this.zzbud;
    }

    @Override // com.google.android.gms.internal.zzqe
    public final zzpm zzjy() {
        return this.zzbua;
    }
}
