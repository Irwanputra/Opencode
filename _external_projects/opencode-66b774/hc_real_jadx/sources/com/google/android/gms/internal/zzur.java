package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzbs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p131.p161.p162.p193.p205.p209.C2510;

@zzzv
/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzur implements zzug {
    private final Context mContext;
    private final long mStartTime;
    private final zzux zzanw;
    private final boolean zzavp;
    private final zzui zzcef;
    private final boolean zzcej;
    private final boolean zzcek;
    private final zzaat zzcey;
    private final long zzcez;
    private final String zzcfd;
    private final Object mLock = new Object();
    private boolean zzcfb = false;
    private final Map<zzakv<zzuo>, zzul> zzcfc = new HashMap();
    private List<zzuo> zzcfe = new ArrayList();
    private final int zzcfa = 2;

    public zzur(Context context, zzaat zzaatVar, zzux zzuxVar, zzui zzuiVar, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.mContext = context;
        this.zzcey = zzaatVar;
        this.zzanw = zzuxVar;
        this.zzcef = zzuiVar;
        this.zzavp = z;
        this.zzcej = z2;
        this.zzcfd = str;
        this.mStartTime = j;
        this.zzcez = j2;
        this.zzcek = z3;
    }

    private final void zza(zzakv<zzuo> zzakvVar) {
        zzahn.zzdaw.post(new zzut(this, zzakvVar));
    }

    private final zzuo zzi(List<zzakv<zzuo>> list) {
        synchronized (this.mLock) {
            if (this.zzcfb) {
                return new zzuo(-1);
            }
            for (zzakv<zzuo> zzakvVar : list) {
                try {
                    zzuo zzuoVar = zzakvVar.get();
                    this.zzcfe.add(zzuoVar);
                    if (zzuoVar != null && zzuoVar.zzcer == 0) {
                        zza(zzakvVar);
                        return zzuoVar;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    zzakb.zzc("Exception while processing an adapter; continuing with other adapters", e);
                }
            }
            zza((zzakv<zzuo>) null);
            return new zzuo(1);
        }
    }

    private final zzuo zzj(List<zzakv<zzuo>> list) {
        zzuo zzuoVar;
        zzuo zzuoVar2;
        zzvg zzvgVar;
        synchronized (this.mLock) {
            int i = -1;
            if (this.zzcfb) {
                return new zzuo(-1);
            }
            long j = this.zzcef.zzcdu;
            if (j == -1) {
                j = 10000;
            }
            zzakv<zzuo> zzakvVar = null;
            zzuo zzuoVar3 = null;
            for (zzakv<zzuo> zzakvVar2 : list) {
                ((C2510) zzbs.zzeo()).getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (j == 0) {
                    try {
                        try {
                        } catch (Throwable th) {
                            ((C2510) zzbs.zzeo()).getClass();
                            Math.max(j - (System.currentTimeMillis() - currentTimeMillis), 0L);
                            throw th;
                        }
                    } catch (RemoteException | InterruptedException | ExecutionException | TimeoutException e) {
                        zzakb.zzc("Exception while processing an adapter; continuing with other adapters", e);
                        ((C2510) zzbs.zzeo()).getClass();
                    }
                    if (zzakvVar2.isDone()) {
                        zzuoVar = zzakvVar2.get();
                        zzuoVar2 = zzuoVar;
                        this.zzcfe.add(zzuoVar2);
                        if (zzuoVar2 != null && zzuoVar2.zzcer == 0 && (zzvgVar = zzuoVar2.zzcew) != null && zzvgVar.zzmc() > i) {
                            i = zzvgVar.zzmc();
                            zzakvVar = zzakvVar2;
                            zzuoVar3 = zzuoVar2;
                        }
                        ((C2510) zzbs.zzeo()).getClass();
                        j = Math.max(j - (System.currentTimeMillis() - currentTimeMillis), 0L);
                    }
                }
                zzuoVar = zzakvVar2.get(j, TimeUnit.MILLISECONDS);
                zzuoVar2 = zzuoVar;
                this.zzcfe.add(zzuoVar2);
                if (zzuoVar2 != null) {
                    i = zzvgVar.zzmc();
                    zzakvVar = zzakvVar2;
                    zzuoVar3 = zzuoVar2;
                }
                ((C2510) zzbs.zzeo()).getClass();
                j = Math.max(j - (System.currentTimeMillis() - currentTimeMillis), 0L);
            }
            zza(zzakvVar);
            return zzuoVar3 == null ? new zzuo(1) : zzuoVar3;
        }
    }

    @Override // com.google.android.gms.internal.zzug
    public final void cancel() {
        synchronized (this.mLock) {
            this.zzcfb = true;
            Iterator<zzul> it = this.zzcfc.values().iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }
    }

    @Override // com.google.android.gms.internal.zzug
    public final zzuo zzh(List<zzuh> list) {
        zzakb.zzbx("Starting mediation.");
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        ArrayList arrayList = new ArrayList();
        zzjn zzjnVar = this.zzcey.zzauc;
        int[] iArr = new int[2];
        if (zzjnVar.zzbem != null) {
            zzbs.zzez();
            if (zzuq.zza(this.zzcfd, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                zzjn[] zzjnVarArr = zzjnVar.zzbem;
                int length = zzjnVarArr.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    zzjn zzjnVar2 = zzjnVarArr[i];
                    if (i2 == zzjnVar2.width && i3 == zzjnVar2.height) {
                        zzjnVar = zzjnVar2;
                        break;
                    }
                    i++;
                }
            }
        }
        Iterator<zzuh> it = list.iterator();
        while (it.hasNext()) {
            zzuh next = it.next();
            String valueOf = String.valueOf(next.zzccr);
            zzakb.zzct(valueOf.length() != 0 ? "Trying mediation network: ".concat(valueOf) : new String("Trying mediation network: "));
            for (Iterator<String> it2 = next.zzccs.iterator(); it2.hasNext(); it2 = it2) {
                String next2 = it2.next();
                Context context = this.mContext;
                zzux zzuxVar = this.zzanw;
                zzui zzuiVar = this.zzcef;
                zzaat zzaatVar = this.zzcey;
                ArrayList arrayList2 = arrayList;
                ExecutorService executorService = newCachedThreadPool;
                zzul zzulVar = new zzul(context, next2, zzuxVar, zzuiVar, next, zzaatVar.zzcnd, zzjnVar, zzaatVar.zzaty, this.zzavp, this.zzcej, zzaatVar.zzauo, zzaatVar.zzauw, zzaatVar.zzcns, zzaatVar.zzcon, this.zzcek);
                zzakv<zzuo> zza = zzahh.zza(executorService, new zzus(this, zzulVar));
                this.zzcfc.put(zza, zzulVar);
                arrayList2.add(zza);
                it = it;
                newCachedThreadPool = executorService;
                arrayList = arrayList2;
            }
        }
        ArrayList arrayList3 = arrayList;
        return this.zzcfa != 2 ? zzi(arrayList3) : zzj(arrayList3);
    }

    @Override // com.google.android.gms.internal.zzug
    public final List<zzuo> zzlu() {
        return this.zzcfe;
    }
}
