package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrk;
import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdrg extends zzffu<zzdrg, zza> implements zzfhg {
    private static volatile zzfhk<zzdrg> zzbbk;
    private static final zzdrg zzltw;
    private int zzltn;
    private zzdrk zzltu;
    private zzfes zzltv = zzfes.zzpfg;

    public static final class zza extends zzffu.zza<zzdrg, zza> implements zzfhg {
        private zza() {
            super(zzdrg.zzltw);
        }

        public /* synthetic */ zza(zzdrh zzdrhVar) {
            this();
        }

        public final zza zzc(zzdrk zzdrkVar) {
            zzcxr();
            ((zzdrg) this.zzpgv).zzb(zzdrkVar);
            return this;
        }

        public final zza zzfj(int i) {
            zzcxr();
            ((zzdrg) this.zzpgv).setVersion(0);
            return this;
        }

        public final zza zzm(zzfes zzfesVar) {
            zzcxr();
            ((zzdrg) this.zzpgv).zzk(zzfesVar);
            return this;
        }
    }

    static {
        zzdrg zzdrgVar = new zzdrg();
        zzltw = zzdrgVar;
        zzdrgVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdrgVar.zzpgr.zzbiy();
    }

    private zzdrg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzltn = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(zzdrk zzdrkVar) {
        zzdrkVar.getClass();
        this.zzltu = zzdrkVar;
    }

    public static zza zzbmk() {
        zzdrg zzdrgVar = zzltw;
        zzffu.zza zzaVar = (zzffu.zza) zzdrgVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
        zzaVar.zza((zzffu.zza) zzdrgVar);
        return (zza) zzaVar;
    }

    public static zzdrg zzbml() {
        return zzltw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(zzfes zzfesVar) {
        zzfesVar.getClass();
        this.zzltv = zzfesVar;
    }

    public static zzdrg zzl(zzfes zzfesVar) {
        return (zzdrg) zzffu.zza(zzltw, zzfesVar);
    }

    public final int getVersion() {
        return this.zzltn;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdrk.zza zzaVar;
        boolean z = false;
        zzdrh zzdrhVar = null;
        switch (zzdrh.zzbbi[i - 1]) {
            case 1:
                return new zzdrg();
            case 2:
                return zzltw;
            case 3:
                return null;
            case 4:
                return new zza(zzdrhVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdrg zzdrgVar = (zzdrg) obj2;
                int i2 = this.zzltn;
                boolean z2 = i2 != 0;
                int i3 = zzdrgVar.zzltn;
                this.zzltn = zzhVar.zza(z2, i2, i3 != 0, i3);
                this.zzltu = (zzdrk) zzhVar.zza(this.zzltu, zzdrgVar.zzltu);
                zzfes zzfesVar = this.zzltv;
                zzfes zzfesVar2 = zzfes.zzpfg;
                boolean z3 = zzfesVar != zzfesVar2;
                zzfes zzfesVar3 = zzdrgVar.zzltv;
                this.zzltv = zzhVar.zza(z3, zzfesVar, zzfesVar3 != zzfesVar2, zzfesVar3);
                return this;
            case 6:
                zzffb zzffbVar = (zzffb) obj;
                zzffm zzffmVar = (zzffm) obj2;
                zzffmVar.getClass();
                while (!z) {
                    try {
                        try {
                            int zzcvt = zzffbVar.zzcvt();
                            if (zzcvt != 0) {
                                if (zzcvt == 8) {
                                    this.zzltn = zzffbVar.zzcwc();
                                } else if (zzcvt == 18) {
                                    zzdrk zzdrkVar = this.zzltu;
                                    if (zzdrkVar != null) {
                                        zzffu.zza zzaVar2 = (zzffu.zza) zzdrkVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
                                        zzaVar2.zza((zzffu.zza) zzdrkVar);
                                        zzaVar = (zzdrk.zza) zzaVar2;
                                    } else {
                                        zzaVar = null;
                                    }
                                    zzdrk zzdrkVar2 = (zzdrk) zzffbVar.zza((zzffb) zzdrk.zzbmq(), zzffmVar);
                                    this.zzltu = zzdrkVar2;
                                    if (zzaVar != null) {
                                        zzaVar.zza((zzdrk.zza) zzdrkVar2);
                                        this.zzltu = zzaVar.zzcxs();
                                    }
                                } else if (zzcvt == 26) {
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
                    synchronized (zzdrg.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzltw);
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
        return zzltw;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        int i = this.zzltn;
        if (i != 0) {
            zzffgVar.zzab(1, i);
        }
        zzdrk zzdrkVar = this.zzltu;
        if (zzdrkVar != null) {
            if (zzdrkVar == null) {
                zzdrkVar = zzdrk.zzbmq();
            }
            zzffgVar.zza(2, zzdrkVar);
        }
        if (!this.zzltv.isEmpty()) {
            zzffgVar.zza(3, this.zzltv);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final zzdrk zzbmi() {
        zzdrk zzdrkVar = this.zzltu;
        return zzdrkVar == null ? zzdrk.zzbmq() : zzdrkVar;
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
        zzdrk zzdrkVar = this.zzltu;
        if (zzdrkVar != null) {
            if (zzdrkVar == null) {
                zzdrkVar = zzdrk.zzbmq();
            }
            zzae += zzffg.zzc(2, zzdrkVar);
        }
        if (!this.zzltv.isEmpty()) {
            zzae += zzffg.zzc(3, this.zzltv);
        }
        int zzho = this.zzpgr.zzho() + zzae;
        this.zzpgs = zzho;
        return zzho;
    }
}
