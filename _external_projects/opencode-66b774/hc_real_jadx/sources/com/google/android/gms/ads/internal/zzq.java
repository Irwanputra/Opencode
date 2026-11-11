package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.zzaat;
import com.google.android.gms.internal.zzaax;
import com.google.android.gms.internal.zzaeq;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzafp;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzll;
import com.google.android.gms.internal.zzoa;
import com.google.android.gms.internal.zzoq;
import com.google.android.gms.internal.zzos;
import com.google.android.gms.internal.zzot;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzrf;
import com.google.android.gms.internal.zzuh;
import com.google.android.gms.internal.zzui;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzzv;
import java.util.List;
import org.json.JSONObject;
import p034.p095.C1687;
import p131.p161.p162.p193.p203.BinderC2454;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzq extends zzd implements zzot {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public boolean f2802;

    /* renamed from: くし〴〺ぅ, reason: contains not printable characters */
    public zzafo f2803;

    /* renamed from: びぐびあび, reason: contains not printable characters */
    public boolean f2804;

    public zzq(Context context, zzv zzvVar, zzjn zzjnVar, String str, zzux zzuxVar, zzakd zzakdVar) {
        super(context, zzjnVar, str, zzuxVar, zzakdVar, zzvVar);
        this.f2804 = false;
    }

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static zzafo m1241(zzafp zzafpVar, int i) {
        zzaat zzaatVar = zzafpVar.zzcqv;
        zzjj zzjjVar = zzaatVar.zzcnd;
        zzaax zzaaxVar = zzafpVar.zzcxy;
        List<String> list = zzaaxVar.zzcdk;
        List<String> list2 = zzaaxVar.zzcdl;
        List<String> list3 = zzaaxVar.zzcoy;
        int i2 = zzaaxVar.orientation;
        long j = zzaaxVar.zzcdq;
        String str = zzaatVar.zzcng;
        boolean z = zzaaxVar.zzcow;
        zzui zzuiVar = zzafpVar.zzcxl;
        long j2 = zzaaxVar.zzcox;
        zzjn zzjnVar = zzafpVar.zzauc;
        long j3 = zzaaxVar.zzcov;
        long j4 = zzafpVar.zzcxp;
        long j5 = zzafpVar.zzcxq;
        String str2 = zzaaxVar.zzcpb;
        JSONObject jSONObject = zzafpVar.zzcxj;
        zzaeq zzaeqVar = zzaaxVar.zzcpl;
        List<String> list4 = zzaaxVar.zzcpm;
        return new zzafo(zzjjVar, null, list, i, list2, list3, i2, j, str, z, null, null, null, zzuiVar, null, j2, zzjnVar, j3, j4, j5, str2, jSONObject, null, zzaeqVar, list4, list4, zzaaxVar.zzcpo, zzaaxVar.zzcpp, null, zzaaxVar.zzcdn, zzaaxVar.zzcps, zzafpVar.zzcxw, zzaaxVar.zzaqv, zzafpVar.zzcxx);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final zzll getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void pause() {
        if (!this.f2804) {
            throw new IllegalStateException("Native Ad does not support pause().");
        }
        super.pause();
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void resume() {
        if (!this.f2804) {
            throw new IllegalStateException("Native Ad does not support resume().");
        }
        super.resume();
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void setManualImpressionsEnabled(boolean z) {
        C1687.m3716("setManualImpressionsEnabled must be called from the main thread.");
        this.f2802 = z;
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzks
    public final void showInterstitial() {
        throw new IllegalStateException("Interstitial is not supported by AdLoaderManager.");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.ads.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.zzafp r11, com.google.android.gms.internal.zznu r12) {
        /*
            r10 = this;
            r0 = 0
            r10.f2803 = r0
            int r0 = r11.errorCode
            r1 = 0
            r2 = -2
            if (r0 == r2) goto L10
            com.google.android.gms.internal.zzafo r0 = m1241(r11, r0)
        Ld:
            r10.f2803 = r0
            goto L20
        L10:
            com.google.android.gms.internal.zzaax r0 = r11.zzcxy
            boolean r0 = r0.zzcow
            if (r0 != 0) goto L20
            java.lang.String r0 = "partialAdState is not mediation"
            com.google.android.gms.internal.zzakb.zzcu(r0)
            com.google.android.gms.internal.zzafo r0 = m1241(r11, r1)
            goto Ld
        L20:
            com.google.android.gms.internal.zzafo r0 = r10.f2803
            if (r0 == 0) goto L2f
            android.os.Handler r11 = com.google.android.gms.internal.zzahn.zzdaw
            なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ておぞぞはね r12 = new なぎぱいぢぎ.なぎぱいぢぎ.〺つふすそ.げつ〴ぬぐ.くし〴〺ぅ.びぐびあび.ておぞぞはね
            r12.<init>(r10)
            r11.post(r12)
            return
        L2f:
            com.google.android.gms.internal.zzjn r0 = r11.zzauc
            if (r0 == 0) goto L37
            com.google.android.gms.ads.internal.zzbt r2 = r10.zzano
            r2.zzauc = r0
        L37:
            com.google.android.gms.ads.internal.zzbt r0 = r10.zzano
            r0.zzauz = r1
            com.google.android.gms.ads.internal.zzbs.zzeh()
            com.google.android.gms.ads.internal.zzbt r1 = r10.zzano
            android.content.Context r2 = r1.zzair
            com.google.android.gms.internal.zzcv r5 = r1.f2780
            r6 = 0
            com.google.android.gms.internal.zzux r7 = r10.zzanw
            r3 = r10
            r4 = r11
            r8 = r10
            r9 = r12
            com.google.android.gms.internal.zzaif r11 = com.google.android.gms.internal.zzya.zza(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.zzaub = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzq.zza(com.google.android.gms.internal.zzafp, com.google.android.gms.internal.zznu):void");
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final void zza(zzoa zzoaVar) {
        throw new IllegalStateException("CustomRendering is not supported by AdLoaderManager.");
    }

    @Override // com.google.android.gms.internal.zzot
    public final void zza(zzoq zzoqVar) {
        zzakb.zzcu("Unexpected call to AdLoaderManager method");
    }

    @Override // com.google.android.gms.internal.zzot
    public final void zza(zzos zzosVar) {
        zzakb.zzcu("Unexpected call to AdLoaderManager method");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024f A[RETURN] */
    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.ads.internal.zza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.zzafo r28, com.google.android.gms.internal.zzafo r29) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzq.zza(com.google.android.gms.internal.zzafo, com.google.android.gms.internal.zzafo):boolean");
    }

    @Override // com.google.android.gms.ads.internal.zzd
    public final boolean zza(zzjj zzjjVar, zzafo zzafoVar, boolean z) {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public final boolean zzb(zzjj zzjjVar) {
        zzjj zzjjVar2 = zzjjVar;
        List<Integer> list = this.zzano.f2778;
        if (list != null && list.size() == 1 && this.zzano.f2778.get(0).intValue() == 2) {
            zzakb.e("Requesting only banner Ad from AdLoader or calling loadAd on returned banner is not yet supported");
            zzi(0);
            return false;
        }
        if (this.zzano.f2776 == null) {
            return super.zzb(zzjjVar);
        }
        if (zzjjVar2.zzbdk != this.f2802) {
            zzjjVar2 = new zzjj(zzjjVar2.versionCode, zzjjVar2.zzbdf, zzjjVar2.extras, zzjjVar2.zzbdg, zzjjVar2.zzbdh, zzjjVar2.zzbdi, zzjjVar2.zzbdj, zzjjVar2.zzbdk || this.f2802, zzjjVar2.zzbdl, zzjjVar2.zzbdm, zzjjVar2.zzbdn, zzjjVar2.zzbdo, zzjjVar2.zzbdp, zzjjVar2.zzbdq, zzjjVar2.zzbdr, zzjjVar2.zzbds, zzjjVar2.zzbdt, zzjjVar2.zzbdu);
        }
        return super.zzb(zzjjVar2);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final void zzby() {
        zzuh zzuhVar;
        zzbt zzbtVar;
        zzrf zzrfVar;
        super.zzby();
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || (zzuhVar = zzafoVar.zzces) == null || !zzuhVar.zzlv() || (zzrfVar = (zzbtVar = this.zzano).f2776) == null) {
            return;
        }
        try {
            zzrfVar.zza(this, new BinderC2454(zzbtVar.zzair));
        } catch (RemoteException e) {
            zzakb.zzc("Could not call PublisherAdViewLoadedListener.onPublisherAdViewLoaded().", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzuj
    public final void zzcj() {
        zzuh zzuhVar;
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(zzafoVar.zzceu) || (zzuhVar = this.zzano.zzaud.zzces) == null || !zzuhVar.zzlw()) {
            super.zzcj();
        } else {
            zzca();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzd, com.google.android.gms.internal.zzuj
    public final void zzco() {
        zzuh zzuhVar;
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || !"com.google.ads.mediation.admob.AdMobAdapter".equals(zzafoVar.zzceu) || (zzuhVar = this.zzano.zzaud.zzces) == null || !zzuhVar.zzlw()) {
            super.zzco();
        } else {
            zzbz();
        }
    }

    @Override // com.google.android.gms.internal.zzot
    public final void zzcv() {
        zzakb.zzcu("Unexpected call to AdLoaderManager method");
    }

    @Override // com.google.android.gms.internal.zzot
    public final boolean zzcw() {
        if (m1242() != null) {
            return m1242().zzcdw;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.zzot
    public final boolean zzcx() {
        if (m1242() != null) {
            return m1242().zzcdx;
        }
        return false;
    }

    public final void zzd(List<String> list) {
        C1687.m3716("setNativeTemplates must be called on the main UI thread.");
        this.zzano.f2781 = list;
    }

    public final void zze(List<Integer> list) {
        C1687.m3716("setAllowedAdTypes must be called on the main UI thread.");
        this.zzano.f2778 = list;
    }

    @Override // com.google.android.gms.internal.zzot
    public final zzqw zzs(String str) {
        C1687.m3716("getOnCustomClickListener must be called on the main UI thread.");
        return this.zzano.f2797.getOrDefault(str, null);
    }

    /* renamed from: ぺふねづ〺, reason: contains not printable characters */
    public final zzui m1242() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null || !zzafoVar.zzcow) {
            return null;
        }
        return zzafoVar.zzcxl;
    }
}
