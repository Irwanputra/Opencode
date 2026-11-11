package com.google.android.gms.internal;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;

/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzffg extends zzfer {
    private static final Logger logger = Logger.getLogger(zzffg.class.getName());
    private static final boolean zzpfz = zzfiq.zzczx();
    public zzffi zzpga;

    public static abstract class zza extends zzffg {
        public final byte[] buffer;
        public final int limit;
        public int position;
        public int zzpgb;

        public zza(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.buffer = bArr;
            this.limit = bArr.length;
        }

        public final void zzah(int i, int i2) {
            zzlq((i << 3) | i2);
        }

        public final void zzc(byte b) {
            byte[] bArr = this.buffer;
            int i = this.position;
            this.position = i + 1;
            bArr[i] = b;
            this.zzpgb++;
        }

        @Override // com.google.android.gms.internal.zzffg
        public final int zzcws() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzdc(long j) {
            int i;
            if (zzffg.zzpfz) {
                long j2 = this.position;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    zzfiq.zza(bArr, i2, (byte) ((((int) j) & 127) | NotificationCompat.FLAG_HIGH_PRIORITY));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                zzfiq.zza(bArr2, i3, (byte) j);
                i = this.zzpgb + ((int) (this.position - j2));
            } else {
                while ((j & (-128)) != 0) {
                    byte[] bArr3 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    bArr3[i4] = (byte) ((((int) j) & 127) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    this.zzpgb++;
                    j >>>= 7;
                }
                byte[] bArr4 = this.buffer;
                int i5 = this.position;
                this.position = i5 + 1;
                bArr4[i5] = (byte) j;
                i = this.zzpgb + 1;
            }
            this.zzpgb = i;
        }

        public final void zzdd(long j) {
            byte[] bArr = this.buffer;
            int i = this.position;
            int i2 = i + 1;
            this.position = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i2 + 1;
            this.position = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i3 + 1;
            this.position = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i4 + 1;
            this.position = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i5 + 1;
            this.position = i6;
            bArr[i5] = (byte) (j >> 32);
            int i7 = i6 + 1;
            this.position = i7;
            bArr[i6] = (byte) (j >> 40);
            int i8 = i7 + 1;
            this.position = i8;
            bArr[i7] = (byte) (j >> 48);
            this.position = i8 + 1;
            bArr[i8] = (byte) (j >> 56);
            this.zzpgb += 8;
        }

        public final void zzlq(int i) {
            if (!zzffg.zzpfz) {
                while ((i & Base64.SIGN) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    this.zzpgb++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                bArr2[i3] = (byte) i;
                this.zzpgb++;
                return;
            }
            long j = this.position;
            while ((i & Base64.SIGN) != 0) {
                byte[] bArr3 = this.buffer;
                int i4 = this.position;
                this.position = i4 + 1;
                zzfiq.zza(bArr3, i4, (byte) ((i & 127) | NotificationCompat.FLAG_HIGH_PRIORITY));
                i >>>= 7;
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            zzfiq.zza(bArr4, i5, (byte) i);
            this.zzpgb += (int) (this.position - j);
        }

        public final void zzlr(int i) {
            byte[] bArr = this.buffer;
            int i2 = this.position;
            int i3 = i2 + 1;
            this.position = i3;
            bArr[i2] = (byte) i;
            int i4 = i3 + 1;
            this.position = i4;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i4 + 1;
            this.position = i5;
            bArr[i4] = (byte) (i >> 16);
            this.position = i5 + 1;
            bArr[i5] = i >> 24;
            this.zzpgb += 4;
        }
    }

    public static class zzb extends zzffg {
        private final byte[] buffer;
        private final int limit;
        private final int offset;
        private int position;

        public zzb(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.buffer = bArr;
            this.offset = i;
            this.position = i;
            this.limit = i3;
        }

        @Override // com.google.android.gms.internal.zzffg
        public void flush() {
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.buffer, this.position, i2);
                this.position += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zza(int i, long j) {
            zzz(i, 0);
            zzct(j);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zza(int i, zzfes zzfesVar) {
            zzz(i, 2);
            zzay(zzfesVar);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zza(int i, zzfhe zzfheVar) {
            zzz(i, 2);
            zze(zzfheVar);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzaa(int i, int i2) {
            zzz(i, 0);
            zzlc(i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzab(int i, int i2) {
            zzz(i, 0);
            zzld(i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzac(int i, int i2) {
            zzz(i, 5);
            zzlf(i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzay(zzfes zzfesVar) {
            zzld(zzfesVar.size());
            zzfesVar.zza(this);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzb(byte b) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                this.position = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzb(int i, long j) {
            zzz(i, 1);
            zzcv(j);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzb(int i, zzfes zzfesVar) {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzfesVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzb(int i, zzfhe zzfheVar) {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzfheVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzct(long j) {
            if (zzffg.zzpfz && zzcws() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.buffer;
                    int i = this.position;
                    this.position = i + 1;
                    zzfiq.zza(bArr, i, (byte) ((((int) j) & 127) | NotificationCompat.FLAG_HIGH_PRIORITY));
                    j >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i2 = this.position;
                this.position = i2 + 1;
                zzfiq.zza(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i3 = this.position;
                    this.position = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i4 = this.position;
            this.position = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzcv(long j) {
            try {
                byte[] bArr = this.buffer;
                int i = this.position;
                int i2 = i + 1;
                this.position = i2;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                this.position = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                this.position = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                this.position = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                this.position = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                this.position = i8;
                bArr[i7] = (byte) (j >> 48);
                this.position = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final int zzcws() {
            return this.limit - this.position;
        }

        @Override // com.google.android.gms.internal.zzfer
        public final void zzd(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zze(zzfhe zzfheVar) {
            zzld(zzfheVar.zzho());
            zzfheVar.zza(this);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzi(byte[] bArr, int i, int i2) {
            zzld(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzl(int i, boolean z) {
            zzz(i, 0);
            zzb(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzlc(int i) {
            if (i >= 0) {
                zzld(i);
            } else {
                zzct(i);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzld(int i) {
            if (zzffg.zzpfz && zzcws() >= 10) {
                while ((i & Base64.SIGN) != 0) {
                    byte[] bArr = this.buffer;
                    int i2 = this.position;
                    this.position = i2 + 1;
                    zzfiq.zza(bArr, i2, (byte) ((i & 127) | NotificationCompat.FLAG_HIGH_PRIORITY));
                    i >>>= 7;
                }
                byte[] bArr2 = this.buffer;
                int i3 = this.position;
                this.position = i3 + 1;
                zzfiq.zza(bArr2, i3, (byte) i);
                return;
            }
            while ((i & Base64.SIGN) != 0) {
                try {
                    byte[] bArr3 = this.buffer;
                    int i4 = this.position;
                    this.position = i4 + 1;
                    bArr3[i4] = (byte) ((i & 127) | NotificationCompat.FLAG_HIGH_PRIORITY);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
                }
            }
            byte[] bArr4 = this.buffer;
            int i5 = this.position;
            this.position = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzlf(int i) {
            try {
                byte[] bArr = this.buffer;
                int i2 = this.position;
                int i3 = i2 + 1;
                this.position = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.position = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.position = i5;
                bArr[i4] = (byte) (i >> 16);
                this.position = i5 + 1;
                bArr[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.position), Integer.valueOf(this.limit), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzn(int i, String str) {
            zzz(i, 2);
            zzts(str);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzts(String str) {
            int i = this.position;
            try {
                int zzli = zzffg.zzli(str.length() * 3);
                int zzli2 = zzffg.zzli(str.length());
                if (zzli2 != zzli) {
                    zzld(zzfis.zzd(str));
                    this.position = zzfis.zza(str, this.buffer, this.position, zzcws());
                    return;
                }
                int i2 = i + zzli2;
                this.position = i2;
                int zza = zzfis.zza(str, this.buffer, i2, zzcws());
                this.position = i;
                zzld((zza - i) - zzli2);
                this.position = zza;
            } catch (zzfiv e) {
                this.position = i;
                zza(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzz(int i, int i2) {
            zzld((i << 3) | i2);
        }
    }

    public static class zzc extends IOException {
        public zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r1 = r3.length()
                if (r1 == 0) goto L11
                java.lang.String r3 = r0.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r0)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzffg.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }

        public zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    public static final class zzd extends zza {
        private final OutputStream out;

        public zzd(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.out = outputStream;
        }

        private final void doFlush() {
            this.out.write(this.buffer, 0, this.position);
            this.position = 0;
        }

        private final void zzls(int i) {
            if (this.limit - this.position < i) {
                doFlush();
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void flush() {
            if (this.position > 0) {
                doFlush();
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void write(byte[] bArr, int i, int i2) {
            int i3 = this.limit;
            int i4 = this.position;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.buffer, i4, i2);
                this.position += i2;
            } else {
                int i5 = i3 - i4;
                System.arraycopy(bArr, i, this.buffer, i4, i5);
                int i6 = i + i5;
                i2 -= i5;
                this.position = this.limit;
                this.zzpgb += i5;
                doFlush();
                if (i2 <= this.limit) {
                    System.arraycopy(bArr, i6, this.buffer, 0, i2);
                    this.position = i2;
                } else {
                    this.out.write(bArr, i6, i2);
                }
            }
            this.zzpgb += i2;
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zza(int i, long j) {
            zzls(20);
            zzah(i, 0);
            zzdc(j);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zza(int i, zzfes zzfesVar) {
            zzz(i, 2);
            zzay(zzfesVar);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zza(int i, zzfhe zzfheVar) {
            zzz(i, 2);
            zze(zzfheVar);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzaa(int i, int i2) {
            zzls(20);
            zzah(i, 0);
            if (i2 >= 0) {
                zzlq(i2);
            } else {
                zzdc(i2);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzab(int i, int i2) {
            zzls(20);
            zzah(i, 0);
            zzlq(i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzac(int i, int i2) {
            zzls(14);
            zzah(i, 5);
            zzlr(i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzay(zzfes zzfesVar) {
            zzld(zzfesVar.size());
            zzfesVar.zza(this);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzb(byte b) {
            if (this.position == this.limit) {
                doFlush();
            }
            zzc(b);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzb(int i, long j) {
            zzls(18);
            zzah(i, 1);
            zzdd(j);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzb(int i, zzfes zzfesVar) {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzfesVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzb(int i, zzfhe zzfheVar) {
            zzz(1, 3);
            zzab(2, i);
            zza(3, zzfheVar);
            zzz(1, 4);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzct(long j) {
            zzls(10);
            zzdc(j);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzcv(long j) {
            zzls(8);
            zzdd(j);
        }

        @Override // com.google.android.gms.internal.zzfer
        public final void zzd(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zze(zzfhe zzfheVar) {
            zzld(zzfheVar.zzho());
            zzfheVar.zza(this);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzi(byte[] bArr, int i, int i2) {
            zzld(i2);
            write(bArr, 0, i2);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzl(int i, boolean z) {
            zzls(11);
            zzah(i, 0);
            zzc(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzlc(int i) {
            if (i >= 0) {
                zzld(i);
            } else {
                zzct(i);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzld(int i) {
            zzls(10);
            zzlq(i);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzlf(int i) {
            zzls(4);
            zzlr(i);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzn(int i, String str) {
            zzz(i, 2);
            zzts(str);
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzts(String str) {
            int zzd;
            try {
                int length = str.length() * 3;
                int zzli = zzffg.zzli(length);
                int i = zzli + length;
                int i2 = this.limit;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int zza = zzfis.zza(str, bArr, 0, length);
                    zzld(zza);
                    zzd(bArr, 0, zza);
                    return;
                }
                if (i > i2 - this.position) {
                    doFlush();
                }
                int zzli2 = zzffg.zzli(str.length());
                int i3 = this.position;
                try {
                    if (zzli2 == zzli) {
                        int i4 = i3 + zzli2;
                        this.position = i4;
                        int zza2 = zzfis.zza(str, this.buffer, i4, this.limit - i4);
                        this.position = i3;
                        zzd = (zza2 - i3) - zzli2;
                        zzlq(zzd);
                        this.position = zza2;
                    } else {
                        zzd = zzfis.zzd(str);
                        zzlq(zzd);
                        this.position = zzfis.zza(str, this.buffer, this.position, zzd);
                    }
                    this.zzpgb += zzd;
                } catch (zzfiv e) {
                    this.zzpgb -= this.position - i3;
                    this.position = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new zzc(e2);
                }
            } catch (zzfiv e3) {
                zza(str, e3);
            }
        }

        @Override // com.google.android.gms.internal.zzffg
        public final void zzz(int i, int i2) {
            zzld((i << 3) | i2);
        }
    }

    private zzffg() {
    }

    public static int zza(int i, zzfgk zzfgkVar) {
        int zzlg = zzlg(i);
        int zzho = zzfgkVar.zzho();
        return zzli(zzho) + zzho + zzlg;
    }

    public static int zza(zzfgk zzfgkVar) {
        int zzho = zzfgkVar.zzho();
        return zzli(zzho) + zzho;
    }

    public static int zzad(int i, int i2) {
        return zzlh(i2) + zzlg(i);
    }

    public static int zzae(int i, int i2) {
        return zzli(i2) + zzlg(i);
    }

    public static int zzaf(int i, int i2) {
        return zzlg(i) + 4;
    }

    public static int zzag(int i, int i2) {
        return zzlh(i2) + zzlg(i);
    }

    public static int zzaz(zzfes zzfesVar) {
        int size = zzfesVar.size();
        return zzli(size) + size;
    }

    public static int zzb(int i, double d) {
        return zzlg(i) + 8;
    }

    public static int zzb(int i, zzfgk zzfgkVar) {
        return zza(3, zzfgkVar) + zzae(2, i) + (zzlg(1) << 1);
    }

    public static zzffg zzb(OutputStream outputStream, int i) {
        return new zzd(outputStream, i);
    }

    public static zzffg zzbc(byte[] bArr) {
        return zzh(bArr, 0, bArr.length);
    }

    public static int zzbd(byte[] bArr) {
        int length = bArr.length;
        return zzli(length) + length;
    }

    public static int zzc(int i, long j) {
        return zzcx(j) + zzlg(i);
    }

    public static int zzc(int i, zzfes zzfesVar) {
        int zzlg = zzlg(i);
        int size = zzfesVar.size();
        return zzli(size) + size + zzlg;
    }

    public static int zzc(int i, zzfhe zzfheVar) {
        return zzf(zzfheVar) + zzlg(i);
    }

    public static int zzcw(long j) {
        return zzcx(j);
    }

    public static int zzcx(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzcy(long j) {
        return zzcx(zzdb(j));
    }

    public static int zzcz(long j) {
        return 8;
    }

    public static int zzd(int i, long j) {
        return zzcx(j) + zzlg(i);
    }

    public static int zzd(int i, zzfes zzfesVar) {
        return zzc(3, zzfesVar) + zzae(2, i) + (zzlg(1) << 1);
    }

    public static int zzd(int i, zzfhe zzfheVar) {
        return zzc(3, zzfheVar) + zzae(2, i) + (zzlg(1) << 1);
    }

    public static int zzda(long j) {
        return 8;
    }

    private static long zzdb(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int zzde(boolean z) {
        return 1;
    }

    public static int zze(int i, long j) {
        return zzlg(i) + 8;
    }

    public static int zzf(zzfhe zzfheVar) {
        int zzho = zzfheVar.zzho();
        return zzli(zzho) + zzho;
    }

    public static int zzg(float f) {
        return 4;
    }

    @Deprecated
    public static int zzg(zzfhe zzfheVar) {
        return zzfheVar.zzho();
    }

    public static zzffg zzh(byte[] bArr, int i, int i2) {
        return new zzb(bArr, i, i2);
    }

    public static int zzlb(int i) {
        return i > 4096 ? NotificationCompat.FLAG_BUBBLE : i;
    }

    public static int zzlg(int i) {
        return zzli(i << 3);
    }

    public static int zzlh(int i) {
        if (i >= 0) {
            return zzli(i);
        }
        return 10;
    }

    public static int zzli(int i) {
        if ((i & Base64.SIGN) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzlj(int i) {
        return zzli(zzlo(i));
    }

    public static int zzlk(int i) {
        return 4;
    }

    public static int zzll(int i) {
        return 4;
    }

    public static int zzlm(int i) {
        return zzlh(i);
    }

    public static int zzln(int i) {
        return zzli(i) + i;
    }

    private static int zzlo(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    public static int zzlp(int i) {
        return zzli(i);
    }

    public static int zzm(int i, boolean z) {
        return zzlg(i) + 1;
    }

    public static int zzo(double d) {
        return 8;
    }

    public static int zzo(int i, String str) {
        return zztt(str) + zzlg(i);
    }

    public static int zztt(String str) {
        int length;
        try {
            length = zzfis.zzd(str);
        } catch (zzfiv unused) {
            length = str.getBytes(zzffz.UTF_8).length;
        }
        return zzli(length) + length;
    }

    public abstract void flush();

    public abstract void write(byte[] bArr, int i, int i2);

    public final void zza(int i, double d) {
        zzb(i, Double.doubleToRawLongBits(d));
    }

    public abstract void zza(int i, long j);

    public abstract void zza(int i, zzfes zzfesVar);

    public abstract void zza(int i, zzfhe zzfheVar);

    public final void zza(String str, zzfiv zzfivVar) {
        logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzfivVar);
        byte[] bytes = str.getBytes(zzffz.UTF_8);
        try {
            zzld(bytes.length);
            zzd(bytes, 0, bytes.length);
        } catch (zzc e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzc(e2);
        }
    }

    public abstract void zzaa(int i, int i2);

    public abstract void zzab(int i, int i2);

    public abstract void zzac(int i, int i2);

    public abstract void zzay(zzfes zzfesVar);

    public abstract void zzb(byte b);

    public abstract void zzb(int i, long j);

    public abstract void zzb(int i, zzfes zzfesVar);

    public abstract void zzb(int i, zzfhe zzfheVar);

    public abstract void zzct(long j);

    public final void zzcu(long j) {
        zzct(zzdb(j));
    }

    public abstract void zzcv(long j);

    public abstract int zzcws();

    public final void zzcwt() {
        if (zzcws() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void zzdd(boolean z) {
        zzb(z ? (byte) 1 : (byte) 0);
    }

    @Deprecated
    public final void zze(int i, zzfhe zzfheVar) {
        zzz(i, 3);
        zzfheVar.zza(this);
        zzz(i, 4);
    }

    public abstract void zze(zzfhe zzfheVar);

    public final void zzf(float f) {
        zzlf(Float.floatToRawIntBits(f));
    }

    public abstract void zzi(byte[] bArr, int i, int i2);

    public abstract void zzl(int i, boolean z);

    public abstract void zzlc(int i);

    public abstract void zzld(int i);

    public final void zzle(int i) {
        zzld(zzlo(i));
    }

    public abstract void zzlf(int i);

    public final void zzn(double d) {
        zzcv(Double.doubleToRawLongBits(d));
    }

    public abstract void zzn(int i, String str);

    public abstract void zzts(String str);

    public abstract void zzz(int i, int i2);
}
