package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrk;
import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdri extends zzffu<zzdri, zza> implements zzfhg {
    private static volatile zzfhk<zzdri> zzbbk;
    private static final zzdri zzlty;
    private zzdrk zzltu;
    private int zzltx;

    public static final class zza extends zzffu.zza<zzdri, zza> implements zzfhg {
        private zza() {
            super(zzdri.zzlty);
        }

        public /* synthetic */ zza(zzdrj zzdrjVar) {
            this();
        }
    }

    static {
        zzdri zzdriVar = new zzdri();
        zzlty = zzdriVar;
        zzdriVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdriVar.zzpgr.zzbiy();
    }

    private zzdri() {
    }

    public static zzdri zzbmn() {
        return zzlty;
    }

    public static zzdri zzn(zzfes zzfesVar) {
        return (zzdri) zzffu.zza(zzlty, zzfesVar);
    }

    public final int getKeySize() {
        return this.zzltx;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdrk.zza zzaVar;
        boolean z = false;
        zzdrj zzdrjVar = null;
        switch (zzdrj.zzbbi[i - 1]) {
            case 1:
                return new zzdri();
            case 2:
                return zzlty;
            case 3:
                return null;
            case 4:
                return new zza(zzdrjVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdri zzdriVar = (zzdri) obj2;
                this.zzltu = (zzdrk) zzhVar.zza(this.zzltu, zzdriVar.zzltu);
                int i2 = this.zzltx;
                boolean z2 = i2 != 0;
                int i3 = zzdriVar.zzltx;
                this.zzltx = zzhVar.zza(z2, i2, i3 != 0, i3);
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
                            } else if (zzcvt == 16) {
                                this.zzltx = zzffbVar.zzcwc();
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
                    synchronized (zzdri.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlty);
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
        return zzlty;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        zzdrk zzdrkVar = this.zzltu;
        if (zzdrkVar != null) {
            if (zzdrkVar == null) {
                zzdrkVar = zzdrk.zzbmq();
            }
            zzffgVar.zza(1, zzdrkVar);
        }
        int i = this.zzltx;
        if (i != 0) {
            zzffgVar.zzab(2, i);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final zzdrk zzbmi() {
        zzdrk zzdrkVar = this.zzltu;
        return zzdrkVar == null ? zzdrk.zzbmq() : zzdrkVar;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        zzdrk zzdrkVar = this.zzltu;
        int i2 = 0;
        if (zzdrkVar != null) {
            if (zzdrkVar == null) {
                zzdrkVar = zzdrk.zzbmq();
            }
            i2 = 0 + zzffg.zzc(1, zzdrkVar);
        }
        int i3 = this.zzltx;
        if (i3 != 0) {
            i2 += zzffg.zzae(2, i3);
        }
        int zzho = this.zzpgr.zzho() + i2;
        this.zzpgs = zzho;
        return zzho;
    }
}
