package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsg;
import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdsk extends zzffu<zzdsk, zza> implements zzfhg {
    private static volatile zzfhk<zzdsk> zzbbk;
    private static final zzdsk zzlvb;
    private int zzltn;
    private zzdsg zzlur;
    private zzfes zzluz;
    private zzfes zzlva;

    public static final class zza extends zzffu.zza<zzdsk, zza> implements zzfhg {
        private zza() {
            super(zzdsk.zzlvb);
        }

        public /* synthetic */ zza(zzdsl zzdslVar) {
            this();
        }

        public final zza zzac(zzfes zzfesVar) {
            zzcxr();
            ((zzdsk) this.zzpgv).zzz(zzfesVar);
            return this;
        }

        public final zza zzad(zzfes zzfesVar) {
            zzcxr();
            ((zzdsk) this.zzpgv).zzaa(zzfesVar);
            return this;
        }

        public final zza zzc(zzdsg zzdsgVar) {
            zzcxr();
            ((zzdsk) this.zzpgv).zzb(zzdsgVar);
            return this;
        }

        public final zza zzfp(int i) {
            zzcxr();
            ((zzdsk) this.zzpgv).setVersion(0);
            return this;
        }
    }

    static {
        zzdsk zzdskVar = new zzdsk();
        zzlvb = zzdskVar;
        zzdskVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdskVar.zzpgr.zzbiy();
    }

    private zzdsk() {
        zzfes zzfesVar = zzfes.zzpfg;
        this.zzluz = zzfesVar;
        this.zzlva = zzfesVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzltn = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaa(zzfes zzfesVar) {
        zzfesVar.getClass();
        this.zzlva = zzfesVar;
    }

    public static zzdsk zzab(zzfes zzfesVar) {
        return (zzdsk) zzffu.zza(zzlvb, zzfesVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzdsg zzdsgVar) {
        zzdsgVar.getClass();
        this.zzlur = zzdsgVar;
    }

    public static zza zzbnv() {
        zzdsk zzdskVar = zzlvb;
        zzffu.zza zzaVar = (zzffu.zza) zzdskVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
        zzaVar.zza((zzffu.zza) zzdskVar);
        return (zza) zzaVar;
    }

    public static zzdsk zzbnw() {
        return zzlvb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzz(zzfes zzfesVar) {
        zzfesVar.getClass();
        this.zzluz = zzfesVar;
    }

    public final int getVersion() {
        return this.zzltn;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdsg.zza zzaVar;
        zzdsl zzdslVar = null;
        boolean z = false;
        switch (zzdsl.zzbbi[i - 1]) {
            case 1:
                return new zzdsk();
            case 2:
                return zzlvb;
            case 3:
                return null;
            case 4:
                return new zza(zzdslVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdsk zzdskVar = (zzdsk) obj2;
                int i2 = this.zzltn;
                boolean z2 = i2 != 0;
                int i3 = zzdskVar.zzltn;
                this.zzltn = zzhVar.zza(z2, i2, i3 != 0, i3);
                this.zzlur = (zzdsg) zzhVar.zza(this.zzlur, zzdskVar.zzlur);
                zzfes zzfesVar = this.zzluz;
                zzfes zzfesVar2 = zzfes.zzpfg;
                boolean z3 = zzfesVar != zzfesVar2;
                zzfes zzfesVar3 = zzdskVar.zzluz;
                this.zzluz = zzhVar.zza(z3, zzfesVar, zzfesVar3 != zzfesVar2, zzfesVar3);
                zzfes zzfesVar4 = this.zzlva;
                boolean z4 = zzfesVar4 != zzfesVar2;
                zzfes zzfesVar5 = zzdskVar.zzlva;
                this.zzlva = zzhVar.zza(z4, zzfesVar4, zzfesVar5 != zzfesVar2, zzfesVar5);
                return this;
            case 6:
                zzffb zzffbVar = (zzffb) obj;
                zzffm zzffmVar = (zzffm) obj2;
                zzffmVar.getClass();
                while (!z) {
                    try {
                        int zzcvt = zzffbVar.zzcvt();
                        if (zzcvt != 0) {
                            if (zzcvt == 8) {
                                this.zzltn = zzffbVar.zzcwc();
                            } else if (zzcvt == 18) {
                                zzdsg zzdsgVar = this.zzlur;
                                if (zzdsgVar != null) {
                                    zzffu.zza zzaVar2 = (zzffu.zza) zzdsgVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
                                    zzaVar2.zza((zzffu.zza) zzdsgVar);
                                    zzaVar = (zzdsg.zza) zzaVar2;
                                } else {
                                    zzaVar = null;
                                }
                                zzdsg zzdsgVar2 = (zzdsg) zzffbVar.zza((zzffb) zzdsg.zzbno(), zzffmVar);
                                this.zzlur = zzdsgVar2;
                                if (zzaVar != null) {
                                    zzaVar.zza((zzdsg.zza) zzdsgVar2);
                                    this.zzlur = zzaVar.zzcxs();
                                }
                            } else if (zzcvt == 26) {
                                this.zzluz = zzffbVar.zzcwb();
                            } else if (zzcvt == 34) {
                                this.zzlva = zzffbVar.zzcwb();
                            } else if (!zza(zzcvt, zzffbVar)) {
                            }
                        }
                        z = true;
                    } catch (zzfge e) {
                        throw new RuntimeException(e.zzi(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new zzfge(e2.getMessage()).zzi(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (zzbbk == null) {
                    synchronized (zzdsk.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlvb);
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
        return zzlvb;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        int i = this.zzltn;
        if (i != 0) {
            zzffgVar.zzab(1, i);
        }
        zzdsg zzdsgVar = this.zzlur;
        if (zzdsgVar != null) {
            if (zzdsgVar == null) {
                zzdsgVar = zzdsg.zzbno();
            }
            zzffgVar.zza(2, zzdsgVar);
        }
        if (!this.zzluz.isEmpty()) {
            zzffgVar.zza(3, this.zzluz);
        }
        if (!this.zzlva.isEmpty()) {
            zzffgVar.zza(4, this.zzlva);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final zzdsg zzbnj() {
        zzdsg zzdsgVar = this.zzlur;
        return zzdsgVar == null ? zzdsg.zzbno() : zzdsgVar;
    }

    public final zzfes zzbnt() {
        return this.zzluz;
    }

    public final zzfes zzbnu() {
        return this.zzlva;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int i2 = this.zzltn;
        int zzae = i2 != 0 ? 0 + zzffg.zzae(1, i2) : 0;
        zzdsg zzdsgVar = this.zzlur;
        if (zzdsgVar != null) {
            if (zzdsgVar == null) {
                zzdsgVar = zzdsg.zzbno();
            }
            zzae += zzffg.zzc(2, zzdsgVar);
        }
        if (!this.zzluz.isEmpty()) {
            zzae += zzffg.zzc(3, this.zzluz);
        }
        if (!this.zzlva.isEmpty()) {
            zzae += zzffg.zzc(4, this.zzlva);
        }
        int zzho = this.zzpgr.zzho() + zzae;
        this.zzpgs = zzho;
        return zzho;
    }
}
