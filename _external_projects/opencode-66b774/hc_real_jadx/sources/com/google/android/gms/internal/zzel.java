package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzel extends zzet {
    private final StackTraceElement[] zzaks;

    public zzel(zzdm zzdmVar, String str, String str2, zzaz zzazVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzdmVar, str, str2, zzazVar, i, 45);
        this.zzaks = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.zzet
    public final void zzay() {
        StackTraceElement[] stackTraceElementArr = this.zzaks;
        if (stackTraceElementArr != null) {
            zzdk zzdkVar = new zzdk((String) this.zzakw.invoke(null, stackTraceElementArr));
            synchronized (this.zzako) {
                this.zzako.zzej = zzdkVar.zzaim;
                if (zzdkVar.zzain.booleanValue()) {
                    this.zzako.zzer = Integer.valueOf(zzdkVar.zzaio.booleanValue() ? 0 : 1);
                }
            }
        }
    }
}
