package com.google.android.gms.internal;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzav extends zzfjm<zzav> {
    public String zzcn = null;
    public Long zzco = null;
    private String stackTrace = null;
    private String zzcp = null;
    private String zzcq = null;
    private Long zzcr = null;
    private Long zzcs = null;
    private String zzct = null;
    private Long zzcu = null;
    private String zzcv = null;

    public zzav() {
        this.zzpfd = -1;
    }

    @Override // com.google.android.gms.internal.zzfjs
    public final /* synthetic */ zzfjs zza(zzfjj zzfjjVar) {
        while (true) {
            int zzcvt = zzfjjVar.zzcvt();
            switch (zzcvt) {
                case 0:
                    return this;
                case 10:
                    this.zzcn = zzfjjVar.readString();
                    break;
                case 16:
                    this.zzco = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 26:
                    this.stackTrace = zzfjjVar.readString();
                    break;
                case 34:
                    this.zzcp = zzfjjVar.readString();
                    break;
                case 42:
                    this.zzcq = zzfjjVar.readString();
                    break;
                case 48:
                    this.zzcr = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 56:
                    this.zzcs = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 66:
                    this.zzct = zzfjjVar.readString();
                    break;
                case 72:
                    this.zzcu = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 82:
                    this.zzcv = zzfjjVar.readString();
                    break;
                default:
                    if (!super.zza(zzfjjVar, zzcvt)) {
                        return this;
                    }
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        String str = this.zzcn;
        if (str != null) {
            zzfjkVar.zzn(1, str);
        }
        Long l = this.zzco;
        if (l != null) {
            zzfjkVar.zzf(2, l.longValue());
        }
        String str2 = this.stackTrace;
        if (str2 != null) {
            zzfjkVar.zzn(3, str2);
        }
        String str3 = this.zzcp;
        if (str3 != null) {
            zzfjkVar.zzn(4, str3);
        }
        String str4 = this.zzcq;
        if (str4 != null) {
            zzfjkVar.zzn(5, str4);
        }
        Long l2 = this.zzcr;
        if (l2 != null) {
            zzfjkVar.zzf(6, l2.longValue());
        }
        Long l3 = this.zzcs;
        if (l3 != null) {
            zzfjkVar.zzf(7, l3.longValue());
        }
        String str5 = this.zzct;
        if (str5 != null) {
            zzfjkVar.zzn(8, str5);
        }
        Long l4 = this.zzcu;
        if (l4 != null) {
            zzfjkVar.zzf(9, l4.longValue());
        }
        String str6 = this.zzcv;
        if (str6 != null) {
            zzfjkVar.zzn(10, str6);
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        String str = this.zzcn;
        if (str != null) {
            zzq += zzfjk.zzo(1, str);
        }
        Long l = this.zzco;
        if (l != null) {
            zzq = C2098.m4177(l, 2, zzq);
        }
        String str2 = this.stackTrace;
        if (str2 != null) {
            zzq += zzfjk.zzo(3, str2);
        }
        String str3 = this.zzcp;
        if (str3 != null) {
            zzq += zzfjk.zzo(4, str3);
        }
        String str4 = this.zzcq;
        if (str4 != null) {
            zzq += zzfjk.zzo(5, str4);
        }
        Long l2 = this.zzcr;
        if (l2 != null) {
            zzq = C2098.m4177(l2, 6, zzq);
        }
        Long l3 = this.zzcs;
        if (l3 != null) {
            zzq = C2098.m4177(l3, 7, zzq);
        }
        String str5 = this.zzct;
        if (str5 != null) {
            zzq += zzfjk.zzo(8, str5);
        }
        Long l4 = this.zzcu;
        if (l4 != null) {
            zzq = C2098.m4177(l4, 9, zzq);
        }
        String str6 = this.zzcv;
        return str6 != null ? zzq + zzfjk.zzo(10, str6) : zzq;
    }
}
