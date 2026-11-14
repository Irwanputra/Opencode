package ads_mobile_sdk;

import dev.epro.r0.G6547577305291411977;
import dev.epro.r0.O17574792317020433029;
import dev.epro.r0.S10973172697741180971;
import dev.epro.r0.W4415201450379021245;
import dev.epro.r0.Z3383101362411723454;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class su extends tu {
    public final FileInputStream e;
    public final byte[] f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l = Integer.MAX_VALUE;

    public su(FileInputStream fileInputStream) {
        byte[] bArr = rb1.a;
        this.e = fileInputStream;
        this.f = new byte[4096];
        this.g = 0;
        this.i = 0;
        this.k = 0;
    }

    public final void A() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = this.k + i;
        int i3 = this.l;
        if (i2 <= i3) {
            this.h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.h = i4;
        this.g = i - i4;
    }

    @Override // ads_mobile_sdk.tu
    public final int a() {
        int i = this.l;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.k + this.i);
    }

    @Override // ads_mobile_sdk.tu
    public final int b() {
        return this.k + this.i;
    }

    @Override // ads_mobile_sdk.tu
    public final boolean c() {
        return this.i == this.g && !l(1);
    }

    @Override // ads_mobile_sdk.tu
    public final int d(int i) throws yi1 {
        if (i < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.k + this.i;
        if (i > Integer.MAX_VALUE - i2) {
            Z3383101362411723454.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return 0;
        }
        if (a(i2, i, this.l)) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        int i3 = this.l;
        this.l = i2 + i;
        A();
        return i3;
    }

    @Override // ads_mobile_sdk.tu
    public final boolean e(int i) throws yi1 {
        int i2 = i & 7;
        if (i2 != 0) {
            if (i2 == 1) {
                j(8);
                return true;
            }
            if (i2 == 2) {
                j(m());
                return true;
            }
            if (i2 == 3) {
                w();
                a(((i >>> 3) << 3) | 4);
                return true;
            }
            if (i2 == 4) {
                if (this.b == 0) {
                    a(0);
                }
                return false;
            }
            if (i2 == 5) {
                j(4);
                return true;
            }
            Z3383101362411723454.v();
            return false;
        }
        int i3 = this.g - this.i;
        byte[] bArr = this.f;
        if (i3 >= 10) {
            for (int i4 = 0; i4 < 10; i4++) {
                int i5 = this.i;
                this.i = i5 + 1;
                if (bArr[i5] < 0) {
                }
            }
            Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.i == this.g) {
                i(1);
            }
            int i7 = this.i;
            this.i = i7 + 1;
            if (bArr[i7] < 0) {
            }
        }
        Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    public final byte[] f(int i) throws IOException {
        byte[] bArrG = g(i);
        if (bArrG != null) {
            return bArrG;
        }
        int i2 = this.i;
        int i3 = this.g;
        int length = i3 - i2;
        this.k += i3;
        this.i = 0;
        this.g = 0;
        ArrayList arrayListH = h(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, i2, bArr, 0, length);
        int size = arrayListH.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayListH.get(i4);
            i4++;
            byte[] bArr2 = (byte[]) obj;
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] g(int i) throws IOException {
        if (i == 0) {
            return rb1.a;
        }
        if (i < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        int i2 = this.k + this.i;
        if (a(i2, i, Integer.MAX_VALUE)) {
            Z3383101362411723454.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return null;
        }
        if (a(i2, i, this.l)) {
            int i3 = this.l;
            if (i3 >= i2) {
                j(i3 - i2);
            }
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
        int i4 = this.g - this.i;
        int i5 = i - i4;
        FileInputStream fileInputStream = this.e;
        if (i5 >= 4096) {
            try {
                if (i5 > fileInputStream.available()) {
                    return null;
                }
            } catch (yi1 e) {
                e.a = true;
                throw e;
            }
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f, this.i, bArr, 0, i4);
        this.k += this.g;
        this.i = 0;
        this.g = 0;
        while (i4 < i) {
            try {
                int i6 = fileInputStream.read(bArr, i4, i - i4);
                if (i6 == -1) {
                    Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    return null;
                }
                this.k += i6;
                i4 += i6;
            } catch (yi1 e2) {
                e2.a = true;
                throw e2;
            }
        }
        return bArr;
    }

    public final ArrayList h(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                try {
                    int i3 = this.e.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        return null;
                    }
                    this.k += i3;
                    i2 += i3;
                } catch (yi1 e) {
                    e.a = true;
                    throw e;
                }
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void i(int i) throws yi1 {
        if (l(i)) {
            return;
        }
        if (i > (Integer.MAX_VALUE - this.k) - this.i) {
            Z3383101362411723454.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        } else {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public final void j(int i) throws yi1 {
        int i2 = this.g;
        int i3 = this.i;
        if (i <= i2 - i3 && i >= 0) {
            this.i = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.e;
        if (i < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return;
        }
        int i4 = this.k + i3;
        if (a(i4, i, Integer.MAX_VALUE)) {
            Z3383101362411723454.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            return;
        }
        if (a(i4, i, this.l)) {
            int i5 = this.l;
            if (i5 >= i4) {
                j(i5 - i4);
            }
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return;
        }
        int i6 = this.k;
        int i7 = this.i;
        this.k = i6 + i7;
        int i8 = this.g - i7;
        this.g = 0;
        this.i = 0;
        while (i8 < i) {
            long j = i - i8;
            try {
                try {
                    long jSkip = fileInputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(fileInputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i8 += (int) jSkip;
                    }
                } catch (yi1 e) {
                    e.a = true;
                    throw e;
                }
            } catch (Throwable th) {
                this.k += i8;
                A();
                throw th;
            }
        }
        this.k += i8;
        A();
        if (i8 >= i) {
            return;
        }
        int i9 = this.g;
        int i10 = i9 - this.i;
        this.i = i9;
        i(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.g;
            if (i11 <= i12) {
                this.i = i11;
                return;
            } else {
                i10 += i12;
                this.i = i12;
                i(1);
            }
        }
    }

    @Override // ads_mobile_sdk.tu
    public final int k() {
        return m();
    }

    public final boolean l(int i) throws IOException {
        FileInputStream fileInputStream = this.e;
        int i2 = this.i;
        if (i2 + i <= this.g) {
            S10973172697741180971.m(G6547577305291411977.o(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i3 = this.k + i2;
        if (!a(i3, i, Integer.MAX_VALUE) && !a(i3, i, this.l)) {
            int i4 = this.i;
            byte[] bArr = this.f;
            if (i4 > 0) {
                int i5 = this.g;
                if (i5 > i4) {
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.k += i4;
                this.g -= i4;
                this.i = 0;
            }
            int i6 = this.g;
            try {
                int i7 = fileInputStream.read(bArr, i6, Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.k) - i6));
                if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                    throw new IllegalStateException(String.valueOf(fileInputStream.getClass()) + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
                }
                if (i7 > 0) {
                    this.g += i7;
                    A();
                    if (this.g >= i || l(i)) {
                        return true;
                    }
                }
            } catch (yi1 e) {
                e.a = true;
                throw e;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x009d A[PHI: r3
      0x009d: PHI (r3v10 int) = (r3v9 int), (r3v12 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // ads_mobile_sdk.tu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m() throws ads_mobile_sdk.yi1 {
        /*
            r8 = this;
            int r0 = r8.i
            int r1 = r8.g
            byte[] r2 = r8.f
            if (r1 != r0) goto L9
            goto L6d
        L9:
            int r3 = r0 + 1
            r4 = r2[r0]
            if (r4 < 0) goto L12
            r8.i = r3
            return r4
        L12:
            int r1 = r1 - r3
            r5 = 9
            if (r1 >= r5) goto L18
            goto L6d
        L18:
            int r1 = r0 + 2
            r3 = r2[r3]
            int r3 = r3 << 7
            r3 = r3 ^ r4
            if (r3 >= 0) goto L25
            r0 = r3 ^ (-128(0xffffffffffffff80, float:NaN))
            goto La0
        L25:
            int r4 = r0 + 3
            r1 = r2[r1]
            int r1 = r1 << 14
            r1 = r1 ^ r3
            if (r1 < 0) goto L33
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
        L30:
            r1 = r4
            goto La0
        L33:
            int r3 = r0 + 4
            r4 = r2[r4]
            int r4 = r4 << 21
            r1 = r1 ^ r4
            if (r1 >= 0) goto L42
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            r1 = r3
            goto La0
        L42:
            int r4 = r0 + 5
            r3 = r2[r3]
            int r5 = r3 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r3 >= 0) goto L9e
            int r3 = r0 + 6
            r4 = r2[r4]
            if (r4 >= 0) goto L9d
            int r4 = r0 + 7
            r3 = r2[r3]
            if (r3 >= 0) goto L9e
            int r3 = r0 + 8
            r4 = r2[r4]
            if (r4 >= 0) goto L9d
            int r4 = r0 + 9
            r3 = r2[r3]
            if (r3 >= 0) goto L9e
            int r0 = r0 + 10
            r3 = r2[r4]
            if (r3 >= 0) goto L9b
        L6d:
            r0 = 0
            r3 = 0
            r1 = r0
        L71:
            r5 = 64
            if (r1 >= r5) goto L95
            int r5 = r8.i
            int r6 = r8.g
            if (r5 != r6) goto L7f
            r5 = 1
            r8.i(r5)
        L7f:
            int r5 = r8.i
            int r6 = r5 + 1
            r8.i = r6
            r5 = r2[r5]
            r6 = r5 & 127(0x7f, float:1.78E-43)
            long r6 = (long) r6
            long r6 = r6 << r1
            long r3 = r3 | r6
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L92
            int r8 = (int) r3
            return r8
        L92:
            int r1 = r1 + 7
            goto L71
        L95:
            java.lang.String r8 = "CodedInputStream encountered a malformed varint."
            dev.epro.r0.Z3383101362411723454.o(r8)
            return r0
        L9b:
            r4 = r0
            goto L9e
        L9d:
            r4 = r3
        L9e:
            r0 = r1
            goto L30
        La0:
            r8.i = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su.m():int");
    }

    @Override // ads_mobile_sdk.tu
    public final int n() {
        return x();
    }

    @Override // ads_mobile_sdk.tu
    public final long o() {
        return y();
    }

    @Override // ads_mobile_sdk.tu
    public final int p() {
        return tu.b(m());
    }

    @Override // ads_mobile_sdk.tu
    public final long q() {
        return tu.a(z());
    }

    @Override // ads_mobile_sdk.tu
    public final String r() throws yi1 {
        int iM = m();
        byte[] bArr = this.f;
        if (iM > 0) {
            int i = this.g;
            int i2 = this.i;
            if (iM <= i - i2) {
                String str = new String(bArr, i2, iM, StandardCharsets.UTF_8);
                this.i += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        if (iM > this.g) {
            return new String(f(iM), StandardCharsets.UTF_8);
        }
        i(iM);
        String str2 = new String(bArr, this.i, iM, StandardCharsets.UTF_8);
        this.i += iM;
        return str2;
    }

    @Override // ads_mobile_sdk.tu
    public final String s() throws IOException {
        int iM = m();
        int i = this.i;
        int i2 = this.g;
        int i3 = i2 - i;
        byte[] bArrF = this.f;
        if (iM <= i3 && iM > 0) {
            this.i = i + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            if (iM < 0) {
                Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                return null;
            }
            i = 0;
            if (iM <= i2) {
                i(iM);
                this.i = iM;
            } else {
                bArrF = f(iM);
            }
        }
        if (iM != 0) {
            return vn3.a.a(i, bArrF, iM);
        }
        O17574792317020433029 o17574792317020433029 = vn3.a;
        return "";
    }

    @Override // ads_mobile_sdk.tu
    public final int t() throws yi1 {
        if (c()) {
            this.j = 0;
            return 0;
        }
        int iM = m();
        this.j = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        Z3383101362411723454.o("Protocol message contained an invalid tag (zero).");
        return 0;
    }

    @Override // ads_mobile_sdk.tu
    public final int u() {
        return m();
    }

    @Override // ads_mobile_sdk.tu
    public final long v() {
        return z();
    }

    public final int x() throws yi1 {
        int i = this.i;
        if (this.g - i < 4) {
            i(4);
            i = this.i;
        }
        this.i = i + 4;
        byte[] bArr = this.f;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long y() throws yi1 {
        int i = this.i;
        if (this.g - i < 8) {
            i(8);
            i = this.i;
        }
        this.i = i + 8;
        byte[] bArr = this.f;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final long z() throws yi1 {
        long j;
        long j2;
        long j3;
        int i = this.i;
        int i2 = this.g;
        byte[] bArr = this.f;
        if (i2 != i) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.i = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j = (-2080896) ^ i9;
                            i4 = i8;
                        } else {
                            long j4 = i9;
                            i4 = i + 5;
                            long j5 = j4 ^ (((long) bArr[i8]) << 28);
                            if (j5 >= 0) {
                                j2 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j6 = j5 ^ (((long) bArr[i4]) << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j5 = j6 ^ (((long) bArr[i10]) << 42);
                                    if (j5 >= 0) {
                                        j2 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j6 = j5 ^ (((long) bArr[i4]) << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            j5 = j6 ^ (((long) bArr[i10]) << 56);
                                            if (j5 >= 0) {
                                                j2 = 71499008037633920L;
                                            } else {
                                                byte b2 = bArr[i4];
                                                long j7 = j5 ^ (((long) b2) << 63);
                                                if (j7 >= 0) {
                                                    int i11 = i + 10;
                                                    if (b2 >= 0) {
                                                        j = j7 ^ (-9151873028817141888L);
                                                        i4 = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                j = j6 ^ j3;
                                i4 = i10;
                            }
                            j = j2 ^ j5;
                        }
                    }
                }
                this.i = i4;
                return j;
            }
        }
        long j8 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            if (this.i == this.g) {
                i(1);
            }
            int i13 = this.i;
            this.i = i13 + 1;
            byte b3 = bArr[i13];
            j8 |= ((long) (b3 & 127)) << i12;
            if ((b3 & 128) == 0) {
                return j8;
            }
        }
        Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
        return 0L;
    }

    @Override // ads_mobile_sdk.tu
    public final void a(int i) {
        if (this.j == i) {
            return;
        }
        Z3383101362411723454.o("Protocol message end-group tag did not match expected tag.");
    }

    @Override // ads_mobile_sdk.tu
    public final void c(int i) {
        this.l = i;
        A();
    }

    public static boolean a(int i, int i2, int i3) {
        return i3 < i || i2 > i3 - i;
    }

    @Override // ads_mobile_sdk.tu
    public final long i() {
        return y();
    }

    @Override // ads_mobile_sdk.tu
    public final boolean d() {
        return z() != 0;
    }

    @Override // ads_mobile_sdk.tu
    public final int h() {
        return x();
    }

    @Override // ads_mobile_sdk.tu
    public final double f() {
        return Double.longBitsToDouble(y());
    }

    @Override // ads_mobile_sdk.tu
    public final qq e() throws IOException {
        int iM = m();
        int i = this.g;
        int i2 = this.i;
        int i3 = i - i2;
        byte[] bArr = this.f;
        if (iM <= i3 && iM > 0) {
            qq qqVarB = sq.b(i2, bArr, iM);
            this.i += iM;
            return qqVarB;
        }
        if (iM == 0) {
            return sq.b;
        }
        if (iM >= 0) {
            byte[] bArrG = g(iM);
            if (bArrG != null) {
                return sq.b(0, bArrG, bArrG.length);
            }
            int i4 = this.i;
            int i5 = this.g;
            int length = i5 - i4;
            this.k += i5;
            this.i = 0;
            this.g = 0;
            ArrayList arrayListH = h(iM - length);
            byte[] bArr2 = new byte[iM];
            System.arraycopy(bArr, i4, bArr2, 0, length);
            int size = arrayListH.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListH.get(i6);
                i6++;
                byte[] bArr3 = (byte[]) obj;
                System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
                length += bArr3.length;
            }
            qq qqVar = sq.b;
            try {
                if (iM == 0) {
                    return sq.b;
                }
                return new qq(bArr2);
            } catch (yi1 e) {
                W4415201450379021245.b("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
                return null;
            }
        }
        Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        return null;
    }

    @Override // ads_mobile_sdk.tu
    public final int g() {
        return m();
    }

    @Override // ads_mobile_sdk.tu
    public final long l() {
        return z();
    }

    @Override // ads_mobile_sdk.tu
    public final float j() {
        return Float.intBitsToFloat(x());
    }
}
