package com.google.android.gms.internal;

import androidx.core.app.NotificationCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jasypt.intf.cli.ArgumentNaming;

/* loaded from: /tmp/opencode/hc_real.dex */
public final class zzffe extends zzffb {
    private final byte[] buffer;
    private int pos;
    private int zzpfr;
    private int zzpft;
    private int zzpfu;
    private final InputStream zzpfv;
    private int zzpfw;
    private int zzpfx;
    private zzfff zzpfy;

    private zzffe(InputStream inputStream, int i) {
        super();
        this.zzpfu = Integer.MAX_VALUE;
        this.zzpfy = null;
        zzffz.zzc(inputStream, ArgumentNaming.ARG_INPUT);
        this.zzpfv = inputStream;
        this.buffer = new byte[i];
        this.zzpfw = 0;
        this.pos = 0;
        this.zzpfx = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long zzcwn() {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzffe.zzcwn():long");
    }

    private final int zzcwo() {
        int i = this.pos;
        if (this.zzpfw - i < 4) {
            zzkw(4);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzcwp() {
        int i = this.pos;
        if (this.zzpfw - i < 8) {
            zzkw(8);
            i = this.pos;
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final void zzcwq() {
        int i = this.zzpfw + this.zzpfr;
        this.zzpfw = i;
        int i2 = this.zzpfx + i;
        int i3 = this.zzpfu;
        if (i2 <= i3) {
            this.zzpfr = 0;
            return;
        }
        int i4 = i2 - i3;
        this.zzpfr = i4;
        this.zzpfw = i - i4;
    }

    private final byte zzcwr() {
        if (this.pos == this.zzpfw) {
            zzkw(1);
        }
        byte[] bArr = this.buffer;
        int i = this.pos;
        this.pos = i + 1;
        return bArr[i];
    }

    private final void zzkw(int i) {
        if (zzkx(i)) {
            return;
        }
        if (i <= (this.zzpfo - this.zzpfx) - this.pos) {
            throw zzfge.zzcya();
        }
        throw zzfge.zzcyh();
    }

    private final boolean zzkx(int i) {
        do {
            int i2 = this.pos;
            int i3 = i2 + i;
            int i4 = this.zzpfw;
            if (i3 <= i4) {
                StringBuilder sb = new StringBuilder(77);
                sb.append("refillBuffer() called when ");
                sb.append(i);
                sb.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb.toString());
            }
            int i5 = this.zzpfo;
            int i6 = this.zzpfx;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.zzpfu) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.buffer;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.zzpfx += i2;
                this.zzpfw -= i2;
                this.pos = 0;
            }
            InputStream inputStream = this.zzpfv;
            byte[] bArr2 = this.buffer;
            int i7 = this.zzpfw;
            int read = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.zzpfo - this.zzpfx) - i7));
            if (read == 0 || read < -1 || read > this.buffer.length) {
                StringBuilder sb2 = new StringBuilder(102);
                sb2.append("InputStream#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            }
            if (read <= 0) {
                return false;
            }
            this.zzpfw += read;
            zzcwq();
        } while (this.zzpfw < i);
        return true;
    }

    private final byte[] zzky(int i) {
        byte[] zzkz = zzkz(i);
        if (zzkz != null) {
            return zzkz;
        }
        int i2 = this.pos;
        int i3 = this.zzpfw;
        int i4 = i3 - i2;
        this.zzpfx += i3;
        this.pos = 0;
        this.zzpfw = 0;
        List<byte[]> zzla = zzla(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzla) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    private final byte[] zzkz(int i) {
        if (i == 0) {
            return zzffz.EMPTY_BYTE_ARRAY;
        }
        if (i < 0) {
            throw zzfge.zzcyb();
        }
        int i2 = this.zzpfx;
        int i3 = this.pos;
        int i4 = i2 + i3 + i;
        if (i4 - this.zzpfo > 0) {
            throw zzfge.zzcyh();
        }
        int i5 = this.zzpfu;
        if (i4 > i5) {
            zzku((i5 - i2) - i3);
            throw zzfge.zzcya();
        }
        int i6 = this.zzpfw - i3;
        int i7 = i - i6;
        if (i7 >= 4096 && i7 > this.zzpfv.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.buffer, this.pos, bArr, 0, i6);
        this.zzpfx += this.zzpfw;
        this.pos = 0;
        this.zzpfw = 0;
        while (i6 < i) {
            int read = this.zzpfv.read(bArr, i6, i - i6);
            if (read == -1) {
                throw zzfge.zzcya();
            }
            this.zzpfx += read;
            i6 += read;
        }
        return bArr;
    }

    private final List<byte[]> zzla(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, NotificationCompat.FLAG_BUBBLE);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zzpfv.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw zzfge.zzcya();
                }
                this.zzpfx += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.zzffb
    public final double readDouble() {
        return Double.longBitsToDouble(zzcwp());
    }

    @Override // com.google.android.gms.internal.zzffb
    public final float readFloat() {
        return Float.intBitsToFloat(zzcwo());
    }

    @Override // com.google.android.gms.internal.zzffb
    public final String readString() {
        int zzcwi = zzcwi();
        if (zzcwi > 0 && zzcwi <= this.zzpfw - this.pos) {
            String str = new String(this.buffer, this.pos, zzcwi, zzffz.UTF_8);
            this.pos += zzcwi;
            return str;
        }
        if (zzcwi == 0) {
            return "";
        }
        if (zzcwi > this.zzpfw) {
            return new String(zzky(zzcwi), zzffz.UTF_8);
        }
        zzkw(zzcwi);
        String str2 = new String(this.buffer, this.pos, zzcwi, zzffz.UTF_8);
        this.pos += zzcwi;
        return str2;
    }

    @Override // com.google.android.gms.internal.zzffb
    public final <T extends zzffu<T, ?>> T zza(T t, zzffm zzffmVar) {
        int zzcwi = zzcwi();
        if (this.zzpfm >= this.zzpfn) {
            throw zzfge.zzcyg();
        }
        int zzks = zzks(zzcwi);
        this.zzpfm++;
        T t2 = (T) zzffu.zza(t, this, zzffmVar);
        zzkp(0);
        this.zzpfm--;
        zzkt(zzks);
        return t2;
    }

    @Override // com.google.android.gms.internal.zzffb
    public final void zza(zzfhf zzfhfVar, zzffm zzffmVar) {
        int zzcwi = zzcwi();
        if (this.zzpfm >= this.zzpfn) {
            throw zzfge.zzcyg();
        }
        int zzks = zzks(zzcwi);
        this.zzpfm++;
        zzfhfVar.zzb(this, zzffmVar);
        zzkp(0);
        this.zzpfm--;
        zzkt(zzks);
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcvt() {
        if (zzcwl()) {
            this.zzpft = 0;
            return 0;
        }
        int zzcwi = zzcwi();
        this.zzpft = zzcwi;
        if ((zzcwi >>> 3) != 0) {
            return zzcwi;
        }
        throw zzfge.zzcyd();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final long zzcvu() {
        return zzcwn();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final long zzcvv() {
        return zzcwn();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcvw() {
        return zzcwi();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final long zzcvx() {
        return zzcwp();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcvy() {
        return zzcwo();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final boolean zzcvz() {
        return zzcwn() != 0;
    }

    @Override // com.google.android.gms.internal.zzffb
    public final String zzcwa() {
        byte[] zzky;
        int zzcwi = zzcwi();
        int i = this.pos;
        int i2 = this.zzpfw;
        if (zzcwi <= i2 - i && zzcwi > 0) {
            zzky = this.buffer;
            this.pos = i + zzcwi;
        } else {
            if (zzcwi == 0) {
                return "";
            }
            if (zzcwi <= i2) {
                zzkw(zzcwi);
                zzky = this.buffer;
                this.pos = zzcwi;
            } else {
                zzky = zzky(zzcwi);
            }
            i = 0;
        }
        if (zzfis.zzk(zzky, i, i + zzcwi)) {
            return new String(zzky, i, zzcwi, zzffz.UTF_8);
        }
        throw zzfge.zzcyi();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final zzfes zzcwb() {
        int zzcwi = zzcwi();
        int i = this.zzpfw;
        int i2 = this.pos;
        if (zzcwi <= i - i2 && zzcwi > 0) {
            zzfes zze = zzfes.zze(this.buffer, i2, zzcwi);
            this.pos += zzcwi;
            return zze;
        }
        if (zzcwi == 0) {
            return zzfes.zzpfg;
        }
        byte[] zzkz = zzkz(zzcwi);
        if (zzkz != null) {
            return zzfes.zzba(zzkz);
        }
        int i3 = this.pos;
        int i4 = this.zzpfw;
        int i5 = i4 - i3;
        this.zzpfx += i4;
        this.pos = 0;
        this.zzpfw = 0;
        List<byte[]> zzla = zzla(zzcwi - i5);
        ArrayList arrayList = new ArrayList(zzla.size() + 1);
        arrayList.add(zzfes.zze(this.buffer, i3, i5));
        Iterator<byte[]> it = zzla.iterator();
        while (it.hasNext()) {
            arrayList.add(zzfes.zzba(it.next()));
        }
        return zzfes.zzf(arrayList);
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcwc() {
        return zzcwi();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcwd() {
        return zzcwi();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcwe() {
        return zzcwo();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final long zzcwf() {
        return zzcwp();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcwg() {
        return zzffb.zzkv(zzcwi());
    }

    @Override // com.google.android.gms.internal.zzffb
    public final long zzcwh() {
        return zzffb.zzcs(zzcwn());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    @Override // com.google.android.gms.internal.zzffb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzcwi() {
        /*
            r5 = this;
            int r0 = r5.pos
            int r1 = r5.zzpfw
            if (r1 == r0) goto L6b
            byte[] r2 = r5.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.pos = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.pos = r1
            return r0
        L6b:
            long r0 = r5.zzcwj()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzffe.zzcwi():int");
    }

    @Override // com.google.android.gms.internal.zzffb
    public final long zzcwj() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzcwr() & 128) == 0) {
                return j;
            }
        }
        throw zzfge.zzcyc();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcwk() {
        int i = this.zzpfu;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.zzpfx + this.pos);
    }

    @Override // com.google.android.gms.internal.zzffb
    public final boolean zzcwl() {
        return this.pos == this.zzpfw && !zzkx(1);
    }

    @Override // com.google.android.gms.internal.zzffb
    public final int zzcwm() {
        return this.zzpfx + this.pos;
    }

    @Override // com.google.android.gms.internal.zzffb
    public final void zzkp(int i) {
        if (this.zzpft != i) {
            throw zzfge.zzcye();
        }
    }

    @Override // com.google.android.gms.internal.zzffb
    public final boolean zzkq(int i) {
        int zzcvt;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzpfw - this.pos < 10) {
                while (i3 < 10) {
                    if (zzcwr() < 0) {
                        i3++;
                    }
                }
                throw zzfge.zzcyc();
            }
            while (i3 < 10) {
                byte[] bArr = this.buffer;
                int i4 = this.pos;
                this.pos = i4 + 1;
                if (bArr[i4] < 0) {
                    i3++;
                }
            }
            throw zzfge.zzcyc();
            return true;
        }
        if (i2 == 1) {
            zzku(8);
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
                throw zzfge.zzcyf();
            }
            zzku(4);
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

    @Override // com.google.android.gms.internal.zzffb
    public final int zzks(int i) {
        if (i < 0) {
            throw zzfge.zzcyb();
        }
        int i2 = this.zzpfx + this.pos + i;
        int i3 = this.zzpfu;
        if (i2 > i3) {
            throw zzfge.zzcya();
        }
        this.zzpfu = i2;
        zzcwq();
        return i3;
    }

    @Override // com.google.android.gms.internal.zzffb
    public final void zzkt(int i) {
        this.zzpfu = i;
        zzcwq();
    }

    @Override // com.google.android.gms.internal.zzffb
    public final void zzku(int i) {
        int i2 = this.zzpfw;
        int i3 = this.pos;
        if (i <= i2 - i3 && i >= 0) {
            this.pos = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzfge.zzcyb();
        }
        int i4 = this.zzpfx;
        int i5 = i4 + i3 + i;
        int i6 = this.zzpfu;
        if (i5 > i6) {
            zzku((i6 - i4) - i3);
            throw zzfge.zzcya();
        }
        int i7 = i2 - i3;
        this.pos = i2;
        while (true) {
            zzkw(1);
            int i8 = i - i7;
            int i9 = this.zzpfw;
            if (i8 <= i9) {
                this.pos = i8;
                return;
            } else {
                i7 += i9;
                this.pos = i9;
            }
        }
    }
}
