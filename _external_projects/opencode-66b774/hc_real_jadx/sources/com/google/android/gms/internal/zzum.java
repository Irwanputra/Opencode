package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzum implements Runnable {
    private /* synthetic */ zzuk zzceo;
    private /* synthetic */ zzul zzcep;

    public zzum(zzul zzulVar, zzuk zzukVar) {
        this.zzcep = zzulVar;
        this.zzceo = zzukVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        zzva zzlz;
        zzva zzvaVar;
        boolean zzma;
        boolean zzw;
        String str;
        obj = this.zzcep.mLock;
        synchronized (obj) {
            i = this.zzcep.zzcem;
            if (i != -2) {
                return;
            }
            zzul zzulVar = this.zzcep;
            zzlz = zzulVar.zzlz();
            zzulVar.zzcel = zzlz;
            zzvaVar = this.zzcep.zzcel;
            if (zzvaVar == null) {
                this.zzcep.zzv(4);
                return;
            }
            zzma = this.zzcep.zzma();
            if (zzma) {
                zzw = this.zzcep.zzw(1);
                if (!zzw) {
                    str = this.zzcep.zzced;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                    sb.append("Ignoring adapter ");
                    sb.append(str);
                    sb.append(" as delayed impression is not supported");
                    zzakb.zzcu(sb.toString());
                    this.zzcep.zzv(2);
                    return;
                }
            }
            this.zzceo.zza(this.zzcep);
            this.zzcep.zza(this.zzceo);
        }
    }
}
