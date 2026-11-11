package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import p131.p161.p162.p193.p203.BinderC2454;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzaea implements Runnable {
    private /* synthetic */ zzjj zzapt;
    private /* synthetic */ zzva zzcvm;
    private /* synthetic */ zzady zzcvn;
    private /* synthetic */ zzaeg zzcvo;

    public zzaea(zzady zzadyVar, zzva zzvaVar, zzjj zzjjVar, zzaeg zzaegVar) {
        this.zzcvn = zzadyVar;
        this.zzcvm = zzvaVar;
        this.zzapt = zzjjVar;
        this.zzcvo = zzaegVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        String str2;
        Context context;
        String str3;
        try {
            zzva zzvaVar = this.zzcvm;
            context = this.zzcvn.mContext;
            BinderC2454 binderC2454 = new BinderC2454(context);
            zzjj zzjjVar = this.zzapt;
            zzaeg zzaegVar = this.zzcvo;
            str3 = this.zzcvn.zzcvh;
            zzvaVar.zza(binderC2454, zzjjVar, (String) null, zzaegVar, str3);
        } catch (RemoteException e) {
            str = this.zzcvn.zzced;
            String valueOf = String.valueOf(str);
            zzakb.zzc(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "), e);
            zzady zzadyVar = this.zzcvn;
            str2 = zzadyVar.zzced;
            zzadyVar.zza(str2, 0);
        }
    }
}
