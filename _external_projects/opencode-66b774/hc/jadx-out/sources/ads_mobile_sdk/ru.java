package ads_mobile_sdk;

import dev.epro.r0.O17574792317020433029;
import dev.epro.r0.Z3383101362411723454;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class ru extends tu {
    public final byte[] e;
    public final int f;
    public int g;
    public int j;
    public int k = Integer.MAX_VALUE;
    public int h = 0;

    public ru(byte[] bArr, int i) {
        this.e = bArr;
        this.f = i;
        this.g = i;
    }

    public final long A() throws yi1 {
        long j;
        long j2;
        long j3;
        int i = this.h;
        int i2 = this.g;
        byte[] bArr = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.h = i3;
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
                this.h = i4;
                return j;
            }
        }
        long j8 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            int i13 = this.h;
            if (i13 == this.g) {
                Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return 0L;
            }
            this.h = i13 + 1;
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
    public final int a() {
        int i = this.k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.h;
    }

    @Override // ads_mobile_sdk.tu
    public final int b() {
        return this.h;
    }

    @Override // ads_mobile_sdk.tu
    public final void c(int i) {
        this.k = i;
        int i2 = this.f;
        if (i <= i2) {
            this.g = i;
        } else {
            this.g = i2;
        }
    }

    @Override // ads_mobile_sdk.tu
    public final int d(int i) {
        if (i < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return 0;
        }
        int i2 = this.h;
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
            if (i > Integer.MAX_VALUE - i2) {
                Z3383101362411723454.o("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
                return 0;
            }
        }
        int i4 = this.k;
        if (i3 > i4) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.k = i3;
        int i5 = this.f;
        if (i3 <= i5) {
            this.g = i3;
            return i4;
        }
        this.g = i5;
        return i4;
    }

    @Override // ads_mobile_sdk.tu
    public final boolean e(int i) throws yi1 {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                f(8);
                return true;
            }
            if (i2 == 2) {
                f(m());
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
                f(4);
                return true;
            }
            Z3383101362411723454.v();
            return false;
        }
        int i4 = this.g - this.h;
        byte[] bArr = this.e;
        if (i4 >= 10) {
            while (i3 < 10) {
                int i5 = this.h;
                this.h = i5 + 1;
                if (bArr[i5] < 0) {
                    i3++;
                }
            }
            Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
            return false;
        }
        while (i3 < 10) {
            int i6 = this.h;
            if (i6 == this.g) {
                Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return false;
            }
            this.h = i6 + 1;
            if (bArr[i6] < 0) {
                i3++;
            }
        }
        Z3383101362411723454.o("CodedInputStream encountered a malformed varint.");
        return false;
        return true;
    }

    public final void f(int i) throws yi1 {
        if (i >= 0) {
            int i2 = this.g;
            int i3 = this.h;
            if (i <= i2 - i3) {
                this.h = i3 + i;
                return;
            }
        }
        if (i < 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // ads_mobile_sdk.tu
    public final int g() {
        return m();
    }

    @Override // ads_mobile_sdk.tu
    public final int h() {
        return x();
    }

    @Override // ads_mobile_sdk.tu
    public final long i() {
        return y();
    }

    @Override // ads_mobile_sdk.tu
    public final float j() {
        return Float.intBitsToFloat(x());
    }

    @Override // ads_mobile_sdk.tu
    public final int k() {
        return m();
    }

    @Override // ads_mobile_sdk.tu
    public final long l() {
        return A();
    }

    @Override // ads_mobile_sdk.tu
    public final int m() throws yi1 {
        try {
            int iZ = z();
            if (this.h <= this.g) {
                return iZ;
            }
            throw new yi1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (yi1 e) {
            if (this.h <= this.g) {
                throw e;
            }
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        } catch (IndexOutOfBoundsException unused) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
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
        return tu.a(A());
    }

    @Override // ads_mobile_sdk.tu
    public final String r() throws yi1 {
        int iM = m();
        if (iM > 0) {
            int i = this.g;
            int i2 = this.h;
            if (iM <= i - i2) {
                String str = new String(this.e, i2, iM, StandardCharsets.UTF_8);
                this.h += iM;
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
        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
    }

    @Override // ads_mobile_sdk.tu
    public final String s() throws yi1 {
        int iM = m();
        String strA = "";
        if (iM > 0) {
            int i = this.g;
            int i2 = this.h;
            if (iM <= i - i2) {
                if (iM == 0) {
                    O17574792317020433029 o17574792317020433029 = vn3.a;
                } else {
                    strA = vn3.a.a(i2, this.e, iM);
                }
                this.h += iM;
                return strA;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            Z3383101362411723454.o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            return null;
        }
        Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        return null;
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
        return A();
    }

    public final int x() throws yi1 {
        int i = this.h;
        if (this.g - i < 4) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0;
        }
        this.h = i + 4;
        byte[] bArr = this.e;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long y() throws yi1 {
        int i = this.h;
        if (this.g - i < 8) {
            Z3383101362411723454.o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return 0L;
        }
        this.h = i + 8;
        byte[] bArr = this.e;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b A[PHI: r3
      0x006b: PHI (r3v6 int) = (r3v5 int), (r3v10 int), (r3v12 int) binds: [B:16:0x0041, B:20:0x004d, B:24:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z() throws ads_mobile_sdk.yi1 {
        /*
            r7 = this;
            int r0 = r7.h
            int r1 = r0 + 1
            byte[] r2 = r7.e
            r3 = r2[r0]
            if (r3 < 0) goto Lc
            goto L71
        Lc:
            int r4 = r0 + 2
            r1 = r2[r1]
            int r1 = r1 << 7
            r1 = r1 ^ r3
            if (r1 >= 0) goto L19
            r3 = r1 ^ (-128(0xffffffffffffff80, float:NaN))
        L17:
            r1 = r4
            goto L71
        L19:
            int r3 = r0 + 3
            r4 = r2[r4]
            int r4 = r4 << 14
            r1 = r1 ^ r4
            if (r1 < 0) goto L27
            r0 = r1 ^ 16256(0x3f80, float:2.278E-41)
            r1 = r3
            r3 = r0
            goto L71
        L27:
            int r4 = r0 + 4
            r3 = r2[r3]
            int r3 = r3 << 21
            r1 = r1 ^ r3
            if (r1 >= 0) goto L36
            r0 = -2080896(0xffffffffffe03f80, float:NaN)
            r3 = r1 ^ r0
            goto L17
        L36:
            int r3 = r0 + 5
            r4 = r2[r4]
            int r5 = r4 << 28
            r1 = r1 ^ r5
            r5 = 266354560(0xfe03f80, float:2.2112565E-29)
            r1 = r1 ^ r5
            if (r4 >= 0) goto L6b
            int r4 = r0 + 6
            r3 = r2[r3]
            if (r3 >= 0) goto L6f
            int r3 = r0 + 7
            r4 = r2[r4]
            if (r4 >= 0) goto L6b
            int r4 = r0 + 8
            r3 = r2[r3]
            if (r3 >= 0) goto L6f
            int r3 = r0 + 9
            r4 = r2[r4]
            if (r4 >= 0) goto L6b
            int r0 = r0 + 10
            r2 = r2[r3]
            if (r2 < 0) goto L64
            r3 = r1
            r1 = r0
            goto L71
        L64:
            java.lang.String r7 = "CodedInputStream encountered a malformed varint."
            dev.epro.r0.Z3383101362411723454.o(r7)
            r7 = 0
            return r7
        L6b:
            r6 = r3
            r3 = r1
            r1 = r6
            goto L71
        L6f:
            r3 = r1
            goto L17
        L71:
            r7.h = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ru.z():int");
    }

    @Override // ads_mobile_sdk.tu
    public final boolean c() {
        return this.h == this.g;
    }

    @Override // ads_mobile_sdk.tu
    public final void a(int i) {
        if (this.j == i) {
            return;
        }
        Z3383101362411723454.o("Protocol message end-group tag did not match expected tag.");
    }

    @Override // ads_mobile_sdk.tu
    public final double f() {
        return Double.longBitsToDouble(y());
    }

    @Override // ads_mobile_sdk.tu
    public final boolean d() {
        return A() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // ads_mobile_sdk.tu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ads_mobile_sdk.qq e() throws ads_mobile_sdk.yi1 {
        /*
            r4 = this;
            int r0 = r4.m()
            byte[] r1 = r4.e
            if (r0 <= 0) goto L19
            int r2 = r4.g
            int r3 = r4.h
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            ads_mobile_sdk.qq r1 = ads_mobile_sdk.sq.b(r3, r1, r0)
            int r2 = r4.h
            int r2 = r2 + r0
            r4.h = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            ads_mobile_sdk.qq r4 = ads_mobile_sdk.sq.b
            return r4
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.g
            int r3 = r4.h
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.h = r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L36
        L2f:
            r4 = 0
            if (r0 > 0) goto L4a
            if (r0 != 0) goto L44
            byte[] r4 = ads_mobile_sdk.rb1.a
        L36:
            ads_mobile_sdk.qq r0 = ads_mobile_sdk.sq.b
            int r0 = r4.length
            if (r0 != 0) goto L3e
            ads_mobile_sdk.qq r4 = ads_mobile_sdk.sq.b
            return r4
        L3e:
            ads_mobile_sdk.qq r0 = new ads_mobile_sdk.qq
            r0.<init>(r4)
            return r0
        L44:
            java.lang.String r0 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            dev.epro.r0.Z3383101362411723454.o(r0)
            return r4
        L4a:
            java.lang.String r0 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            dev.epro.r0.Z3383101362411723454.o(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ru.e():ads_mobile_sdk.qq");
    }
}
