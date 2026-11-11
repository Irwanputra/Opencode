package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdtd extends zzffu<zzdtd, zza> implements zzfhg {
    private static volatile zzfhk<zzdtd> zzbbk;
    private static final zzdtd zzlws;
    private String zzlwa = "";
    private zzfes zzlwb = zzfes.zzpfg;
    private int zzlwr;

    public static final class zza extends zzffu.zza<zzdtd, zza> implements zzfhg {
        private zza() {
            super(zzdtd.zzlws);
        }

        public /* synthetic */ zza(zzdte zzdteVar) {
            this();
        }
    }

    static {
        zzdtd zzdtdVar = new zzdtd();
        zzlws = zzdtdVar;
        zzdtdVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdtdVar.zzpgr.zzbiy();
    }

    private zzdtd() {
    }

    public static zzdtd zzbot() {
        return zzlws;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdte zzdteVar = null;
        boolean z = false;
        switch (zzdte.zzbbi[i - 1]) {
            case 1:
                return new zzdtd();
            case 2:
                return zzlws;
            case 3:
                return null;
            case 4:
                return new zza(zzdteVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdtd zzdtdVar = (zzdtd) obj2;
                this.zzlwa = zzhVar.zza(!this.zzlwa.isEmpty(), this.zzlwa, !zzdtdVar.zzlwa.isEmpty(), zzdtdVar.zzlwa);
                zzfes zzfesVar = this.zzlwb;
                zzfes zzfesVar2 = zzfes.zzpfg;
                boolean z2 = zzfesVar != zzfesVar2;
                zzfes zzfesVar3 = zzdtdVar.zzlwb;
                this.zzlwb = zzhVar.zza(z2, zzfesVar, zzfesVar3 != zzfesVar2, zzfesVar3);
                int i2 = this.zzlwr;
                boolean z3 = i2 != 0;
                int i3 = zzdtdVar.zzlwr;
                this.zzlwr = zzhVar.zza(z3, i2, i3 != 0, i3);
                return this;
            case 6:
                zzffb zzffbVar = (zzffb) obj;
                ((zzffm) obj2).getClass();
                while (!z) {
                    try {
                        int zzcvt = zzffbVar.zzcvt();
                        if (zzcvt != 0) {
                            if (zzcvt == 10) {
                                this.zzlwa = zzffbVar.zzcwa();
                            } else if (zzcvt == 18) {
                                this.zzlwb = zzffbVar.zzcwb();
                            } else if (zzcvt == 24) {
                                this.zzlwr = zzffbVar.zzcwd();
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
                    synchronized (zzdtd.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlws);
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
        return zzlws;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        if (!this.zzlwa.isEmpty()) {
            zzffgVar.zzn(1, this.zzlwa);
        }
        if (!this.zzlwb.isEmpty()) {
            zzffgVar.zza(2, this.zzlwb);
        }
        if (this.zzlwr != zzdtt.UNKNOWN_PREFIX.zzhq()) {
            zzffgVar.zzaa(3, this.zzlwr);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final String zzbon() {
        return this.zzlwa;
    }

    public final zzfes zzboo() {
        return this.zzlwb;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int zzo = this.zzlwa.isEmpty() ? 0 : 0 + zzffg.zzo(1, this.zzlwa);
        if (!this.zzlwb.isEmpty()) {
            zzo += zzffg.zzc(2, this.zzlwb);
        }
        if (this.zzlwr != zzdtt.UNKNOWN_PREFIX.zzhq()) {
            zzo += zzffg.zzag(3, this.zzlwr);
        }
        int zzho = this.zzpgr.zzho() + zzo;
        this.zzpgs = zzho;
        return zzho;
    }
}
