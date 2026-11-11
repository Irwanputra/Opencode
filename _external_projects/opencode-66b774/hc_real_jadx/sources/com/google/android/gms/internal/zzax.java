package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzax extends zzfjm<zzax> {
    public String zzcw;
    private String zzcx;
    private String zzcy;
    private String zzcz;
    private String zzda;

    @Override // com.google.android.gms.internal.zzfjs
    public final /* synthetic */ zzfjs zza(zzfjj zzfjjVar) {
        while (true) {
            int zzcvt = zzfjjVar.zzcvt();
            if (zzcvt == 0) {
                return this;
            }
            if (zzcvt == 10) {
                this.zzcw = zzfjjVar.readString();
            } else if (zzcvt == 18) {
                this.zzcx = zzfjjVar.readString();
            } else if (zzcvt == 26) {
                this.zzcy = zzfjjVar.readString();
            } else if (zzcvt == 34) {
                this.zzcz = zzfjjVar.readString();
            } else if (zzcvt == 42) {
                this.zzda = zzfjjVar.readString();
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        String str = this.zzcw;
        if (str != null) {
            zzfjkVar.zzn(1, str);
        }
        String str2 = this.zzcx;
        if (str2 != null) {
            zzfjkVar.zzn(2, str2);
        }
        String str3 = this.zzcy;
        if (str3 != null) {
            zzfjkVar.zzn(3, str3);
        }
        String str4 = this.zzcz;
        if (str4 != null) {
            zzfjkVar.zzn(4, str4);
        }
        String str5 = this.zzda;
        if (str5 != null) {
            zzfjkVar.zzn(5, str5);
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzcw;
        if (str != null) {
            zzq += zzfjk.zzo(1, str);
        }
        String str2 = this.zzcx;
        if (str2 != null) {
            zzq += zzfjk.zzo(2, str2);
        }
        String str3 = this.zzcy;
        if (str3 != null) {
            zzq += zzfjk.zzo(3, str3);
        }
        String str4 = this.zzcz;
        if (str4 != null) {
            zzq += zzfjk.zzo(4, str4);
        }
        String str5 = this.zzda;
        return str5 != null ? zzq + zzfjk.zzo(5, str5) : zzq;
    }
}
