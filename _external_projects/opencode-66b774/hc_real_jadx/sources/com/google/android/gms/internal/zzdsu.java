package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsw;
import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdsu extends zzffu<zzdsu, zza> implements zzfhg {
    private static volatile zzfhk<zzdsu> zzbbk;
    private static final zzdsu zzlvw;
    private int zzltx;
    private zzdsw zzlvu;

    public static final class zza extends zzffu.zza<zzdsu, zza> implements zzfhg {
        private zza() {
            super(zzdsu.zzlvw);
        }

        public /* synthetic */ zza(zzdsv zzdsvVar) {
            this();
        }
    }

    static {
        zzdsu zzdsuVar = new zzdsu();
        zzlvw = zzdsuVar;
        zzdsuVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdsuVar.zzpgr.zzbiy();
    }

    private zzdsu() {
    }

    public static zzdsu zzag(zzfes zzfesVar) {
        return (zzdsu) zzffu.zza(zzlvw, zzfesVar);
    }

    public static zzdsu zzboh() {
        return zzlvw;
    }

    public final int getKeySize() {
        return this.zzltx;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdsw.zza zzaVar;
        boolean z = false;
        zzdsv zzdsvVar = null;
        switch (zzdsv.zzbbi[i - 1]) {
            case 1:
                return new zzdsu();
            case 2:
                return zzlvw;
            case 3:
                return null;
            case 4:
                return new zza(zzdsvVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdsu zzdsuVar = (zzdsu) obj2;
                this.zzlvu = (zzdsw) zzhVar.zza(this.zzlvu, zzdsuVar.zzlvu);
                int i2 = this.zzltx;
                boolean z2 = i2 != 0;
                int i3 = zzdsuVar.zzltx;
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
                                zzdsw zzdswVar = this.zzlvu;
                                if (zzdswVar != null) {
                                    zzffu.zza zzaVar2 = (zzffu.zza) zzdswVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
                                    zzaVar2.zza((zzffu.zza) zzdswVar);
                                    zzaVar = (zzdsw.zza) zzaVar2;
                                } else {
                                    zzaVar = null;
                                }
                                zzdsw zzdswVar2 = (zzdsw) zzffbVar.zza((zzffb) zzdsw.zzbol(), zzffmVar);
                                this.zzlvu = zzdswVar2;
                                if (zzaVar != null) {
                                    zzaVar.zza((zzdsw.zza) zzdswVar2);
                                    this.zzlvu = zzaVar.zzcxs();
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
                    synchronized (zzdsu.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlvw);
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
        return zzlvw;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        zzdsw zzdswVar = this.zzlvu;
        if (zzdswVar != null) {
            if (zzdswVar == null) {
                zzdswVar = zzdsw.zzbol();
            }
            zzffgVar.zza(1, zzdswVar);
        }
        int i = this.zzltx;
        if (i != 0) {
            zzffgVar.zzab(2, i);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final zzdsw zzbod() {
        zzdsw zzdswVar = this.zzlvu;
        return zzdswVar == null ? zzdsw.zzbol() : zzdswVar;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        zzdsw zzdswVar = this.zzlvu;
        int i2 = 0;
        if (zzdswVar != null) {
            if (zzdswVar == null) {
                zzdswVar = zzdsw.zzbol();
            }
            i2 = 0 + zzffg.zzc(1, zzdswVar);
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
