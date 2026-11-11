package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.io.IOException;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdtj extends zzffu<zzdtj, zza> implements zzfhg {
    private static volatile zzfhk<zzdtj> zzbbk;
    private static final zzdtj zzlxh;
    private int zzlwy;
    private int zzlwz;
    private zzfgd<zzb> zzlxg = zzffu.zzcxo();

    public static final class zza extends zzffu.zza<zzdtj, zza> implements zzfhg {
        private zza() {
            super(zzdtj.zzlxh);
        }

        public /* synthetic */ zza(zzdtk zzdtkVar) {
            this();
        }

        public final zza zzb(zzb zzbVar) {
            zzcxr();
            ((zzdtj) this.zzpgv).zza(zzbVar);
            return this;
        }

        public final zza zzfy(int i) {
            zzcxr();
            ((zzdtj) this.zzpgv).zzfx(i);
            return this;
        }
    }

    public static final class zzb extends zzffu<zzb, zza> implements zzfhg {
        private static volatile zzfhk<zzb> zzbbk;
        private static final zzb zzlxi;
        private String zzlwa = "";
        private int zzlwr;
        private int zzlxd;
        private int zzlxe;

        public static final class zza extends zzffu.zza<zzb, zza> implements zzfhg {
            private zza() {
                super(zzb.zzlxi);
            }

            public /* synthetic */ zza(zzdtk zzdtkVar) {
                this();
            }

            public final zza zzb(zzdtb zzdtbVar) {
                zzcxr();
                ((zzb) this.zzpgv).zza(zzdtbVar);
                return this;
            }

            public final zza zzb(zzdtt zzdttVar) {
                zzcxr();
                ((zzb) this.zzpgv).zza(zzdttVar);
                return this;
            }

            public final zza zzga(int i) {
                zzcxr();
                ((zzb) this.zzpgv).zzfz(i);
                return this;
            }

            public final zza zzop(String str) {
                zzcxr();
                ((zzb) this.zzpgv).zzoi(str);
                return this;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzlxi = zzbVar;
            zzbVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
            zzbVar.zzpgr.zzbiy();
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzdtb zzdtbVar) {
            zzdtbVar.getClass();
            this.zzlxd = zzdtbVar.zzhq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zza(zzdtt zzdttVar) {
            zzdttVar.getClass();
            this.zzlwr = zzdttVar.zzhq();
        }

        public static zza zzbpp() {
            zzb zzbVar = zzlxi;
            zzffu.zza zzaVar = (zzffu.zza) zzbVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
            zzaVar.zza((zzffu.zza) zzbVar);
            return (zza) zzaVar;
        }

        public static zzb zzbpq() {
            return zzlxi;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzfz(int i) {
            this.zzlxe = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void zzoi(String str) {
            str.getClass();
            this.zzlwa = str;
        }

        @Override // com.google.android.gms.internal.zzffu
        public final Object zza(int i, Object obj, Object obj2) {
            zzdtk zzdtkVar = null;
            boolean z = false;
            switch (zzdtk.zzbbi[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return zzlxi;
                case 3:
                    return null;
                case 4:
                    return new zza(zzdtkVar);
                case 5:
                    zzffu.zzh zzhVar = (zzffu.zzh) obj;
                    zzb zzbVar = (zzb) obj2;
                    this.zzlwa = zzhVar.zza(!this.zzlwa.isEmpty(), this.zzlwa, !zzbVar.zzlwa.isEmpty(), zzbVar.zzlwa);
                    int i2 = this.zzlxd;
                    boolean z2 = i2 != 0;
                    int i3 = zzbVar.zzlxd;
                    this.zzlxd = zzhVar.zza(z2, i2, i3 != 0, i3);
                    int i4 = this.zzlxe;
                    boolean z3 = i4 != 0;
                    int i5 = zzbVar.zzlxe;
                    this.zzlxe = zzhVar.zza(z3, i4, i5 != 0, i5);
                    int i6 = this.zzlwr;
                    boolean z4 = i6 != 0;
                    int i7 = zzbVar.zzlwr;
                    this.zzlwr = zzhVar.zza(z4, i6, i7 != 0, i7);
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
                                } else if (zzcvt == 16) {
                                    this.zzlxd = zzffbVar.zzcwd();
                                } else if (zzcvt == 24) {
                                    this.zzlxe = zzffbVar.zzcwc();
                                } else if (zzcvt == 32) {
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
                        synchronized (zzb.class) {
                            if (zzbbk == null) {
                                zzbbk = new zzffu.zzb(zzlxi);
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
            return zzlxi;
        }

        @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
        public final void zza(zzffg zzffgVar) {
            if (!this.zzlwa.isEmpty()) {
                zzffgVar.zzn(1, this.zzlwa);
            }
            if (this.zzlxd != zzdtb.UNKNOWN_STATUS.zzhq()) {
                zzffgVar.zzaa(2, this.zzlxd);
            }
            int i = this.zzlxe;
            if (i != 0) {
                zzffgVar.zzab(3, i);
            }
            if (this.zzlwr != zzdtt.UNKNOWN_PREFIX.zzhq()) {
                zzffgVar.zzaa(4, this.zzlwr);
            }
            this.zzpgr.zza(zzffgVar);
        }

        @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
        public final int zzho() {
            int i = this.zzpgs;
            if (i != -1) {
                return i;
            }
            int zzo = this.zzlwa.isEmpty() ? 0 : 0 + zzffg.zzo(1, this.zzlwa);
            if (this.zzlxd != zzdtb.UNKNOWN_STATUS.zzhq()) {
                zzo += zzffg.zzag(2, this.zzlxd);
            }
            int i2 = this.zzlxe;
            if (i2 != 0) {
                zzo += zzffg.zzae(3, i2);
            }
            if (this.zzlwr != zzdtt.UNKNOWN_PREFIX.zzhq()) {
                zzo += zzffg.zzag(4, this.zzlwr);
            }
            int zzho = this.zzpgr.zzho() + zzo;
            this.zzpgs = zzho;
            return zzho;
        }
    }

    static {
        zzdtj zzdtjVar = new zzdtj();
        zzlxh = zzdtjVar;
        zzdtjVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdtjVar.zzpgr.zzbiy();
    }

    private zzdtj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzb zzbVar) {
        zzbVar.getClass();
        if (!this.zzlxg.zzcvi()) {
            zzfgd<zzb> zzfgdVar = this.zzlxg;
            int size = zzfgdVar.size();
            this.zzlxg = zzfgdVar.zzly(size == 0 ? 10 : size << 1);
        }
        this.zzlxg.add(zzbVar);
    }

    public static zza zzbpn() {
        zzdtj zzdtjVar = zzlxh;
        zzffu.zza zzaVar = (zzffu.zza) zzdtjVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
        zzaVar.zza((zzffu.zza) zzdtjVar);
        return (zza) zzaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzfx(int i) {
        this.zzlwz = i;
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        zzdtk zzdtkVar = null;
        switch (zzdtk.zzbbi[i - 1]) {
            case 1:
                return new zzdtj();
            case 2:
                return zzlxh;
            case 3:
                this.zzlxg.zzbiy();
                return null;
            case 4:
                return new zza(zzdtkVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdtj zzdtjVar = (zzdtj) obj2;
                int i2 = this.zzlwz;
                boolean z2 = i2 != 0;
                int i3 = zzdtjVar.zzlwz;
                this.zzlwz = zzhVar.zza(z2, i2, i3 != 0, i3);
                this.zzlxg = zzhVar.zza(this.zzlxg, zzdtjVar.zzlxg);
                if (zzhVar == zzffu.zzf.zzphb) {
                    this.zzlwy |= zzdtjVar.zzlwy;
                }
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
                                this.zzlwz = zzffbVar.zzcwc();
                            } else if (zzcvt == 18) {
                                if (!this.zzlxg.zzcvi()) {
                                    zzfgd<zzb> zzfgdVar = this.zzlxg;
                                    int size = zzfgdVar.size();
                                    this.zzlxg = zzfgdVar.zzly(size == 0 ? 10 : size << 1);
                                }
                                this.zzlxg.add((zzb) zzffbVar.zza((zzffb) zzb.zzbpq(), zzffmVar));
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
                    synchronized (zzdtj.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlxh);
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
        return zzlxh;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        int i = this.zzlwz;
        if (i != 0) {
            zzffgVar.zzab(1, i);
        }
        for (int i2 = 0; i2 < this.zzlxg.size(); i2++) {
            zzffgVar.zza(2, this.zzlxg.get(i2));
        }
        this.zzpgr.zza(zzffgVar);
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int i2 = this.zzlwz;
        int zzae = i2 != 0 ? zzffg.zzae(1, i2) + 0 : 0;
        for (int i3 = 0; i3 < this.zzlxg.size(); i3++) {
            zzae += zzffg.zzc(2, this.zzlxg.get(i3));
        }
        int zzho = this.zzpgr.zzho() + zzae;
        this.zzpgs = zzho;
        return zzho;
    }
}
