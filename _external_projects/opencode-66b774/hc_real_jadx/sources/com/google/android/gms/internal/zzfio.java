package com.google.android.gms.internal;

import com.google.android.gms.internal.zzffu;
import java.util.Arrays;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfio {
    private static final zzfio zzpkp = new zzfio(0, new int[0], new Object[0], false);
    private int count;
    private boolean zzpfc;
    private int zzpgs;
    private int[] zzpkq;
    private Object[] zzpkr;

    private zzfio() {
        this(0, new int[8], new Object[8], true);
    }

    private zzfio(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zzpgs = -1;
        this.count = i;
        this.zzpkq = iArr;
        this.zzpkr = objArr;
        this.zzpfc = z;
    }

    public static zzfio zzb(zzfio zzfioVar, zzfio zzfioVar2) {
        int i = zzfioVar.count + zzfioVar2.count;
        int[] copyOf = Arrays.copyOf(zzfioVar.zzpkq, i);
        System.arraycopy(zzfioVar2.zzpkq, 0, copyOf, zzfioVar.count, zzfioVar2.count);
        Object[] copyOf2 = Arrays.copyOf(zzfioVar.zzpkr, i);
        System.arraycopy(zzfioVar2.zzpkr, 0, copyOf2, zzfioVar.count, zzfioVar2.count);
        return new zzfio(i, copyOf, copyOf2, true);
    }

    private void zzc(int i, Object obj) {
        zzczl();
        int i2 = this.count;
        int[] iArr = this.zzpkq;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzpkq = Arrays.copyOf(iArr, i3);
            this.zzpkr = Arrays.copyOf(this.zzpkr, i3);
        }
        int[] iArr2 = this.zzpkq;
        int i4 = this.count;
        iArr2[i4] = i;
        this.zzpkr[i4] = obj;
        this.count = i4 + 1;
    }

    private final void zzczl() {
        if (!this.zzpfc) {
            throw new UnsupportedOperationException();
        }
    }

    public static zzfio zzczu() {
        return zzpkp;
    }

    public static zzfio zzczv() {
        return new zzfio();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzfio)) {
            return false;
        }
        zzfio zzfioVar = (zzfio) obj;
        int i = this.count;
        if (i == zzfioVar.count) {
            int[] iArr = this.zzpkq;
            int[] iArr2 = zzfioVar.zzpkq;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                Object[] objArr = this.zzpkr;
                Object[] objArr2 = zzfioVar.zzpkr;
                int i3 = this.count;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    }
                    i4++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(this.zzpkr) + ((Arrays.hashCode(this.zzpkq) + ((this.count + 527) * 31)) * 31);
    }

    public final void zza(zzffg zzffgVar) {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.zzpkq[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                zzffgVar.zza(i3, ((Long) this.zzpkr[i]).longValue());
            } else if (i4 == 1) {
                zzffgVar.zzb(i3, ((Long) this.zzpkr[i]).longValue());
            } else if (i4 == 2) {
                zzffgVar.zza(i3, (zzfes) this.zzpkr[i]);
            } else if (i4 == 3) {
                zzffgVar.zzz(i3, 3);
                ((zzfio) this.zzpkr[i]).zza(zzffgVar);
                zzffgVar.zzz(i3, 4);
            } else {
                if (i4 != 5) {
                    throw zzfge.zzcyf();
                }
                zzffgVar.zzac(i3, ((Integer) this.zzpkr[i]).intValue());
            }
        }
    }

    public final void zza(zzfji zzfjiVar) {
        if (zzfjiVar.zzcwv() == zzffu.zzg.zzpho) {
            for (int i = this.count - 1; i >= 0; i--) {
                zzfjiVar.zzb(this.zzpkq[i] >>> 3, this.zzpkr[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zzfjiVar.zzb(this.zzpkq[i2] >>> 3, this.zzpkr[i2]);
        }
    }

    public final boolean zzb(int i, zzffb zzffbVar) {
        int zzcvt;
        zzczl();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzc(i, Long.valueOf(zzffbVar.zzcvv()));
            return true;
        }
        if (i3 == 1) {
            zzc(i, Long.valueOf(zzffbVar.zzcvx()));
            return true;
        }
        if (i3 == 2) {
            zzc(i, zzffbVar.zzcwb());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw zzfge.zzcyf();
            }
            zzc(i, Integer.valueOf(zzffbVar.zzcvy()));
            return true;
        }
        zzfio zzfioVar = new zzfio();
        do {
            zzcvt = zzffbVar.zzcvt();
            if (zzcvt == 0) {
                break;
            }
        } while (zzfioVar.zzb(zzcvt, zzffbVar));
        zzffbVar.zzkp((i2 << 3) | 4);
        zzc(i, zzfioVar);
        return true;
    }

    public final void zzbiy() {
        this.zzpfc = false;
    }

    public final int zzczw() {
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += zzffg.zzd(this.zzpkq[i3] >>> 3, (zzfes) this.zzpkr[i3]);
        }
        this.zzpgs = i2;
        return i2;
    }

    public final void zzd(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            zzfhh.zzb(sb, i, String.valueOf(this.zzpkq[i2] >>> 3), this.zzpkr[i2]);
        }
    }

    public final int zzho() {
        int zzd;
        int i = this.zzpgs;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzpkq[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zzd = zzffg.zzd(i5, ((Long) this.zzpkr[i3]).longValue());
            } else if (i6 == 1) {
                zzd = zzffg.zze(i5, ((Long) this.zzpkr[i3]).longValue());
            } else if (i6 == 2) {
                zzd = zzffg.zzc(i5, (zzfes) this.zzpkr[i3]);
            } else if (i6 == 3) {
                i2 = ((zzfio) this.zzpkr[i3]).zzho() + (zzffg.zzlg(i5) << 1) + i2;
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(zzfge.zzcyf());
                }
                zzd = zzffg.zzaf(i5, ((Integer) this.zzpkr[i3]).intValue());
            }
            i2 = zzd + i2;
        }
        this.zzpgs = i2;
        return i2;
    }
}
