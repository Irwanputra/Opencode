package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzyg extends zzxw {
    private final zznu zzanj;
    private zzux zzanw;
    private final zzanh zzbyk;
    private zzui zzcef;
    private zzug zzcjw;
    public zzuo zzcjx;
    private boolean zzcjy;

    public zzyg(Context context, zzafp zzafpVar, zzux zzuxVar, zzyb zzybVar, zznu zznuVar, zzanh zzanhVar) {
        super(context, zzafpVar, zzybVar);
        this.zzanw = zzuxVar;
        this.zzcef = zzafpVar.zzcxl;
        this.zzanj = zznuVar;
        this.zzbyk = zzanhVar;
    }

    private static String zzk(List<zzuo> list) {
        zzuh zzuhVar;
        String str = "";
        if (list == null) {
            return "";
        }
        Iterator<zzuo> it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return str.substring(0, Math.max(0, str.length() - 1));
            }
            zzuo next = it.next();
            if (next != null && (zzuhVar = next.zzces) != null && !TextUtils.isEmpty(zzuhVar.zzcct)) {
                String valueOf = String.valueOf(str);
                String str2 = next.zzces.zzcct;
                int i2 = next.zzcer;
                if (i2 == -1) {
                    i = 4;
                } else if (i2 != 0) {
                    i = i2 != 1 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? 6 : 5 : 3 : 2 : 1;
                }
                long j = next.zzcex;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 33);
                sb.append(str2);
                sb.append(".");
                sb.append(i);
                sb.append(".");
                sb.append(j);
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + valueOf.length() + 1);
                sb3.append(valueOf);
                sb3.append(sb2);
                sb3.append("_");
                str = sb3.toString();
            }
        }
    }

    @Override // com.google.android.gms.internal.zzxw, com.google.android.gms.internal.zzagb
    public final void onStop() {
        synchronized (this.zzcjn) {
            super.onStop();
            zzug zzugVar = this.zzcjw;
            if (zzugVar != null) {
                zzugVar.cancel();
            }
        }
    }

    @Override // com.google.android.gms.internal.zzxw
    public final void zze(long j) {
        zzug zzuuVar;
        Bundle bundle;
        synchronized (this.zzcjn) {
            zzui zzuiVar = this.zzcef;
            if (zzuiVar.zzcdt != -1) {
                Context context = this.mContext;
                zzaat zzaatVar = this.zzcjk.zzcqv;
                zzux zzuxVar = this.zzanw;
                zzaax zzaaxVar = this.zzcjl;
                zzuuVar = new zzur(context, zzaatVar, zzuxVar, zzuiVar, zzaaxVar.zzben, zzaaxVar.zzbep, zzaaxVar.zzcpq, j, ((Long) zzkb.zzif().zzd(zznh.zzbnj)).longValue(), 2, this.zzcjk.zzcxx);
            } else {
                Context context2 = this.mContext;
                zzaat zzaatVar2 = this.zzcjk.zzcqv;
                zzux zzuxVar2 = this.zzanw;
                zzaax zzaaxVar2 = this.zzcjl;
                zzuuVar = new zzuu(context2, zzaatVar2, zzuxVar2, zzuiVar, zzaaxVar2.zzben, zzaaxVar2.zzbep, zzaaxVar2.zzcpq, j, ((Long) zzkb.zzif().zzd(zznh.zzbnj)).longValue(), this.zzanj, this.zzcjk.zzcxx);
            }
            this.zzcjw = zzuuVar;
        }
        ArrayList arrayList = new ArrayList(this.zzcef.zzcdj);
        Bundle bundle2 = this.zzcjk.zzcqv.zzcnd.zzbdp;
        if ((bundle2 == null || (bundle = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter")) == null) ? false : bundle.getBoolean("_skipMediation")) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (!((zzuh) listIterator.next()).zzccs.contains("com.google.ads.mediation.admob.AdMobAdapter")) {
                    listIterator.remove();
                }
            }
        }
        zzuo zzh = this.zzcjw.zzh(arrayList);
        this.zzcjx = zzh;
        int i = zzh.zzcer;
        if (i != 0) {
            if (i == 1) {
                throw new zzxz("No fill from any mediation ad networks.", 3);
            }
            int i2 = this.zzcjx.zzcer;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Unexpected mediation result: ");
            sb.append(i2);
            throw new zzxz(sb.toString(), 0);
        }
        zzuh zzuhVar = zzh.zzces;
        if (zzuhVar == null || zzuhVar.zzcdc == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        zzahn.zzdaw.post(new zzyh(this, countDownLatch));
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
            synchronized (this.zzcjn) {
                if (!this.zzcjy) {
                    throw new zzxz("View could not be prepared", 0);
                }
                if (this.zzbyk.isDestroyed()) {
                    throw new zzxz("Assets not loaded, web view is destroyed", 0);
                }
            }
        } catch (InterruptedException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 38);
            sb2.append("Interrupted while waiting for latch : ");
            sb2.append(valueOf);
            throw new zzxz(sb2.toString(), 0);
        }
    }

    @Override // com.google.android.gms.internal.zzxw
    public final zzafo zzy(int i) {
        zzaat zzaatVar = this.zzcjk.zzcqv;
        zzjj zzjjVar = zzaatVar.zzcnd;
        zzanh zzanhVar = this.zzbyk;
        zzaax zzaaxVar = this.zzcjl;
        List<String> list = zzaaxVar.zzcdk;
        List<String> list2 = zzaaxVar.zzcdl;
        List<String> list3 = zzaaxVar.zzcoy;
        int i2 = zzaaxVar.orientation;
        long j = zzaaxVar.zzcdq;
        String str = zzaatVar.zzcng;
        boolean z = zzaaxVar.zzcow;
        zzuo zzuoVar = this.zzcjx;
        zzuh zzuhVar = zzuoVar != null ? zzuoVar.zzces : null;
        zzva zzvaVar = zzuoVar != null ? zzuoVar.zzcet : null;
        String name = zzuoVar != null ? zzuoVar.zzceu : AdMobAdapter.class.getName();
        zzui zzuiVar = this.zzcef;
        zzuo zzuoVar2 = this.zzcjx;
        zzuk zzukVar = zzuoVar2 != null ? zzuoVar2.zzcev : null;
        zzaax zzaaxVar2 = this.zzcjl;
        zzuh zzuhVar2 = zzuhVar;
        zzva zzvaVar2 = zzvaVar;
        long j2 = zzaaxVar2.zzcox;
        zzafp zzafpVar = this.zzcjk;
        zzjn zzjnVar = zzafpVar.zzauc;
        long j3 = zzaaxVar2.zzcov;
        long j4 = zzafpVar.zzcxp;
        long j5 = zzaaxVar2.zzcpa;
        String str2 = zzaaxVar2.zzcpb;
        JSONObject jSONObject = zzafpVar.zzcxj;
        zzaeq zzaeqVar = zzaaxVar2.zzcpl;
        List<String> list4 = zzaaxVar2.zzcpm;
        List<String> list5 = zzaaxVar2.zzcpn;
        boolean z2 = zzuiVar != null ? zzuiVar.zzcdv : false;
        zzaaz zzaazVar = zzaaxVar2.zzcpp;
        zzug zzugVar = this.zzcjw;
        String zzk = zzugVar != null ? zzk(zzugVar.zzlu()) : null;
        zzaax zzaaxVar3 = this.zzcjl;
        List<String> list6 = zzaaxVar3.zzcdn;
        String str3 = zzaaxVar3.zzcps;
        zzafp zzafpVar2 = this.zzcjk;
        return new zzafo(zzjjVar, zzanhVar, list, i, list2, list3, i2, j, str, z, zzuhVar2, zzvaVar2, name, zzuiVar, zzukVar, j2, zzjnVar, j3, j4, j5, str2, jSONObject, null, zzaeqVar, list4, list5, z2, zzaazVar, zzk, list6, str3, zzafpVar2.zzcxw, zzaaxVar3.zzaqv, zzafpVar2.zzcxx);
    }
}
