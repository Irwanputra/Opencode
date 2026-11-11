package com.google.android.gms.internal;

import com.google.android.gms.internal.zzdsy;
import com.google.android.gms.internal.zzffu;
import java.io.IOException;
import java.util.List;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzdth extends zzffu<zzdth, zza> implements zzfhg {
    private static volatile zzfhk<zzdth> zzbbk;
    private static final zzdth zzlxb;
    private int zzlwy;
    private int zzlwz;
    private zzfgd<zzb> zzlxa = zzffu.zzcxo();

    public static final class zza extends zzffu.zza<zzdth, zza> implements zzfhg {
        private zza() {
            super(zzdth.zzlxb);
        }

        public /* synthetic */ zza(zzdti zzdtiVar) {
            this();
        }
    }

    public static final class zzb extends zzffu<zzb, zza> implements zzfhg {
        private static volatile zzfhk<zzb> zzbbk;
        private static final zzb zzlxf;
        private int zzlwr;
        private zzdsy zzlxc;
        private int zzlxd;
        private int zzlxe;

        public static final class zza extends zzffu.zza<zzb, zza> implements zzfhg {
            private zza() {
                super(zzb.zzlxf);
            }

            public /* synthetic */ zza(zzdti zzdtiVar) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzlxf = zzbVar;
            zzbVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
            zzbVar.zzpgr.zzbiy();
        }

        private zzb() {
        }

        public static zzb zzbpl() {
            return zzlxf;
        }

        @Override // com.google.android.gms.internal.zzffu
        public final Object zza(int i, Object obj, Object obj2) {
            zzdsy.zza zzaVar;
            zzdti zzdtiVar = null;
            boolean z = false;
            switch (zzdti.zzbbi[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return zzlxf;
                case 3:
                    return null;
                case 4:
                    return new zza(zzdtiVar);
                case 5:
                    zzffu.zzh zzhVar = (zzffu.zzh) obj;
                    zzb zzbVar = (zzb) obj2;
                    this.zzlxc = (zzdsy) zzhVar.zza(this.zzlxc, zzbVar.zzlxc);
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
                    zzffm zzffmVar = (zzffm) obj2;
                    zzffmVar.getClass();
                    while (!z) {
                        try {
                            int zzcvt = zzffbVar.zzcvt();
                            if (zzcvt != 0) {
                                if (zzcvt == 10) {
                                    zzdsy zzdsyVar = this.zzlxc;
                                    if (zzdsyVar != null) {
                                        zzffu.zza zzaVar2 = (zzffu.zza) zzdsyVar.zza(zzffu.zzg.zzphj, (Object) null, (Object) null);
                                        zzaVar2.zza((zzffu.zza) zzdsyVar);
                                        zzaVar = (zzdsy.zza) zzaVar2;
                                    } else {
                                        zzaVar = null;
                                    }
                                    zzdsy zzdsyVar2 = (zzdsy) zzffbVar.zza((zzffb) zzdsy.zzbor(), zzffmVar);
                                    this.zzlxc = zzdsyVar2;
                                    if (zzaVar != null) {
                                        zzaVar.zza((zzdsy.zza) zzdsyVar2);
                                        this.zzlxc = zzaVar.zzcxs();
                                    }
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
                                zzbbk = new zzffu.zzb(zzlxf);
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
            return zzlxf;
        }

        @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
        public final void zza(zzffg zzffgVar) {
            zzdsy zzdsyVar = this.zzlxc;
            if (zzdsyVar != null) {
                if (zzdsyVar == null) {
                    zzdsyVar = zzdsy.zzbor();
                }
                zzffgVar.zza(1, zzdsyVar);
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

        public final boolean zzbpg() {
            return this.zzlxc != null;
        }

        public final zzdsy zzbph() {
            zzdsy zzdsyVar = this.zzlxc;
            return zzdsyVar == null ? zzdsy.zzbor() : zzdsyVar;
        }

        public final zzdtb zzbpi() {
            zzdtb zzfu = zzdtb.zzfu(this.zzlxd);
            return zzfu == null ? zzdtb.UNRECOGNIZED : zzfu;
        }

        public final int zzbpj() {
            return this.zzlxe;
        }

        public final zzdtt zzbpk() {
            zzdtt zzgd = zzdtt.zzgd(this.zzlwr);
            return zzgd == null ? zzdtt.UNRECOGNIZED : zzgd;
        }

        @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
        public final int zzho() {
            int i = this.zzpgs;
            if (i != -1) {
                return i;
            }
            zzdsy zzdsyVar = this.zzlxc;
            int i2 = 0;
            if (zzdsyVar != null) {
                if (zzdsyVar == null) {
                    zzdsyVar = zzdsy.zzbor();
                }
                i2 = 0 + zzffg.zzc(1, zzdsyVar);
            }
            if (this.zzlxd != zzdtb.UNKNOWN_STATUS.zzhq()) {
                i2 += zzffg.zzag(2, this.zzlxd);
            }
            int i3 = this.zzlxe;
            if (i3 != 0) {
                i2 += zzffg.zzae(3, i3);
            }
            if (this.zzlwr != zzdtt.UNKNOWN_PREFIX.zzhq()) {
                i2 += zzffg.zzag(4, this.zzlwr);
            }
            int zzho = this.zzpgr.zzho() + i2;
            this.zzpgs = zzho;
            return zzho;
        }
    }

    static {
        zzdth zzdthVar = new zzdth();
        zzlxb = zzdthVar;
        zzdthVar.zza(zzffu.zzg.zzphh, (Object) null, (Object) null);
        zzdthVar.zzpgr.zzbiy();
    }

    private zzdth() {
    }

    public static zzdth zzaf(byte[] bArr) {
        return (zzdth) zzffu.zza(zzlxb, bArr);
    }

    @Override // com.google.android.gms.internal.zzffu
    public final Object zza(int i, Object obj, Object obj2) {
        boolean z = false;
        zzdti zzdtiVar = null;
        switch (zzdti.zzbbi[i - 1]) {
            case 1:
                return new zzdth();
            case 2:
                return zzlxb;
            case 3:
                this.zzlxa.zzbiy();
                return null;
            case 4:
                return new zza(zzdtiVar);
            case 5:
                zzffu.zzh zzhVar = (zzffu.zzh) obj;
                zzdth zzdthVar = (zzdth) obj2;
                int i2 = this.zzlwz;
                boolean z2 = i2 != 0;
                int i3 = zzdthVar.zzlwz;
                this.zzlwz = zzhVar.zza(z2, i2, i3 != 0, i3);
                this.zzlxa = zzhVar.zza(this.zzlxa, zzdthVar.zzlxa);
                if (zzhVar == zzffu.zzf.zzphb) {
                    this.zzlwy |= zzdthVar.zzlwy;
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
                                if (!this.zzlxa.zzcvi()) {
                                    zzfgd<zzb> zzfgdVar = this.zzlxa;
                                    int size = zzfgdVar.size();
                                    this.zzlxa = zzfgdVar.zzly(size == 0 ? 10 : size << 1);
                                }
                                this.zzlxa.add((zzb) zzffbVar.zza((zzffb) zzb.zzbpl(), zzffmVar));
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
                    synchronized (zzdth.class) {
                        if (zzbbk == null) {
                            zzbbk = new zzffu.zzb(zzlxb);
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
        return zzlxb;
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final void zza(zzffg zzffgVar) {
        int i = this.zzlwz;
        if (i != 0) {
            zzffgVar.zzab(1, i);
        }
        for (int i2 = 0; i2 < this.zzlxa.size(); i2++) {
            zzffgVar.zza(2, this.zzlxa.get(i2));
        }
        this.zzpgr.zza(zzffgVar);
    }

    public final int zzbpc() {
        return this.zzlwz;
    }

    public final List<zzb> zzbpd() {
        return this.zzlxa;
    }

    public final int zzbpe() {
        return this.zzlxa.size();
    }

    @Override // com.google.android.gms.internal.zzffu, com.google.android.gms.internal.zzfhe
    public final int zzho() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int i2 = this.zzlwz;
        int zzae = i2 != 0 ? zzffg.zzae(1, i2) + 0 : 0;
        for (int i3 = 0; i3 < this.zzlxa.size(); i3++) {
            zzae += zzffg.zzc(2, this.zzlxa.get(i3));
        }
        int zzho = this.zzpgr.zzho() + zzae;
        this.zzpgs = zzho;
        return zzho;
    }
}
