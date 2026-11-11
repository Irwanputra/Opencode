package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.internal.zzaau;
import com.google.android.gms.internal.zzabo;
import com.google.android.gms.internal.zzafo;
import com.google.android.gms.internal.zzafq;
import com.google.android.gms.internal.zzafs;
import com.google.android.gms.internal.zzagb;
import com.google.android.gms.internal.zzahh;
import com.google.android.gms.internal.zzahn;
import com.google.android.gms.internal.zzaht;
import com.google.android.gms.internal.zzakb;
import com.google.android.gms.internal.zzakd;
import com.google.android.gms.internal.zzakv;
import com.google.android.gms.internal.zzanh;
import com.google.android.gms.internal.zzbhf;
import com.google.android.gms.internal.zzhk;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzix;
import com.google.android.gms.internal.zzjj;
import com.google.android.gms.internal.zzjn;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzld;
import com.google.android.gms.internal.zzlr;
import com.google.android.gms.internal.zznh;
import com.google.android.gms.internal.zznu;
import com.google.android.gms.internal.zzpe;
import com.google.android.gms.internal.zzqm;
import com.google.android.gms.internal.zzqw;
import com.google.android.gms.internal.zzqz;
import com.google.android.gms.internal.zztk;
import com.google.android.gms.internal.zzuh;
import com.google.android.gms.internal.zzui;
import com.google.android.gms.internal.zzuj;
import com.google.android.gms.internal.zzuk;
import com.google.android.gms.internal.zzuq;
import com.google.android.gms.internal.zzux;
import com.google.android.gms.internal.zzva;
import com.google.android.gms.internal.zzzv;
import com.google.android.gms.internal.zzzy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p034.p080.C1493;
import p034.p095.C1687;
import p131.p161.p162.p193.p194.p199.CallableC2397;
import p131.p161.p162.p193.p194.p199.CallableC2431;
import p131.p161.p162.p193.p194.p199.RunnableC2407;
import p131.p161.p162.p193.p194.p199.RunnableC2447;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzd extends zza implements zzn, zzbl, zzuj {
    public final zzux zzanw;
    private transient boolean zzanx;

    public zzd(Context context, zzjn zzjnVar, String str, zzux zzuxVar, zzakd zzakdVar, zzv zzvVar) {
        this(new zzbt(context, zzjnVar, str, zzakdVar), zzuxVar, null, zzvVar);
    }

    private zzd(zzbt zzbtVar, zzux zzuxVar, zzbi zzbiVar, zzv zzvVar) {
        super(zzbtVar, null, zzvVar);
        this.zzanw = zzuxVar;
        this.zzanx = false;
    }

    private final zzaau zza(zzjj zzjjVar, Bundle bundle, zzafs zzafsVar, int i) {
        PackageInfo packageInfo;
        Bundle bundle2;
        JSONArray optJSONArray;
        ApplicationInfo applicationInfo = this.zzano.zzair.getApplicationInfo();
        String str = null;
        try {
            packageInfo = zzbhf.zzdb(this.zzano.zzair).getPackageInfo(applicationInfo.packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfo = null;
        }
        DisplayMetrics displayMetrics = this.zzano.zzair.getResources().getDisplayMetrics();
        zzbu zzbuVar = this.zzano.f2793;
        if (zzbuVar == null || zzbuVar.getParent() == null) {
            bundle2 = null;
        } else {
            int[] iArr = new int[2];
            this.zzano.f2793.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int i3 = iArr[1];
            int width = this.zzano.f2793.getWidth();
            int height = this.zzano.f2793.getHeight();
            int i4 = (!this.zzano.f2793.isShown() || i2 + width <= 0 || i3 + height <= 0 || i2 > displayMetrics.widthPixels || i3 > displayMetrics.heightPixels) ? 0 : 1;
            Bundle bundle3 = new Bundle(5);
            bundle3.putInt("x", i2);
            bundle3.putInt("y", i3);
            bundle3.putInt("width", width);
            bundle3.putInt("height", height);
            bundle3.putInt("visible", i4);
            bundle2 = bundle3;
        }
        String zzpa = zzbs.zzem().zzpa();
        zzbt zzbtVar = this.zzano;
        zzbtVar.zzauf = new zzafq(zzpa, zzbtVar.zzatw);
        this.zzano.zzauf.zzo(zzjjVar);
        zzbs.zzei();
        zzbt zzbtVar2 = this.zzano;
        String zza = zzahn.zza(zzbtVar2.zzair, zzbtVar2.f2793, zzbtVar2.zzauc);
        long j = 0;
        zzld zzldVar = this.zzano.f2770;
        if (zzldVar != null) {
            try {
                j = zzldVar.getValue();
            } catch (RemoteException unused2) {
                zzakb.zzcu("Cannot get correlation id, default to 0.");
            }
        }
        long j2 = j;
        String uuid = UUID.randomUUID().toString();
        Bundle zza2 = zzbs.zzem().zza(this.zzano.zzair, this, zzpa);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (true) {
            C1493<String, zzqz> c1493 = this.zzano.f2785;
            if (i5 >= c1493.f6910) {
                break;
            }
            String m3246 = c1493.m3246(i5);
            arrayList.add(m3246);
            if (this.zzano.f2797.containsKey(m3246) && this.zzano.f2797.get(m3246) != null) {
                arrayList2.add(m3246);
            }
            i5++;
        }
        CallableC2397 callableC2397 = new CallableC2397(this);
        ThreadPoolExecutor threadPoolExecutor = zzahh.zzdar;
        zzakv zza3 = zzahh.zza(threadPoolExecutor, callableC2397);
        zzakv zza4 = zzahh.zza(threadPoolExecutor, new CallableC2431(this));
        String zzow = zzafsVar != null ? zzafsVar.zzow() : null;
        List<String> list = this.zzano.f2781;
        if (list != null && list.size() > 0) {
            int i6 = packageInfo != null ? packageInfo.versionCode : 0;
            if (i6 > zzbs.zzem().zzpk()) {
                zzbs.zzem().zzpr();
                zzbs.zzem().zzac(i6);
            } else {
                JSONObject zzpq = zzbs.zzem().zzpq();
                if (zzpq != null && (optJSONArray = zzpq.optJSONArray(this.zzano.zzatw)) != null) {
                    str = optJSONArray.toString();
                }
            }
        }
        String str2 = str;
        zzbt zzbtVar3 = this.zzano;
        zzjn zzjnVar = zzbtVar3.zzauc;
        String str3 = zzbtVar3.zzatw;
        String zzic = zzkb.zzic();
        zzbt zzbtVar4 = this.zzano;
        zzakd zzakdVar = zzbtVar4.zzaty;
        List<String> list2 = zzbtVar4.f2781;
        boolean zzpd = zzbs.zzem().zzpd();
        int i7 = displayMetrics.widthPixels;
        int i8 = displayMetrics.heightPixels;
        float f = displayMetrics.density;
        List<String> zziw = zznh.zziw();
        zzbt zzbtVar5 = this.zzano;
        String str4 = zzbtVar5.f2771;
        zzpe zzpeVar = zzbtVar5.f2790;
        String zzfm = zzbtVar5.zzfm();
        zzbs.zzei();
        float zzdn = zzahn.zzdn();
        zzbs.zzei();
        boolean zzdo = zzahn.zzdo();
        zzbs.zzei();
        int zzar = zzahn.zzar(this.zzano.zzair);
        zzbs.zzei();
        int zzw = zzahn.zzw(this.zzano.f2793);
        boolean z = this.zzano.zzair instanceof Activity;
        boolean zzph = zzbs.zzem().zzph();
        boolean zzpm = zzbs.zzem().zzpm();
        int zzsr = zzbs.zzfb().zzsr();
        zzbs.zzei();
        Bundle zzqe = zzahn.zzqe();
        String zzqp = zzbs.zzer().zzqp();
        zzlr zzlrVar = this.zzano.f2779;
        boolean zzqq = zzbs.zzer().zzqq();
        Bundle asBundle = zztk.zzlc().asBundle();
        zzbs.zzem();
        zzbt zzbtVar6 = this.zzano;
        boolean contains = zzbtVar6.zzair.getSharedPreferences("admob", 0).getStringSet("never_pool_slots", Collections.emptySet()).contains(zzbtVar6.zzatw);
        zzbt zzbtVar7 = this.zzano;
        List<Integer> list3 = zzbtVar7.f2778;
        boolean zzamu = zzbhf.zzdb(zzbtVar7.zzair).zzamu();
        boolean zzpn = zzbs.zzem().zzpn();
        zzbs.zzek();
        return new zzaau(bundle2, zzjjVar, zzjnVar, str3, applicationInfo, packageInfo, zzpa, zzic, zzakdVar, zza2, list2, arrayList, bundle, zzpd, i7, i8, f, zza, j2, uuid, zziw, str4, zzpeVar, zzfm, zzdn, zzdo, zzar, zzw, z, zzph, zza3, zzow, zzpm, zzsr, zzqe, zzqp, zzlrVar, zzqq, asBundle, contains, zza4, list3, str2, arrayList2, i, zzamu, zzpn, zzaht.zzqj());
    }

    public static String zzc(zzafo zzafoVar) {
        zzuh zzuhVar;
        if (zzafoVar == null) {
            return null;
        }
        String str = zzafoVar.zzceu;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && (zzuhVar = zzafoVar.zzces) != null) {
            try {
                return new JSONObject(zzuhVar.zzccz).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.zzks
    public final String getMediationAdapterClassName() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null) {
            return null;
        }
        return zzafoVar.zzceu;
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzje
    public void onAdClicked() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null) {
            zzakb.zzcu("Ad state was null when trying to ping click URLs.");
            return;
        }
        zzui zzuiVar = zzafoVar.zzcxl;
        if (zzuiVar != null && zzuiVar.zzcdk != null) {
            zzbs.zzez();
            zzbt zzbtVar = this.zzano;
            Context context = zzbtVar.zzair;
            String str = zzbtVar.zzaty.zzcv;
            zzafo zzafoVar2 = zzbtVar.zzaud;
            zzuq.zza(context, str, zzafoVar2, zzbtVar.zzatw, false, zzc(zzafoVar2.zzcxl.zzcdk));
        }
        zzuh zzuhVar = this.zzano.zzaud.zzces;
        if (zzuhVar != null && zzuhVar.zzccv != null) {
            zzbs.zzez();
            zzbt zzbtVar2 = this.zzano;
            Context context2 = zzbtVar2.zzair;
            String str2 = zzbtVar2.zzaty.zzcv;
            zzafo zzafoVar3 = zzbtVar2.zzaud;
            zzuq.zza(context2, str2, zzafoVar3, zzbtVar2.zzatw, false, zzafoVar3.zzces.zzccv);
        }
        super.onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onPause() {
        this.zzanq.zzj(this.zzano.zzaud);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzn
    public final void onResume() {
        this.zzanq.zzk(this.zzano.zzaud);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public void pause() {
        zzva zzvaVar;
        C1687.m3716("pause must be called on the main UI thread.");
        zzbt zzbtVar = this.zzano;
        zzafo zzafoVar = zzbtVar.zzaud;
        if (zzafoVar != null && zzafoVar.zzciy != null && zzbtVar.zzfk()) {
            zzbs.zzek();
            zzaht.zzi(this.zzano.zzaud.zzciy);
        }
        zzafo zzafoVar2 = this.zzano.zzaud;
        if (zzafoVar2 != null && (zzvaVar = zzafoVar2.zzcet) != null) {
            try {
                zzvaVar.pause();
            } catch (RemoteException unused) {
                zzakb.zzcu("Could not pause mediation adapter.");
            }
        }
        this.zzanq.zzj(this.zzano.zzaud);
        this.zzann.pause();
    }

    public final void recordImpression() {
        zza(this.zzano.zzaud, false);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzks
    public void resume() {
        zzanh zzanhVar;
        zzva zzvaVar;
        C1687.m3716("resume must be called on the main UI thread.");
        zzbt zzbtVar = this.zzano;
        zzafo zzafoVar = zzbtVar.zzaud;
        if (zzafoVar == null || (zzanhVar = zzafoVar.zzciy) == null) {
            zzanhVar = null;
        }
        if (zzanhVar != null && zzbtVar.zzfk()) {
            zzbs.zzek();
            zzaht.zzj(this.zzano.zzaud.zzciy);
        }
        zzafo zzafoVar2 = this.zzano.zzaud;
        if (zzafoVar2 != null && (zzvaVar = zzafoVar2.zzcet) != null) {
            try {
                zzvaVar.resume();
            } catch (RemoteException unused) {
                zzakb.zzcu("Could not resume mediation adapter.");
            }
        }
        if (zzanhVar == null || !zzanhVar.zztf()) {
            this.zzann.resume();
        }
        this.zzanq.zzk(this.zzano.zzaud);
    }

    public void showInterstitial() {
        zzakb.zzcu("showInterstitial is not supported for current ad type");
    }

    public void zza(zzafo zzafoVar, boolean z) {
        if (zzafoVar == null) {
            zzakb.zzcu("Ad state was null when trying to ping impression URLs.");
            return;
        }
        zzakb.zzbx("Pinging Impression URLs.");
        zzafq zzafqVar = this.zzano.zzauf;
        if (zzafqVar != null) {
            zzafqVar.zzoo();
        }
        zzafoVar.zzcxw.zza(zziu.zza.zzb.AD_IMPRESSION);
        if (zzafoVar.zzcdl != null && !zzafoVar.zzcxs) {
            zzbs.zzei();
            zzbt zzbtVar = this.zzano;
            zzahn.zza(zzbtVar.zzair, zzbtVar.zzaty.zzcv, zzc(zzafoVar.zzcdl));
            zzafoVar.zzcxs = true;
        }
        if (!zzafoVar.zzcxt || z) {
            zzui zzuiVar = zzafoVar.zzcxl;
            if (zzuiVar != null && zzuiVar.zzcdl != null) {
                zzbs.zzez();
                zzbt zzbtVar2 = this.zzano;
                zzuq.zza(zzbtVar2.zzair, zzbtVar2.zzaty.zzcv, zzafoVar, zzbtVar2.zzatw, z, zzc(zzafoVar.zzcxl.zzcdl));
            }
            zzuh zzuhVar = zzafoVar.zzces;
            if (zzuhVar != null && zzuhVar.zzccw != null) {
                zzbs.zzez();
                zzbt zzbtVar3 = this.zzano;
                zzuq.zza(zzbtVar3.zzair, zzbtVar3.zzaty.zzcv, zzafoVar, zzbtVar3.zzatw, z, zzafoVar.zzces.zzccw);
            }
            zzafoVar.zzcxt = true;
        }
    }

    public final boolean zza(zzaau zzaauVar, zznu zznuVar) {
        this.zzanj = zznuVar;
        zznuVar.zzf("seq_num", zzaauVar.zzcng);
        zznuVar.zzf("request_id", zzaauVar.zzcnq);
        zznuVar.zzf("session_id", zzaauVar.zzcnh);
        PackageInfo packageInfo = zzaauVar.zzcne;
        if (packageInfo != null) {
            zznuVar.zzf("app_version", String.valueOf(packageInfo.versionCode));
        }
        zzbt zzbtVar = this.zzano;
        zzbs.zzee();
        Context context = this.zzano.zzair;
        zzix zzixVar = this.zzanr.zzaoo;
        zzagb zzaboVar = zzaauVar.zzcnd.extras.getBundle("sdk_less_server_data") != null ? new zzabo(context, zzaauVar, this, zzixVar) : new zzzy(context, zzaauVar, this, zzixVar);
        zzaboVar.zzpy();
        zzbtVar.zzaua = zzaboVar;
        return true;
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final boolean zza(zzafo zzafoVar) {
        zzjj zzjjVar = this.zzanp;
        boolean z = false;
        if (zzjjVar != null) {
            this.zzanp = null;
        } else {
            zzjjVar = zzafoVar.zzcnd;
            Bundle bundle = zzjjVar.extras;
            if (bundle != null) {
                z = bundle.getBoolean("_noRefresh", false);
            }
        }
        return zza(zzjjVar, zzafoVar, z);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public boolean zza(zzafo zzafoVar, zzafo zzafoVar2) {
        int i;
        zzuk zzukVar;
        if (zzafoVar != null && (zzukVar = zzafoVar.zzcev) != null) {
            zzukVar.zza((zzuj) null);
        }
        zzuk zzukVar2 = zzafoVar2.zzcev;
        if (zzukVar2 != null) {
            zzukVar2.zza(this);
        }
        zzui zzuiVar = zzafoVar2.zzcxl;
        int i2 = 0;
        if (zzuiVar != null) {
            i2 = zzuiVar.zzcdy;
            i = zzuiVar.zzcdz;
        } else {
            i = 0;
        }
        this.zzano.zzaux.zze(i2, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r0 > 0) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean zza(com.google.android.gms.internal.zzjj r5, com.google.android.gms.internal.zzafo r6, boolean r7) {
        /*
            r4 = this;
            if (r7 != 0) goto L31
            com.google.android.gms.ads.internal.zzbt r7 = r4.zzano
            boolean r7 = r7.zzfk()
            if (r7 == 0) goto L31
            long r0 = r6.zzcdq
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L18
        L12:
            com.google.android.gms.ads.internal.zzbi r6 = r4.zzann
            r6.zza(r5, r0)
            goto L31
        L18:
            com.google.android.gms.internal.zzui r7 = r6.zzcxl
            if (r7 == 0) goto L23
            long r0 = r7.zzcdq
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L23
            goto L12
        L23:
            boolean r7 = r6.zzcow
            if (r7 != 0) goto L31
            int r6 = r6.errorCode
            r7 = 2
            if (r6 != r7) goto L31
            com.google.android.gms.ads.internal.zzbi r6 = r4.zzann
            r6.zzg(r5)
        L31:
            com.google.android.gms.ads.internal.zzbi r5 = r4.zzann
            boolean r5 = r5.zzdx()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzd.zza(com.google.android.gms.internal.zzjj, com.google.android.gms.internal.zzafo, boolean):boolean");
    }

    @Override // com.google.android.gms.ads.internal.zza
    public boolean zza(zzjj zzjjVar, zznu zznuVar) {
        return zza(zzjjVar, zznuVar, 1);
    }

    public final boolean zza(zzjj zzjjVar, zznu zznuVar, int i) {
        if (!zzcf()) {
            return false;
        }
        zzbs.zzei();
        zzhk zzac = zzbs.zzem().zzac(this.zzano.zzair);
        zzafs zzafsVar = null;
        Bundle zza = zzac == null ? null : zzahn.zza(zzac);
        this.zzann.cancel();
        this.zzano.zzauz = 0;
        if (((Boolean) zzkb.zzif().zzd(zznh.zzbpl)).booleanValue()) {
            zzafs zzpp = zzbs.zzem().zzpp();
            zzac zzep = zzbs.zzep();
            zzbt zzbtVar = this.zzano;
            zzep.m1218(zzbtVar.zzair, zzbtVar.zzaty, false, zzpp, zzpp != null ? zzpp.getAppId() : null, zzbtVar.zzatw, null);
            zzafsVar = zzpp;
        }
        return zza(zza(zzjjVar, zza, zzafsVar, i), zznuVar);
    }

    @Override // com.google.android.gms.ads.internal.zza, com.google.android.gms.internal.zzyb
    public final void zzb(zzafo zzafoVar) {
        zzui zzuiVar;
        List<String> list;
        super.zzb(zzafoVar);
        if (zzafoVar.zzces != null) {
            zzakb.zzbx("Disable the debug gesture detector on the mediation ad frame.");
            zzbu zzbuVar = this.zzano.f2793;
            if (zzbuVar != null) {
                zzbuVar.zzfq();
            }
            zzakb.zzbx("Pinging network fill URLs.");
            zzbs.zzez();
            zzbt zzbtVar = this.zzano;
            zzuq.zza(zzbtVar.zzair, zzbtVar.zzaty.zzcv, zzafoVar, zzbtVar.zzatw, false, zzafoVar.zzces.zzccy);
            zzui zzuiVar2 = zzafoVar.zzcxl;
            if (zzuiVar2 != null && (list = zzuiVar2.zzcdn) != null && list.size() > 0) {
                zzakb.zzbx("Pinging urls remotely");
                zzbs.zzei().zza(this.zzano.zzair, zzafoVar.zzcxl.zzcdn);
            }
        } else {
            zzakb.zzbx("Enable the debug gesture detector on the admob ad frame.");
            zzbu zzbuVar2 = this.zzano.f2793;
            if (zzbuVar2 != null) {
                zzbuVar2.zzfp();
            }
        }
        if (zzafoVar.errorCode != 3 || (zzuiVar = zzafoVar.zzcxl) == null || zzuiVar.zzcdm == null) {
            return;
        }
        zzakb.zzbx("Pinging no fill URLs.");
        zzbs.zzez();
        zzbt zzbtVar2 = this.zzano;
        zzuq.zza(zzbtVar2.zzair, zzbtVar2.zzaty.zzcv, zzafoVar, zzbtVar2.zzatw, false, zzafoVar.zzcxl.zzcdm);
    }

    @Override // com.google.android.gms.internal.zzuj
    public final void zzc(String str, String str2) {
        onAppEvent(str, str2);
    }

    @Override // com.google.android.gms.ads.internal.zza
    public final boolean zzc(zzjj zzjjVar) {
        return super.zzc(zzjjVar) && !this.zzanx;
    }

    public boolean zzcf() {
        zzbs.zzei();
        Context context = this.zzano.zzair;
        if (zzahn.zzd(context, context.getPackageName(), "android.permission.INTERNET")) {
            zzbs.zzei();
            if (zzahn.zzag(this.zzano.zzair)) {
                return true;
            }
        }
        return false;
    }

    public void zzcg() {
        this.zzanx = false;
        zzbv();
        this.zzano.zzauf.zzoq();
    }

    public void zzch() {
        this.zzanx = true;
        zzbx();
    }

    public void zzci() {
        zzakb.zzcu("Mediated ad does not support onVideoEnd callback");
    }

    public void zzcj() {
        onAdClicked();
    }

    @Override // com.google.android.gms.internal.zzuj
    public final void zzck() {
        zzcg();
    }

    @Override // com.google.android.gms.internal.zzuj
    public final void zzcl() {
        zzbw();
    }

    @Override // com.google.android.gms.internal.zzuj
    public final void zzcm() {
        zzch();
    }

    @Override // com.google.android.gms.internal.zzuj
    public final void zzcn() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar != null) {
            String str = zzafoVar.zzceu;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            zzakb.zzcu(sb.toString());
        }
        zza(this.zzano.zzaud, true);
        zzby();
    }

    public void zzco() {
        recordImpression();
    }

    @Override // com.google.android.gms.internal.zzks
    public final String zzcp() {
        zzafo zzafoVar = this.zzano.zzaud;
        if (zzafoVar == null) {
            return null;
        }
        return zzc(zzafoVar);
    }

    @Override // com.google.android.gms.ads.internal.zzbl
    public final void zzcq() {
        zzbs.zzei();
        zzahn.runOnUiThread(new RunnableC2447(this));
    }

    @Override // com.google.android.gms.ads.internal.zzbl
    public final void zzcr() {
        zzbs.zzei();
        zzahn.runOnUiThread(new RunnableC2407(this));
    }

    @Override // com.google.android.gms.internal.zzuj
    public final void zza(zzqm zzqmVar, String str) {
        String customTemplateId;
        zzqw zzqwVar = null;
        if (zzqmVar != null) {
            try {
                customTemplateId = zzqmVar.getCustomTemplateId();
            } catch (RemoteException e) {
                zzakb.zzc("Unable to call onCustomClick.", e);
                return;
            }
        } else {
            customTemplateId = null;
        }
        C1493<String, zzqw> c1493 = this.zzano.f2797;
        if (c1493 != null && customTemplateId != null) {
            zzqwVar = c1493.getOrDefault(customTemplateId, null);
        }
        if (zzqwVar == null) {
            zzakb.zzcu("Mediation adapter invoked onCustomClick but no listeners were set.");
        } else {
            zzqwVar.zzb(zzqmVar, str);
        }
    }
}
