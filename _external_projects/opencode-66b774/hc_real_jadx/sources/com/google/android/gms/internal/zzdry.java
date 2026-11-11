package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdry extends zzffu<zzdry, zza> implements zzfhg {
    private static volatile zzfhk<zzdry> zzbbk;
    private static final zzdry zzluj;
    private int zzltn;
    private zzfes zzltv = zzfes.zzpfg;

    public static final class zza extends zzffu.zza<zzdry, zza> implements zzfhg {
        private zza() {
            super(zzdry.zzluj);
        }

        public /* synthetic */ zza(zzdrz zzdrzVar) {
            this();
        }

        public final zza zzfm(int i) {
            zzcxr();
            ((zzdry) this.zzpgv).setVersion(0);
            return this;
        }

        public final zza zzv(zzfes zzfesVar) {
            zzcxr();
            ((zzdry) this.zzpgv).zzk(zzfesVar);
            return this;
        }
    }

    static {
        zzdry zzdryVar = new zzdry();
        zzluj = zzdryVar;
        zzdryVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdryVar.zzpgr.zzbiy();
    }

    private zzdry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzltn = i;
    }

    public static zza zzbne() {
        zzdry zzdryVar = zzluj;
        zzffu.zza zzaVar = (zzffu.zza) zzdryVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
        zzaVar.zza((zzffu.zza) zzdryVar);
        return (zza) zzaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(zzfes zzfesVar) {
        zzfesVar.getClass();
        this.zzltv = zzfesVar;
    }

    public static zzdry zzu(zzfes zzfesVar) {
        return (zzdry) zzffu.zza(zzluj, zzfesVar);
    }

    public final int getVersion() {
        return this.zzltn;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdrz zzdrzVar = null;
        boolean z = false;
        switch (zzdrz.zzbbi[i - 1]) {
            case 1:
                return new zzdry();
            case 2:
                return zzluj;
            case 3:
                return null;
            case 4:
                return new zza(zzdrzVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdry zzdryVar = (zzdry) obj2;
                int i2 = this.zzltn;
                boolean z2 = i2 != 0;
                int i3 = zzdryVar.zzltn;
                this.zzltn = zzhVar.zza(z2, i2, i3 != 0, i3);
                zzfes zzfesVar = this.zzltv;
                zzfes zzfesVar2 = zzfes.zzpfg;
                boolean z3 = zzfesVar != zzfesVar2;
                zzfes zzfesVar3 = zzdryVar.zzltv;
                this.zzltv = zzhVar.zza(z3, zzfesVar, zzfesVar3 != zzfesVar2, zzfesVar3);
                return this;
            case 6:
                zzffb zzffbVar = (zzffb) obj;
                ((zzffm) obj2).getClass();
                while (!z) {
                    try {
                        try {
                            int zzcvt = zzffbVar.zzcvt();
                            if (zzcvt != 0) {
                                if (zzcvt == 8) {
                                    this.zzltn = zzffbVar.zzcwc();
                                } else if (zzcvt == 18) {
                                    this.zzltv = zzffbVar.zzcwb();
                                } else if (!zza(zzcvt, zzffbVar)) {
                                }
                            }
                            z = true;
                        } catch (zzfge e) {
                            throw new RuntimeException(e.zzi(this));
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(new zzfge(e2.getMessage()).zzi(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (zzbbk == null) {
                    synchronized (zzdry.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzluj);
                        }
                    }
                }
                return zzbbk;
            case 9:
                return (byte) 1;
            case 10:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
        return zzluj;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        int i = this.zzltn;
        if (i != 0) {
            zzffgVar.zzab(1, i);
        }
        if (!this.zzltv.isEmpty()) {
            zzffgVar.zza(2, this.zzltv);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final zzfes zzbmj() {
        return this.zzltv;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int i2 = this.zzltn;
        int zzae = i2 != 0 ? 0 + zzffg.zzae(1, i2) : 0;
        if (!this.zzltv.isEmpty()) {
            zzae += zzffg.zzc(2, this.zzltv);
        }
        int zzho = this.zzpgr.zzho() + zzae;
        this.zzpgs = zzho;
        return zzho;
    }
}
