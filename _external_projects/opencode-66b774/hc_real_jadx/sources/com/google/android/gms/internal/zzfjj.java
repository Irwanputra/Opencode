package com.google.android.gms.internal;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzfjj {
    private final byte[] buffer;
    private int zzpfm;
    private int zzpfr;
    private int zzpft;
    private final int zzpfw;
    private final int zzpmz;
    private int zzpna;
    private int zzpnb;
    private int zzpfu = Integer.MAX_VALUE;
    private int zzpfn = 64;
    private int zzpfo = 67108864;

    private zzfjj(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzpmz = i;
        int i3 = i2 + i;
        this.zzpna = i3;
        this.zzpfw = i3;
        this.zzpnb = i;
    }

    public static zzfjj zzbe(byte[] bArr) {
        return zzn(bArr, 0, bArr.length);
    }

    private final void zzcwq() {
        int i = this.zzpna + this.zzpfr;
        this.zzpna = i;
        int i2 = this.zzpfu;
        if (i <= i2) {
            this.zzpfr = 0;
            return;
        }
        int i3 = i - i2;
        this.zzpfr = i3;
        this.zzpna = i - i3;
    }

    private final byte zzcwr() {
        int i = this.zzpnb;
        if (i == this.zzpna) {
            throw zzfjr.zzdai();
        }
        byte[] bArr = this.buffer;
        this.zzpnb = i + 1;
        return bArr[i];
    }

    private final void zzku(int i) {
        if (i < 0) {
            throw zzfjr.zzdaj();
        }
        int i2 = this.zzpnb;
        int i3 = i2 + i;
        int i4 = this.zzpfu;
        if (i3 > i4) {
            zzku(i4 - i2);
            throw zzfjr.zzdai();
        }
        if (i > this.zzpna - i2) {
            throw zzfjr.zzdai();
        }
        this.zzpnb = i2 + i;
    }

    public static zzfjj zzn(byte[] bArr, int i, int i2) {
        return new zzfjj(bArr, 0, i2);
    }

    public final int getPosition() {
        return this.zzpnb - this.zzpmz;
    }

    public final byte[] readBytes() {
        int zzcwi = zzcwi();
        if (zzcwi < 0) {
            throw zzfjr.zzdaj();
        }
        if (zzcwi == 0) {
            return zzfjv.zzpnv;
        }
        int i = this.zzpna;
        int i2 = this.zzpnb;
        if (zzcwi > i - i2) {
            throw zzfjr.zzdai();
        }
        byte[] bArr = new byte[zzcwi];
        System.arraycopy(this.buffer, i2, bArr, 0, zzcwi);
        this.zzpnb += zzcwi;
        return bArr;
    }

    public final String readString() {
        int zzcwi = zzcwi();
        if (zzcwi < 0) {
            throw zzfjr.zzdaj();
        }
        if (zzcwi > this.zzpna - this.zzpnb) {
            throw zzfjr.zzdai();
        }
        String str = new String(this.buffer, this.zzpnb, zzcwi, zzfjq.UTF_8);
        this.zzpnb += zzcwi;
        return str;
    }

    public final void zza(zzfjs zzfjsVar) {
        int zzcwi = zzcwi();
        if (this.zzpfm >= this.zzpfn) {
            throw zzfjr.zzdal();
        }
        int zzks = zzks(zzcwi);
        this.zzpfm++;
        zzfjsVar.zza(this);
        zzkp(0);
        this.zzpfm--;
        zzkt(zzks);
    }

    public final void zza(zzfjs zzfjsVar, int i) {
        int i2 = this.zzpfm;
        if (i2 >= this.zzpfn) {
            throw zzfjr.zzdal();
        }
        this.zzpfm = i2 + 1;
        zzfjsVar.zza(this);
        zzkp((i << 3) | 4);
        this.zzpfm--;
    }

    public final byte[] zzal(int i, int i2) {
        if (i2 == 0) {
            return zzfjv.zzpnv;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzpmz + i, bArr, 0, i2);
        return bArr;
    }

    public final void zzam(int i, int i2) {
        int i3 = this.zzpnb;
        int i4 = this.zzpmz;
        if (i > i3 - i4) {
            int i5 = this.zzpnb - this.zzpmz;
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i5);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= 0) {
            this.zzpnb = i4 + i;
            this.zzpft = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int zzcvt() {
        if (this.zzpnb == this.zzpna) {
            this.zzpft = 0;
            return 0;
        }
        int zzcwi = zzcwi();
        this.zzpft = zzcwi;
        if (zzcwi != 0) {
            return zzcwi;
        }
        throw new zzfjr("Protocol message contained an invalid tag (zero).");
    }

    public final long zzcvv() {
        return zzcwn();
    }

    public final int zzcvw() {
        return zzcwi();
    }

    public final boolean zzcvz() {
        return zzcwi() != 0;
    }

    public final long zzcwh() {
        long zzcwn = zzcwn();
        return (-(zzcwn & 1)) ^ (zzcwn >>> 1);
    }

    public final int zzcwi() {
        int i;
        byte zzcwr = zzcwr();
        if (zzcwr >= 0) {
            return zzcwr;
        }
        int i2 = zzcwr & Byte.MAX_VALUE;
        byte zzcwr2 = zzcwr();
        if (zzcwr2 >= 0) {
            i = zzcwr2 << 7;
        } else {
            i2 |= (zzcwr2 & Byte.MAX_VALUE) << 7;
            byte zzcwr3 = zzcwr();
            if (zzcwr3 >= 0) {
                i = zzcwr3 << 14;
            } else {
                i2 |= (zzcwr3 & Byte.MAX_VALUE) << 14;
                byte zzcwr4 = zzcwr();
                if (zzcwr4 < 0) {
                    int i3 = i2 | ((zzcwr4 & Byte.MAX_VALUE) << 21);
                    byte zzcwr5 = zzcwr();
                    int i4 = i3 | (zzcwr5 << 28);
                    if (zzcwr5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (zzcwr() >= 0) {
                            return i4;
                        }
                    }
                    throw zzfjr.zzdak();
                }
                i = zzcwr4 << 21;
            }
        }
        return i2 | i;
    }

    public final int zzcwk() {
        int i = this.zzpfu;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzpnb;
    }

    public final long zzcwn() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzcwr() & 128) == 0) {
                return j;
            }
        }
        throw zzfjr.zzdak();
    }

    public final int zzcwo() {
        return (zzcwr() & 255) | ((zzcwr() & 255) << 8) | ((zzcwr() & 255) << 16) | ((zzcwr() & 255) << 24);
    }

    public final long zzcwp() {
        return ((zzcwr() & 255) << 8) | (zzcwr() & 255) | ((zzcwr() & 255) << 16) | ((zzcwr() & 255) << 24) | ((zzcwr() & 255) << 32) | ((zzcwr() & 255) << 40) | ((zzcwr() & 255) << 48) | ((zzcwr() & 255) << 56);
    }

    public final void zzkp(int i) {
        if (this.zzpft != i) {
            throw new zzfjr("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzkq(int i) {
        int zzcvt;
        int i2 = i & 7;
        if (i2 == 0) {
            zzcwi();
            return true;
        }
        if (i2 == 1) {
            zzcwp();
            return true;
        }
        if (i2 == 2) {
            zzku(zzcwi());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw new zzfjr("Protocol message tag had invalid wire type.");
            }
            zzcwo();
            return true;
        }
        do {
            zzcvt = zzcvt();
            if (zzcvt == 0) {
                break;
            }
        } while (zzkq(zzcvt));
        zzkp(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int zzks(int i) {
        if (i < 0) {
            throw zzfjr.zzdaj();
        }
        int i2 = i + this.zzpnb;
        int i3 = this.zzpfu;
        if (i2 > i3) {
            throw zzfjr.zzdai();
        }
        this.zzpfu = i2;
        zzcwq();
        return i3;
    }

    public final void zzkt(int i) {
        this.zzpfu = i;
        zzcwq();
    }

    public final void zzmg(int i) {
        zzam(i, this.zzpft);
    }
}
