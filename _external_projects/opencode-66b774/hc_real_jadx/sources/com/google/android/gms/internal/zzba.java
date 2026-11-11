package com.google.android.gms.internal;

import androidx.core.app.NotificationCompat;
import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzba extends zzfjm<zzba> {
    private static volatile zzba[] zzfj;
    public Integer zzfo;
    public Integer zzfs;
    public Long zzdn = null;
    public Long zzdo = null;
    public Long zzfk = null;
    public Long zzfl = null;
    public Long zzfm = null;
    public Long zzfn = null;
    public Long zzfp = null;
    public Long zzfq = null;
    public Long zzfr = null;
    public Long zzft = null;
    public Long zzfu = null;
    public Long zzfv = null;
    public Long zzfw = null;
    public Long zzfx = null;
    public Long zzfy = null;
    public Long zzfz = null;
    public Long zzga = null;
    public Long zzgb = null;
    public Long zzgc = null;

    public zzba() {
        this.zzpfd = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzfjs
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzba zza(zzfjj zzfjjVar) {
        while (true) {
            int zzcvt = zzfjjVar.zzcvt();
            switch (zzcvt) {
                case 0:
                    return this;
                case 8:
                    this.zzdn = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 16:
                    this.zzdo = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 24:
                    this.zzfk = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 32:
                    this.zzfl = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 40:
                    this.zzfm = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 48:
                    this.zzfn = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 56:
                    zzfjjVar.getPosition();
                    this.zzfo = Integer.valueOf(zzay.zzd(zzfjjVar.zzcwi()));
                    break;
                case 64:
                    this.zzfp = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 72:
                    this.zzfq = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 80:
                    this.zzfr = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 88:
                    int position = zzfjjVar.getPosition();
                    try {
                        this.zzfs = Integer.valueOf(zzay.zzd(zzfjjVar.zzcwi()));
                        break;
                    } catch (IllegalArgumentException unused) {
                        zzfjjVar.zzmg(position);
                        zza(zzfjjVar, zzcvt);
                        break;
                    }
                case 96:
                    this.zzft = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 104:
                    this.zzfu = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 112:
                    this.zzfv = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 120:
                    this.zzfw = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case NotificationCompat.FLAG_HIGH_PRIORITY /* 128 */:
                    this.zzfx = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 136:
                    this.zzfy = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 144:
                    this.zzfz = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 152:
                    this.zzga = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 160:
                    this.zzgb = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                case 168:
                    this.zzgc = Long.valueOf(zzfjjVar.zzcwn());
                    break;
                default:
                    if (!super.zza(zzfjjVar, zzcvt)) {
                        return this;
                    }
                    break;
            }
        }
    }

    public static zzba[] zzr() {
        if (zzfj == null) {
            synchronized (zzfjq.zzpnk) {
                if (zzfj == null) {
                    zzfj = new zzba[0];
                }
            }
        }
        return zzfj;
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        Long l = this.zzdn;
        if (l != null) {
            zzfjkVar.zzf(1, l.longValue());
        }
        Long l2 = this.zzdo;
        if (l2 != null) {
            zzfjkVar.zzf(2, l2.longValue());
        }
        Long l3 = this.zzfk;
        if (l3 != null) {
            zzfjkVar.zzf(3, l3.longValue());
        }
        Long l4 = this.zzfl;
        if (l4 != null) {
            zzfjkVar.zzf(4, l4.longValue());
        }
        Long l5 = this.zzfm;
        if (l5 != null) {
            zzfjkVar.zzf(5, l5.longValue());
        }
        Long l6 = this.zzfn;
        if (l6 != null) {
            zzfjkVar.zzf(6, l6.longValue());
        }
        Integer num = this.zzfo;
        if (num != null) {
            zzfjkVar.zzaa(7, num.intValue());
        }
        Long l7 = this.zzfp;
        if (l7 != null) {
            zzfjkVar.zzf(8, l7.longValue());
        }
        Long l8 = this.zzfq;
        if (l8 != null) {
            zzfjkVar.zzf(9, l8.longValue());
        }
        Long l9 = this.zzfr;
        if (l9 != null) {
            zzfjkVar.zzf(10, l9.longValue());
        }
        Integer num2 = this.zzfs;
        if (num2 != null) {
            zzfjkVar.zzaa(11, num2.intValue());
        }
        Long l10 = this.zzft;
        if (l10 != null) {
            zzfjkVar.zzf(12, l10.longValue());
        }
        Long l11 = this.zzfu;
        if (l11 != null) {
            zzfjkVar.zzf(13, l11.longValue());
        }
        Long l12 = this.zzfv;
        if (l12 != null) {
            zzfjkVar.zzf(14, l12.longValue());
        }
        Long l13 = this.zzfw;
        if (l13 != null) {
            zzfjkVar.zzf(15, l13.longValue());
        }
        Long l14 = this.zzfx;
        if (l14 != null) {
            zzfjkVar.zzf(16, l14.longValue());
        }
        Long l15 = this.zzfy;
        if (l15 != null) {
            zzfjkVar.zzf(17, l15.longValue());
        }
        Long l16 = this.zzfz;
        if (l16 != null) {
            zzfjkVar.zzf(18, l16.longValue());
        }
        Long l17 = this.zzga;
        if (l17 != null) {
            zzfjkVar.zzf(19, l17.longValue());
        }
        Long l18 = this.zzgb;
        if (l18 != null) {
            zzfjkVar.zzf(20, l18.longValue());
        }
        Long l19 = this.zzgc;
        if (l19 != null) {
            zzfjkVar.zzf(21, l19.longValue());
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        Long l = this.zzdn;
        if (l != null) {
            zzq = C2098.m4177(l, 1, zzq);
        }
        Long l2 = this.zzdo;
        if (l2 != null) {
            zzq = C2098.m4177(l2, 2, zzq);
        }
        Long l3 = this.zzfk;
        if (l3 != null) {
            zzq = C2098.m4177(l3, 3, zzq);
        }
        Long l4 = this.zzfl;
        if (l4 != null) {
            zzq = C2098.m4177(l4, 4, zzq);
        }
        Long l5 = this.zzfm;
        if (l5 != null) {
            zzq = C2098.m4177(l5, 5, zzq);
        }
        Long l6 = this.zzfn;
        if (l6 != null) {
            zzq = C2098.m4177(l6, 6, zzq);
        }
        Integer num = this.zzfo;
        if (num != null) {
            zzq = C2098.m4200(num, 7, zzq);
        }
        Long l7 = this.zzfp;
        if (l7 != null) {
            zzq = C2098.m4177(l7, 8, zzq);
        }
        Long l8 = this.zzfq;
        if (l8 != null) {
            zzq = C2098.m4177(l8, 9, zzq);
        }
        Long l9 = this.zzfr;
        if (l9 != null) {
            zzq = C2098.m4177(l9, 10, zzq);
        }
        Integer num2 = this.zzfs;
        if (num2 != null) {
            zzq = C2098.m4200(num2, 11, zzq);
        }
        Long l10 = this.zzft;
        if (l10 != null) {
            zzq = C2098.m4177(l10, 12, zzq);
        }
        Long l11 = this.zzfu;
        if (l11 != null) {
            zzq = C2098.m4177(l11, 13, zzq);
        }
        Long l12 = this.zzfv;
        if (l12 != null) {
            zzq = C2098.m4177(l12, 14, zzq);
        }
        Long l13 = this.zzfw;
        if (l13 != null) {
            zzq = C2098.m4177(l13, 15, zzq);
        }
        Long l14 = this.zzfx;
        if (l14 != null) {
            zzq = C2098.m4177(l14, 16, zzq);
        }
        Long l15 = this.zzfy;
        if (l15 != null) {
            zzq = C2098.m4177(l15, 17, zzq);
        }
        Long l16 = this.zzfz;
        if (l16 != null) {
            zzq = C2098.m4177(l16, 18, zzq);
        }
        Long l17 = this.zzga;
        if (l17 != null) {
            zzq = C2098.m4177(l17, 19, zzq);
        }
        Long l18 = this.zzgb;
        if (l18 != null) {
            zzq = C2098.m4177(l18, 20, zzq);
        }
        Long l19 = this.zzgc;
        return l19 != null ? C2098.m4177(l19, 21, zzq) : zzq;
    }
}
