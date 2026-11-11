package com.google.android.gms.internal;

import p131.p155.p156.p157.C2098;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzbf extends zzfjm<zzbf> {
    private Integer zzgr;
    public Integer zzgs;
    public byte[][] zzgq = zzfjv.zzpnu;
    public byte[] zzgl = null;

    public zzbf() {
        this.zzpfd = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.zzfjs
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzbf zza(zzfjj zzfjjVar) {
        while (true) {
            int zzcvt = zzfjjVar.zzcvt();
            if (zzcvt == 0) {
                return this;
            }
            if (zzcvt == 10) {
                int zzb = zzfjv.zzb(zzfjjVar, 10);
                byte[][] bArr = this.zzgq;
                int length = bArr == null ? 0 : bArr.length;
                int i = zzb + length;
                byte[][] bArr2 = new byte[i][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i - 1) {
                    bArr2[length] = zzfjjVar.readBytes();
                    zzfjjVar.zzcvt();
                    length++;
                }
                bArr2[length] = zzfjjVar.readBytes();
                this.zzgq = bArr2;
            } else if (zzcvt == 18) {
                this.zzgl = zzfjjVar.readBytes();
            } else if (zzcvt == 24) {
                zzfjjVar.getPosition();
                int zzcwi = zzfjjVar.zzcwi();
                if (zzcwi != 0 && zzcwi != 1) {
                    StringBuilder sb = new StringBuilder(41);
                    sb.append(zzcwi);
                    sb.append(" is not a valid enum ProtoName");
                    throw new IllegalArgumentException(sb.toString());
                }
                this.zzgr = Integer.valueOf(zzcwi);
            } else if (zzcvt == 32) {
                try {
                    int zzcwi2 = zzfjjVar.zzcwi();
                    if (zzcwi2 != 0 && zzcwi2 != 1 && zzcwi2 != 2) {
                        StringBuilder sb2 = new StringBuilder(48);
                        sb2.append(zzcwi2);
                        sb2.append(" is not a valid enum EncryptionMethod");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.zzgs = Integer.valueOf(zzcwi2);
                } catch (IllegalArgumentException unused) {
                    zzfjjVar.zzmg(zzfjjVar.getPosition());
                    zza(zzfjjVar, zzcvt);
                }
            } else if (!super.zza(zzfjjVar, zzcvt)) {
                return this;
            }
        }
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final void zza(zzfjk zzfjkVar) {
        byte[][] bArr = this.zzgq;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.zzgq;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    zzfjkVar.zzc(1, bArr3);
                }
                i++;
            }
        }
        byte[] bArr4 = this.zzgl;
        if (bArr4 != null) {
            zzfjkVar.zzc(2, bArr4);
        }
        Integer num = this.zzgr;
        if (num != null) {
            zzfjkVar.zzaa(3, num.intValue());
        }
        Integer num2 = this.zzgs;
        if (num2 != null) {
            zzfjkVar.zzaa(4, num2.intValue());
        }
        super.zza(zzfjkVar);
    }

    @Override // com.google.android.gms.internal.zzfjm, com.google.android.gms.internal.zzfjs
    public final int zzq() {
        int zzq = super.zzq();
        byte[][] bArr = this.zzgq;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                byte[][] bArr2 = this.zzgq;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i3++;
                    i2 = zzfjk.zzbg(bArr3) + i2;
                }
                i++;
            }
            zzq = zzq + i2 + (i3 * 1);
        }
        byte[] bArr4 = this.zzgl;
        if (bArr4 != null) {
            zzq += zzfjk.zzd(2, bArr4);
        }
        Integer num = this.zzgr;
        if (num != null) {
            zzq = C2098.m4200(num, 3, zzq);
        }
        Integer num2 = this.zzgs;
        return num2 != null ? C2098.m4200(num2, 4, zzq) : zzq;
    }
}
