package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsc;
import com.google.android.gms.internal.zzdsm;
import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdsg extends zzffu<zzdsg, zza> implements zzfhg {
    private static volatile zzfhk<zzdsg> zzbbk;
    private static final zzdsg zzluw;
    private zzdsm zzlut;
    private zzdsc zzluu;
    private int zzluv;

    public static final class zza extends zzffu.zza<zzdsg, zza> implements zzfhg {
        private zza() {
            super(zzdsg.zzluw);
        }

        public /* synthetic */ zza(zzdsh zzdshVar) {
            this();
        }
    }

    static {
        zzdsg zzdsgVar = new zzdsg();
        zzluw = zzdsgVar;
        zzdsgVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdsgVar.zzpgr.zzbiy();
    }

    private zzdsg() {
    }

    public static zzdsg zzbno() {
        return zzluw;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdsc.zza zzaVar;
        zzdsm.zza zzaVar2;
        boolean z = false;
        zzdsh zzdshVar = null;
        switch (zzdsh.zzbbi[i - 1]) {
            case 1:
                return new zzdsg();
            case 2:
                return zzluw;
            case 3:
                return null;
            case 4:
                return new zza(zzdshVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdsg zzdsgVar = (zzdsg) obj2;
                this.zzlut = (zzdsm) zzhVar.zza(this.zzlut, zzdsgVar.zzlut);
                this.zzluu = (zzdsc) zzhVar.zza(this.zzluu, zzdsgVar.zzluu);
                int i2 = this.zzluv;
                boolean z2 = i2 != 0;
                int i3 = zzdsgVar.zzluv;
                this.zzluv = zzhVar.zza(z2, i2, i3 != 0, i3);
                return this;
            case 6:
                zzffb zzffbVar = (zzffb) obj;
                zzffm zzffmVar = (zzffm) obj2;
                zzffmVar.getClass();
                while (!z) {
                    try {
                        int zzcvt = zzffbVar.zzcvt();
                        if (zzcvt != 0) {
                            if (zzcvt == 10) {
                                zzdsm zzdsmVar = this.zzlut;
                                if (zzdsmVar != null) {
                                    zzffu.zza zzaVar3 = (zzffu.zza) zzdsmVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
                                    zzaVar3.zza((zzffu.zza) zzdsmVar);
                                    zzaVar2 = (zzdsm.zza) zzaVar3;
                                } else {
                                    zzaVar2 = null;
                                }
                                zzdsm zzdsmVar2 = (zzdsm) zzffbVar.zza((zzffb) zzdsm.zzbob(), zzffmVar);
                                this.zzlut = zzdsmVar2;
                                if (zzaVar2 != null) {
                                    zzaVar2.zza((zzdsm.zza) zzdsmVar2);
                                    this.zzlut = zzaVar2.zzcxs();
                                }
                            } else if (zzcvt == 18) {
                                zzdsc zzdscVar = this.zzluu;
                                if (zzdscVar != null) {
                                    zzffu.zza zzaVar4 = (zzffu.zza) zzdscVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
                                    zzaVar4.zza((zzffu.zza) zzdscVar);
                                    zzaVar = (zzdsc.zza) zzaVar4;
                                } else {
                                    zzaVar = null;
                                }
                                zzdsc zzdscVar2 = (zzdsc) zzffbVar.zza((zzffb) zzdsc.zzbnh(), zzffmVar);
                                this.zzluu = zzdscVar2;
                                if (zzaVar != null) {
                                    zzaVar.zza((zzdsc.zza) zzdscVar2);
                                    this.zzluu = zzaVar.zzcxs();
                                }
                            } else if (zzcvt == 24) {
                                this.zzluv = zzffbVar.zzcwd();
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
                    synchronized (zzdsg.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzluw);
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
        return zzluw;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        zzdsm zzdsmVar = this.zzlut;
        if (zzdsmVar != null) {
            if (zzdsmVar == null) {
                zzdsmVar = zzdsm.zzbob();
            }
            zzffgVar.zza(1, zzdsmVar);
        }
        zzdsc zzdscVar = this.zzluu;
        if (zzdscVar != null) {
            if (zzdscVar == null) {
                zzdscVar = zzdsc.zzbnh();
            }
            zzffgVar.zza(2, zzdscVar);
        }
        if (this.zzluv != zzdsa.UNKNOWN_FORMAT.zzhq()) {
            zzffgVar.zzaa(3, this.zzluv);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final zzdsm zzbnl() {
        zzdsm zzdsmVar = this.zzlut;
        return zzdsmVar == null ? zzdsm.zzbob() : zzdsmVar;
    }

    public final zzdsc zzbnm() {
        zzdsc zzdscVar = this.zzluu;
        return zzdscVar == null ? zzdsc.zzbnh() : zzdscVar;
    }

    public final zzdsa zzbnn() {
        zzdsa zzfn = zzdsa.zzfn(this.zzluv);
        return zzfn == null ? zzdsa.UNRECOGNIZED : zzfn;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        zzdsm zzdsmVar = this.zzlut;
        int i2 = 0;
        if (zzdsmVar != null) {
            if (zzdsmVar == null) {
                zzdsmVar = zzdsm.zzbob();
            }
            i2 = 0 + zzffg.zzc(1, zzdsmVar);
        }
        zzdsc zzdscVar = this.zzluu;
        if (zzdscVar != null) {
            if (zzdscVar == null) {
                zzdscVar = zzdsc.zzbnh();
            }
            i2 += zzffg.zzc(2, zzdscVar);
        }
        if (this.zzluv != zzdsa.UNKNOWN_FORMAT.zzhq()) {
            i2 += zzffg.zzag(3, this.zzluv);
        }
        int zzho = this.zzpgr.zzho() + i2;
        this.zzpgs = zzho;
        return zzho;
    }
}
