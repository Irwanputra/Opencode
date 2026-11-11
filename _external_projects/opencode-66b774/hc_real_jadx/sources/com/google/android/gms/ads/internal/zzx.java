package com.google.android.gms.ads.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.internal.zzaax;
import com.google.android.gms.internal.zzafb;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzajr;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzanq;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzuh;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzva;
import com.google.android.gms.internal.zzvj;
import com.google.android.gms.internal.zzvm;
import com.google.android.gms.internal.zzzv;
import java.lang.ref.WeakReference;
import java.util.List;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.C2399;
import p131.p161.p162.p193.p203.BinderC2454;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzx extends zzi implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public boolean f2809;

    public zzx(Context context, zzjn zzjnVar, String str, zzux zzuxVar, zzakd zzakdVar, zzv zzvVar) {
        super(context, zzjnVar, str, zzuxVar, zzakdVar, zzvVar);
        new WeakReference(null);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final zzll getVideoController() {
        zzanh zzanhVar;
        C1687.m3716("getVideoController must be called from the main thread.");
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || (zzanhVar = zzafoVar.zzciy) == null) {
            return null;
        }
        return zzanhVar.zzsg();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m1244(this.zzano.zzaud);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m1244(this.zzano.zzaud);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void setManualImpressionsEnabled(boolean z) {
        C1687.m3716("setManualImpressionsEnabled must be called from the main thread.");
        this.f2809 = z;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzks
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is NOT supported by BannerAdManager.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.internal.zzd
    public final void zza(zzafo zzafoVar, boolean z) {
        super.zza(zzafoVar, z);
        if (zzaq.zzf(zzafoVar)) {
            zzab zzabVar = new zzab(this);
            if (zzafoVar == null || !zzaq.zzf(zzafoVar)) {
                return;
            }
            zzanh zzanhVar = zzafoVar.zzciy;
            View view = zzanhVar != 0 ? (View) zzanhVar : null;
            if (view == null) {
                zzakb.zzcu("AdWebView is null");
                return;
            }
            try {
                zzuh zzuhVar = zzafoVar.zzces;
                List<String> list = zzuhVar != null ? zzuhVar.zzcdf : null;
                if (list != null && !list.isEmpty()) {
                    zzva zzvaVar = zzafoVar.zzcet;
                    zzvj zzme = zzvaVar != null ? zzvaVar.zzme() : null;
                    zzva zzvaVar2 = zzafoVar.zzcet;
                    zzvm zzmf = zzvaVar2 != null ? zzvaVar2.zzmf() : null;
                    if (list.contains("2") && zzme != null) {
                        zzme.zzi(new BinderC2454(view));
                        if (!zzme.getOverrideImpressionRecording()) {
                            zzme.recordImpression();
                        }
                        zzanhVar.zzsz().zza("/nativeExpressViewClicked", new C2399(zzme, zzabVar, null));
                        return;
                    }
                    if (!list.contains("1") || zzmf == null) {
                        zzakb.zzcu("No matching template id and mapper");
                        return;
                    }
                    zzmf.zzi(new BinderC2454(view));
                    if (!zzmf.getOverrideImpressionRecording()) {
                        zzmf.recordImpression();
                    }
                    zzanhVar.zzsz().zza("/nativeExpressViewClicked", new C2399(null, zzabVar, zzmf));
                    return;
                }
                zzakb.zzcu("No template ids present in mediation response");
            } catch (RemoteException e) {
                zzakb.zzc("Error occurred while recording impression and registering for clicks", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final boolean zzb(zzjj zzjjVar) {
        zzjj zzjjVar2 = zzjjVar;
        if (zzjjVar2.zzbdk != this.f2809) {
            zzjjVar2 = new zzjj(zzjjVar2.versionCode, zzjjVar2.zzbdf, zzjjVar2.extras, zzjjVar2.zzbdg, zzjjVar2.zzbdh, zzjjVar2.zzbdi, zzjjVar2.zzbdj, zzjjVar2.zzbdk || this.f2809, zzjjVar2.zzbdl, zzjjVar2.zzbdm, zzjjVar2.zzbdn, zzjjVar2.zzbdo, zzjjVar2.zzbdp, zzjjVar2.zzbdq, zzjjVar2.zzbdr, zzjjVar2.zzbds, zzjjVar2.zzbdt, zzjjVar2.zzbdu);
        }
        return super.zzb(zzjjVar2);
    }

    @Override // com.google.android.gms.ads.internal.zzd
    public final boolean zzcf() {
        boolean z;
        zzbu zzbuVar;
        zzbs.zzei();
        Context context = this.zzano.zzair;
        if (zzahn.zzd(context, context.getPackageName(), "android.permission.INTERNET")) {
            z = true;
        } else {
            zzajr zzia = zzkb.zzia();
            zzbt zzbtVar = this.zzano;
            zzia.zza(zzbtVar.f2793, zzbtVar.zzauc, "Missing internet permission in AndroidManifest.xml.", "Missing internet permission in AndroidManifest.xml. You must have the following declaration: <uses-permission android:name=\"android.permission.INTERNET\" />");
            z = false;
        }
        zzbs.zzei();
        if (!zzahn.zzag(this.zzano.zzair)) {
            zzajr zzia2 = zzkb.zzia();
            zzbt zzbtVar2 = this.zzano;
            zzia2.zza(zzbtVar2.f2793, zzbtVar2.zzauc, "Missing AdActivity with android:configChanges in AndroidManifest.xml.", "Missing AdActivity with android:configChanges in AndroidManifest.xml. You must have the following declaration within the <application> element: <activity android:name=\"com.google.android.gms.ads.AdActivity\" android:configChanges=\"keyboard|keyboardHidden|orientation|screenLayout|uiMode|screenSize|smallestScreenSize\" />");
            z = false;
        }
        if (!z && (zzbuVar = this.zzano.f2793) != null) {
            zzbuVar.setVisibility(0);
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.zzi
    /* renamed from: 〺つふすそ */
    public final zzanh mo1225(zzafp zzafpVar, zzw zzwVar, zzafb zzafbVar) {
        AdSize zzht;
        zzbt zzbtVar = this.zzano;
        zzjn zzjnVar = zzbtVar.zzauc;
        if (zzjnVar.zzbem == null && zzjnVar.zzbeo) {
            zzaax zzaaxVar = zzafpVar.zzcxy;
            if (!zzaaxVar.zzbeo) {
                String str = zzaaxVar.zzcoz;
                if (str != null) {
                    String[] split = str.split("[xX]");
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    zzht = new AdSize(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
                } else {
                    zzht = zzjnVar.zzht();
                }
                zzjnVar = new zzjn(this.zzano.zzair, zzht);
            }
            zzbtVar.zzauc = zzjnVar;
        }
        return super.mo1225(zzafpVar, zzwVar, zzafbVar);
    }

    /* renamed from: ぇ〳〲〺すっ, reason: contains not printable characters */
    public final void m1244(zzafo zzafoVar) {
        if (zzafoVar == null || zzafoVar.zzcxk || this.zzano.f2793 == null) {
            return;
        }
        zzahn zzei = zzbs.zzei();
        zzbt zzbtVar = this.zzano;
        if (zzei.zza(zzbtVar.f2793, zzbtVar.zzair) && this.zzano.f2793.getGlobalVisibleRect(new Rect(), null)) {
            zzanh zzanhVar = zzafoVar.zzciy;
            if (zzanhVar != null && zzanhVar.zzsz() != null) {
                zzafoVar.zzciy.zzsz().zza((zzanq) null);
            }
            zza(zzafoVar, false);
            zzafoVar.zzcxk = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0167, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.internal.zzkb.zzif().zzd(com.google.android.gms.internal.zznh.zzbok)).booleanValue() != false) goto L67;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0108  */
    @Override // com.google.android.gms.ads.internal.zzi, com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.zzafo r8, com.google.android.gms.internal.zzafo r9) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzx.zza(com.google.android.gms.internal.zzafo, com.google.android.gms.internal.zzafo):boolean");
    }
}
