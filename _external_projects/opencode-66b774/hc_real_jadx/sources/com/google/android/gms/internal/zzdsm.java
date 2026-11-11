package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdsm extends zzffu<zzdsm, zza> implements zzfhg {
    private static volatile zzfhk<zzdsm> zzbbk;
    private static final zzdsm zzlvf;
    private int zzlvc;
    private int zzlvd;
    private zzfes zzlve = zzfes.zzpfg;

    public static final class zza extends zzffu.zza<zzdsm, zza> implements zzfhg {
        private zza() {
            super(zzdsm.zzlvf);
        }

        public /* synthetic */ zza(zzdsn zzdsnVar) {
            this();
        }
    }

    static {
        zzdsm zzdsmVar = new zzdsm();
        zzlvf = zzdsmVar;
        zzdsmVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdsmVar.zzpgr.zzbiy();
    }

    private zzdsm() {
    }

    public static zzdsm zzbob() {
        return zzlvf;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdsn zzdsnVar = null;
        boolean z = false;
        switch (zzdsn.zzbbi[i - 1]) {
            case 1:
                return new zzdsm();
            case 2:
                return zzlvf;
            case 3:
                return null;
            case 4:
                return new zza(zzdsnVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdsm zzdsmVar = (zzdsm) obj2;
                int i2 = this.zzlvc;
                boolean z2 = i2 != 0;
                int i3 = zzdsmVar.zzlvc;
                this.zzlvc = zzhVar.zza(z2, i2, i3 != 0, i3);
                int i4 = this.zzlvd;
                boolean z3 = i4 != 0;
                int i5 = zzdsmVar.zzlvd;
                this.zzlvd = zzhVar.zza(z3, i4, i5 != 0, i5);
                zzfes zzfesVar = this.zzlve;
                zzfes zzfesVar2 = zzfes.zzpfg;
                boolean z4 = zzfesVar != zzfesVar2;
                zzfes zzfesVar3 = zzdsmVar.zzlve;
                this.zzlve = zzhVar.zza(z4, zzfesVar, zzfesVar3 != zzfesVar2, zzfesVar3);
                return this;
            case 6:
                zzffb zzffbVar = (zzffb) obj;
                ((zzffm) obj2).getClass();
                while (!z) {
                    try {
                        int zzcvt = zzffbVar.zzcvt();
                        if (zzcvt != 0) {
                            if (zzcvt == 8) {
                                this.zzlvc = zzffbVar.zzcwd();
                            } else if (zzcvt == 16) {
                                this.zzlvd = zzffbVar.zzcwd();
                            } else if (zzcvt == 90) {
                                this.zzlve = zzffbVar.zzcwb();
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
                    synchronized (zzdsm.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlvf);
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
        return zzlvf;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        if (this.zzlvc != zzdso.UNKNOWN_CURVE.zzhq()) {
            zzffgVar.zzaa(1, this.zzlvc);
        }
        if (this.zzlvd != zzdsq.UNKNOWN_HASH.zzhq()) {
            zzffgVar.zzaa(2, this.zzlvd);
        }
        if (!this.zzlve.isEmpty()) {
            zzffgVar.zza(11, this.zzlve);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final zzdso zzbny() {
        zzdso zzfq = zzdso.zzfq(this.zzlvc);
        return zzfq == null ? zzdso.UNRECOGNIZED : zzfq;
    }

    public final zzdsq zzbnz() {
        zzdsq zzfr = zzdsq.zzfr(this.zzlvd);
        return zzfr == null ? zzdsq.UNRECOGNIZED : zzfr;
    }

    public final zzfes zzboa() {
        return this.zzlve;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int zzag = this.zzlvc != zzdso.UNKNOWN_CURVE.zzhq() ? 0 + zzffg.zzag(1, this.zzlvc) : 0;
        if (this.zzlvd != zzdsq.UNKNOWN_HASH.zzhq()) {
            zzag += zzffg.zzag(2, this.zzlvd);
        }
        if (!this.zzlve.isEmpty()) {
            zzag += zzffg.zzc(11, this.zzlve);
        }
        int zzho = this.zzpgr.zzho() + zzag;
        this.zzpgs = zzho;
        return zzho;
    }
}
