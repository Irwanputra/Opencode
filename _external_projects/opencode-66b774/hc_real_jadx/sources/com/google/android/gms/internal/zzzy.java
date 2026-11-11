package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.zzbs;
import com.google.android.gms.internal.zziu;
import java.util.List;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzzy extends zzagb implements zzaal {
    private final Context mContext;
    private zzui zzcef;
    private zzaat zzcey;
    private zzaax zzcjl;
    private Runnable zzcjm;
    private final Object zzcjn = new Object();
    private final zzzx zzcmm;
    private final zzaau zzcmn;
    private final zzis zzcmo;
    private final zzix zzcmp;
    public zzaif zzcmq;

    public zzzy(Context context, zzaau zzaauVar, zzzx zzzxVar, zzix zzixVar) {
        this.zzcmm = zzzxVar;
        this.mContext = context;
        this.zzcmn = zzaauVar;
        this.zzcmp = zzixVar;
        zzis zzisVar = new zzis(zzixVar, ((Boolean) zzkb.zzif().zzd(zznh.zzbrf)).booleanValue());
        this.zzcmo = zzisVar;
        zzisVar.zza(new zzit(this) { // from class: com.google.android.gms.internal.zzzz
            private final zzzy zzcmr;

            {
                this.zzcmr = this;
            }

            @Override // com.google.android.gms.internal.zzit
            public final void zza(zzjc zzjcVar) {
                this.zzcmr.zzc(zzjcVar);
            }
        });
        final zzjd zzjdVar = new zzjd();
        zzjdVar.zzbda = Integer.valueOf(zzaauVar.zzaty.zzdej);
        zzjdVar.zzbdb = Integer.valueOf(zzaauVar.zzaty.zzdek);
        zzjdVar.zzbdc = Integer.valueOf(zzaauVar.zzaty.zzdel ? 0 : 2);
        zzisVar.zza(new zzit(zzjdVar) { // from class: com.google.android.gms.internal.zzaaa
            private final zzjd zzcms;

            {
                this.zzcms = zzjdVar;
            }

            @Override // com.google.android.gms.internal.zzit
            public final void zza(zzjc zzjcVar) {
                zzjcVar.zzbcy.zzbcv = this.zzcms;
            }
        });
        if (zzaauVar.zzcne != null) {
            zzisVar.zza(new zzit(this) { // from class: com.google.android.gms.internal.zzaab
                private final zzzy zzcmr;

                {
                    this.zzcmr = this;
                }

                @Override // com.google.android.gms.internal.zzit
                public final void zza(zzjc zzjcVar) {
                    this.zzcmr.zzb(zzjcVar);
                }
            });
        }
        zzjn zzjnVar = zzaauVar.zzauc;
        zzisVar.zza((zzjnVar.zzbel && "interstitial_mb".equals(zzjnVar.zzbek)) ? zzaac.zzcmt : (zzjnVar.zzbel && "reward_mb".equals(zzjnVar.zzbek)) ? zzaad.zzcmt : (zzjnVar.zzben || zzjnVar.zzbel) ? zzaaf.zzcmt : zzaae.zzcmt);
        zzisVar.zza(zziu.zza.zzb.AD_REQUEST);
    }

    private final zzjn zza(zzaat zzaatVar) {
        zzui zzuiVar;
        List<Integer> list;
        zzaat zzaatVar2 = this.zzcey;
        if (((zzaatVar2 == null || (list = zzaatVar2.zzaus) == null || list.size() <= 1) ? false : true) && (zzuiVar = this.zzcef) != null && !zzuiVar.zzcea) {
            return null;
        }
        if (this.zzcjl.zzbeo) {
            for (zzjn zzjnVar : zzaatVar.zzauc.zzbem) {
                if (zzjnVar.zzbeo) {
                    return new zzjn(zzjnVar, zzaatVar.zzauc.zzbem);
                }
            }
        }
        String str = this.zzcjl.zzcoz;
        if (str == null) {
            throw new zzaai("The ad response must specify one of the supported ad sizes.", 0);
        }
        String[] split = str.split("x");
        if (split.length != 2) {
            String valueOf = String.valueOf(this.zzcjl.zzcoz);
            throw new zzaai(valueOf.length() != 0 ? "Invalid ad size format from the ad response: ".concat(valueOf) : new String("Invalid ad size format from the ad response: "), 0);
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            for (zzjn zzjnVar2 : zzaatVar.zzauc.zzbem) {
                float f = this.mContext.getResources().getDisplayMetrics().density;
                int i = zzjnVar2.width;
                if (i == -1) {
                    i = (int) (zzjnVar2.widthPixels / f);
                }
                int i2 = zzjnVar2.height;
                if (i2 == -2) {
                    i2 = (int) (zzjnVar2.heightPixels / f);
                }
                if (parseInt == i && parseInt2 == i2 && !zzjnVar2.zzbeo) {
                    return new zzjn(zzjnVar2, zzaatVar.zzauc.zzbem);
                }
            }
            String valueOf2 = String.valueOf(this.zzcjl.zzcoz);
            throw new zzaai(valueOf2.length() != 0 ? "The ad size from the ad response was not one of the requested sizes: ".concat(valueOf2) : new String("The ad size from the ad response was not one of the requested sizes: "), 0);
        } catch (NumberFormatException unused) {
            String valueOf3 = String.valueOf(this.zzcjl.zzcoz);
            throw new zzaai(valueOf3.length() != 0 ? "Invalid ad size number from the ad response: ".concat(valueOf3) : new String("Invalid ad size number from the ad response: "), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzc(int i, String str) {
        if (i == 3 || i == -1) {
            zzakb.zzct(str);
        } else {
            zzakb.zzcu(str);
        }
        this.zzcjl = this.zzcjl == null ? new zzaax(i) : new zzaax(i, this.zzcjl.zzcdq);
        zzaat zzaatVar = this.zzcey;
        if (zzaatVar == null) {
            zzaatVar = new zzaat(this.zzcmn, -1L, null, null, null);
        }
        zzaax zzaaxVar = this.zzcjl;
        this.zzcmm.zza(new zzafp(zzaatVar, zzaaxVar, this.zzcef, null, i, -1L, zzaaxVar.zzcpa, null, this.zzcmo, null));
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void onStop() {
        synchronized (this.zzcjn) {
            zzaif zzaifVar = this.zzcmq;
            if (zzaifVar != null) {
                zzaifVar.cancel();
            }
        }
    }

    public final zzaif zza(zzakd zzakdVar, zzalh<zzaat> zzalhVar) {
        Context context = this.mContext;
        if (new zzaak(context).zza(zzakdVar)) {
            zzakb.zzbx("Fetching ad response from local ad request service.");
            zzaaq zzaaqVar = new zzaaq(context, zzalhVar, this);
            zzaaqVar.zznd();
            return zzaaqVar;
        }
        zzakb.zzbx("Fetching ad response from remote ad request service.");
        zzkb.zzia();
        if (zzajr.zzbe(context)) {
            return new zzaar(context, zzakdVar, zzalhVar, this);
        }
        zzakb.zzcu("Failed to connect to remote ad request service.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ce, code lost:
    
        if (android.text.TextUtils.isEmpty(r14.body) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        com.google.android.gms.ads.internal.zzbs.zzem().zzf(r13.mContext, r13.zzcjl.zzcnl);
        r14 = r13.zzcjl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        if (r14.zzcow == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011f, code lost:
    
        com.google.android.gms.ads.internal.zzbs.zzem().zzz(r13.zzcjl.zzcdo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0132, code lost:
    
        if (android.text.TextUtils.isEmpty(r13.zzcjl.zzcoa) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0144, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.internal.zzkb.zzif().zzd(com.google.android.gms.internal.zznh.zzbqc)).booleanValue() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0146, code lost:
    
        com.google.android.gms.internal.zzakb.zzbx("Received cookie from server. Setting webview cookie in CookieManager.");
        r14 = com.google.android.gms.ads.internal.zzbs.zzek().zzay(r13.mContext);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0155, code lost:
    
        if (r14 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0157, code lost:
    
        r14.setCookie("googleads.g.doubleclick.net", r13.zzcjl.zzcoa);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        r13.zzcef = new com.google.android.gms.internal.zzui(r14.body);
        com.google.android.gms.ads.internal.zzbs.zzem().zzz(r13.zzcef.zzcdo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        com.google.android.gms.internal.zzakb.zzb("Could not parse mediation config.", r14);
        r2 = java.lang.String.valueOf(r13.zzcjl.body);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010e, code lost:
    
        if (r2.length() != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        r0 = "Could not parse mediation config: ".concat(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011e, code lost:
    
        throw new com.google.android.gms.internal.zzaai(r0, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        r0 = new java.lang.String("Could not parse mediation config: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0169, code lost:
    
        throw new com.google.android.gms.internal.zzaai("No fill from ad server.", 3);
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01da  */
    @Override // com.google.android.gms.internal.zzaal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.zzaax r14) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzzy.zza(com.google.android.gms.internal.zzaax):void");
    }

    public final /* synthetic */ void zzb(zzjc zzjcVar) {
        zzjcVar.zzbcy.zzbcu = this.zzcmn.zzcne.packageName;
    }

    public final /* synthetic */ void zzc(zzjc zzjcVar) {
        zzjcVar.zzbcw = this.zzcmn.zzcnq;
    }

    @Override // com.google.android.gms.internal.zzagb
    public final void zzdm() {
        Bundle bundle;
        String string;
        zzakb.zzbx("AdLoaderBackgroundTask started.");
        zzaag zzaagVar = new zzaag(this);
        this.zzcjm = zzaagVar;
        zzahn.zzdaw.postDelayed(zzaagVar, ((Long) zzkb.zzif().zzd(zznh.zzbni)).longValue());
        ((C2510) zzbs.zzeo()).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbng)).booleanValue() && (bundle = this.zzcmn.zzcnd.extras) != null && (string = bundle.getString("_ad")) != null) {
            zzaat zzaatVar = new zzaat(this.zzcmn, elapsedRealtime, null, null, null);
            this.zzcey = zzaatVar;
            zza(zzacg.zza(this.mContext, zzaatVar, string));
            return;
        }
        zzall zzallVar = new zzall();
        zzahh.zza(new zzaah(this, zzallVar));
        String zzw = zzbs.zzfd().zzw(this.mContext);
        String zzx = zzbs.zzfd().zzx(this.mContext);
        String zzy = zzbs.zzfd().zzy(this.mContext);
        zzbs.zzfd().zzg(this.mContext, zzy);
        zzaat zzaatVar2 = new zzaat(this.zzcmn, elapsedRealtime, zzw, zzx, zzy);
        this.zzcey = zzaatVar2;
        zzallVar.zzk(zzaatVar2);
    }
}
