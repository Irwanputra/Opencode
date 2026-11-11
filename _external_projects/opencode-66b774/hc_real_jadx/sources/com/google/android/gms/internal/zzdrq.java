package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdrq extends zzffu<zzdrq, zza> implements zzfhg {
    private static volatile zzfhk<zzdrq> zzbbk;
    private static final zzdrq zzlue;
    private int zzltz;

    public static final class zza extends zzffu.zza<zzdrq, zza> implements zzfhg {
        private zza() {
            super(zzdrq.zzlue);
        }

        public /* synthetic */ zza(zzdrr zzdrrVar) {
            this();
        }
    }

    static {
        zzdrq zzdrqVar = new zzdrq();
        zzlue = zzdrqVar;
        zzdrqVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdrqVar.zzpgr.zzbiy();
    }

    private zzdrq() {
    }

    public static zzdrq zzbmw() {
        return zzlue;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        zzdrr zzdrrVar = null;
        switch (zzdrr.zzbbi[i - 1]) {
            case 1:
                return new zzdrq();
            case 2:
                return zzlue;
            case 3:
                return null;
            case 4:
                return new zza(zzdrrVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdrq zzdrqVar = (zzdrq) obj2;
                int i2 = this.zzltz;
                boolean z2 = i2 != 0;
                int i3 = zzdrqVar.zzltz;
                this.zzltz = zzhVar.zza(z2, i2, i3 != 0, i3);
                return this;
            case 6:
                zzffb zzffbVar = (zzffb) obj;
                ((zzffm) obj2).getClass();
                while (!z) {
                    try {
                        int zzcvt = zzffbVar.zzcvt();
                        if (zzcvt != 0) {
                            if (zzcvt == 8) {
                                this.zzltz = zzffbVar.zzcwc();
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
                    synchronized (zzdrq.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlue);
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
        return zzlue;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        int i = this.zzltz;
        if (i != 0) {
            zzffgVar.zzab(1, i);
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final int zzbmp() {
        return this.zzltz;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int i2 = this.zzltz;
        int zzho = this.zzpgr.zzho() + (i2 != 0 ? 0 + zzffg.zzae(1, i2) : 0);
        this.zzpgs = zzho;
        return zzho;
    }
}
