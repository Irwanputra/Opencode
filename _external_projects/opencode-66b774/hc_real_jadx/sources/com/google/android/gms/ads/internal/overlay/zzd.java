package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.zzao;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzaht;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzje;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zzxb;
import com.google.android.gms.internal.zzxf;
import com.google.android.gms.internal.zzzv;
import java.util.Collections;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.p201.C2401;
import p131.p161.p162.p193.p194.p199.p201.C2402;
import p131.p161.p162.p193.p194.p199.p201.C2404;
import p131.p161.p162.p193.p194.p199.p201.C2406;
import p131.p161.p162.p193.p194.p199.p201.RunnableC2400;
import p131.p161.p162.p193.p203.BinderC2454;
import p131.p161.p162.p193.p203.InterfaceC2455;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzd extends zzxf implements zzt {

    /* renamed from: でどあくず, reason: contains not printable characters */
    public static int f2635 = Color.argb(0, 0, 0, 0);

    /* renamed from: 〳ぜぞぜべっ, reason: contains not printable characters */
    public FrameLayout f2636;

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final Activity f2637;

    /* renamed from: ぇぬぎばつ, reason: contains not printable characters */
    public Runnable f2640;

    /* renamed from: ぉざぅち〻, reason: contains not printable characters */
    public boolean f2641;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public AdOverlayInfoParcel f2643;

    /* renamed from: ざとぅぼこ〺, reason: contains not printable characters */
    public boolean f2646;

    /* renamed from: づざかべべ, reason: contains not printable characters */
    public zzi f2647;

    /* renamed from: てぜきぽく, reason: contains not printable characters */
    public C2406 f2648;

    /* renamed from: なぎぱいぢぎ, reason: contains not printable characters */
    public zzo f2649;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public zzanh f2652;

    /* renamed from: ぺぁあねじ, reason: contains not printable characters */
    public WebChromeClient.CustomViewCallback f2654;

    /* renamed from: ぁごぐすすぃ, reason: contains not printable characters */
    public boolean f2638 = false;

    /* renamed from: いいにぽつ, reason: contains not printable characters */
    public boolean f2639 = false;

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public boolean f2655 = false;

    /* renamed from: のぷのちつ, reason: contains not printable characters */
    public boolean f2650 = false;

    /* renamed from: へぬ〴づぞ, reason: contains not printable characters */
    public int f2653 = 0;

    /* renamed from: おぐぴう〸ず, reason: contains not printable characters */
    public final Object f2642 = new Object();

    /* renamed from: は〲ぱなで, reason: contains not printable characters */
    public boolean f2651 = false;

    /* renamed from: ごづごきえ, reason: contains not printable characters */
    public boolean f2644 = false;

    /* renamed from: ざっざへづ, reason: contains not printable characters */
    public boolean f2645 = true;

    public zzd(Activity activity) {
        this.f2637 = activity;
    }

    public final void close() {
        this.f2653 = 2;
        this.f2637.finish();
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onBackPressed() {
        this.f2653 = 0;
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onCreate(Bundle bundle) {
        zzje zzjeVar;
        this.f2637.requestWindowFeature(1);
        this.f2639 = bundle != null ? bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false) : false;
        try {
            AdOverlayInfoParcel zzc = AdOverlayInfoParcel.zzc(this.f2637.getIntent());
            this.f2643 = zzc;
            if (zzc == null) {
                throw new C2402("Could not get info for ad overlay.");
            }
            if (zzc.zzaty.zzdek > 7500000) {
                this.f2653 = 3;
            }
            if (this.f2637.getIntent() != null) {
                this.f2645 = this.f2637.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            zzao zzaoVar = this.f2643.zzcjg;
            if (zzaoVar != null) {
                this.f2655 = zzaoVar.zzaqo;
            } else {
                this.f2655 = false;
            }
            if (((Boolean) zzkb.zzif().zzd(zznh.zzboc)).booleanValue() && this.f2655 && this.f2643.zzcjg.zzaqt != -1) {
                new C2404(this, null).zzpy();
            }
            if (bundle == null) {
                zzn zznVar = this.f2643.zzcix;
                if (zznVar != null && this.f2645) {
                    zznVar.zzch();
                }
                AdOverlayInfoParcel adOverlayInfoParcel = this.f2643;
                if (adOverlayInfoParcel.zzcje != 1 && (zzjeVar = adOverlayInfoParcel.zzciw) != null) {
                    zzjeVar.onAdClicked();
                }
            }
            Activity activity = this.f2637;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f2643;
            C2406 c2406 = new C2406(activity, adOverlayInfoParcel2.zzcjf, adOverlayInfoParcel2.zzaty.zzcv);
            this.f2648 = c2406;
            c2406.setId(1000);
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f2643;
            int i = adOverlayInfoParcel3.zzcje;
            if (i == 1) {
                m1215(false);
                return;
            }
            if (i == 2) {
                this.f2647 = new zzi(adOverlayInfoParcel3.zzciy);
                m1215(false);
                return;
            }
            if (i == 3) {
                m1215(true);
                return;
            }
            if (i != 4) {
                throw new C2402("Could not determine ad overlay type.");
            }
            if (this.f2639) {
                this.f2653 = 3;
                this.f2637.finish();
                return;
            }
            zzbs.zzef();
            Activity activity2 = this.f2637;
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f2643;
            if (zza.zza(activity2, adOverlayInfoParcel4.zzciv, adOverlayInfoParcel4.zzcjd)) {
                return;
            }
            this.f2653 = 3;
            this.f2637.finish();
        } catch (C2402 e) {
            zzakb.zzcu(e.getMessage());
            this.f2653 = 3;
            this.f2637.finish();
        }
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onDestroy() {
        Object obj = this.f2652;
        if (obj != null) {
            C2406 c2406 = this.f2648;
            obj.getClass();
            c2406.removeView((View) obj);
        }
        m1214();
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onPause() {
        zzms();
        zzn zznVar = this.f2643.zzcix;
        if (zznVar != null) {
            zznVar.onPause();
        }
        if (!((Boolean) zzkb.zzif().zzd(zznh.zzbrd)).booleanValue() && this.f2652 != null && (!this.f2637.isFinishing() || this.f2647 == null)) {
            zzbs.zzek();
            zzaht.zzi(this.f2652);
        }
        m1214();
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onRestart() {
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onResume() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2643;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzcje == 4) {
            if (this.f2639) {
                this.f2653 = 3;
                this.f2637.finish();
            } else {
                this.f2639 = true;
            }
        }
        zzn zznVar = this.f2643.zzcix;
        if (zznVar != null) {
            zznVar.onResume();
        }
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbrd)).booleanValue()) {
            return;
        }
        zzanh zzanhVar = this.f2652;
        if (zzanhVar == null || zzanhVar.isDestroyed()) {
            zzakb.zzcu("The webview does not exist. Ignoring action.");
        } else {
            zzbs.zzek();
            zzaht.zzj(this.f2652);
        }
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f2639);
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onStart() {
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbrd)).booleanValue()) {
            zzanh zzanhVar = this.f2652;
            if (zzanhVar == null || zzanhVar.isDestroyed()) {
                zzakb.zzcu("The webview does not exist. Ignoring action.");
            } else {
                zzbs.zzek();
                zzaht.zzj(this.f2652);
            }
        }
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void onStop() {
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbrd)).booleanValue() && this.f2652 != null && (!this.f2637.isFinishing() || this.f2647 == null)) {
            zzbs.zzek();
            zzaht.zzi(this.f2652);
        }
        m1214();
    }

    public final void setRequestedOrientation(int i) {
        this.f2637.setRequestedOrientation(i);
    }

    public final void zza(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f2637);
        this.f2636 = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f2636.addView(view, -1, -1);
        this.f2637.setContentView(this.f2636);
        this.f2646 = true;
        this.f2654 = customViewCallback;
        this.f2638 = true;
    }

    public final void zza(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzao zzaoVar;
        boolean z3 = ((Boolean) zzkb.zzif().zzd(zznh.zzblp)).booleanValue() && (adOverlayInfoParcel = this.f2643) != null && (zzaoVar = adOverlayInfoParcel.zzcjg) != null && zzaoVar.zzaqv;
        if (z && z2 && z3) {
            new zzxb(this.f2652, "useCustomClose").zzbm("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzo zzoVar = this.f2649;
        if (zzoVar != null) {
            zzoVar.zza(z, z2 && !z3);
        }
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void zzbf() {
        this.f2646 = true;
    }

    @Override // com.google.android.gms.internal.zzxe
    public final void zzk(InterfaceC2455 interfaceC2455) {
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbrc)).booleanValue() && C1687.m3707()) {
            Configuration configuration = (Configuration) BinderC2454.m4502(interfaceC2455);
            zzbs.zzei();
            if (zzahn.zza(this.f2637, configuration)) {
                this.f2637.getWindow().addFlags(1024);
                this.f2637.getWindow().clearFlags(2048);
            } else {
                this.f2637.getWindow().addFlags(2048);
                this.f2637.getWindow().clearFlags(1024);
            }
        }
    }

    public final void zzms() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2643;
        if (adOverlayInfoParcel != null && this.f2638) {
            setRequestedOrientation(adOverlayInfoParcel.orientation);
        }
        if (this.f2636 != null) {
            this.f2637.setContentView(this.f2648);
            this.f2646 = true;
            this.f2636.removeAllViews();
            this.f2636 = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f2654;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f2654 = null;
        }
        this.f2638 = false;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzt
    public final void zzmt() {
        this.f2653 = 1;
        this.f2637.finish();
    }

    @Override // com.google.android.gms.internal.zzxe
    public final boolean zzmu() {
        this.f2653 = 0;
        zzanh zzanhVar = this.f2652;
        if (zzanhVar == null) {
            return true;
        }
        boolean zzte = zzanhVar.zzte();
        if (!zzte) {
            this.f2652.zza("onbackblocked", Collections.emptyMap());
        }
        return zzte;
    }

    public final void zzmv() {
        this.f2648.removeView(this.f2649);
        m1216(true);
    }

    public final void zzmy() {
        if (this.f2650) {
            this.f2650 = false;
            this.f2652.zzmz();
        }
    }

    public final void zzna() {
        this.f2648.f9737 = true;
    }

    public final void zznb() {
        synchronized (this.f2642) {
            this.f2641 = true;
            Runnable runnable = this.f2640;
            if (runnable != null) {
                Handler handler = zzahn.zzdaw;
                handler.removeCallbacks(runnable);
                handler.post(this.f2640);
            }
        }
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public final void m1214() {
        if (!this.f2637.isFinishing() || this.f2651) {
            return;
        }
        this.f2651 = true;
        zzanh zzanhVar = this.f2652;
        if (zzanhVar != null) {
            zzanhVar.zzag(this.f2653);
            synchronized (this.f2642) {
                if (!this.f2641 && this.f2652.zztg()) {
                    RunnableC2400 runnableC2400 = new RunnableC2400(this);
                    this.f2640 = runnableC2400;
                    zzahn.zzdaw.postDelayed(runnableC2400, ((Long) zzkb.zzif().zzd(zznh.zzbln)).longValue());
                    return;
                }
            }
        }
        m1217();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b8, code lost:
    
        if (r18.f2637.getResources().getConfiguration().orientation == 1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d9, code lost:
    
        r18.f2650 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
    
        if (r18.f2637.getResources().getConfiguration().orientation == 2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0091  */
    /* renamed from: ぅみぱぎぎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1215(boolean r19) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzd.m1215(boolean):void");
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final void m1216(boolean z) {
        int intValue = ((Integer) zzkb.zzif().zzd(zznh.zzbre)).intValue();
        C2401 c2401 = new C2401();
        c2401.f9732 = 50;
        c2401.f9731 = z ? intValue : 0;
        c2401.f9729 = z ? 0 : intValue;
        c2401.f9730 = intValue;
        this.f2649 = new zzo(this.f2637, c2401, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(z ? 11 : 9);
        zza(z, this.f2643.zzcjb);
        this.f2648.addView(this.f2649, layoutParams);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final void m1217() {
        zzn zznVar;
        if (this.f2644) {
            return;
        }
        this.f2644 = true;
        Object obj = this.f2652;
        if (obj != null) {
            C2406 c2406 = this.f2648;
            obj.getClass();
            c2406.removeView((View) obj);
            zzi zziVar = this.f2647;
            if (zziVar != null) {
                this.f2652.setContext(zziVar.zzair);
                this.f2652.zzad(false);
                zzi zziVar2 = this.f2647;
                ViewGroup viewGroup = zziVar2.parent;
                Object obj2 = this.f2652;
                obj2.getClass();
                viewGroup.addView((View) obj2, zziVar2.index, zziVar2.zzcis);
                this.f2647 = null;
            } else if (this.f2637.getApplicationContext() != null) {
                this.f2652.setContext(this.f2637.getApplicationContext());
            }
            this.f2652 = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f2643;
        if (adOverlayInfoParcel == null || (zznVar = adOverlayInfoParcel.zzcix) == null) {
            return;
        }
        zznVar.zzcg();
    }
}
