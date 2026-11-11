package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdrw;
import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdrs extends zzffu<zzdrs, zza> implements zzfhg {
    private static volatile zzfhk<zzdrs> zzbbk;
    private static final zzdrs zzlug;
    private int zzltn;
    private zzfes zzltv = zzfes.zzpfg;
    private zzdrw zzluf;

    public static final class zza extends zzffu.zza<zzdrs, zza> implements zzfhg {
        private zza() {
            super(zzdrs.zzlug);
        }

        public /* synthetic */ zza(zzdrt zzdrtVar) {
            this();
        }

        public final zza zzb(zzdrw zzdrwVar) {
            zzcxr();
            ((zzdrs) this.zzpgv).zza(zzdrwVar);
            return this;
        }

        public final zza zzfl(int i) {
            zzcxr();
            ((zzdrs) this.zzpgv).setVersion(0);
            return this;
        }

        public final zza zzs(zzfes zzfesVar) {
            zzcxr();
            ((zzdrs) this.zzpgv).zzk(zzfesVar);
            return this;
        }
    }

    static {
        zzdrs zzdrsVar = new zzdrs();
        zzlug = zzdrsVar;
        zzdrsVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdrsVar.zzpgr.zzbiy();
    }

    private zzdrs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVersion(int i) {
        this.zzltn = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzdrw zzdrwVar) {
        zzdrwVar.getClass();
        this.zzluf = zzdrwVar;
    }

    public static zza zzbmy() {
        zzdrs zzdrsVar = zzlug;
        zzffu.zza zzaVar = (zzffu.zza) zzdrsVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
        zzaVar.zza((zzffu.zza) zzdrsVar);
        return (zza) zzaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzk(zzfes zzfesVar) {
        zzfesVar.getClass();
        this.zzltv = zzfesVar;
    }

    public static zzdrs zzr(zzfes zzfesVar) {
        return (zzdrs) zzffu.zza(zzlug, zzfesVar);
    }

    public final int getVersion() {
        return this.zzltn;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        zzdrw.zza zzaVar;
        boolean z = false;
        zzdrt zzdrtVar = null;
        switch (zzdrt.zzbbi[i - 1]) {
            case 1:
                return new zzdrs();
            case 2:
                return zzlug;
            case 3:
                return null;
            case 4:
                return new zza(zzdrtVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdrs zzdrsVar = (zzdrs) obj2;
                int i2 = this.zzltn;
                boolean z2 = i2 != 0;
                int i3 = zzdrsVar.zzltn;
                this.zzltn = zzhVar.zza(z2, i2, i3 != 0, i3);
                this.zzluf = (zzdrw) zzhVar.zza(this.zzluf, zzdrsVar.zzluf);
                zzfes zzfesVar = this.zzltv;
                zzfes zzfesVar2 = zzfes.zzpfg;
                boolean z3 = zzfesVar != zzfesVar2;
                zzfes zzfesVar3 = zzdrsVar.zzltv;
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
                                    zzdrw zzdrwVar = this.zzluf;
                                    if (zzdrwVar != null) {
                                        zzffu.zza zzaVar2 = (zzffu.zza) zzdrwVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
                                        zzaVar2.zza((zzffu.zza) zzdrwVar);
                                        zzaVar = (zzdrw.zza) zzaVar2;
                                    } else {
                                        zzaVar = null;
                                    }
                                    zzdrw zzdrwVar2 = (zzdrw) zzffbVar.zza((zzffb) zzdrw.zzbnc(), zzffmVar);
                                    this.zzluf = zzdrwVar2;
                                    if (zzaVar != null) {
                                        zzaVar.zza((zzdrw.zza) zzdrwVar2);
                                        this.zzluf = zzaVar.zzcxs();
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
                    synchronized (zzdrs.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlug);
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
        return zzlug;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        int i = this.zzltn;
        if (i != 0) {
            zzffgVar.zzab(1, i);
        }
        zzdrw zzdrwVar = this.zzluf;
        if (zzdrwVar != null) {
            if (zzdrwVar == null) {
                zzdrwVar = zzdrw.zzbnc();
            }
            zzffgVar.zza(2, zzdrwVar);
        }
        if (!this.zzltv.isEmpty()) {
            zzffgVar.zza(3, this.zzltv);
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
        zzdrw zzdrwVar = this.zzluf;
        if (zzdrwVar != null) {
            if (zzdrwVar == null) {
                zzdrwVar = zzdrw.zzbnc();
            }
            zzae += zzffg.zzc(2, zzdrwVar);
        }
        if (!this.zzltv.isEmpty()) {
            zzae += zzffg.zzc(3, this.zzltv);
        }
        int zzho = this.zzpgr.zzho() + zzae;
        this.zzpgs = zzho;
        return zzho;
    }
}
